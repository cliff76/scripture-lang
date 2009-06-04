grammar Scripture;
options {
	language=Java;
	output=AST;
	//ASTLabelType = CommonTree;
	//tokenVocab = ScriptureLexer;
}

@parser::header {
package com.quesoconcarne.scripture;
}

@lexer::header{
package com.quesoconcarne.scripture;
}

program returns [Program result]
	:	bc=block_contents {$result = new Program(bc.result);}
	|	d=domain {$result = new Program(d.result);}
	;

block_contents returns [List<Node> result]
@init {$result = new ArrayList<Node>();}
	:	(
		  o=order {$result.add(o.result);}
		| p=prophecy {$result.add(p.result);}
		| c=commandment {$result.add(c.result);}
		| a=artifact {$result.add(a.result);}
		| s=statement {$result.add(s.result);}
		)+
	;

// Namespace block
domain returns [Domain result]
@init { List<Token> nameSegments = new ArrayList<Token>(); }
	:	DOMAIN^ (name+=IDENTIFIER {nameSegments.add(name);} (':' name+=IDENTIFIER {nameSegments.add(name);} )*) ':'! bc=block_contents AMEN! {$result = new Domain(nameSegments, bc.result);}
	;
	
order returns [Order result]
	:	ORDER^ name=IDENTIFIER (OF! parentname=(CREATION|IDENTIFIER))? ':'! bc=block_contents AMEN! {$result = new Order(name, parentname, bc.result);}
	;

// Event listener block
prophecy returns [Prophecy result]
	:	PROFESS^ (gen=GENESIS|expr=expression) (ALIAS alias=IDENTIFIER)? ':'! bc=block_contents AMEN! {$result = new Prophecy(gen, expr == null ? null : expr.result, alias, bc.result);}
	;

// Method block
commandment returns [Commandment result]
	:	COMMANDMENT^ name=IDENTIFIER ':'! bc=block_contents AMEN! {$result = new Commandment(name, bc.result);}
	;
	
// Variable declaration
artifact returns [Artifact result]
	:	ARTIFACT^ name=IDENTIFIER ('=' value=expression)? ';'! {$result = value == null ? new Artifact(name) : new Artifact(name, value.result);}
	;

statement returns [Statement result]
	:	expstmt=expression_statement {$result = expstmt.result;}
	|	ifstmt=if_statement {$result = ifstmt.result;}
	|	printstmt=print_statement {$result = printstmt.result;}
	|	praystmt=pray_statement {$result = praystmt.result;}
	;

expression_statement returns [Statement result]
	:	expr=expression ';'! {$result = new ExpressionStatement(expr.result);}
	;

// TODO: Consider making the the 'if' an expression.
if_statement returns [Statement result]
	:	IF^ expr=expression ':'! bc=block_contents (ELSE elsebc=block_contents)? AMEN! {$result = new IfStatement(expr.result, bc.result, elsebc == null ? null : elsebc.result);}
	;

print_statement returns [Statement result]
	:	PREACH^ (stream=IDENTIFIER ',')? expr=expression ';'! {$result = new PrintStatement(stream, expr.result); }
	;

pray_statement returns [Statement result]
	:	PRAY^ expr=expression ';'! {$result = new PrayStatement(expr.result); }
	;

expression returns [Expression result]
	:	e=assignment_expression {$result = e.result;}
	;
	
assignment_expression returns [Expression result]
	:	left=subtraction_expression (op='='^ right=subtraction_expression)? {$result = op == null ? left.result : new AssignmentExpression(left.result, op, right.result); }
	;

subtraction_expression returns [Expression result]
	:	left=addition_expression (op='-'^ right=addition_expression)? {$result = op == null ? left.result : new ArithmeticExpression(left.result, op, right.result); }
	;

addition_expression returns [Expression result]
	:	left=division_expression (op='+'^ right=division_expression)? {$result = op == null ? left.result : new ArithmeticExpression(left.result, op, right.result); }
	;

division_expression returns [Expression result]
	:	left=multiplication_expression (op=DIVISION_OPERATOR^ right=multiplication_expression)? {$result = op == null ? left.result : new ArithmeticExpression(left.result, op, right.result); }
	;

multiplication_expression returns [Expression result]
	:	left=boolean_expression (op='*'^ right=boolean_expression)? {$result = op == null ? left.result : new ArithmeticExpression(left.result, op, right.result); }
	;

boolean_expression returns [Expression result]
	:	left=comparative_expression (op=boolean_operator^ right=comparative_expression)? {$result = op == null ? left.result : new BooleanExpression(left.result, ((CommonTree)op.getTree()).getToken(), right.result); }
	|	literal=NOT expr=comparative_expression {$result = new BooleanExpression(literal, expr.result); }
	;

boolean_operator
	:	AND
	|	OR
	|	XOR
	;

comparative_expression returns [Expression result]
	:	left=keypath_expression (op=COMPARATIVE_OPERATOR^ right=keypath_expression)? {$result = op == null ? left.result : new ComparativeExpression(left.result, op, right.result); }
	;

keypath_expression returns [Expression result]
	:	left=atomic_expression (dot='.'^ right=IDENTIFIER)? {$result = dot == null ? left.result : new KeypathExpression(left.result, dot, right); }
	;
	
atomic_expression returns [Expression result]
	:	literal=INTEGER_LITERAL {$result = new IntegerExpression(literal);}
	|	literal=REAL_LITERAL {$result = new RealExpression(literal);}
	|	literal=STRING_LITERAL {$result = new StringExpression(literal);}
	|	literal=REGEXP_LITERAL {$result = new RegexExpression(literal);}
	|	identifier=IDENTIFIER {$result = new IdentifierExpression(identifier);}
	|	bl=boolean_literal {$result = new BooleanExpression(bl.result);}
	|	CREATE identifier=IDENTIFIER {$result = new CreateExpression(identifier);}
	|	'('! expr=expression ')'! {$result = expr.result;}
	;

// boolean_literal is the only literal represented as a grammar rule rather than a token
// because it's lexemes (true and false) are localizable.
boolean_literal returns [Boolean result]
	:	TRUE {$result = Boolean.TRUE;}
	|	FALSE {$result = Boolean.FALSE;}
	;
// TODO: Condier implementing debug comments.
fragment NEWLINE
	:	'\r\n'
	|	'\r'
	|	'\n'
	;

SINGLE_LINE_COMMENT 
	:	'#' ~('\r'|'\n')* NEWLINE {$channel=HIDDEN;}
	;
	
// TODO: Condier implementing debug comments.
MULTI_LINE_COMMENT 
	:	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;

FALSE	:	'falsus'
	|	'false'
	|	'falso'
	;

TRUE	:	'verus'
	|	'true'
	|	'verdadero'
	;

INTEGER_LITERAL 
	:	('0'..'9')+
	|	'0x'('0'..'9'|'a'..'f'|'A'..'F')
	;

REAL_LITERAL 
	:	('0'..'9')+'.'('0'..'9')+
	;

// TODO: Allow escape sequences.
STRING_LITERAL 
	:   '"' ~('"')* '"' // Double quote, newlines allowed.
//        |   '\'' ~(options {greedy=false;}:'\'')* '\'' // Single quote, newlines allowed.
//        |   '"""' (options {greedy=false;}:.)* '"""' // Triple quote, newlines allowed.
        ;

// TODO: Allow escape sequences.
REGEXP_LITERAL 
	:	'@regex[' (options {greedy=false;}:.)* ']' ('i'? 'm'?)
	;

DIVISION_OPERATOR
	:	'/'
	|	'%'
	;

IF	:	'si'
	|	'if'
	;

OF	:	'ex'
	|	'of'
	;

ELSE	:	'sinon'
	|	'sino'
	|	'else'
	;

AND	:	'et'
	|	'and'
	;

OR	:	'aut'
	|	'or'
	;

XOR	:	'xaut'
	|	'xor'
	;

NOT	:	'non'
	|	'not'
	;

COMPARATIVE_OPERATOR 
	:	'=='
	|	'!='
	|	'<'
	|	'<='
	|	'>'
	|	'>='
	|	'est'
	;

AMEN	:	'amen'
	;

DOMAIN	:	'scriptura'
	|	'scripture'
	|	'escritura'
	;

ORDER	:	'ordo'
	|	'order'
	;

BOOLEAN	:	'bool'
	|	'boolean'
	;

INTEGER	:	'integrum'
	|	'integer'
	|	'entero'
	;

REAL	:	'rei'
	|	'real'
	;

STRING	:	'catena'
	|	'cadena'
	|	'string'
	;

REGEXP	:	'expreg'
	|	'regexp'
	;

PROFESS	:	'professare'
	|	'profesar'
	|	'prophecy'
	;
	
PRAY	:	'resare'
	|	'resar'
	|	'pray'
	;

GENESIS	:	'genesis'
	;

ALIAS	:	'alias'
	;

PREACH  :	'predicare'
	|	'predicar'
	|	'preach'
	;

COMMANDMENT
	:	'decalogus'
	|	'commandment'
	;

ARTIFACT
	:	'artefactum'
	|	'artefacto'
	|	'artifact'
	;
	
CREATE 	:	'creare'
	|	'hagase'
	|	'let' (' ')+ 'there' (' ')+ 'be'
	;

// The root 'Object' class is a reserved word.
CREATION 
	:	'nihilo'
	|	'creation'
	;




SPACE
	:  (' '|'\t'|'\u000C'|NEWLINE) {$channel=HIDDEN;}
	;
	IDENTIFIER
	:	('A'..'Z'|'a'..'z'|'_')('A'..'Z'|'a'..'z'|'_'|'0'..'9')*
	;
