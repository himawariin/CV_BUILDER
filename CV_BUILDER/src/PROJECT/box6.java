package P1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class box6 extends JFrame {

	private JPanel contentPane;
	private JTextField functie;
	private JTextField angajator;
	private JTextField localitate;
	private JTextField tara;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box6 frame = new box6();
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
	public box6() {
		setBackground(new Color(221, 224, 189));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setBounds(100, 100, 1163, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CV - Pas 2");
		lblNewLabel.setForeground(new Color(61,61,61));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblNewLabel.setBounds(431, 11, 295, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Inapoi");
		btnNewButton.setForeground(new Color(61,61,61));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box5 b5=new box5();
					b5.setVisible(true);
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		 btnNewButton.setBackground(new Color(254,229,255));
		 btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 btnNewButton.setBounds(35, 30, 109, 32);
		 btnNewButton.setFocusable(false);
		btnNewButton.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(btnNewButton);
		 
		 JEditorPane activitati = new JEditorPane();
		 activitati.setText(box3.activitati1);
		 activitati.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 activitati.setForeground(new Color(61,61,61));
		 activitati.setBackground(new Color(254,229,255));
		 activitati.setBounds(595, 337, 529, 130);
		 contentPane.add(activitati);
		 
		 JButton btnMaiDeparte = new JButton("Mai departe");
		 btnMaiDeparte.setForeground(new Color(61,61,61));
		 btnMaiDeparte.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						int ok=0;
						if(functie.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de functii!");
						ok=1;
						}
						else
							if(angajator.getText().length()==0)
							{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de angajatori!");
							ok=1;
							}
							else
						if(localitate.getText().length()==0)
							{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de localitate!");
							ok=1;
							}
						else
							if(tara.getText().length()==0)
								{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de tara!");
								ok=1;
								}
							else
								if(activitati.getText().length()==0)
								{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul pentru activitati la joburi anterioare!");
								ok=1;
								}
						
						
					if(ok==0)
						{
						 box3.functie1=functie.getText();
						 box3.angajator1=angajator.getText();
						 box3.localitate_job=localitate.getText();
						 box3.tara_job=tara.getText();
						 box3.activitati1=activitati.getText();
						 

					dispose();
					box8 b8=new box8();
					b8.setVisible(true);
						}	
					}catch(Exception el) {
						System.out.println(el);
					}
				}
			});
		 btnMaiDeparte.setBackground(new Color(254,229,255));
		 btnMaiDeparte.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 btnMaiDeparte.setBounds(943, 27, 153, 36);
		 btnMaiDeparte.setFocusable(false);
			btnMaiDeparte.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(btnMaiDeparte);
		 
		 JLabel lblNewLabel_1 = new JLabel("Experienta profesionala");
		 lblNewLabel_1.setForeground(new Color(61,61,61));
		 lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		 lblNewLabel_1.setBounds(35, 84, 288, 48);
		 contentPane.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_2 = new JLabel("Descrie\u021Bi \u00EEntreaga dumneavoastr\u0103 experien\u021B\u0103 profesional\u0103. Pute\u021Bi men\u021Biona activit\u0103\u021Bile remunerate, activit\u0103\u021Bile de voluntariat, ");
		 lblNewLabel_2.setForeground(new Color(61,61,61));
		 lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		 lblNewLabel_2.setBounds(10, 141, 1117, 37);
		 contentPane.add(lblNewLabel_2);
		 
		 JLabel lblNewLabel_2_1 = new JLabel("perioadele de stagiu \u0219i ucenicie, perioadele de lucr\u0103tor independent, etc.");
		 lblNewLabel_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		 lblNewLabel_2_1.setBounds(10, 166, 1104, 32);
		 contentPane.add(lblNewLabel_2_1);
		 
		 JLabel lblNewLabel_3 = new JLabel("Functie sau job ocupat");
		 lblNewLabel_3.setForeground(new Color(61,61,61));
		 lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3.setBounds(35, 212, 302, 32);
		 contentPane.add(lblNewLabel_3);
		 
		 functie = new JTextField(box3.functie1);
		 functie.setForeground(new Color(61,61,61));
		 functie.setBackground(new Color(254,229,255));
		 functie.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 functie.setBounds(35, 267, 268, 28);
			functie.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(functie);
		 functie.setColumns(10);
		 
		 JLabel lblNewLabel_3_1 = new JLabel("Firma angajatoare:");
		 lblNewLabel_3_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3_1.setBounds(35, 310, 208, 32);
		 contentPane.add(lblNewLabel_3_1);
		 
		 angajator = new JTextField(box3.angajator1);
		 angajator.setForeground(new Color(61,61,61));
		 angajator.setBackground(new Color(254,229,255));
		 angajator.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 angajator.setColumns(10);
		 angajator.setBounds(35, 353, 268, 28);
			angajator.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(angajator);
		 
		 JLabel lblNewLabel_3_1_1 = new JLabel("Localitate");
		 lblNewLabel_3_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3_1_1.setBounds(35, 407, 302, 32);
		 contentPane.add(lblNewLabel_3_1_1);
		 
		 localitate = new JTextField(box3.localitate_job);
		 localitate.setForeground(new Color(61,61,61));
		 localitate.setBackground(new Color(254,229,255));
		 localitate.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 localitate.setColumns(10);
		 localitate.setBounds(35, 441, 268, 28);
			localitate.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(localitate);
		 
		 JLabel lblNewLabel_3_1_2 = new JLabel("Tara");
		 lblNewLabel_3_1_2.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3_1_2.setBounds(35, 473, 302, 32);
		 contentPane.add(lblNewLabel_3_1_2);
		 
		 tara = new JTextField(box3.tara_job);
		 tara.setForeground(new Color(61,61,61));
		 tara.setBackground(new Color(254,229,255));
		 tara.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 tara.setColumns(10);
		 tara.setBounds(35, 503, 268, 28);
			tara.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(tara);
		 
		 JLabel lblNewLabel_3_1_3_1 = new JLabel("Ad\u0103uga\u021Bi un titlu care descrie \u00EEn mod clar func\u021Bia sau rolul pe care l-a\u021Bi jucat \u00EEn cadrul acestei experien\u021Be.");
		 lblNewLabel_3_1_3_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		 lblNewLabel_3_1_3_1.setBounds(35, 240, 807, 32);
		 contentPane.add(lblNewLabel_3_1_3_1);
		 
		 JLabel lblNewLabel_3_1_2_1 = new JLabel("Principale activitati si responsabilitati la joburi anterioare");
		 lblNewLabel_3_1_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_3_1_2_1.setBounds(598, 264, 529, 32);
		 contentPane.add(lblNewLabel_3_1_2_1);
		 
		 JLabel lblNewLabel_3_1_3_2 = new JLabel("Descrie detaliat responsabilitatile jobului. Evita sa dai copy-paste din fisa postului curent. ");
		 lblNewLabel_3_1_3_2.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		 lblNewLabel_3_1_3_2.setBounds(598, 294, 807, 32);
		 contentPane.add(lblNewLabel_3_1_3_2);
		 
		 JLabel lblNewLabel_3_1_3_2_1 = new JLabel("Maxim 200 de caractere");
		 lblNewLabel_3_1_3_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_3_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		 lblNewLabel_3_1_3_2_1.setBounds(598, 310, 807, 32);
		 contentPane.add(lblNewLabel_3_1_3_2_1);
		 
		 JLabel lblNewLabel_3_1_3_1_1 = new JLabel("Daca nu aveti experienta de munca scrieti \" - \" in casutele referente experientei profesionale. La sfarsit puteti opta pentru un CV fara aceasta sectiune.");
		 lblNewLabel_3_1_3_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_3_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		 lblNewLabel_3_1_3_1_1.setBounds(10, 123, 1088, 32);
		 contentPane.add(lblNewLabel_3_1_3_1_1);
		 
		 JLabel imaginee = new JLabel("");
			imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
			imaginee.setBounds(0, 0, 1149, 546);
			contentPane.add(imaginee);
	}
}
