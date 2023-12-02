public class DemoWrapper {
    public static void main(String[] args) {
        // int -> Integer
        int i1 = 3;
        Integer i2 = 3; // 3 is int value -> auto-boxing
        int i3 = i2; // auto-unbox

        Integer i4 = new Integer(5);
        Integer i5 = Integer.valueOf(3);

        int result = i4.compareTo(i2); // 1
        System.out.println(result);
        int result2 = i2.compareTo(i4); // -1
        System.out.println(result2);

        if (i2.compareTo(i4) == 0) { // asking if i2 == i4

        }
        if (i2 == i4) { // comparing the 2 int values

        }

        // double -> Double
        double radius = 1.3d;
        Double radius2 = 1.3d;
        Double radius3 = Double.valueOf(1.3d);
        Double radius4 = new Double(1.3d);

        // char -> Character
        Character char1 = Character.valueOf('a');

        // boolean -> Boolean
        boolean isOkay = true;
        Boolean isPassed = true; // autobox
        Boolean isPassed2 = Boolean.valueOf(true); // self-box
        Boolean isPassed3 = new Boolean(true);

        // Long
        Long l1 = 10L; // 10L is long value, auto-box
        // Long -> Integer, how to fix
        // Long -> long
        // Integer -> int
        // int <-> long
        Integer i10 = (int) (long) l1; // int -> Integer (autobox)

        Long l2 = (long) (int) i10; // long -> Long (autobox)


        // do not write if ( d2 > d1) { // double > double
        // instead write if (d2 compareTo(d1) == 0) // double == double

    }
}
