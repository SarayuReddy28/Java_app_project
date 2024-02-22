package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class FriendshipCal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FriendshipCal window = new FriendshipCal();
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
	public FriendshipCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Friendship Calculator");
		lblNewLabel_1.setFont(new Font("Heiti SC", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(154, 27, 276, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Your Name");
		lblNewLabel_2.setFont(new Font("Heiti SC", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(51, 122, 122, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Friend's Name");
		lblNewLabel_3.setFont(new Font("Heiti SC", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(51, 180, 157, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Heiti SC", Font.PLAIN, 15));
		textField.setBounds(252, 110, 142, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Heiti SC", Font.PLAIN, 15));
		textField_1.setBounds(252, 182, 142, 33);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r= new Random();
				int res=r.nextInt(1,100);
				JOptionPane.showMessageDialog(btnNewButton, "Your Friendship % is : "+res);
				
			}
		});
		btnNewButton.setFont(new Font("Heiti SC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(221, 264, 113, 45);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/sarayureddy/Downloads/winter-background.png"));
		lblNewLabel.setBounds(6, 6, 543, 356);
		frame.getContentPane().add(lblNewLabel);
	}
}
