import java.util.Objects;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    // Cat: age, name
    // Cat.class, Cat is the name of a class only. You can name it anything, such as Box.
    // Or you can simply treat it as AgeAndNameHolder.class

    Account account = DemoOptional.setup(1, 0.0d);
    account.credit(10.0d);

    Account account2 = DemoOptional.setup(0, 0.0d); // accountNo 0 is not allowed -> return null
    // account2.credit(200.0d); // NullPointerException

    // As a caller, we can generally handle the null value in this way.
    // Approach 1 to handle Optional return value
    DemoOptional.setup2(2, 0.0d).ifPresent(acct -> {
      acct.credit(1000.d);
    });

    // Approach 2 to handle Optional return value
    Optional<Account> oa = DemoOptional.setup2(3, 0.0d);
    if (oa.isPresent()) {
      oa.get().credit(1000.0d);
    } else {
      System.out.println("I decided to do nothing when Account Object is null.");
    }

  }

  public static Account setup(int accountNo, double balance) {
    if (accountNo <= 0 || balance < 0)
      return null;
    return new Account(accountNo, balance);
  }

  public static Optional<Account> setup2(int accountNo, double balance) {
    if (accountNo <= 0 || balance < 0)
      return Optional.empty();
    return Optional.of(new Account(accountNo, balance));
  }
}
