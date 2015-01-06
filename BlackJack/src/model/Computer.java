package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Computer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//array of cards that the player have (dealer or player)
	private ArrayList<Card> HandArray;
	
	protected int sumOfCards=0;
	public ArrayList<Card> getHandArray() {
		return HandArray;
	}
	
	public void removeHandArray(){
		HandArray = new ArrayList<Card>();
		
	}
//	public void setHandArray(ArrayList<Card> handArray) {
//		HandArray = handArray;
//	}
	public int getSumOfCards() {
		updateSomeOFCards();
		return sumOfCards;
	}
	public Computer() {
		super();
		HandArray = new ArrayList<Card>();
		
	}
	public void setSumOfCards(int sumOfCards) {
		this.sumOfCards = sumOfCards;
	}
	// add card to hand of the player 
	public void addToHandArray(Card card){
		System.out.println("card --"+card.getValue());
	HandArray.add(card);
	}
// update the sum of the cards 
	public int updateSomeOFCards(){
		sumOfCards=0;
		for(Card i : getHandArray())
		{
			sumOfCards+=i.getValue();
		}
		System.out.println("sumOfCards:"+sumOfCards);
		return sumOfCards;
		}
	
	

}
