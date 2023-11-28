public class DemoCounting {

  public static void main(String[] args) {
    // Assume all numbers are positive
    // Expected outcome: How many same numbers: 3 * '2
    int[] numbers = new int[] {10, 2, 200, 2000, 2000, 2, 2};
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println(max); // 2000
    System.out.println(min); // 2

    int[] counts = new int[max - min + 1]; // 1999
    for (int i = 0; i < numbers.length; i++) {
      counts[numbers[i] - min]++;
    }
    int maxCount = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] != 0 && counts[i] > maxCount) {
        maxCount = counts[i];
      }
    }
    System.out.println("Max.count=" + maxCount); // 3

    String str = "abcabcdpolxyzaa";
    char maxChar = ' ';
    maxCount = 0;
    int counts2[] = new int[26];
    // charAt()
    for (int x = 0; x < str.length(); x++) {
      counts2[str.charAt(x) - 'a']++; // 'a' - 'a' -> 97 - 97 -> 0
    }
    maxCount = 0;
    for (int i = 0; i < counts2.length; i++) {
      if (counts2[i] > maxCount) {
        maxCount = counts2[i];
        maxChar = (char) (i + 'a'); // downcast
      }
    }
    System.out.println("Max count=" + maxCount + " , char=" + maxChar); // 4
  }
}
