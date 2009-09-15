// $ANTLR 3.1.2 /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g 2009-06-03 20:52:45

package com.quesoconcarne.scripture.ast;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ScriptureLexer extends Lexer {
    public static final int T__42=42;
    public static final int PREACH=17;
    public static final int T__47=47;
    public static final int FALSE=31;
    public static final int T__50=50;
    public static final int REGEXP=39;
    public static final int ALIAS=12;
    public static final int OR=22;
    public static final int NEWLINE=32;
    public static final int ORDER=7;
    public static final int INTEGER=36;
    public static final int AND=21;
    public static final int T__46=46;
    public static final int COMPARATIVE_OPERATOR=24;
    public static final int STRING_LITERAL=27;
    public static final int T__49=49;
    public static final int DIVISION_OPERATOR=19;
    public static final int T__48=48;
    public static final int REAL=37;
    public static final int INTEGER_LITERAL=25;
    public static final int SPACE=40;
    public static final int COMMANDMENT=13;
    public static final int SINGLE_LINE_COMMENT=33;
    public static final int GENESIS=11;
    public static final int STRING=38;
    public static final int ARTIFACT=14;
    public static final int T__44=44;
    public static final int OF=8;
    public static final int T__45=45;
    public static final int PROFESS=10;
    public static final int AMEN=6;
    public static final int REGEXP_LITERAL=28;
    public static final int BOOLEAN=35;
    public static final int ELSE=16;
    public static final int T__43=43;
    public static final int PRAY=18;
    public static final int IF=15;
    public static final int EOF=-1;
    public static final int CREATION=9;
    public static final int DOMAIN=4;
    public static final int XOR=23;
    public static final int MULTI_LINE_COMMENT=34;
    public static final int IDENTIFIER=5;
    public static final int REAL_LITERAL=26;
    public static final int NOT=20;
    public static final int TRUE=30;
    public static final int T__41=41;
    public static final int CREATE=29;

    // delegates
    // delegators

    public ScriptureLexer() {;} 
    public ScriptureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScriptureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g"; }

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:11:7: ( ':' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:12:7: ( '=' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:13:7: ( ';' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:14:7: ( ',' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:15:7: ( '-' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:16:7: ( '+' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:16:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:17:7: ( '*' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:18:7: ( '.' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:19:7: ( '(' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:20:7: ( ')' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:144:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\n') ) {
                    alt1=1;
                }
                else {
                    alt1=2;}
            }
            else if ( (LA1_0=='\n') ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:144:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:145:4: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:146:4: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "SINGLE_LINE_COMMENT"
    public final void mSINGLE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:150:2: ( '#' (~ ( '\\r' | '\\n' ) )* NEWLINE )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:150:4: '#' (~ ( '\\r' | '\\n' ) )* NEWLINE
            {
            match('#'); 
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:150:8: (~ ( '\\r' | '\\n' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:150:8: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mNEWLINE(); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SINGLE_LINE_COMMENT"

    // $ANTLR start "MULTI_LINE_COMMENT"
    public final void mMULTI_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:155:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:155:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:155:9: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:155:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI_LINE_COMMENT"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:158:7: ( 'falsus' | 'false' | 'falso' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='f') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='a') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='l') ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3=='s') ) {
                            switch ( input.LA(5) ) {
                            case 'u':
                                {
                                alt4=1;
                                }
                                break;
                            case 'e':
                                {
                                alt4=2;
                                }
                                break;
                            case 'o':
                                {
                                alt4=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:158:9: 'falsus'
                    {
                    match("falsus"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:159:4: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:160:4: 'falso'
                    {
                    match("falso"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:163:6: ( 'verus' | 'true' | 'verdadero' )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='v') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='e') ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3=='r') ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4=='u') ) {
                            alt5=1;
                        }
                        else if ( (LA5_4=='d') ) {
                            alt5=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0=='t') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:163:8: 'verus'
                    {
                    match("verus"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:164:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:165:4: 'verdadero'
                    {
                    match("verdadero"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "INTEGER_LITERAL"
    public final void mINTEGER_LITERAL() throws RecognitionException {
        try {
            int _type = INTEGER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:169:2: ( ( '0' .. '9' )+ | '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='x') ) {
                    alt7=2;
                }
                else {
                    alt7=1;}
            }
            else if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:169:4: ( '0' .. '9' )+
                    {
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:169:4: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:169:5: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:170:4: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    {
                    match("0x"); 

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_LITERAL"

    // $ANTLR start "REAL_LITERAL"
    public final void mREAL_LITERAL() throws RecognitionException {
        try {
            int _type = REAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:174:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:174:4: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:174:4: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:174:5: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            match('.'); 
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:174:18: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:174:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:179:2: ( '\"' (~ ( '\"' ) )* '\"' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:179:6: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:179:10: (~ ( '\"' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:179:10: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "REGEXP_LITERAL"
    public final void mREGEXP_LITERAL() throws RecognitionException {
        try {
            int _type = REGEXP_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:2: ( '@regex[' ( options {greedy=false; } : . )* ']' ( ( 'i' )? ( 'm' )? ) )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:4: '@regex[' ( options {greedy=false; } : . )* ']' ( ( 'i' )? ( 'm' )? )
            {
            match("@regex["); 

            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:14: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==']') ) {
                    alt11=2;
                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='\\')||(LA11_0>='^' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:39: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(']'); 
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:47: ( ( 'i' )? ( 'm' )? )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:48: ( 'i' )? ( 'm' )?
            {
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:48: ( 'i' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='i') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:48: 'i'
                    {
                    match('i'); 

                    }
                    break;

            }

            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:53: ( 'm' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='m') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:186:53: 'm'
                    {
                    match('m'); 

                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP_LITERAL"

    // $ANTLR start "DIVISION_OPERATOR"
    public final void mDIVISION_OPERATOR() throws RecognitionException {
        try {
            int _type = DIVISION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:190:2: ( '/' | '%' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:
            {
            if ( input.LA(1)=='%'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVISION_OPERATOR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:194:4: ( 'si' | 'if' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='s') ) {
                alt14=1;
            }
            else if ( (LA14_0=='i') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:194:6: 'si'
                    {
                    match("si"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:195:4: 'if'
                    {
                    match("if"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:198:4: ( 'ex' | 'of' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='e') ) {
                alt15=1;
            }
            else if ( (LA15_0=='o') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:198:6: 'ex'
                    {
                    match("ex"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:199:4: 'of'
                    {
                    match("of"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:202:6: ( 'sinon' | 'sino' | 'else' )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='s') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='i') ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3=='n') ) {
                        int LA16_4 = input.LA(4);

                        if ( (LA16_4=='o') ) {
                            int LA16_5 = input.LA(5);

                            if ( (LA16_5=='n') ) {
                                alt16=1;
                            }
                            else {
                                alt16=2;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0=='e') ) {
                alt16=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:202:8: 'sinon'
                    {
                    match("sinon"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:203:4: 'sino'
                    {
                    match("sino"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:204:4: 'else'
                    {
                    match("else"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:207:5: ( 'et' | 'and' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='e') ) {
                alt17=1;
            }
            else if ( (LA17_0=='a') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:207:7: 'et'
                    {
                    match("et"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:208:4: 'and'
                    {
                    match("and"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:211:4: ( 'aut' | 'or' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='a') ) {
                alt18=1;
            }
            else if ( (LA18_0=='o') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:211:6: 'aut'
                    {
                    match("aut"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:212:4: 'or'
                    {
                    match("or"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:215:5: ( 'xaut' | 'xor' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='x') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='a') ) {
                    alt19=1;
                }
                else if ( (LA19_1=='o') ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:215:7: 'xaut'
                    {
                    match("xaut"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:216:4: 'xor'
                    {
                    match("xor"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:219:5: ( 'non' | 'not' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='n') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='o') ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2=='n') ) {
                        alt20=1;
                    }
                    else if ( (LA20_2=='t') ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:219:7: 'non'
                    {
                    match("non"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:220:4: 'not'
                    {
                    match("not"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "COMPARATIVE_OPERATOR"
    public final void mCOMPARATIVE_OPERATOR() throws RecognitionException {
        try {
            int _type = COMPARATIVE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:224:2: ( '==' | '!=' | '<' | '<=' | '>' | '>=' | 'est' )
            int alt21=7;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:224:4: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:225:4: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:226:4: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:227:4: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:228:4: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:229:4: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 7 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:230:4: 'est'
                    {
                    match("est"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPARATIVE_OPERATOR"

    // $ANTLR start "AMEN"
    public final void mAMEN() throws RecognitionException {
        try {
            int _type = AMEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:233:6: ( 'amen' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:233:8: 'amen'
            {
            match("amen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMEN"

    // $ANTLR start "DOMAIN"
    public final void mDOMAIN() throws RecognitionException {
        try {
            int _type = DOMAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:236:8: ( 'scriptura' | 'scripture' | 'escritura' )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:236:10: 'scriptura'
                    {
                    match("scriptura"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:237:4: 'scripture'
                    {
                    match("scripture"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:238:4: 'escritura'
                    {
                    match("escritura"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOMAIN"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:241:7: ( 'ordo' | 'order' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='o') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='r') ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2=='d') ) {
                        int LA23_3 = input.LA(4);

                        if ( (LA23_3=='o') ) {
                            alt23=1;
                        }
                        else if ( (LA23_3=='e') ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:241:9: 'ordo'
                    {
                    match("ordo"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:242:4: 'order'
                    {
                    match("order"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:245:9: ( 'bool' | 'boolean' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='b') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='o') ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2=='o') ) {
                        int LA24_3 = input.LA(4);

                        if ( (LA24_3=='l') ) {
                            int LA24_4 = input.LA(5);

                            if ( (LA24_4=='e') ) {
                                alt24=2;
                            }
                            else {
                                alt24=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:245:11: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:246:4: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:249:9: ( 'integrum' | 'integer' | 'entero' )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='i') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='n') ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3=='t') ) {
                        int LA25_4 = input.LA(4);

                        if ( (LA25_4=='e') ) {
                            int LA25_5 = input.LA(5);

                            if ( (LA25_5=='g') ) {
                                int LA25_6 = input.LA(6);

                                if ( (LA25_6=='r') ) {
                                    alt25=1;
                                }
                                else if ( (LA25_6=='e') ) {
                                    alt25=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 25, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 25, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0=='e') ) {
                alt25=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:249:11: 'integrum'
                    {
                    match("integrum"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:250:4: 'integer'
                    {
                    match("integer"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:251:4: 'entero'
                    {
                    match("entero"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:254:6: ( 'rei' | 'real' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='r') ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1=='e') ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2=='i') ) {
                        alt26=1;
                    }
                    else if ( (LA26_2=='a') ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:254:8: 'rei'
                    {
                    match("rei"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:255:4: 'real'
                    {
                    match("real"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:258:8: ( 'catena' | 'cadena' | 'string' )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='c') ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='a') ) {
                    int LA27_3 = input.LA(3);

                    if ( (LA27_3=='t') ) {
                        alt27=1;
                    }
                    else if ( (LA27_3=='d') ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0=='s') ) {
                alt27=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:258:10: 'catena'
                    {
                    match("catena"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:259:4: 'cadena'
                    {
                    match("cadena"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:260:4: 'string'
                    {
                    match("string"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "REGEXP"
    public final void mREGEXP() throws RecognitionException {
        try {
            int _type = REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:263:8: ( 'expreg' | 'regexp' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='e') ) {
                alt28=1;
            }
            else if ( (LA28_0=='r') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:263:10: 'expreg'
                    {
                    match("expreg"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:264:4: 'regexp'
                    {
                    match("regexp"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP"

    // $ANTLR start "PROFESS"
    public final void mPROFESS() throws RecognitionException {
        try {
            int _type = PROFESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:267:9: ( 'professare' | 'profesar' | 'prophecy' )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:267:11: 'professare'
                    {
                    match("professare"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:268:4: 'profesar'
                    {
                    match("profesar"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:269:4: 'prophecy'
                    {
                    match("prophecy"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROFESS"

    // $ANTLR start "PRAY"
    public final void mPRAY() throws RecognitionException {
        try {
            int _type = PRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:272:6: ( 'resare' | 'resar' | 'pray' )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='r') ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1=='e') ) {
                    int LA30_3 = input.LA(3);

                    if ( (LA30_3=='s') ) {
                        int LA30_4 = input.LA(4);

                        if ( (LA30_4=='a') ) {
                            int LA30_5 = input.LA(5);

                            if ( (LA30_5=='r') ) {
                                int LA30_6 = input.LA(6);

                                if ( (LA30_6=='e') ) {
                                    alt30=1;
                                }
                                else {
                                    alt30=2;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0=='p') ) {
                alt30=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:272:8: 'resare'
                    {
                    match("resare"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:273:4: 'resar'
                    {
                    match("resar"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:274:4: 'pray'
                    {
                    match("pray"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRAY"

    // $ANTLR start "GENESIS"
    public final void mGENESIS() throws RecognitionException {
        try {
            int _type = GENESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:277:9: ( 'genesis' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:277:11: 'genesis'
            {
            match("genesis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GENESIS"

    // $ANTLR start "ALIAS"
    public final void mALIAS() throws RecognitionException {
        try {
            int _type = ALIAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:280:7: ( 'alias' )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:280:9: 'alias'
            {
            match("alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALIAS"

    // $ANTLR start "PREACH"
    public final void mPREACH() throws RecognitionException {
        try {
            int _type = PREACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:283:9: ( 'predicare' | 'predicar' | 'preach' )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:283:11: 'predicare'
                    {
                    match("predicare"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:284:4: 'predicar'
                    {
                    match("predicar"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:285:4: 'preach'
                    {
                    match("preach"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREACH"

    // $ANTLR start "COMMANDMENT"
    public final void mCOMMANDMENT() throws RecognitionException {
        try {
            int _type = COMMANDMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:289:2: ( 'decalogus' | 'commandment' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='d') ) {
                alt32=1;
            }
            else if ( (LA32_0=='c') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:289:4: 'decalogus'
                    {
                    match("decalogus"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:290:4: 'commandment'
                    {
                    match("commandment"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMANDMENT"

    // $ANTLR start "ARTIFACT"
    public final void mARTIFACT() throws RecognitionException {
        try {
            int _type = ARTIFACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:294:2: ( 'artefactum' | 'artefacto' | 'artifact' )
            int alt33=3;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:294:4: 'artefactum'
                    {
                    match("artefactum"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:295:4: 'artefacto'
                    {
                    match("artefacto"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:296:4: 'artifact'
                    {
                    match("artifact"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARTIFACT"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:299:9: ( 'creare' | 'hagase' | 'let' ( ' ' )+ 'there' ( ' ' )+ 'be' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt36=1;
                }
                break;
            case 'h':
                {
                alt36=2;
                }
                break;
            case 'l':
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:299:11: 'creare'
                    {
                    match("creare"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:300:4: 'hagase'
                    {
                    match("hagase"); 


                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:301:4: 'let' ( ' ' )+ 'there' ( ' ' )+ 'be'
                    {
                    match("let"); 

                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:301:10: ( ' ' )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==' ') ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:301:11: ' '
                    	    {
                    	    match(' '); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    match("there"); 

                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:301:25: ( ' ' )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==' ') ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:301:26: ' '
                    	    {
                    	    match(' '); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    match("be"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "CREATION"
    public final void mCREATION() throws RecognitionException {
        try {
            int _type = CREATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:306:2: ( 'nihilo' | 'creation' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='n') ) {
                alt37=1;
            }
            else if ( (LA37_0=='c') ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:306:4: 'nihilo'
                    {
                    match("nihilo"); 


                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:307:4: 'creation'
                    {
                    match("creation"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATION"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:314:2: ( ( ' ' | '\\t' | '\\u000C' | NEWLINE ) )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:314:5: ( ' ' | '\\t' | '\\u000C' | NEWLINE )
            {
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:314:5: ( ' ' | '\\t' | '\\u000C' | NEWLINE )
            int alt38=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt38=1;
                }
                break;
            case '\t':
                {
                alt38=2;
                }
                break;
            case '\f':
                {
                alt38=3;
                }
                break;
            case '\n':
            case '\r':
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:314:6: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:314:10: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:314:15: '\\u000C'
                    {
                    match('\f'); 

                    }
                    break;
                case 4 :
                    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:314:24: NEWLINE
                    {
                    mNEWLINE(); 

                    }
                    break;

            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:317:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )* )
            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:317:4: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:317:27: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '0' .. '9' )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='0' && LA39_0<='9')||(LA39_0>='A' && LA39_0<='Z')||LA39_0=='_'||(LA39_0>='a' && LA39_0<='z')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    public void mTokens() throws RecognitionException {
        // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:8: ( T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | SINGLE_LINE_COMMENT | MULTI_LINE_COMMENT | FALSE | TRUE | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | REGEXP_LITERAL | DIVISION_OPERATOR | IF | OF | ELSE | AND | OR | XOR | NOT | COMPARATIVE_OPERATOR | AMEN | DOMAIN | ORDER | BOOLEAN | INTEGER | REAL | STRING | REGEXP | PROFESS | PRAY | GENESIS | ALIAS | PREACH | COMMANDMENT | ARTIFACT | CREATE | CREATION | SPACE | IDENTIFIER )
        int alt40=46;
        alt40 = dfa40.predict(input);
        switch (alt40) {
            case 1 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:10: T__41
                {
                mT__41(); 

                }
                break;
            case 2 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:16: T__42
                {
                mT__42(); 

                }
                break;
            case 3 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:22: T__43
                {
                mT__43(); 

                }
                break;
            case 4 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:28: T__44
                {
                mT__44(); 

                }
                break;
            case 5 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:34: T__45
                {
                mT__45(); 

                }
                break;
            case 6 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:40: T__46
                {
                mT__46(); 

                }
                break;
            case 7 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:46: T__47
                {
                mT__47(); 

                }
                break;
            case 8 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:52: T__48
                {
                mT__48(); 

                }
                break;
            case 9 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:58: T__49
                {
                mT__49(); 

                }
                break;
            case 10 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:64: T__50
                {
                mT__50(); 

                }
                break;
            case 11 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:70: SINGLE_LINE_COMMENT
                {
                mSINGLE_LINE_COMMENT(); 

                }
                break;
            case 12 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:90: MULTI_LINE_COMMENT
                {
                mMULTI_LINE_COMMENT(); 

                }
                break;
            case 13 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:109: FALSE
                {
                mFALSE(); 

                }
                break;
            case 14 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:115: TRUE
                {
                mTRUE(); 

                }
                break;
            case 15 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:120: INTEGER_LITERAL
                {
                mINTEGER_LITERAL(); 

                }
                break;
            case 16 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:136: REAL_LITERAL
                {
                mREAL_LITERAL(); 

                }
                break;
            case 17 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:149: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 18 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:164: REGEXP_LITERAL
                {
                mREGEXP_LITERAL(); 

                }
                break;
            case 19 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:179: DIVISION_OPERATOR
                {
                mDIVISION_OPERATOR(); 

                }
                break;
            case 20 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:197: IF
                {
                mIF(); 

                }
                break;
            case 21 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:200: OF
                {
                mOF(); 

                }
                break;
            case 22 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:203: ELSE
                {
                mELSE(); 

                }
                break;
            case 23 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:208: AND
                {
                mAND(); 

                }
                break;
            case 24 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:212: OR
                {
                mOR(); 

                }
                break;
            case 25 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:215: XOR
                {
                mXOR(); 

                }
                break;
            case 26 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:219: NOT
                {
                mNOT(); 

                }
                break;
            case 27 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:223: COMPARATIVE_OPERATOR
                {
                mCOMPARATIVE_OPERATOR(); 

                }
                break;
            case 28 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:244: AMEN
                {
                mAMEN(); 

                }
                break;
            case 29 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:249: DOMAIN
                {
                mDOMAIN(); 

                }
                break;
            case 30 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:256: ORDER
                {
                mORDER(); 

                }
                break;
            case 31 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:262: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 32 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:270: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 33 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:278: REAL
                {
                mREAL(); 

                }
                break;
            case 34 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:283: STRING
                {
                mSTRING(); 

                }
                break;
            case 35 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:290: REGEXP
                {
                mREGEXP(); 

                }
                break;
            case 36 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:297: PROFESS
                {
                mPROFESS(); 

                }
                break;
            case 37 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:305: PRAY
                {
                mPRAY(); 

                }
                break;
            case 38 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:310: GENESIS
                {
                mGENESIS(); 

                }
                break;
            case 39 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:318: ALIAS
                {
                mALIAS(); 

                }
                break;
            case 40 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:324: PREACH
                {
                mPREACH(); 

                }
                break;
            case 41 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:331: COMMANDMENT
                {
                mCOMMANDMENT(); 

                }
                break;
            case 42 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:343: ARTIFACT
                {
                mARTIFACT(); 

                }
                break;
            case 43 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:352: CREATE
                {
                mCREATE(); 

                }
                break;
            case 44 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:359: CREATION
                {
                mCREATION(); 

                }
                break;
            case 45 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:368: SPACE
                {
                mSPACE(); 

                }
                break;
            case 46 :
                // /Users/jcjimenez/Src/ScriptureJava/src/com/quesoconcarne/scripture/Scripture.g:1:374: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA21_eotS =
        "\3\uffff\1\7\1\11\5\uffff";
    static final String DFA21_eofS =
        "\12\uffff";
    static final String DFA21_minS =
        "\1\41\2\uffff\2\75\5\uffff";
    static final String DFA21_maxS =
        "\1\145\2\uffff\2\75\5\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\1\4\1\3\1\6\1\5";
    static final String DFA21_specialS =
        "\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\32\uffff\1\3\1\1\1\4\46\uffff\1\5",
            "",
            "",
            "\1\6",
            "\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "223:1: COMPARATIVE_OPERATOR : ( '==' | '!=' | '<' | '<=' | '>' | '>=' | 'est' );";
        }
    }
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\14\uffff";
    static final String DFA22_minS =
        "\1\145\1\143\1\uffff\1\162\1\151\1\160\1\164\1\165\1\162\1\141\2"+
        "\uffff";
    static final String DFA22_maxS =
        "\1\163\1\143\1\uffff\1\162\1\151\1\160\1\164\1\165\1\162\1\145\2"+
        "\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\3\7\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\14\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\15\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\3\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "236:1: DOMAIN : ( 'scriptura' | 'scripture' | 'escritura' );";
        }
    }
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\12\uffff";
    static final String DFA29_minS =
        "\1\160\1\162\1\157\1\146\1\145\1\uffff\1\163\1\141\2\uffff";
    static final String DFA29_maxS =
        "\1\160\1\162\1\157\1\160\1\145\1\uffff\2\163\2\uffff";
    static final String DFA29_acceptS =
        "\5\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\11\uffff\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\11\21\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "267:1: PROFESS : ( 'professare' | 'profesar' | 'prophecy' );";
        }
    }
    static final String DFA31_eotS =
        "\11\uffff\1\13\2\uffff";
    static final String DFA31_eofS =
        "\14\uffff";
    static final String DFA31_minS =
        "\1\160\1\162\1\145\1\141\1\151\1\uffff\1\143\1\141\1\162\1\145\2"+
        "\uffff";
    static final String DFA31_maxS =
        "\1\160\1\162\1\145\1\144\1\151\1\uffff\1\143\1\141\1\162\1\145\2"+
        "\uffff";
    static final String DFA31_acceptS =
        "\5\uffff\1\3\4\uffff\1\1\1\2";
    static final String DFA31_specialS =
        "\14\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\2\uffff\1\4",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "283:1: PREACH : ( 'predicare' | 'predicar' | 'preach' );";
        }
    }
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\14\uffff";
    static final String DFA33_minS =
        "\1\141\1\162\1\164\1\145\1\146\1\uffff\1\141\1\143\1\164\1\157\2"+
        "\uffff";
    static final String DFA33_maxS =
        "\1\141\1\162\1\164\1\151\1\146\1\uffff\1\141\1\143\1\164\1\165\2"+
        "\uffff";
    static final String DFA33_acceptS =
        "\5\uffff\1\3\4\uffff\1\1\1\2";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\3\uffff\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\13\5\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "293:1: ARTIFACT : ( 'artefactum' | 'artefacto' | 'artifact' );";
        }
    }
    static final String DFA40_eotS =
        "\2\uffff\1\47\11\uffff\1\24\3\46\2\54\3\uffff\7\46\1\uffff\10\46"+
        "\4\uffff\3\46\2\uffff\1\121\2\46\1\121\1\46\1\126\1\46\1\130\2\46"+
        "\1\126\1\135\27\46\1\uffff\4\46\1\uffff\1\46\1\uffff\1\34\3\46\1"+
        "\uffff\1\130\1\135\4\46\1\u008b\2\u008c\2\46\1\u008f\21\46\1\u00a5"+
        "\1\u00a7\4\46\1\u00a7\2\46\1\u00ae\1\46\1\u00b0\3\46\1\u008b\2\uffff"+
        "\1\46\1\u00b6\1\uffff\1\u008f\10\46\1\u00c0\5\46\1\uffff\1\46\2"+
        "\u00c7\1\u00a5\1\46\1\uffff\1\u00a7\1\uffff\6\46\1\uffff\1\u00ae"+
        "\1\uffff\1\u00d0\4\46\1\uffff\1\46\1\u00c0\7\46\1\uffff\5\46\1\u00c7"+
        "\1\uffff\2\46\1\u00e5\2\46\1\u00e8\1\46\1\u00ea\1\uffff\2\46\1\u00ed"+
        "\1\46\1\u00e8\1\u00c0\2\u00e5\1\46\1\u009f\4\46\1\u00f5\2\46\1\u009f"+
        "\2\46\1\uffff\1\46\1\u00ea\1\uffff\1\46\1\uffff\2\46\1\uffff\1\u00b6"+
        "\6\46\1\uffff\1\u0104\3\46\1\u00ea\2\46\1\u010c\1\46\1\u00ed\1\46"+
        "\2\u010f\1\u00f5\1\uffff\1\46\1\u00a5\3\u0112\1\46\1\u010c\1\uffff"+
        "\2\46\1\uffff\1\u00f5\1\u0116\1\uffff\1\u010c\1\46\1\u010f\1\uffff"+
        "\1\u0116";
    static final String DFA40_eofS =
        "\u0118\uffff";
    static final String DFA40_minS =
        "\1\11\1\uffff\1\75\11\uffff\1\52\1\141\1\145\1\162\2\56\3\uffff"+
        "\1\143\1\146\1\154\1\146\1\154\1\141\1\151\1\uffff\1\157\1\145\1"+
        "\141\1\162\2\145\1\141\1\145\4\uffff\1\154\1\162\1\165\2\uffff\1"+
        "\60\2\162\1\60\1\164\1\60\1\163\1\60\1\143\1\164\2\60\1\144\1\164"+
        "\1\145\1\151\1\164\1\165\1\162\1\156\1\150\1\157\1\141\1\144\1\155"+
        "\1\145\1\141\1\156\1\143\1\147\1\164\1\163\1\144\1\145\1\157\1\uffff"+
        "\2\151\1\145\1\162\1\uffff\1\145\1\uffff\1\60\1\162\2\145\1\uffff"+
        "\2\60\1\156\1\141\1\145\1\164\3\60\1\151\1\154\1\60\1\154\1\145"+
        "\1\141\2\145\1\155\1\141\1\146\1\171\1\141\1\145\2\141\1\40\1\145"+
        "\1\163\1\141\2\60\1\160\1\156\1\147\1\145\1\60\1\151\1\162\1\60"+
        "\1\162\1\60\1\163\2\146\1\60\2\uffff\1\154\1\60\1\uffff\1\60\1\170"+
        "\1\162\2\156\1\141\1\162\1\145\1\150\1\60\1\151\1\143\1\163\1\154"+
        "\1\163\1\uffff\1\163\3\60\1\144\1\uffff\1\60\1\uffff\1\164\1\147"+
        "\1\145\1\147\1\164\1\157\1\uffff\1\60\1\uffff\1\60\2\141\1\157\1"+
        "\141\1\uffff\1\160\1\60\2\141\1\156\1\145\1\151\1\163\1\145\1\uffff"+
        "\1\143\1\150\1\151\1\157\1\145\1\60\1\uffff\1\145\1\165\1\60\1\165"+
        "\1\162\1\60\1\165\1\60\1\uffff\2\143\1\60\1\156\4\60\1\144\1\60"+
        "\1\157\1\141\1\143\1\141\1\60\1\163\1\147\1\60\2\162\1\uffff\1\155"+
        "\1\60\1\uffff\1\162\1\uffff\2\164\1\uffff\1\60\1\155\1\156\1\141"+
        "\1\162\1\171\1\162\1\uffff\1\60\1\165\1\157\1\141\1\60\1\141\1\157"+
        "\1\60\1\145\1\60\1\162\3\60\1\uffff\1\163\4\60\1\155\1\60\1\uffff"+
        "\1\156\1\145\1\uffff\2\60\1\uffff\1\60\1\164\1\60\1\uffff\1\60";
    static final String DFA40_maxS =
        "\1\172\1\uffff\1\75\11\uffff\1\52\1\141\1\145\1\162\2\71\3\uffff"+
        "\1\164\1\156\1\170\1\162\1\165\2\157\1\uffff\1\157\1\145\2\162\2"+
        "\145\1\141\1\145\4\uffff\1\154\1\162\1\165\2\uffff\1\172\2\162\1"+
        "\172\1\164\1\172\1\163\1\172\2\164\2\172\1\144\1\164\1\145\1\151"+
        "\1\164\1\165\1\162\1\164\1\150\1\157\1\163\1\164\1\155\1\145\1\157"+
        "\1\156\1\143\1\147\1\164\1\163\1\165\1\145\1\157\1\uffff\2\151\1"+
        "\145\1\162\1\uffff\1\145\1\uffff\1\172\1\162\1\145\1\157\1\uffff"+
        "\2\172\1\156\1\141\1\151\1\164\3\172\1\151\1\154\1\172\1\154\1\145"+
        "\1\141\2\145\1\155\1\141\1\160\1\171\1\144\1\145\2\141\1\40\1\165"+
        "\1\163\1\141\2\172\1\160\1\156\1\147\1\145\1\172\1\151\1\162\1\172"+
        "\1\162\1\172\1\163\2\146\1\172\2\uffff\1\154\1\172\1\uffff\1\172"+
        "\1\170\1\162\2\156\1\141\1\164\1\145\1\150\1\172\1\151\1\143\1\163"+
        "\1\154\1\163\1\uffff\1\163\3\172\1\144\1\uffff\1\172\1\uffff\1\164"+
        "\1\147\1\162\1\147\1\164\1\157\1\uffff\1\172\1\uffff\1\172\2\141"+
        "\1\157\1\141\1\uffff\1\160\1\172\2\141\1\156\1\145\1\151\1\163\1"+
        "\145\1\uffff\1\143\1\150\1\151\1\157\1\145\1\172\1\uffff\1\145\1"+
        "\165\1\172\1\165\1\162\1\172\1\165\1\172\1\uffff\2\143\1\172\1\156"+
        "\4\172\1\144\1\172\1\157\1\163\1\143\1\141\1\172\1\163\1\147\1\172"+
        "\2\162\1\uffff\1\155\1\172\1\uffff\1\162\1\uffff\2\164\1\uffff\1"+
        "\172\1\155\1\156\1\141\1\162\1\171\1\162\1\uffff\1\172\1\165\1\157"+
        "\1\145\1\172\1\141\1\165\1\172\1\145\1\172\1\162\3\172\1\uffff\1"+
        "\163\4\172\1\155\1\172\1\uffff\1\156\1\145\1\uffff\2\172\1\uffff"+
        "\1\172\1\164\1\172\1\uffff\1\172";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\6\uffff"+
        "\1\21\1\22\1\23\7\uffff\1\33\10\uffff\1\55\1\56\1\2\1\14\3\uffff"+
        "\1\17\1\20\43\uffff\1\24\4\uffff\1\25\1\uffff\1\27\4\uffff\1\30"+
        "\55\uffff\1\31\1\32\2\uffff\1\41\17\uffff\1\53\5\uffff\1\16\1\uffff"+
        "\1\26\6\uffff\1\36\1\uffff\1\34\5\uffff\1\37\11\uffff\1\45\6\uffff"+
        "\1\15\10\uffff\1\47\24\uffff\1\42\2\uffff\1\43\1\uffff\1\40\2\uffff"+
        "\1\54\7\uffff\1\50\16\uffff\1\46\7\uffff\1\52\2\uffff\1\44\2\uffff"+
        "\1\35\3\uffff\1\51\1\uffff";
    static final String DFA40_specialS =
        "\u0118\uffff}>";
    static final String[] DFA40_transitionS = {
            "\2\45\1\uffff\2\45\22\uffff\1\45\1\34\1\22\1\13\1\uffff\1\24"+
            "\2\uffff\1\11\1\12\1\7\1\6\1\4\1\5\1\10\1\14\1\20\11\21\1\1"+
            "\1\3\1\34\1\2\1\34\1\uffff\1\23\32\46\4\uffff\1\46\1\uffff\1"+
            "\31\1\35\1\37\1\42\1\27\1\15\1\41\1\43\1\26\2\46\1\44\1\46\1"+
            "\33\1\30\1\40\1\46\1\36\1\25\1\17\1\46\1\16\1\46\1\32\2\46",
            "",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\55\1\uffff\12\21",
            "\1\55\1\uffff\12\21",
            "",
            "",
            "",
            "\1\57\5\uffff\1\56\12\uffff\1\60",
            "\1\61\7\uffff\1\62",
            "\1\64\1\uffff\1\67\4\uffff\1\66\1\65\3\uffff\1\63",
            "\1\70\13\uffff\1\71",
            "\1\75\1\74\1\72\3\uffff\1\76\2\uffff\1\73",
            "\1\77\15\uffff\1\100",
            "\1\102\5\uffff\1\101",
            "",
            "\1\103",
            "\1\104",
            "\1\105\15\uffff\1\106\2\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\120\14\46",
            "\1\122",
            "\1\123",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\124",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46\1\125\12\46",
            "\1\127",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\132\20\uffff\1\131",
            "\1\133",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\134\26\46",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145\5\uffff\1\146",
            "\1\147",
            "\1\150",
            "\1\152\5\uffff\1\153\1\uffff\1\151\11\uffff\1\154",
            "\1\156\17\uffff\1\155",
            "\1\157",
            "\1\160",
            "\1\162\3\uffff\1\163\11\uffff\1\161",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\172\20\uffff\1\171",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\11\uffff\1\u0084",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\3\uffff\1\u0089",
            "\1\u008a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008d",
            "\1\u008e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097\11\uffff\1\u0098",
            "\1\u0099",
            "\1\u009b\2\uffff\1\u009a",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a1\11\uffff\1\u00a2\5\uffff\1\u00a0",
            "\1\u00a3",
            "\1\u00a4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\u00a6\14"+
            "\46",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ac",
            "\1\u00ad",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00af",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00b4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u00b5\25\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc\1\uffff\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c8",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cc\14\uffff\1\u00cb",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u00d6\25\46",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e6",
            "\1\u00e7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ee",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ef",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f0",
            "\1\u00f2\21\uffff\1\u00f1",
            "\1\u00f3",
            "\1\u00f4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f6",
            "\1\u00f7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107\3\uffff\1\u0108",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0109",
            "\1\u010b\5\uffff\1\u010a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u010d",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u010e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\u0110\25\46",
            "",
            "\1\u0111",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0113",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0114",
            "\1\u0115",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0117",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | SINGLE_LINE_COMMENT | MULTI_LINE_COMMENT | FALSE | TRUE | INTEGER_LITERAL | REAL_LITERAL | STRING_LITERAL | REGEXP_LITERAL | DIVISION_OPERATOR | IF | OF | ELSE | AND | OR | XOR | NOT | COMPARATIVE_OPERATOR | AMEN | DOMAIN | ORDER | BOOLEAN | INTEGER | REAL | STRING | REGEXP | PROFESS | PRAY | GENESIS | ALIAS | PREACH | COMMANDMENT | ARTIFACT | CREATE | CREATION | SPACE | IDENTIFIER );";
        }
    }
 

}