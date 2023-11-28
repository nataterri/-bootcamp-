import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args) {
        // Approach 1
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);

        // Approach 2
        int j = 0;
        sum = 0;
        while (j < 5) {
            sum += j++; // sum += ; j++
        }
        System.out.println("sum=" + sum + ", j=" + j);

        // continue, break
        // Print odd numbers and <=5
        // 1,3,5 (1-10)
        j = 0;
        while (++j <= 10) {
            if (j > 5)
                break;
            if (j % 2 == 0)
                continue;
            System.out.println(j);
        }

        int x = 10;
        int y = 5;
        while (x > 0 && y > 0) {
            System.out.println("x=" + x + ", y=" + y);
            --x;
            --y;
        }

        // 0 1 1 2 3 5 8 13 ... < 1000
        int a1 = 1;
        int a2 = 0;
        int e = -1; // e -> sum
        int[] arr = new int[20];
        int idx = 0;
        arr[idx++] = a2;
        while (e < 1000) {
            e = a1 + a2;
            a2 = a1;
            arr[idx++] = a1;
            a1 = e;
        }
        System.out.println(Arrays.toString(arr));

        // Approach 2:
        a2 = 0;
        a1 = 1;
        e = -1;
        while (true) {
            e = a1 + a2;
            if (e > 1000) {
                e -= a2;
                break;
            }
            a2 = a1;
            a1 = e;
        }
        System.out.println("e=" + a1); // 987

        int num = 1;
        while (num < 3 || num > 5) {
            num++;
            System.out.println(num);
        }

        boolean isOverLimit = false;
        int limit = 0;
        while (!isOverLimit) {
            if (++limit > 100)
                isOverLimit = true;
        }

    }
}

