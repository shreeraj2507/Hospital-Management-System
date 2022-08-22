import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class addpatientinformation {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addpatientinformation window = new addpatientinformation();
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
	public addpatientinformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setForeground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Patient ID :");
		lblNewLabel.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(93, 129, 139, 32);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 0, 0));
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField.setBounds(433, 129, 294, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" Name :");
		lblNewLabel_1.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(93, 183, 139, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(128, 0, 0));
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_1.setBounds(433, 189, 294, 32);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Gender :");
		lblNewLabel_2.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setBounds(93, 237, 139, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Contact No :");
		lblNewLabel_3.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 0));
		lblNewLabel_3.setBounds(93, 291, 139, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(128, 0, 0));
		textField_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_3.setBounds(433, 291, 294, 32);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(128, 0, 0));
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		comboBox.setBounds(433, 239, 294, 32);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel(" Blood Group :");
		lblNewLabel_4.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblNewLabel_4.setForeground(new Color(255, 255, 0));
		lblNewLabel_4.setBounds(93, 345, 139, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(128, 0, 0));
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_2.setBounds(433, 350, 294, 32);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel(" Address :");
		lblNewLabel_5.setForeground(new Color(255, 255, 0));
		lblNewLabel_5.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblNewLabel_5.setBounds(93, 405, 139, 32);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(128, 0, 0));
		textField_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_4.setBounds(433, 410, 294, 32);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel(" Any Major Disease Suffered Earlier :");
		lblNewLabel_6.setBackground(new Color(0, 0, 0));
		lblNewLabel_6.setForeground(new Color(255, 255, 0));
		lblNewLabel_6.setFont(new Font("Gadugi", Font.BOLD, 20));
		lblNewLabel_6.setBounds(93, 461, 397, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(128, 0, 0));
		textField_5.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_5.setBounds(93, 504, 634, 32);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem","root","");
					if(textField.getText().equals("") && textField_1.getText().equals("") && comboBox.getSelectedItem().equals("") && textField_3.getText().equals(" ") 
							&& textField_2.getText().equals(" ") && textField_4.getText().equals("") && textField_5.getText().equals("") )
					{
						JOptionPane.showMessageDialog(null,"Please Fill All Data");
						textField.setText("");
						textField_1.setText("");
						textField_3.setText("");
						textField_2.setText("");
						textField_4.setText("");
						textField_5.setText("");
					}
					else if(e.getSource()== btnNewButton)
					{
						String patientid=textField.getText();
						String name=textField_1.getText();
						String gender=(String)comboBox.getSelectedItem();
						String contactno=textField_3.getText();
						String bloodgroup=textField_2.getText();
						String address=textField_4.getText();
						String majordisease=textField_5.getText();
						String query="INSERT INTO addpatientinformation(patientid ,name , gender , contactno , bloodgroup , address , majordisease ) VALUES (?,?,?,?,?,?,?)";
						PreparedStatement stmt=con.prepareStatement(query);
						stmt.setString(1, patientid);
						stmt.setString(2, name);
						stmt.setString(3, gender);
						stmt.setString(4, contactno);
						stmt.setString(5, bloodgroup);
						stmt.setString(6, address);
						stmt.setString(7, majordisease);
						stmt.executeUpdate();
						JOptionPane.showMessageDialog(null,"Patient Information is filled Sucessfully");
						frame.dispose();
						home1 hm2=new home1();
						hm2.frame.setVisible(true);
						
					
					}
				}
				catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
		btnNewButton.setFont(new Font("Gadugi", Font.BOLD, 25));
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(93, 572, 139, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				home1 cr=new home1();                                          
				cr.frame.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Gadugi", Font.BOLD, 25));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(608, 572, 119, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\sai\\Downloads\\add patient info.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1400, 700);
		frame.getContentPane().add(lblNewLabel_7);
		frame.setBounds(100, 100, 1176, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
