/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static boolean sameNumberOfVowels(String s) {
    // code here
    int length = s.length();
    String a = s.substring(0, length / 2);
    String b = s.substring(length / 2, length);

    char[] charsA = a.toCharArray();
    char[] charsB = b.toCharArray();

    int countA = 0;
    int countB = 0;

    for (char c : charsA) {
      c = Character.toLowerCase(c);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        countA++;
      }
    }

    for (char c : charsB) {
      c = Character.toLowerCase(c);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        countB++;
      }
    }

    return countA == countB;
  }

  public static void main(String[] args) {
    String s = "HelloWorld";
    boolean result = sameNumberOfVowels(s);
    System.out.println(result); 
  }
}
