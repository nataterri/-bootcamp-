public class DemoEnum {
    public static void main(String[] args) {
        // Color
        String color = "RED";
        color = "RED";
        color = "red";
        color = "Red";
        color = "R ed";

        // Status 
    }

    public static int convert(String color) {
        if (color.replace(" ", "").toUpperCase().equals("RED"))
        return 1;
        return 2;

    }
}

