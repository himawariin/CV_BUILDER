package P1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;

public class box7 extends JFrame {

	private JPanel contentPane;
	private JTextField salariu;
	protected JComboBox niveljob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box7 frame = new box7();
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
	public box7() {
		setBackground(new Color(221, 224, 189));
		setLocationRelativeTo(null);

		 JFrame f = new JFrame("World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setToolTipText("DD");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CV - Pas 4");
		lblNewLabel.setForeground(new Color(61,61,61));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblNewLabel.setBounds(383, 18, 295, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tip job dorit");
		lblNewLabel_1.setForeground(new Color(61,61,61));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(35, 150, 245, 39);
		contentPane.add(lblNewLabel_1);
		

		
		JLabel lblNewLabel_2_1_1 = new JLabel("In ce masura esti dispus sa calatoresti in interes de serviciu?");
		lblNewLabel_2_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(35, 297, 438, 23);
		contentPane.add(lblNewLabel_2_1_1);
		 
		 
		 JComboBox carnetauto = new JComboBox();
		 carnetauto.setToolTipText("DD");
		 carnetauto.setModel(new DefaultComboBoxModel(new String[] {"da", "nu"}));
		 carnetauto.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 carnetauto.setBackground(new Color(254,229,255));
		 carnetauto.setForeground(new Color(61,61,61));
		 carnetauto.setBounds(145, 111, 49, 28);
		 carnetauto.setVisible(true);
		 contentPane.add(carnetauto);
		 
		 JLabel lblNewLabel_2_1_2 = new JLabel("Tip job:");
		 lblNewLabel_2_1_2.setForeground(new Color(61,61,61));
		 lblNewLabel_2_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_1_2.setBounds(35, 200, 127, 23);
		 contentPane.add(lblNewLabel_2_1_2);
		 
		 JComboBox calatorit = new JComboBox();
		 calatorit.setForeground(new Color(61,61,61));
		 calatorit.setBackground(new Color(254,229,255));
		 calatorit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 calatorit.setModel(new DefaultComboBoxModel(new String[] {"Peste 50% din dimpul serviciului", "50% din timpul serviciului", "Mai putin de 30% din timpul serviciului", "Nu sunt dispus sa fac calatorii de afaceri"}));
		 calatorit.updateUI();
		 calatorit.getModel().setSelectedItem(box3.calatorit1);
		 calatorit.setBounds(462, 293, 375, 27);
		 contentPane.add(calatorit);
		 
		 JComboBox niveljob = new JComboBox();
		 niveljob.setModel(new DefaultComboBoxModel(new String[] {"Student/Absolvent", "0-1 an experienta", "1-5 ani experianta", "peste 5 ani experienta", "Manager"}));
		 niveljob.updateUI();
		 niveljob.getModel().setSelectedItem(box3.nivel_job1);
		 niveljob.setForeground(new Color(61,61,61));
		 niveljob.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 niveljob.setBackground(new Color(254,229,255));
		 niveljob.setBounds(590, 196, 190, 28);
		 contentPane.add(niveljob);
		 
		 salariu = new JTextField(box3.salariu1);
		 salariu.setForeground(new Color(61,61,61));
		 salariu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 salariu.setColumns(10);
		 salariu.setBackground(new Color(254,229,255));
		 salariu.setBounds(154, 255, 159, 28);
		salariu.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(salariu);
		 
		 JLabel lblNewLabel_2_1_2_1 = new JLabel("Nivel job:");
		 lblNewLabel_2_1_2_1.setForeground(new Color(61,61,61));
		 lblNewLabel_2_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_1_2_1.setBounds(500, 200, 127, 23);
		 contentPane.add(lblNewLabel_2_1_2_1);
		 
		 JComboBox tipj = new JComboBox();
		 tipj.setForeground(new Color(61,61,61));
		 tipj.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 tipj.setBackground(new Color(254,229,255));
		 tipj.setModel(new DefaultComboBoxModel(new String[] {"Full Time", "Part Time", "Practica", "Project Based", "Temporar"}));
		 tipj.updateUI();
		tipj.getModel().setSelectedItem(box3.tip_job1);
		 tipj.setBounds(154, 200, 159, 28);
		 contentPane.add(tipj);
		 
		 JLabel lblNewLabel_2_2 = new JLabel("Carnet auto:");
		 lblNewLabel_2_2.setForeground(new Color(61,61,61));
		 lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_2.setBounds(35, 116, 127, 23);
		 contentPane.add(lblNewLabel_2_2);
		 
		 JButton btnNewButton = new JButton("Inapoi");
		 btnNewButton.setForeground(new Color(61,61,61));
		 btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						dispose();
						box8 b8=new box8();
						b8.setVisible(true);
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
						if(salariu.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de salariu!");
						ok=1;
						}
						
					if(ok==0)
						{	box3.tip_job1=(String) tipj.getSelectedItem();
						box3.nivel_job1=(String) niveljob.getSelectedItem();
						box3.carnet1=(String) carnetauto.getSelectedItem();
						box3.salariu1=salariu.getText();
						box3.calatorit1=(String) calatorit.getSelectedItem();
									
					dispose();
					box9 b9=new box9();
					b9.setVisible(true);
						}	
					}catch(Exception el) {
						System.out.println(el);
					}
				}
			});
		 btnMaiDeparte.setBackground(new Color(254,229,255));
		 btnMaiDeparte.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 btnMaiDeparte.setBounds(797, 31, 153, 36);
		 btnMaiDeparte.setFocusable(false);
		 btnMaiDeparte.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		 contentPane.add(btnMaiDeparte);
		 
		 JLabel lblNewLabel_2_1_3 = new JLabel("Salariu (EUR):");
		 lblNewLabel_2_1_3.setForeground(new Color(61,61,61));
		 lblNewLabel_2_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		 lblNewLabel_2_1_3.setBounds(35, 249, 110, 23);
		 contentPane.add(lblNewLabel_2_1_3);
		 JLabel imaginee = new JLabel("");
			imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
			imaginee.setBounds(0, 0, 1149, 546);
			contentPane.add(imaginee);
		
	}
}
