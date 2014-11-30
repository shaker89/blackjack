package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Controller.Controler;

public class MainFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	
	private JDesktopPane jdp = new JDesktopPane();

	private static final long serialVersionUID = 1L;
     private Controler system;
	public Controler getSystem() {
		return system;
	}
	  public MainFrame(final Controler system) {
		  super("***  Black Jack 2014  ***");
			this.system = system;
			
			//jdp.setVisible(false);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jdp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
			this.setContentPane(jdp);
			this.setBounds(0, 0, 1367, 737);
			JLabel bjImage = new JLabel(new ImageIcon("pictures/blackJack.jpg"));
			bjImage.setBounds(0,0,this.getWidth(),this.getHeight());
			addButtons();

			jdp.add(bjImage);

		jdp.setVisible(true);
		
		
		
	}
	private void addButtons() {
		// TODO Auto-generated method stub
		
		JButton startGame = new JButton("start Game");
		startGame.setBounds(50,600,140,40);
		startGame.setFont(new Font("", Font.BOLD, 9));
		startGame.addActionListener(this);
		jdp.add(startGame);
		

		JButton hit = new JButton("hit");
		hit.setBounds(200,600,80,40);
		hit.setFont(new Font("", Font.BOLD, 9));
		hit.addActionListener(this);
		jdp.add(hit);
		
		
		JButton stand = new JButton("stand");
		stand.setBounds(300,600,80,40);
		stand.setFont(new Font("", Font.BOLD, 9));
		stand.addActionListener(this);
		jdp.add(stand);

		
		JButton shuffle = new JButton("shuffle cards");
		shuffle.setBounds(400,600,140,40);
		shuffle.setFont(new Font("", Font.BOLD, 9));
		shuffle.addActionListener(this);
		jdp.add(shuffle);
		
		
		JButton exit = new JButton("exit the Game");
		exit.setBounds(550,600,150,40);
		exit.setFont(new Font("", Font.BOLD, 9));
		exit.addActionListener(this);
		jdp.add(exit);
		
		JLabel userName = new JLabel("the player is :");
		userName.setBounds(400,600,150,20);
		userName.setBackground(Color.WHITE);
		//getContentPane().add(userName);
		jdp.add(userName);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String  cmd = e.getActionCommand();
		
		if(cmd.equals("startGame"))
		{
			
			System.out.println("Dddkjkkj");
		}
		
		 if(cmd.equals("hit")){
			
		
		}
		
		 if(cmd.equals("stand")){
				
				
			}
		 
		 
		 if(cmd.equals("shuffle")){
				
				
			}
		 
		 
		 if(cmd.equals("exit")){
				
				
			}
		 
		 
	}
	  
	  
	
	
	
	
	
	
	
	
	
	
	
}
