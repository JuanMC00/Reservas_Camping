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
	private JLabel lblTuReservaSe;
	private JButton btnOk;

	public JFrame getFrame() {
		return frame;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservaGuardada window = new ReservaGuardada();
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
	public ReservaGuardada() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTuReservaSe = new JLabel("Tu reserva se ha guardado con éxito");
		lblTuReservaSe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuReservaSe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTuReservaSe.setBounds(15, 64, 414, 32);
		frame.getContentPane().add(lblTuReservaSe);
		
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
