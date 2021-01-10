package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;


import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Login {

	private JFrame login;
	private JTextField txtUsuario;
	private JLabel lblError;
	private JPasswordField txtContrasena;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	private JButton btnEntrar;
	private JTextArea txtrBienvenida;
	private JLabel lblInfoLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Internacionalizacion.setIdioma("espanol");
					Login window = new Login();
					window.login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		login = new JFrame();
		login.setResizable(false);
		login.setBounds(100, 100, 520, 252);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.getContentPane().setLayout(null);
		
		
		lblUsuario = new JLabel(Internacionalizacion.getString("Login.lblUsuario.text")); //$NON-NLS-1$
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(26, 85, 108, 16);
		login.getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(146, 85, 203, 25);
		login.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasena = new JLabel(Internacionalizacion.getString("Login.lblContrasena.text")); //$NON-NLS-1$
		lblContrasena.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasena.setBounds(26, 128, 108, 16);
		login.getContentPane().add(lblContrasena);
		
		JButton btnEspanol = new JButton("");
		btnEspanol.addActionListener(new BtnEspanolActionListener());
		btnEspanol.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Fotos/España.png")));
		btnEspanol.setBounds(366, 13, 50, 50);
		login.getContentPane().add(btnEspanol);
		
		JButton btnEnglish = new JButton("");
		btnEnglish.addActionListener(new BtnEnglishActionListener());
		btnEnglish.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Fotos/Reino_Unido.png")));
		btnEnglish.setBounds(441, 13, 50, 50);
		login.getContentPane().add(btnEnglish);
		
		lblError = new JLabel(Internacionalizacion.getString("Login.lblError.text")); //$NON-NLS-1$
		lblError.setHorizontalAlignment(SwingConstants.RIGHT);
		lblError.setVisible(false);
		lblError.setForeground(Color.RED);
		lblError.setBounds(36, 163, 313, 16);
		login.getContentPane().add(lblError);
		
		btnEntrar = new JButton(Internacionalizacion.getString("Login.btnEntrar.text")); //$NON-NLS-1$
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setBounds(367, 159, 97, 25);
		login.getContentPane().add(btnEntrar);
		
		txtrBienvenida = new JTextArea();
		txtrBienvenida.setOpaque(false);
		txtrBienvenida.setBackground(Color.WHITE);
		txtrBienvenida.setEditable(false);
		txtrBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrBienvenida.setText(Internacionalizacion.getString("Login.txtrBienvenida.text")); //$NON-NLS-1$
		txtrBienvenida.setBounds(70, 13, 269, 36);
		login.getContentPane().add(txtrBienvenida);
		
		lblInfoLogin = new JLabel(Internacionalizacion.getString("Login.lblInfoLogin.text")); //$NON-NLS-1$
		lblInfoLogin.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Fotos/Icono_Info.png")));
		lblInfoLogin.setBounds(32, 15, 30, 30);
		login.getContentPane().add(lblInfoLogin);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(146, 125, 203, 26);
		login.getContentPane().add(txtContrasena);

	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String password="", user="";
			boolean token=false;
			
			try {
				File users = new File("Usuarios.txt");
				Scanner sc = new Scanner(users);
				
				while(sc.hasNext() && !token) {
					String linea=sc.nextLine();
					StringTokenizer st = new StringTokenizer(linea, ";");
					user=st.nextToken();
					password=st.nextToken();
					
					if(user.equals(txtUsuario.getText()) && password.equals(txtContrasena.getText())) {
						FileWriter fw = new FileWriter("DatosUsuario.txt");
						fw.write(st.nextToken() + "\n" + st.nextToken() + "\n" + st.nextToken() + "\n" + st.nextToken() + "\n");
						fw.close();
						
						VentanaPrincipal home = new VentanaPrincipal();
						home.getFrame().setVisible(true);
						login.setVisible(false);
						token=true;
					}
				}
				
				if (!token) {
					txtUsuario.setText("");
					txtContrasena.setText("");
					lblError.setVisible(true);
				}
					
			}catch (IOException FNFE) {
				System.out.println("Fichero de usuarios autenticados no encontrado.");
			}			
		
		}
	}
	
	private class BtnEnglishActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Internacionalizacion.setIdioma("ingles");
			Login login2 = new Login();
			login.setVisible(false);
			login2.login.setVisible(true);
		}
	}
	
	private class BtnEspanolActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Internacionalizacion.setIdioma("espanol");
			Login login2 = new Login();
			login.setVisible(false);
			login2.login.setVisible(true);
		}
	}
	

}
