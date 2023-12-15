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
    String firstHalf = s.substring(0, length / 2);
    String secondHalf = s.substring(length / 2);

    int vowelsInFirstHalf = countVowels(firstHalf);
    int vowelsInSecondHalf = countVowels(secondHalf);

    return vowelsInFirstHalf == vowelsInSecondHalf;
  }

  public static int countVowels(String s) {
    int count = 0;
    char[] charArray = s.toCharArray();

    for (char c : charArray) {
      if (isVowel(c)) {
        count++;
      }
    }

    return count;
  }

  public static boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // false
    System.out.println(sameNumberOfVowels("textbook")); // true
    System.out.println(sameNumberOfVowels("hello")); // false
    System.out.println(sameNumberOfVowels("apple")); // true

  }
}
