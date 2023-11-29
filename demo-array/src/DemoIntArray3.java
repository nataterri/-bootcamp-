import java.util.Arrays;

public class DemoIntArray3 {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -100, 34};

    // for loop
    // {-100, 100, 34}
    int temp;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        // swapping
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));

    // move target index value to the tail of the array
    int[] arr2 = new int[] {100, -20, 4, 100, 500};
    int targetIndex = 1;
    // expected result = {100, 4, 100, 500, -20}
    // for loop
    for (int i = 0; i < arr2.length - 1; i++) {
      if (i >= targetIndex) {
        temp = arr2[i];
        arr2[i] = arr2[i + 1];
        arr2[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr2));

    // Find Max value, and move to the tail
    int[] arr3 = new int[] {100, 4, 1050, 500, -20};
    // Loop - Find Max -> ???
    int max = 0;
    int maxIndex = -1;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
        maxIndex = i;
      }
    }
    // Move to the tail
    temp = arr3[maxIndex];
    arr3[maxIndex] = arr3[arr3.length - 1];
    arr3[arr3.length - 1] = temp;
    System.out.println(Arrays.toString(arr3));

    // Approach 2
    int[] arr4 = new int[] {100, 4, 1050, 500, -20};
    // {4, 100, 1050, 500, -20}
    // {4, 100, 1050, 500, -20}
    // {4, 100, 500, 1050, -20}
    // {4, 100, 500, -20, 1050}

    for (int i = 0; i < arr4.length - 1; i++) {
      if (arr4[i] > arr4[i + 1]) {
        temp = arr4[i];
        arr4[i] = arr4[i + 1];
        arr4[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr4));

    String s = "abcabcabcabcabc";
    char[] arr5 = new char[s.length()];

    // Approach 1
    for (int i = 0; i < s.length(); i++) {
      arr5[i] = s.charAt(i);
    }
    // Approach 2
    char[] arr6 = s.toCharArray(); //

    // replace a -> c (String)
    // "abcabcabcabcabc"
    // "cbccbccbccbccbc"
    char[] arr7 = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        arr7[i] = 'c';
        continue;
      }
      arr7[i] = s.charAt(i);
    }
    // From array to String
    System.out.println(String.valueOf(arr7));


    String str = "hello";
    str = new String("hello");
    str = String.valueOf("hello");

    System.out.println(String.valueOf(1));
    System.out.println(String.valueOf(1.0d));
    System.out.println(String.valueOf(1.0f));
    System.out.println(String.valueOf(1L));
    System.out.println(String.valueOf(new char[] {'a', 'b'})); // ab
    // System.out.println(String.valueOf(new int[] {1, 2, 3})); NOT OK

    // Replace (String method)
    String str4 = "abcabcabcabcabc";
    String result4 = str4.replace('a', 'c'); // replace a by c
    System.out.println("str4=" + str4); // result4=abcabcabcabcabc
    System.out.println("result4=" + result4); // result4 =cbccbccbccbccbc

    // Replace a pattern "ab" by "ij"
    System.out.println(str4.replace("ab", "ij")); // ijcijcijcijcijc

  }
}


