package lamdba;

@FunctionalInterface
public interface SuperConsumer<T, U, V> { // T U V, can be different or same types

  void accept(T t, U u, V v);

}