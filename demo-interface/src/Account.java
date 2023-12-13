public class Account {

  private int balance; // derived by transactions

  private Transaction[] transactions;

  private AccountHolder accountholder; // name, age, occupation, etc

  // Create Account, accountHolder must be there.
  public Account(AccountHolder accountHolder) {
    this.balance = 0;
    this.accountholder = accountHolder;
  }

  public Account(String name, int age) {
    this.balance = 0;
    this.accountholder = new AccountHolder(name, age);
  }

  public int balance() {
    
  }

  // public String type;// Saving, ABC, etc..

  public void credit(int amount) { // add
    this.balance += amount;

  }

  public boolean debit(int amount) { // deduct
    if (this.balance < amount)
      return false;
    this.balance -= amount;
    return true;
  }
}
