public class DemoStringMethod {
    public static void main(String[] args) {
        String str = " hello world ";
        // isEmpty
        if (!str.isEmpty()) {
            System.out.println("String=" + str);
        }
        // length ()
        System.out.println("str length=" + str.length());

        // charAt ()
        // even number index of the character in string
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(str.charAt(i));
            }
        }
        System.out.println("");

        // substring(startIndex, endIndex -1)
        // substring(startIndex)
        String s = "hello";
        String newStr = s.substring(2, 4); // 11, index start from 0
        System.out.println("newStr=" + newStr); // 11, print -> index from 2 to 3
        System.out.println(newStr.substring(0)); // 11

        // trim (), remove all spaces in the head and tail of the string
        // str = " hello world! "
        System.out.println(str.trim()); // "hello world!"
        System.out.println(newStr.trim()); // "11"

        String s2 = "HEllo, woRld!!";
        System.out.println(s2.toUpperCase()); // "HELLO, WORLD!!"
        System.out.println(s2.toLowerCase()); // "hello, world!!"

        // equals ()
        // equalsIgnoreCase()
        System.out.println("HEllo, woRld!!".equals("hello, world!!")); // false
        System.out.println("HEllo, woRld!!".equalsIgnoreCase("hello, world!!")); // true
        System.out.println("HEllo, woRld!!".equalsIgnoreCase("hello")); // false

        // startsWith ("")
        // endsWIth ("")
        System.out.println(s2.startsWith("HEllo")); // true
        System.out.println(s2.startsWith("Hello")); // false
        System.out.println(s2.startsWith("H")); // true
        System.out.println(s2.startsWith(" ")); // false
        System.out.println(s2.startsWith("")); // true

        System.out.println(s2.endsWith("woRld!!")); // true
        System.out.println(s2.endsWith("world")); // false
        System.out.println(s2.endsWith("!")); // true

        String s3 = "1234567890";
        // You try 2 String methods, and use && operator to check true/ false
        // return true
        System.out.println(s3.length() == 10 && s3.startsWith("1")); // true
        System.out.println("56".equals(s3.substring(4, 6))
                && s3.charAt(s3.length() - 1) == '0'); // true

        // indexOf()
        System.out.println(s3.indexOf('7')); // 6 (int)
        System.out.println(s3.indexOf("m")); // -1 (int)

        // searching '7' starting from index 8
        System.out.println(s3.indexOf('7', 8)); // -1 (int)

        // lastIndexOf()
        String s4 = "1234512345";
        System.out.println(s4.indexOf('5')); // 4, return the first occurence of '5'
        System.out.println(s4.lastIndexOf('5')); // 9, return the last occurence of '5'

        System.out.println(s4.indexOf("345")); // 2
        System.out.println(s4.indexOf("3 45")); // -1-> no such pattern

        System.out.println(s4.lastIndexOf("345")); // 7
        System.out.println(s4.lastIndexOf("3 45")); // -1 -> no such pattern

        System.out.println(s4.lastIndexOf('4', 7)); // 3
        System.out.println(s4.lastIndexOf('4', 2)); // -1 -> no such pattern

        String s5 = "ABabcxabcdef";
        System.out.println(s5.lastIndexOf("abc") == 6 //
                && s5.endsWith("def") //
                && s5.indexOf("abc") == 2 //
                && s5.startsWith("ABa") //
                && s5.length() > 10); // true

        String s6 = "abc";
        String s7 = "def";
        System.out.println(s6 + s7); // "abcdef"
        System.out.println(s6.concat(s7)); // "abcdef"

        System.out.println(s5.contains("abcdef")); // true
        System.out.println(s5.indexOf("abcdef") != -1); // true

        System.out.println(s5.contains("xxx")); // false

        String result = s5.toUpperCase();
        System.out.println(result); // ABABCXABCDEF
        String result2 = result.substring(3, 5); /// BC
        System.out.println(result2);

        String result3 = s5.toUpperCase().substring(3, 5); // BC
        System.out.println(result3);
        
        String result4 = s5.toUpperCase().substring(1,2).concat("ijk");
        System.out.println(result4); // Bijk


    }
}
