import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class removepatientinformation {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					removepatientinformation window = new removepatientinformation();
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
	public removepatientinformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1316, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Enter Patient ID that you want to remove :");
		lblNewLabel.setForeground(new Color(255, 0, 51));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(427, 300, 457, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setForeground(new Color(204, 51, 0));
		textField.setBackground(new Color(255, 204, 102));
		textField.setBounds(891, 300, 168, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String patientid=textField.getText();
				System.out.println(patientid);
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem","root","");
					if(textField.getText().equals(" "))
					{
						JOptionPane.showMessageDialog(null,"Please Fill The Patient ID");
						textField.setText("");
					}
					else
					{

						PreparedStatement st = con.prepareStatement("Select patientid  from addpatientinformation where patientid=?");
						st.setString(1,patientid);
						ResultSet rs= st.executeQuery();
						if(rs.next())
						{
							JOptionPane.showMessageDialog(btnNewButton,"Patient ID is Correct");
							String sql="DELETE FROM addpatientinformation WHERE patientid=?";
							
							PreparedStatement st1 = con.prepareStatement(sql);
							st1.setString(1,patientid);
							int i=st1.executeUpdate();
							System.out.println( "record deleted");
						
						//	con.commit();
								JOptionPane.showMessageDialog(btnNewButton,"Patient History Is Deleted Sucessfully");
								
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
				catch (Exception y)
				{
					System.out.println(y);
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(906, 380, 120, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Home Page");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				home1 hm3=new home1();
				hm3.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(0, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(875, 442, 184, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\sai\\Downloads\\deletepatientrecord.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1300, 700);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
