public enum SysCode {

  // 1 - 1000 (reserved for error)
  SERVER_TIMEOUT(1, "Server Connection Time out."),

  // 1001 - 2000 (reserved for warning)
  DB_TIMEOUT(1001, "Database Connection Time out."),

  // 2001 - 3000 (Others)
  EMAIL_TOO_LONG(2001, "Email Address is too long."),;

  private int code;

  private String message;

  private SysCode(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }

}
