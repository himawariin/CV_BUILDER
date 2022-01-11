package P1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class box1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box1 frame = new box1();
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
	public box1() {
		setAlwaysOnTop(true);
		setBackground(new Color(10, 7, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(578, 424);

		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(10, 7, 13));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("CV BUILDER");
		lblNewLabel.setForeground(new Color(61,61,61));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 50));
		lblNewLabel.setBounds(143, 27, 310, 73);
		contentPane.add(lblNewLabel);
		
		JButton inregistrare = new JButton("Inregistrare");
		inregistrare.setBackground(new Color(254,229,255));
		inregistrare.setForeground(new Color(61,61,61));
		inregistrare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box3 b3=new box3();
					b3.setVisible(true);
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		inregistrare.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		inregistrare.setBounds(199, 175, 153, 36);
		inregistrare.setFocusable(false);
		inregistrare.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		contentPane.add(inregistrare);
		
		JButton creareCont = new JButton("Creare cont");
		creareCont.setBackground(new Color(254,229,255));
		creareCont.setForeground(new Color(61,61,61));
		creareCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box2 b2=new box2();
					b2.setVisible(true);
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		creareCont.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		creareCont.setBounds(199, 245, 153, 36);
		creareCont.setFocusable(false);
		creareCont.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(creareCont);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
		lblNewLabel_1.setBounds(0, 0, 564, 387);
		contentPane.add(lblNewLabel_1);
	}
}
