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
	int counter=0;
	int counter2=0;
	
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
private 	JButton chip1,chip5,chip25,chip10;
	private int StartPointYD;
JLabel temo= new JLabel();
	int monee;
	private static final long serialVersionUID = 1L;
     private final Controler system;

	  public MainFrame(final Controler system, String userN, int money1) {
		  super("***  Black Jack 2014  ***");
			this.system = system;
	setSize(200, 200);	
	userName=userN;
	monee= money1;
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
jdp.setLayout(null);
		jdp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
			this.setContentPane(jdp);
			this.setBounds(0, 0, 1367, 737);
			java.net.URL url = LogIn_Frame.class.getResource("/pictures/background.jpg");
			 bjImage = new JLabel(new ImageIcon(url));
			bjImage.setBounds(0,0,this.getWidth(),this.getHeight());
			addButtons();

			setchips();
			
			
			
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
							JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					 dispose();	
					}
					 system.saveSystem();

					

				
					
						
			}
		});

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
			setChipsFalse();


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
			 
			
				
			stand();   
	           
	
//				}
		 }

		 
		 if(cmd.equals("shuffle cards")){
				system.shuffle();
				
			}
		 
		 
	
		 
		 
	}
	
	
	
	public void stand(){
		JLabel countLabel = new JLabel("0");
		boolean bool=true;
		
		JLabel p3=new JLabel("false");
		
			JLabel p=new JLabel("");
			
//			while((
//			ActionListener listener=null;
//			
//		 listener = new ActionListener(){
			
//			 java.util.Timer t1 = 	new java.util.Timer();
//		      
//			 java.util.TimerTask t1Task=null;   
//   	       t1Task=  new java.util.TimerTask() {
//		int co=0;
////				
//				@Override
//  	            
//  	            public  void run() {
//	if(temo.getText().equals("b"))
//		this.cancel();
//	co++;	
//	counter++;
//countLabel.setText(""+co);
//System.out.println("coooooo +"+ co);
//					p.setText(system.stand());
//					if(!p.getText().equals(""))
//						this.cancel();
//					else{
//					System.out.println("<<"+p.getText());
//					  if(p3.getText().equals(true))
//					this.cancel();
//					  if(Integer.parseInt(countLabel.getText())==-1){
//						 System.out.println("==========================");
//						  return;
//					  }
//					  else{
					
	
	
moveCardUp(p.getText(),arrayOfPicturesForDealer.size()-1, 800+30*(system.getD().getComputer().getHandArray().size()-2), 0,0);		
//twoDPanel
//.add(arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1));
//twoDPanel.repaint();
//co++;
//		if(!p.getText().equals(""))
//		{
//			p3.setText("true");
//			System.out.println("vvvvvvvvvvvv");
//			co=-1;
//			this.cancel();
//		
//		
//		}
//		else {
//			
//		
//		}
//					  		  	  }
//					 }};				  
//			int d=0;
//			t1.scheduleAtFixedRate(t1Task, 10+Integer.parseInt(countLabel.getText())*12, 10);
//		
//		    }

		
				 
		
		
	}
	
	
	public void TurnTheCard(){
		
		ima.setVisible(false);
		arrayOfPicturesForDealer.get(0).setBounds(600,00,100,100);
		arrayOfPicturesForDealer.get(0).setVisible(true);
		
		twoDPanel.add(arrayOfPicturesForDealer.get(0));
		
		twoDPanel.repaint();
	}
	
	


public   void    moveCardUp(String xx, int indexx,int corXd,int corYd,int flg){
  
   
       java.util.Timer t = 	new java.util.Timer();
    
     JLabel jl = new JLabel("true");
     
        	      java.util.TimerTask tTask=  new java.util.TimerTask() {
        	    	  String str;  
        	    	
       
        	    	  @Override
        	          
        	            
        	            public  void run() {
        	
        	    		  if(Boolean.parseBoolean(jl.getText())==true){
        	    		    str=system.stand();
              	    	
        	    		  

arrayOfPicturesForDealer.add(new JLabel(system.getD().getComputer().getHandArray().get(system.getD().getComputer().getHandArray().size()-1).getCardpic()));

		   
 arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1).setVisible(true);
	       restartAll();
	       jl.setText("false");
        	    		  
        	    		  }
        		  	
        	            	arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1).setVisible(false);
        	            	arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1).setBounds(StartPointXD,StartPointYD,100,100);
        	    			
        	    			arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1).setVisible(true);
        	            	
        	            	twoDPanel.add(arrayOfPicturesForDealer.get(arrayOfPicturesForDealer.size()-1));
        	            	
        	           
        	            	twoDPanel.repaint();
        	            	
        	    			if(isCoordinatorXD()==true)
        	    			StartPointXD+=5;
        	    			if(StartPointXD>800+30*(system.getD().getComputer().getHandArray().size()-2)){
        	    				setCoordinatorXD(false);
        	    			StartPointYD-=5;
        	            	
        	            
        	    			}
        	    			
        	    			if(StartPointYD<0){
        			            setCoordinatorYD(false);
        			           
        			            
        			            if(!str.equals("")){
        			            	
        						temo.setText("b");
        							hit.setVisible(false);
        							stand.setVisible(false);
        					startGame.setVisible(true);
        										
        						TurnTheCard();
        						twoDPanel.repaint();
        						
        					JOptionPane.showInternalMessageDialog(getContentPane(), str+"");

        					

        										
        										if(str.equals("the computer busted") || str.equals("the player win"))
        										{
        											system.UpdateCoinsOfPlayer();
        											money.setText(system.getD().getchalenger().getMoney()+"");
        											
        										}
        										else if(str.equals("the player is busted") || str.equals("the computer win")){
        											system.removeCoinsFromPlayer();
        											money.setText(system.getD().getchalenger().getMoney()+"");
        											
        										}
        										money.repaint();
        										system.getD().getComputer().removeHandArray();
        										system.getD().getchalenger().removeHandArray();
        										  this.cancel();
        								
        			            
setChipsTrue();}
        			            else {
        			            	
        			            	jl.setText("true");
        			            }
         
        			    			}
        			    			
        	} 			
        	      };

        	    	  System.out.println("BBBBBBBB :"+counter+":");
        	      t.scheduleAtFixedRate(tTask, 10+(counter++)*12,10 );
        	      
        
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
        								
        			            
setChipsTrue();}
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
    					
    				setChipsTrue();
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

private void setchips(){
		java.net.URL url1 = MainFrame.class.getResource("/pictures/1.png");
	 chip1 = new JButton ("",new ImageIcon(url1));

chip1.setBounds(203,542,56,50);
chip1.setFont(new Font("", Font.BOLD, 9));

chip1.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
chip1.setVisible(false);			
}
});
chip1.setOpaque(false);
chip1.setContentAreaFilled(false);
chip1.setBorderPainted(false);
jdp.add(chip1);
		
		
java.net.URL url2 = MainFrame.class.getResource("/pictures/5.png");
 chip5 = new JButton ("",new ImageIcon(url2));

chip5.setBounds(268,568,51,51);
chip5.setFont(new Font("", Font.BOLD, 9));

chip5.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
chip5.setVisible(false);			
}
});
chip5.setOpaque(false);
chip5.setContentAreaFilled(false);
chip5.setBorderPainted(false);
jdp.add(chip5);



java.net.URL url3 = MainFrame.class.getResource("/pictures/10.png");
 chip10 = new JButton ("",new ImageIcon(url3));

chip10.setBounds(327,595,58,50);
chip10.setFont(new Font("", Font.BOLD, 9));

chip10.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
chip10.setVisible(false);			
}
});
chip10.setOpaque(false);
chip10.setContentAreaFilled(false);
chip10.setBorderPainted(false);
jdp.add(chip10);



java.net.URL url4 = MainFrame.class.getResource("/pictures/25.png");
 chip25 = new JButton ("",new ImageIcon(url4));

chip25.setBounds(400,609,53,47);
chip25.setFont(new Font("", Font.BOLD, 9));

chip25.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
chip25.setVisible(false);			
}
});
chip25.setOpaque(false);
chip25.setContentAreaFilled(false);
chip25.setBorderPainted(false);
jdp.add(chip25);}
private void  setChipsFalse(){
	chip1.setVisible(false);
	chip5.setVisible(false);
	chip10.setVisible(false);
	chip25.setVisible(false);
}
private void  setChipsTrue(){
	chip1.setVisible(true);
	chip5.setVisible(true);
	chip10.setVisible(true);
	chip25.setVisible(true);
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
	

	 		money =  new JTextField();
			
	 		money.setBounds(650, 600, 80, 40);
	 		money.setFont(new Font("", Font.BOLD, 9));
	 		money.setText(system.getPlayers().get(userName).getMoney()+"");
	 		money.setVisible(true);
	 		jdp.add(money);		
	 		
	
	 		java.net.URL url1 = MainFrame.class.getResource("/pictures/10.jpg");
			
	 		
	 		
	 		
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

}
