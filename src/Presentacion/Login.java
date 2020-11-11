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

public class Login {

	private JFrame login;
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	private JLabel lblError;
	VentanaPrincipal home = new VentanaPrincipal();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(55, 85, 79, 16);
		login.getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(146, 85, 197, 22);
		login.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasena.setBounds(26, 128, 108, 16);
		login.getContentPane().add(lblContrasena);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(146, 128, 197, 22);
		login.getContentPane().add(txtContrasena);
		txtContrasena.setColumns(10);
		
		JButton btnEspanol = new JButton("");
		btnEspanol.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/España.png")));
		btnEspanol.setBounds(366, 13, 50, 50);
		login.getContentPane().add(btnEspanol);
		
		JButton btnEnglish = new JButton("");
		btnEnglish.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Reino_Unido.png")));
		btnEnglish.setBounds(441, 13, 50, 50);
		login.getContentPane().add(btnEnglish);
		
		lblError = new JLabel("Usuario o constraseña incorrectos.");
		lblError.setEnabled(false);
		lblError.setForeground(Color.RED);
		lblError.setBounds(156, 166, 199, 16);
		login.getContentPane().add(lblError);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new BtnEntrarActionListener());
		btnEntrar.setBounds(367, 162, 97, 25);
		login.getContentPane().add(btnEntrar);
		
		JTextArea txtrBienvenida = new JTextArea();
		txtrBienvenida.setOpaque(false);
		txtrBienvenida.setBackground(Color.WHITE);
		txtrBienvenida.setEditable(false);
		txtrBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrBienvenida.setText("Bienvenido a la pantalla de inicio.\r\nPara entrar a la aplicacion inicia sesión.");
		txtrBienvenida.setBounds(70, 13, 269, 36);
		login.getContentPane().add(txtrBienvenida);
		
		JLabel lblInfoLogin = new JLabel("");
		lblInfoLogin.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Icono_Info.png")));
		lblInfoLogin.setBounds(32, 15, 30, 30);
		login.getContentPane().add(lblInfoLogin);

	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String password="", user="";
			boolean token=false;
			
			try {
				File users = new File("Usuarios.txt");
				Scanner sc = new Scanner(users);
				while(sc.hasNext() && !token) {
					user=sc.next();
					
					sc.next(); //Saltamos el ; que separa el usuario de la contraseña en el fichero 
					password=sc.next();
					
					if(user.equals(txtUsuario.getText()) && password.equals(txtContrasena.getText())) {
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
					
					
			}catch (IOException IOE) {
				IOE.printStackTrace();
			}
		
		}
	}
}
