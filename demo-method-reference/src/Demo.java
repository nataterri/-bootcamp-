import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
  public static void main(String[] args) {
    // 1. Instance Method
    List<String> strings = new ArrayList<>(List.of("abcde", "ijk", "defg"));

    // length()
    List<Integer> strLengths = strings.stream() //
        .map(e -> e.length()) //
        .collect(Collectors.toList());

    strLengths = strings.stream() //
        .map(String::length) //
        .collect(Collectors.toList());

    List<String> sortedStrings = strings.stream() //
        .sorted((s1, s2) -> s1.compareTo(s2)) //
        .collect(Collectors.toList());

    System.out.println("sortedStrings=" + sortedStrings);

    sortedStrings = strings.stream() //
        .sorted(String::compareTo) //
        .collect(Collectors.toList());

    System.out.println("sortedStrings=" + sortedStrings);

    // 2. Static Method

    strings.stream() //
        .forEach(e -> System.out.println(e));

    // method reference: alternative as a lambda expression
    strings.stream() //
        .forEach(System.out::println);
    // When there is a single input, and there is only one input parameter of the method

  }
}
