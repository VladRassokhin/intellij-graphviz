/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.intellij.plugins.graphviz;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.intellij.plugins.graphviz.GraphvizElementTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_GraphvizLexer.flex</tt>
 */
public class _GraphvizLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 13632 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\11\1\33\1\34\2\11\1\14\1\35\3\11\1\36\10\11\1\37\1\40\20\11\1\41\2\11"+
    "\1\42\5\11\1\43\4\11\1\44\1\45\4\11\51\14\1\46\3\14\1\47\1\50\4\14\1\51\12"+
    "\11\1\52\u0381\11");

  /* The ZZ_CMAP_Y table has 2752 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\1\6\1\7\1\1\1\10\1\11\1\12\1\13\1\12\1\13\34"+
    "\12\1\14\1\15\1\16\10\1\1\17\1\20\1\12\1\21\4\12\1\22\10\12\1\23\12\12\1\24"+
    "\1\12\1\25\1\24\1\12\1\26\4\1\1\12\1\27\1\30\2\1\2\12\1\27\1\1\1\31\1\24\5"+
    "\12\1\32\1\33\1\34\1\1\1\35\1\12\1\1\1\36\5\12\1\37\1\40\1\41\1\12\1\27\1"+
    "\42\1\12\1\43\1\44\1\1\1\12\1\45\4\1\1\12\1\46\4\1\1\47\2\12\1\50\1\1\1\51"+
    "\1\15\1\24\1\52\1\53\1\54\1\55\1\56\1\57\2\15\1\60\1\53\1\54\1\61\1\1\1\62"+
    "\1\1\1\63\1\64\1\21\1\54\1\65\1\1\1\66\1\15\1\67\1\70\1\53\1\54\1\65\1\1\1"+
    "\57\1\15\1\40\1\71\1\72\1\73\1\74\1\1\1\66\2\1\1\75\1\35\1\54\1\50\1\1\1\76"+
    "\1\15\1\1\1\75\1\35\1\54\1\77\1\1\1\56\1\15\1\100\1\75\1\35\1\12\1\101\1\56"+
    "\1\102\1\15\1\41\1\103\1\104\1\12\1\105\1\106\3\1\1\24\2\12\1\107\1\106\3"+
    "\1\1\110\1\111\1\112\1\113\1\114\1\115\2\1\1\66\3\1\1\116\1\12\1\117\1\1\1"+
    "\120\7\1\2\12\1\27\1\102\1\1\1\121\1\122\1\123\1\124\1\1\2\12\1\125\2\12\1"+
    "\126\24\12\1\127\1\130\2\12\1\127\2\12\1\131\1\132\1\13\3\12\1\132\3\12\1"+
    "\27\2\1\1\12\1\1\5\12\1\133\1\24\45\12\1\134\1\12\1\135\1\27\4\12\1\27\1\136"+
    "\1\137\1\15\1\12\1\15\1\12\1\15\1\137\1\66\3\12\1\140\1\1\1\141\4\1\5\12\1"+
    "\26\2\12\1\142\4\12\1\37\1\12\1\143\3\1\1\12\1\144\1\46\2\12\1\145\1\12\1"+
    "\74\3\1\1\12\1\106\3\12\1\46\4\1\1\146\5\1\1\103\2\12\1\140\1\147\3\1\1\150"+
    "\1\12\1\151\1\41\2\12\1\37\1\1\2\12\1\140\1\1\1\36\1\41\1\12\1\144\6\1\1\152"+
    "\1\153\14\12\4\1\21\12\1\133\2\12\1\133\1\154\1\12\1\144\3\12\1\155\1\156"+
    "\1\157\1\117\1\156\1\160\1\1\1\161\2\1\1\162\1\1\1\163\1\1\1\117\6\1\1\164"+
    "\1\165\1\166\1\167\1\170\3\1\1\171\147\1\2\12\1\143\2\12\1\143\10\12\1\172"+
    "\1\173\2\12\1\125\3\12\1\174\1\1\1\12\1\106\4\175\4\1\1\102\35\1\1\176\2\1"+
    "\1\177\1\24\4\12\1\200\1\24\4\12\1\126\1\103\1\12\1\144\1\24\4\12\1\143\1"+
    "\1\1\12\1\27\3\1\1\12\40\1\133\12\1\37\4\1\135\12\1\37\2\1\10\12\1\117\4\1"+
    "\2\12\1\144\20\12\1\117\1\12\1\201\1\1\2\12\1\143\1\102\1\12\1\144\4\12\1"+
    "\37\2\1\1\202\1\203\5\12\1\204\1\12\1\144\1\26\3\1\1\202\1\205\1\12\1\30\1"+
    "\1\3\12\1\140\1\203\2\12\1\140\3\1\1\206\1\41\1\12\1\37\1\12\1\106\1\1\1\12"+
    "\1\117\1\47\2\12\1\30\1\102\1\1\1\207\1\210\2\12\1\45\1\1\1\211\1\1\1\12\1"+
    "\212\3\12\1\213\1\214\1\215\1\27\1\63\1\216\1\217\1\175\2\12\1\126\1\37\7"+
    "\12\1\30\1\1\72\12\1\140\1\12\1\220\2\12\1\145\20\1\26\12\1\144\6\12\1\74"+
    "\2\1\1\106\1\221\1\54\1\222\1\223\6\12\1\15\1\1\1\150\25\12\1\144\1\1\4\12"+
    "\1\203\2\12\1\26\2\1\1\145\7\1\1\207\7\12\1\117\2\1\1\24\1\27\1\24\1\27\1"+
    "\224\4\12\1\143\1\225\1\226\2\1\1\227\1\12\1\13\1\230\2\144\2\1\7\12\1\27"+
    "\30\1\1\12\1\117\3\12\1\66\2\1\2\12\1\1\1\12\1\231\2\12\1\37\1\12\1\144\2"+
    "\12\1\232\3\1\11\12\1\144\6\1\2\12\1\26\3\12\1\140\11\1\23\12\1\106\1\12\1"+
    "\37\1\26\11\1\1\233\2\12\1\234\1\12\1\37\1\12\1\106\1\12\1\143\4\1\1\12\1"+
    "\235\1\12\1\37\1\12\1\74\4\1\3\12\1\236\4\1\1\66\1\237\1\12\1\140\2\1\1\12"+
    "\1\117\1\12\1\117\2\1\1\116\1\12\1\46\1\1\3\12\1\37\1\12\1\37\1\12\1\30\1"+
    "\12\1\15\6\1\4\12\1\45\3\1\3\12\1\30\3\12\1\30\60\1\1\150\2\12\1\26\4\1\1"+
    "\150\2\12\2\1\1\12\1\45\1\1\1\150\1\12\1\106\2\1\2\12\1\240\1\150\2\12\1\30"+
    "\1\241\1\242\2\1\1\12\1\21\1\145\5\1\1\243\1\244\1\45\2\12\1\143\2\1\1\70"+
    "\1\53\1\54\1\65\1\1\1\245\1\15\21\1\3\12\1\1\1\246\13\1\2\12\1\143\2\1\1\247"+
    "\2\1\3\12\1\1\1\250\3\1\2\12\1\27\5\1\1\12\1\74\30\1\4\12\1\1\1\102\34\1\3"+
    "\12\1\45\20\1\71\12\1\74\16\1\14\12\1\140\53\1\2\12\1\143\75\1\44\12\1\106"+
    "\33\1\43\12\1\45\1\12\1\143\7\1\1\12\1\144\1\1\3\12\1\1\1\140\1\1\1\150\1"+
    "\251\1\12\67\1\4\12\1\46\1\66\3\1\1\150\6\1\1\15\77\1\6\12\1\27\1\117\1\45"+
    "\1\74\66\1\5\12\1\207\3\12\1\137\1\252\1\253\1\254\3\12\1\255\1\256\1\12\1"+
    "\257\1\260\1\35\24\12\1\261\1\12\1\35\1\126\1\12\1\126\1\12\1\207\1\12\1\207"+
    "\1\143\1\12\1\143\1\12\1\54\1\12\1\54\1\12\1\211\3\1\14\12\1\46\123\1\1\254"+
    "\1\12\1\262\1\263\1\264\1\265\1\266\1\267\1\270\1\145\1\271\1\145\24\1\55"+
    "\12\1\106\2\1\103\12\1\46\15\12\1\144\150\12\1\15\25\1\41\12\1\144\36\1");

  /* The ZZ_CMAP_A table has 2976 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\22\0\1\3\1\0\1\30\1\5\4\0\1\37\1\40\1\6\1\0\1\46\1\32"+
    "\1\33\1\4\12\27\1\47\1\50\1\34\1\45\1\35\2\0\1\15\1\22\1\13\1\20\1\25\1\26"+
    "\1\14\1\17\1\12\4\26\1\23\1\24\1\16\1\26\1\11\1\7\1\10\1\21\5\26\1\41\1\31"+
    "\1\42\1\0\1\36\1\16\1\26\1\11\1\7\1\10\1\21\5\26\1\43\1\0\1\44\7\0\1\1\12"+
    "\0\1\3\11\0\1\26\12\0\1\26\4\0\1\26\5\0\27\26\1\0\12\26\4\0\14\26\16\0\5\26"+
    "\7\0\1\26\1\0\1\26\1\0\5\26\1\0\2\26\2\0\4\26\1\0\1\26\6\0\1\26\1\0\3\26\1"+
    "\0\1\26\1\0\4\26\1\0\23\26\1\0\13\26\10\0\6\26\1\0\26\26\2\0\1\26\6\0\10\26"+
    "\10\0\13\26\5\0\3\26\33\0\6\26\1\0\1\26\17\0\2\26\7\0\2\26\12\0\3\26\2\0\2"+
    "\26\1\0\16\26\15\0\11\26\13\0\1\26\30\0\6\26\4\0\2\26\4\0\1\26\5\0\6\26\4"+
    "\0\1\26\11\0\1\26\3\0\1\26\7\0\11\26\7\0\5\26\17\0\26\26\3\0\1\26\2\0\1\26"+
    "\7\0\11\26\4\0\10\26\2\0\2\26\2\0\26\26\1\0\7\26\1\0\1\26\3\0\4\26\3\0\1\26"+
    "\20\0\1\26\15\0\2\26\1\0\1\26\5\0\6\26\4\0\2\26\1\0\2\26\1\0\2\26\1\0\2\26"+
    "\17\0\4\26\1\0\1\26\3\0\3\26\20\0\11\26\1\0\2\26\1\0\2\26\1\0\5\26\3\0\1\26"+
    "\2\0\1\26\30\0\1\26\13\0\10\26\2\0\1\26\3\0\1\26\1\0\6\26\3\0\3\26\1\0\4\26"+
    "\3\0\2\26\1\0\1\26\1\0\2\26\3\0\2\26\3\0\3\26\3\0\14\26\13\0\10\26\1\0\2\26"+
    "\10\0\3\26\5\0\4\26\1\0\5\26\3\0\1\26\3\0\2\26\15\0\13\26\2\0\1\26\21\0\1"+
    "\26\5\0\22\26\3\0\10\26\1\0\11\26\1\0\1\26\2\0\7\26\11\0\1\26\1\0\2\26\15"+
    "\0\2\26\1\0\1\26\2\0\2\26\1\0\1\26\2\0\1\26\6\0\4\26\1\0\7\26\1\0\3\26\1\0"+
    "\1\26\1\0\1\26\2\0\2\26\1\0\4\26\1\0\2\26\11\0\1\26\2\0\5\26\1\0\1\26\25\0"+
    "\14\26\1\0\24\26\13\0\5\26\3\0\6\26\4\0\4\26\3\0\1\26\3\0\2\26\7\0\3\26\4"+
    "\0\15\26\14\0\1\26\1\0\6\26\1\0\1\26\5\0\1\26\2\0\13\26\1\0\15\26\1\0\4\26"+
    "\2\0\7\26\1\0\1\26\1\0\4\26\2\0\1\26\1\0\4\26\2\0\7\26\1\0\1\26\1\0\4\26\2"+
    "\0\16\26\2\0\6\26\2\0\15\26\2\0\1\26\1\3\17\26\1\0\10\26\7\0\15\26\1\0\6\26"+
    "\23\0\1\26\4\0\1\26\3\0\11\26\1\0\1\26\5\0\17\26\1\0\16\26\2\0\14\26\13\0"+
    "\1\26\15\0\7\26\7\0\16\26\15\0\2\26\11\0\4\26\1\0\4\26\3\0\2\26\11\0\10\26"+
    "\1\0\1\26\1\0\1\26\1\0\1\26\1\0\6\26\1\0\7\26\1\0\1\26\3\0\3\26\1\0\7\26\3"+
    "\0\4\26\2\0\6\26\4\0\13\3\15\0\2\1\5\0\1\3\17\0\1\3\1\0\1\26\15\0\1\26\2\0"+
    "\1\26\4\0\1\26\2\0\12\26\1\0\1\26\3\0\5\26\6\0\1\26\1\0\1\26\1\0\1\26\1\0"+
    "\4\26\1\0\13\26\2\0\4\26\5\0\5\26\4\0\1\26\4\0\2\26\13\0\5\26\6\0\4\26\3\0"+
    "\2\26\14\0\10\26\7\0\10\26\1\0\7\26\1\0\1\3\4\0\2\26\12\0\5\26\5\0\2\26\3"+
    "\0\7\26\6\0\3\26\12\0\2\26\13\0\11\26\2\0\27\26\2\0\7\26\1\0\3\26\1\0\4\26"+
    "\1\0\4\26\2\0\6\26\3\0\1\26\1\0\1\26\2\0\5\26\1\0\12\26\12\0\5\26\1\0\3\26"+
    "\1\0\10\26\4\0\7\26\3\0\1\26\3\0\2\26\1\0\1\26\3\0\2\26\2\0\5\26\2\0\1\26"+
    "\1\0\1\26\30\0\3\26\3\0\6\26\2\0\6\26\2\0\6\26\11\0\7\26\4\0\5\26\3\0\5\26"+
    "\5\0\1\26\1\0\10\26\1\0\5\26\1\0\1\26\1\0\2\26\1\0\2\26\1\0\12\26\6\0\12\26"+
    "\2\0\6\26\2\0\6\26\2\0\6\26\2\0\3\26\3\0\14\26\1\0\16\26\1\0\2\26\1\0\2\26"+
    "\1\0\10\26\6\0\4\26\4\0\16\26\2\0\1\26\1\0\14\26\1\0\2\26\3\0\1\26\2\0\4\26"+
    "\1\0\2\26\12\0\10\26\6\0\6\26\1\0\3\26\1\0\12\26\3\0\1\26\12\0\4\26\25\0\1"+
    "\26\1\0\1\26\3\0\7\26\1\0\1\26\1\0\4\26\1\0\17\26\1\0\2\26\14\0\3\26\4\0\2"+
    "\26\1\0\1\26\20\0\4\26\10\0\1\26\13\0\10\26\5\0\3\26\2\0\1\26\2\0\2\26\2\0"+
    "\4\26\1\0\14\26\1\0\1\26\1\0\7\26\1\0\21\26\1\0\4\26\2\0\10\26\1\0\7\26\1"+
    "\0\14\26\1\0\4\26\1\0\5\26\1\0\1\26\3\0\14\26\2\0\10\26\1\0\2\26\1\0\1\26"+
    "\2\0\1\26\1\0\12\26\1\0\4\26\1\0\1\26\1\0\1\26\6\0\1\26\4\0\1\26\1\0\1\26"+
    "\1\0\1\26\1\0\3\26\1\0\2\26\1\0\1\26\2\0\1\26\1\0\1\26\1\0\1\26\1\0\1\26\1"+
    "\0\1\26\1\0\2\26\1\0\1\26\2\0\4\26\1\0\7\26\1\0\4\26\1\0\4\26\1\0\1\26\1\0"+
    "\12\26\1\0\5\26\1\0\3\26\1\0\5\26\1\0\5\26");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\6\4\1\5\4\1"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\6\4\1\5\1\0\1\22"+
    "\1\0\1\23\1\0\1\24\2\0\1\25\1\21\6\4"+
    "\1\21\4\4\1\26\1\27\2\4\1\30\1\4\1\31"+
    "\3\4\1\32\1\33";

  private static int [] zzUnpackAction() {
    int [] result = new int[68];
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
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267"+
    "\0\366\0\51\0\51\0\51\0\51\0\51\0\51\0\51"+
    "\0\51\0\51\0\51\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334"+
    "\0\u035d\0\u0386\0\u023e\0\u01ec\0\51\0\u03af\0\51\0\u023e"+
    "\0\51\0\u0267\0\u03d8\0\51\0\u0401\0\u042a\0\u0453\0\u047c"+
    "\0\u04a5\0\u04ce\0\u04f7\0\51\0\u0520\0\u0549\0\u0572\0\u059b"+
    "\0\366\0\366\0\u05c4\0\u05ed\0\366\0\u0616\0\366\0\u063f"+
    "\0\u0668\0\u0691\0\366\0\366";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[68];
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
    "\1\2\3\3\1\4\1\5\1\2\1\6\4\7\1\10"+
    "\3\7\1\11\2\7\1\12\1\7\1\13\1\7\1\14"+
    "\1\15\1\2\1\16\1\17\1\20\1\2\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\52\0\3\3\51\0\1\5\1\0\1\34\42\0"+
    "\1\5\2\0\46\5\7\0\1\7\1\35\10\7\1\36"+
    "\6\7\6\0\1\7\21\0\21\7\6\0\1\7\21\0"+
    "\2\7\1\37\16\7\6\0\1\7\21\0\3\7\1\40"+
    "\15\7\6\0\1\7\21\0\15\7\1\41\3\7\6\0"+
    "\1\7\21\0\11\7\1\42\7\7\6\0\1\7\41\0"+
    "\1\14\3\0\1\43\15\0\2\44\1\0\25\44\1\45"+
    "\1\46\17\44\27\0\1\14\2\0\1\47\1\50\1\0"+
    "\1\51\42\0\1\43\21\0\34\52\1\53\1\54\13\52"+
    "\6\34\1\55\42\34\7\0\2\7\1\56\16\7\6\0"+
    "\1\7\21\0\13\7\1\57\5\7\6\0\1\7\21\0"+
    "\6\7\1\60\12\7\6\0\1\7\21\0\5\7\1\61"+
    "\13\7\6\0\1\7\21\0\11\7\1\62\7\7\6\0"+
    "\1\7\21\0\5\7\1\63\13\7\6\0\1\7\12\0"+
    "\2\44\1\0\46\44\34\53\1\0\1\52\13\53\4\34"+
    "\1\64\44\34\7\0\3\7\1\65\15\7\6\0\1\7"+
    "\21\0\5\7\1\66\13\7\6\0\1\7\21\0\7\7"+
    "\1\67\11\7\6\0\1\7\21\0\2\7\1\70\16\7"+
    "\6\0\1\7\21\0\16\7\1\71\2\7\6\0\1\7"+
    "\21\0\16\7\1\72\2\7\6\0\1\7\21\0\4\7"+
    "\1\73\14\7\6\0\1\7\21\0\2\7\1\74\16\7"+
    "\6\0\1\7\21\0\10\7\1\75\10\7\6\0\1\7"+
    "\21\0\6\7\1\76\12\7\6\0\1\7\21\0\1\7"+
    "\1\77\17\7\6\0\1\7\21\0\6\7\1\100\12\7"+
    "\6\0\1\7\21\0\7\7\1\101\11\7\6\0\1\7"+
    "\21\0\7\7\1\102\11\7\6\0\1\7\21\0\10\7"+
    "\1\103\10\7\6\0\1\7\21\0\10\7\1\104\10\7"+
    "\6\0\1\7\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1722];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\17\1\12\11\10\1\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\2\0\1\11\7\1\1\11\20\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[68];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _GraphvizLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _GraphvizLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 28: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 29: break;
          case 3: 
            { return LINE_COMMENT;
            }
          case 30: break;
          case 4: 
            { return ID;
            }
          case 31: break;
          case 5: 
            { return NUMBER;
            }
          case 32: break;
          case 6: 
            { return UNDERSCORE;
            }
          case 33: break;
          case 7: 
            { return L_PAREN;
            }
          case 34: break;
          case 8: 
            { return R_PAREN;
            }
          case 35: break;
          case 9: 
            { return L_BRACKET;
            }
          case 36: break;
          case 10: 
            { return R_BRACKET;
            }
          case 37: break;
          case 11: 
            { return L_CURLY;
            }
          case 38: break;
          case 12: 
            { return R_CURLY;
            }
          case 39: break;
          case 13: 
            { return ASGN;
            }
          case 40: break;
          case 14: 
            { return COMMA;
            }
          case 41: break;
          case 15: 
            { return COLON;
            }
          case 42: break;
          case 16: 
            { return SEMICOLON;
            }
          case 43: break;
          case 17: 
            { return BLOCK_COMMENT;
            }
          case 44: break;
          case 18: 
            { return DOUBLE_QUOTED_STRING;
            }
          case 45: break;
          case 19: 
            { return EDGE_UNDIR;
            }
          case 46: break;
          case 20: 
            { return EDGE_DIR;
            }
          case 47: break;
          case 21: 
            { return HTML_STRING;
            }
          case 48: break;
          case 22: 
            { return KW_NODE;
            }
          case 49: break;
          case 23: 
            { return KW_EDGE;
            }
          case 50: break;
          case 24: 
            { return KW_GRAPH;
            }
          case 51: break;
          case 25: 
            { return KW_STRICT;
            }
          case 52: break;
          case 26: 
            { return KW_DIGRAPH;
            }
          case 53: break;
          case 27: 
            { return KW_SUBGRAPH;
            }
          case 54: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
