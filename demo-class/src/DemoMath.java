public class DemoMath {
  public static void main(String[] args) {

    // pow()
    System.out.println(Math.pow(2.0, 10)); // 2^10
    System.out.println(Math.pow(2.0, -1)); // 1 / (2^1)
    System.out.println(Math.pow(2.0, -2)); // 1 / (2^2)
    System.out.println(Math.pow(-2.0, 3)); // -8.0

    // abs(), absolute value // 3.2
    System.out.println(Math.abs(3.2)); // 3.2
    System.out.println(Math.abs(-3.2)); // 3.2

    // ceil(), floor()
    System.out.println(Math.ceil(3.1)); // 4.0
    System.out.println(Math.ceil(3.9)); // 4.0

    System.out.println(Math.floor(3.1)); // 3.0
    System.out.println(Math.floor(3.9)); // 3.0

    System.out.println(Math.round(14.4)); // 14
    System.out.println(Math.round(14.5)); // 15
    System.out.println(Math.round(14.44)); // 14
    System.out.println(Math.round(14.45)); // 14

    int[] arr = new int[] {-2, 20, 100, -40};
    int max = -1000000;
    // Approach 1
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        ;
      max = arr[i];
    }
    // Approach 2
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }

    System.out.println(Math.min(7.5, 6.8)); // 6.8

    System.out.println(Math.sqrt(81)); // 9.0
    System.out.println(Math.sqrt(-81)); // NaN

    double d1 = Math.sqrt(-81);
    System.out.println(d1);

    if (Double.isNaN(d1))
      System.out.println("d1 is NaN");

    int random1 = new Random().nextInt(3); // 0,1,2
    System.out.println(Math.random()); // 0.0 - 1.0 inclusively

    // 1 - 10
    int random2 = (int) (Math.random() * 10) + 1;
    System.out.println(random2);

    // int x = 3.5 + 4;
    
    // Special Scenario: +=
    int y = 7;
    y += 3.5; // implicity downcast
    y = (int) (y + 3.5); // explicity



  }
}
