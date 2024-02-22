package CSE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration1 {

	private JFrame frame;
	private JTextField td1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration1 window = new Registration1();
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
	public Registration1() {
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
		lblNewLabel.setBounds(233, 6, 211, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(63, 81, 108, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch\n");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(63, 140, 108, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		td1 = new JTextField();
		td1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		td1.setBounds(289, 78, 166, 35);
		frame.getContentPane().add(td1);
		td1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "CSE", "CSE-CS", "CSE-DS", "CSE-AIML", "ECE", "EEE", "IOT"}));
		cb1.setBounds(289, 143, 166, 27);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblNewLabel_3.setBounds(63, 204, 82, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton r1 = new JRadioButton("FEMALE");
		r1.setBounds(302, 207, 95, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("MALE");
		r2.setBounds(409, 207, 69, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel lblNewLabel_4 = new JLabel("Programming Language");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.ITALIC, 18));
		lblNewLabel_4.setBounds(59, 256, 213, 48);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox c1 = new JCheckBox("JAVA");
		c1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		c1.setBounds(302, 270, 82, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("PYTHON");
		c2.setBounds(404, 270, 108, 23);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=td1.getText();
				String b=(String)cb1.getSelectedItem();
				String g;
				if(r1.isSelected()) 
				{
				  g="FEMALE";
			    }
				else if(r2.isSelected()) 
				{
				  g="MALE";
			    }
				else
				{
				  g="Invalid";
				}
				String pl=" ";
				if(c1.isSelected())
				{
					pl=pl+"  JAVA";
				}
				if(c2.isSelected())
				{
					pl=pl+"  PYTHON";
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Hello  "+ n+"\nPlease confirm your details: \nNAME: "+n+
						"\nBRANCH: "+b+"\nGENDER: "+g+"\nPROGRAMMING LANGUAGE: "+pl);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "REGISTRANTION SUCCESSFUL");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "REGISTRANTION UNSUCCESSFUL");
				}
						
			}
		});
		btnNewButton.setBounds(233, 362, 127, 35);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 682, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
