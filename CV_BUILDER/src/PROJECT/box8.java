package P1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;

public class box8 extends JFrame {

	private JPanel contentPane;
	private JTextField materna;
	private JTextField limbi;
	private JTextField educatie;
	private JTextField specializare;
	protected JComboBox diplomaa;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box8 frame = new box8();
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
	public box8() {
		setBackground(new Color(221, 224, 189));
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CV - Pas 3");
		lblNewLabel.setForeground(new Color(61,61,61));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblNewLabel.setBounds(453, 16, 295, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Inapoi");
		btnNewButton.setForeground(new Color(61,61,61));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box6 b6=new box6();
					b6.setVisible(true);
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
		
		 
		 JEditorPane digitale = new JEditorPane();
		 digitale.setText(box3.digitale1);
		 
		 digitale.setForeground(new Color(61,61,61));
		 digitale.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 digitale.setBackground(new Color(254,229,255));
		 digitale.setBounds(35, 447, 815, 69);
		 contentPane.add(digitale);
		 
		 
		 JComboBox diplomaa = new JComboBox();
		 diplomaa.setForeground(new Color(61,61,61));
		 diplomaa.setBackground(new Color(254,229,255));
		 diplomaa.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 diplomaa.setModel(new DefaultComboBoxModel(new String[] {"licenta(facultate)", "master", "doctorat", "MBA", "liceu", "alt tip"}));
		 diplomaa.updateUI();
		 diplomaa.getModel().setSelectedItem(box3.diploma1);
		 diplomaa.setBackground(new Color(254,229,255));
		 diplomaa.setBounds(534, 136, 214, 28);
		 contentPane.add(diplomaa);
		 
		 specializare = new JTextField(box3.specializare1);
		 specializare.setForeground(new Color(61,61,61));
		 specializare.setColumns(10);
		 specializare.setBackground(new Color(254,229,255));
		 specializare.setBounds(925, 139, 214, 28);
		specializare.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(specializare);

		 
		 educatie = new JTextField(box3.educatie1);
		 educatie.setForeground(new Color(61,61,61));
		 educatie.setBackground(new Color(254,229,255));
		 educatie.setColumns(10);
		 educatie.setBounds(35, 165, 308, 28);
		educatie.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(educatie);
		 
		
		 JLabel lblNewLabel_1 = new JLabel("Competen\u021Be personale\r\n");
		 lblNewLabel_1.setForeground(new Color(61,61,61));
		 lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		 lblNewLabel_1.setBounds(35, 208, 346, 38);
		 contentPane.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_2 = new JLabel("Descrie\u021Bi competen\u021Bele dumneavoastr\u0103 lingvistice \u0219i digitale.");
		 lblNewLabel_2.setForeground(new Color(61,61,61));
		 lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblNewLabel_2.setBounds(35, 241, 610, 32);
		 contentPane.add(lblNewLabel_2);
		 
		 JLabel lblNewLabel_3 = new JLabel("Limba materna");
		 lblNewLabel_3.setForeground(new Color(61,61,61));
		 lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		 lblNewLabel_3.setBounds(35, 290, 277, 32);
		 contentPane.add(lblNewLabel_3);
		 
		 materna = new JTextField(box3.materna1);
		 materna.setForeground(new Color(61,61,61));
		 materna.setBackground(new Color(254,229,255));
		 materna.setBounds(35, 322, 269, 28);
		materna.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(materna);
		 materna.setColumns(10);
		 
		 JLabel lblNewLabel_3_1 = new JLabel("Alte limbri vorbite");
		 lblNewLabel_3_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		 lblNewLabel_3_1.setBounds(35, 354, 277, 32);
		 contentPane.add(lblNewLabel_3_1);
		 
		 limbi = new JTextField(box3.limbi1);
		 limbi.setForeground(new Color(61,61,61));
		 limbi.setBackground(new Color(254,229,255));
		 limbi.setColumns(10);
		 limbi.setBounds(35, 383, 815, 28);
		limbi.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(limbi);
		 
		 JLabel lblNewLabel_3_1_1 = new JLabel("Competente digitale");
		 lblNewLabel_3_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		 lblNewLabel_3_1_1.setBounds(35, 415, 277, 32);
		 contentPane.add(lblNewLabel_3_1_1);
		 
		 JLabel lblNewLabel_1_1 = new JLabel("Educatie si formare profesionala");
		 lblNewLabel_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		 lblNewLabel_1_1.setBounds(35, 87, 438, 37);
		 contentPane.add(lblNewLabel_1_1);
	
		 
		 JLabel lblNewLabel_3_2 = new JLabel("Institutia de invatamant:");
		 lblNewLabel_3_2.setForeground(new Color(61,61,61));
		 lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		 lblNewLabel_3_2.setBounds(35, 135, 277, 32);
		 contentPane.add(lblNewLabel_3_2);
		 
		 JLabel lblNewLabel_3_2_1 = new JLabel("Diploma de tip:");
		 lblNewLabel_3_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		 lblNewLabel_3_2_1.setBounds(403, 135, 136, 32);
		 contentPane.add(lblNewLabel_3_2_1);
		 
		
		 
		 JLabel lblNewLabel_3_2_1_1 = new JLabel("Specializare:");
		 lblNewLabel_3_2_1_1.setForeground(new Color(61,61,61));
		 lblNewLabel_3_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		 lblNewLabel_3_2_1_1.setBounds(811, 135, 136, 32);
		 contentPane.add(lblNewLabel_3_2_1_1);
		 
		
		 JButton departe = new JButton("Mai departe");
		 departe.setForeground(new Color(61,61,61));
		 departe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						int ok=0;
						if(educatie.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul pentru detaliile educatiei!");
						ok=1;
						}
						else
						if(materna.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de limba materna!");
						ok=1;
						}
						else
							if(limbi.getText().length()==0)
							{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de limbi straine vorbite!");
							ok=1;
							}
							else
						if(digitale.getText().length()==0)
							{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de competente digitale!");
							ok=1;
							}
						
					if(ok==0)
						{
						box3.educatie1=educatie.getText();
						box3.materna1=materna.getText();
						box3.limbi1=limbi.getText();
						box3.digitale1=(String) digitale.getText();
						box3.diploma1=(String) diplomaa.getSelectedItem();
						box3.specializare1=specializare.getText();
						
					dispose();
					box7 b7=new box7();
					b7.setVisible(true);

						}	
					}catch(Exception el) {
						System.out.println(el);
					}
				}
			});
		 departe.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 departe.setBackground(new Color(254,229,255));
		 departe.setBounds(912, 434, 153, 36);
		 departe.setFocusable(false);
		departe.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(departe);
		 
		 JLabel imaginee = new JLabel("");
			imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
			imaginee.setBounds(0, 0, 1149, 546);
			contentPane.add(imaginee);
		 
		 
		
	}

}
