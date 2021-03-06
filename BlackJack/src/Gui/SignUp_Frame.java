package Gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;











import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import Controller.Controler;


/**
 * An internal frame that allows the user to add a new sponsor and all the details
 */
public class SignUp_Frame  extends JFrame implements ActionListener{
	

	private static final long serialVersionUID = 1L;	
	private JTextField firstname = new JTextField();
	private JTextField lastname = new JTextField();
	private JTextField username= new JTextField();
	private JPasswordField password = new JPasswordField();

	protected JDesktopPane JDP = new JDesktopPane();
	Controler  system;
	/**
	 * Constructor for AddNewSponser_Frame class 
	 */
	public  SignUp_Frame( Controler sys) {
		super("Sign Up Here");
	JLabel bjImage;
		system=sys;
		this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		this.setContentPane(JDP);
	
		//getContentPane().setBackground(Color.LIGHT_GRAY);  
		
		this.setSize(500,480);
	
		final JLabel lable = new JLabel("Sign Up And Get Start To Play Black Jack!!!");
		lable.setFont(new Font("", Font.BOLD, 20));
		lable.setForeground(Color.RED);
		lable.setBounds(10, 20, 500, 25);
		getContentPane().add(lable);
		
		
		
		
		final JLabel name_lable = new JLabel("Name:");
		name_lable.setFont(new Font("", Font.BOLD, 12));
		name_lable.setBounds(10, 100, 137, 16);
		name_lable.setForeground(Color.WHITE);
		getContentPane().add(name_lable);

		firstname.setFont(new Font("", Font.BOLD, 12));
		firstname.setBounds(141, 100, 169, 20);
		getContentPane().add(firstname);
	

		final JLabel pp_label = new JLabel("Last Name:");
		pp_label.setFont(new Font("", Font.BOLD, 12));
		pp_label.setBounds(10, 130, 137, 16);
		getContentPane().add(pp_label);
		pp_label.setForeground(Color.WHITE);
		
		
		lastname.setFont(new Font("", Font.BOLD, 12));
		lastname.setBounds(141, 130, 169, 20);
		getContentPane().add(lastname);
		
		final JLabel user_label = new JLabel("User Name");
		user_label.setFont(new Font("", Font.BOLD, 12));
		user_label.setBounds(10, 160, 137, 16);
		getContentPane().add(user_label);
		user_label.setForeground(Color.WHITE);
		
		
		username.setFont(new Font("", Font.BOLD, 12));
		username.setBounds(141, 160, 169, 20);
		getContentPane().add(username);

		final JLabel password_label = new JLabel("Password:");
		password_label.setFont(new Font("", Font.BOLD, 12));
		password_label.setBounds(10, 190, 137, 16);
		password_label.setForeground(Color.WHITE);
		
		getContentPane().add(password_label);
		
		password.setFont(new Font("", Font.BOLD, 12));
		password.setBounds(141, 190, 169, 20);
		getContentPane().add(password);
		
		
	
		JButton addButton = new JButton ("Add");

        addButton.setToolTipText("Add User");
        addButton.setBorderPainted(true);
        addButton.setFont(new Font("", Font.BOLD, 9));
		addButton.addActionListener(this);
		addButton.setBounds(200,320,70,40);
		addButton.setForeground(Color.WHITE);
		addButton.setBackground(Color.RED);
		getContentPane().add(addButton);

     
		JButton reset = new JButton ("Reset");

        reset.setToolTipText("Reset");
        reset.setBorderPainted(true);
        reset.setFont(new Font("", Font.BOLD, 9));
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			firstname.setText("");
				lastname.setText("");
				username.setText("");
			password.setText(""); 
			}
		});
		reset.setBackground(Color.RED);
		reset.setBounds(120,320,70,40);
		reset.setForeground(Color.WHITE);
		getContentPane().add(reset);
	
	
	 
	
		
		
		
		java.net.URL url1 = LogIn_Frame.class.getResource("/pictures/signupback.PNG");
		 bjImage = new JLabel(new ImageIcon(url1));
			bjImage.setBounds(0,0,this.getWidth(),this.getHeight());
			getContentPane().add(bjImage);
			
	
	
		
			}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	
			// give the new member 100 shekel

		if(username.getText().equals("") || lastname.getText().equals("") || firstname.getText().equals("") || password.getText().equals(""))
		{		JOptionPane.showInternalMessageDialog(this.getContentPane(), "please full all the fields! ", "", JOptionPane.ERROR_MESSAGE);
		return;
			
	}
			if(system.Players.containsKey(username.getText()))
		{	JOptionPane.showInternalMessageDialog(this.getContentPane(), "User Name is already Exits! ", "", JOptionPane.ERROR_MESSAGE);
		return;}
		
			else  if(  system.addUser(firstname.getText(), lastname.getText(), username.getText(), password.getText() ,100)){
				JOptionPane.showInternalMessageDialog(this.getContentPane(), "The user " +  firstname.getText() +" "+ lastname.getText()+
						"\nwas succesfully added to the system", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
			dispose();}
		
			
		
			else {
				JOptionPane.showInternalMessageDialog(this.getContentPane(), "The user " + firstname.getText() +" "+ lastname.getText()+ 
						"\nwas not added to the system", "", JOptionPane.ERROR_MESSAGE);
						
			
			}
		}
//		catch(Exception e) {
//			JOptionPane.showInternalMessageDialog(this.getContentPane(), e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
//		
//		}
//		
	
		
		}