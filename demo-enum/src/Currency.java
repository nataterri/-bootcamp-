public class Currency {

  HKD(1, "Hong Kong Dollar"), //
  USD(2, "US Dollar"), //
  CNY(3, "RMB"), //
  JPY(4, "Japan") //
  ;

  private int dbValue;
  private String desc;

  private Currency(int dbValue, String desc) {
    this.dbValue = dbValue;
    this.desc = desc;
  }

  public static Currency fromDbValue(int dbValue) {
    // values()
  }
  
}
