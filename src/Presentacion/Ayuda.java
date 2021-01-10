package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ayuda {

	private JFrame frame;
	private JTextArea txtaAyuda;
	private JButton btnOk;

	public JFrame getFrame() {
		return frame;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ayuda window = new Ayuda("");
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
	public Ayuda(String ayuda) {
		initialize(ayuda);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String ayuda) {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/Presentacion/Fotos/AyudaIcono.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 1214, 467);
		frame.getContentPane().setLayout(null);
		
		txtaAyuda = new JTextArea();
		txtaAyuda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtaAyuda.setRows(5);
		txtaAyuda.setText(ayuda);
		txtaAyuda.setBounds(39, 33, 1123, 303);
		frame.getContentPane().add(txtaAyuda);
		
		btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOk.setForeground(Color.BLUE);
		btnOk.addActionListener(new BtnOkActionListener());
		btnOk.setBounds(528, 367, 138, 44);
		frame.getContentPane().add(btnOk);
	}
	
	private class BtnOkActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
		}
	}
}
