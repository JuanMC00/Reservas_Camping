package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservaGuardada {

	private JFrame frame;
	private JLabel lblMensaje;
	private JButton btnOk;

	public JFrame getFrame() {
		return frame;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservaGuardada window = new ReservaGuardada("");
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
	public ReservaGuardada(String mensaje) {
		initialize(mensaje);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String mensaje) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		lblMensaje = new JLabel(mensaje);
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMensaje.setBounds(15, 64, 414, 32);
		frame.getContentPane().add(lblMensaje);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new BtnOkActionListener());
		btnOk.setForeground(Color.BLUE);
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOk.setBounds(160, 166, 115, 29);
		frame.getContentPane().add(btnOk);
	}

	private class BtnOkActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
		}
	}
}
