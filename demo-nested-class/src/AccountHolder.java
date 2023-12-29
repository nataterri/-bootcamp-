public class AccountHolder { // outer class

  private String name;
  private Account account;

  public AccountHolder(String name) {
    this.name = name;
  }

  public AccountHolder(Account account) {
    this.account = account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Account createAccount(String AccountNo) {
    return new Account(AccountNo);
  }

  public class Account { // Inner class
    private String accountNo;

    public Account(String accountNo) {
      this.accountNo = accountNo;
    }

    public void printHolderName() {
      System.out.println(name); 
      // Inner Class instance method can access the outer class's instance variable
    }
  }

  public static void main(String[] args) {
    AccountHolder john = new AccountHolder("John");
    Account johnAccount = john.createAccount("1234"); // john.new Account("1234");
    johnAccount.printHolderName(); // "John"
  }
}