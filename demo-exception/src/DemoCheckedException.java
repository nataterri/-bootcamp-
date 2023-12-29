public class DemoCheckedException {
  public static void main(String[] args) {
    // Checked exception - compiler requires the exception to be handled during the compile time
    // 1. if you throw an unchecked exception, you have to handle it by two ways.

    // 1a) Sign the unchecked exception in the method signature
    // isEmailValid("xxxxxxxx@gmail.com"); // method caller -> compile error
    // The method caller still need to handle the unchecked exception even the method throws alreay.

    // 1b) try-catch to handle
    try {
      isEmailValid("xxxxxxxx@gmail.com");
    } catch (BusinessException e) {
      // You can do anything after you catched it. Or do nothing.
      System.out.println(e.getMessage());
    }
  }

  public static boolean isEmailValid(String emailaddr)
      throws BusinessException {
    if (emailaddr == null || emailaddr.length() > 10)
      // return false;
      throw new BusinessException(SysCode.EMAIL_TOO_LONG);
    return true;
  }

  public static boolean isEmailValid2(String emailaddr)
      throws BusinessException {
    if (emailaddr != null && emailaddr.length() == 8)
      return true;
    if (emailaddr == null || emailaddr.length() < 8)
      return false;
    throw new BusinessException(SysCode.EMAIL_TOO_LONG);
  }
}