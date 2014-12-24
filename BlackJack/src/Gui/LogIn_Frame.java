package Gui;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Statement;
import java.util.Map;
import java.net.*;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Player;
import Controller.Controler;
import sun.audio.*;

import java.io.*;




public final class LogIn_Frame extends JFrame  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private static LogIn_Frame instance = null;
	
	
	public static LogIn_Frame getInstance(Controler system) {
		if (instance == null)
			instance = new LogIn_Frame(system);
		
		return instance;
	}
	
	public Controler getSystem() {
		return system;
	}
	public void setSystem(Controler system) {
		this.system = system;
	}
	private JDesktopPane JDP = new JDesktopPane();

	Statement stmt;

	private JPasswordField pas;
private JTextField username;
private JLabel lblInsertPassword;
private JLabel lblInserthit;

private Controler system;


	/**
	 * Create the frame.
	 * @param system 
	 */
	public LogIn_Frame(Controler system) {
super("LOG ME IN to play BlackJack");
this.system=system;
setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JLabel img = new JLabel(new ImageIcon("picturees/background1.jpg"));
		img.setBounds(0,0,this.getWidth(),this.getHeight());
		JDP.add(img); 
		
		JDP.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JDP);
		JDP.setLayout(null);

	//	JDP.repaint();

		 lblInsertPassword = new JLabel("Password");
		lblInsertPassword.setBounds(58, 115, 160, 30);
		lblInsertPassword.setVisible(true);
		
		
		JButton signup = new JButton("U don't have account ? Click Here Now To Sign Up");
        signup.setToolTipText("Sign Up");
        signup.setBackground(Color.WHITE);
        signup.setBorderPainted(false);
        signup.setFont(new Font("", Font.BOLD, 12));
		signup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SignUp_Frame m = new SignUp_Frame(system)
;
				m.setVisible(true);
				
			}
		});
		signup.setBounds(10, 200, 400, 50);
		getContentPane().add(signup);
		
		
		JDP.add(lblInsertPassword);
		JDP.repaint();
		java.net.URL url = LogIn_Frame.class.getResource("/pictures/logIn.png");
		JButton btnLogIn = new JButton ("",new ImageIcon(url));
		btnLogIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String sondio = "/shuffling-cards-6.mp3";
				//InputStream in = new FileInputStream(sondio);
				
					
				log();				
			}
		});
		btnLogIn.setBounds(139, 171, 89, 23);
		JDP.add(btnLogIn);
		JLabel user= new JLabel("UserName");
	
		user.setBounds(58, 85, 160, 14);
		JDP.add(user);
		user.setVisible(true);
		username = new JTextField();
		username.setBounds(211,85, 110, 20);
		JDP.add(username);
		
		pas = new JPasswordField();
		pas.setBounds(211, 115, 110, 20);
		JDP.add(pas);
	
		lblInserthit = new JLabel("username = wael   pass = 1234");
		lblInserthit.setBounds(50, 300, 350, 30);
		lblInserthit.setVisible(true);
		JDP.add(lblInserthit);
		JDP.repaint();
	
	}
	
public void	log(){
	int flag=0;
	for(Map.Entry<String,Player>  x : system.getPlayers().entrySet())
	{
		
		if(x.getKey().equals(username.getText()) && x.getValue().getPassword().equals(pas.getText()))
		{system.logInValid(username.getText());
			this.setVisible(false);
			MainFrame mf = new MainFrame(system,username.getText(),x.getValue().getMoney());
			 mf.setVisible(true);
			flag=1;
			
			break;
			
		}
		
	}
	if(flag==0)
	{		JOptionPane.showMessageDialog(this,
				"Login faild \n Incorrect username/Password");
	pas.setText("");
	username.setText("");
	return;
}}

	

}