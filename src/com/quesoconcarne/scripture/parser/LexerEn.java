/* The following code was generated by JFlex 1.4.3 on 9/12/09 6:39 PM */

package com.quesoconcarne.scripture.parser;

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
    "\11\40\1\54\1\35\1\0\1\54\1\53\16\40\4\0\1\23\1\50"+
    "\1\41\1\52\1\37\1\46\2\0\1\34\1\36\1\45\1\43\1\0"+
    "\1\44\1\32\1\46\1\27\11\31\2\0\1\51\1\47\1\51\1\0"+
    "\1\33\6\30\24\37\1\0\1\42\2\0\1\37\1\0\1\2\1\24"+
    "\1\13\1\17\1\5\1\1\1\22\1\20\1\14\2\37\1\3\1\11"+
    "\1\12\1\16\1\15\1\37\1\7\1\4\1\6\1\10\2\37\1\25"+
    "\1\21\1\37\4\0\41\40\2\0\4\37\4\0\1\37\2\0\1\40"+
    "\7\0\1\37\4\0\1\37\5\0\27\37\1\0\37\37\1\0\u013f\37"+
    "\31\0\162\37\4\0\14\37\16\0\5\37\11\0\1\37\21\0\130\40"+
    "\5\0\23\40\12\0\1\37\13\0\1\37\1\0\3\37\1\0\1\37"+
    "\1\0\24\37\1\0\54\37\1\0\46\37\1\0\5\37\4\0\202\37"+
    "\1\0\4\40\3\0\105\37\1\0\46\37\2\0\2\37\6\0\20\37"+
    "\41\0\46\37\2\0\1\37\7\0\47\37\11\0\21\40\1\0\27\40"+
    "\1\0\3\40\1\0\1\40\1\0\2\40\1\0\1\40\13\0\33\37"+
    "\5\0\3\37\15\0\4\40\14\0\6\40\13\0\32\37\5\0\13\37"+
    "\16\40\7\0\12\26\4\0\2\37\1\40\143\37\1\0\1\37\10\40"+
    "\1\0\6\40\2\37\2\40\1\0\4\40\2\37\12\26\3\37\2\0"+
    "\1\37\17\0\1\40\1\37\1\40\36\37\33\40\2\0\3\37\60\0"+
    "\46\37\13\40\1\37\u014f\0\3\40\66\37\2\0\1\40\1\37\20\40"+
    "\2\0\1\37\4\40\3\0\12\37\2\40\2\0\12\26\21\0\3\40"+
    "\1\0\10\37\2\0\2\37\2\0\26\37\1\0\7\37\1\0\1\37"+
    "\3\0\4\37\2\0\1\40\1\37\7\40\2\0\2\40\2\0\3\40"+
    "\11\0\1\40\4\0\2\37\1\0\3\37\2\40\2\0\12\26\4\37"+
    "\15\0\3\40\1\0\6\37\4\0\2\37\2\0\26\37\1\0\7\37"+
    "\1\0\2\37\1\0\2\37\1\0\2\37\2\0\1\40\1\0\5\40"+
    "\4\0\2\40\2\0\3\40\13\0\4\37\1\0\1\37\7\0\12\26"+
    "\2\40\3\37\14\0\3\40\1\0\11\37\1\0\3\37\1\0\26\37"+
    "\1\0\7\37\1\0\2\37\1\0\5\37\2\0\1\40\1\37\10\40"+
    "\1\0\3\40\1\0\3\40\2\0\1\37\17\0\2\37\2\40\2\0"+
    "\12\26\1\0\1\37\17\0\3\40\1\0\10\37\2\0\2\37\2\0"+
    "\26\37\1\0\7\37\1\0\2\37\1\0\5\37\2\0\1\40\1\37"+
    "\6\40\3\0\2\40\2\0\3\40\10\0\2\40\4\0\2\37\1\0"+
    "\3\37\4\0\12\26\1\0\1\37\20\0\1\40\1\37\1\0\6\37"+
    "\3\0\3\37\1\0\4\37\3\0\2\37\1\0\1\37\1\0\2\37"+
    "\3\0\2\37\3\0\3\37\3\0\10\37\1\0\3\37\4\0\5\40"+
    "\3\0\3\40\1\0\4\40\11\0\1\40\17\0\11\26\11\0\1\37"+
    "\7\0\3\40\1\0\10\37\1\0\3\37\1\0\27\37\1\0\12\37"+
    "\1\0\5\37\4\0\7\40\1\0\3\40\1\0\4\40\7\0\2\40"+
    "\11\0\2\37\4\0\12\26\22\0\2\40\1\0\10\37\1\0\3\37"+
    "\1\0\27\37\1\0\12\37\1\0\5\37\2\0\1\40\1\37\7\40"+
    "\1\0\3\40\1\0\4\40\7\0\2\40\7\0\1\37\1\0\2\37"+
    "\4\0\12\26\22\0\2\40\1\0\10\37\1\0\3\37\1\0\27\37"+
    "\1\0\20\37\4\0\6\40\2\0\3\40\1\0\4\40\11\0\1\40"+
    "\10\0\2\37\4\0\12\26\22\0\2\40\1\0\22\37\3\0\30\37"+
    "\1\0\11\37\1\0\1\37\2\0\7\37\3\0\1\40\4\0\6\40"+
    "\1\0\1\40\1\0\10\40\22\0\2\40\15\0\60\37\1\40\2\37"+
    "\7\40\4\0\10\37\10\40\1\0\12\26\47\0\2\37\1\0\1\37"+
    "\2\0\2\37\1\0\1\37\2\0\1\37\6\0\4\37\1\0\7\37"+
    "\1\0\3\37\1\0\1\37\1\0\1\37\2\0\2\37\1\0\4\37"+
    "\1\40\2\37\6\40\1\0\2\40\1\37\2\0\5\37\1\0\1\37"+
    "\1\0\6\40\2\0\12\26\2\0\2\37\42\0\1\37\27\0\2\40"+
    "\6\0\12\26\13\0\1\40\1\0\1\40\1\0\1\40\4\0\2\40"+
    "\10\37\1\0\42\37\6\0\24\40\1\0\2\40\4\37\4\0\10\40"+
    "\1\0\44\40\11\0\1\40\71\0\42\37\1\0\5\37\1\0\2\37"+
    "\1\0\7\40\3\0\4\40\6\0\12\26\6\0\6\37\4\40\106\0"+
    "\46\37\12\0\51\37\7\0\132\37\5\0\104\37\5\0\122\37\6\0"+
    "\7\37\1\0\77\37\1\0\1\37\1\0\4\37\2\0\7\37\1\0"+
    "\1\37\1\0\4\37\2\0\47\37\1\0\1\37\1\0\4\37\2\0"+
    "\37\37\1\0\1\37\1\0\4\37\2\0\7\37\1\0\1\37\1\0"+
    "\4\37\2\0\7\37\1\0\7\37\1\0\27\37\1\0\37\37\1\0"+
    "\1\37\1\0\4\37\2\0\7\37\1\0\47\37\1\0\23\37\16\0"+
    "\11\26\56\0\125\37\14\0\u026c\37\2\0\10\37\12\0\32\37\5\0"+
    "\113\37\3\0\3\37\17\0\15\37\1\0\4\37\3\40\13\0\22\37"+
    "\3\40\13\0\22\37\2\40\14\0\15\37\1\0\3\37\1\0\2\40"+
    "\14\0\64\37\40\40\3\0\1\37\3\0\2\37\1\40\2\0\12\26"+
    "\41\0\3\40\2\0\12\26\6\0\130\37\10\0\51\37\1\40\126\0"+
    "\35\37\3\0\14\40\4\0\14\40\12\0\12\26\36\37\2\0\5\37"+
    "\u038b\0\154\37\224\0\234\37\4\0\132\37\6\0\26\37\2\0\6\37"+
    "\2\0\46\37\2\0\6\37\2\0\10\37\1\0\1\37\1\0\1\37"+
    "\1\0\1\37\1\0\37\37\2\0\65\37\1\0\7\37\1\0\1\37"+
    "\3\0\3\37\1\0\7\37\3\0\4\37\2\0\6\37\4\0\15\37"+
    "\5\0\3\37\1\0\7\37\17\0\4\40\32\0\5\40\20\0\2\37"+
    "\23\0\1\37\13\0\4\40\6\0\6\40\1\0\1\37\15\0\1\37"+
    "\40\0\22\37\36\0\15\40\4\0\1\40\3\0\6\40\27\0\1\37"+
    "\4\0\1\37\2\0\12\37\1\0\1\37\3\0\5\37\6\0\1\37"+
    "\1\0\1\37\1\0\1\37\1\0\4\37\1\0\3\37\1\0\7\37"+
    "\3\0\3\37\5\0\5\37\26\0\44\37\u0e81\0\3\37\31\0\11\37"+
    "\6\40\1\0\5\37\2\0\5\37\4\0\126\37\2\0\2\40\2\0"+
    "\3\37\1\0\137\37\5\0\50\37\4\0\136\37\21\0\30\37\70\0"+
    "\20\37\u0200\0\u19b6\37\112\0\u51a6\37\132\0\u048d\37\u0773\0\u2ba4\37\u215c\0"+
    "\u012e\37\2\0\73\37\225\0\7\37\14\0\5\37\5\0\1\37\1\40"+
    "\12\37\1\0\15\37\1\0\5\37\1\0\1\37\1\0\2\37\1\0"+
    "\2\37\1\0\154\37\41\0\u016b\37\22\0\100\37\2\0\66\37\50\0"+
    "\15\37\3\0\20\40\20\0\4\40\17\0\2\37\30\0\3\37\31\0"+
    "\1\37\6\0\5\37\1\0\207\37\2\0\1\40\4\0\1\37\13\0"+
    "\12\26\7\0\32\37\4\0\1\37\1\0\32\37\12\0\132\37\3\0"+
    "\6\37\2\0\6\37\2\0\6\37\2\0\3\37\3\0\2\37\3\0"+
    "\2\37\22\0\3\40\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\16\2\1\3\2\2\2\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\1\1\12\1\1\1\13"+
    "\1\14\1\15\17\2\1\16\2\2\1\17\1\20\3\2"+
    "\3\0\1\12\1\0\1\3\1\0\1\3\1\13\4\2"+
    "\1\21\4\2\1\12\3\2\1\22\11\2\1\23\1\24"+
    "\1\4\2\0\1\3\1\0\1\3\3\2\1\25\1\0"+
    "\2\2\1\26\1\27\1\30\4\2\1\31\5\2\4\0"+
    "\1\3\1\32\1\33\1\2\1\0\10\2\1\34\2\2"+
    "\1\0\1\2\1\0\1\35\1\2\1\36\3\2\1\37"+
    "\3\2\1\0\1\2\1\0\3\2\1\40\1\2\1\41"+
    "\1\42\1\0\1\43\1\0\1\2\1\44\1\2\1\45"+
    "\1\46\1\0\1\47\1\2\1\46\1\0\1\2\1\46"+
    "\1\0\1\50\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[179];
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
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\u02a3"+
    "\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1\0\u03de\0\u040b"+
    "\0\207\0\207\0\207\0\207\0\207\0\u0438\0\u0438\0\u0465"+
    "\0\u0492\0\207\0\u04bf\0\u04ec\0\u0519\0\u0546\0\u0573\0\u05a0"+
    "\0\u05cd\0\u05fa\0\u0627\0\u0654\0\u0681\0\u06ae\0\u06db\0\u0708"+
    "\0\u0735\0\u0762\0\u01ef\0\u078f\0\u07bc\0\u01ef\0\u07e9\0\u0816"+
    "\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7\0\207\0\u0924\0\207"+
    "\0\u0951\0\u097e\0\207\0\u09ab\0\u09d8\0\u0a05\0\u0a32\0\u01ef"+
    "\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\u01ef\0\u0b13\0\u0b40\0\u0b6d"+
    "\0\u01ef\0\u0b9a\0\u0bc7\0\u0bf4\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8"+
    "\0\u0cd5\0\u0d02\0\u01ef\0\u089d\0\u08ca\0\u0d2f\0\u0d5c\0\u0d89"+
    "\0\u0db6\0\u0de3\0\u0e10\0\u0e3d\0\u0e6a\0\u01ef\0\u0e97\0\u0ec4"+
    "\0\u0ef1\0\u01ef\0\u01ef\0\u01ef\0\u0f1e\0\u0f4b\0\u0f78\0\u0fa5"+
    "\0\u01ef\0\u0fd2\0\u0fff\0\u102c\0\u1059\0\u1086\0\u10b3\0\u10e0"+
    "\0\u0d89\0\u110d\0\u0924\0\u01ef\0\u01ef\0\u113a\0\u1167\0\u1194"+
    "\0\u11c1\0\u11ee\0\u121b\0\u1248\0\u1275\0\u12a2\0\u12cf\0\u01ef"+
    "\0\u12fc\0\u1329\0\u1356\0\u1383\0\u13b0\0\u01ef\0\u13dd\0\u01ef"+
    "\0\u140a\0\u1437\0\u1464\0\u01ef\0\u1491\0\u14be\0\u14eb\0\u1518"+
    "\0\u1545\0\u1572\0\u159f\0\u15cc\0\u15f9\0\u01ef\0\u1626\0\u01ef"+
    "\0\u01ef\0\u1653\0\u01ef\0\u1680\0\u16ad\0\u01ef\0\u16da\0\u01ef"+
    "\0\u1707\0\u1734\0\u01ef\0\u1761\0\u178e\0\u17bb\0\u17e8\0\u10b3"+
    "\0\u1815\0\u01ef\0\207";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[179];
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
    "\1\23\1\24\1\25\1\26\1\27\1\14\1\26\1\4"+
    "\1\30\1\4\1\23\1\4\1\14\1\4\1\31\1\4"+
    "\1\32\1\33\1\34\1\35\2\36\1\37\1\40\2\23"+
    "\35\41\1\4\3\41\1\42\1\43\10\41\1\4\1\41"+
    "\55\4\56\0\1\14\1\44\20\14\1\0\6\14\5\0"+
    "\2\14\15\0\2\14\1\45\3\14\1\46\1\14\1\47"+
    "\1\50\10\14\1\0\6\14\5\0\2\14\15\0\4\14"+
    "\1\51\15\14\1\0\6\14\5\0\2\14\15\0\5\14"+
    "\1\52\4\14\1\53\7\14\1\0\6\14\5\0\2\14"+
    "\15\0\2\14\1\54\1\55\16\14\1\0\6\14\5\0"+
    "\2\14\15\0\6\14\1\56\13\14\1\0\6\14\5\0"+
    "\2\14\15\0\4\14\1\57\15\14\1\0\6\14\5\0"+
    "\2\14\15\0\22\14\1\0\6\14\5\0\2\14\15\0"+
    "\15\14\1\60\4\14\1\0\6\14\5\0\2\14\15\0"+
    "\6\14\1\61\6\14\1\62\4\14\1\0\6\14\5\0"+
    "\2\14\15\0\1\63\10\14\1\64\10\14\1\0\6\14"+
    "\5\0\2\14\15\0\6\14\1\65\13\14\1\0\6\14"+
    "\5\0\2\14\15\0\1\66\5\14\1\67\13\14\1\0"+
    "\6\14\5\0\2\14\15\0\4\14\1\70\15\14\1\0"+
    "\6\14\5\0\2\14\37\0\1\23\11\0\1\23\15\0"+
    "\2\23\1\0\15\14\1\71\4\14\1\0\6\14\5\0"+
    "\2\14\15\0\15\14\1\72\4\14\1\0\6\14\5\0"+
    "\2\14\42\0\2\26\1\0\1\26\1\73\47\0\1\74"+
    "\2\26\1\0\1\26\1\73\31\0\1\75\114\0\1\76"+
    "\5\0\35\77\1\100\7\77\1\101\5\77\1\102\1\77"+
    "\35\41\1\0\3\41\2\0\10\41\1\0\1\41\41\0"+
    "\1\103\14\0\2\14\1\104\17\14\1\0\6\14\5\0"+
    "\2\14\15\0\13\14\1\105\6\14\1\0\6\14\5\0"+
    "\2\14\15\0\5\14\1\106\14\14\1\0\6\14\5\0"+
    "\2\14\15\0\4\14\1\107\15\14\1\0\6\14\5\0"+
    "\2\14\15\0\16\14\1\110\3\14\1\0\6\14\5\0"+
    "\2\14\15\0\5\14\1\111\14\14\1\0\6\14\5\0"+
    "\2\14\15\0\6\14\1\112\13\14\1\0\6\14\5\0"+
    "\2\14\15\0\6\14\1\113\13\14\1\0\6\14\5\0"+
    "\2\14\15\0\3\14\1\114\16\14\1\0\6\14\5\0"+
    "\2\14\15\0\5\14\1\115\14\14\1\0\6\14\5\0"+
    "\2\14\15\0\7\14\1\116\12\14\1\0\6\14\5\0"+
    "\2\14\15\0\1\14\1\117\17\14\1\120\1\0\6\14"+
    "\5\0\2\14\15\0\5\14\1\121\14\14\1\0\6\14"+
    "\5\0\2\14\15\0\4\14\1\122\15\14\1\0\6\14"+
    "\5\0\2\14\15\0\10\14\1\123\11\14\1\0\6\14"+
    "\5\0\2\14\15\0\5\14\1\124\14\14\1\0\6\14"+
    "\5\0\2\14\15\0\1\14\1\125\2\14\1\126\10\14"+
    "\1\127\4\14\1\0\6\14\5\0\2\14\15\0\16\14"+
    "\1\130\3\14\1\0\6\14\5\0\2\14\15\0\11\14"+
    "\1\131\10\14\1\0\6\14\5\0\2\14\15\0\15\14"+
    "\1\132\4\14\1\0\6\14\5\0\2\14\15\0\6\14"+
    "\1\133\13\14\1\0\6\14\5\0\2\14\42\0\2\134"+
    "\1\0\1\134\24\0\2\135\2\0\1\135\5\0\1\135"+
    "\3\0\1\135\4\0\1\135\2\0\3\135\30\0\1\136"+
    "\47\0\35\77\1\100\15\77\1\102\1\77\35\137\1\140"+
    "\7\137\1\141\5\137\1\142\1\137\35\0\1\100\20\0"+
    "\3\14\1\143\16\14\1\0\6\14\5\0\2\14\15\0"+
    "\1\14\1\144\20\14\1\0\6\14\5\0\2\14\15\0"+
    "\13\14\1\145\6\14\1\0\6\14\5\0\2\14\15\0"+
    "\11\14\1\146\10\14\1\0\6\14\5\0\2\14\15\0"+
    "\22\14\1\147\6\14\5\0\2\14\15\0\13\14\1\150"+
    "\6\14\1\0\6\14\5\0\2\14\15\0\13\14\1\151"+
    "\6\14\1\0\6\14\5\0\2\14\15\0\4\14\1\152"+
    "\15\14\1\0\6\14\5\0\2\14\15\0\4\14\1\153"+
    "\15\14\1\0\6\14\5\0\2\14\15\0\2\14\1\154"+
    "\17\14\1\0\6\14\5\0\2\14\15\0\4\14\1\155"+
    "\15\14\1\0\6\14\5\0\2\14\15\0\1\14\1\156"+
    "\20\14\1\0\6\14\5\0\2\14\15\0\10\14\1\157"+
    "\11\14\1\0\6\14\5\0\2\14\15\0\4\14\1\160"+
    "\15\14\1\0\6\14\5\0\2\14\15\0\20\14\1\161"+
    "\1\14\1\0\6\14\5\0\2\14\15\0\1\14\1\162"+
    "\20\14\1\0\6\14\5\0\2\14\15\0\14\14\1\163"+
    "\5\14\1\0\6\14\5\0\2\14\15\0\4\14\1\164"+
    "\15\14\1\0\6\14\5\0\2\14\15\0\4\14\1\165"+
    "\15\14\1\0\6\14\5\0\2\14\15\0\2\14\1\166"+
    "\17\14\1\0\6\14\5\0\2\14\50\0\1\167\20\0"+
    "\35\137\1\140\7\137\1\170\5\137\1\142\1\137\45\171"+
    "\1\172\7\171\35\77\1\100\7\77\1\141\4\77\1\173"+
    "\1\102\1\77\35\171\1\140\7\171\1\172\7\171\1\0"+
    "\4\14\1\174\15\14\1\0\6\14\5\0\2\14\15\0"+
    "\3\14\1\175\16\14\1\0\6\14\5\0\2\14\15\0"+
    "\1\176\21\14\1\0\6\14\5\0\2\14\22\0\1\177"+
    "\47\0\11\14\1\200\10\14\1\0\6\14\5\0\2\14"+
    "\15\0\14\14\1\201\5\14\1\0\6\14\5\0\2\14"+
    "\15\0\22\14\1\0\1\14\1\202\4\14\5\0\2\14"+
    "\15\0\5\14\1\203\14\14\1\0\6\14\5\0\2\14"+
    "\15\0\1\14\1\204\20\14\1\0\6\14\5\0\2\14"+
    "\15\0\21\14\1\205\1\0\6\14\5\0\2\14\15\0"+
    "\12\14\1\206\7\14\1\0\6\14\5\0\2\14\15\0"+
    "\17\14\1\207\2\14\1\0\6\14\5\0\2\14\15\0"+
    "\6\14\1\210\13\14\1\0\6\14\5\0\2\14\15\0"+
    "\3\14\1\211\16\14\1\0\6\14\5\0\2\14\15\0"+
    "\4\14\1\212\15\14\1\0\6\14\5\0\2\14\14\0"+
    "\35\167\1\0\1\213\14\167\1\0\1\167\35\137\1\140"+
    "\7\137\1\170\4\137\1\173\1\142\1\137\45\171\1\172"+
    "\4\171\1\100\2\171\1\0\1\14\1\214\20\14\1\0"+
    "\6\14\5\0\2\14\34\0\1\215\35\0\21\14\1\216"+
    "\1\0\6\14\5\0\2\14\15\0\5\14\1\217\14\14"+
    "\1\0\6\14\5\0\2\14\15\0\14\14\1\220\5\14"+
    "\1\0\6\14\5\0\2\14\15\0\13\14\1\221\6\14"+
    "\1\0\6\14\5\0\2\14\15\0\11\14\1\222\10\14"+
    "\1\0\6\14\5\0\2\14\15\0\4\14\1\223\15\14"+
    "\1\0\6\14\5\0\2\14\15\0\17\14\1\224\2\14"+
    "\1\0\6\14\5\0\2\14\15\0\4\14\1\225\15\14"+
    "\1\0\6\14\5\0\2\14\15\0\13\14\1\226\6\14"+
    "\1\0\6\14\5\0\2\14\15\0\1\14\1\227\20\14"+
    "\1\0\6\14\5\0\2\14\14\0\7\167\1\230\25\167"+
    "\1\0\1\213\14\167\1\0\1\167\1\0\12\14\1\231"+
    "\7\14\1\0\6\14\5\0\2\14\21\0\1\232\50\0"+
    "\7\14\1\233\12\14\1\0\6\14\5\0\2\14\15\0"+
    "\15\14\1\234\4\14\1\0\6\14\5\0\2\14\15\0"+
    "\16\14\1\235\3\14\1\0\6\14\5\0\2\14\15\0"+
    "\6\14\1\236\13\14\1\0\6\14\5\0\2\14\15\0"+
    "\12\14\1\237\7\14\1\0\6\14\5\0\2\14\15\0"+
    "\3\14\1\240\16\14\1\0\6\14\5\0\2\14\15\0"+
    "\11\14\1\241\10\14\1\0\6\14\5\0\2\14\14\0"+
    "\5\167\1\242\27\167\1\0\1\213\14\167\1\0\1\167"+
    "\1\0\5\14\1\243\14\14\1\0\6\14\5\0\2\14"+
    "\23\0\1\244\46\0\6\14\1\245\13\14\1\0\6\14"+
    "\5\0\2\14\15\0\11\14\1\246\10\14\1\0\6\14"+
    "\5\0\2\14\15\0\10\14\1\247\11\14\1\0\6\14"+
    "\5\0\2\14\15\0\20\14\1\250\1\14\1\0\6\14"+
    "\5\0\2\14\14\0\33\167\1\251\1\167\1\0\1\213"+
    "\14\167\1\0\1\167\5\0\1\252\50\0\4\14\1\253"+
    "\15\14\1\0\6\14\5\0\2\14\15\0\4\14\1\254"+
    "\15\14\1\0\6\14\5\0\2\14\14\0\11\167\1\255"+
    "\2\167\1\255\20\167\1\0\1\213\14\167\1\0\1\167"+
    "\23\0\1\256\32\0\11\14\1\257\10\14\1\0\6\14"+
    "\5\0\2\14\14\0\11\167\1\260\2\167\1\260\20\167"+
    "\1\0\1\213\14\167\1\0\1\167\24\0\1\261\31\0"+
    "\5\14\1\262\14\14\1\0\6\14\5\0\2\14\21\0"+
    "\1\263\47\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6210];
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
    "\3\0\1\11\24\1\5\11\4\1\1\11\30\1\3\0"+
    "\1\11\1\0\1\11\1\0\1\1\1\11\32\1\2\0"+
    "\1\1\1\0\5\1\1\0\17\1\4\0\4\1\1\0"+
    "\13\1\1\0\1\1\1\0\12\1\1\0\1\1\1\0"+
    "\7\1\1\0\1\1\1\0\5\1\1\0\3\1\1\0"+
    "\2\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[179];
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
    while (i < 1748) {
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
        case 42: break;
        case 20: 
          { return new ScriptureToken(ScriptureTokenType.REAL_LITERAL, yytext(), yyline, yychar);
          }
        case 43: break;
        case 26: 
          { return new ScriptureToken(ScriptureTokenType.FALSE, yytext(), yyline, yychar);
          }
        case 44: break;
        case 25: 
          { return new ScriptureToken(ScriptureTokenType.PRAY, yytext(), yyline, yychar);
          }
        case 45: break;
        case 8: 
          { return new ScriptureToken(ScriptureTokenType.MULTIPLICATION_OPERATOR, null, yyline, yychar);
          }
        case 46: break;
        case 21: 
          { return new ScriptureToken(ScriptureTokenType.AMEN, yytext(), yyline, yychar);
          }
        case 47: break;
        case 2: 
          { return new ScriptureToken(ScriptureTokenType.IDENTIFIER, yytext(), yyline, yychar);
          }
        case 48: break;
        case 9: 
          { return new ScriptureToken(ScriptureTokenType.DIVISION_OPERATOR, yytext(), yyline, yychar);
          }
        case 49: break;
        case 23: 
          { return new ScriptureToken(ScriptureTokenType.TRUE, yytext(), yyline, yychar);
          }
        case 50: break;
        case 19: 
          { return new ScriptureToken(ScriptureTokenType.XOR, yytext(), yyline, yychar);
          }
        case 51: break;
        case 34: 
          { return new ScriptureToken(ScriptureTokenType.BOOLEAN, yytext(), yyline, yychar);
          }
        case 52: break;
        case 14: 
          { return new ScriptureToken(ScriptureTokenType.IF, yytext(), yyline, yychar);
          }
        case 53: break;
        case 7: 
          { return new ScriptureToken(ScriptureTokenType.SUBTRACTION_OPERATOR, null, yyline, yychar);
          }
        case 54: break;
        case 22: 
          { return new ScriptureToken(ScriptureTokenType.ELSE, yytext(), yyline, yychar);
          }
        case 55: break;
        case 12: 
          { stringLiteralBuffer.append(yytext()); yybegin(YYINITIAL); return new ScriptureToken(ScriptureTokenType.STRING_LITERAL, stringLiteralBuffer.toString(), yyline, yychar);
          }
        case 56: break;
        case 40: 
          { return new ScriptureToken(ScriptureTokenType.COMMANDMENT, yytext(), yyline, yychar);
          }
        case 57: break;
        case 35: 
          { return new ScriptureToken(ScriptureTokenType.ARTIFACT, yytext(), yyline, yychar);
          }
        case 58: break;
        case 4: 
          { return new ScriptureToken(ScriptureTokenType.INTEGER_LITERAL, yytext(), yyline, yychar);
          }
        case 59: break;
        case 39: 
          { return new ScriptureToken(ScriptureTokenType.SCRIPTURE, yytext(), yyline, yychar);
          }
        case 60: break;
        case 15: 
          { return new ScriptureToken(ScriptureTokenType.OF, yytext(), yyline, yychar);
          }
        case 61: break;
        case 29: 
          { return new ScriptureToken(ScriptureTokenType.STRING, yytext(), yyline, yychar);
          }
        case 62: break;
        case 38: 
          { return new ScriptureToken(ScriptureTokenType.REGEXP_LITERAL, yytext(), yyline, yychar);
          }
        case 63: break;
        case 16: 
          { return new ScriptureToken(ScriptureTokenType.OR, yytext(), yyline, yychar);
          }
        case 64: break;
        case 27: 
          { return new ScriptureToken(ScriptureTokenType.ALIAS, yytext(), yyline, yychar);
          }
        case 65: break;
        case 41: 
          { return new ScriptureToken(ScriptureTokenType.CREATE, yytext(), yyline, yychar);
          }
        case 66: break;
        case 13: 
          { stringLiteralBuffer.append('\\');
          }
        case 67: break;
        case 18: 
          { return new ScriptureToken(ScriptureTokenType.NOT, yytext(), yyline, yychar);
          }
        case 68: break;
        case 36: 
          { return new ScriptureToken(ScriptureTokenType.CREATION, yytext(), yyline, yychar);
          }
        case 69: break;
        case 6: 
          { return new ScriptureToken(ScriptureTokenType.ADDITION_OPERATOR, null, yyline, yychar);
          }
        case 70: break;
        case 33: 
          { return new ScriptureToken(ScriptureTokenType.GENESIS, yytext(), yyline, yychar);
          }
        case 71: break;
        case 32: 
          { return new ScriptureToken(ScriptureTokenType.INTEGER, yytext(), yyline, yychar);
          }
        case 72: break;
        case 24: 
          { return new ScriptureToken(ScriptureTokenType.REAL, yytext(), yyline, yychar);
          }
        case 73: break;
        case 11: 
          { stringLiteralBuffer.append(yytext());
          }
        case 74: break;
        case 37: 
          { return new ScriptureToken(ScriptureTokenType.PROPHECY, yytext(), yyline, yychar);
          }
        case 75: break;
        case 30: 
          { return new ScriptureToken(ScriptureTokenType.REGEXP, yytext(), yyline, yychar);
          }
        case 76: break;
        case 17: 
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
        case 1: 
          { throw new ScriptureLexerException(yytext(), yyline, yychar);
          }
        case 80: break;
        case 31: 
          { return new ScriptureToken(ScriptureTokenType.PREACH, yytext(), yyline, yychar);
          }
        case 81: break;
        case 28: 
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
