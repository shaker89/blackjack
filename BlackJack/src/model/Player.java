package model;

import java.io.Serializable;
import java.nio.file.CopyOption;
import java.util.ArrayList;


public class Player extends Computer implements Serializable,Comparable<Player>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String firstName;
	private String lastName;
	
	private int Money ;
	private String userName;
	private String Password;
	
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
		this.Money = money;
		this.userName = userName;
		Password = password;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//>>>>>>> branch 'master' of https://github.com/shaker89/blackjack
	
	
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

	
	


	
public Player(String us,int i) {
		// TODO Auto-generated constructor stub
	super();
	setMoney(i);
this.userName=us;	
}




	
	public Player() {
	// TODO Auto-generated constructor stub
}


	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		this.Money = money;
	}


	@Override
	public int compareTo(Player o) {
		if(this.Money<o.Money)
			return 1;
		if(this.Money>o.Money)
			return -1;
		return 0;
	}

/*	private String ID;
	
private String SurName;
private String Email;

private int numberOfRoundVectorirs;
private int numberOfLossing;
private int numberOfRoundsPLaying;
*/
//	@override



	

}




