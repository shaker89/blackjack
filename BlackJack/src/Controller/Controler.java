package Controller;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import model.Deck;
import model.Player;

public final  class Controler implements IControler,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	/** Singleton instance */
	private static  Controler instance = null;
	
	
	
	
	private Deck d;
	private String user;
	

	public static Controler getInstance() {
		if (instance == null)
			instance = new Controler();
		else System.out.println("haaaaaaahaaaa");
		return instance;
	}
	
	public Deck getD() {
		return d;
	}

	public void setD(Deck d) {
		this.d = d;
	}

	// data structure to save the players details
	public   HashMap<String, Player>  Players ;

	



	public  HashMap<String, Player> getPlayers()  {
		return Players;
	}

	public void setPlayers(HashMap<String, Player> players) {
		Players = players;
	}

	
	
	public boolean addPlayer(Player p){
		if(p!=null ){
		Players.put(p.getUserName(),p);
		saveSystem();
			return true;
		}return false;
	}
	public Controler() {
		Players = new HashMap<String,Player >();
	//	addToPlayers("", "");
		

	}


	
	public void logInValid(String user){
		
	this.user=user;
	}

	@Override
	// /hit until someone get busted
	public String hit() {
		// TODO Auto-generated method stub

		
		d.hit(true, false);
		return  chickIFOverOrEqual21();
		

	}

	@Override
	// the method meaning :the player will not play in this round
	public String stand() {
		d.getstand(false, true);
		return  chickIFOverOrEqual21();
//		if (temp == 1)
//			return "the player is busted";
//		if (temp == 2)
//			return "the player win";
//		if (temp == 3)
//			return "the computer busted";
//		if (temp == 4)
//			return "the computer win";
//		else
//			return "";

	}

	@Override
	public void start() {

		
		for(Map.Entry<String,Player>  x : getPlayers().entrySet())
		{System.out.println(">>>>>>"+x.getKey() + x.getValue().getFirstName() +"  "+x.getValue().getMoney());
			if(x.getKey().equals(user))
			{
			
		d = new Deck(user,x.getValue().getMoney());
			return;}
		}
	}

//	private String chicking() {
//		System.out.println("$"+d.getchalenger().getMoney());
//		//int t = chickIFOverOrEqual21();
//		
//		switch(t){
//		case 1 : return "the player is busted";
//		case 2 : return "the player win";
//		case 3 : return "the computer busted";
//		case 4: return "the computer win";
//		
//		}
//		
//		
//		return 0;
//	}

	@Override
	public String chickIFOverOrEqual21() {
		int p=d.getchalenger().updateSomeOFCards();
		int c= d.getComputer().updateSomeOFCards();
		if(p>17 && p<21 && p>c)
			return "the player win";
			if(c>17 && c<21 && c>p)
				return "the computer win";
			
		if (p  > 21) {

			return "the player is busted";

		}
		
		
		if (p == 21)
			return "the player win";
		if (c  > 21) {

			return "the computer busted";
		}
		if (c == 21)
			return "the computer win";
		
		return "";
	}

	@Override
	public void updateSumOFCards() {
		// TODO Auto-generated method stub
		d.getchalenger().updateSomeOFCards();
		d.getComputer().updateSomeOFCards();
	}

	@Override
	public int shuffle() {
		// TODO Auto-generated method stub

		 d.shuffle();
		return 0;
	}

	
	
	public void UpdateCoinsOfPlayer(){
		d.getchalenger().setMoney(d.getchalenger().getMoney()+20);
		System.out.println("adding "+(d.getchalenger().getMoney()));
		getPlayers().get(d.getchalenger().getUserName()).setMoney(d.getchalenger().getMoney());
		System.out.println("**"+getPlayers().get(d.getchalenger().getUserName()).getMoney());

		
	}
	public void removeCoinsFromPlayer(){
		d.getchalenger().setMoney(d.getchalenger().getMoney()-20);
System.out.println("removee "+(d.getchalenger().getMoney()));
		
getPlayers().get(d.getchalenger().getUserName()).setMoney(d.getchalenger().getMoney());
System.out.println("**"+getPlayers().get(d.getchalenger().getUserName()).getMoney());


		
		
	}
	
	

	/**
	 * Saves the system's data into BlackJack.ser file
	 */

	public void saveSystem() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("BlackJack.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (oos != null) {
					oos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}}

	public boolean addUser(String Firstname , String LastName , String user , String pass 
			,int money){
	if(getPlayers().containsKey(user))
return false;
		
		Player p = new Player(Firstname, LastName, money, user, pass);
		if(addPlayer(p)) return true;
		return false;
		
		
	}
	

}
