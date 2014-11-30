package model;

import java.util.ArrayList;

public class Player extends Computer {
	private String Name= "eee";
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
	Money =i;
	
}


public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		Money = money;
	}

/*	private String ID;
	
private String SurName;
private String Email;

private int numberOfRoundVectorirs;
private int numberOfLossing;
private int numberOfRoundsPLaying;
*/




	

}




