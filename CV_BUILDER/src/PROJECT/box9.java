package P1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;


import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class box9 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box9 frame = new box9();
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
	public box9() {
		setBackground(new Color(221, 224, 189));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 523, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		
		
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(new Color(61,61,61));
		cancel.setBackground(new Color(254,229,255));
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					box7 b7=new box7();
					b7.setVisible(true);
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		cancel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		cancel.setBounds(58, 333, 153, 36);
		 cancel.setFocusable(false);
		cancel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(cancel);
		
		JLabel lblCvPas = new JLabel("CV - Pas 5");
		lblCvPas.setForeground(new Color(61,61,61));
		lblCvPas.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblCvPas.setBounds(146, 24, 192, 48);
		contentPane.add(lblCvPas);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sumar");
		lblNewLabel_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(18, 83, 438, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JEditorPane sumar = new JEditorPane();
		 sumar.setText(box3.sumar1);

		sumar.setBackground(new Color(254,229,255));
		sumar.setForeground(new Color(61,61,61));
		sumar.setBounds(38, 118, 418, 184);
		contentPane.add(sumar);
		

		JButton inregistrare = new JButton("Mai departe");
		inregistrare.setForeground(new Color(61,61,61));
		inregistrare.setBackground(new Color(254,229,255));
		inregistrare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
					box3.sumar1=sumar.getText();
					dispose();
					box10 b10=new box10();
					b10.setVisible(true);
					
					
					
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		inregistrare.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		inregistrare.setBounds(288, 333, 153, 36);
		 inregistrare.setFocusable(false);
			inregistrare.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(inregistrare);
		
		JLabel imaginee = new JLabel("");
		imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
		imaginee.setBounds(0, 0, 1149, 546);
		contentPane.add(imaginee);
	}
}
