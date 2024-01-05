public class Account {

  private double balance;

  private int accountNo;
  
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