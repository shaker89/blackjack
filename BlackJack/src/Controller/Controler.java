package Controller;

import java.util.HashMap;

import model.Deck;
import model.Player;

public class Controler implements IControler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Deck d;
	

	public Deck getD() {
		return d;
	}

	public void setD(Deck d) {
		this.d = d;
	}

	// data structure to save the players details
	public HashMap<String, Player> Players;

	



	public HashMap<String, Player> getPlayers() {
		return Players;
	}

	public void setPlayers(HashMap<String, Player> players) {
		Players = players;
	}

	
	
	public void addPlayer(Player p){
		
		Players.put(p.getUserName(),p);
	}
	public Controler() {
		Players = new HashMap<String,Player >();
		addToPlayers("", "");
		

	}

	public void addToPlayers(String username, String Password) {
		
		Player p = new Player(100);
		p.setPassword("1234");
		p.setUserName("wael");
		Players.put("wael", p);
		

	}
	
	public void logInValid(){
		
		d = new Deck();
	}

	@Override
	// /hit until someone get busted
	public String hit() {
		// TODO Auto-generated method stub

		
		d.hit(true, false);
		int temp = chicking();
		if (temp == 1)
			return "the player is busted";
		if (temp == 2)
			return "the computer is busted";
		if (temp == 3)
			return "the player win";
		if (temp == 4)
			return "the computer is win";
		else
			return "";

	}

	@Override
	// this method meaning :the player will not play in this round
	public String stand() {
		d.getstand(false, true);
		int temp = chicking();
		if (temp == 1)
			return "the player is busted";
		if (temp == 2)
			return "the computer is busted";
		if (temp == 3)
			return "the player win";
		if (temp == 4)
			return "the computer is win";
		else
			return "";

	}

	@Override
	public void start() {

		// d.StartGame();
		getD().StartGame();

	}

	private int chicking() {
		int t = chickIFOverOrEqual21();
		if (t == 1)

			return 1;

		else if (t == 2)

			return 2;
		else {

		}
		return 0;
	}

	@Override
	public int chickIFOverOrEqual21() {
		int p;
		int c;
		if ((p = d.getWael().updateSomeOFCards()) > 21) {

			return 1;

		}
		if (p == 21)
			return 3;
		if ((c = d.getComputer().updateSomeOFCards()) > 21) {

			return 2;
		}
		if (c == 21)
			return 4;
		return 0;
	}

	@Override
	public void updateSumOFCards() {
		// TODO Auto-generated method stub
		d.getWael().updateSomeOFCards();
		d.getComputer().updateSomeOFCards();
	}

	@Override
	public int shuffle() {
		// TODO Auto-generated method stub

		System.out.println("###" + d.shuffle().nextInt());
		return 0;
	}

	@Override
	public int chickIFOver21() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void UpdateCoinsOfPlayer(){
		
		d.getWael().setMoney(d.getWael().getMoney()+20);
		
	}
	public void removeCoinsFromPlayer(){
		
		d.getWael().setMoney(d.getWael().getMoney()-20);
		
	}
	
	public void addUser(String Firstname , String LastName , String user , String pass 
			,int money){
		Player p = new Player(Firstname, LastName, money, user, pass);
		addPlayer(p);
		
		
	}
	

}
