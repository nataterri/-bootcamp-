// package questions;
/*
 * Question : Given an integer n, add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format.
 */
/*
 * Constraints:
 * 
 * 0 <= n <= 231 - 1
 */

import java.text.DecimalFormat;

public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// 1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    // code here ...
    DecimalFormat formatter = new DecimalFormat("#,###");
    return "$" + formatter.format(n);
  }

}
