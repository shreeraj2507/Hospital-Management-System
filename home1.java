import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class home1 {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home1 window = new home1();
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
	public home1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 756, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("Add New Patient Record\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				addpatientinformation adp=new addpatientinformation();
				adp.frame.setVisible(true);
				

			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		btnNewButton.setBounds(40, 99, 300, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("See Patient Information");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				showrecord shw=new showrecord();
				shw.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 0));
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		btnNewButton_1.setBounds(40, 175, 300, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove Patient Information");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				removepatientinformation rem=new removepatientinformation();
				rem.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		btnNewButton_2.setForeground(new Color(255, 255, 0));
		btnNewButton_2.setBounds(40, 250, 300, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update Patient Age");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				updateage ua=new updateage();
				ua.frame.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		btnNewButton_3.setForeground(new Color(255, 255, 0));
		btnNewButton_3.setBounds(40, 328, 300, 40);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add Diagnosis Information");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adddiagnosticinformation adm=new adddiagnosticinformation();
				adm.frame.setVisible(true);
			}
		});
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		btnNewButton_4.setForeground(new Color(255, 255, 0));
		btnNewButton_4.setBounds(40, 408, 300, 40);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Hospital Information");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				hospitalinformation info=new hospitalinformation();
				info.frame.setVisible(true);
			}
		});
		
			

			
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		btnNewButton_5.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		btnNewButton_5.setForeground(new Color(255, 255, 0));
		btnNewButton_5.setBounds(40, 485, 300, 40);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("LOGOUT");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					
					frame.dispose();
					Login lg=new Login();
					lg.frame.setVisible(true);
				}
			}
		});
		btnNewButton_6.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		btnNewButton_6.setBackground(new Color(255, 255, 0));
		btnNewButton_6.setForeground(new Color(255, 0, 0));
		btnNewButton_6.setBounds(40, 558, 300, 40);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sai\\Downloads\\home2.jpg"));
		lblNewLabel.setBounds(0, 0, 1400, 750);
		frame.getContentPane().add(lblNewLabel);
	}
}
