package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.Shape;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.soap.Text;

import model.Card;
import model.Deck;
import Controller.Controler;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.Shape;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.xml.soap.Text;

import model.Card;
import model.Deck;
import Controller.Controler;
public class MainFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	//declare the desktop pane
	private JDesktopPane jdp = new JDesktopPane();
	
	JPanel twoDPanel = new JPanel();
	JLabel ima;
	JButton startGame;
	JButton hit;
	JButton stand;
	JButton shuffle;
	//JTextField theResult = new JTextField();;
	// declare the labels to put the images on it
	//Label whoBusted;
	ArrayList<JLabel> arrayOfPicturesForPlayer = new ArrayList<JLabel>();;
	ArrayList<JLabel> arrayOfPicturesForDealer = new ArrayList<JLabel>();;
	//ArrayList<JLabel> arrayOfPictures = new ArrayList<JLabel>();; 
	JTextField money ;
	String userName;
	JLabel bjImage;
	JButton Image5;
	JButton Image10;
	JButton bjImage25;
	JButton bjImage500;
	JButton bjImage100;
	JButton bjImage5000;
	int StartPointXP=200;
	int StartPointYP=300;
	boolean CoordinatorXP;
	boolean CoordinatorYP;
	boolean CoordinatorXD;
	boolean CoordinatorYD;
	int corXD;
	int corYD;
	int corXP;
	int corYP;
	int standPosition=0;
	private int StartPointXD;

	private int StartPointYD;

	int monee;
	private static final long serialVersionUID = 1L;
     private final Controler system;

	  public MainFrame(final Controler system, String userN, int money1) {
		  super("***  Black Jack 2014  ***");
			this.system = system;
	setSize(200, 200);	
	userName=userN;
	monee= money1;
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jdp.setLayout(null);
		jdp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
			this.setContentPane(jdp);
			this.setBounds(0, 0, 1367, 737);
			java.net.URL url = LogIn_Frame.class.getResource("/pictures/background.jpg");
			 bjImage = new JLabel(new ImageIcon(url));
			bjImage.setBounds(0,0,this.getWidth(),this.getHeight());
			addButtons();

			
			
			
			
			jdp.add(bjImage);
			
			twoDPanel.setBounds(0,0,this.getWidth(),this.getHeight()-150);
			twoDPanel.setOpaque(false);
			twoDPanel.setLayout(null);

			jdp.add(twoDPanel, new Integer(1), 0);
		
		jdp.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(final WindowEvent arg0) {
				if(JOptionPane.showInternalConfirmDialog(jdp, 
						"you are sure you want to exit " 
						, "",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					dispose();	
				}
				 system.saveSystem();

				
			}
		});

	}
	

		
	
	private void addButtons() {
		// TODO Auto-generated method stub
		
		 startGame = new JButton("Deal");
	
		startGame.setBounds(400,339,120,40);
		startGame.setFont(new Font("", Font.BOLD, 9));
		startGame.addActionListener(this);

		jdp.add(startGame);
		
		

		 hit = new JButton("hit");
		hit.setBounds(200,200,80,40);
		hit.setFont(new Font("", Font.BOLD, 9));
		hit.addActionListener(this);
		jdp.add(hit);
		
		
		 stand = new JButton("stand");
		stand.setBounds(200,250,80,40);
		stand.setFont(new Font("", Font.BOLD, 9));
		stand.addActionListener(this);
		jdp.add(stand);

		
		 shuffle = new JButton("shuffle cards");
		shuffle.setBounds(200,300,140,40);
		shuffle.setFont(new Font("", Font.BOLD, 9));
		shuffle.addActionListener(this);
		jdp.add(shuffle);
		
//		 whoBusted = new Label("the result");
//		 whoBusted.setBounds(550, 600, 80, 40);
//		 whoBusted.setFont(new Font("", Font.BOLD, 9));
//		 		 jdp.add(whoBusted);
//		 
//		 		
//		 		theResult.setBounds(700, 600, 80, 40);
//		 		theResult.setFont(new Font("", Font.BOLD, 9));
//		 		jdp.add(theResult);
		 		
		 		
		 		money =  new JTextField();
				
		 		money.setBounds(650, 600, 80, 40);
		 		money.setFont(new Font("", Font.BOLD, 9));
		 		money.setText(system.getPlayers().get(userName).getMoney()+"");
		 		money.setVisible(true);
		 		jdp.add(money);		
		 		
		
		 		java.net.URL url1 = MainFrame.class.getResource("/pictures/10.jpg");
				JButton chip10 = new JButton ("",new ImageIcon(url1));
		
		chip10.setBounds(1000,100,120,120);
		chip10.setFont(new Font("", Font.BOLD, 9));
		chip10.addActionListener(this);
		jdp.add(chip10);
		 		
		 		
		 		
		 		
		 		java.net.URL url = MainFrame.class.getResource("/pictures/exxit.png");
				JButton exit = new JButton ("",new ImageIcon(url));
		
		exit.setBounds(1000,600,90,80);
		exit.setFont(new Font("", Font.BOLD, 9));
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(JOptionPane.showInternalConfirmDialog(jdp, 
							"you are sure you want to exit " 
							, "",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					 dispose();	
					}
					 system.saveSystem();

					

				
					
						
			}
		});
		jdp.add(exit);
		hit.setVisible(false);
		stand.setVisible(false);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String  cmd = e.getActionCommand();		
// if we press deal 
		if(cmd.equals("Deal"))
		{	system.start();
		//if not the first round
		if (arrayOfPicturesForDealer.size()!=0)
			{
			ima.setVisible(false);
			
			ima=new JLabel();
			
			for(int i=0;i<arrayOfPicturesForDealer.size();)
			{
				//hide the cards and remove the pictures
				arrayOfPicturesForDealer.get(i).setVisible(false);
				arrayOfPicturesForDealer.remove(i);
			}
			for(int i=0;i<arrayOfPicturesForPlayer.size();)
			{
				//hide the cards and remove the pictures
				arrayOfPicturesForPlayer.get(i).setVisible(false);
				arrayOfPicturesForPlayer.remove(i);
			}
				
				
				twoDPanel.repaint();
			}
			
			startGame.setVisible(false);
			

			//make the pictures 
			//two pictures for the computer and two pictures for the user
		FlyTheFirstCard();
			FlyTheSecondCard();
			twoDPanel.repaint();
		
		}
		
		 if(cmd.equals("hit")){

			//the method return "" if no one won
			 
			 
			  
				String x=  system.hit();
				  
				// show the card that the user play it
				arrayOfPicturesForPlayer.add(new JLabel(system.getD().getchalenger().getHandArray().get(system.getD().getchalenger().getHandArray().size()-1).getCardpic()));
		//arrayOfPicturesForPlayer.get(arrayOfPicturesForPlayer.size()-1).setBounds(800+30*(system.getD().getchalenger().getHandArray().size()-2),470,100,100);


		            	twoDPanel.add(arrayOfPicturesForPlayer.get(arrayOfPicturesForPlayer.size()-1));
		    			//arrangeTheCardsOfPlayer();
		            	restartAll();
		           if( 	moveCardDown(x,arrayOfPicturesForPlayer.size()-1,(corXP=800+30*(system.getD().getchalenger().getHandArray().size()-2)),(corYP=468))==true)
		           {	twoDPanel.repaint();

		           
				
		           }
				
			
		}
		
	
		
		 if(cmd.equals("stand")){
			 
			 ActionListener listener = new ActionListener(){
				 String  x;
				 public void actionPerformed(ActionEvent event){ 	
				    x= system.stand();
				        arrayOfPicturesForDealer.add(new JLabel(system.getD().getComputer().getHandArray().get(system.getD().getComputer().getHandArray().size()-1).getCardpic()));
//				        arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1).setBounds(800+30*(system.getD().getComputer().getHandArray().size()-2),0,100,100);
				         arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1).setVisible(true);
			            	restartAll();
moveCardUp(x,arrayOfPicturesForDealer.size()-1, 800+30*(system.getD().getComputer().getHandArray().size()-2), 0);		
		twoDPanel.add(arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1));
	twoDPanel.repaint();
					
	
				           
				  }};
	 Timer timer = new Timer(1000, listener);
	    timer.setRepeats(false);
	    
	    timer.start();
			 
				
		 }

		 
		 if(cmd.equals("shuffle cards")){
				system.shuffle();
				
			}
		 
		 
	
		 
		 
	}
	
	
	
	
	
	public void TurnTheCard(){
		
		ima.setVisible(false);
		arrayOfPicturesForDealer.get(0).setBounds(580,00,100,100);
		arrayOfPicturesForDealer.get(0).setVisible(true);
		
		twoDPanel.add(arrayOfPicturesForDealer.get(0));
		
		twoDPanel.repaint();
	}
	
	
	
	
	
	


public   boolean    moveCardUp(String x, int index,int corXd,int corYd){
   
        	new java.util.Timer().schedule( 
        	        new java.util.TimerTask() {
        	            @Override
        	            
        	            public  void run() {
        	
        		
        	
        	            	if(index!=-1){
        	            	arrayOfPicturesForDealer.get(index).setVisible(false);
        	            	arrayOfPicturesForDealer.get(index).setBounds(StartPointXD,StartPointYD,100,100);
        	    			
        	    			arrayOfPicturesForDealer.get(index).setVisible(true);
        	            	
        	            	twoDPanel.add(arrayOfPicturesForDealer.get(index));
        	            	}
        	            	else {
        	            		ima.setVisible(false);
        	            		ima.setBounds(StartPointXD,StartPointYD,100,100);
        	            		ima.setVisible(true);
        	            		twoDPanel.add(ima);
        	            	}
        	            	twoDPanel.repaint();
        	            	
        	    			if(isCoordinatorXD()==true)
        	    			StartPointXD+=5;
        	    			if(StartPointXD>corXd){
        	    				setCoordinatorXD(false);
        	    			StartPointYD-=5;
        	            	
        	            
        	    			}
        	    			
        	    			if(StartPointYD<corYd){
        			            setCoordinatorYD(false);
        			            if(!x.equals("")){
        							
        							hit.setVisible(false);
        							stand.setVisible(false);
        					startGame.setVisible(true);
        										
        						TurnTheCard();
        						twoDPanel.repaint();
        						
        					JOptionPane.showInternalMessageDialog(getContentPane(), x+"");

        										

        										
        										if(x.equals("the computer busted") || x.equals("the player win"))
        										{
        											system.UpdateCoinsOfPlayer();
        											money.setText(system.getD().getchalenger().getMoney()+"");
        											
        										}
        										else if(x.equals("the player is busted") || x.equals("the computer win")){
        											system.removeCoinsFromPlayer();
        											money.setText(system.getD().getchalenger().getMoney()+"");
        											
        										}
        										money.repaint();
        										system.getD().getComputer().removeHandArray();
        										system.getD().getchalenger().removeHandArray();
        										  this.cancel();
        									}
        			            this.cancel();
        			    			}
        			    			
        	} 			
        	            },0,10);
    	    return true;
    
}
    
	


public void standPosition(){
	
	
	
}

public void ResetCoordiatorsP(){
	
	CoordinatorXP=false;
	CoordinatorYP=false;
}

public void setCoordiatorsTrueP(){
	
	CoordinatorXP=true;
	CoordinatorYP=true;
}
public void ResetCoordiatorsD(){

CoordinatorXD=false;
CoordinatorYD=false;
}

public void setCoordiatorsTrueD(){

CoordinatorXD=true;
CoordinatorYD=true;
}

	
	
	
public  boolean    moveCardDown(String x, int index,int corXp,int corYp){

		 
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		             
		            	arrayOfPicturesForPlayer.get(index).setVisible(false);
		            	arrayOfPicturesForPlayer.get(index).setBounds(StartPointXP,StartPointYP,100,100);
		    			
		    			arrayOfPicturesForPlayer.get(index).setVisible(true);
		            	
		            	twoDPanel.add(arrayOfPicturesForPlayer.get(index));
		            	
	twoDPanel.repaint();
		    			
		    			if(isCoordinatorXP()==true)
		    			StartPointXP+=5;
		    			if(StartPointXP>corXp){
		    				setCoordinatorXP(false);
		    			StartPointYP+=5;
		    			
		    			}
		    			if(StartPointYP>corYp){
		            setCoordinatorYP(false);
	    			if(x!=""){

    					hit.setVisible(false);
    		stand.setVisible(false);
    					startGame.setVisible(true);
    					
    					
    					TurnTheCard();
    				 
    				      
    						JOptionPane.showInternalMessageDialog(getContentPane(), x+"");
    					if(x.equals("the computer busted") || x.equals("the player win"))
    					{
    						system.UpdateCoinsOfPlayer();
    						money.setText(system.getD().getchalenger().getMoney()+"");
    		
    						

    					}
    					else if(x.equals("the player is busted") || x.equals("the computer win")){
    						system.removeCoinsFromPlayer();
    						money.setText(system.getD().getchalenger().getMoney()+"");
    		
    						


    					}
    					money.repaint();
    					system.getD().getComputer().removeHandArray();
    					system.getD().getchalenger().removeHandArray();
    					
    				}
		            this.cancel();
		            
		    			}
		    			
		    			
		        		
		            	
			    		
		            }
		            
		            	
		        },0,10);
		
	
	return true;
		    	
	}

	public void RestartXAndYForPlayer(){
		this.StartPointXP=200;
		this.StartPointYP=300;
	}
	public void RestartXAndYForDealer(){
		this.StartPointXD=200;
		this.StartPointYD=200;
	}
	

	public boolean isCoordinatorXP() {
		return CoordinatorXP;
	}




	public void setCoordinatorXP(boolean coordinatorXP) {
		CoordinatorXP = coordinatorXP;
	}




	public boolean isCoordinatorYP() {
		return CoordinatorYP;
	}




	public void setCoordinatorYP(boolean coordinatorYP) {
		CoordinatorYP = coordinatorYP;
	}




	public boolean isCoordinatorXD() {
		return CoordinatorXD;
	}




	public void setCoordinatorXD(boolean coordinatorXD) {
		CoordinatorXD = coordinatorXD;
	}




	public boolean isCoordinatorYD() {
		return CoordinatorYD;
	}




	public void setCoordinatorYD(boolean coordinatorYD) {
		CoordinatorYD = coordinatorYD;
	}


	public void FlyTheFirstCard(){
		arrayOfPicturesForPlayer.add(new JLabel(system.getD().getchalenger().getHandArray().get(0).getCardpic()));
		
		arrayOfPicturesForPlayer.get(0).setBounds(200,300,100,100);
		
		twoDPanel.repaint();
		arrayOfPicturesForPlayer.get(0).setVisible(true);

		arrayOfPicturesForDealer.add(new JLabel(system.getD().getComputer().getHandArray().get(0).getCardpic()));

		//		twoDPanel.add(arrayOfPicturesForPlayer.get(0));
		restartAll();
	 
		moveCardDown("",0,(corXP=600),(corYP=468));

		 java.net.URL hide = MainFrame.class.getResource("/pictures/cardd.jpg");
		    ImageIcon hidden = new ImageIcon(hide);
			ima = new JLabel(hidden);
			ima.setBounds(150,150,100,100);
			twoDPanel.add(ima);
			twoDPanel.repaint();
		
		moveCardUp("",-1,(corXD=600),(corYD=0));

	
		
	}
	
	
	public void restartAll(){
		
		RestartXAndYForPlayer();
		setCoordiatorsTrueD();
		RestartXAndYForDealer();
	setCoordiatorsTrueP();
		
	}
	
public void FlyTheSecondCard(){
	
	ActionListener listener = new ActionListener(){
		  public void actionPerformed(ActionEvent event){
			
				arrayOfPicturesForPlayer.add(new JLabel(system.getD().getchalenger().getHandArray().get(1).getCardpic()));
  			arrayOfPicturesForPlayer.get(1).setBounds(200,300,100,100);
//  			arrayOfPicturesForPlayer.get(0).setVisible(false);
//  			twoDPanel.repaint();
  			arrayOfPicturesForPlayer.get(1).setVisible(true);
//  			arrayOfPicturesForPlayer.get(0).setVisible(true);

  			twoDPanel.repaint();
         twoDPanel.add(arrayOfPicturesForPlayer.get(1));
			  restartAll();
   twoDPanel.repaint();
  		    
 			arrayOfPicturesForDealer.add(new JLabel(system.getD().getComputer().getHandArray().get(1).getCardpic()));
		arrayOfPicturesForDealer.get(1).setBounds(150,150,100,100);
//			twoDPanel.repaint();
			arrayOfPicturesForDealer.get(1).setVisible(true);
  			twoDPanel.repaint();
		twoDPanel.add(arrayOfPicturesForDealer.get(1));
			
			moveCardDown("",1,(corXP=700),(corYP=468));
	  moveCardUp("",1,(corXD=700),(corYD=0));
	  		   twoDPanel.repaint();
	  		
			           // 	twoDPanel.add(arrayOfPicturesForDealer.get(1));
		  }
	};
	
	Timer timer = new Timer(3000, listener);
    timer.setRepeats(false);
    timer.start();
    
	ActionListener listener2 = new ActionListener(){
		  public void actionPerformed(ActionEvent event){
	 
			  hit.setVisible(true);
				stand.setVisible(true);
		  }
	    
	};
		
		
		 Timer timer2 = new Timer(6000, listener2);
		    timer2.setRepeats(false);
		    timer2.start();
	
}

	
}
