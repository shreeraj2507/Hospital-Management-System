import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Login {

	public JFrame frame;
	private JTextField txtShreeraj;
	private JTextField textField;

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
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1239, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Username : ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(500, 250, 114, 28);
		frame.getContentPane().add(lblNewLabel);
		
		txtShreeraj = new JTextField();
		txtShreeraj.setForeground(new Color(0, 0, 128));
		txtShreeraj.setBackground(SystemColor.menu);
		txtShreeraj.setFont(new Font("Calibri", Font.ITALIC, 17));
		txtShreeraj.setBounds(700, 250, 192, 28);
		frame.getContentPane().add(txtShreeraj);
		txtShreeraj.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(500, 300, 114, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.ITALIC, 17));
		textField.setForeground(new Color(0, 0, 128));
		textField.setBackground(SystemColor.menu);
		textField.setBounds(700, 300, 192, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=  (txtShreeraj.getText());
				String password= (textField.getText());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem","root","");
					PreparedStatement st = con.prepareStatement("Select username,passw from createaccount where username=? and passw=?");
						 st.setString(1,username);
						 st.setString(2,password);
						ResultSet rs= st.executeQuery();
						if(rs.next())
						{
							JOptionPane.showMessageDialog(btnNewButton,"Login Sucessfully");
							dispose();
							new home1();	
						}
						else
						{
							JOptionPane.showMessageDialog(btnNewButton,"Invalid Username or Passowrd");
						}
					}
				catch(Exception e1)
				{
					System.out.println(e1);
				}	
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}

			private String String(String text) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(50, 205, 50));
		btnNewButton.setBounds(500, 372, 97, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to close application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
			}	
		});
		btnNewButton_1.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(800, 372, 97, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Create New Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				createnewaccount cr=new createnewaccount();
				cr.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.YELLOW);
		btnNewButton_2.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_2.setBounds(565, 432, 224, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sai\\Downloads\\login image for HMS 4.jpg"));
		lblNewLabel_2.setBounds(10, 219, 1290, 481);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sai\\Downloads\\aiims 22.jpg"));
		lblNewLabel_3.setBounds(72, 24, 1141, 186);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
