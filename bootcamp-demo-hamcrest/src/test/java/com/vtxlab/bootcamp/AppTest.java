package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.core.AnyOf;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  // Compare int, String
  @Test
  void testIntegerString() {
    int actual = 45;
    assertThat(actual, is(equalTo(45)));
    assertThat(actual, is(not(equalTo(44))));

    String actual2 = "hello";
    assertThat(actual2, equalTo("hello"));
    assertThat(actual2, not(equalTo("helloo")));
    assertThat(actual2, containsString("ll"));
    assertThat(actual2, not(containsString("abc")));

    assertThat("", emptyString());
    assertThat(" ", not(emptyString()));
    assertThat(null, not(emptyString()));

    assertThat(actual2, allOf( //
        not(emptyString()), //
        equalTo("hello"), //
        startsWith("h"), //
        endsWith("o") //
    ));

  }

  @Test
  void testNullValue() {
    String actual = null;
    assertThat(actual, nullValue());

    String actual2 = "hello";
    assertThat(actual2, notNullValue());
  }

  @Test
  void testSameObject() {
    String s1 = "hello";
    String s2 = "hello";
    assertThat(s1, sameInstance(s2));

    String s3 = new String("hello");
    assertThat(s2, sameInstance(s3));
  }

  @Test
  void testAllRangeOfResult() {
    int result = 48; // call main code, e.g. calculate('M', 40)
    assertThat(result, allOf( //
        greaterThan(47), //
        lessThan(50), //
        greaterThanOrEqualTo(48), //
        lessThanOrEqualTo(48) //
    ));

    String actual = "world";
    assertThat(actual, anyOf( //
        equalTo("hello"), //
        equalTo("world") //
    ));

    Character character = Character.valueOf('D');
    assertThat(character, allOf( //
        not(equalTo('E')), //
        equalTo('D') //
    ));
  }

  @Test
  void testAllRangeOfResult2() {
    int result = 48; // call main code, e.g. calculate('M', 40)
    // same as allOf
    assertThat(result, greaterThan(47));
    assertThat(result, lessThan(50));
    assertThat(result, greaterThanOrEqualTo(48));
    assertThat(result, lessThanOrEqualTo(48));
  }

  @Test
  void testCollection() {
    List<String> strings = new ArrayList<>(List.of("John", "Peter", "Jenny"));
    assertThat(strings, hasItems("Peter"));
    assertThat(strings, not(hasItems("Peters")));
    assertThat(strings, hasSize(3));
    assertThat(strings, contains("Jenny"));

    // what is the difference between contains() and hasItems()

    assertThat(strings.size(), allOf( //
        lessThanOrEqualTo(100), //
        greaterThanOrEqualTo(0) //
    ));

  }

}
