/* The following code was generated by JFlex 1.4.3 on 9/28/09 4:42 AM */

package com.quesoconcarne.scripture;

/**
 * This is the lexer class for all English locales.
 */

final class LexerEn implements ScriptureLexer {

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
    "\11\40\1\61\1\35\1\0\1\61\1\60\16\40\4\0\1\23\1\55"+
    "\1\41\1\57\1\37\1\54\2\0\1\34\1\36\1\53\1\51\1\46"+
    "\1\52\1\32\1\54\1\27\11\31\1\43\1\44\1\56\1\45\1\56"+
    "\1\0\1\33\6\30\24\37\1\47\1\42\1\50\1\0\1\37\1\0"+
    "\1\2\1\24\1\13\1\17\1\5\1\1\1\22\1\20\1\14\2\37"+
    "\1\3\1\11\1\12\1\16\1\15\1\37\1\7\1\4\1\6\1\10"+
    "\2\37\1\25\1\21\1\37\4\0\41\40\2\0\4\37\4\0\1\37"+
    "\2\0\1\40\7\0\1\37\4\0\1\37\5\0\27\37\1\0\37\37"+
    "\1\0\u013f\37\31\0\162\37\4\0\14\37\16\0\5\37\11\0\1\37"+
    "\21\0\130\40\5\0\23\40\12\0\1\37\13\0\1\37\1\0\3\37"+
    "\1\0\1\37\1\0\24\37\1\0\54\37\1\0\46\37\1\0\5\37"+
    "\4\0\202\37\1\0\4\40\3\0\105\37\1\0\46\37\2\0\2\37"+
    "\6\0\20\37\41\0\46\37\2\0\1\37\7\0\47\37\11\0\21\40"+
    "\1\0\27\40\1\0\3\40\1\0\1\40\1\0\2\40\1\0\1\40"+
    "\13\0\33\37\5\0\3\37\15\0\4\40\14\0\6\40\13\0\32\37"+
    "\5\0\13\37\16\40\7\0\12\26\4\0\2\37\1\40\143\37\1\0"+
    "\1\37\10\40\1\0\6\40\2\37\2\40\1\0\4\40\2\37\12\26"+
    "\3\37\2\0\1\37\17\0\1\40\1\37\1\40\36\37\33\40\2\0"+
    "\3\37\60\0\46\37\13\40\1\37\u014f\0\3\40\66\37\2\0\1\40"+
    "\1\37\20\40\2\0\1\37\4\40\3\0\12\37\2\40\2\0\12\26"+
    "\21\0\3\40\1\0\10\37\2\0\2\37\2\0\26\37\1\0\7\37"+
    "\1\0\1\37\3\0\4\37\2\0\1\40\1\37\7\40\2\0\2\40"+
    "\2\0\3\40\11\0\1\40\4\0\2\37\1\0\3\37\2\40\2\0"+
    "\12\26\4\37\15\0\3\40\1\0\6\37\4\0\2\37\2\0\26\37"+
    "\1\0\7\37\1\0\2\37\1\0\2\37\1\0\2\37\2\0\1\40"+
    "\1\0\5\40\4\0\2\40\2\0\3\40\13\0\4\37\1\0\1\37"+
    "\7\0\12\26\2\40\3\37\14\0\3\40\1\0\11\37\1\0\3\37"+
    "\1\0\26\37\1\0\7\37\1\0\2\37\1\0\5\37\2\0\1\40"+
    "\1\37\10\40\1\0\3\40\1\0\3\40\2\0\1\37\17\0\2\37"+
    "\2\40\2\0\12\26\1\0\1\37\17\0\3\40\1\0\10\37\2\0"+
    "\2\37\2\0\26\37\1\0\7\37\1\0\2\37\1\0\5\37\2\0"+
    "\1\40\1\37\6\40\3\0\2\40\2\0\3\40\10\0\2\40\4\0"+
    "\2\37\1\0\3\37\4\0\12\26\1\0\1\37\20\0\1\40\1\37"+
    "\1\0\6\37\3\0\3\37\1\0\4\37\3\0\2\37\1\0\1\37"+
    "\1\0\2\37\3\0\2\37\3\0\3\37\3\0\10\37\1\0\3\37"+
    "\4\0\5\40\3\0\3\40\1\0\4\40\11\0\1\40\17\0\11\26"+
    "\11\0\1\37\7\0\3\40\1\0\10\37\1\0\3\37\1\0\27\37"+
    "\1\0\12\37\1\0\5\37\4\0\7\40\1\0\3\40\1\0\4\40"+
    "\7\0\2\40\11\0\2\37\4\0\12\26\22\0\2\40\1\0\10\37"+
    "\1\0\3\37\1\0\27\37\1\0\12\37\1\0\5\37\2\0\1\40"+
    "\1\37\7\40\1\0\3\40\1\0\4\40\7\0\2\40\7\0\1\37"+
    "\1\0\2\37\4\0\12\26\22\0\2\40\1\0\10\37\1\0\3\37"+
    "\1\0\27\37\1\0\20\37\4\0\6\40\2\0\3\40\1\0\4\40"+
    "\11\0\1\40\10\0\2\37\4\0\12\26\22\0\2\40\1\0\22\37"+
    "\3\0\30\37\1\0\11\37\1\0\1\37\2\0\7\37\3\0\1\40"+
    "\4\0\6\40\1\0\1\40\1\0\10\40\22\0\2\40\15\0\60\37"+
    "\1\40\2\37\7\40\4\0\10\37\10\40\1\0\12\26\47\0\2\37"+
    "\1\0\1\37\2\0\2\37\1\0\1\37\2\0\1\37\6\0\4\37"+
    "\1\0\7\37\1\0\3\37\1\0\1\37\1\0\1\37\2\0\2\37"+
    "\1\0\4\37\1\40\2\37\6\40\1\0\2\40\1\37\2\0\5\37"+
    "\1\0\1\37\1\0\6\40\2\0\12\26\2\0\2\37\42\0\1\37"+
    "\27\0\2\40\6\0\12\26\13\0\1\40\1\0\1\40\1\0\1\40"+
    "\4\0\2\40\10\37\1\0\42\37\6\0\24\40\1\0\2\40\4\37"+
    "\4\0\10\40\1\0\44\40\11\0\1\40\71\0\42\37\1\0\5\37"+
    "\1\0\2\37\1\0\7\40\3\0\4\40\6\0\12\26\6\0\6\37"+
    "\4\40\106\0\46\37\12\0\51\37\7\0\132\37\5\0\104\37\5\0"+
    "\122\37\6\0\7\37\1\0\77\37\1\0\1\37\1\0\4\37\2\0"+
    "\7\37\1\0\1\37\1\0\4\37\2\0\47\37\1\0\1\37\1\0"+
    "\4\37\2\0\37\37\1\0\1\37\1\0\4\37\2\0\7\37\1\0"+
    "\1\37\1\0\4\37\2\0\7\37\1\0\7\37\1\0\27\37\1\0"+
    "\37\37\1\0\1\37\1\0\4\37\2\0\7\37\1\0\47\37\1\0"+
    "\23\37\16\0\11\26\56\0\125\37\14\0\u026c\37\2\0\10\37\12\0"+
    "\32\37\5\0\113\37\3\0\3\37\17\0\15\37\1\0\4\37\3\40"+
    "\13\0\22\37\3\40\13\0\22\37\2\40\14\0\15\37\1\0\3\37"+
    "\1\0\2\40\14\0\64\37\40\40\3\0\1\37\3\0\2\37\1\40"+
    "\2\0\12\26\41\0\3\40\2\0\12\26\6\0\130\37\10\0\51\37"+
    "\1\40\126\0\35\37\3\0\14\40\4\0\14\40\12\0\12\26\36\37"+
    "\2\0\5\37\u038b\0\154\37\224\0\234\37\4\0\132\37\6\0\26\37"+
    "\2\0\6\37\2\0\46\37\2\0\6\37\2\0\10\37\1\0\1\37"+
    "\1\0\1\37\1\0\1\37\1\0\37\37\2\0\65\37\1\0\7\37"+
    "\1\0\1\37\3\0\3\37\1\0\7\37\3\0\4\37\2\0\6\37"+
    "\4\0\15\37\5\0\3\37\1\0\7\37\17\0\4\40\32\0\5\40"+
    "\20\0\2\37\23\0\1\37\13\0\4\40\6\0\6\40\1\0\1\37"+
    "\15\0\1\37\40\0\22\37\36\0\15\40\4\0\1\40\3\0\6\40"+
    "\27\0\1\37\4\0\1\37\2\0\12\37\1\0\1\37\3\0\5\37"+
    "\6\0\1\37\1\0\1\37\1\0\1\37\1\0\4\37\1\0\3\37"+
    "\1\0\7\37\3\0\3\37\5\0\5\37\26\0\44\37\u0e81\0\3\37"+
    "\31\0\11\37\6\40\1\0\5\37\2\0\5\37\4\0\126\37\2\0"+
    "\2\40\2\0\3\37\1\0\137\37\5\0\50\37\4\0\136\37\21\0"+
    "\30\37\70\0\20\37\u0200\0\u19b6\37\112\0\u51a6\37\132\0\u048d\37\u0773\0"+
    "\u2ba4\37\u215c\0\u012e\37\2\0\73\37\225\0\7\37\14\0\5\37\5\0"+
    "\1\37\1\40\12\37\1\0\15\37\1\0\5\37\1\0\1\37\1\0"+
    "\2\37\1\0\2\37\1\0\154\37\41\0\u016b\37\22\0\100\37\2\0"+
    "\66\37\50\0\15\37\3\0\20\40\20\0\4\40\17\0\2\37\30\0"+
    "\3\37\31\0\1\37\6\0\5\37\1\0\207\37\2\0\1\40\4\0"+
    "\1\37\13\0\12\26\7\0\32\37\4\0\1\37\1\0\32\37\12\0"+
    "\132\37\3\0\6\37\2\0\6\37\2\0\6\37\2\0\3\37\3\0"+
    "\2\37\3\0\2\37\22\0\3\40\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\16\2\1\3\2\2\2\4\1\5\1\1"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\1\1\23\1\1"+
    "\1\24\1\25\1\26\16\2\1\27\1\23\2\2\1\30"+
    "\1\31\3\2\3\0\1\23\1\0\1\3\1\0\1\3"+
    "\1\24\4\2\1\32\7\2\1\33\11\2\1\34\1\35"+
    "\1\4\2\0\1\3\1\0\1\3\3\2\1\36\1\0"+
    "\2\2\1\37\1\40\1\41\4\2\1\42\5\2\4\0"+
    "\1\3\1\43\1\44\1\2\1\0\10\2\1\45\2\2"+
    "\1\0\1\2\1\0\1\46\1\2\1\47\3\2\1\50"+
    "\3\2\1\0\1\2\1\0\3\2\1\51\1\2\1\52"+
    "\1\53\1\0\1\54\1\0\1\2\1\55\1\2\1\56"+
    "\1\57\1\0\1\60\1\2\1\57\1\0\1\2\1\57"+
    "\1\0\1\61\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[187];
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
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee"+
    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\226"+
    "\0\u047e\0\226\0\226\0\226\0\226\0\226\0\u04b0\0\226"+
    "\0\226\0\226\0\226\0\226\0\226\0\226\0\u04b0\0\u04b0"+
    "\0\u04e2\0\u0514\0\226\0\u0546\0\u0578\0\u05aa\0\u05dc\0\u060e"+
    "\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e"+
    "\0\u07d0\0\u0802\0\u0226\0\u0226\0\u0834\0\u0866\0\u0226\0\u0898"+
    "\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\226\0\u09f6"+
    "\0\226\0\u0a28\0\u0a5a\0\226\0\u0a8c\0\u0abe\0\u0af0\0\u0b22"+
    "\0\u0226\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80"+
    "\0\u0226\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac\0\u0dde"+
    "\0\u0e10\0\u0e42\0\u0226\0\u0960\0\u0992\0\u0e74\0\u0ea6\0\u0ed8"+
    "\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u0226\0\u1004\0\u1036"+
    "\0\u1068\0\u0226\0\u0226\0\u0226\0\u109a\0\u10cc\0\u10fe\0\u1130"+
    "\0\u0226\0\u1162\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u125c\0\u128e"+
    "\0\u0ed8\0\u12c0\0\u09f6\0\u0226\0\u0226\0\u12f2\0\u1324\0\u1356"+
    "\0\u1388\0\u13ba\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u0226"+
    "\0\u14e6\0\u1518\0\u154a\0\u157c\0\u15ae\0\u0226\0\u15e0\0\u0226"+
    "\0\u1612\0\u1644\0\u1676\0\u0226\0\u16a8\0\u16da\0\u170c\0\u173e"+
    "\0\u1770\0\u17a2\0\u17d4\0\u1806\0\u1838\0\u0226\0\u186a\0\u0226"+
    "\0\u0226\0\u189c\0\u0226\0\u18ce\0\u1900\0\u0226\0\u1932\0\u0226"+
    "\0\u1964\0\u1996\0\u0226\0\u19c8\0\u19fa\0\u1a2c\0\u1a5e\0\u125c"+
    "\0\u1a90\0\u0226\0\226";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[187];
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
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\2\14\1\15\1\16\1\17\1\20\1\21\3\14\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\14\1\26\1\30"+
    "\1\31\1\32\1\23\1\33\1\14\1\4\1\34\1\4"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\2\23\35\52\1\4"+
    "\3\52\1\53\1\54\15\52\1\4\1\52\62\4\63\0"+
    "\1\14\1\55\20\14\1\0\6\14\5\0\2\14\22\0"+
    "\2\14\1\56\3\14\1\57\1\14\1\60\1\61\10\14"+
    "\1\0\6\14\5\0\2\14\22\0\4\14\1\62\15\14"+
    "\1\0\6\14\5\0\2\14\22\0\5\14\1\63\4\14"+
    "\1\64\7\14\1\0\6\14\5\0\2\14\22\0\2\14"+
    "\1\65\17\14\1\0\6\14\5\0\2\14\22\0\6\14"+
    "\1\66\13\14\1\0\6\14\5\0\2\14\22\0\4\14"+
    "\1\67\15\14\1\0\6\14\5\0\2\14\22\0\22\14"+
    "\1\0\6\14\5\0\2\14\22\0\15\14\1\70\4\14"+
    "\1\0\6\14\5\0\2\14\22\0\6\14\1\71\6\14"+
    "\1\72\4\14\1\0\6\14\5\0\2\14\22\0\1\73"+
    "\2\14\1\74\5\14\1\75\10\14\1\0\6\14\5\0"+
    "\2\14\22\0\6\14\1\76\13\14\1\0\6\14\5\0"+
    "\2\14\22\0\1\77\5\14\1\100\13\14\1\0\6\14"+
    "\5\0\2\14\22\0\4\14\1\101\15\14\1\0\6\14"+
    "\5\0\2\14\44\0\1\23\11\0\1\23\22\0\2\23"+
    "\1\0\15\14\1\102\4\14\1\0\6\14\5\0\2\14"+
    "\22\0\15\14\1\103\4\14\1\0\6\14\5\0\2\14"+
    "\47\0\2\26\1\0\1\26\1\104\54\0\1\105\2\26"+
    "\1\0\1\26\1\104\36\0\1\106\117\0\1\107\14\0"+
    "\35\110\1\111\15\110\1\112\4\110\1\113\1\110\35\52"+
    "\1\0\3\52\2\0\15\52\1\0\1\52\41\0\1\114"+
    "\21\0\2\14\1\115\17\14\1\0\6\14\5\0\2\14"+
    "\22\0\13\14\1\116\6\14\1\0\6\14\5\0\2\14"+
    "\22\0\5\14\1\117\14\14\1\0\6\14\5\0\2\14"+
    "\22\0\4\14\1\120\15\14\1\0\6\14\5\0\2\14"+
    "\22\0\16\14\1\121\3\14\1\0\6\14\5\0\2\14"+
    "\22\0\5\14\1\122\14\14\1\0\6\14\5\0\2\14"+
    "\22\0\6\14\1\123\13\14\1\0\6\14\5\0\2\14"+
    "\22\0\6\14\1\124\13\14\1\0\6\14\5\0\2\14"+
    "\22\0\3\14\1\125\16\14\1\0\6\14\5\0\2\14"+
    "\22\0\7\14\1\126\12\14\1\0\6\14\5\0\2\14"+
    "\22\0\1\14\1\127\17\14\1\130\1\0\6\14\5\0"+
    "\2\14\22\0\5\14\1\131\14\14\1\0\6\14\5\0"+
    "\2\14\22\0\4\14\1\132\15\14\1\0\6\14\5\0"+
    "\2\14\22\0\10\14\1\133\11\14\1\0\6\14\5\0"+
    "\2\14\22\0\5\14\1\134\14\14\1\0\6\14\5\0"+
    "\2\14\22\0\1\14\1\135\2\14\1\136\10\14\1\137"+
    "\4\14\1\0\6\14\5\0\2\14\22\0\16\14\1\140"+
    "\3\14\1\0\6\14\5\0\2\14\22\0\11\14\1\141"+
    "\10\14\1\0\6\14\5\0\2\14\22\0\15\14\1\142"+
    "\4\14\1\0\6\14\5\0\2\14\22\0\6\14\1\143"+
    "\13\14\1\0\6\14\5\0\2\14\47\0\2\144\1\0"+
    "\1\144\31\0\2\145\2\0\1\145\5\0\1\145\3\0"+
    "\1\145\4\0\1\145\2\0\3\145\35\0\1\146\54\0"+
    "\35\110\1\111\22\110\1\113\1\110\35\147\1\150\15\147"+
    "\1\151\4\147\1\152\1\147\35\0\1\111\25\0\3\14"+
    "\1\153\16\14\1\0\6\14\5\0\2\14\22\0\1\14"+
    "\1\154\20\14\1\0\6\14\5\0\2\14\22\0\13\14"+
    "\1\155\6\14\1\0\6\14\5\0\2\14\22\0\11\14"+
    "\1\156\10\14\1\0\6\14\5\0\2\14\22\0\22\14"+
    "\1\157\6\14\5\0\2\14\22\0\13\14\1\160\6\14"+
    "\1\0\6\14\5\0\2\14\22\0\13\14\1\161\6\14"+
    "\1\0\6\14\5\0\2\14\22\0\4\14\1\162\15\14"+
    "\1\0\6\14\5\0\2\14\22\0\4\14\1\163\15\14"+
    "\1\0\6\14\5\0\2\14\22\0\2\14\1\164\17\14"+
    "\1\0\6\14\5\0\2\14\22\0\4\14\1\165\15\14"+
    "\1\0\6\14\5\0\2\14\22\0\1\14\1\166\20\14"+
    "\1\0\6\14\5\0\2\14\22\0\10\14\1\167\11\14"+
    "\1\0\6\14\5\0\2\14\22\0\4\14\1\170\15\14"+
    "\1\0\6\14\5\0\2\14\22\0\20\14\1\171\1\14"+
    "\1\0\6\14\5\0\2\14\22\0\1\14\1\172\20\14"+
    "\1\0\6\14\5\0\2\14\22\0\14\14\1\173\5\14"+
    "\1\0\6\14\5\0\2\14\22\0\4\14\1\174\15\14"+
    "\1\0\6\14\5\0\2\14\22\0\4\14\1\175\15\14"+
    "\1\0\6\14\5\0\2\14\22\0\2\14\1\176\17\14"+
    "\1\0\6\14\5\0\2\14\55\0\1\177\25\0\35\147"+
    "\1\150\15\147\1\200\4\147\1\152\1\147\53\201\1\202"+
    "\6\201\35\110\1\111\15\110\1\151\3\110\1\203\1\113"+
    "\1\110\35\201\1\150\15\201\1\202\6\201\1\0\4\14"+
    "\1\204\15\14\1\0\6\14\5\0\2\14\22\0\3\14"+
    "\1\205\16\14\1\0\6\14\5\0\2\14\22\0\1\206"+
    "\21\14\1\0\6\14\5\0\2\14\27\0\1\207\54\0"+
    "\11\14\1\210\10\14\1\0\6\14\5\0\2\14\22\0"+
    "\14\14\1\211\5\14\1\0\6\14\5\0\2\14\22\0"+
    "\22\14\1\0\1\14\1\212\4\14\5\0\2\14\22\0"+
    "\5\14\1\213\14\14\1\0\6\14\5\0\2\14\22\0"+
    "\1\14\1\214\20\14\1\0\6\14\5\0\2\14\22\0"+
    "\21\14\1\215\1\0\6\14\5\0\2\14\22\0\12\14"+
    "\1\216\7\14\1\0\6\14\5\0\2\14\22\0\17\14"+
    "\1\217\2\14\1\0\6\14\5\0\2\14\22\0\6\14"+
    "\1\220\13\14\1\0\6\14\5\0\2\14\22\0\3\14"+
    "\1\221\16\14\1\0\6\14\5\0\2\14\22\0\4\14"+
    "\1\222\15\14\1\0\6\14\5\0\2\14\21\0\35\177"+
    "\1\0\1\223\21\177\1\0\1\177\35\147\1\150\15\147"+
    "\1\200\3\147\1\203\1\152\1\147\53\201\1\202\3\201"+
    "\1\111\2\201\1\0\1\14\1\224\20\14\1\0\6\14"+
    "\5\0\2\14\41\0\1\225\42\0\21\14\1\226\1\0"+
    "\6\14\5\0\2\14\22\0\5\14\1\227\14\14\1\0"+
    "\6\14\5\0\2\14\22\0\14\14\1\230\5\14\1\0"+
    "\6\14\5\0\2\14\22\0\13\14\1\231\6\14\1\0"+
    "\6\14\5\0\2\14\22\0\11\14\1\232\10\14\1\0"+
    "\6\14\5\0\2\14\22\0\4\14\1\233\15\14\1\0"+
    "\6\14\5\0\2\14\22\0\17\14\1\234\2\14\1\0"+
    "\6\14\5\0\2\14\22\0\4\14\1\235\15\14\1\0"+
    "\6\14\5\0\2\14\22\0\13\14\1\236\6\14\1\0"+
    "\6\14\5\0\2\14\22\0\1\14\1\237\20\14\1\0"+
    "\6\14\5\0\2\14\21\0\7\177\1\240\25\177\1\0"+
    "\1\223\21\177\1\0\1\177\1\0\12\14\1\241\7\14"+
    "\1\0\6\14\5\0\2\14\26\0\1\242\55\0\7\14"+
    "\1\243\12\14\1\0\6\14\5\0\2\14\22\0\15\14"+
    "\1\244\4\14\1\0\6\14\5\0\2\14\22\0\16\14"+
    "\1\245\3\14\1\0\6\14\5\0\2\14\22\0\6\14"+
    "\1\246\13\14\1\0\6\14\5\0\2\14\22\0\12\14"+
    "\1\247\7\14\1\0\6\14\5\0\2\14\22\0\3\14"+
    "\1\250\16\14\1\0\6\14\5\0\2\14\22\0\11\14"+
    "\1\251\10\14\1\0\6\14\5\0\2\14\21\0\5\177"+
    "\1\252\27\177\1\0\1\223\21\177\1\0\1\177\1\0"+
    "\5\14\1\253\14\14\1\0\6\14\5\0\2\14\30\0"+
    "\1\254\53\0\6\14\1\255\13\14\1\0\6\14\5\0"+
    "\2\14\22\0\11\14\1\256\10\14\1\0\6\14\5\0"+
    "\2\14\22\0\10\14\1\257\11\14\1\0\6\14\5\0"+
    "\2\14\22\0\20\14\1\260\1\14\1\0\6\14\5\0"+
    "\2\14\21\0\33\177\1\261\1\177\1\0\1\223\21\177"+
    "\1\0\1\177\5\0\1\262\55\0\4\14\1\263\15\14"+
    "\1\0\6\14\5\0\2\14\22\0\4\14\1\264\15\14"+
    "\1\0\6\14\5\0\2\14\21\0\11\177\1\265\2\177"+
    "\1\265\20\177\1\0\1\223\21\177\1\0\1\177\23\0"+
    "\1\266\37\0\11\14\1\267\10\14\1\0\6\14\5\0"+
    "\2\14\21\0\11\177\1\270\2\177\1\270\20\177\1\0"+
    "\1\223\21\177\1\0\1\177\24\0\1\271\36\0\5\14"+
    "\1\272\14\14\1\0\6\14\5\0\2\14\26\0\1\273"+
    "\54\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6850];
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
    "\3\0\1\11\23\1\1\11\1\1\5\11\1\1\7\11"+
    "\4\1\1\11\30\1\3\0\1\11\1\0\1\11\1\0"+
    "\1\1\1\11\31\1\2\0\1\1\1\0\5\1\1\0"+
    "\17\1\4\0\4\1\1\0\13\1\1\0\1\1\1\0"+
    "\12\1\1\0\1\1\1\0\7\1\1\0\1\1\1\0"+
    "\5\1\1\0\3\1\1\0\2\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[187];
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
  LexerEn(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerEn(java.io.InputStream in) {
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
    while (i < 1752) {
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
        case 3: 
          { /* ignore */
          }
        case 51: break;
        case 11: 
          { return new ScriptureToken(ScriptureTokenType.EQUAL, null, yyline, yychar);
          }
        case 52: break;
        case 29: 
          { return new ScriptureToken(ScriptureTokenType.REAL_LITERAL, yytext(), yyline, yychar);
          }
        case 53: break;
        case 9: 
          { return new ScriptureToken(ScriptureTokenType.DELIMITER, null, yyline, yychar);
          }
        case 54: break;
        case 14: 
          { return new ScriptureToken(ScriptureTokenType.RIGHT_BRACKET, null, yyline, yychar);
          }
        case 55: break;
        case 35: 
          { return new ScriptureToken(ScriptureTokenType.FALSE, yytext(), yyline, yychar);
          }
        case 56: break;
        case 34: 
          { return new ScriptureToken(ScriptureTokenType.PRAY, yytext(), yyline, yychar);
          }
        case 57: break;
        case 17: 
          { return new ScriptureToken(ScriptureTokenType.MULTIPLICATION_OPERATOR, null, yyline, yychar);
          }
        case 58: break;
        case 30: 
          { return new ScriptureToken(ScriptureTokenType.AMEN, yytext(), yyline, yychar);
          }
        case 59: break;
        case 2: 
          { return new ScriptureToken(ScriptureTokenType.IDENTIFIER, yytext(), yyline, yychar);
          }
        case 60: break;
        case 10: 
          { return new ScriptureToken(ScriptureTokenType.SEMICOLON, null, yyline, yychar);
          }
        case 61: break;
        case 18: 
          { return new ScriptureToken(ScriptureTokenType.DIVISION_OPERATOR, yytext(), yyline, yychar);
          }
        case 62: break;
        case 32: 
          { return new ScriptureToken(ScriptureTokenType.TRUE, yytext(), yyline, yychar);
          }
        case 63: break;
        case 28: 
          { return new ScriptureToken(ScriptureTokenType.XOR, yytext(), yyline, yychar);
          }
        case 64: break;
        case 43: 
          { return new ScriptureToken(ScriptureTokenType.BOOLEAN, yytext(), yyline, yychar);
          }
        case 65: break;
        case 6: 
          { return new ScriptureToken(ScriptureTokenType.LEFT_PARENTHESIS, null, yyline, yychar);
          }
        case 66: break;
        case 23: 
          { return new ScriptureToken(ScriptureTokenType.IF, yytext(), yyline, yychar);
          }
        case 67: break;
        case 16: 
          { return new ScriptureToken(ScriptureTokenType.SUBTRACTION_OPERATOR, null, yyline, yychar);
          }
        case 68: break;
        case 7: 
          { return new ScriptureToken(ScriptureTokenType.RIGHT_PARENTHESIS, null, yyline, yychar);
          }
        case 69: break;
        case 31: 
          { return new ScriptureToken(ScriptureTokenType.ELSE, yytext(), yyline, yychar);
          }
        case 70: break;
        case 21: 
          { stringLiteralBuffer.append(yytext()); yybegin(YYINITIAL); return new ScriptureToken(ScriptureTokenType.STRING_LITERAL, stringLiteralBuffer.toString(), yyline, yychar);
          }
        case 71: break;
        case 49: 
          { return new ScriptureToken(ScriptureTokenType.COMMANDMENT, yytext(), yyline, yychar);
          }
        case 72: break;
        case 44: 
          { return new ScriptureToken(ScriptureTokenType.ARTIFACT, yytext(), yyline, yychar);
          }
        case 73: break;
        case 5: 
          { return new ScriptureToken(ScriptureTokenType.DOT, null, yyline, yychar);
          }
        case 74: break;
        case 4: 
          { return new ScriptureToken(ScriptureTokenType.INTEGER_LITERAL, yytext(), yyline, yychar);
          }
        case 75: break;
        case 48: 
          { return new ScriptureToken(ScriptureTokenType.SCRIPTURE, yytext(), yyline, yychar);
          }
        case 76: break;
        case 24: 
          { return new ScriptureToken(ScriptureTokenType.OF, yytext(), yyline, yychar);
          }
        case 77: break;
        case 38: 
          { return new ScriptureToken(ScriptureTokenType.STRING, yytext(), yyline, yychar);
          }
        case 78: break;
        case 47: 
          { return new ScriptureToken(ScriptureTokenType.REGEXP_LITERAL, yytext(), yyline, yychar);
          }
        case 79: break;
        case 25: 
          { return new ScriptureToken(ScriptureTokenType.OR, yytext(), yyline, yychar);
          }
        case 80: break;
        case 36: 
          { return new ScriptureToken(ScriptureTokenType.ALIAS, yytext(), yyline, yychar);
          }
        case 81: break;
        case 50: 
          { return new ScriptureToken(ScriptureTokenType.CREATE, yytext(), yyline, yychar);
          }
        case 82: break;
        case 22: 
          { stringLiteralBuffer.append('\\');
          }
        case 83: break;
        case 27: 
          { return new ScriptureToken(ScriptureTokenType.NOT, yytext(), yyline, yychar);
          }
        case 84: break;
        case 45: 
          { return new ScriptureToken(ScriptureTokenType.CREATION, yytext(), yyline, yychar);
          }
        case 85: break;
        case 15: 
          { return new ScriptureToken(ScriptureTokenType.ADDITION_OPERATOR, null, yyline, yychar);
          }
        case 86: break;
        case 42: 
          { return new ScriptureToken(ScriptureTokenType.GENESIS, yytext(), yyline, yychar);
          }
        case 87: break;
        case 41: 
          { return new ScriptureToken(ScriptureTokenType.INTEGER, yytext(), yyline, yychar);
          }
        case 88: break;
        case 33: 
          { return new ScriptureToken(ScriptureTokenType.REAL, yytext(), yyline, yychar);
          }
        case 89: break;
        case 12: 
          { return new ScriptureToken(ScriptureTokenType.COMMA, null, yyline, yychar);
          }
        case 90: break;
        case 20: 
          { stringLiteralBuffer.append(yytext());
          }
        case 91: break;
        case 46: 
          { return new ScriptureToken(ScriptureTokenType.PROPHECY, yytext(), yyline, yychar);
          }
        case 92: break;
        case 39: 
          { return new ScriptureToken(ScriptureTokenType.REGEXP, yytext(), yyline, yychar);
          }
        case 93: break;
        case 26: 
          { return new ScriptureToken(ScriptureTokenType.AND, yytext(), yyline, yychar);
          }
        case 94: break;
        case 8: 
          { stringLiteralBuffer.setLength(0); stringLiteralBuffer.append(yytext()); yybegin(STRING);
          }
        case 95: break;
        case 19: 
          { return new ScriptureToken(ScriptureTokenType.COMPARATIVE_OPERATOR, yytext(), yyline, yychar);
          }
        case 96: break;
        case 40: 
          { return new ScriptureToken(ScriptureTokenType.PREACH, yytext(), yyline, yychar);
          }
        case 97: break;
        case 1: 
          { throw new ScriptureLexerException(yytext(), yyline, yychar);
          }
        case 98: break;
        case 37: 
          { return new ScriptureToken(ScriptureTokenType.ORDER, yytext(), yyline, yychar);
          }
        case 99: break;
        case 13: 
          { return new ScriptureToken(ScriptureTokenType.LEFT_BRACKET, null, yyline, yychar);
          }
        case 100: break;
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
