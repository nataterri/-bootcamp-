public class Bag<T> { // <T> is a scope (No scope - You can put any class for T)
  // <T> = <T extends Object>
  
  T thing;

  public T eat() {
    return null;
  }

  public static <T> T get(T t) {
    return t;
  }

  public static void main(String[] args) {
    Bag<Integer> bag = new Bag<>();
    Bag<Long> bag2 = new Bag<>();
    Bag.get("hello");
  }

}
