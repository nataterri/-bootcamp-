package lamdba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  public static void main(String[] args) {
    // f(x) = x + 3
    // y = x + 3

    // R apply(T t), R -> Integer, T -> String
    Function<String, Integer> stringLength = (str) -> {
      return str.length(); // return Integer object
    };

    System.out.println(stringLength.apply("hello")); // 5
    System.out.println(stringLength.apply("abc")); // 3

    //
    Function<String, String> concatHello = s1 -> s1.concat("hello");
    concatHello.apply("abc"); // abchello

    // R apply(T t, U u);
    BiFunction<List<String>, Integer, String> getByIndex =
        (strings, index) -> strings.get(index);

    getByIndex.apply(new ArrayList<>(List.of("abc", "def", "ijk")), 1); // def

    // Example for Function
    Map<String, String> dicMap = new HashMap<>();
    dicMap.put("John", "ABC");
    dicMap.put("Mary", "IJK");

    BiFunction<String, String, String> remapFunc = (key, oldValue) -> {
      if (oldValue == null)
        return "hello";
      if (oldValue.length() <= 4)
        return null;
      return oldValue.concat("end");
    };

    dicMap.compute("Mary", remapFunc);
    System.out.println(dicMap.get("Mary")); // null

    dicMap.compute("Peter", remapFunc);
    System.out.println(dicMap.get("Peter")); // hello

    System.out.println(dicMap.size()); // 2 (John, Peter)



  }

  public static String getByIndex(List<String> strings, Integer index) {
    return strings.get(index);
  }
}