// package questions;
/*
 * 
 * Question : You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
 * 
 * Return the sum of all the unique elements of nums.
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 100 1 <= nums[i] <= 100
 */

import java.util.HashMap;

public class JavaQuest26 {
  public static void main(String[] args) {
    System.out.println(sum(new int[] {1, 2, 3, 2})); // 4
    System.out.println(sum(new int[] {1, 1, 1, 1, 1}));// 0
    System.out.println(sum(new int[] {1, 2, 3, 4, 5, 6}));// 21
    System.out.println(sum(new int[] {1}));// 1
  }

  public static int sum(int[] nums) {
    // code here ...
    HashMap<Integer, Integer> countMap = new HashMap<>();

    for (int num : nums) {
      countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    int sum = 0;
    for (int num : nums) {
      if (countMap.get(num) == 1) {
        sum += num;
      }
    }
    return sum;
  }
}
