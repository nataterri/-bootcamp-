public class BusinessException extends Exception {

  private int code;

  public BusinessException(SysCode sysCode) {
    this(sysCode.getCode(), sysCode.getMessage());
  }

  private BusinessException(int code, String message) { // "Server is unavailable.."
    super(message);
    this.code = code;
  }

  public static void main(String[] args) {
    try {
      throw new BusinessException(SysCode.SERVER_TIMEOUT);
    } catch (BusinessException e) {

    }
  }

}
