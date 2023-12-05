public class DemoIntArray {
    public static void main(String[] args) {
        int age1 = 20;
        int age2 = 25;
        int age3 = 30;
        int age4 = 28;

        // Define an array (container) to store a list of int number
        // This array (container) can only store an int number
        int[] arr = new int[9]; // [length of array], by index 0 - 8
        // assignment
        arr[0] = 20;
        System.out.println("arr[0]=" + arr[0]); // 20
        arr[1] = 25;
        System.out.println("arr[1]=" + arr[1]); // 25
        arr[8] = 30;
        System.out.println("arr[8]=" + arr[8]); // 30
        // empty -> default value
        System.out.println("arr[2]" + arr[2]); // 0
        // arr[9] =28; // error, no index 9 in array

        int a; // local variable
        a = 1; // explicity assignment
        System.out.println(a); // you have to explicity assign value before using it

        int[] arr2 = new int[5];
        int[] arr3 = new int[] {100, 5, 30, 9, -40};

        double[] arr4 = new double[] {1.2, 4.9, 4.3, 23.0};

        // 8 primitives + String
        // char[]
        // boolean[]
        // String[]

        System.out.println(arr2.length); // 5

        arr2 = new int[10];
        System.out.println(arr2.length); // 10

        // array supports for loop
        int b = 100;
        b = 1000;
        System.out.println(b);

        // default value of int[]
        int[] arr8 = new int[3];
        for (int i = 0; i < arr8.length; i++) {
            // arr5 is storing the address of the array object
            // we use arr[5] to find out the 3 value stored in the array object
            arr8[i] = i + 1;
            System.out.println("arr8[i]=" + arr8[i]);
            // [0] -> 1
            // [1] -> 2
            // [2] -> 3
        }

        for (int i = arr8.length - 1; i >= 0; i--) {
            // 3 2 1
            if (i > 0) {
                System.out.println(" "); // "3 2 1"
            }
        }

        String str = "hello"; // str is storing the address of String object hello
        String str2 = new String("hello"); // str2 is storing the address of String object hello
        String str3 = String.valueOf("hello");


    }
}
