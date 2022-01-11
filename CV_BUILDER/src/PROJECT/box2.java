package P1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

public class box2 extends JFrame {

	private JPanel contentPane;
	private JTextField nume;
	private JTextField prenume;
	private JTextField username;
	private JTextField parola;
	private JTextField repParola;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					box2 frame = new box2();
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
	public box2() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setBounds(100, 100, 673, 529);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 153, 153));
		contentPane.setBackground(new Color(221, 224, 189));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Creare cont");
		lblNewLabel.setBackground(new Color(254,229,255));
		lblNewLabel.setForeground(new Color(61,61,61));
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		lblNewLabel.setBounds(232, 29, 214, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nume");
		lblNewLabel_1.setForeground(new Color(61,61,61));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(28, 120, 214, 40);
		contentPane.add(lblNewLabel_1);
		
		nume = new JTextField();
		nume.setForeground(new Color(61,61,61));
		nume.setBackground(new Color(254,229,255));
		nume.setBounds(28, 162, 227, 28);
		nume.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(nume);
		nume.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prenume");
		lblNewLabel_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(404, 120, 214, 40);
		contentPane.add(lblNewLabel_1_1);
		
		prenume = new JTextField();
		prenume.setColumns(10);
		prenume.setForeground(new Color(61,61,61));
		prenume.setBackground(new Color(254,229,255));
		prenume.setBounds(404, 162, 227, 28);
		prenume.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(prenume);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Username");
		lblNewLabel_1_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(28, 201, 214, 40);
		contentPane.add(lblNewLabel_1_1_1);
		
		username = new JTextField();
		username.setColumns(10);
		username.setForeground(new Color(61,61,61));
		username.setBackground(new Color(254,229,255));
		username.setBounds(28, 242, 227, 28);
		username.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(username);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Parola");
		lblNewLabel_1_1_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(28, 282, 214, 40);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		parola = new JTextField();
		parola.setColumns(10);
		parola.setForeground(new Color(61,61,61));
		parola.setBackground(new Color(254,229,255));
		parola.setBounds(28, 323, 227, 28);
		parola.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(parola);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Repetare parola");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(404, 282, 214, 40);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		repParola = new JTextField();
		repParola.setColumns(10);
		repParola.setForeground(new Color(61,61,61));
		repParola.setBackground(new Color(254,229,255));
		repParola.setBounds(404, 323, 227, 28);
		repParola.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(repParola);
		
		JButton creare = new JButton("Creare");
		creare.setForeground(new Color(61,61,61));

		creare.setBackground(new Color(254,229,255));
		creare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int ok=0;
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
					      String query = "SELECT username FROM users2"; 
					      PreparedStatement ps = conn.prepareStatement(query);
					      ResultSet rs = (ResultSet) ps.executeQuery();
					      int k=0;
					      while (rs.next())
					      {
					          if(username.getText().equals(rs.getString("username")))
					        	  k=1;
					      }       
					     if(k==1)
					    {JOptionPane.showMessageDialog(contentPane,"Acest username este deja folosit!");
					    ok=1;
					    }
					    else
					if(nume.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de nume!");
						ok=1;}
						
					else
					if(prenume.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de prenume!");
						ok=1;
						}
					else
					if(username.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de username!");
						ok=1;
						}
					else
					if(email.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de email!");
						ok=1;
						}
					else
					if(parola.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de parola!");
						ok=1;
						}
					else
					if(repParola.getText().length()==0)
						{JOptionPane.showMessageDialog(contentPane,"Trebuie sa completati tabelul de repetare parola!");
						ok=1;
						}
					else
						if(parola.getText().equals(repParola.getText()))
							ok=0;
						else
					if(parola.getText()!=repParola.getText())//daca cele 2 parola nu coincid nu trec mai departe
						{JOptionPane.showMessageDialog(contentPane,"Cele 2 parola nu coincid. Mai incercati!");
						ok=1;
						}
					
				if(ok==0)
					{Class.forName("com.mysql.jdbc.Driver");
					conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
				 ps=conn.prepareStatement("insert into users2(nume,prenume,username,email,parola) values(?,?,?,?,?);");
				ps.setString(1, nume.getText());
				ps.setString(2, prenume.getText());
				ps.setString(3, username.getText());
				ps.setString(4, email.getText());
				ps.setString(5, parola.getText());
				int x=ps.executeUpdate();
					
				if(x>0) {
						 JOptionPane.showMessageDialog(contentPane,"Cont creat cu succes!");
						}else
							JOptionPane.showMessageDialog(contentPane,"Contul nu a fost creat!");
				dispose();
				box1 b1=new box1();
				b1.setVisible(true);
					}	
				}catch(Exception el) {
					System.out.println(el);
				}
			}
		});
		creare.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		creare.setBounds(367, 404, 153, 36);
		creare.setFocusable(false);
		creare.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(creare);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(61,61,61));
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(404, 201, 214, 40);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setForeground(new Color(61,61,61));
		email.setBackground(new Color(254,229,255));
		email.setBounds(404, 242, 227, 28);
		email.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(email);
		
		JButton cancel = new JButton("Inapoi");
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
		cancel.setBounds(160, 404, 153, 36);
		cancel.setFocusable(false);
		cancel.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		contentPane.add(cancel);
		
		JLabel imaginee = new JLabel("");
		imaginee.setIcon(new ImageIcon("D:\\Downloads\\gradient (1).png"));
		imaginee.setBounds(0, 0, 1149, 546);
		contentPane.add(imaginee);
	}
}
