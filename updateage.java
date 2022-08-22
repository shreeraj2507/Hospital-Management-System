import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class updateage {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateage window = new updateage();
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
	public updateage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setBackground(new Color(153, 153, 102));
		frame.setBounds(100, 100, 1301, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Enter Patient ID :");
		lblNewLabel.setBounds(218, 178, 197, 26);
		lblNewLabel.setBackground(SystemColor.controlDkShadow);
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(458, 178, 136, 26);
		textField.setForeground(new Color(0, 0, 51));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton(" UPDATE");
		btnNewButton.setBounds(590, 300, 168, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String patientid=textField.getText();
				String age=textField_1.getText();
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem","root","");
					if(textField.getText().equals("") && textField_1.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Fill The Patient ID");
						textField.setText("");
						textField_1.setText("");
					}
					else
					{
						PreparedStatement st = con.prepareStatement("Select patientid  from addpatientinformation where patientid=?");
						st.setString(1,patientid);
						ResultSet rs= st.executeQuery();
						if(rs.next())
						{
							JOptionPane.showMessageDialog(btnNewButton,"Patient ID is Correct");
							String sql="UPDATE addpatientinformation SET age=?  WHERE patientid=?";
							PreparedStatement st1 = con.prepareStatement(sql);
							st1.setString(1,age);
							st1.setString(2,patientid);
							st1.executeUpdate();
							JOptionPane.showMessageDialog(btnNewButton,"Patient Age Is Added Sucessfully");
							frame.dispose();
							home1 hm4=new home1();
							hm4.frame.setVisible(true);
						}
						else
						{
							JOptionPane.showMessageDialog(btnNewButton,"Invalid Patient ID");
						}
					}
					
				}
				catch(Exception y)
				{
					System.out.println(y);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(51, 255, 204));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(" HOME PAGE");
		btnNewButton_1.setBounds(509, 410, 337, 34);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				home1 hm5=new home1();
				hm5.frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel(" Enter Current Age Of Patient :");
		lblNewLabel_1.setBounds(657, 178, 326, 26);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 102));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(1011, 178, 136, 27);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sai\\Downloads\\update age.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1400, 700);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}
}
