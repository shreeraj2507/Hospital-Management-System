import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class createnewaccount {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createnewaccount window = new createnewaccount();
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
	public createnewaccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 1077, 584);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Account\r\n");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(226, 97, 411, 125);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Username :");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setBounds(210, 266, 151, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.ITALIC, 20));
		textField.setForeground(new Color(255, 0, 0));
		textField.setBounds(413, 266, 224, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Email -Id :");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(0, 255, 255));
		lblNewLabel_2.setBounds(210, 307, 151, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.ITALIC, 20));
		textField_1.setForeground(new Color(255, 0, 0));
		textField_1.setBounds(413, 311, 224, 27);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel(" Password :\r\n");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setBounds(210, 352, 151, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 0, 0));
		textField_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		textField_2.setBounds(413, 353, 224, 27);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel(" Confirm Password :");
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_4.setForeground(new Color(0, 255, 255));
		lblNewLabel_4.setBounds(210, 397, 178, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(255, 0, 0));
		textField_3.setFont(new Font("Tahoma", Font.ITALIC, 20));
		textField_3.setBounds(413, 398, 224, 27);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\sai\\Desktop\\Spark IT\\Java\\Java Project images\\login image2.png"));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(700, 110, 523, 500);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem","root","");
					if(textField.getText().equals("") && textField_1.getText().equals("") && textField_2.getText().equals("") && textField_3.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Fill All Data");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
					}
					else if(e.getSource()==btnNewButton)
					{
						
						String username=textField.getText();
						String email=textField_1.getText();
						String password=textField_2.getText();
						String confirm=password=textField_3.getText();
						String query="INSERT INTO createaccount VALUES (?,?,?,?)";
						PreparedStatement stmt=con.prepareStatement(query);
						stmt.setString(1,username);
						stmt.setString(2,email);
						stmt.setString(3,password);
						stmt.setString(4,confirm);
						stmt.executeUpdate();
						JOptionPane.showMessageDialog(null,"Your Account Is Created Sucessfully");
						frame.dispose();
						Login abc=new Login();
						abc.frame.setVisible(true);
						}
						
					}
					
					
				
				catch(Exception x)
				{
					System.out.println(x);
				}
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setBounds(413, 484, 178, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login Page");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Login lgn=new Login();
				lgn.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(73, 484, 178, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
