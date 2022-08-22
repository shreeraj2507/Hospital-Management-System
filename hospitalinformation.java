import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hospitalinformation {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hospitalinformation window = new hospitalinformation();
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
	public hospitalinformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1386, 783);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sai\\Downloads\\aiims 22.jpg"));
		lblNewLabel.setBounds(101, 11, 1209, 191);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" > About Us ...");
		lblNewLabel_1.setForeground(new Color(255, 204, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(66, 242, 181, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea txtrAllIndiaInstitute = new JTextArea();
		txtrAllIndiaInstitute.setBackground(new Color(0, 0, 0));
		txtrAllIndiaInstitute.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtrAllIndiaInstitute.setForeground(new Color(0, 255, 255));
		txtrAllIndiaInstitute.setText("All India Institute of Medical Sciences Patna is strategically located to address regional imbalances in healthcare services, research, and training. ");
		txtrAllIndiaInstitute.setBounds(101, 290, 1209, 35);
		frame.getContentPane().add(txtrAllIndiaInstitute);
		
		JEditorPane dtrpnItWasEstablished = new JEditorPane();
		dtrpnItWasEstablished.setForeground(new Color(0, 255, 255));
		dtrpnItWasEstablished.setBackground(new Color(0, 0, 0));
		dtrpnItWasEstablished.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dtrpnItWasEstablished.setText("It was established under Pradhan Mantri Swasthya Surakhsha Yojna (PMSSY) during the first phase following the- then Prime Minister Atal Bihari Vajpayee\u2019s visionary announcement in Independence Day Speech on 15th August 2003.");
		dtrpnItWasEstablished.setBounds(101, 320, 1117, 49);
		frame.getContentPane().add(dtrpnItWasEstablished);
		
		JLabel lblNewLabel_2 = new JLabel(" > Facilities ...");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(255, 204, 0));
		lblNewLabel_2.setBounds(66, 402, 181, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JEditorPane dtrpnOpd = new JEditorPane();
		dtrpnOpd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dtrpnOpd.setBackground(new Color(0, 0, 0));
		dtrpnOpd.setForeground(new Color(0, 255, 255));
		dtrpnOpd.setText("1. OPD\r\n2. IPD\r\n3. ICU's\r\n4. Blood Bank\r\n5. Radiology\r\n6. Laboratories\r\n7. Pharmacy\r\n8. Biomedical Waste Management\r\n9. Patient Welfare Services\r\n10. IT Cell");
		dtrpnOpd.setBounds(101, 454, 322, 248);
		frame.getContentPane().add(dtrpnOpd);
		
		JLabel lblNewLabel_3 = new JLabel("> Important Contacts ...");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(255, 204, 0));
		lblNewLabel_3.setBounds(493, 402, 241, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" Phone :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setForeground(new Color(102, 255, 0));
		lblNewLabel_4.setBounds(519, 452, 129, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextPane txtpnHospital = new JTextPane();
		txtpnHospital.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtpnHospital.setBackground(new Color(0, 0, 0));
		txtpnHospital.setForeground(new Color(102, 255, 255));
		txtpnHospital.setText("Hospital : +91 6122451070\r\nAdministration : +91 6122451006");
		txtpnHospital.setBounds(529, 488, 310, 56);
		frame.getContentPane().add(txtpnHospital);
		
		JLabel lblNewLabel_5 = new JLabel("  E-mail :");
		lblNewLabel_5.setForeground(new Color(51, 255, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(519, 562, 145, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		JTextPane txtpnAdminataiimspatanagmailcom = new JTextPane();
		txtpnAdminataiimspatanagmailcom.setForeground(new Color(102, 255, 255));
		txtpnAdminataiimspatanagmailcom.setBackground(new Color(0, 0, 0));
		txtpnAdminataiimspatanagmailcom.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtpnAdminataiimspatanagmailcom.setText(" admin[at]aiimspatana@gmail.com");
		txtpnAdminataiimspatanagmailcom.setBounds(529, 610, 332, 35);
		frame.getContentPane().add(txtpnAdminataiimspatanagmailcom);
		
		JButton btnNewButton = new JButton(" Home Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				home1 hm=new home1();
				hm.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(1129, 598, 168, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
