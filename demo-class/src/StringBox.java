public class StringBox { // Person

  private char[] characters; // object reference type

  public StringBox(String str) {
    this.characters = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      characters[i] = str.charAt(i);
    }
  }

  // Instance method
  public boolean isEmpty() {
    // check if the char[] is empty
    return this.characters.length == 0;
  }

  public int length() {
    // return the char array length
    return this.characters.length;
  }

  public StringBox concat(String str) {
    //
    int idx = 0;
    char[] newArr = new char[this.characters.length + str.length()];
    for (int i = 0; i < this.characters.length; i++) {
      newArr[i] = characters[i];
    }
    for (int i = 0; i < str.length(); i++) {
      newArr[idx++] = str.charAt(i);
    }
    return new StringBox(String.valueOf(newArr));
  }

  // Similar to Stringbuilder append()
  public StringBox concat2(String str) {
    //
    int idx = 0;
    char[] newArr = new char[this.characters.length + str.length()];
    for (int i = 0; i < this.characters.length; i++) {
      newArr[i] = characters[i];
    }
    for (int i = 0; i < str.length(); i++) {
      newArr[idx++] = str.charAt(i);
    }
    this.characters = newArr;
    return this;
  }

  public StringBox replace(char from, char to) {
    return null;
  }

  public StringBox replace(String from, String to) {
    return null;
  }

  @Override
  public String toString() {
    return String.valueOf(this.characters);
  }

  public static void main(String[] args) {
    StringBox s = new StringBox("hello");
    System.out.println(s.toString()); // hello

    StringBox s2 = s.concat("world");
    System.out.println("s2=" + s2.toString()); // helloworld
    System.out.println("s=" + s.toString()); // hello

    StringBox s3 = s.concat2("world");
    System.out.println("s3=" + s3.toString()); // helloworld
    System.out.println("s=" + s.toString()); // helloworld

  }

}
