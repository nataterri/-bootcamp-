import java.time.LocalDate;

public class DemoLocalDate {

  public static void main(String[] args) {
    String date = "1987-13-32";

    LocalDate date2 = LocalDate.of(1999, 10, 01);
    System.out.println(date2.toString()); // 1999-10-01

    LocalDate date3 = LocalDate.of(1999, 10, 02);
    if (date3.isAfter(date2)) {
      System.out.println("date3 > date2");
    } else if (date3.equals(date2)) {
      System.out.println("date3 is same date of date2");
    } else { // isBefore()
      System.out.println("date3 < date2");
    }

    System.out.println(date3.isLeapYear()); // false
    System.out.println(LocalDate.of(2100, 10, 02).isLeapYear()); // false
    System.out.println(LocalDate.of(2000, 10, 02).isLeapYear()); // true

    System.out.println(date3.getMonthValue()); // 10
    System.out.println(date3.getMonth().toString()); // OCTOBER

  }
}

