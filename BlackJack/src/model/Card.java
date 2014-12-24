package model;

import java.awt.Image;
import java.io.Serializable;
import java.util.Random;

import javax.swing.ImageIcon;

public class Card implements Serializable  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int number;
private String suit;
private int value;
private ImageIcon cardpic;
public String getSuit() {
	return suit;
}
public void setSuit(String suit) {
	this.suit = suit;
}
public ImageIcon getCardpic() {
	return cardpic;
}
public void setCardpic(ImageIcon cardpic) {
	this.cardpic = cardpic;
}
public void setValue(int value) {
	this.value = value;
}
public int getValue() {
	return value;
}
public Card(ImageIcon cardpic,int number, String suit, String value ) {
	super();
	this.number = number;
	this.suit = suit;
	SetValue();
	this.cardpic = cardpic;
}
@Override
public String toString() {
	return "Card [number=" + number + ", suit=" + suit + ", value=" + value
			+ "]";
}

public int getNumber() {
	return number;
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



}
