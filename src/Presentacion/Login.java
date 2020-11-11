package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JTextField txtUsuario;
	private JTextField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 509, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(55, 84, 79, 16);
		frame.getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(156, 84, 143, 22);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasena.setBounds(26, 122, 108, 16);
		frame.getContentPane().add(lblContrasena);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(156, 122, 143, 22);
		frame.getContentPane().add(txtContrasena);
		txtContrasena.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Bandera Reino Unido.jpg")));
		btnNewButton_1.setBounds(441, 13, 50, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(366, 13, 50, 50);
		frame.getContentPane().add(btnNewButton);
	}
}
