package basic;

public class Card {
	
	private Suit suit;
	private int value;
	private String color;
	
	
	public Card(Suit suit, int value) {
		super();
		this.suit = suit;
		this.value = value;
		
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
