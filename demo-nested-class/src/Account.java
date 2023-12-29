public class Account {

  private AccountHolder accountHolder;

  public Account(AccountHolder accountHolder) {
    this.accountHolder = accountHolder;
  }

  public class AccountHolder {
    private String name;

    public AccountHolder(String name) {
      this.name = name;
    }
  }


}