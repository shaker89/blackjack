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
	JTextField theResult = new JTextField();;
	// declare the labels to put the images on it
	Label whoBusted;

	ArrayList<JLabel> arrayOfPictures = new ArrayList<JLabel>();; 
	JTextField money ;
	String userName;
	JLabel bjImage;
	int monee;
	private static final long serialVersionUID = 1L;
     private final Controler system;
//	public Controler getSystem() {
//		return system;
//	}
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
					
				}
				 system.saveSystem();

				dispose();
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
		hit.setBounds(200,600,80,40);
		hit.setFont(new Font("", Font.BOLD, 9));
		hit.addActionListener(this);
		jdp.add(hit);
		
		
		 stand = new JButton("stand");
		stand.setBounds(300,600,80,40);
		stand.setFont(new Font("", Font.BOLD, 9));
		stand.addActionListener(this);
		jdp.add(stand);

		
		 shuffle = new JButton("shuffle cards");
		shuffle.setBounds(400,600,140,40);
		shuffle.setFont(new Font("", Font.BOLD, 9));
		shuffle.addActionListener(this);
		jdp.add(shuffle);
		
		 whoBusted = new Label("the result");
		 whoBusted.setBounds(550, 600, 80, 40);
		 whoBusted.setFont(new Font("", Font.BOLD, 9));
		 		 jdp.add(whoBusted);
		 
		 		
		 		theResult.setBounds(700, 600, 80, 40);
		 		theResult.setFont(new Font("", Font.BOLD, 9));
		 		jdp.add(theResult);
		 		
		 		
		 		money =  new JTextField();
				
		 		money.setBounds(500, 500, 80, 40);
		 		money.setFont(new Font("", Font.BOLD, 9));
		 		money.setText(system.getPlayers().get(userName).getMoney()+"");
		 		money.setVisible(true);
		 		jdp.add(money);		
		 		
	
		
		JButton exit = new JButton("exit the Game");
		exit.setBounds(820,600,150,40);
		exit.setFont(new Font("", Font.BOLD, 9));
		exit.addActionListener(this);
		jdp.add(exit);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String  cmd = e.getActionCommand();		
// if we press deal 
		if(cmd.equals("Deal"))
		{	hit.setVisible(true);
		stand.setVisible(true);
		system.start();
		//if not the first round
		if (arrayOfPictures.size()!=0)
			{
			ima.setVisible(false);

			ima=new JLabel();
			
			for(int i=0;i<arrayOfPictures.size();)
			{
				//hide the cards and remove the pictures
				arrayOfPictures.get(i).setVisible(false);
				arrayOfPictures.remove(i);
			}
				
				
				twoDPanel.repaint();
			}
			
			theResult.setText("");
			startGame.setVisible(false);
			
			//make the pictures 
			//two pictures for the computer and two pictures for the user
			
			arrayOfPictures.add(new JLabel(system.getD().getchalenger().getHandArray().get(0).getCardpic()));
			arrayOfPictures.get(0).setBounds(580,470,100,100);
			twoDPanel.repaint();
			arrayOfPictures.get(0).setVisible(true);
			twoDPanel.add(arrayOfPictures.get(0));
			twoDPanel.repaint();

			
			arrayOfPictures.add(new JLabel(system.getD().getchalenger().getHandArray().get(1).getCardpic()));
			arrayOfPictures.get(1).setBounds(610,470,100,100);
			arrayOfPictures.get(0).setVisible(false);
			twoDPanel.repaint();
			arrayOfPictures.get(1).setVisible(true);
			arrayOfPictures.get(0).setVisible(true);
			twoDPanel.add(arrayOfPictures.get(1));
			twoDPanel.repaint();

		    java.net.URL hide = MainFrame.class.getResource("/pictures/cardd.jpg");
		    ImageIcon hidden = new ImageIcon(hide);
			ima = new JLabel(hidden);
			ima.setBounds(580,00,100,100);
			ima.setVisible(true);
			twoDPanel.add(ima);
			twoDPanel.repaint();

	arrayOfPictures.add(new JLabel(system.getD().getComputer().getHandArray().get(0).getCardpic()));

			
			arrayOfPictures.add(new JLabel(system.getD().getComputer().getHandArray().get(1).getCardpic()));
			arrayOfPictures.get(3).setBounds(610,00,100,100);
			arrayOfPictures.get(2).setVisible(false);
			twoDPanel.repaint();
			arrayOfPictures.get(3).setVisible(true);
			arrayOfPictures.get(2).setVisible(true);

			twoDPanel.add(arrayOfPictures.get(3));
			twoDPanel.repaint();

				theResult.setText("");
		
		
		//	twoDPanel.repaint();
			
		
		}
		
		 if(cmd.equals("hit")){
		//the method return "" if no one won
			String x=  system.hit();
			  
			// show the card that the user play it
			theResult.setText("");
			arrayOfPictures.add(new JLabel(system.getD().getchalenger().getHandArray().get(system.getD().getchalenger().getHandArray().size()-1).getCardpic()));
			arrayOfPictures.get(arrayOfPictures.size()-1).setBounds(610+30*(system.getD().getchalenger().getHandArray().size()-2),470,100,100);
			arrayOfPictures.get(arrayOfPictures.size()-1).setVisible(true);
			twoDPanel.add(arrayOfPictures.get(arrayOfPictures.size()-1));
			twoDPanel.repaint();
			//if the computer won 
			
			if(x!=""){
				theResult.setText(x);

				hit.setVisible(false);
	stand.setVisible(false);
				startGame.setVisible(true);
				if(x.equals("the computer busted") || x.equals("the player win"))
				{
					system.UpdateCoinsOfPlayer();
					money.setText(system.getD().getchalenger().getMoney()+"");
	
					TurnTheCard();
					JOptionPane.showInternalMessageDialog(this.getContentPane(), x+"");

				}
				else if(x.equals("the player is busted") || x.equals("the computer win")){
					system.removeCoinsFromPlayer();
					money.setText(system.getD().getchalenger().getMoney()+"");
	
					TurnTheCard();
					JOptionPane.showInternalMessageDialog(this.getContentPane(), x+"");


				}
				money.repaint();
				system.getD().getComputer().removeHandArray();
				system.getD().getchalenger().removeHandArray();
				
			}
			
			
			
		}
		
	
		
		 if(cmd.equals("stand")){
			 
			 while(true){
			 theResult.setText("");
			 String x= system.stand();
				arrayOfPictures.add(new JLabel(system.getD().getComputer().getHandArray().get(system.getD().getComputer().getHandArray().size()-1).getCardpic()));
				arrayOfPictures.get(arrayOfPictures.size()-1).setBounds(610+30*(system.getD().getComputer().getHandArray().size()-2),0,100,100);
				arrayOfPictures.get(arrayOfPictures.size()-1).setVisible(true);
				twoDPanel.add(arrayOfPictures.get(arrayOfPictures.size()-1));
				
				twoDPanel.repaint();
				
				if(!x.equals("")){
					theResult.setText(x);
					hit.setVisible(false);
					stand.setVisible(false);
				startGame.setVisible(true);
			
				
//				}
				
				if(x.equals("the computer busted") || x.equals("the player win"))
				{
					system.UpdateCoinsOfPlayer();
					money.setText(system.getD().getchalenger().getMoney()+"");
					
					TurnTheCard();
				}
				else if(x.equals("the player is busted") || x.equals("the computer win")){
					system.removeCoinsFromPlayer();
					money.setText(system.getD().getchalenger().getMoney()+"");
					
					TurnTheCard();
				}
				money.repaint();
				system.getD().getComputer().removeHandArray();
				system.getD().getchalenger().removeHandArray();
				return;
			}
			 }	

				
		 }

		 
		 if(cmd.equals("shuffle cards")){
				system.shuffle();
				
			}
		 
		 
		 if(cmd.equals("exit the Game")){
			 system.saveSystem();
				this.setVisible(false);
				
			}
		 
		 
	}
	
	
	
	
	
	public void TurnTheCard(){
		
		ima.setVisible(false);
		arrayOfPictures.get(2).setBounds(580,00,100,100);
		arrayOfPictures.get(2).setVisible(true);
		twoDPanel.add(arrayOfPictures.get(2));
		twoDPanel.repaint();
	}
	
	
	
	
	
}
