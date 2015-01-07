package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Help_Frame extends JFrame{

	/**
	 * 
	 */

	
	private JTextField firstname = new JTextField();
	private JTextField lastname = new JTextField();
	private JTextField username= new JTextField();

	protected JDesktopPane JDP = new JDesktopPane();

	
	
	public Help_Frame(){
		
			/**
			 * Constructor for AddNewSponser_Frame class 
			 */
			
				this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				this.setContentPane(JDP);
			
				//getContentPane().setBackground(Color.LIGHT_GRAY);  
				
				this.setSize(950,650);
			
				final JLabel lable = new JLabel("Rules Of BLackJack");
				lable.setFont(new Font("", Font.BOLD, 20));
				lable.setForeground(Color.RED);
				lable.setBounds(10, 20, 500, 25);
				getContentPane().add(lable);
				
				
				JPanel topPanel = new JPanel();
				topPanel.setLayout( new BorderLayout() );
				getContentPane().add( topPanel, BorderLayout.CENTER );
				
				JButton close = new JButton ("Close");

		        close.setToolTipText("Close");
		        close.setBorderPainted(true);
		        close.setFont(new Font("", Font.BOLD, 9));
		        close.setForeground(Color.WHITE);
		        close.setBackground(Color.RED);

		        close.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
				dispose();
					}
				});
			close.setBounds(860,566,70,40);
				getContentPane().add(close);
				JTextArea area = new JTextArea();
area.setFont(new Font("", Font.BOLD, 13));
		       JScrollPane scrollPane = new JScrollPane();
		        scrollPane.getViewport().add( area );
				scrollPane.setBounds( 10, 10, 280, 180 );
				topPanel.add( scrollPane, BorderLayout.CENTER );

				// Load a file into the text area, catching any exceptions
				try {
				    FileReader fileStream = new FileReader( "Help.txt" );
		    		area.read( fileStream, "Help.txt" );
		    	}
		    	catch( FileNotFoundException e )
		    	{
		    	    System.out.println( "File not found" );
		    	}
		    	catch( IOException e )
		    	{
		    	    System.out.println( "IOException occurred" );
		    	}
			area.setBounds(10,50,950,550);
getContentPane().add(area);
				
		

			
				
				
			
			
				
					}

				
				}