/* The following code was generated by JFlex 1.6.1 */

//* --------------------------Seccion codigo-usuario ------------------------*/
import java.util.*;
import java.io.*;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>flex/moore.flex</tt>
 */
class AnalizadorAutomata implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CODIGO = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\31\1\3\1\2\1\41\1\42\1\1\16\31\4\0\1\3\2\0"+
    "\1\32\1\30\3\0\1\37\1\40\1\5\1\0\1\35\2\0\1\4"+
    "\1\6\11\7\1\0\1\36\5\0\1\14\1\30\1\10\1\15\1\11"+
    "\1\23\2\30\1\20\2\30\1\22\1\26\1\21\1\16\1\27\1\30"+
    "\1\25\1\12\1\13\1\24\5\30\4\0\1\17\1\0\1\14\1\30"+
    "\1\10\1\15\1\11\1\23\2\30\1\20\2\30\1\22\1\26\1\21"+
    "\1\16\1\27\1\30\1\25\1\12\1\13\1\24\5\30\1\33\1\0"+
    "\1\34\1\0\6\31\1\43\32\31\2\0\4\30\4\0\1\30\2\0"+
    "\1\31\7\0\1\30\4\0\1\30\5\0\27\30\1\0\37\30\1\0"+
    "\70\30\2\20\115\30\1\12\u0142\30\4\0\14\30\16\0\5\30\7\0"+
    "\1\30\1\0\1\30\21\0\160\31\5\30\1\0\2\30\2\0\4\30"+
    "\10\0\1\30\1\0\3\30\1\0\1\30\1\0\24\30\1\0\123\30"+
    "\1\0\213\30\1\0\5\31\2\0\236\30\11\0\46\30\2\0\1\30"+
    "\7\0\47\30\7\0\1\30\1\0\55\31\1\0\1\31\1\0\2\31"+
    "\1\0\2\31\1\0\1\31\10\0\33\30\5\0\3\30\15\0\5\31"+
    "\6\0\1\30\4\0\13\31\5\0\53\30\37\31\4\0\2\30\1\31"+
    "\143\30\1\0\1\30\10\31\1\0\6\31\2\30\2\31\1\0\4\31"+
    "\2\30\12\31\3\30\2\0\1\30\17\0\1\31\1\30\1\31\36\30"+
    "\33\31\2\0\131\30\13\31\1\30\16\0\12\31\41\30\11\31\2\30"+
    "\4\0\1\30\5\0\26\30\4\31\1\30\11\31\1\30\3\31\1\30"+
    "\5\31\22\0\31\30\3\31\104\0\1\30\1\0\13\30\67\0\33\31"+
    "\1\0\4\31\66\30\3\31\1\30\22\31\1\30\7\31\12\30\2\31"+
    "\2\0\12\31\1\0\7\30\1\0\7\30\1\0\3\31\1\0\10\30"+
    "\2\0\2\30\2\0\26\30\1\0\7\30\1\0\1\30\3\0\4\30"+
    "\2\0\1\31\1\30\7\31\2\0\2\31\2\0\3\31\1\30\10\0"+
    "\1\31\4\0\2\30\1\0\3\30\2\31\2\0\12\31\4\30\7\0"+
    "\1\30\5\0\3\31\1\0\6\30\4\0\2\30\2\0\26\30\1\0"+
    "\7\30\1\0\2\30\1\0\2\30\1\0\2\30\2\0\1\31\1\0"+
    "\5\31\4\0\2\31\2\0\3\31\3\0\1\31\7\0\4\30\1\0"+
    "\1\30\7\0\14\31\3\30\1\31\13\0\3\31\1\0\11\30\1\0"+
    "\3\30\1\0\26\30\1\0\7\30\1\0\2\30\1\0\5\30\2\0"+
    "\1\31\1\30\10\31\1\0\3\31\1\0\3\31\2\0\1\30\17\0"+
    "\2\30\2\31\2\0\12\31\1\0\1\30\17\0\3\31\1\0\10\30"+
    "\2\0\2\30\2\0\26\30\1\0\7\30\1\0\2\30\1\0\5\30"+
    "\2\0\1\31\1\30\7\31\2\0\2\31\2\0\3\31\10\0\2\31"+
    "\4\0\2\30\1\0\3\30\2\31\2\0\12\31\1\0\1\30\20\0"+
    "\1\31\1\30\1\0\6\30\3\0\3\30\1\0\4\30\3\0\2\30"+
    "\1\0\1\30\1\0\2\30\3\0\2\30\3\0\3\30\3\0\14\30"+
    "\4\0\5\31\3\0\3\31\1\0\4\31\2\0\1\30\6\0\1\31"+
    "\16\0\12\31\11\0\1\30\7\0\3\31\1\0\10\30\1\0\3\30"+
    "\1\0\27\30\1\0\12\30\1\0\5\30\3\0\1\30\7\31\1\0"+
    "\3\31\1\0\4\31\7\0\2\31\1\0\2\30\6\0\2\30\2\31"+
    "\2\0\12\31\22\0\2\31\1\0\10\30\1\0\3\30\1\0\27\30"+
    "\1\0\12\30\1\0\5\30\2\0\1\31\1\30\7\31\1\0\3\31"+
    "\1\0\4\31\7\0\2\31\7\0\1\30\1\0\2\30\2\31\2\0"+
    "\12\31\1\0\2\30\17\0\2\31\1\0\10\30\1\0\3\30\1\0"+
    "\51\30\2\0\1\30\7\31\1\0\3\31\1\0\4\31\1\30\10\0"+
    "\1\31\10\0\2\30\2\31\2\0\12\31\12\0\6\30\2\0\2\31"+
    "\1\0\22\30\3\0\30\30\1\0\11\30\1\0\1\30\2\0\7\30"+
    "\3\0\1\31\4\0\6\31\1\0\1\31\1\0\10\31\22\0\2\31"+
    "\15\0\60\30\1\31\2\30\7\31\4\0\10\30\10\31\1\0\12\31"+
    "\47\0\2\30\1\0\1\30\2\0\2\30\1\0\1\30\2\0\1\30"+
    "\6\0\4\30\1\0\7\30\1\0\3\30\1\0\1\30\1\0\1\30"+
    "\2\0\2\30\1\0\4\30\1\31\2\30\6\31\1\0\2\31\1\30"+
    "\2\0\5\30\1\0\1\30\1\0\6\31\2\0\12\31\2\0\4\30"+
    "\40\0\1\30\27\0\2\31\6\0\12\31\13\0\1\31\1\0\1\31"+
    "\1\0\1\31\4\0\2\31\10\30\1\0\44\30\4\0\24\31\1\0"+
    "\2\31\5\30\13\31\1\0\44\31\11\0\1\31\71\0\53\30\24\31"+
    "\1\30\12\31\6\0\6\30\4\31\4\30\3\31\1\30\3\31\2\30"+
    "\7\31\3\30\4\31\15\30\14\31\1\30\17\31\2\0\46\30\1\0"+
    "\1\30\5\0\1\30\2\0\53\30\1\0\u014d\30\1\0\4\30\2\0"+
    "\7\30\1\0\1\30\1\0\4\30\2\0\51\30\1\0\4\30\2\0"+
    "\41\30\1\0\4\30\2\0\7\30\1\0\1\30\1\0\4\30\2\0"+
    "\17\30\1\0\71\30\1\0\4\30\2\0\103\30\2\0\3\31\40\0"+
    "\20\30\20\0\125\30\14\0\u026c\30\2\0\21\30\1\0\32\30\5\0"+
    "\113\30\3\0\3\30\17\0\15\30\1\0\4\30\3\31\13\0\22\30"+
    "\3\31\13\0\22\30\2\31\14\0\15\30\1\0\3\30\1\0\2\31"+
    "\14\0\64\30\40\31\3\0\1\30\3\0\2\30\1\31\2\0\12\31"+
    "\41\0\3\31\2\0\12\31\6\0\130\30\10\0\51\30\1\31\1\30"+
    "\5\0\106\30\12\0\35\30\3\0\14\31\4\0\14\31\12\0\12\31"+
    "\36\30\2\0\5\30\13\0\54\30\4\0\21\31\7\30\2\31\6\0"+
    "\12\31\46\0\27\30\5\31\4\0\65\30\12\31\1\0\35\31\2\0"+
    "\13\31\6\0\12\31\15\0\1\30\130\0\5\31\57\30\21\31\7\30"+
    "\4\0\12\31\21\0\11\31\14\0\3\31\36\30\15\31\2\30\12\31"+
    "\54\30\16\31\14\0\44\30\24\31\10\0\12\31\3\0\3\30\12\31"+
    "\44\30\122\0\3\31\1\0\25\31\4\30\1\31\4\30\3\31\2\30"+
    "\11\0\300\30\47\31\25\0\4\31\u0116\30\2\0\6\30\2\0\46\30"+
    "\2\0\6\30\2\0\10\30\1\0\1\30\1\0\1\30\1\0\1\30"+
    "\1\0\37\30\2\0\65\30\1\0\7\30\1\0\1\30\3\0\3\30"+
    "\1\0\7\30\3\0\4\30\2\0\6\30\4\0\15\30\5\0\3\30"+
    "\1\0\7\30\16\0\5\31\30\0\1\41\1\41\5\31\20\0\2\30"+
    "\23\0\1\30\13\0\5\31\5\0\6\31\1\0\1\30\15\0\1\30"+
    "\20\0\15\30\3\0\33\30\25\0\15\31\4\0\1\31\3\0\14\31"+
    "\21\0\1\30\4\0\1\30\2\0\12\30\1\0\1\30\3\0\5\30"+
    "\6\0\1\30\1\0\1\30\1\0\1\30\1\0\4\30\1\0\13\30"+
    "\2\0\4\30\5\0\5\30\4\0\1\30\21\0\51\30\u0a77\0\57\30"+
    "\1\0\57\30\1\0\205\30\6\0\4\30\3\31\2\30\14\0\46\30"+
    "\1\0\1\30\5\0\1\30\2\0\70\30\7\0\1\30\17\0\1\31"+
    "\27\30\11\0\7\30\1\0\7\30\1\0\7\30\1\0\7\30\1\0"+
    "\7\30\1\0\7\30\1\0\7\30\1\0\7\30\1\0\40\31\57\0"+
    "\1\30\u01d5\0\3\30\31\0\11\30\6\31\1\0\5\30\2\0\5\30"+
    "\4\0\126\30\2\0\2\31\2\0\3\30\1\0\132\30\1\0\4\30"+
    "\5\0\51\30\3\0\136\30\21\0\33\30\65\0\20\30\u0200\0\u19b6\30"+
    "\112\0\u51cd\30\63\0\u048d\30\103\0\56\30\2\0\u010d\30\3\0\20\30"+
    "\12\31\2\30\24\0\57\30\1\31\4\0\12\31\1\0\31\30\7\0"+
    "\1\31\120\30\2\31\45\0\11\30\2\0\147\30\2\0\4\30\1\0"+
    "\4\30\14\0\13\30\115\0\12\30\1\31\3\30\1\31\4\30\1\31"+
    "\27\30\5\31\20\0\1\30\7\0\64\30\14\0\2\31\62\30\21\31"+
    "\13\0\12\31\6\0\22\31\6\30\3\0\1\30\4\0\12\31\34\30"+
    "\10\31\2\0\27\30\15\31\14\0\35\30\3\0\4\31\57\30\16\31"+
    "\16\0\1\30\12\31\46\0\51\30\16\31\11\0\3\30\1\31\10\30"+
    "\2\31\2\0\12\31\6\0\27\30\3\0\1\30\1\31\4\0\60\30"+
    "\1\31\1\30\3\31\2\30\2\31\5\30\2\31\1\30\1\31\1\30"+
    "\30\0\3\30\2\0\13\30\5\31\2\0\3\30\2\31\12\0\6\30"+
    "\2\0\6\30\2\0\6\30\11\0\7\30\1\0\7\30\221\0\43\30"+
    "\10\31\1\0\2\31\2\0\12\31\6\0\u2ba4\30\14\0\27\30\4\0"+
    "\61\30\u2104\0\u016e\30\2\0\152\30\46\0\7\30\14\0\5\30\5\0"+
    "\1\30\1\31\12\30\1\0\15\30\1\0\5\30\1\0\1\30\1\0"+
    "\2\30\1\0\2\30\1\0\154\30\41\0\u016b\30\22\0\100\30\2\0"+
    "\66\30\50\0\15\30\3\0\20\31\20\0\7\31\14\0\2\30\30\0"+
    "\3\30\31\0\1\30\6\0\5\30\1\0\207\30\2\0\1\31\4\0"+
    "\1\30\13\0\12\31\7\0\32\30\4\0\1\30\1\0\32\30\13\0"+
    "\131\30\3\0\6\30\2\0\6\30\2\0\6\30\2\0\3\30\3\0"+
    "\2\30\3\0\2\30\22\0\3\31\4\0\14\30\1\0\32\30\1\0"+
    "\23\30\1\0\2\30\1\0\17\30\2\0\16\30\42\0\173\30\105\0"+
    "\65\30\210\0\1\31\202\0\35\30\3\0\61\30\57\0\37\30\21\0"+
    "\33\30\65\0\36\30\2\0\44\30\4\0\10\30\1\0\5\30\52\0"+
    "\236\30\2\0\12\31\u0356\0\6\30\2\0\1\30\1\0\54\30\1\0"+
    "\2\30\3\0\1\30\2\0\27\30\252\0\26\30\12\0\32\30\106\0"+
    "\70\30\6\0\2\30\100\0\1\30\3\31\1\0\2\31\5\0\4\31"+
    "\4\30\1\0\3\30\1\0\33\30\4\0\3\31\4\0\1\31\40\0"+
    "\35\30\203\0\66\30\12\0\26\30\12\0\23\30\215\0\111\30\u03b7\0"+
    "\3\31\65\30\17\31\37\0\12\31\20\0\3\31\55\30\13\31\2\0"+
    "\1\31\22\0\31\30\7\0\12\31\6\0\3\31\44\30\16\31\1\0"+
    "\12\31\100\0\3\31\60\30\16\31\4\30\13\0\12\31\u04a6\0\53\30"+
    "\15\31\10\0\12\31\u0936\0\u036f\30\221\0\143\30\u0b9d\0\u042f\30\u33d1\0"+
    "\u0239\30\u04c7\0\105\30\13\0\1\30\56\31\20\0\4\31\15\30\u4060\0"+
    "\2\30\u2163\0\5\31\3\0\26\31\2\0\7\31\36\0\4\31\224\0"+
    "\3\31\u01bb\0\125\30\1\0\107\30\1\0\2\30\2\0\1\30\2\0"+
    "\2\30\2\0\4\30\1\0\14\30\1\0\1\30\1\0\7\30\1\0"+
    "\101\30\1\0\4\30\2\0\10\30\1\0\7\30\1\0\34\30\1\0"+
    "\4\30\1\0\5\30\1\0\1\30\3\0\7\30\1\0\u0154\30\2\0"+
    "\31\30\1\0\31\30\1\0\37\30\1\0\31\30\1\0\37\30\1\0"+
    "\31\30\1\0\37\30\1\0\31\30\1\0\37\30\1\0\31\30\1\0"+
    "\10\30\2\0\62\31\u1600\0\4\30\1\0\33\30\1\0\2\30\1\0"+
    "\1\30\2\0\1\30\1\0\12\30\1\0\4\30\1\0\1\30\1\0"+
    "\1\30\6\0\1\30\4\0\1\30\1\0\1\30\1\0\1\30\1\0"+
    "\3\30\1\0\2\30\1\0\1\30\2\0\1\30\1\0\1\30\1\0"+
    "\1\30\1\0\1\30\1\0\1\30\1\0\2\30\1\0\1\30\2\0"+
    "\4\30\1\0\7\30\1\0\4\30\1\0\4\30\1\0\1\30\1\0"+
    "\12\30\1\0\21\30\5\0\3\30\1\0\5\30\1\0\21\30\u1144\0"+
    "\ua6d7\30\51\0\u1035\30\13\0\336\30\u3fe2\0\u021e\30\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\31\36\0\140\31\200\0\360\31\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\1\6\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\0"+
    "\2\16\5\3\1\0\1\17\2\15\2\0\5\3\1\0"+
    "\12\3\1\20\4\3\1\21\1\3\1\22\2\3\1\23"+
    "\4\3\1\24\2\3\1\25\3\3\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
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
    "\0\0\0\44\0\110\0\154\0\110\0\220\0\264\0\330"+
    "\0\374\0\u0120\0\u0144\0\u0168\0\110\0\110\0\110\0\110"+
    "\0\110\0\110\0\110\0\u018c\0\u018c\0\u01b0\0\u01d4\0\374"+
    "\0\u01f8\0\u021c\0\u0240\0\u0264\0\u0288\0\u02ac\0\u018c\0\u018c"+
    "\0\u02d0\0\110\0\u02f4\0\u0318\0\u033c\0\u0360\0\u0384\0\u03a8"+
    "\0\u03cc\0\u03f0\0\u0414\0\u0438\0\u045c\0\u0480\0\u04a4\0\u04c8"+
    "\0\u04ec\0\u0510\0\u0534\0\u0558\0\374\0\u057c\0\u05a0\0\u05c4"+
    "\0\u05e8\0\374\0\u060c\0\374\0\u0630\0\u0654\0\374\0\u0678"+
    "\0\u069c\0\u06c0\0\u06e4\0\374\0\u0708\0\u072c\0\374\0\u0750"+
    "\0\u0774\0\u0798\0\374";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
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
    "\1\3\1\4\2\5\1\6\3\3\1\7\1\10\1\11"+
    "\1\12\1\13\11\11\1\14\2\11\1\3\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\3\1\5\1\3"+
    "\1\24\2\3\27\24\1\25\6\24\3\3\46\0\1\5"+
    "\45\0\1\26\1\27\44\0\1\30\1\31\6\11\1\32"+
    "\13\11\11\0\1\11\6\0\4\11\1\33\17\11\11\0"+
    "\1\11\6\0\24\11\11\0\1\11\6\0\17\11\1\34"+
    "\4\11\11\0\1\11\6\0\14\11\1\35\7\11\11\0"+
    "\1\11\6\0\10\11\1\36\13\11\11\0\1\11\1\37"+
    "\2\0\27\37\1\40\6\37\3\0\1\26\1\41\1\42"+
    "\41\26\5\43\1\44\36\43\6\0\2\31\22\11\11\0"+
    "\1\11\6\0\20\11\1\45\3\11\11\0\1\11\6\0"+
    "\5\11\1\46\16\11\11\0\1\11\6\0\6\11\1\47"+
    "\15\11\11\0\1\11\6\0\15\11\1\50\6\11\11\0"+
    "\1\11\6\0\10\11\1\51\13\11\11\0\1\11\2\0"+
    "\1\42\41\0\5\43\1\52\36\43\4\0\1\42\1\44"+
    "\44\0\21\11\1\53\2\11\11\0\1\11\6\0\6\11"+
    "\1\54\15\11\11\0\1\11\6\0\13\11\1\55\10\11"+
    "\11\0\1\11\6\0\11\11\1\56\12\11\11\0\1\11"+
    "\6\0\17\11\1\57\4\11\11\0\1\11\4\43\1\42"+
    "\1\52\36\43\6\0\10\11\1\60\13\11\11\0\1\11"+
    "\6\0\7\11\1\61\14\11\11\0\1\11\6\0\4\11"+
    "\1\62\17\11\11\0\1\11\6\0\10\11\1\63\1\11"+
    "\1\64\11\11\11\0\1\11\6\0\3\11\1\65\20\11"+
    "\11\0\1\11\6\0\17\11\1\66\4\11\11\0\1\11"+
    "\6\0\10\11\1\67\13\11\11\0\1\11\6\0\12\11"+
    "\1\70\11\11\11\0\1\11\6\0\16\11\1\71\5\11"+
    "\11\0\1\11\6\0\13\11\1\72\10\11\11\0\1\11"+
    "\6\0\5\11\1\73\16\11\11\0\1\11\6\0\4\11"+
    "\1\74\4\11\1\75\12\11\11\0\1\11\6\0\2\11"+
    "\1\76\21\11\11\0\1\11\6\0\5\11\1\77\16\11"+
    "\11\0\1\11\6\0\6\11\1\100\15\11\11\0\1\11"+
    "\6\0\12\11\1\101\11\11\11\0\1\11\6\0\12\11"+
    "\1\102\11\11\11\0\1\11\6\0\20\11\1\103\3\11"+
    "\11\0\1\11\6\0\13\11\1\104\10\11\11\0\1\11"+
    "\6\0\10\11\1\105\13\11\11\0\1\11\6\0\12\11"+
    "\1\106\11\11\11\0\1\11\6\0\13\11\1\107\10\11"+
    "\11\0\1\11\6\0\3\11\1\110\20\11\11\0\1\11"+
    "\6\0\13\11\1\111\10\11\11\0\1\11\6\0\5\11"+
    "\1\112\16\11\11\0\1\11\6\0\10\11\1\113\13\11"+
    "\11\0\1\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1980];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\7\1\7\11\3\1\1\0"+
    "\7\1\1\0\2\1\1\11\2\0\5\1\1\0\41\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorAutomata(java.io.Reader in) {
  	System.out.println("Iniciando Analizador Lexico ... ");

    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2874) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
	System.out.println("Fin del Analizador Lexico ... ");

  yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
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
          yycolumn += zzCharCount;
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
		 System.out.println(errLex);
            }
          case 23: break;
          case 2: 
            { /*Se ignoran los espacios en blanco */
            }
          case 24: break;
          case 3: 
            { return new Symbol(sym.ID, yyline, yycolumn, new String(yytext()));
            }
          case 25: break;
          case 4: 
            { yybegin(CODIGO); return new Symbol(sym.ALM_OP, yyline, yycolumn, new String(yytext()));
            }
          case 26: break;
          case 5: 
            { return new Symbol(sym.LLCORCH_OP, yyline, yycolumn, new String(yytext()));
            }
          case 27: break;
          case 6: 
            { return new Symbol(sym.LLCORCH_CL, yyline, yycolumn, new String(yytext()));
            }
          case 28: break;
          case 7: 
            { return new Symbol(sym.COMA, yyline, yycolumn, new String(yytext()));
            }
          case 29: break;
          case 8: 
            { return new Symbol(sym.PUNTO_COMA, yyline, yycolumn, new String(yytext()));
            }
          case 30: break;
          case 9: 
            { return new Symbol(sym.LLPARENT_OP, yyline, yycolumn, new String(yytext()));
            }
          case 31: break;
          case 10: 
            { return new Symbol(sym.LLPARENT_CL, yyline, yycolumn, new String(yytext()));
            }
          case 32: break;
          case 11: 
            { System.out.println("Error en la declaración de código");
            }
          case 33: break;
          case 12: 
            { yybegin(YYINITIAL); return new Symbol(sym.ALM_CL, yyline, yycolumn, new String(yytext()));
            }
          case 34: break;
          case 13: 
            { /*Se ignoran los comentarios */
            }
          case 35: break;
          case 14: 
            { return new Symbol(sym.CMP, yyline, yycolumn, new String(yytext()));
            }
          case 36: break;
          case 15: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzMarkedPos, -1);
            { return new Symbol(sym.CODIGO, yyline, yycolumn, new String(yytext()));
            }
          case 37: break;
          case 16: 
            { return new Symbol(sym.MOORE, yyline, yycolumn, new String(yytext()));
            }
          case 38: break;
          case 17: 
            { return new Symbol(sym.ALF_IN, yyline, yycolumn, new String(yytext()));
            }
          case 39: break;
          case 18: 
            { return new Symbol(sym.ESTADOS, yyline, yycolumn, new String(yytext()));
            }
          case 40: break;
          case 19: 
            { return new Symbol(sym.ALF_OUT, yyline, yycolumn, new String(yytext()));
            }
          case 41: break;
          case 20: 
            { return new Symbol(sym.ESTADO_INI, yyline, yycolumn, new String(yytext()));
            }
          case 42: break;
          case 21: 
            { return new Symbol(sym.TRANS, yyline, yycolumn, new String(yytext()));
            }
          case 43: break;
          case 22: 
            { return new Symbol(sym.COMPORTAMIENTO, yyline, yycolumn, new String(yytext()));
            }
          case 44: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = sym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( "line:" + (yyline+1) + " col:" + (yycolumn+1) + " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java AnalizadorAutomata [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        AnalizadorAutomata scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new AnalizadorAutomata(reader);
          while ( !scanner.zzAtEOF ) scanner.debug_next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
