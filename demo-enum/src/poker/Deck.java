package poker;

public class Deck {

  private Card[] cards;

  private Deck(int numberOfCards) {
    this.cards = new Card[numberOfCards];
    int idx = 0;
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        this.cards[idx++] = new Card(r, s);
      }
    }
  }

  public static Deck ofPoker() {
    return new Deck(52);
  }

  public static void main(String[] args) {
    Deck deck = Deck.ofPoker();
    //
    deck.overhand();
    deck.overhand();
    deck.overhand();
    deck.overhand();
  }

  public void overhand() {
    Card[] cards = this.cards.clone();
  }

  public void riffle() {

  }

}
