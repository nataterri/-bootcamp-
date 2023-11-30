/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    // code here
    int max = 0;
    int secondMax = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        secondMax = max;
        max = nums[i];
      } else if (nums[i] > secondMax) {
        secondMax = nums[i];
      }
    }
    System.out.println("Second Max=" + secondMax);

    int max2 = 0;
    int secondMax2 = 0;
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] > max2) {
        secondMax2 = max2;
        max2 = nums2[i];
      } else if (nums2[i] > secondMax2) {
        secondMax2 = nums2[i];
      }
    }
    System.out.println("Second Max=" + secondMax2);

    int max3 = 0;
    int secondMax3 = 0;
    for (int i = 0; i < nums3.length; i++) {
      if (nums3[i] > max3) {
        secondMax3 = max3;
        max3 = nums3[i];
      } else if (nums3[i] > secondMax3) {
        secondMax3 = nums3[i];
      }
    }
    System.out.println("Second Max=" + secondMax3);

    int max4 = 0;
    int secondMax4 = 0;
    for (int i = 0; i < nums4.length; i++) {
      if (nums4[i] > max4) {
        secondMax4 = max4;
        max4 = nums4[i];
      } else if (nums4[i] > secondMax4) {
        secondMax4 = nums4[i];
      }
    }
    System.out.println("Second Max=" + secondMax4);

  }
}

