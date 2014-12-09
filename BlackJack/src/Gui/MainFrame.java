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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.soap.Text;

import model.Deck;
import Controller.Controler;

public class MainFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	//declare the desktop pane
	private JDesktopPane jdp = new JDesktopPane();
	
	JPanel twoDPanel = new JPanel();

	JButton startGame;
	JButton hit;
	JButton stand;
	JButton shuffle;
	JTextField theResult = new JTextField();;
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
	
	JTextField money ;
	String userName;
	JLabel bjImage;
	
	private static final long serialVersionUID = 1L;
     private Controler system;
	public Controler getSystem() {
		return system;
	}
	  public MainFrame(final Controler system, String userN) {
		  super("***  Black Jack 2014  ***");
			this.system = system;
	setSize(200, 200);	
	userName=userN;
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jdp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
			this.setContentPane(jdp);
			this.setBounds(0, 0, 1367, 737);
			 bjImage = new JLabel(new ImageIcon("pictures/background.jpg"));
			bjImage.setBounds(0,0,this.getWidth(),this.getHeight());
			addButtons();

			
			
			
			
			jdp.add(bjImage);
			
			twoDPanel.setBounds(0,0,this.getWidth(),this.getHeight()-150);
			twoDPanel.setOpaque(false);
			jdp.add(twoDPanel, new Integer(1), 0);
		
			
		jdp.setVisible(true);
		
	

		
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
		
//		JLabel userName = new JLabel("the player is :");
//		userName.setBounds(400,600,150,20);
//		userName.setBackground(Color.WHITE);
//		//getContentPane().add(userName);
//		jdp.add(userName);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String  cmd = e.getActionCommand();		
int flag=-1;
		if(cmd.equals("Deal"))
		{
		
			
			theResult.setText("");
if(hit.isEnabled()==false){
				
				twoDPanel.removeAll();
				// refresh the panel.
			twoDPanel.repaint();
	
				
				
			}



			startGame.setEnabled(false);
			
			system.start();
			bjImage1p = new JLabel(system.getD().getWael().getHandArray().get(0).getCardpic());
			bjImage1p.setBounds(580,470,100,100);
			bjImage1p.setVisible(true);
			twoDPanel.add(bjImage1p);
		
			bjImage2p = new JLabel(system.getD().getWael().getHandArray().get(1).getCardpic());
			bjImage2p.setBounds(610,470,100,100);
			bjImage2p.setVisible(true);
			twoDPanel.add(bjImage2p);
			
			bjImage1c = new JLabel(system.getD().getComputer().getHandArray().get(0).getCardpic());
			bjImage1c.setBounds(580,00,100,100);
			bjImage1c.setVisible(true);
			twoDPanel.add(bjImage1c);
			
			bjImage2c = new JLabel(system.getD().getComputer().getHandArray().get(1).getCardpic());
			bjImage2c.setBounds(610,00,100,100);
			bjImage2c.setVisible(true);
			twoDPanel.add(bjImage2c);
			hit.setEnabled(true);
			
			stand.setEnabled(true);

				theResult.setText("");
		
		
			twoDPanel.repaint();
			
		
		}
		
		 if(cmd.equals("hit")){
		
			String x=  system.hit();
			  
			theResult.setText("");
		
			bjImage3p = new JLabel(system.getD().getWael().getHandArray().get(system.getD().getWael().getHandArray().size()-1).getCardpic());
			bjImage3p.setBounds(610+30*(system.getD().getWael().getHandArray().size()-2),470,100,100);
			bjImage3p.setVisible(true);
			twoDPanel.add(bjImage3p);
			if(!x.equals("the player is busted") && !x.equals("the computer is busted")){
			
			
			bjImage3c = new JLabel(system.getD().getComputer().getHandArray().get(system.getD().getComputer().getHandArray().size()-1).getCardpic());
			bjImage3c.setBounds(610+30*(system.getD().getComputer().getHandArray().size()-2),0,100,100);
			bjImage3c.setVisible(true);
			twoDPanel.add(bjImage3c);
			}
			twoDPanel.repaint();
			//if someone win
			if(x!=""){
				theResult.setText(x);
				hit.setEnabled(false);
				stand.setEnabled(false);
			startGame.setEnabled(true);
			
			}
			
			if(x.equals("the computer is busted"))
			{
				system.UpdateCoinsOfPlayer();
				money.setText(system.getD().getWael().getMoney()+"");
				money.repaint();
				
			}
			else if(x.equals("the player is busted")){
				system.removeCoinsFromPlayer();
				money.setText(system.getD().getWael().getMoney()+"");
				money.repaint();

			}
		}
		
	
		
		 if(cmd.equals("stand")){
			 
			 theResult.setText("");
			 String x= system.stand();
			 bjImage3c = new JLabel(system.getD().getComputer().getHandArray().get(system.getD().getComputer().getHandArray().size()-1).getCardpic());
				bjImage3c.setBounds(610+30*(system.getD().getComputer().getHandArray().size()-2),00,100,100);
				bjImage3c.setVisible(true);
				twoDPanel.add(bjImage3c);
				
				twoDPanel.repaint();
				
				if(!x.equals("")){
					theResult.setText(x);
					hit.setEnabled(false);
					stand.setEnabled(false);
				startGame.setEnabled(true);
				 
			//	stand.setVisible(false);
			//jdp.isVisible()(stand);
		//	twoDPanel.revalidate();
		//	twoDPanel.repaint();

				
//				}
				
				
				

				}
				if(x.equals("the computer is busted"))
				{
					system.UpdateCoinsOfPlayer();
					money.setText(system.getD().getWael().getMoney()+"");
					money.repaint();
				}
				else if(x.equals("the player is busted")){
					system.removeCoinsFromPlayer();
					money.setText(system.getD().getWael().getMoney()+"");
					money.repaint();
				}
		 }

		 
		 if(cmd.equals("shuffle cards")){
				system.shuffle();
				
			}
		 
		 
		 if(cmd.equals("exit the Game")){
				
				this.setVisible(false);
			}
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
