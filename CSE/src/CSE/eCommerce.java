package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eCommerce {

	private JFrame frame;
	int i=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eCommerce window = new eCommerce();
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
	public eCommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(239, 242, 248));
		frame.setBounds(100, 100, 770, 764);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
		lblNewLabel.setBounds(308, 6, 152, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/sarayureddy/Documents/Screenshots/Screenshot 2024-02-21 at 12.13.46 PM.png"));
		lblNewLabel_1.setBounds(24, 143, 268, 422);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/sarayureddy/Documents/Screenshots/Screenshot 2024-02-21 at 12.16.55 PM.png"));
		lblNewLabel_2.setBounds(429, 191, 262, 375);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rs 250/-\n");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(125, 576, 96, 34);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs 210/-");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblNewLabel_4.setBounds(513, 577, 78, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("/Users/sarayureddy/Documents/Screenshots/Screenshot 2024-02-21 at 12.28.45 PM.png"));
		lblNewLabel_5.setBounds(579, 24, 60, 47);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lb = new JLabel("CART : 0");
		lb.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lb.setBounds(651, 24, 85, 47);
		frame.getContentPane().add(lb);
		
		JLabel lb1 = new JLabel("TOTAL COST :");
		lb1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lb1.setBounds(571, 76, 152, 29);
		frame.getContentPane().add(lb1);
		
		JButton b1 = new JButton("Add to cart");
		b1.setForeground(Color.RED);
		b1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART: "+i);
				bill=bill+250;
				lb1.setText("TOTAL COST: "+bill);
				
			}
		});
		b1.setBounds(104, 638, 152, 29);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Add to cart");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART: "+i);
				bill=bill+210;
				lb1.setText("TOTAL COST: "+bill);
			}
		});
		b2.setBackground(new Color(105, 182, 255));
		b2.setForeground(Color.RED);
		b2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		b2.setBounds(496, 638, 159, 29);
		frame.getContentPane().add(b2);
		
		
	}
}
