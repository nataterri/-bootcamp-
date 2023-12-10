public class Airlines {

  private String name;

  private int FlightNumber;

  public Airlines() {

  }

  public Airlines(String name) {
    this.name = name;

  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Airlines(int FlightNumber) {
    this.FlightNumber = FlightNumber;

  }

  public void setFlightNumber(int FlightNumber) {
    this.FlightNumber = FlightNumber;
  }

  public int getFlightNumber() {
    return this.FlightNumber;
  }



  public static void main(String[] args) {
    Airlines a1 = new Airlines();
    a1.setName("Asiana");
    Airlines a2 = new Airlines();
    a2.setName("Cathay Pacific");
    Airlines a3 = new Airlines();
    a3.setName("jetBlue");

    Airlines a4 = a1;
    a4.setName("Korean Airlines");

    Airlines a5 = new Airlines("swissAir");
    a5.setName("Emirates");

    System.out.println(a1.getName());
    System.out.println(a2.getName());
    System.out.println(a3.getName());
    System.out.println(a4.getName());
    System.out.println(a5.getName());



  }

}

