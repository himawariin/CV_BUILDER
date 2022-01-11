package P1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

public class box5 extends JFrame {

	private JPanel contentPane;
	private JTextField nume;
	private JTextField prenume;
	private JTextField email;
	private JTextField nrtel;
	private JTextField localitate;
	private JTextField strada;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box5 frame = new box5();
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
	
	 public static boolean onlyDigits(String str)
	    {
	        String regex = "[0-9]+";
	        Pattern p = Pattern.compile(regex);
	        if (str == null) {
	            return false;
	        }
	        Matcher m = p.matcher(str);
	        return m.matches();
	    } 
	 
	public box5() {
		setBackground(new Color(221, 224, 189));
		setLocationRelativeTo(null);

		 JFrame f = new JFrame("World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setToolTipText("DD");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CV - Pas 1");
		lblNewLabel.setForeground(new Color(61,61,61));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblNewLabel.setBounds(431, 11, 295, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informatii de caracter personal");
		lblNewLabel_1.setForeground(new Color(61,61,61));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(47, 83, 387, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setForeground(new Color(61,61,61));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(49, 126, 127, 23);
		contentPane.add(lblNewLabel_2);
		
		nume = new JTextField(box3.nume1);
		nume.setBackground(new Color(254,229,255));
		nume.setForeground(new Color(61,61,61));
		nume.setBounds(50, 161, 255, 28);
		nume.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(nume);
		nume.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Prenume");
		lblNewLabel_2_1.setForeground(new Color(61,61,61));
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(358, 130, 127, 23);
		contentPane.add(lblNewLabel_2_1);
		
		prenume = new JTextField(box3.prenume1);
		prenume.setBackground(new Color(254,229,255));
		prenume.setForeground(new Color(61,61,61));
		prenume.setColumns(10);
		prenume.setBounds(358, 161, 255, 28);
		prenume.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(prenume);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Data nasterii");
		lblNewLabel_2_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(722, 133, 127, 23);
		contentPane.add(lblNewLabel_2_1_1);
		 
		 
		 JComboBox comboBox1 = new JComboBox();

		 comboBox1.setToolTipText("DD");
		 comboBox1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		 comboBox1.updateUI();
		 comboBox1.getModel().setSelectedItem(box3.zi);
		 comboBox1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 comboBox1.setBackground(new Color(254,229,255));
		 comboBox1.setForeground(new Color(61,61,61));
		 comboBox1.setBounds(754, 160, 49, 28);
		 comboBox1.setVisible(true);
			comboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(comboBox1);
		 
		 JComboBox comboBox2 = new JComboBox();

		 comboBox2.setForeground(new Color(61,61,61));
		 comboBox2.setBackground(new Color(254,229,255));
		 comboBox2.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		 comboBox2.updateUI();
		 comboBox2.getModel().setSelectedItem(box3.luna);
		 comboBox2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 comboBox2.setBounds(866, 160, 49, 28);
			comboBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(comboBox2);
		 
		 JComboBox comboBox3 = new JComboBox();

		 comboBox3.setForeground(new Color(61,61,61));
		 comboBox3.setBackground(new Color(254,229,255));
		 comboBox3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 comboBox3.setModel(new DefaultComboBoxModel(new String[] {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", ""}));
		 comboBox3.updateUI();
		 comboBox3.getModel().setSelectedItem(box3.an);
		 comboBox3.setBounds(982, 160, 83, 28);
			comboBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(comboBox3);
		 
		 JLabel lblNewLabel_3 = new JLabel("DD");
		 lblNewLabel_3.setForeground(new Color(61,61,61));
		 lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3.setBounds(727, 153, 34, 39);
		 contentPane.add(lblNewLabel_3);
		 
		 JLabel lblNewLabel_3_1 = new JLabel("MM");
		 lblNewLabel_3_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3_1.setBounds(830, 154, 49, 39);
		 contentPane.add(lblNewLabel_3_1);
		 
		 JLabel lblNewLabel_3_1_1 = new JLabel("YYYY");
		 lblNewLabel_3_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3_1_1.setBounds(935, 154, 66, 39);
		 contentPane.add(lblNewLabel_3_1_1);
		 
		 JLabel lblNewLabel_2_1_2 = new JLabel("Cetatenie");
		 lblNewLabel_2_1_2.setForeground(new Color(61,61,61));
		 lblNewLabel_2_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_1_2.setBounds(47, 206, 127, 23);
		 contentPane.add(lblNewLabel_2_1_2);
		 
		 JComboBox cetatenie = new JComboBox();

		 cetatenie.setForeground(new Color(61,61,61));
		 cetatenie.setBackground(new Color(254,229,255));
		 cetatenie.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 cetatenie.setModel(new DefaultComboBoxModel(new String[] {"albanez", "andorian", "armenian", "austriac", "belarus", "belgian", "bulgar", "ceh", "croat", "elvetian", "estonian", "francez", "german", "georgian", "grec", "letonian", "lituanian", "macedonian", "moldovean", "polonez", "portughez", "roman", "rus", "sarb", "slovac", "slovean", "spaniol", "suedez", "finlandez", "turc", "ucrainean", "ungur"}));
		 cetatenie.updateUI();
		 cetatenie.getModel().setSelectedItem(box3.cetatenie1);
		 cetatenie.setBounds(47, 234, 194, 28);
		cetatenie.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(cetatenie);
		 
		 JLabel lblNewLabel_2_1_2_1 = new JLabel("Gen");
		 lblNewLabel_2_1_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_2_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_1_2_1.setBounds(395, 206, 127, 23);
		 contentPane.add(lblNewLabel_2_1_2_1);
		 
		 JComboBox gen = new JComboBox();
		 gen.setForeground(new Color(61,61,61));
		 gen.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 gen.setBackground(new Color(254,229,255));
		 gen.setModel(new DefaultComboBoxModel(new String[] {"Feminin", "Masculin", "Alta Varianta", "Nu indicati"}));
		 gen.updateUI();
		 gen.getModel().setSelectedItem(box3.gen1);
		 gen.setBounds(395, 233, 109, 28);
			gen.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(gen);
		 
		 JLabel lblNewLabel_1_1 = new JLabel("Contact");
		 lblNewLabel_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		 lblNewLabel_1_1.setBounds(51, 274, 119, 39);
		 contentPane.add(lblNewLabel_1_1);
		 
		 JLabel lblNewLabel_2_2 = new JLabel("Email");
		 lblNewLabel_2_2.setForeground(new Color(61,61,61));
		 lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_2.setBounds(46, 329, 127, 23);
		 contentPane.add(lblNewLabel_2_2);
		 
		 email = new JTextField(box3.email1);
		 email.setBackground(new Color(254,229,255));
		 email.setForeground(new Color(61,61,61));
		 email.setColumns(10);
		 email.setBounds(38, 356, 255, 28);
			email.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(email);
		 
		 JLabel lblNewLabel_2_2_1 = new JLabel("Numar de telefon");
		 lblNewLabel_2_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_2_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_2_1.setBounds(387, 330, 194, 23);
		 contentPane.add(lblNewLabel_2_2_1);
		 
		 JComboBox nrteltip = new JComboBox();
		 nrteltip.setForeground(new Color(61,61,61));
		 nrteltip.setBackground(new Color(254,229,255));
		 nrteltip.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 nrteltip.setModel(new DefaultComboBoxModel(new String[] {"Acasa", "Munca", "Numar de telefon mobil"}));

		 nrteltip.setBounds(450, 356, 109, 28);
			nrteltip.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(nrteltip);
		 
		 JLabel lblNewLabel_3_2 = new JLabel("Tip");
		 lblNewLabel_3_2.setForeground(new Color(61,61,61));
		 lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3_2.setBounds(409, 354, 34, 32);
		 contentPane.add(lblNewLabel_3_2);
		 
		 nrtel = new JTextField(box3.nrtel1);
		 nrtel.setForeground(new Color(61,61,61));
		 nrtel.setBackground(new Color(254,229,255));
		 nrtel.setColumns(10);
		 nrtel.setBounds(638, 357, 237, 28);
			nrtel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(nrtel);
		 
		 JLabel lblNewLabel_1_1_1 = new JLabel("Adresa");
		 lblNewLabel_1_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		 lblNewLabel_1_1_1.setBounds(47, 399, 119, 39);
		 contentPane.add(lblNewLabel_1_1_1);
		 
		 JLabel lblNewLabel_3_2_1 = new JLabel("Tip");
		 lblNewLabel_3_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3_2_1.setBounds(48, 436, 34, 32);
		 contentPane.add(lblNewLabel_3_2_1);
		 
		 JComboBox adrtip = new JComboBox();
		 adrtip.setForeground(new Color(61,61,61));
		 adrtip.setBackground(new Color(254,229,255));
		 adrtip.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 adrtip.setModel(new DefaultComboBoxModel(new String[] {"Acasa", "Munca", "Alta varianta"}));
		 adrtip.setBounds(46, 469, 109, 28);
			adrtip.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(adrtip);
		 
		 JLabel lblNewLabel_2_2_2 = new JLabel("Tara");
		 lblNewLabel_2_2_2.setForeground(new Color(61,61,61));
		 lblNewLabel_2_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_2_2.setBounds(228, 441, 127, 23);
		 contentPane.add(lblNewLabel_2_2_2);
		 
		 JComboBox tara = new JComboBox();
		 tara.setSelectedItem(box3.tara1);
		 tara.setForeground(new Color(61,61,61));
		 tara.setBackground(new Color(254,229,255));
		 tara.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 tara.setModel(new DefaultComboBoxModel(new String[] {"Albania ", "Andorra", "Armenia", "Austria", "Azerbaidjan", "Belarus", "Belgia", "Bosnia", "Her\u021Begovina", "Bulgaria", "Cehia", "Cipru", "Croa\u021Bia", "Danemarca", "Elve\u021Bia", "Estonia", "Finlanda", "Fran\u021Ba", "Georgia", "Germania", "Grecia", "Irlanda", "Islanda", "Italia", "Letonia", "Liechtenstein", "Lituania", "Luxemburg", "Macedonia de Nord", "Malta", "Republica Moldova", "Monaco", "Muntenegru", "Norvegia", "Polonia", "Portugalia", "Regatul Unit", "Romania", "Rusia", "San Marino", "Serbia", "Slovacia", "Slovenia", "Spania", "Suedia", "Turcia3", "\u021A\u0103rile de Jos", "Ucraina", "Ungaria", "Vatican"}));
		 tara.setBounds(229, 467, 140, 28);
		 contentPane.add(tara);
		 
		 JLabel lblNewLabel_2_2_2_1 = new JLabel("Localitate");
		 lblNewLabel_2_2_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_2_2_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_2_2_1.setBounds(443, 442, 127, 23);
		 contentPane.add(lblNewLabel_2_2_2_1);
		 
		 localitate = new JTextField(box3.localitate1);
		 localitate.setBackground(new Color(254,229,255));
		 localitate.setForeground(new Color(61,61,61));
		 localitate.setColumns(10);
		 localitate.setBounds(448, 468, 237, 28);
			localitate.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(localitate);
		 
		 JLabel lblNewLabel_2_2_2_1_1 = new JLabel("Strada, cladire, numar locuinta");
		 lblNewLabel_2_2_2_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_2_2_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_2_2_1_1.setBounds(749, 438, 284, 23);
		 contentPane.add(lblNewLabel_2_2_2_1_1);
		 
		 strada = new JTextField(box3.strada1);
		 strada.setBackground(new Color(254,229,255));
		 strada.setForeground(new Color(61,61,61));
		 strada.setColumns(10);
		 strada.setBounds(745, 468, 334, 28);
		strada.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(strada);
		 
		 JButton btnNewButton = new JButton("Inapoi");
		 btnNewButton.setForeground(new Color(61,61,61));
		 btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						dispose();
						box4 b4=new box4();
						b4.setVisible(true);
					}catch(Exception el) {
						System.out.println(el);
					}
				}
			});
		 btnNewButton.setBackground(new Color(254,229,255));
		 btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 btnNewButton.setBounds(35, 30, 153, 36);
		 btnNewButton.setFocusable(false);
		btnNewButton.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(btnNewButton);
		 
		 JButton btnMaiDeparte = new JButton("Mai departe");
		 btnMaiDeparte.setForeground(new Color(61,61,61));
		 btnMaiDeparte.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						int ok=0;
						if(nume.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de nume!");
						ok=1;
						}
						else
							if(prenume.getText().length()==0)
							{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de prenume!");
							ok=1;
							}
							else
								if(email.getText().length()==0)
								{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de email!");
								ok=1;
								}
								else
									if(nrtel.getText().length()==0)
									{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de numar de telefon!");
									ok=1;
									}
									else
						if(localitate.getText().length()==0)
							{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de localitate!");
							ok=1;
							}
						else
							if(strada.getText().length()==0)
								{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de detalii pentru adresa!");
								ok=1;
								}
							else
								if(nrtel.getText().length()!=10)
								{JOptionPane.showMessageDialog(contentPane,"Numarul de telefon nu este valid!");
								ok=1;
								}
								else
									if(onlyDigits(nrtel.getText())==false)
									{JOptionPane.showMessageDialog(contentPane,"Numarul de telefon nu este valid!");
									ok=1;
									}
						
						
					if(ok==0)
						{
						box3.nume1=nume.getText();
						box3.prenume1=prenume.getText();
						box3.zi=(String) comboBox1.getSelectedItem();
						box3.luna=(String) comboBox2.getSelectedItem();
						box3.an=(String) comboBox3.getSelectedItem();
						box3.cetatenie1=(String) cetatenie.getSelectedItem();
						box3.gen1=(String) gen.getSelectedItem();
						box3.email1=email.getText();
						box3.nrteltip1=(String) nrteltip.getSelectedItem();
						box3.nrtel1=nrtel.getText();
						box3.adrtip1=(String) adrtip.getSelectedItem();
						box3.tara1=(String) tara.getSelectedItem();
						box3.localitate1=localitate.getText();
						box3.strada1=strada.getText();
						dispose();
					box6 b6=new box6();
					b6.setVisible(true);
						}	
					}catch(Exception el) {
						System.out.println(el);
					}
				}
			});
		 btnMaiDeparte.setBackground(new Color(254,229,255));
		 btnMaiDeparte.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 btnMaiDeparte.setBounds(918, 29, 153, 36);
		btnMaiDeparte.setFocusable(false);
			btnMaiDeparte.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(btnMaiDeparte);
		 
		 JLabel lblNewLabel_2_1_3 = new JLabel("Nume");
		 lblNewLabel_2_1_3.setForeground(new Color(61,61,61));
		 lblNewLabel_2_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_1_3.setBounds(47, 133, 127, 23);
		 contentPane.add(lblNewLabel_2_1_3);
		 JLabel imaginee = new JLabel("");
			imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
			imaginee.setBounds(-1, 0, 1149, 546);
			contentPane.add(imaginee);
		
	}
}
