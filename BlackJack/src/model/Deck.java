/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Random;

import model.Constants;
/**
 * @author wael
 *
 */
public class Deck {
	

	private  ArrayList<Card>  cards;
	private  Player wael;
	private Player computer;
	int numberOfCards;
	boolean moreThan17;
	public Random rand ;
	//hitFlag=true ;: the player will play
		public boolean hitFlag1;
		//standFlag=false ;: the computer will play
		public boolean hitFlag2;
	//standFlag=false ;: the player will play
	public boolean standFlag1;
	//standFlag=false ;: the computer will play
	public boolean standFlag2;
	public Deck() {
		super();
		this.cards = new ArrayList<Card>(52);
		moreThan17=false;
		rand=new Random();
		standFlag1=false;
		standFlag2=false;
	}
	
	public Player getWael() {
		return wael;
	}
	public void setWael(Player wael) {
		this.wael = wael;
	}
	public Player getComputer() {
		return computer;
	}
	public void setComputer(Player computer) {
		this.computer = computer;
	}
	
	public void setNumberOfCards(int numberOfCards) {
		this.numberOfCards = numberOfCards;
	}
	//make 52 cards when starting the game
	private void make52Cards() {
		// TODO Auto-generated method stub
		int counter=numberOfCards=Constants.NumberOFCardsPerDeck;
		for(int i=0;i<13;i++)
			for(int j=0;j<4;j++){
				if(counter--==0)
					return;
				cards.add(new Card(i, Suit.values()[j]));
				System.out.println("i : "+i+"="+Suit.values()[j]);
				
				
				
				
			}
		
		
	}
	public ArrayList<Card> getCards() {
		return cards;
	}
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	//starting the game
	public void StartGame(){
		
		
		//make 52 cards
		make52Cards();
		//making two players
		wael = new Player(100);
		 computer= new Player(100);
		 
	//give each players two cards
		hit(true,true);
		hit(true,true);
		
	}
	
	public int getNumberOfCards(){
		
		return cards.size();
		
	}
	
	//if this method get false ..that's mean that the player will not play this round
	public int getstand(boolean flg1,boolean flg2){
		if(!flg1){
			
			
		}
		if(!flg2){
			
		}
		return numberOfCards;
		
		
		
		
	}
	

	public void hit(boolean hitFlag1, boolean hitFlag2) {
	if(hitFlag1==true){
		
		int temp1=rand.nextInt(numberOfCards-1);
		wael.addToHandArray(cards.get(temp1));
		cards.remove(temp1);

		
	}
	if(hitFlag2==true){
		
	
		int temp2=rand.nextInt(numberOfCards-1);
			computer.addToHandArray(cards.get(temp2));
			cards.remove(temp2-1);
	}	
	

	

}
	



}
