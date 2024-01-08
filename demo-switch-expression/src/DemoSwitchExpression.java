public class DemoSwitchExpression {
  public static void main(String[] args) {

  }

  // Java 14: Switch Expression
  // 1. Return Type
  // 2. No break
  // 3. Simliar to lambda expression
  // 4. Compiler help ensure all enum values have been catered once
  public static int getCurrencyCode2(Currency currency) {
    return switch (currency) {
      case HKD -> 1;
      case USD -> 2;
      case CNY -> 3;
    };
  }

  public static int getCurrencyCode3(Currency currency) {
    return switch (currency) {
      case HKD -> {
        String x = "";
        if (x.isEmpty())
          yield 10;
        else
          yield 20;
      }
      case USD -> 2;
      case CNY -> 3;
    };
  }

  public static int getCurrencyCode3(String day) {
    return switch (day) {
      case "Monday" -> {
        String x = "";
        if (x.isEmpty())
          yield 10;
        else
          yield 20;
      }
      case "Tuesday" -> 50;
      default -> {
        yield 30;
      }
    };
  }

  // Normal Switch statement
  // No Return Type
  public static int getCurrencyCode(Currency currency) {
    int code = -1;
    switch (currency) {
      case HKD:
        code = 1;
        break;
      case USD:
        code = 2;
        break;
      case CNY:
        code = 3;
        break;
    }
    return code;
  }
}