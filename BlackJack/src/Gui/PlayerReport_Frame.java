package Gui;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import model.Player;
import Controller.Controler;




import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import model.Player;
import Controller.Controler;




public class PlayerReport_Frame extends JFrame implements ActionListener  {

	private static final long serialVersionUID = 1L;
	protected JDesktopPane JDP = new JDesktopPane();
	DefaultTableModel model = new DefaultTableModel();
	JTable table = new JTable(model);
	Controler sys;
	/**
	 * Constructor for DiscardRedCards_Frame class 
	 */
	public PlayerReport_Frame(Controler system) {
		sys=system;

		this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		this.setContentPane(JDP);
		
		JDP.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		JDP.setBorder(new LineBorder(Color.black, 1, false));
		JDP.setBackground(Color.LIGHT_GRAY);
		JDP.setAutoscrolls(true);
		
		Dimension screenSize = getToolkit().getScreenSize();
	    setBounds(50, 50, screenSize.width  - 700, screenSize.height - 400);
		setSize(700, 550);
		
		final JLabel subject_label = new JLabel("            the Best Player");
		subject_label.setFont(new Font("Dialog", Font.HANGING_BASELINE, 22));
		subject_label.setBounds(198, 10, 500, 26);
	
		getContentPane().add(subject_label);
		
		table.setBackground(new Color (255, 250, 205));
		table.setFont(new Font("", Font.BOLD, 12));
		table.setBounds(30, 60, 600, 300);
		table.setBorder(new LineBorder(Color.black, 1, false));
		table.setAutoscrolls(true); 
		table.setSelectionBackground(new Color(174, 238, 238));
		table.setLayout(null);
		JScrollPane pane = new JScrollPane(table);
		table.setVisible(true);
		pane.setBounds(table.getBounds());
		getContentPane().add(pane);
		
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("User Name");
		model.addColumn("Much Money");
		
		
	JTableHeader header = table.getTableHeader();
		header.setBackground(new Color (255, 215, 0));
		header.setForeground(Color.BLUE);
		header.setFont(new Font ("", Font.BOLD, 15));
		header.setVisible(true);
		java.net.URL url3 = LogIn_Frame.class.getResource("/pictures/rep.png");
		JButton report = new JButton ("",new ImageIcon(url3));	
		
        report.setToolTipText("Report");
        report.setBackground(JDP.getBackground());
        report.setBorderPainted(false);
        report.setFont(new Font("", Font.BOLD, 12));
		report.addActionListener(this);

		report.setBounds(250, 400,70 , 50);
		getContentPane().add(report);
				
	}

	private void updateReport() {
		for (int i = model.getRowCount()-1; i >= 0; i--){
			model.removeRow(i);
		}
		
			Collection<Player> result = sys.WhosBest();
			if(result == null || result.isEmpty()) {
				JOptionPane.showInternalMessageDialog(getContentPane(), "there is no players", "error", JOptionPane.ERROR_MESSAGE);
				
			}
			else {
				for (Player e: result){
					model.insertRow(model.getRowCount(),new String[] {e.getFirstName(),e.getLastName(),e.getUserName(),e.getMoney()+ ""});
				}
			}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			updateReport();
		}
		catch (Exception e){
			JOptionPane.showInternalMessageDialog(getContentPane(), "error", "ERROR", JOptionPane.ERROR_MESSAGE);
		
		}
	}
}