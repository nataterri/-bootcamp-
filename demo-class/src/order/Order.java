package order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Order {

  private int id;

  private LocalDate buyDate;

  // private double totalAmount; // derived by Item[]

  private Item[] items;

  // private int status; // 0 - pending, 1 - completed

  // public Order(int id, LocalDate buyDate, double totalAmount) {
  public Order(int id, LocalDate buyDate) {
    this.id = id;
    this.buyDate = buyDate;
    this.items = new Item[0];
    // this.totalAmount = totalAmount;
  }

  public void addItem(Item item) {
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public int getId() {
    return this.id;
  }

  public static double totalAmount(Item[] items) {
    BigDecimal total = BigDecimal.valueOf(0);
    BigDecimal price = BigDecimal.valueOf(0);
    BigDecimal quantity = BigDecimal.valueOf(0);
    for (int i = 0; i < items.length; i++) {
      price = BigDecimal.valueOf(items[i].getPrice());
      quantity = BigDecimal.valueOf(items[i].getQuatity());
      total = total.add(price.multiply(quantity));
    }
    return total.doubleValue();
  }

  public double totalAmount() {
    BigDecimal total = BigDecimal.valueOf(0);
    for (int i = 0; i < this.items.length; i++) {
      // total = total + item.price * item.quantity
      // this.items[i] -> one item object
      total = total.add(BigDecimal.valueOf(this.items[i].totalAmount()));
    }
    return total.doubleValue();
  }

  // public void setTotalAmount(double amount) {
  // this.totalAmount = amount;
  // }

  @Override
  public String toString() {
    return "Order(id=" + this.id //
        + ", buyDate=" + this.buyDate //
        // + ", totalAmount=" + this.totalAmount //
        + ")";
  }

  public static void main(String[] args) {
    // how to spilt to 3 lines?
    // Item[] items =
    // new Item[] {new Item(10.0, 4, "ABC"), new Item(20.5, 4, "DEF")};

    Order order = new Order(1, LocalDate.of(2000, 10, 1));
    order.addItem(new Item(10.0, 4, "ABC"));
    order.addItem(new Item(20.5, 4, "DEF"));

    Customer customer = new Customer();
    customer.addOrder(order);

    System.out.println(order.toString()); // Order(id=1, buyDate=2000-10-01, totalAmount=2000.0)

    System.out.println("total amount=" + order.totalAmount()); // 122.0
    System.out.println("total amount=" + customer.getOrder(1).totalAmount()); // 122.0

  }



}