package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JPasswordField ps1;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(149, 31, 154, 23);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBackground(new Color(238, 238, 238));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setBounds(29, 100, 140, 23);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(29, 147, 129, 43);
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBounds(149, 213, 140, 36);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String un=tf1.getText();
				String ps=ps1.getText();
				if (un.equals("Sarayu")& ps.equals("123"))
				{
					JOptionPane.showMessageDialog(btnNewButton, " LOGIN SUCCESSFULL");
				}
				else 
				{
					JOptionPane.showMessageDialog(btnNewButton, " INVALID USERNAME OR PASSWORD");
				}
					
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		frame.getContentPane().add(btnNewButton);
		
		ps1 = new JPasswordField();
		ps1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		ps1.setBounds(170, 147, 133, 37);
		frame.getContentPane().add(ps1);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		tf1.setBounds(170, 97, 133, 38);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
