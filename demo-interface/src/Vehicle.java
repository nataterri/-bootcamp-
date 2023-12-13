public interface Vehicle { // "Vehicle" is an abstract word.

  // interface has NO instance variable
  int x = 10; // implicitly "public static final"

  // interface is a contract with 100% abstract behaviors (abstract methods)

  // if a class implements an interface, it has to implement all its abstract
  // methods (all or nothing)

  boolean start(); // implicitly "public abstract" method

  boolean stop();

  boolean accelerate();

  boolean brake();

  // After Java 8
  // default instance method - backward compatibility 
  default boolean test() {
    return false;
  }


}
