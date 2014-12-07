package model;

import java.util.ArrayList;

public class Computer {
	private ArrayList<Card> HandArray;
	private int sumOfCards=0;
	private String status;
	public ArrayList<Card> getHandArray() {
		return HandArray;
	}
	public void setHandArray(ArrayList<Card> handArray) {
		HandArray = handArray;
	}
	public int getSumOfCards() {
		return sumOfCards;
	}
	public Computer() {
		super();
		HandArray = new ArrayList<Card>();
		status="Playing";
	}
	public void setSumOfCards(int sumOfCards) {
		this.sumOfCards = sumOfCards;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void addToHandArray(Card card){
		System.out.println("card --"+card.getValue());
	HandArray.add(card);
	}

	public int updateSomeOFCards(){
		
		for(Card i : getHandArray())
		{
			sumOfCards+=i.getValue();
		}
		System.out.println("sumOfCards:"+sumOfCards);
		return sumOfCards;
		}
	
	

}
