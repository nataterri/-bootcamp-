public class Dog {

  public static int sum(int... integers) {
    int sum = 0;
    for (Integer i : integers) {
      sum += i;
    }
    return sum;
  }

  public static int sum2(int[] integers) {
    int sum = 0;
    for (Integer i : integers) {
      sum += i;
    }
    return sum;
  }



  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4, 5)); // 15

    // call sum2
    int[] arr = new int[] {1, 2, 3, 4, 5};
    System.out.println(sum2(arr));
    
  }

}
