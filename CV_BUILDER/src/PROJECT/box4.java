package P1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class box4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box4 frame = new box4();
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
	public box4() {
		setBackground(new Color(221, 224, 189));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setBounds(100, 100, 440, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setForeground(new Color(61,61,61));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel.setBounds(45, 36, 130, 40);
		contentPane.add(lblNewLabel);
		
		JLabel user = new JLabel("");/////////////
		user.setForeground(new Color(61,61,61));
		user.setText(box3.usernamee);
		user.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		user.setBounds(158, 36, 164, 40);
		contentPane.add(user);
		
		JButton creeaza = new JButton("Creeaza un CV");
		creeaza.setBackground(new Color(254,229,255));
		creeaza.setForeground(new Color(61,61,61));
		creeaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		box3.nume1=null;
		box3.prenume1=null;
		box3.zi=null;
		box3.luna=null;
		box3.an=null;
		box3.cetatenie1=null;
		box3.gen1=null;
		box3.email1=null;
		box3.nrteltip1=null;
		box3.nrtel1=null;
		box3.adrtip1=null;
		box3.tara1=null;
		box3.localitate1=null;
		box3.strada1=null;
		box3.functie1=null;
		box3.angajator1=null;
		box3.localitate_job=null;
		box3.tara_job=null;
		box3.activitati1=null;
		box3.educatie1=null;
		box3.materna1=null;
		box3.limbi1=null;
		box3.digitale1=null;
		box3.tip_job1=null;
		box3.nivel_job1=null;
		box3.salariu1=null;
		box3.carnet1=null;
		box3.diploma1=null;
		box3.specializare1=null;
		box3.calatorit1=null;
		box3.sumar1=null;
					
					dispose();
					box5 b5=new box5();
					b5.setVisible(true);
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		creeaza.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		creeaza.setBounds(140, 118, 153, 36);
		creeaza.setFocusable(false);
		creeaza.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(creeaza);
		
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
		cancel.setBounds(140, 189, 153, 36);
		cancel.setFocusable(false);
		cancel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(cancel);
		
		JButton vechi = new JButton("Modifica CV");
		vechi.setForeground(new Color(61,61,61));
		vechi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box11 b11=new box11();
					b11.setVisible(true);
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		vechi.setBackground(new Color(254,229,255));
		vechi.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		vechi.setBounds(140, 253, 153, 36);
		vechi.setFocusable(false);
		vechi.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(vechi);
		
		JLabel imaginee = new JLabel("");
		imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
		imaginee.setBounds(-38, -90, 1149, 423);
		contentPane.add(imaginee);
	}

}
