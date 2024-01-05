import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;

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
      System.out
          .println("I decided to do nothing when Account Object is null.");
    }

    List<Account> accounts =
        new ArrayList<>(List.of(new Account(1, 120.0d), new Account(2, 50.0d)));

    Optional<Account> optaccount = accounts.stream() //
        .filter(e -> e.getBalance() > 30.0d) //
        .findFirst();

    // ifPresent(Consumer)
    // isPresent -> boolean

    Optional<Account> optaccount2 = accounts.stream() //
        .filter(e -> e.getBalance() > 150.0d) //
        .findAny();

    Account acct = optaccount2.orElse(new Account(99, 0.1d));

    Account acct2 = optaccount2.orElseGet(() -> new Account(99, 0.1d));

    Account acct3 = optaccount2.orElseThrow(() -> new NoSuchElementException());

    OptionalDouble maxBalance = accounts.stream() //
        .mapToDouble(e -> e.getBalance()) //
        .max();

    double max = 0.0d;
    if (maxBalance.isPresent()) {
      max = maxBalance.getAsDouble();
    }

    max = maxBalance.orElse(-1.0d);

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

  // Important Note: We never use Optional<T> as input parameter's type.
  // Inside the method, we still need to perform null check on Optional<T>,
  // So we can't see any benefit in using Optional<T> in input parameter.

  // public static Optional<Account> setup3(Optional<Integer> accountNo, Optional<Double> balance) {
  // if (accountNo == null)
  // return Optional.empty();
  // if(accountNo.isPresent()) { // nullpointerexception

  // }
  // }