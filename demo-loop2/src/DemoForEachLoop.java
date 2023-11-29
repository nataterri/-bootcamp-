public class DemoForEachLoop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer i : integers) {
      System.out.println("i=" + i);
    }

    for (int i = 0; i < integers.length; i++) {
      System.out.println("i=" + integers[i]);
    }

    String str = "abc,def,ijk,zxy";
    String[] parts = str.split(",");

    /*
     * for (int i = 0; i < parts.length; i++) { System.out.println(parts[i]); }
     */

    for (String s : parts) {
      System.out.println("parts=" + s);

    }

  }

}
