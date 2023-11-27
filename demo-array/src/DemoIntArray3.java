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
    
      
    System.out.println(Arrays.toString(arr));


  }

}


