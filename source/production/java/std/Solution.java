/*
    I Love Lance & Janice
*/

package std;

public class Solution {
  public static String solution(String x) {
    char ch;
	String str = "";

    for (int i = 0; i < x.length(); ++i) {
      ch = x.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        ch = (char)(-ch + 219);
        str += ch;
      } else {
        str += ch;
      }
    }
    return str;
  }

  public static void main(String[] args) {
    String x = "Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!";
    String z = solution(x);

    System.out.println("Encrypted Message = " + x);
    System.out.println(z);
    System.out.println(z.getClass().getSimpleName());
  }
}
