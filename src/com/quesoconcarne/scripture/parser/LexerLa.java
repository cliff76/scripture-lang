/* The following code was generated by JFlex 1.4.3 on 9/12/09 11:12 AM */

package com.quesoconcarne.scripture.parser;

/**
 * This is the lexer class for Latin.
 */

final class LexerLa implements ScriptureLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;
  public static final int REGEXP = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\35\1\51\1\37\1\0\1\51\1\50\16\35\4\0\1\51\1\45"+
    "\1\36\1\47\1\34\1\43\4\0\1\42\1\40\1\0\1\41\1\31"+
    "\1\32\1\26\11\30\2\0\1\46\1\44\1\46\2\0\6\27\24\34"+
    "\1\0\1\33\2\0\1\34\1\0\1\2\1\24\1\13\1\20\1\7"+
    "\1\1\1\22\1\23\1\14\2\34\1\3\1\11\1\12\1\17\1\15"+
    "\1\34\1\10\1\4\1\16\1\5\1\6\1\34\1\21\2\34\4\0"+
    "\41\35\2\0\4\34\4\0\1\34\2\0\1\35\7\0\1\34\4\0"+
    "\1\34\5\0\27\34\1\0\37\34\1\0\u013f\34\31\0\162\34\4\0"+
    "\14\34\16\0\5\34\11\0\1\34\21\0\130\35\5\0\23\35\12\0"+
    "\1\34\13\0\1\34\1\0\3\34\1\0\1\34\1\0\24\34\1\0"+
    "\54\34\1\0\46\34\1\0\5\34\4\0\202\34\1\0\4\35\3\0"+
    "\105\34\1\0\46\34\2\0\2\34\6\0\20\34\41\0\46\34\2\0"+
    "\1\34\7\0\47\34\11\0\21\35\1\0\27\35\1\0\3\35\1\0"+
    "\1\35\1\0\2\35\1\0\1\35\13\0\33\34\5\0\3\34\15\0"+
    "\4\35\14\0\6\35\13\0\32\34\5\0\13\34\16\35\7\0\12\25"+
    "\4\0\2\34\1\35\143\34\1\0\1\34\10\35\1\0\6\35\2\34"+
    "\2\35\1\0\4\35\2\34\12\25\3\34\2\0\1\34\17\0\1\35"+
    "\1\34\1\35\36\34\33\35\2\0\3\34\60\0\46\34\13\35\1\34"+
    "\u014f\0\3\35\66\34\2\0\1\35\1\34\20\35\2\0\1\34\4\35"+
    "\3\0\12\34\2\35\2\0\12\25\21\0\3\35\1\0\10\34\2\0"+
    "\2\34\2\0\26\34\1\0\7\34\1\0\1\34\3\0\4\34\2\0"+
    "\1\35\1\34\7\35\2\0\2\35\2\0\3\35\11\0\1\35\4\0"+
    "\2\34\1\0\3\34\2\35\2\0\12\25\4\34\15\0\3\35\1\0"+
    "\6\34\4\0\2\34\2\0\26\34\1\0\7\34\1\0\2\34\1\0"+
    "\2\34\1\0\2\34\2\0\1\35\1\0\5\35\4\0\2\35\2\0"+
    "\3\35\13\0\4\34\1\0\1\34\7\0\12\25\2\35\3\34\14\0"+
    "\3\35\1\0\11\34\1\0\3\34\1\0\26\34\1\0\7\34\1\0"+
    "\2\34\1\0\5\34\2\0\1\35\1\34\10\35\1\0\3\35\1\0"+
    "\3\35\2\0\1\34\17\0\2\34\2\35\2\0\12\25\1\0\1\34"+
    "\17\0\3\35\1\0\10\34\2\0\2\34\2\0\26\34\1\0\7\34"+
    "\1\0\2\34\1\0\5\34\2\0\1\35\1\34\6\35\3\0\2\35"+
    "\2\0\3\35\10\0\2\35\4\0\2\34\1\0\3\34\4\0\12\25"+
    "\1\0\1\34\20\0\1\35\1\34\1\0\6\34\3\0\3\34\1\0"+
    "\4\34\3\0\2\34\1\0\1\34\1\0\2\34\3\0\2\34\3\0"+
    "\3\34\3\0\10\34\1\0\3\34\4\0\5\35\3\0\3\35\1\0"+
    "\4\35\11\0\1\35\17\0\11\25\11\0\1\34\7\0\3\35\1\0"+
    "\10\34\1\0\3\34\1\0\27\34\1\0\12\34\1\0\5\34\4\0"+
    "\7\35\1\0\3\35\1\0\4\35\7\0\2\35\11\0\2\34\4\0"+
    "\12\25\22\0\2\35\1\0\10\34\1\0\3\34\1\0\27\34\1\0"+
    "\12\34\1\0\5\34\2\0\1\35\1\34\7\35\1\0\3\35\1\0"+
    "\4\35\7\0\2\35\7\0\1\34\1\0\2\34\4\0\12\25\22\0"+
    "\2\35\1\0\10\34\1\0\3\34\1\0\27\34\1\0\20\34\4\0"+
    "\6\35\2\0\3\35\1\0\4\35\11\0\1\35\10\0\2\34\4\0"+
    "\12\25\22\0\2\35\1\0\22\34\3\0\30\34\1\0\11\34\1\0"+
    "\1\34\2\0\7\34\3\0\1\35\4\0\6\35\1\0\1\35\1\0"+
    "\10\35\22\0\2\35\15\0\60\34\1\35\2\34\7\35\4\0\10\34"+
    "\10\35\1\0\12\25\47\0\2\34\1\0\1\34\2\0\2\34\1\0"+
    "\1\34\2\0\1\34\6\0\4\34\1\0\7\34\1\0\3\34\1\0"+
    "\1\34\1\0\1\34\2\0\2\34\1\0\4\34\1\35\2\34\6\35"+
    "\1\0\2\35\1\34\2\0\5\34\1\0\1\34\1\0\6\35\2\0"+
    "\12\25\2\0\2\34\42\0\1\34\27\0\2\35\6\0\12\25\13\0"+
    "\1\35\1\0\1\35\1\0\1\35\4\0\2\35\10\34\1\0\42\34"+
    "\6\0\24\35\1\0\2\35\4\34\4\0\10\35\1\0\44\35\11\0"+
    "\1\35\71\0\42\34\1\0\5\34\1\0\2\34\1\0\7\35\3\0"+
    "\4\35\6\0\12\25\6\0\6\34\4\35\106\0\46\34\12\0\51\34"+
    "\7\0\132\34\5\0\104\34\5\0\122\34\6\0\7\34\1\0\77\34"+
    "\1\0\1\34\1\0\4\34\2\0\7\34\1\0\1\34\1\0\4\34"+
    "\2\0\47\34\1\0\1\34\1\0\4\34\2\0\37\34\1\0\1\34"+
    "\1\0\4\34\2\0\7\34\1\0\1\34\1\0\4\34\2\0\7\34"+
    "\1\0\7\34\1\0\27\34\1\0\37\34\1\0\1\34\1\0\4\34"+
    "\2\0\7\34\1\0\47\34\1\0\23\34\16\0\11\25\56\0\125\34"+
    "\14\0\u026c\34\2\0\10\34\12\0\32\34\5\0\113\34\3\0\3\34"+
    "\17\0\15\34\1\0\4\34\3\35\13\0\22\34\3\35\13\0\22\34"+
    "\2\35\14\0\15\34\1\0\3\34\1\0\2\35\14\0\64\34\40\35"+
    "\3\0\1\34\3\0\2\34\1\35\2\0\12\25\41\0\3\35\2\0"+
    "\12\25\6\0\130\34\10\0\51\34\1\35\126\0\35\34\3\0\14\35"+
    "\4\0\14\35\12\0\12\25\36\34\2\0\5\34\u038b\0\154\34\224\0"+
    "\234\34\4\0\132\34\6\0\26\34\2\0\6\34\2\0\46\34\2\0"+
    "\6\34\2\0\10\34\1\0\1\34\1\0\1\34\1\0\1\34\1\0"+
    "\37\34\2\0\65\34\1\0\7\34\1\0\1\34\3\0\3\34\1\0"+
    "\7\34\3\0\4\34\2\0\6\34\4\0\15\34\5\0\3\34\1\0"+
    "\7\34\17\0\4\35\32\0\5\35\20\0\2\34\23\0\1\34\13\0"+
    "\4\35\6\0\6\35\1\0\1\34\15\0\1\34\40\0\22\34\36\0"+
    "\15\35\4\0\1\35\3\0\6\35\27\0\1\34\4\0\1\34\2\0"+
    "\12\34\1\0\1\34\3\0\5\34\6\0\1\34\1\0\1\34\1\0"+
    "\1\34\1\0\4\34\1\0\3\34\1\0\7\34\3\0\3\34\5\0"+
    "\5\34\26\0\44\34\u0e81\0\3\34\31\0\11\34\6\35\1\0\5\34"+
    "\2\0\5\34\4\0\126\34\2\0\2\35\2\0\3\34\1\0\137\34"+
    "\5\0\50\34\4\0\136\34\21\0\30\34\70\0\20\34\u0200\0\u19b6\34"+
    "\112\0\u51a6\34\132\0\u048d\34\u0773\0\u2ba4\34\u215c\0\u012e\34\2\0\73\34"+
    "\225\0\7\34\14\0\5\34\5\0\1\34\1\35\12\34\1\0\15\34"+
    "\1\0\5\34\1\0\1\34\1\0\2\34\1\0\2\34\1\0\154\34"+
    "\41\0\u016b\34\22\0\100\34\2\0\66\34\50\0\15\34\3\0\20\35"+
    "\20\0\4\35\17\0\2\34\30\0\3\34\31\0\1\34\6\0\5\34"+
    "\1\0\207\34\2\0\1\35\4\0\1\34\13\0\12\25\7\0\32\34"+
    "\4\0\1\34\1\0\32\34\12\0\132\34\3\0\6\34\2\0\6\34"+
    "\2\0\6\34\2\0\3\34\3\0\2\34\3\0\2\34\22\0\3\35"+
    "\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\20\2\2\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\4\1\1\1\12\1\1\1\13\1\14"+
    "\1\15\6\2\1\16\2\2\1\17\1\20\14\2\3\0"+
    "\1\21\1\0\1\12\1\0\1\6\1\0\1\6\1\13"+
    "\2\2\1\22\5\2\1\12\1\2\1\23\2\2\1\24"+
    "\12\2\1\25\1\3\2\21\1\0\1\6\1\0\1\6"+
    "\3\2\1\26\13\2\1\27\1\2\1\30\1\2\1\31"+
    "\2\21\3\0\1\6\1\2\1\32\2\2\1\33\1\34"+
    "\12\2\1\21\1\35\2\2\1\36\1\37\1\40\1\41"+
    "\1\42\13\2\1\43\2\2\1\44\4\2\1\45\1\46"+
    "\1\2\1\47\1\50\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276"+
    "\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\u0348\0\u0372\0\u039c\0\176"+
    "\0\u03c6\0\176\0\176\0\176\0\176\0\u03f0\0\u03f0\0\u041a"+
    "\0\u0444\0\u046e\0\176\0\u0498\0\u04c2\0\u04ec\0\u0516\0\u0540"+
    "\0\u056a\0\u0594\0\u05be\0\u05e8\0\374\0\374\0\u0612\0\u063c"+
    "\0\u0666\0\u0690\0\u06ba\0\u06e4\0\u070e\0\u0738\0\u0762\0\u078c"+
    "\0\u07b6\0\u07e0\0\u080a\0\u0834\0\u039c\0\u085e\0\u0888\0\176"+
    "\0\u08b2\0\176\0\u08dc\0\u0906\0\176\0\u0930\0\u095a\0\374"+
    "\0\u0984\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\374\0\u0a56\0\374"+
    "\0\u0a80\0\u0aaa\0\374\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c"+
    "\0\u0ba6\0\u0bd0\0\u0bfa\0\u0c24\0\u0c4e\0\u080a\0\u0834\0\u0c78"+
    "\0\u0ca2\0\u0ccc\0\u0cf6\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8"+
    "\0\374\0\u0df2\0\u0e1c\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4\0\u0eee"+
    "\0\u0f18\0\u0f42\0\u0f6c\0\u0f96\0\374\0\u0fc0\0\374\0\u0fea"+
    "\0\374\0\176\0\u1014\0\u103e\0\u0cf6\0\u1068\0\u08b2\0\u1092"+
    "\0\374\0\u10bc\0\u10e6\0\374\0\374\0\u1110\0\u113a\0\u1164"+
    "\0\u118e\0\u11b8\0\u11e2\0\u120c\0\u1236\0\u1260\0\u128a\0\u039c"+
    "\0\374\0\u12b4\0\u12de\0\374\0\374\0\374\0\374\0\374"+
    "\0\u1308\0\u1332\0\u135c\0\u1386\0\u13b0\0\u13da\0\u1404\0\u142e"+
    "\0\u1458\0\u1482\0\u14ac\0\374\0\u14d6\0\u1500\0\374\0\u152a"+
    "\0\u1554\0\u157e\0\u15a8\0\374\0\374\0\u15d2\0\374\0\374"+
    "\0\374";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\7\1\11\1\12"+
    "\1\13\1\7\1\14\1\15\1\16\1\17\1\7\1\20"+
    "\1\21\1\22\1\23\1\7\1\24\1\25\1\26\1\7"+
    "\1\25\1\4\1\27\1\4\1\7\1\4\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\2\36\1\37\1\40\2\31"+
    "\33\41\1\42\2\41\1\43\1\4\10\41\1\4\1\41"+
    "\52\4\53\0\1\7\1\44\26\7\3\0\2\7\15\0"+
    "\2\7\1\45\1\7\1\46\2\7\1\47\1\50\17\7"+
    "\3\0\2\7\15\0\30\7\3\0\2\7\15\0\12\7"+
    "\1\51\1\52\14\7\3\0\2\7\15\0\6\7\1\53"+
    "\21\7\3\0\2\7\15\0\3\7\1\54\11\7\1\55"+
    "\2\7\1\56\7\7\3\0\2\7\15\0\6\7\1\57"+
    "\21\7\3\0\2\7\15\0\13\7\1\60\2\7\1\61"+
    "\11\7\3\0\2\7\15\0\1\7\1\62\5\7\1\63"+
    "\20\7\3\0\2\7\15\0\11\7\1\64\16\7\3\0"+
    "\2\7\15\0\7\7\1\65\20\7\3\0\2\7\15\0"+
    "\7\7\1\66\20\7\3\0\2\7\15\0\6\7\1\67"+
    "\21\7\3\0\2\7\15\0\1\7\1\70\26\7\3\0"+
    "\2\7\15\0\6\7\1\71\21\7\3\0\2\7\15\0"+
    "\16\7\1\72\11\7\3\0\2\7\41\0\2\25\1\0"+
    "\1\25\1\73\41\0\1\74\3\0\2\25\1\0\1\25"+
    "\1\73\20\0\32\75\1\76\1\77\16\75\37\0\1\31"+
    "\10\0\2\31\44\0\1\100\5\0\37\101\1\102\2\101"+
    "\1\103\5\101\1\104\1\101\33\41\1\0\2\41\2\0"+
    "\10\41\1\0\1\41\36\0\1\105\14\0\2\7\1\106"+
    "\25\7\3\0\2\7\15\0\13\7\1\107\14\7\3\0"+
    "\2\7\15\0\15\7\1\110\12\7\3\0\2\7\15\0"+
    "\15\7\1\111\12\7\3\0\2\7\15\0\6\7\1\112"+
    "\21\7\3\0\2\7\15\0\7\7\1\113\20\7\3\0"+
    "\2\7\15\0\11\7\1\114\16\7\3\0\2\7\15\0"+
    "\7\7\1\115\20\7\3\0\2\7\15\0\15\7\1\116"+
    "\12\7\3\0\2\7\15\0\3\7\1\117\7\7\1\120"+
    "\5\7\1\121\6\7\3\0\2\7\15\0\22\7\1\122"+
    "\5\7\3\0\2\7\15\0\11\7\1\123\16\7\3\0"+
    "\2\7\15\0\15\7\1\124\12\7\3\0\2\7\15\0"+
    "\6\7\1\125\21\7\3\0\2\7\15\0\15\7\1\126"+
    "\12\7\3\0\2\7\15\0\6\7\1\127\7\7\1\130"+
    "\11\7\3\0\2\7\15\0\17\7\1\131\10\7\3\0"+
    "\2\7\15\0\12\7\1\132\15\7\3\0\2\7\15\0"+
    "\4\7\1\133\23\7\3\0\2\7\15\0\11\7\1\134"+
    "\16\7\3\0\2\7\15\0\16\7\1\135\11\7\3\0"+
    "\2\7\41\0\2\136\1\0\1\136\22\0\2\137\4\0"+
    "\1\137\3\0\1\137\4\0\1\137\3\0\1\137\1\0"+
    "\3\137\32\0\1\140\2\0\1\140\35\0\32\75\1\141"+
    "\1\77\16\75\37\101\1\102\10\101\1\104\1\101\37\142"+
    "\1\143\2\142\1\144\5\142\1\145\1\142\37\0\1\102"+
    "\13\0\3\7\1\146\24\7\3\0\2\7\15\0\1\7"+
    "\1\147\26\7\3\0\2\7\15\0\6\7\1\150\21\7"+
    "\3\0\2\7\15\0\11\7\1\151\16\7\3\0\2\7"+
    "\15\0\13\7\1\152\14\7\3\0\2\7\15\0\16\7"+
    "\1\153\11\7\3\0\2\7\15\0\4\7\1\154\23\7"+
    "\3\0\2\7\15\0\1\7\1\155\26\7\3\0\2\7"+
    "\15\0\6\7\1\156\21\7\3\0\2\7\15\0\13\7"+
    "\1\157\14\7\3\0\2\7\15\0\6\7\1\160\21\7"+
    "\3\0\2\7\15\0\1\7\1\161\26\7\3\0\2\7"+
    "\15\0\6\7\1\162\21\7\3\0\2\7\15\0\17\7"+
    "\1\163\10\7\3\0\2\7\15\0\1\164\27\7\3\0"+
    "\2\7\15\0\16\7\1\165\11\7\3\0\2\7\15\0"+
    "\1\7\1\166\26\7\3\0\2\7\15\0\15\7\1\167"+
    "\12\7\3\0\2\7\15\0\6\7\1\170\21\7\3\0"+
    "\2\7\15\0\2\7\1\171\25\7\3\0\2\7\25\0"+
    "\1\172\2\0\1\172\35\0\11\75\1\173\2\75\1\173"+
    "\15\75\1\76\1\77\16\75\37\142\1\143\2\142\1\174"+
    "\5\142\1\145\1\142\42\175\1\176\7\175\37\101\1\102"+
    "\2\101\1\144\4\101\1\177\1\104\1\101\37\175\1\143"+
    "\2\175\1\176\7\175\1\0\4\7\1\200\23\7\3\0"+
    "\2\7\15\0\3\7\1\201\24\7\3\0\2\7\15\0"+
    "\1\202\27\7\3\0\2\7\15\0\14\7\1\203\13\7"+
    "\3\0\2\7\15\0\11\7\1\204\16\7\3\0\2\7"+
    "\15\0\3\7\1\205\24\7\3\0\2\7\15\0\7\7"+
    "\1\206\20\7\3\0\2\7\15\0\20\7\1\207\7\7"+
    "\3\0\2\7\15\0\2\7\1\210\25\7\3\0\2\7"+
    "\15\0\11\7\1\211\16\7\3\0\2\7\15\0\7\7"+
    "\1\212\20\7\3\0\2\7\15\0\21\7\1\213\6\7"+
    "\3\0\2\7\15\0\13\7\1\214\14\7\3\0\2\7"+
    "\15\0\6\7\1\215\21\7\3\0\2\7\15\0\2\7"+
    "\1\216\25\7\3\0\2\7\15\0\3\7\1\217\24\7"+
    "\3\0\2\7\14\0\11\75\1\220\2\75\1\220\15\75"+
    "\1\76\1\77\16\75\37\142\1\143\2\142\1\174\4\142"+
    "\1\177\1\145\1\142\42\175\1\176\4\175\1\102\2\175"+
    "\1\0\3\7\1\221\24\7\3\0\2\7\15\0\1\7"+
    "\1\222\26\7\3\0\2\7\15\0\15\7\1\223\12\7"+
    "\3\0\2\7\15\0\6\7\1\224\21\7\3\0\2\7"+
    "\15\0\14\7\1\225\13\7\3\0\2\7\15\0\16\7"+
    "\1\226\11\7\3\0\2\7\15\0\1\7\1\227\26\7"+
    "\3\0\2\7\15\0\6\7\1\230\21\7\3\0\2\7"+
    "\15\0\7\7\1\231\20\7\3\0\2\7\15\0\12\7"+
    "\1\232\15\7\3\0\2\7\15\0\3\7\1\233\24\7"+
    "\3\0\2\7\15\0\16\7\1\234\11\7\3\0\2\7"+
    "\15\0\13\7\1\235\14\7\3\0\2\7\15\0\12\7"+
    "\1\236\15\7\3\0\2\7\15\0\4\7\1\237\23\7"+
    "\3\0\2\7\15\0\4\7\1\240\23\7\3\0\2\7"+
    "\15\0\1\7\1\241\26\7\3\0\2\7\15\0\3\7"+
    "\1\242\24\7\3\0\2\7\15\0\21\7\1\243\6\7"+
    "\3\0\2\7\15\0\3\7\1\244\24\7\3\0\2\7"+
    "\15\0\15\7\1\245\12\7\3\0\2\7\15\0\7\7"+
    "\1\246\20\7\3\0\2\7\15\0\10\7\1\247\17\7"+
    "\3\0\2\7\15\0\7\7\1\250\20\7\3\0\2\7"+
    "\15\0\1\7\1\251\26\7\3\0\2\7\15\0\4\7"+
    "\1\252\23\7\3\0\2\7\15\0\4\7\1\253\23\7"+
    "\3\0\2\7\15\0\1\7\1\254\26\7\3\0\2\7"+
    "\15\0\6\7\1\255\21\7\3\0\2\7\15\0\7\7"+
    "\1\256\20\7\3\0\2\7\15\0\3\7\1\257\24\7"+
    "\3\0\2\7\15\0\10\7\1\260\17\7\3\0\2\7"+
    "\15\0\6\7\1\261\21\7\3\0\2\7\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5628];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\23\1\1\11\1\1\4\11\5\1\1\11"+
    "\27\1\3\0\1\1\1\0\1\11\1\0\1\11\1\0"+
    "\1\1\1\11\34\1\1\0\1\1\1\0\25\1\1\11"+
    "\1\1\3\0\63\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer stringLiteralBuffer = new StringBuffer();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerLa(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerLa(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1742) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public ScriptureToken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 6: 
          { /* ignore */
          }
        case 42: break;
        case 21: 
          { return new ScriptureToken(ScriptureTokenType.REAL_LITERAL, yytext(), yyline, yychar);
          }
        case 43: break;
        case 29: 
          { return new ScriptureToken(ScriptureTokenType.FALSE, yytext(), yyline, yychar);
          }
        case 44: break;
        case 30: 
          { return new ScriptureToken(ScriptureTokenType.PRAY, yytext(), yyline, yychar);
          }
        case 45: break;
        case 9: 
          { return new ScriptureToken(ScriptureTokenType.MULTIPLICATION_OPERATOR, null, yyline, yychar);
          }
        case 46: break;
        case 22: 
          { return new ScriptureToken(ScriptureTokenType.AMEN, yytext(), yyline, yychar);
          }
        case 47: break;
        case 2: 
          { return new ScriptureToken(ScriptureTokenType.IDENTIFIER, yytext(), yyline, yychar);
          }
        case 48: break;
        case 4: 
          { return new ScriptureToken(ScriptureTokenType.DIVISION_OPERATOR, yytext(), yyline, yychar);
          }
        case 49: break;
        case 28: 
          { return new ScriptureToken(ScriptureTokenType.TRUE, yytext(), yyline, yychar);
          }
        case 50: break;
        case 24: 
          { return new ScriptureToken(ScriptureTokenType.XOR, yytext(), yyline, yychar);
          }
        case 51: break;
        case 25: 
          { return new ScriptureToken(ScriptureTokenType.BOOLEAN, yytext(), yyline, yychar);
          }
        case 52: break;
        case 14: 
          { return new ScriptureToken(ScriptureTokenType.IF, yytext(), yyline, yychar);
          }
        case 53: break;
        case 8: 
          { return new ScriptureToken(ScriptureTokenType.SUBTRACTION_OPERATOR, null, yyline, yychar);
          }
        case 54: break;
        case 27: 
          { return new ScriptureToken(ScriptureTokenType.ELSE, yytext(), yyline, yychar);
          }
        case 55: break;
        case 13: 
          { stringLiteralBuffer.append(yytext()); yybegin(YYINITIAL); return new ScriptureToken(ScriptureTokenType.STRING_LITERAL, stringLiteralBuffer.toString(), yyline, yychar);
          }
        case 56: break;
        case 39: 
          { return new ScriptureToken(ScriptureTokenType.COMMANDMENT, yytext(), yyline, yychar);
          }
        case 57: break;
        case 40: 
          { return new ScriptureToken(ScriptureTokenType.ARTIFACT, yytext(), yyline, yychar);
          }
        case 58: break;
        case 3: 
          { return new ScriptureToken(ScriptureTokenType.INTEGER_LITERAL, yytext(), yyline, yychar);
          }
        case 59: break;
        case 37: 
          { return new ScriptureToken(ScriptureTokenType.SCRIPTURE, yytext(), yyline, yychar);
          }
        case 60: break;
        case 16: 
          { return new ScriptureToken(ScriptureTokenType.OF, yytext(), yyline, yychar);
          }
        case 61: break;
        case 33: 
          { return new ScriptureToken(ScriptureTokenType.STRING, yytext(), yyline, yychar);
          }
        case 62: break;
        case 17: 
          { return new ScriptureToken(ScriptureTokenType.REGEXP_LITERAL, yytext(), yyline, yychar);
          }
        case 63: break;
        case 18: 
          { return new ScriptureToken(ScriptureTokenType.OR, yytext(), yyline, yychar);
          }
        case 64: break;
        case 26: 
          { return new ScriptureToken(ScriptureTokenType.ALIAS, yytext(), yyline, yychar);
          }
        case 65: break;
        case 34: 
          { return new ScriptureToken(ScriptureTokenType.CREATE, yytext(), yyline, yychar);
          }
        case 66: break;
        case 12: 
          { stringLiteralBuffer.append('\\');
          }
        case 67: break;
        case 20: 
          { return new ScriptureToken(ScriptureTokenType.NOT, yytext(), yyline, yychar);
          }
        case 68: break;
        case 7: 
          { return new ScriptureToken(ScriptureTokenType.ADDITION_OPERATOR, null, yyline, yychar);
          }
        case 69: break;
        case 32: 
          { return new ScriptureToken(ScriptureTokenType.CREATION, yytext(), yyline, yychar);
          }
        case 70: break;
        case 35: 
          { return new ScriptureToken(ScriptureTokenType.GENESIS, yytext(), yyline, yychar);
          }
        case 71: break;
        case 36: 
          { return new ScriptureToken(ScriptureTokenType.INTEGER, yytext(), yyline, yychar);
          }
        case 72: break;
        case 19: 
          { return new ScriptureToken(ScriptureTokenType.REAL, yytext(), yyline, yychar);
          }
        case 73: break;
        case 11: 
          { stringLiteralBuffer.append(yytext());
          }
        case 74: break;
        case 41: 
          { return new ScriptureToken(ScriptureTokenType.PROPHECY, yytext(), yyline, yychar);
          }
        case 75: break;
        case 31: 
          { return new ScriptureToken(ScriptureTokenType.REGEXP, yytext(), yyline, yychar);
          }
        case 76: break;
        case 15: 
          { return new ScriptureToken(ScriptureTokenType.AND, yytext(), yyline, yychar);
          }
        case 77: break;
        case 5: 
          { stringLiteralBuffer.setLength(0); stringLiteralBuffer.append(yytext()); yybegin(STRING);
          }
        case 78: break;
        case 10: 
          { return new ScriptureToken(ScriptureTokenType.COMPARATIVE_OPERATOR, yytext(), yyline, yychar);
          }
        case 79: break;
        case 38: 
          { return new ScriptureToken(ScriptureTokenType.PREACH, yytext(), yyline, yychar);
          }
        case 80: break;
        case 1: 
          { throw new ScriptureLexerException(yytext(), yyline, yychar);
          }
        case 81: break;
        case 23: 
          { return new ScriptureToken(ScriptureTokenType.ORDER, yytext(), yyline, yychar);
          }
        case 82: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {   return new ScriptureToken(ScriptureTokenType.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}