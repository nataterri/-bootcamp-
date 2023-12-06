import java.time.LocalDate;

public class Order {

  private int id;

  private LocalDate buyDate;

  private double totalAmount;

  public Order(int id, LocalDate buyDate, double totalAmount) {
    this.id = id;
    this.buyDate = buyDate;
    this.totalAmount = totalAmount;
  }

  public int getId() {
    return this.id;
  }

  public double getTotalAmount() {
    return this.totalAmount;
  }

  public void setTotalAmount(double amount) {
    this.totalAmount = amount;
  }

  @Override
  public String toString() {
    return "Order(id=" + this.id //
        + ", buyDate=" + this.buyDate //
        + ", totalAmount=" + this.totalAmount //
        + ")";
  }

  public static void main(String[] args) {
    Order order = new Order(1, LocalDate.of(2000, 10, 1), 2000);
    System.out.println(order.toString()); // Order(id=1, buyDate=2000-10-01, totalAmount=2000.0)
  }
}

