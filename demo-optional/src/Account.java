import java.util.Optional;

public class Account {

  private double balance;

  private int accountNo;

  // Important Note:
  // Optional<T> is not suitable for Class attribute use.
  // Optional<T> does not support serialization/ deserialization natually
  // private Optional<String> currency;
  
  public Account(int accountNo, double balance) {
    this.accountNo = accountNo;
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }
  
  public int getAccountNo() {
    return this.accountNo;
  }

  public void credit(double amount) {
    this.balance += amount;
  }
  
  public boolean debit(double amount) {
    if (this.balance < amount)
      return false;
    this.balance -= amount; // BigDecimal
    return true;
  }

}