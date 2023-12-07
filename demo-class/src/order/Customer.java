package order;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  // 17 types (String, Wraper Classes, Primitives)

  // Custom Class
  private Order[] orders;

  private int age; // state

  // + 20 attributes

  // Constructor
  public Customer() {
    this.orders = new Order[0];
  }

  public Customer(Order order) {
    this.orders = new Order[] {order};
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }

  // Getter
  public Order[] getOrders() {
    return this.orders;
  }

  public Order getOrder(int orderId) {
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId == this.orders[i].getId())
        return this.orders[i];
    }
    return null; // null means "No Object is returned."
  }

  // public boolean updateOrderAmount(int orderId, double totalAmount) {
  // for (int i = 0; i < this.orders.length; i++) {
  // if (orders[i].getId() == orderId) {
  // orders[i].setTotalAmount(totalAmount);
  // return true;
  // }
  // }
  // return false;
  // }

  // Modify instance variables
  public void addOrder(Order order) {
    // It is a new array object
    Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
  }

  public boolean deleteOrder(int orderId) {
    boolean found = false;
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId == this.orders[i].getId())
        found = true;
    }
    // Not Found
    if (!found) {
      return false;
    }
    // Delete Order
    Order[] newArr = new Order[this.orders.length - 1]; // Local variable
    int idx = 0;
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId != this.orders[i].getId())
        newArr[idx++] = this.orders[i];
    }
    this.orders = newArr;
    return found;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isAdult() {
    return this.age >= 18;
  }

  public boolean isVIP() {
    return this.orders.length >= 100;
  }

  public char membership() { // 'G', 'S', 'N'
    if (this.orders.length >= 10) {
      return 'G';
    } else if (this.orders.length >= 5) {
      return 'S';
    }
    return 'N'; // deafult N
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString() {
    return "Customer(orders=" + Arrays.toString(this.orders) + ")";
  }

  public static void main(String[] args) {
    // Order o1 = new Order(1, LocalDate.of(2023, 10, 26), 2500.0d);
    // Order o2 = new Order(2, LocalDate.of(2023, 10, 28), 3000.0d);
    Customer customer =
        new Customer(new Order[] {new Order(1, LocalDate.of(2023, 10, 26)),
            new Order(2, LocalDate.of(2023, 10, 28))});

    System.out.println("before: " + customer.toString());
    // o2.setTotalAmount(4000.0d);
    System.out.println("after: " + customer.toString());

    customer.addOrder(new Order(3, LocalDate.of(2000, 10, 1)));

    System.out.println("after adding order: " + customer.toString());

    customer.deleteOrder(2); // return boolean

    System.out.println("after deleting order: " + customer.toString());

    System.out.println(customer.getOrder(1).totalAmount()); // no items

    customer.setAge(18);
    if (customer.isAdult()) { //
      System.out.println("The customer is an adult");
    }

    if (customer.isVIP()) { // isVIP()
      System.out.println("The customer is VIP");
    }

    // System.out.println("Order 1=" + o1);
    // Order 1=Order(id=1, buyDate=2023-10-26, totalAmount=2500.0)

    // New some order objects, and put into the customer object

    // research -> Class of class

  }

}