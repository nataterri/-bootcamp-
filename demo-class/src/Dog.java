public class Dog {

  public static int sum(int... integers) {
    int sum = 0;
    for (Integer i : integers) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4, 5)); // 15
  }
}
