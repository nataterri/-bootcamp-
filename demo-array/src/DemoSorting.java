import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {
    int[] arr = new int[] {100, 4, 1050, 500, -20};
    // 1. Bubble Sort
    // Epected outcome: {-20, 4, 100, 500, 1050}
    int temp;
    for (int i = 0; i < arr.length - 1; i++) { // reset counter
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));

    // 2. Insertion Sort
    // Expected outcome: {-40, -30, 22, 40, 44, 100}
    int j;
    int key;
    int[] arr2 = new int[] {100, -30, 40, 22, 44, -40};
    for (int i = 1; i < arr2.length; i++) { // start from the 2nd element
      key = arr2[i]; // current element
      j = i;
      while (j > 0 && arr2[j - 1] > key) {
        arr2[j] = arr2[j - 1]; // move to right
        j--;
      }
      arr2[j] = key;
    }
    System.out.println(Arrays.toString(arr2));

  }
}
