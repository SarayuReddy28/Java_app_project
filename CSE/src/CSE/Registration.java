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

public class Registration {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(179, 6, 210, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel_1.setBounds(17, 70, 72, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL ID");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel_2.setBounds(17, 138, 105, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone No.");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel_3.setBounds(17, 186, 105, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		tf1 = new JTextField();
		tf1.setBounds(192, 70, 163, 37);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(192, 127, 163, 37);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(192, 180, 163, 37);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String name=tf1.getText();
				//JOptionPane.showMessageDialog(btnNewButton," HELLO  "+  name +"," + "\nRegistration Successful!! " );
				Login l = new Login() ;
				l.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(152, 261, 176, 37);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 589, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
