package Gui;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.sql.Statement;
import java.util.Map;

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

import Controller.Controler;


public class gui_Main extends JFrame  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

private Controler system;


	/**
	 * Create the frame.
	 * @param system 
	 */
	public gui_Main(Controler system) {
super("LOG ME IN");
this.system=system;
setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JLabel img = new JLabel(new ImageIcon("picturddes/background1.jpg"));
		img.setBounds(0,0,this.getWidth(),this.getHeight());
		JDP.add(img); 
		
		JDP.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JDP);
		JDP.setLayout(null);

	//	JDP.repaint();
	

		

		 lblInsertPassword = new JLabel("Password");
		lblInsertPassword.setBounds(58, 115, 160, 30);
		lblInsertPassword.setVisible(true);

		JDP.add(lblInsertPassword);
		JDP.repaint();
		JButton btnLogIn = new JButton ("",new ImageIcon("pictures/logIn.png"));
		btnLogIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
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

	}
public void log(){
	int flag=0;
	for(Map.Entry<String,String>  x : getSystem().getPlayers().entrySet())
	{
		if(x.getKey().equals(username.getText()) && x.getValue().equals(pas.getText()))
		{system.logInValid();
			this.setVisible(false);
			MainFrame mf = new MainFrame(system);
			 mf.setVisible(true);
			flag=1;
			System.out.println("vvvvvv");
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