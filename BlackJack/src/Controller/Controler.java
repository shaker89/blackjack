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
	public void hit() {
		// TODO Auto-generated method stub
		String x = d.hit(true, true);
		
		int t=chicking();
			
			System.out.println("$$$");
		
			
			
		
		
		
		
		
		
	}

	@Override
	//this method meaning :the player will not play in this round
	public void stand() {
		d.getstand(false, true);
		int t=chicking();
		System.out.println("%%%%");
		
					
		
	}

	@Override
	public int start() {
		 
		//d.StartGame();
		int t= chicking();
		if(t==0){
			hit();
			return 0;
		}
		return t;
		
		
		
	}

	
	
	private int chicking() {
		int t=chickIFOver21();
		if(t==1)
		{
			System.out.println("the player is busted");
			return 1;
			
		}
		else if (t==2)
		{
			System.out.println("the dealer is busted");
		
		return 2;}
		
		else{
			System.out.println("no one is busted");
			
		return 0;}
	}
	@Override
	public int chickIFOver21() {
	
		if(d.getWael().updateSomeOFCards()>21)
		{	d.getWael().setStatus("Busted");
		
		return 1;
		
		}
		if(d.getComputer().updateSomeOFCards()>21){
			
		
			d.getComputer().setStatus("Busted");
	return 2;
		}
		return 0;
		}

	@Override
	public int chickIfOver17() {
		// TODO Auto-generated method stub
		if(d.getWael().updateSomeOFCards()>17);
			
			if(d.getComputer().updateSomeOFCards()>21){
				
			}
			return 0;
	}
	@Override
	public void updateSumOFCards() {
		// TODO Auto-generated method stub
		d.getWael().updateSomeOFCards();
		d.getComputer().updateSomeOFCards();
	}
	
	
	}


