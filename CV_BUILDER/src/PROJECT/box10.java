package P1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class box10 extends JFrame {

	private JPanel contentPane;
	private JTextField nume_fisier;
	public static String prez_sumar1;
	public static String prez_exp1;
	public static String detalii_pers1;
	public static String nume_fisier1;
	public static String personalizat1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box10 frame = new box10();
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
	public box10() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Downloads\\gradient.png"));
		setBackground(Color.WHITE);
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 452);
		contentPane = new JPanel();
		//contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblCvAlegere = new JLabel("CV - Alegere frame");
		lblCvAlegere.setForeground(new Color(61,61,61));
		lblCvAlegere.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblCvAlegere.setBounds(409, 33, 488, 48);
		contentPane.add(lblCvAlegere);
		
		
		JButton Inapoi = new JButton("Inapoi");
		Inapoi.setForeground(new Color(61,61,61));
		Inapoi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		Inapoi.setBackground(new Color(254,229,255));
		Inapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box9 b9=new box9();
					b9.setVisible(true);
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		Inapoi.setBounds(31, 47, 153, 36);
		 Inapoi.setFocusable(false);
		Inapoi.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(Inapoi);
		
		JLabel lblNewLabel_1_2 = new JLabel("Prezenta sumar:");
		lblNewLabel_1_2.setForeground(new Color(61,61,61));
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(31, 236, 175, 37);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Prezenta sectiune experiente profesionala:\r\n");
		lblNewLabel_1_2_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(31, 284, 349, 37);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Sectiunea de detalii personale:\r\n");
		lblNewLabel_1_2_2.setForeground(new Color(61,61,61));
		lblNewLabel_1_2_2.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel_1_2_2.setBounds(31, 332, 290, 37);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Alegeti un nume pentru fisierul creat:");
		lblNewLabel_1_2_2_2.setForeground(new Color(61,61,61));
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_2_2.setBounds(31, 140, 390, 37);
		contentPane.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel(".pdf");
		lblNewLabel_1_2_2_2_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_2_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_2_2_1.setBounds(688, 140, 54, 37);
		contentPane.add(lblNewLabel_1_2_2_2_1);
		
		nume_fisier = new JTextField();
		nume_fisier.setForeground(new Color(61,61,61));
		nume_fisier.setBounds(429, 140, 249, 28);
			nume_fisier.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(nume_fisier);
		nume_fisier.setColumns(10);
		
		JLabel lblNewLabel_1_2_2_2_2 = new JLabel("Alegeti frame-ul dorit:");
		lblNewLabel_1_2_2_2_2.setForeground(new Color(61,61,61));
		lblNewLabel_1_2_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_2_2_2.setBounds(31, 188, 390, 37);
		contentPane.add(lblNewLabel_1_2_2_2_2);
		
		JComboBox prez_sumar = new JComboBox();
		prez_sumar.setForeground(new Color(61,61,61));
		prez_sumar.setFont(new Font("Segoe UI", Font.BOLD, 17));
		prez_sumar.setModel(new DefaultComboBoxModel(new String[] {"da", "nu"}));
		prez_sumar.setBounds(174, 240, 62, 28);
		contentPane.add(prez_sumar);
		
		JComboBox prez_exp = new JComboBox();
		prez_exp.setForeground(new Color(61,61,61));
		prez_exp.setModel(new DefaultComboBoxModel(new String[] {"da", "nu"}));
		prez_exp.setFont(new Font("Segoe UI", Font.BOLD, 17));
		prez_exp.setBounds(385, 284, 62, 28);
		contentPane.add(prez_exp);
		
		JComboBox detalii_pers = new JComboBox();
		detalii_pers.setForeground(new Color(61,61,61));
		detalii_pers.setModel(new DefaultComboBoxModel(new String[] {"dispuse pe o coloana", "dispuse pe 2 coloane"}));
		detalii_pers.setFont(new Font("Segoe UI", Font.BOLD, 17));
		detalii_pers.setBounds(288, 332, 208, 28);
		contentPane.add(detalii_pers);
		
		
		
		JButton btnGenereazaCv = new JButton("Genereaza CV");
		btnGenereazaCv.setForeground(new Color(61,61,61));
		btnGenereazaCv.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnGenereazaCv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int defaultt=-1;
			    	 Class.forName("com.mysql.jdbc.Driver");
			    	 int k=0;
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
				      String query = "SELECT Id FROM contact"; 
				      PreparedStatement ps = conn.prepareStatement(query);
				      ResultSet rs = (ResultSet) ps.executeQuery();
				      while (rs.next())
				      {
				    	  if(Integer.parseInt(rs.getString("Id"))==1)
				    		  k=1;
				          if(Integer.parseInt(rs.getString("Id"))>defaultt)
				        	  defaultt=Integer.parseInt(rs.getString("Id"));
				      }       
				      box3.id=defaultt+1;
				      conn.close();
				      
					int ok=0;
					if(nume_fisier.getText().length()==0)
					{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul pentru numele fisierului");
					ok=1;
					}
					if(ok==0)
					{Class.forName("com.mysql.jdbc.Driver");
					conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
					 ps=conn.prepareStatement("insert into caracter_personal(username,nume,prenume,data_nastere,cetatenie,gen,Id) values(?,?,?,?,?,?,?);"	);
					String data=box3.an+"/"+box3.luna+"/"+box3.zi;
					ps.setString(1, box3.usernamee);
					ps.setString(2, box3.nume1);
					ps.setString(3, box3.prenume1);
					ps.setString(4, data);
					ps.setString(5, box3.cetatenie1);
					ps.setString(6, box3.gen1);
					ps.setInt(7, box3.id);
					int x=ps.executeUpdate();
					conn.close();

					Class.forName("com.mysql.jdbc.Driver");
					conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
					ps=conn.prepareStatement("insert into contact(username,email,telefon,tara,localitate,strada,Id) values(?,?,?,?,?,?,?);"	);
					ps.setString(1, box3.usernamee);
					ps.setString(2, box3.email1);
					ps.setString(3, box3.nrtel1);
					ps.setString(4, box3.tara1);
					ps.setString(5, box3.localitate1);
					ps.setString(6, box3.strada1);
					ps.setInt(7, box3.id);

					x=ps.executeUpdate();
					
					conn.close();
					
					Class.forName("com.mysql.jdbc.Driver");
					conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
					ps=conn.prepareStatement("insert into experienta(username,functie,angajator,tara,localitate,responsabilitati,Id) values(?,?,?,?,?,?,?);"	);
					ps.setString(1, box3.usernamee);
					ps.setString(2, box3.functie1);
					ps.setString(3, box3.angajator1);
					ps.setString(4, box3.tara_job);
					ps.setString(5, box3.localitate_job);
					ps.setString(6, box3.activitati1);
					ps.setInt(7, box3.id);

					x=ps.executeUpdate();
					conn.close();
					
					Class.forName("com.mysql.jdbc.Driver");
					conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
					ps=conn.prepareStatement("insert into educatie(username,institutie,diploma,specializare,limba_materna,limba_straina,competente_digitale,Id) values(?,?,?,?,?,?,?,?);"	);
					ps.setString(1, box3.usernamee);
					ps.setString(2, box3.educatie1);
					ps.setString(3, box3.diploma1);
					ps.setString(4, box3.specializare1);
					ps.setString(5, box3.materna1);
					ps.setString(6, box3.limbi1);
					ps.setString(7, box3.digitale1);
					ps.setInt(8, box3.id);

					x=ps.executeUpdate();

					Class.forName("com.mysql.jdbc.Driver");
					conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
					ps=conn.prepareStatement("insert into altele(username,carnet,tip,nivel,salariu,calatorie,Id) values(?,?,?,?,?,?,?);"	);
					ps.setString(1, box3.usernamee);
					ps.setString(2, box3.carnet1);
					ps.setString(3, box3.tip_job1);
					ps.setString(4, box3.nivel_job1);
					ps.setString(5, box3.salariu1);
					ps.setString(6, box3.calatorit1);
					ps.setInt(7, box3.id);

					x=ps.executeUpdate();		
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
					String query2 = ("UPDATE altele SET sumar=? WHERE username=?");
					PreparedStatement ps2=conn2.prepareStatement(query2);
					ps2.setString(1, box3.sumar1);
					ps2.setString(2, box3.usernamee);
					ps.setInt(3, box3.id);

					ps2.executeUpdate();
					conn2.close();
					
					nume_fisier1=nume_fisier.getText();
					prez_sumar1=(String) prez_sumar.getSelectedItem();
					prez_exp1=(String) prez_exp.getSelectedItem();
					detalii_pers1=(String) detalii_pers.getSelectedItem();

					
					
					JOptionPane.showMessageDialog(contentPane,"Cv-ul a fost generat!");
					Testing.main(null);

					dispose();
					box4 b4=new box4();
					b4.setVisible(true);
					}
					
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		btnGenereazaCv.setBackground(new Color(254,229,255));
		btnGenereazaCv.setBounds(850, 47, 153, 36);
		 btnGenereazaCv.setFocusable(false);
			btnGenereazaCv.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(btnGenereazaCv);
		
		JLabel lblNewLabel_3_1_3_1_1 = new JLabel("Va este recomandat sa alegeti optiunea  \"nu\" la prezenta sectiunii experientei profesional daca nu aveti experienta de munca");
		lblNewLabel_3_1_3_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_3_1_3_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3_1_3_1_1.setBounds(32, 103, 1088, 32);
		contentPane.add(lblNewLabel_3_1_3_1_1);
		
		JLabel imaginee = new JLabel("");
		imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
		imaginee.setBounds(0, 0, 1149, 584);
		contentPane.add(imaginee);
		
		
		
	}
}
