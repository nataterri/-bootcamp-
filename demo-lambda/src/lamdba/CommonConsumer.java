package lamdba;

@FunctionalInterface
public interface CommonConsumer<T> extends SuperConsumer<T, T, T> {
  // void accept(T t1, T t2, T t3);
}
