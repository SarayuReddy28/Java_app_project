package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookMyShow {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookMyShow window = new BookMyShow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookMyShow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(185, 210, 255));
		frame.setBounds(100, 100, 694, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookMyShow");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 25));
		lblNewLabel.setBounds(238, 17, 206, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(68, 96, 90, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(252, 96, 178, 39);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(69, 183, 69, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "RRR", "NV NV", "JAWAN", "OYE", "SALAAR"}));
		c1.setBounds(252, 184, 149, 30);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_3 = new JLabel("TICKETS");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblNewLabel_3.setBounds(68, 274, 90, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		c2.setBounds(252, 275, 149, 27);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String sm=(String) c1.getSelectedItem();
				String nt=(String) c2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(sm.equals("--SELECT--")||nt.equals("0"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "HELLO "+n+
							"\nPLEASE SELECT VALID OPTIONS");
					
				}
				else {
			
				if(sm.equals("RRR")) 
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO "+n+
							"\nSelected Movie : "+sm+"\nNo.of Tickets: "+t+"\nYOUR BILL: "+bill);
				}
				else if(sm.equals("NV NV")) 
				{
					bill=150*t;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO "+n+
							"\nSelected Movie : "+sm+"\nNo.of Tickets: "+t+"\nYOUR BILL: "+bill);
				}
				else if(sm.equals("JAWAN")) 
				{
					bill=200*t;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO "+n+
							"\nSelected Movie : "+sm+"\nNo.of Tickets: "+t+"\nYOUR BILL: "+bill);
				}
				else if(sm.equals("OYE")) 
				{
					bill=180*t;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO "+n+
							"\nSelected Movie : "+sm+"\nNo.of Tickets: "+t+"\nYOUR BILL: "+bill);
				}
				else if(sm.equals("SALAAR")) 
				{
					bill=300*t;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO "+n+
							"\nSelected Movie : "+sm+"\nNo.of Tickets: "+t+"\nYOUR BILL: "+bill);
				}
				else if(sm.equals("--SELECT--"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "HELLO "+n+
							"\nPLEASE SELECT VALID OPTIONS");
				}
			}
				
			}
		});
		btnNewButton.setBounds(227, 349, 117, 39);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
