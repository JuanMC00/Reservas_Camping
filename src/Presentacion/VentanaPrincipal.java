package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import java.awt.Rectangle;
import javax.swing.SwingConstants;

public class VentanaPrincipal {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnReserva;
	private JLabel lblBarraEstado;
	private JMenuItem mntmEmpleados;
	private JMenuItem mntmActividades;
	private JMenuItem mntmRutas;
	private JMenuItem mntmBungalow;
	private JMenuItem mntmParcela;

	public JFrame getFrame() {
		return frame;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1450, 986);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnReserva = new JMenu("Reserva");
		menuBar.add(mnReserva);
		
		mntmBungalow = new JMenuItem("Bungalow");
		mnReserva.add(mntmBungalow);
		
		mntmParcela = new JMenuItem("Parcela");
		mnReserva.add(mntmParcela);
		
		mntmEmpleados = new JMenuItem("Empleados");
		mntmEmpleados.setIconTextGap(-300);
		mntmEmpleados.setHorizontalTextPosition(SwingConstants.LEADING);
		menuBar.add(mntmEmpleados);
		
		mntmActividades = new JMenuItem("Actividades");
		mntmActividades.setIconTextGap(-200);
		menuBar.add(mntmActividades);
		
		mntmRutas = new JMenuItem("Rutas");
		mntmRutas.setIconTextGap(-100);
		menuBar.add(mntmRutas);
		
		lblBarraEstado = new JLabel("Barra de estado");
		frame.getContentPane().add(lblBarraEstado, BorderLayout.SOUTH);
	}

}
