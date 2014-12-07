/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import model.Constants;
/**
 * @author wael
 *
 */
public class Deck {
	
	//  ArrayList<Card> deckSet = new ArrayList<Card>(); 
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
//		int counter=numberOfCards=Constants.NumberOFCardsPerDeck;
//		for(int i=0;i<13;i++)
//			for(int j=0;j<4;j++){
//				if(counter--==0)
//					return;
//				cards.add(new Card(i, Suit.values()[j]));
//				System.out.println("i : "+i+"="+Suit.values()[j]);
//				
//				
				
				
//			}
		
		
	}
	public ArrayList<Card> getCards() {
		return cards;
	}
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	//starting the game
	public void StartGame(){
		
		
//		//make 52 cards
//		make52Cards();
//		//making two players
	
		ImageIcon card49 = new ImageIcon("2s.jpg");
	    Card twos = new Card(card49, 2,"spade", "Two");    
	    ImageIcon card45 = new ImageIcon("3s.jpg");
	    Card threes = new Card(card45, 3,"spade", "Three");
	    ImageIcon card1 = new ImageIcon("4s.jpg");
	    Card fours = new Card(card1, 4, "spade","Four");  
	    ImageIcon card13 = new ImageIcon("5s.jpg");
	    Card fives = new Card(card13, 5, "spade", "Five");
	    ImageIcon card27 = new ImageIcon("6s.jpg");
	    Card sixs = new Card(card27, 6, "spade", "Six");
	    ImageIcon card9 = new ImageIcon("7s.jpg");
	    Card sevens = new Card(card9, 7, "spade" , "Seven");
	    ImageIcon card17 = new ImageIcon("8s.jpg");
	    Card eights = new Card(card17, 8, "spade", "Eight");
	    ImageIcon card40 = new ImageIcon("9s.jpg");
	    Card nines = new Card(card40, 9,"spade", "Nine");
	    ImageIcon card50 = new ImageIcon("10s.jpg");
	    Card tens = new Card(card50, 10,"spade", "Ten");
	    ImageIcon card26 = new ImageIcon("jacks.jpg");
	    Card jacks = new Card(card26, 10, "spade", "Jack");
	    ImageIcon card33 = new ImageIcon("queens.jpg");
	    Card queens = new Card(card33, 10,"spade", "Queen");
	    ImageIcon card18 = new ImageIcon("kings.jpg");
	    Card kings = new Card(card18, 10, "spade", "King");
	    ImageIcon card15 = new ImageIcon("aces.jpg");
	    Card aces = new Card(card15, 11, "spade", "Ace");

	    ImageIcon card39 = new ImageIcon("2h.jpg");
	    Card twoh = new Card(card39, 2,"heart", "Two");
	    ImageIcon card2 = new ImageIcon("3h.jpg");
	    Card threeh = new Card(card2, 3, "heart","Three");
	    ImageIcon card8 = new ImageIcon("4h.jpg");
	    Card fourh = new Card(card8, 4, "heart", "Four");
	    ImageIcon card51 = new ImageIcon("5h.jpg");
	    Card fiveh = new Card(card51, 5,"heart", "Five");
	    ImageIcon card24 = new ImageIcon("6h.jpg");
	    Card sixh = new Card(card24, 6,"heart", "Six");
	    ImageIcon card34 = new ImageIcon("7h.jpg");
	    Card sevenh = new Card(card34, 7,"heart", "Seven");
	    ImageIcon card35 = new ImageIcon("8h.jpg");
	    Card eighth = new Card(card35, 8,"heart", "Eight");
	    ImageIcon card4 = new ImageIcon("9h.jpg");
	    Card nineh = new Card(card4, 9, "heart","Nine");
	    ImageIcon card7 = new ImageIcon("10h.jpg");
	    Card tenh = new Card(card7, 10,"heart", "Ten");
	    ImageIcon card3 = new ImageIcon("jackh.jpg");
	    Card jackh = new Card(card3, 10, "heart","Jack");
	    ImageIcon card25 = new ImageIcon("queenh.jpg");
	    Card queenh = new Card(card25, 10,"heart", "Queen");
	    ImageIcon card36 = new ImageIcon("kingh.jpg");
	    Card kingh = new Card(card36, 10,"heart", "King");
	    ImageIcon card10 = new ImageIcon("aceh.jpg");
	    Card aceh = new Card(card10, 11, "heart", "Ace");

	    ImageIcon card31 = new ImageIcon("2d.jpg");
	    Card twod = new Card(card31, 2,"diamond", "Two");
	    ImageIcon card30 = new ImageIcon("3d.jpg");
	    Card threed = new Card(card30, 3,"diamond", "Three");
	    ImageIcon card32 = new ImageIcon("4d.jpg");
	    Card fourd = new Card(card32, 4,"diamond", "Four");
	    ImageIcon card48 = new ImageIcon("5d.jpg");
	    Card fived = new Card(card48, 5,"diamond", "Five");
	    ImageIcon card5 = new ImageIcon("6d.jpg");
	    Card sixd = new Card(card5, 6, "diamond", "Six");
	    ImageIcon card41 = new ImageIcon("7d.jpg");
	    Card sevend = new Card(card41, 7,"diamond", "Seven ");
	    ImageIcon card14 = new ImageIcon("8d.jpg");
	    Card eightd = new Card(card14, 8, "diamond", "Eight");
	    ImageIcon card16 = new ImageIcon("9d.jpg");
	    Card nined = new Card(card16, 9, "diamond", "Nine");
	    ImageIcon card12 = new ImageIcon("10d.jpg");
	    Card tend = new Card(card12, 10, "diamond", "Ten");    
	    ImageIcon card11 = new ImageIcon("jackd.jpg");
	    Card jackd = new Card(card11, 10, "diamond", "Jack");
	    ImageIcon card6 = new ImageIcon("queend.jpg");
	    Card queend = new Card(card6, 10, "diamond", "Queen");
	    ImageIcon card47 = new ImageIcon("kingd.jpg");
	    Card kingd = new Card(card47, 10,"diamond", "King");
	    ImageIcon card20 = new ImageIcon("aced.jpg");
	    Card aced = new Card(card20, 11,"diamond", "Ace");

	    ImageIcon card28 = new ImageIcon("2c.jpg");
	    Card twoc = new Card(card28, 2,"club", "Two");
	    ImageIcon card38 = new ImageIcon("3c.jpg");
	    Card threec = new Card(card38, 3,"club", "Three");
	    ImageIcon card19 = new ImageIcon("4c.jpg");
	    Card fourc = new Card(card19, 4,"club", "Four");
	    ImageIcon card21 = new ImageIcon("5c.jpg");
	    Card fivec = new Card(card21, 5,"club", "Five");
	    ImageIcon card43 = new ImageIcon("6c.jpg");
	    Card sixc = new Card(card43, 6,"club", "Six");
	    ImageIcon card42 = new ImageIcon("7c.jpg");
	    Card sevenc = new Card(card42, 7,"club", "Seven");
	    ImageIcon card22 = new ImageIcon("8c.jpg");
	    Card eightc = new Card(card22, 8,"club", "Eight");
	    ImageIcon card23 = new ImageIcon("9c.jpg");
	    Card ninec = new Card(card23, 9,"club", "Nine");
	    ImageIcon card44 = new ImageIcon("10c.jpg");
	    Card tenc = new Card(card44, 10,"club", "Ten");   
	    ImageIcon card29 = new ImageIcon("jackc.jpg");
	    Card jackc = new Card(card29, 10,"club", "Jack");
	    ImageIcon card52 = new ImageIcon("queenc.jpg");
	    Card queenc = new Card(card52, 10,"club", "Queen");
	    ImageIcon card46 = new ImageIcon("kingc.jpg");
	    Card kingc = new Card(card46, 10,"club", "King");
	    ImageIcon card37 = new ImageIcon("acec.jpg");
	    Card acec = new Card(card37, 11,"club", "Ace");

	  
	    cards.add(acec);
	    cards.add(threeh);
	    cards.add(aces);
	    cards.add(jackh);
	    cards.add(nineh);
	    cards.add(sixd);
	    cards.add(queend);
	    cards.add(aceh);
	    cards.add(nined);
	    cards.add(fours);
	    cards.add(fourh);
	    cards.add(aced);
	    cards.add(sevens);
	    cards.add(tenh);
	    cards.add(jackd);
	    cards.add(tend);
	    cards.add(fives);
	    cards.add(eightd);
	    cards.add(eights);
	    cards.add(kings);
	    cards.add(fourc);
	    cards.add(fivec);
	    cards.add(eightc);
	    cards.add(ninec);
	    cards.add(sixh);
	    cards.add(queenh);
	    cards.add(jacks);
	    cards.add(sixs);
	    cards.add(twoc);
	    cards.add(jackc);
	    cards.add(threed);
	    cards.add(twod);
	    cards.add(fourd);
	    cards.add(queens);
	    cards.add(sevenh);
	    cards.add(eighth);
	    cards.add(kingh);
	    cards.add(threec);
	    cards.add(twoh);
	    cards.add(nines);
	    cards.add(sevend);
	    cards.add(sevenc);
	    cards.add(sixc);
	    cards.add(tenc);
	    cards.add(threes);
	    cards.add(kingc);
	    cards.add(kingd);
	    cards.add(fived);
	    cards.add(twos);
	    cards.add(tens);
	    cards.add(fiveh);
	    cards.add(queenc);
	    System.out.println("ddddd");
	    
	    
	    
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
	
		int temp1 = -1;
		int temp2 = -1;
		if(hitFlag1==true){
		 temp1=rand.nextInt(getNumberOfCards()-1);
		wael.addToHandArray(cards.get(temp1));
		System.out.println("card :"+cards.get(temp1));
		cards.remove(temp1);

		
	}
	if(hitFlag2==true){
		
	
		temp2=rand.nextInt(getNumberOfCards()-1);
			computer.addToHandArray(cards.get(temp2));
			System.out.println("card :"+cards.get(temp2));
			cards.remove(temp2);
	}	
	
	

	

}
	



}
