import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class showrecord {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_9;
	private JLabel lblNewLabel_10;
	private JTextField textField_10;
	private JLabel lblNewLabel_11;
	private JTextField textField_11;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showrecord window = new showrecord();
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
	public showrecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1289, 1001);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Enter Patient ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setBounds(432, 60, 232, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setForeground(new Color(0, 255, 255));
		textField.setBackground(Color.BLACK);
		textField.setBounds(704, 60, 149, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton(" Click to View Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String patientid=textField.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem","root","");
					if(textField.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Fill The Patient ID");
						textField.setText("");
					}
					else
					{
						PreparedStatement st = con.prepareStatement("Select patientid  from addpatientinformation where patientid=?");
						st.setString(1,patientid);
						ResultSet rs= st.executeQuery("SELECT * from  addpatientinformation  WHERE patientid='"+patientid+"'");
						if(rs.next())
						{
							String name=rs.getString("name");
							textField_1.setText(name);
							String gender=rs.getString("gender");
							textField_2.setText(gender);
							String contactno=rs.getString("contactno");
							textField_3.setText(contactno);
							String bloodgroup=rs.getString("bloodgroup");
							textField_4.setText(bloodgroup);
							String address=rs.getString("address");
							textField_5.setText(address);
							String majordisease=rs.getString("majordisease");
							textField_6.setText(majordisease);
							String age=rs.getString("age");
							textField_7.setText(age);
							String symptoms=rs.getString("symptoms");
							textField_8.setText(symptoms);
							String medicines=rs.getString("medicines");
							textField_9.setText(medicines);
							String wardrequired=rs.getString("wardrequired");
							textField_10.setText(wardrequired);
							String typeofward=rs.getString("typeofward");
							textField_11.setText(typeofward);
							
							
							JOptionPane.showMessageDialog(btnNewButton,"Patient ID is Correct");
							//JOptionPane.showMessageDialog(btnNewButton,"Patient ID is Correct");
							//String sql=("SELECT name , gender ,contactno , bloodgroup , address , majordisease , age , symptoms , medicines , wardrequired , typeofward from  addpatientinformation  WHERE patientid='"+patientid+"'");
							//PreparedStatement st1 = con.prepareStatement(sql);
							//String name=((ResultSet) st1).getString("name");
							//textField_1.setText(name);
							
						}
					}
				}
				catch(Exception h)
				{
					System.out.println(h);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(514, 118, 270, 26);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel(" Name :");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(177, 184, 197, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 255, 255));
		textField_1.setBackground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBounds(432, 184, 611, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Gender :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setBounds(177, 237, 197, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 255, 255));
		textField_2.setBackground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setBounds(432, 237, 611, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel(" Contact No :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setBounds(177, 283, 197, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 255, 255));
		textField_3.setBackground(Color.BLACK);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setBounds(432, 286, 611, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_4 = new JLabel(" Blood Group :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setForeground(Color.YELLOW);
		lblNewLabel_4.setBounds(177, 334, 197, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 255, 255));
		textField_4.setBackground(Color.BLACK);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setBounds(432, 337, 611, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_5 = new JLabel(" Address :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setBounds(177, 387, 197, 26);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(0, 255, 255));
		textField_5.setBackground(Color.BLACK);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setBounds(432, 387, 611, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_6 = new JLabel(" Any Major Disease :");
		lblNewLabel_6.setForeground(Color.YELLOW);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(177, 438, 197, 26);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setForeground(new Color(0, 255, 255));
		textField_6.setBackground(Color.BLACK);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setBounds(432, 438, 611, 26);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_7 = new JLabel(" Age :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setForeground(Color.YELLOW);
		lblNewLabel_7.setBounds(177, 488, 197, 26);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setForeground(new Color(0, 255, 255));
		textField_7.setBackground(Color.BLACK);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_7.setBounds(432, 488, 616, 26);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_8 = new JLabel(" Symptoms :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setBounds(177, 537, 197, 26);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setForeground(new Color(0, 255, 255));
		textField_8.setBackground(Color.BLACK);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_8.setBounds(432, 537, 616, 26);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		lblNewLabel_9 = new JLabel(" Medicines :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setForeground(Color.YELLOW);
		lblNewLabel_9.setBounds(177, 587, 197, 26);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_9 = new JTextField();
		textField_9.setForeground(new Color(0, 255, 255));
		textField_9.setBackground(Color.BLACK);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_9.setBounds(432, 587, 616, 26);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Ward Required :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setForeground(Color.YELLOW);
		lblNewLabel_10.setBounds(177, 644, 197, 26);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_10 = new JTextField();
		textField_10.setForeground(new Color(0, 255, 255));
		textField_10.setBackground(Color.BLACK);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_10.setBounds(432, 644, 284, 26);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		lblNewLabel_11 = new JLabel("Type of Ward :");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_11.setForeground(Color.YELLOW);
		lblNewLabel_11.setBounds(773, 644, 210, 26);
		frame.getContentPane().add(lblNewLabel_11);
		
		textField_11 = new JTextField();
		textField_11.setForeground(new Color(0, 255, 255));
		textField_11.setBackground(Color.BLACK);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_11.setBounds(957, 644, 253, 26);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		btnNewButton_1 = new JButton("Home Page");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				home1 hm10=new home1();
				hm10.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(1027, 118, 183, 26);
		frame.getContentPane().add(btnNewButton_1);
	}

}
