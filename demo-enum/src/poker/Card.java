package poker;

import java.util.Objects;

public class Card {

  private Rank rank;

  private Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Card)) {
      return false;
    }

    Card card = (Card) obj;

    return Objects.equals(this.rank, card.rank)
        && Objects.equals(this.suit, card.suit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit);
  }

  @Override
  public String toString() {
    return suit.toString() + " " + rank.toString();
  }


  public static void main(String[] args) {

    Card c1 = new Card(Rank.ACE, Suit.DIAMOND);
    System.out.println(c1.toString());

    Card c2 = new Card(Rank.ACE, Suit.DIAMOND);
    System.out.println(c1.equals(c2)); // true
    System.out.println(c1.hashCode()); // -701714328
    System.out.println(c2.hashCode()); // -701714328

    Card c3 = new Card(Rank.TWO, Suit.DIAMOND);
    System.out.println(c1.equals(c3)); // false
    System.out.println(c1.hashCode()); // -701714328
    System.out.println(c3.hashCode()); // 1250023547

    Object b1 = new Object();
    b1.hashCode();


  }

}
