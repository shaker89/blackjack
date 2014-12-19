package model;

import java.io.Serializable;
import java.util.ArrayList;

<<<<<<< HEAD
public class Player extends Computer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
=======
public class Player extends Computer {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public Player(String firstName, String lastName, int money, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Money = money;
		this.userName = userName;
		Password = password;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

>>>>>>> branch 'master' of https://github.com/shaker89/blackjack
	private int Money ;
	private String userName;
	private String Password;
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}



//update the sum of the cards in the player's hand

	
	


	
public Player(int i) {
		// TODO Auto-generated constructor stub
	super();
	setMoney(i);
	
}




	
	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		this.Money = money;
	}

/*	private String ID;
	
private String SurName;
private String Email;

private int numberOfRoundVectorirs;
private int numberOfLossing;
private int numberOfRoundsPLaying;
*/
//	@override
public int updateSomeOFCards(){
		
		for(Card i : getHandArray())
		{
			sumOfCards+=i.getValue();
		}
		System.out.println("sumOfCards:"+sumOfCards);
		return sumOfCards;
		}



	

}




