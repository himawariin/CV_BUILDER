package P1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class box11 extends JFrame {

	private JPanel contentPane;
	private JTextField id_dorit;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box11 frame = new box11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public box11() throws ClassNotFoundException, SQLException {
		setBackground(new Color(221, 224, 189));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblModificareCvExistent = new JLabel("Modificare CV existent in istoric");
		lblModificareCvExistent.setForeground(new Color(61, 61, 61));
		lblModificareCvExistent.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblModificareCvExistent.setBounds(198, 31, 590, 48);
		contentPane.add(lblModificareCvExistent);

		JButton Inapoi = new JButton("Inapoi");
		Inapoi.setForeground(new Color(61, 61, 61));
		Inapoi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		Inapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box4 b4 = new box4();
					b4.setVisible(true);
				} catch (Exception el) {
					System.out.println(el);
				}
			}
		});
		Inapoi.setBackground(new Color(254, 229, 255));
		Inapoi.setBounds(10, 115, 153, 36);
		Inapoi.setFocusable(false);
		Inapoi.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(Inapoi);

		JButton ModificaCV = new JButton("Modifica CV");
		ModificaCV.setForeground(new Color(61, 61, 61));
		ModificaCV.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		ModificaCV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					box3.id_dorit = Integer.parseInt(id_dorit.getText());
					int ok = 0;
					if (id_dorit.getText().length() == 0) {
						JOptionPane.showMessageDialog(contentPane,
								"Trebuie sa completati tabelul pentru numarul CV-ului dorit");
						ok = 1;
					}
					if (ok == 0) {

						
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1",
								"root", "");
						PreparedStatement ps = conn.prepareStatement("SELECT * FROM caracter_personal");
						int id_cautat=0;
						
						ResultSet rs = (ResultSet) ps.executeQuery();
						while (rs.next()) {
							if (box3.usernamee.equals(rs.getString("username")))
							if(box3.id_dorit == id_cautat)
							{box3.id_dorit=Integer.parseInt(rs.getString("Id"));
								break;
							}
							else
								id_cautat++;
						}

						conn.close();
						
						
						Class.forName("com.mysql.jdbc.Driver");
						conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1",
								"root", "");
						 ps = conn.prepareStatement("SELECT * FROM caracter_personal");

						 rs = (ResultSet) ps.executeQuery();
						while (rs.next()) {
							if (box3.usernamee.equals(rs.getString("username"))
									&& box3.id_dorit == Integer.parseInt(rs.getString("Id"))) {
								box3.nume1 = rs.getString("nume");
								box3.prenume1 = rs.getString("prenume");
								String data = rs.getString("data_nastere");
								String[] parts = data.split("/");
								String part1 = parts[0];
								String part2 = parts[1];
								String part3 = parts[2];
								box3.zi = part3;
								box3.luna = part2;
								box3.an = part1;
								box3.cetatenie1 = rs.getString("cetatenie");
								box3.gen1 = rs.getString("gen");
								break;
							}
						}

						conn.close();

						Class.forName("com.mysql.jdbc.Driver");
						conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root",
								"");
						ps = conn.prepareStatement("SELECT * FROM altele");
						rs = (ResultSet) ps.executeQuery();
						while (rs.next()) {
							if (box3.usernamee.equals(rs.getString("username"))
									&& box3.id_dorit == Integer.parseInt(rs.getString("Id"))) {
								box3.tip_job1 = rs.getString("tip");
								box3.nivel_job1 = rs.getString("nivel");
								box3.salariu1 = rs.getString("salariu");
								box3.carnet1 = rs.getString("carnet");
								box3.sumar1 = rs.getString("sumar");
								box3.calatorit1 = rs.getString("calatorie");
								break;
							}
						}

						conn.close();

						Class.forName("com.mysql.jdbc.Driver");
						conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root",
								"");
						ps = conn.prepareStatement("SELECT * FROM contact");
						rs = (ResultSet) ps.executeQuery();
						while (rs.next()) {
							if (box3.usernamee.equals(rs.getString("username"))
									&& box3.id_dorit == Integer.parseInt(rs.getString("Id"))) {
								box3.email1 = rs.getString("email");
								box3.nrtel1 = rs.getString("telefon");
								box3.tara1 = rs.getString("tara");
								box3.localitate1 = rs.getString("localitate");
								box3.strada1 = rs.getString("strada");
								break;
							}
						}

						conn.close();

						Class.forName("com.mysql.jdbc.Driver");
						conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root",
								"");
						ps = conn.prepareStatement("SELECT * FROM educatie");
						rs = (ResultSet) ps.executeQuery();
						while (rs.next()) {
							if (box3.usernamee.equals(rs.getString("username"))
									&& box3.id_dorit == Integer.parseInt(rs.getString("Id"))) {
								box3.educatie1 = rs.getString("institutie");
								box3.materna1 = rs.getString("limba_materna");
								box3.limbi1 = rs.getString("limba_straina");
								box3.digitale1 = rs.getString("competente_digitale");
								box3.diploma1 = rs.getString("diploma");
								box3.specializare1 = rs.getString("specializare");
								break;
							}
						}

						conn.close();

						Class.forName("com.mysql.jdbc.Driver");
						conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root",
								"");
						ps = conn.prepareStatement("SELECT * FROM experienta");
						rs = (ResultSet) ps.executeQuery();
						while (rs.next()) {
							if (box3.usernamee.equals(rs.getString("username"))
									&& box3.id_dorit == Integer.parseInt(rs.getString("Id"))) {
								box3.functie1 = rs.getString("functie");
								box3.angajator1 = rs.getString("angajator");
								box3.localitate_job = rs.getString("localitate");
								box3.tara_job = rs.getString("tara");
								box3.activitati1 = rs.getString("responsabilitati");
								break;
							}
						}

						conn.close();

						dispose();
						box5 b5 = new box5();
						b5.setVisible(true);
					}
				} catch (Exception el) {
					System.out.println(el);
				}
			}
		});
		ModificaCV.setBackground(new Color(254, 229, 255));
		ModificaCV.setBounds(722, 115, 153, 36);
		ModificaCV.setFocusable(false);
		ModificaCV.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(ModificaCV);

		JLabel modif = new JLabel("Scrieti numarul de identificare al CV-ului:");
		modif.setForeground(new Color(61, 61, 61));
		modif.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		modif.setBounds(69, 169, 371, 37);
		contentPane.add(modif);

		id_dorit = new JTextField((String) null);
		id_dorit.setForeground(new Color(61, 61, 61));
		id_dorit.setColumns(10);
		id_dorit.setBackground(new Color(254, 229, 255));
		id_dorit.setBounds(443, 169, 85, 28);
		id_dorit.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(id_dorit);

		JLabel imaginee = new JLabel("");
		imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
		imaginee.setBounds(0, -19, 1149, 546);
		contentPane.add(imaginee);

		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1",
				"root", "");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM caracter_personal");
int m=0;
		ResultSet rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			if (box3.usernamee.equals(rs.getString("username"))) {
				m++;
				
			}
		}

		conn.close();
		
		String column[] = { "Id","Nume","Prenume","Data nasterii","Cetatenie","Gen","Email","Telefon","Tara","Localitate",
				"Adresa","Functie","Firma","Localiate job","Tara job","Experienta","Institutie","Diploma",
				"Specializare","Limba materna","Limbi straine","Competente digitale","Carnet auto","Tip job",
				"Nivel job","Salarii","Calatorie","Sumar" };
		
		int i=-1,j=0,idd=0;
		String[][] data = new String[m][29];
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1",
				"root", "");
		ps = conn.prepareStatement("SELECT * FROM caracter_personal");

		rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			if (box3.usernamee.equals(rs.getString("username"))) {
				i++;
				data[i][0]=Integer.toString(idd);
				idd++;
				data[i][1]=rs.getString("nume");
				data[i][2] = rs.getString("prenume");
				data[i][3] = rs.getString("data_nastere");
				data[i][4] = rs.getString("cetatenie");
				data[i][5] = rs.getString("gen");
			}
		}
		conn.close();


		i=0;
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root",
				"");
		ps = conn.prepareStatement("SELECT * FROM contact");
		rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			if (box3.usernamee.equals(rs.getString("username"))) {
				data[i][6] = rs.getString("email");
				data[i][7] = rs.getString("telefon");
				data[i][8] = rs.getString("tara");
				data[i][9] = rs.getString("localitate");
				data[i][10] = rs.getString("strada");
				i++;
			}
		}

		conn.close();	
		
		i=0;
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root",
				"");
		ps = conn.prepareStatement("SELECT * FROM experienta");
		rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			if (box3.usernamee.equals(rs.getString("username"))) {
				data[i][11]= rs.getString("functie");
				data[i][12] = rs.getString("angajator");
				data[i][13] = rs.getString("localitate");
				data[i][14] = rs.getString("tara");
				data[i][15] = rs.getString("responsabilitati");
				i++;
			}
		}

		conn.close();
		
		i=0;
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root",
				"");
		ps = conn.prepareStatement("SELECT * FROM educatie");
		rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			if (box3.usernamee.equals(rs.getString("username"))) {
				data[i][16] = rs.getString("institutie");
				data[i][17] = rs.getString("diploma");
				data[i][18] = rs.getString("specializare");
				data[i][19]= rs.getString("limba_materna");
				data[i][20] = rs.getString("limba_straina");
				data[i][21] = rs.getString("competente_digitale");
				
				i++;
			}
		}

		conn.close();	
		
		i=0;
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root",
				"");
		ps = conn.prepareStatement("SELECT * FROM altele");
		rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			if (box3.usernamee.equals(rs.getString("username"))) {
				data[i][22] = rs.getString("carnet");
				data[i][23] = rs.getString("tip");
				data[i][24] = rs.getString("nivel");
				data[i][25] = rs.getString("salariu");
				data[i][26]= rs.getString("calatorie");
				data[i][27] = rs.getString("sumar");

				i++;
			}
		}

		conn.close();

		
	   JTable jt = new JTable(data, column);
       jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		jt.setBounds(30, 40,1500, 600);
		JScrollPane sp = new JScrollPane(jt);
		sp.setBounds(10, 240, 850, 245);
		imaginee.add(sp);
	}
}
