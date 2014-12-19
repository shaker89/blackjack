package Gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controller.Controler;


/**
 * An internal frame that allows the user to add a new sponsor and all the details
 */
public class SignUp_Frame  extends JFrame implements ActionListener{
	

	private static final long serialVersionUID = 1L;	
	private JTextField name = new JTextField();
	private JTextField username = new JTextField();
	private JTextField password= new JTextField();
	private JTextField country = new JTextField();
	private JTextField city= new JTextField();
	private JTextField email = new JTextField();

	protected JDesktopPane JDP = new JDesktopPane();
	/**
	 * Constructor for AddNewSponser_Frame class 
	 */
	public  SignUp_Frame(final Controler system) {
		super("Sign Up Here");
		this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		this.setContentPane(JDP);
	
		getContentPane().setBackground(Color.LIGHT_GRAY);  
		this.setSize(450,450);
		
		final JLabel lable = new JLabel("Sign Up And Get Start To Play Black Jack!!!");
		lable.setFont(new Font("", Font.BOLD, 20));
		lable.setBounds(10, 20, 500, 25);
		getContentPane().add(lable);
		
		
		
		
		final JLabel name_lable = new JLabel("Name:");
		name_lable.setFont(new Font("", Font.BOLD, 12));
		name_lable.setBounds(10, 100, 137, 16);
		getContentPane().add(name_lable);

		name.setFont(new Font("", Font.BOLD, 12));
		name.setBounds(141, 100, 169, 20);
		getContentPane().add(name);
	

		final JLabel pp_label = new JLabel("User Name:");
		pp_label.setFont(new Font("", Font.BOLD, 12));
		pp_label.setBounds(10, 130, 137, 16);
		getContentPane().add(pp_label);

		username.setFont(new Font("", Font.BOLD, 12));
		username.setBounds(141, 130, 169, 20);
		getContentPane().add(username);
		
		final JLabel pass_label = new JLabel("PassWord");
		pass_label.setFont(new Font("", Font.BOLD, 12));
		pass_label.setBounds(10, 160, 137, 16);
		getContentPane().add(pass_label);

		password.setFont(new Font("", Font.BOLD, 12));
		password.setBounds(141, 160, 169, 20);
		getContentPane().add(password);

		final JLabel country_label = new JLabel("Country:");
		country_label.setFont(new Font("", Font.BOLD, 12));
		country_label.setBounds(10, 190, 137, 16);
		getContentPane().add(country_label);
		
		country.setFont(new Font("", Font.BOLD, 12));
		country.setBounds(141, 190, 169, 20);
		getContentPane().add(country);
		
		final JLabel city_label = new JLabel("City:");
		city_label.setFont(new Font("", Font.BOLD, 12));
		city_label.setBounds(10, 220, 137, 16);
		getContentPane().add(city_label);
		
		city.setFont(new Font("", Font.BOLD, 12));
		city.setBounds(141, 220, 169, 20);
		getContentPane().add(city);
		
		final JLabel email_label = new JLabel("House Number:");
		email_label.setFont(new Font("", Font.BOLD, 12));
		email_label.setBounds(10, 250, 137, 16);
		getContentPane().add(email_label);
		
		email.setFont(new Font("", Font.BOLD, 12));
		email.setBounds(141, 250, 169, 20);
		getContentPane().add(email);
		
		
	
		
		JButton addButton = new JButton("Add Player");
        addButton.setToolTipText("Add User");
        addButton.setBackground(Color.white);
        addButton.setBorderPainted(false);
        addButton.setFont(new Font("", Font.BOLD, 12));
		addButton.addActionListener(this);
		addButton.setBounds(141, 320, 120, 50);
		getContentPane().add(addButton);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	/*	try {
			
			if(manu != null && system.addManufacturer(name.getText(),Country.getText(), City.getText(), Street.getText(), Integer.parseInt(HouseNumber.getText()), ZipCode.getText(), Integer.parseInt(profitPercentage.getText()))) {
				message.Information("The Manufacturer " + name.getText()+ 
										"\nwas successfully added to the systemtem");
			}
			else {
				message.Error("The Manufacturer" + name.getText() + 
										"\nwas not added to the systemtem");
			}
		}
		catch(Exception e) {
			message.Error(e.getMessage());
		}*/
	}

		}
