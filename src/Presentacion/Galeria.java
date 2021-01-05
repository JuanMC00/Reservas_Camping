package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Galeria extends JFrame {

	private JPanel contentPane;
	private JButton btnAnterior;
	private JButton btnPosterior;
	private JLabel lblFoto;
	private int numFoto=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Galeria frame = new Galeria();
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
	public Galeria() {
		setBounds(100, 100, 862, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		btnAnterior = new JButton("");
		btnAnterior.addActionListener(new BtnAnteriorActionListener());
		btnAnterior.setIcon(new ImageIcon(Galeria.class.getResource("/Presentacion/Fotos/btnBack.png")));
		contentPane.add(btnAnterior, BorderLayout.WEST);
		
		btnPosterior = new JButton("");
		btnPosterior.addActionListener(new BtnPosteriorActionListener());
		btnPosterior.setIcon(new ImageIcon(Galeria.class.getResource("/Presentacion/Fotos/btnNext.png")));
		contentPane.add(btnPosterior, BorderLayout.EAST);
		
		lblFoto = new JLabel("");
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setIcon(new ImageIcon(Galeria.class.getResource("/Presentacion/Fotos/Bungalow1.jpg")));
		contentPane.add(lblFoto, BorderLayout.CENTER);
	}

	private class BtnPosteriorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			numFoto++;			
			if(numFoto<6)
				lblFoto.setIcon(new ImageIcon(Galeria.class.getResource("/Presentacion/Fotos/Bungalow" + numFoto + ".jpg")));
			else{
				lblFoto.setIcon(new ImageIcon(Galeria.class.getResource("/Presentacion/Fotos/Bungalow" + 1 + ".jpg")));
				numFoto=1;
			}

		}
	}
	
	private class BtnAnteriorActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			numFoto--;			
			if(numFoto>0)
				lblFoto.setIcon(new ImageIcon(Galeria.class.getResource("/Presentacion/Fotos/Bungalow" + numFoto + ".jpg")));
			else{
				lblFoto.setIcon(new ImageIcon(Galeria.class.getResource("/Presentacion/Fotos/Bungalow" + 5 + ".jpg")));
				numFoto=5;
			}
		}
	}
}
