package Controller;

import java.util.HashMap;

import model.Deck;

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
	//data structure to save the players details
	public HashMap<String,String> Players;
	
	
	public HashMap<String, String> getPlayers() {
		return Players;
	}
	public void setPlayers(HashMap<String, String> players) {
		Players = players;
	}
	public  Controler(){
		Players= new HashMap<String, String>();
		addToPlayers("wael", "1234");
		if(Players.containsKey("wael") && Players.containsValue( "1234"));
		d =new Deck();
		
			
	}
	
	public void addToPlayers(String username,String Password){
		Players.put("wael", "1234");
		
		
	}
	
	@Override
	
	///hit until someone get busted
	public String hit() {
		// TODO Auto-generated method stub
		 d.hit(true, true);
		 int temp=chicking();
		if(temp==1)
		return "the player is busted";
			if (temp==2)
			return "the computer is busted";
			if(temp==3)
				return "the player win";
			if (temp==4)
			return "the computer is win";
			else return "";
		
	}

	@Override
	//this method meaning :the player will not play in this round
	public String stand() {
		d.getstand(false, true);
		 int temp=chicking();
			if(temp==1)
			return "the player is busted";
				if (temp==2)
				return "the computer is busted";
				if(temp==3)
					return "the player win";
				if (temp==4)
				return "the computer is win";
				else return "";
					
		
	}

	@Override
	public void start() {
		 
		//d.StartGame();
		getD().StartGame();
		
		
		
	}

	
	
	private int chicking() {
		int t=chickIFOverOrEqual21();
		if(t==1)
		
			
			return 1;
			
		
		else if (t==2)
		
		
		return 2;
		else
		{
			
			
			
			
		}
		return 0;
	}
	@Override
	public int chickIFOverOrEqual21() {
	int p;
	int c;
		if((p=d.getWael().updateSomeOFCards())>21)
		{	
		
		return 1;
		
		}
		if(p==21)
			return 3;
		if((c=d.getComputer().updateSomeOFCards())>21){
			
		
	return 2;
		}
			if(c==21)
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
	
		System.out.println("###"+	d.shuffle().nextInt());
		return 0;
	}
	@Override
	public int chickIFOver21() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	
	
	


