package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MetroTicketBooking {

	private JFrame frame;
	private JTextField td1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicketBooking window = new MetroTicketBooking();
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
	public MetroTicketBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 670, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKETS");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 28));
		lblNewLabel.setBounds(205, 6, 332, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(53, 165, 119, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		td1 = new JTextField();
		td1.setBackground(Color.LIGHT_GRAY);
		td1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		td1.setBounds(261, 152, 165, 35);
		frame.getContentPane().add(td1);
		td1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(53, 222, 70, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setBackground(Color.LIGHT_GRAY);
		c1.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "MYP", "JNTU", "KPHB", "UPPAL"}));
		c1.setBounds(255, 220, 172, 27);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(53, 284, 73, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c2 = new JComboBox();
		c2.setBackground(Color.LIGHT_GRAY);
		c2.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "MYP", "JNTU", "KPHB", "UPPAL"}));
		c2.setBounds(255, 282, 172, 27);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(53, 335, 119, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox c3 = new JComboBox();
		c3.setBackground(Color.LIGHT_GRAY);
		c3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		c3.setBounds(254, 340, 172, 27);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.setBackground(new Color(185, 210, 255));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=td1.getText();
				String f=(String) c1.getSelectedItem();
				String t=(String) c2.getSelectedItem();
				String mt=(String) c3.getSelectedItem();
				int total=Integer.parseInt(mt);
				int bill=0;
				
				if(f.equals(t))
				{
				   JOptionPane.showMessageDialog(btnNewButton, " KINDLY,Check Entered Stations ");
				}
				else if(f.equals("--SELECT--")||t.equals("--SELECT--")||mt.equals("0")) 
				{
					JOptionPane.showMessageDialog(btnNewButton, " KINDLY,Check Entered No.of Tickects ");
				}
				else
				{
					bill=total*40;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO "+n+"\nFROM: "+f+"\nTO: "+t+"\nTOTAL COST : "+bill);
				}
			}
		});
		btnNewButton.setBounds(219, 395, 159, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("/Users/sarayureddy/Downloads/downloadm.png"));
		lblNewLabel_5.setBounds(-40, 6, 166, 131);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
