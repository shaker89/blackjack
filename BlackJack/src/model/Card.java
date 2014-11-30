package model;

import java.awt.Image;
import java.util.Random;

public class Card {
private int number;
private Suit suit;
private int value;
private Image d;
public int getValue() {
	return value;
}
@Override
public String toString() {
	return "Card [number=" + number + ", suit=" + suit + ", value=" + value
			+ "]";
}

public int getNumber() {
	return number;
}
public Card(int number, Suit suit) {
	super();
	this.number = number;
	this.suit = suit;
	SetValue();
}
private void SetValue() {
	
	// TODO Auto-generated method stub
if(number>1 && number<=10)
	value=number;
if(number==11 || number==12 || number==13)
	value=10;
if(number==1)
{
	
Random r = new Random(2);

if(r.nextInt()==1) number=1;
else number=2;

	
	
}
	
	
	
	
	}
	

public void setNumber(int number) {
	this.number = number;
}

public Suit getSuit() {
	return suit;
}
public void setSuit(Suit suit) {
	this.suit = suit;
}

}
