/*
    I Love Lance & Janice
*/

public class Google1 {
  public static void main(String[] args) {
    String x = "Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!";
    String z = "";
    char ch;

    for (int i = 0; i < x.length(); ++i) {
      ch = x.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        ch = (char)(-ch + 219);
        z += ch;
      } else {
        z += ch;
      }
    }
    System.out.println("Encrypted Message = " + z);
    System.out.println(z);
    System.out.println(z.getClass().getSimpleName());
  }
}
