public enum Direction {

  NORTH(1), EAST(2), WEST(-2), SOUTH(-1),;

  private int value;

  private Direction(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  // static method
  public static Direction opposite(Direction direction) {
    return Direction.fromValue(direction.getValue() * -1);

  }

  // instance method
  public Direction opposite() {
    return Direction.fromValue(this.value * -1);
  }

  public boolean isOpposite(Direction direction) {
    return this == Direction.fromValue(direction.getValue() * -1);
  }

  private static Direction fromValue(int value) {
    for (Direction d : values()) {
      if (d.getValue() == value) {
        return d;
      }
    }
    return null;

  }

  public static void main(String[] args) {
    String result = Direction.WEST.opposite().name(); // result = "EAST"
    String result2 = Direction.WEST.opposite().toString(); // result2 = "EAST"
    int result3 = Direction.WEST.opposite().hashCode(); // Enum.class hashcode()

    System.out.println(Direction.WEST.opposite()); // Direction.EAST
    System.out.println(Direction.opposite(Direction.WEST)); // Direction.EAST
  }

}
