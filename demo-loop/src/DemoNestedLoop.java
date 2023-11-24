public class DemoNestedLoop {
  public static void main(String[] args) {

    System.out.println("Example 1:");
    for (int i = 0; i < 5; i++) { // 0,1,2,3,4
      // System.out.println("*");
      System.out.println("*");
    }
    // *****
    System.out.println("");

    System.out.println("Example 2:");
    // when i=0, j -> 0,1,2,3
    // when i=1, j -> 0,1,2,3
    // when i=2, j -> 0,1,2,3
    // when i=3, j -> 0,1,2,3
    // when i=4, j -> 0,1,2,3
    for (int i = 0; i < 4; i++) { // outer loop
      System.out.println("i=" + i);
      for (int j = 0; j < 3; j++) { // inner loop
        if (j > 1) {

          break;
        }
        // System.out.println("i=" + i + " , j=" + j);
        System.out.println("j=" + j);
      }
    }

    // i < 5
    // j < 4
    // System.out.println(); -> print & newline
    // System.out.print(); -> print
    for (int i = 0; i < 5; i++) { // row ( because you added println ())
      for (int j = 0; j < 4; j++) { // column -> variable lengths
        System.out.print("*");
      }
      System.out.println("");
    }
    // ****
    // ***
    // **
    // *
    int length = 4;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < length - i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("Example 3:");
    String str = "abcdefghijk";
    int count = 0; // count -> only one pattern
    for (int i = 0; i < str.length(); i++) { // variable length
      // nested loop, 4 characters in a row
      // abcd
      // efgh
      // ijk

      System.out.print(str.charAt(i));
      if (++count % 4 == 0 || i == str.length() - 1) {
        System.out.println("");
      }
    }

    System.out.println("Example 4a:");
    int noOfGroup = 6;
    for (int i = 0; i < noOfGroup; i++) {
      for (int j = 0; j < 3; j++) {
        // "*** *** *** *** *** ***"
        System.out.print("*");
      }
      if (i != noOfGroup - 1 ) {
        System.out.print (" ");
     }
    }
    
    System.out.println("");

    System.out.println("Example 4b:");
    int cnt = 0;
    for (int i = 0; i < 6; i++) {
      // if (++cnt % == 0)
      System.out.println("*** ");
    }
  }
}


