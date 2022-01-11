package P1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class box3 extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	public static String usernamee;
	public static String nume1;
	public static String prenume1;
	public static String zi;
	public static String luna;
	public static String an;
	public static String cetatenie1;
	public static String gen1;
	public static String email1;
	public static String nrteltip1;
	public static String nrtel1;
	public static String adrtip1;
	public static String tara1;
	public static String localitate1;
	public static String strada1;
	public static String functie1;
	public static String angajator1;
	public static String localitate_job;
	public static String tara_job;
	public static String activitati1;
	public static String educatie1;
	public static String materna1;
	public static String limbi1;
	public static String digitale1;
	public static String tip_job1;
	public static String nivel_job1;
	public static String salariu1;
		public static String carnet1;
	public static String diploma1;
		public static String specializare1;
		public static String calatorit1;
		public static String sumar1;
		public static int id=0;
		public static int id_dorit=0;
		private JPasswordField parola;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box3 frame = new box3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public box3() {
		setBackground(new Color(221, 224, 189));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setBounds(100, 100, 523, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Inregistrare");
		lblNewLabel.setForeground(new Color(61,61,61));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblNewLabel.setBounds(154, 28, 272, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(61,61,61));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(149, 137, 202, 30);
		contentPane.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setForeground(new Color(61,61,61));
		username.setBackground(new Color(254,229,255));
		username.setBounds(149, 178, 242, 28);
		username.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Parola");
		lblNewLabel_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(149, 219, 202, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JButton inregistrare = new JButton("Inregistrare");
		inregistrare.setForeground(new Color(61,61,61));
		inregistrare.setBackground(new Color(254,229,255));
		inregistrare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					int ok=0;
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
					      String query = "SELECT username,parola FROM users2"; 
					      PreparedStatement ps = conn.prepareStatement(query);
					      ResultSet rs = (ResultSet) ps.executeQuery();
					      int ku=0;
					      int kp=0;
					      while (rs.next())
					      {
					          if(username.getText().equals(rs.getString("username")))
					        	  ku=1;
					          if(parola.getText().equals(rs.getString("parola")))
					        	  kp=1;
					      }       
				if(username.getText().length()==0){
					JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de username!");
						ok=1;
						}
				else
				if(parola.getText().length()==0){
					JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de parola!");
						ok=1;
						}
				else
					if(ku==0){
						JOptionPane.showMessageDialog(contentPane,"Acest username nu exista!");
						    ok=1;
						    }
					else
						if(kp==0){
							JOptionPane.showMessageDialog(contentPane,"Parola incorecta!");
							    ok=1;
							    }
				
					
				if(ok==0)
					{
					usernamee=username.getText();
					JOptionPane.showMessageDialog(contentPane,"Inregistrare in cont realizata cu succes!");
					dispose();
					box4 b4=new box4();
					b4.setVisible(true);
					
					}
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		inregistrare.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		inregistrare.setBounds(295, 335, 153, 36);
		inregistrare.setFocusable(false);
		inregistrare.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(inregistrare);
		
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(new Color(61,61,61));
		cancel.setBackground(new Color(254,229,255));
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box1 b1=new box1();
					b1.setVisible(true);
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		cancel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		cancel.setBounds(98, 333, 153, 36);
		cancel.setFocusable(false);
		cancel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(cancel);
		
		JLabel imaginee = new JLabel("");
		imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
		imaginee.setBounds(-18, -30, 642, 546);
		contentPane.add(imaginee);
		
		parola = new JPasswordField();
		parola.setForeground(new Color(61,61,61));
		parola.setBackground(new Color(254,229,255));
		parola.setBounds(149, 260, 242, 30);
		contentPane.add(parola);
	}
}
