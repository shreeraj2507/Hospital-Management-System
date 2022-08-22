import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class adddiagnosticinformation {

	JFrame frame;
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
					adddiagnosticinformation window = new adddiagnosticinformation();
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
	public adddiagnosticinformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setBackground(new Color(255, 255, 153));
		frame.getContentPane().setForeground(new Color(255, 218, 185));
		frame.setBounds(100, 100, 1211, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Patient ID :");
		lblNewLabel.setBounds(368, 101, 126, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(555, 103, 148, 26);
		textField.setForeground(new Color(255, 228, 196));
		textField.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton(" Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String patientid=textField.getText();	
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
						}
						else
						{
							JOptionPane.showMessageDialog(btnNewButton,"Patient ID is Not Correct");
							textField.setText("");
						}
					}
				}
				catch(Exception a)
				{
					System.out.println(a);
				}
				
			}
		});
		btnNewButton.setBounds(747, 101, 134, 25);
		btnNewButton.setForeground(new Color(204, 255, 0));
		btnNewButton.setBackground(new Color(51, 102, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel(" Symptom's :");
		lblNewLabel_1.setForeground(new Color(102, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(274, 201, 139, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(153, 0, 153));
		textField_1.setFont(new Font("Franklin Gothic Book", Font.BOLD, 20));
		textField_1.setBounds(474, 201, 304, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Medicines :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(102, 0, 0));
		lblNewLabel_2.setBounds(274, 277, 139, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(153, 0, 153));
		textField_2.setFont(new Font("Franklin Gothic Book", Font.BOLD, 20));
		textField_2.setBounds(474, 277, 304, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("<<<<<  Diagnostic Information ");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_3.setBounds(832, 35, 472, 44);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" Ward Required :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setForeground(new Color(102, 0, 0));
		lblNewLabel_4.setBounds(274, 347, 180, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" Type of Ward :\r\n");
		lblNewLabel_5.setForeground(new Color(102, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(274, 408, 180, 25);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(153, 0, 153));
		comboBox.setFont(new Font("Franklin Gothic Book", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "General", "Special"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(474, 408, 184, 27);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton(" SAVE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String patientid1=textField.getText();
			String symptoms=textField_1.getText();
			String medicines=textField_2.getText();
			String wardrequired=textField_3.getText();
			String typeofward=(String) comboBox.getSelectedItem();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem","root","");
				if(textField_1.getText().equals("") && textField_2.getText().equals("") && textField_3.getText().equals("") && comboBox.getSelectedItem().equals("") )
				{
					JOptionPane.showMessageDialog(null,"Please Fill All The Data");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
				}
				else
				{
					PreparedStatement st = con.prepareStatement("UPDATE addpatientinformation SET symptoms=? , medicines=? , wardrequired =? , typeofward=?   WHERE patientid=?");
					st.setString(1,symptoms);
					st.setString(2,medicines);
					st.setString(3,wardrequired);
					st.setString(4,typeofward);
					st.setString(5,patientid1);
					st.executeUpdate();
					JOptionPane.showMessageDialog(btnNewButton,"Patient Diagnosis Information Is Added Sucessfully");
					frame.dispose();
					home1 hm9=new home1();
					hm9.frame.setVisible(true);
				}
			}
			catch(Exception b)
			{
				System.out.println(b);
			}
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_1.setForeground(new Color(0, 255, 0));
		btnNewButton_1.setBounds(913, 252, 119, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(" CLOSE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				home1 hm2=new home1();
				hm2.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(913, 369, 119, 28);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Franklin Gothic Book", Font.BOLD, 20));
		textField_3.setForeground(new Color(153, 0, 153));
		textField_3.setBounds(474, 347, 304, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\sai\\Downloads\\add diagnosis info.jpg"));
		lblNewLabel_6.setBounds(0, 0, 1400, 700);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
