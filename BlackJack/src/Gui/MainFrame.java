package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.xml.soap.Text;

import model.Deck;
import Controller.Controler;

public class MainFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	//declare the desktop pane
	private JDesktopPane jdp = new JDesktopPane();
	JButton startGame;
	JButton hit;
	JButton stand;
	JButton shuffle;
	
	// declare the labels to put the images on it
	Label whoBusted;
	JLabel bjImage1p;
	JLabel bjImage2p;
	JLabel bjImage3p;
	JLabel bjImage4p;
	JLabel bjImage5p;
	JLabel bjImage6p;
	JLabel bjImage1c;
	JLabel bjImage2c;
	JLabel bjImage3c;
	JLabel bjImage4c;
	JLabel bjImage5c;
	JLabel bjImage6c;
	
	
	JPanel twoDPanel;
	
	
	
	private static final long serialVersionUID = 1L;
     private Controler system;
	public Controler getSystem() {
		return system;
	}
	  public MainFrame(final Controler system) {
		  super("***  Black Jack 2014  ***");
			this.system = system;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		jdp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
			this.setContentPane(jdp);
			this.setBounds(0, 0, 1367, 737);
			JLabel bjImage = new JLabel(new ImageIcon("pictures/blackJack.jpg"));
			bjImage.setBounds(0,0,this.getWidth(),this.getHeight());
			addButtons();

			jdp.add(bjImage);

		jdp.setVisible(true);
		
		twoDPanel = new JPanel();
		twoDPanel.setBounds(0,0,this.getWidth(),this.getHeight()-150);
		//Color myColour = new Color(255, 255,255, 128 );
		twoDPanel.setOpaque(false);
		jdp.add(twoDPanel, new Integer(1), 0);

		
	}
	private void addButtons() {
		// TODO Auto-generated method stub
		
		 startGame = new JButton("start Game");
		startGame.setBounds(50,600,140,40);
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
		 
		 		TextField t = new TextField();
		 		t.setBounds(700, 600, 80, 40);
		 		t.setFont(new Font("", Font.BOLD, 9));
		 		jdp.add(t);
		 		
		 		
		 		
	
		
//		JButton exit = new JButton("exit the Game");
//		exit.setBounds(550,600,150,40);
//		exit.setFont(new Font("", Font.BOLD, 9));
//		exit.addActionListener(this);
//		jdp.add(exit);
		
//		JLabel userName = new JLabel("the player is :");
//		userName.setBounds(400,600,150,20);
//		userName.setBackground(Color.WHITE);
//		//getContentPane().add(userName);
//		jdp.add(userName);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//twoDPanel.setBackground(myColour);
		 
		String  cmd = e.getActionCommand();
		//twoDPanel.setOpaque(false);
		
		if(cmd.equals("start Game"))
		{startGame.setEnabled(false);
			
			system.getD().StartGame();
			bjImage1p = new JLabel(system.getD().getWael().getHandArray().get(0).getCardpic());
			bjImage1p.setBounds(0,0,100,100);
			bjImage1p.setVisible(true);
			twoDPanel.add(bjImage1p);
		
			bjImage2p = new JLabel(system.getD().getWael().getHandArray().get(1).getCardpic());
			bjImage2p.setBounds(100,0,100,100);
			bjImage2p.setVisible(true);
			twoDPanel.add(bjImage2p);
			
			bjImage1c = new JLabel(system.getD().getComputer().getHandArray().get(0).getCardpic());
			bjImage1c.setBounds(600,00,100,100);
			bjImage1c.setVisible(true);
			twoDPanel.add(bjImage1c);
			
			bjImage2c = new JLabel(system.getD().getComputer().getHandArray().get(1).getCardpic());
			bjImage2c.setBounds(700,00,100,100);
			bjImage2c.setVisible(true);
			twoDPanel.add(bjImage2c);
			
		
		
		}
		
		 if(cmd.equals("hit")){
		
			 int flag=system.hit();
			 
			// if(startGame.isEnabled()==false){
			
			
			bjImage3p = new JLabel(system.getD().getWael().getHandArray().get(system.getD().getWael().getHandArray().size()-1).getCardpic());
			bjImage3p.setBounds(100*(system.getD().getWael().getHandArray().size()-1),0,100,100);
			bjImage3p.setVisible(true);
			twoDPanel.add(bjImage3p);
		
	
			
			bjImage3c = new JLabel(system.getD().getComputer().getHandArray().get(system.getD().getWael().getHandArray().size()-1).getCardpic());
			bjImage3c.setBounds(600+100*(system.getD().getComputer().getHandArray().size()-1),00,100,100);
			bjImage3c.setVisible(true);
			twoDPanel.add(bjImage3c);
			
			
			if(flag!=0){
				hit.setEnabled(false);
			startGame.setEnabled(true);
			clear();
			
			}
			
			
			
			
		}
		
		//}
		
		 if(cmd.equals("stand")){
				
			/// twoDPanel=null;
			 twoDPanel.removeAll(); 
			// refresh the panel.
			twoDPanel.updateUI();
		
		 }

		 
		 if(cmd.equals("shuffle cards")){
				
				
			}
		 
		 
		 if(cmd.equals("exit the Game")){
				
				
			}
		 
		 
	}
	private void clear() {
		// TODO Auto-generated method stub
		
		
		
	}
	  
	  
	
	
	
	
	
	
	
	
	
	
	
}
