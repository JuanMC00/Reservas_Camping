package Presentacion;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import Presentacion.RenderizadoArbol;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaPrincipal {

	private JFrame frame;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JTree tree;
	private JPanel panelCard;
	private JLabel lblBienvenido;
	private JLabel lblNombre;
	private JLabel lblFoto;
	private JLabel lblUltimoAcceso;
	private JLabel lblUltimoAccesoTexto;
	private JPanel panel;
	private JLabel lblBarraEstado;
	private JButton btnEspanol;
	private JButton btnEnglish;
	private JLabel lblAcercaDeLa;
	private JLabel lblAutores;
	private JLabel lblAutoresTexto;
	private JLabel lblFecha;
	private JLabel lblVersion;
	private JLabel lblFechaTexto;
	private JLabel lblVersionTexto;

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/Presentacion/Fotos/tent2.png")));
		frame.setBounds(100, 100, 1450, 980);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{600, 536, 145, 145, 0};
		gbl_panel.rowHeights = new int[]{30, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblBarraEstado = new JLabel(); //$NON-NLS-1$
		GridBagConstraints gbc_lblBarraEstado = new GridBagConstraints();
		gbc_lblBarraEstado.anchor = GridBagConstraints.WEST;
		gbc_lblBarraEstado.insets = new Insets(0, 0, 0, 5);
		gbc_lblBarraEstado.gridx = 0;
		gbc_lblBarraEstado.gridy = 0;
		panel.add(lblBarraEstado, gbc_lblBarraEstado);
		
		btnEspanol = new JButton(Internacionalizacion.getString("VentanaPrincipal.btnEspanol.text")); //$NON-NLS-1$
		btnEspanol.addActionListener(new BtnEspanolActionListener());
		GridBagConstraints gbc_btnEspanol = new GridBagConstraints();
		gbc_btnEspanol.fill = GridBagConstraints.BOTH;
		gbc_btnEspanol.insets = new Insets(0, 0, 0, 5);
		gbc_btnEspanol.gridx = 2;
		gbc_btnEspanol.gridy = 0;
		panel.add(btnEspanol, gbc_btnEspanol);
		
		btnEnglish = new JButton(Internacionalizacion.getString("VentanaPrincipal.btnEnglish.text")); //$NON-NLS-1$
		btnEnglish.addActionListener(new BtnEnglishActionListener());
		GridBagConstraints gbc_btnEnglish = new GridBagConstraints();
		gbc_btnEnglish.fill = GridBagConstraints.BOTH;
		gbc_btnEnglish.gridx = 3;
		gbc_btnEnglish.gridy = 0;
		panel.add(btnEnglish, gbc_btnEnglish);
		lblBarraEstado.setText("Usted se encuentra en el inicio");
		if(Internacionalizacion.getIdioma().equals("ingles"))					
			lblBarraEstado.setText("You are in the home");
		
		splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(150, 32));
		splitPane.setLeftComponent(scrollPane);
		
		tree = new JTree();
		tree.addTreeSelectionListener(new TreeTreeSelectionListener());
		
		if(Internacionalizacion.getIdioma().equals("espanol")) {
			tree.setModel(new DefaultTreeModel(
				new DefaultMutableTreeNode("Inicio") {
					{
						DefaultMutableTreeNode node_1;
						node_1 = new DefaultMutableTreeNode("Reserva");
							node_1.add(new DefaultMutableTreeNode("Bungalow"));
							node_1.add(new DefaultMutableTreeNode("Parcela"));
						add(node_1);
						add(new DefaultMutableTreeNode("Empleados"));
						add(new DefaultMutableTreeNode("Actividades"));
						add(new DefaultMutableTreeNode("Rutas"));
					}
				}
			));
		
		}else {
			tree.setModel(new DefaultTreeModel(
					new DefaultMutableTreeNode("Home") {
						{
							DefaultMutableTreeNode node_1;
							node_1 = new DefaultMutableTreeNode("Booking");
								node_1.add(new DefaultMutableTreeNode("Bungalow"));
								node_1.add(new DefaultMutableTreeNode("Plot"));
							add(node_1);
							add(new DefaultMutableTreeNode("Employees"));
							add(new DefaultMutableTreeNode("Activities"));
							add(new DefaultMutableTreeNode("Routes"));
						}
					}
				));
		}
		
		
		scrollPane.setViewportView(tree);
		tree.setCellRenderer(new RenderizadoArbol());
	
		panelCard = new JPanel();
		splitPane.setRightComponent(panelCard);
		panelCard.setLayout(new CardLayout(0, 0));
		
		JPanel pnlInicio = new JPanel();
		panelCard.add(pnlInicio, "Inicio");
		GridBagLayout gbl_pnlInicio = new GridBagLayout();
		gbl_pnlInicio.columnWidths = new int[]{69, 100, 100, 88, 20, 100, 100, 100, 100, 100, 0, 0};
		gbl_pnlInicio.rowHeights = new int[]{61, 30, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlInicio.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlInicio.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlInicio.setLayout(gbl_pnlInicio);						
		
		lblBienvenido = new JLabel(Internacionalizacion.getString("VentanaPrincipal.lblBienvendioDeNuevo.text")); //$NON-NLS-1$
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblBienvenido = new GridBagConstraints();
		gbc_lblBienvenido.anchor = GridBagConstraints.EAST;
		gbc_lblBienvenido.gridwidth = 3;
		gbc_lblBienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenido.gridx = 1;
		gbc_lblBienvenido.gridy = 1;
		pnlInicio.add(lblBienvenido, gbc_lblBienvenido);
		
		lblNombre = new JLabel("");
		lblNombre.setForeground(Color.GRAY);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.gridwidth = 3;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 5;
		gbc_lblNombre.gridy = 1;
		pnlInicio.add(lblNombre, gbc_lblNombre);
		
		lblFoto = new JLabel(); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 2;
		gbc_lblFoto.gridheight = 9;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 8;
		gbc_lblFoto.gridy = 1;
		pnlInicio.add(lblFoto, gbc_lblFoto);
		
		lblUltimoAcceso = new JLabel(Internacionalizacion.getString("VentanaPrincipal.lblUltimoAcceso.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
		gbc_lblUltimoAcceso.gridwidth = 2;
		gbc_lblUltimoAcceso.anchor = GridBagConstraints.EAST;
		gbc_lblUltimoAcceso.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimoAcceso.gridx = 2;
		gbc_lblUltimoAcceso.gridy = 3;
		pnlInicio.add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		
		lblUltimoAccesoTexto = new JLabel("");
		GridBagConstraints gbc_lblUltimoAccesoTexto = new GridBagConstraints();
		gbc_lblUltimoAccesoTexto.anchor = GridBagConstraints.WEST;
		gbc_lblUltimoAccesoTexto.gridwidth = 2;
		gbc_lblUltimoAccesoTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimoAccesoTexto.gridx = 5;
		gbc_lblUltimoAccesoTexto.gridy = 3;
		pnlInicio.add(lblUltimoAccesoTexto, gbc_lblUltimoAccesoTexto);
		
		lblAcercaDeLa = new JLabel(Internacionalizacion.getString("VentanaPrincipal.lblAcercaDeLa.text")); //$NON-NLS-1$
		lblAcercaDeLa.setForeground(Color.GRAY);
		lblAcercaDeLa.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblAcercaDeLa = new GridBagConstraints();
		gbc_lblAcercaDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblAcercaDeLa.gridwidth = 3;
		gbc_lblAcercaDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblAcercaDeLa.gridx = 1;
		gbc_lblAcercaDeLa.gridy = 18;
		pnlInicio.add(lblAcercaDeLa, gbc_lblAcercaDeLa);
		
		lblAutores = new JLabel(); //$NON-NLS-1$
		lblAutores.setText(Internacionalizacion.getString("VentanaPrincipal.lblAutores.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAutores = new GridBagConstraints();
		gbc_lblAutores.anchor = GridBagConstraints.WEST;
		gbc_lblAutores.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutores.gridx = 3;
		gbc_lblAutores.gridy = 19;
		pnlInicio.add(lblAutores, gbc_lblAutores);
		
		lblAutoresTexto = new JLabel(); //$NON-NLS-1$
		lblAutoresTexto.setText(Internacionalizacion.getString("VentanaPrincipal.lblAutoresTexto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAutoresTexto = new GridBagConstraints();
		gbc_lblAutoresTexto.anchor = GridBagConstraints.WEST;
		gbc_lblAutoresTexto.gridwidth = 2;
		gbc_lblAutoresTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutoresTexto.gridx = 5;
		gbc_lblAutoresTexto.gridy = 19;
		pnlInicio.add(lblAutoresTexto, gbc_lblAutoresTexto);
		
		lblFecha = new JLabel(Internacionalizacion.getString("VentanaPrincipal.lblFecha.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.WEST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 3;
		gbc_lblFecha.gridy = 20;
		pnlInicio.add(lblFecha, gbc_lblFecha);
		
		lblFechaTexto = new JLabel(); //$NON-NLS-1$
		lblFechaTexto.setText(Internacionalizacion.getString("VentanaPrincipal.lblFechaTexto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblFechaTexto = new GridBagConstraints();
		gbc_lblFechaTexto.gridwidth = 2;
		gbc_lblFechaTexto.anchor = GridBagConstraints.WEST;
		gbc_lblFechaTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaTexto.gridx = 5;
		gbc_lblFechaTexto.gridy = 20;
		pnlInicio.add(lblFechaTexto, gbc_lblFechaTexto);
		
		lblVersion = new JLabel(Internacionalizacion.getString("VentanaPrincipal.lblVersion.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblVersion = new GridBagConstraints();
		gbc_lblVersion.anchor = GridBagConstraints.WEST;
		gbc_lblVersion.insets = new Insets(0, 0, 5, 5);
		gbc_lblVersion.gridx = 3;
		gbc_lblVersion.gridy = 21;
		pnlInicio.add(lblVersion, gbc_lblVersion);
		
		lblVersionTexto = new JLabel(); //$NON-NLS-1$
		lblVersionTexto.setText(Internacionalizacion.getString("VentanaPrincipal.lblVersionTexto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblVersionTexto = new GridBagConstraints();
		gbc_lblVersionTexto.anchor = GridBagConstraints.WEST;
		gbc_lblVersionTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblVersionTexto.gridx = 5;
		gbc_lblVersionTexto.gridy = 21;
		pnlInicio.add(lblVersionTexto, gbc_lblVersionTexto);

		
		if(Internacionalizacion.getIdioma().equals("espanol")) {
			JPanel pnlReservaBungalow = new ReservaBungalow();
			panelCard.add(pnlReservaBungalow, "Bungalow");
			
			JPanel pnlReservaParcela = new ReservaParcela();
			panelCard.add(pnlReservaParcela, "Parcela");
			
			JPanel pnlEmpleados = new Empleados();
			panelCard.add(pnlEmpleados, "Empleados");
			
			JPanel pnlActividades = new Actividades();
			panelCard.add(pnlActividades, "Actividades");
			
			JPanel pnlRutas = new Rutas();
			panelCard.add(pnlRutas, "Rutas");
		}
		else {
			JPanel pnlReservaBungalow = new ReservaBungalow();
			panelCard.add(pnlReservaBungalow, "Bungalow");
			
			JPanel pnlReservaParcela = new ReservaParcela();
			panelCard.add(pnlReservaParcela, "Plot");
			
			JPanel pnlEmpleados = new Empleados();
			panelCard.add(pnlEmpleados, "Employees");
			
			JPanel pnlActividades = new Actividades();
			panelCard.add(pnlActividades, "Activities");
			
			JPanel pnlRutas = new Rutas();
			panelCard.add(pnlRutas, "Routes");
			
		}
		
		actualizarCampos();

	}

	private class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent e) {
		
			String nodo = (e.getPath().getLastPathComponent()).toString();
			
			switch (nodo){
				case "Home":
				case "Inicio":
					lblBarraEstado.setText("Usted se encuentra en el inicio");
					if(Internacionalizacion.getIdioma().equals("ingles"))					
						lblBarraEstado.setText("You are in the home");
					((CardLayout) panelCard.getLayout()).show(panelCard, nodo);
					break;
					
				case "Bungalow":
					lblBarraEstado.setText("Usted se encuentra en la reserva de bungalow");
					if(Internacionalizacion.getIdioma().equals("ingles"))					
						lblBarraEstado.setText("You are in the booking section");
					((CardLayout) panelCard.getLayout()).show(panelCard, nodo);
					break;
				
				case "Plot":
				case "Parcela":
					lblBarraEstado.setText("Usted se encuentra en la reserva de parcelas");
					if(Internacionalizacion.getIdioma().equals("ingles"))					
						lblBarraEstado.setText("You are in the booking section");
					((CardLayout) panelCard.getLayout()).show(panelCard, nodo);
					break;
					
				case "Employees":
				case "Empleados":
					lblBarraEstado.setText("Usted se encuentra en la gestion de empleados");
					if(Internacionalizacion.getIdioma().equals("ingles"))					
						lblBarraEstado.setText("You are in the employees managment section");
					((CardLayout) panelCard.getLayout()).show(panelCard, nodo);
					break;
					
				case "Activities":
				case "Actividades":
					lblBarraEstado.setText("Usted se encuentra en la gestion de actividades");
					if(Internacionalizacion.getIdioma().equals("ingles"))					
						lblBarraEstado.setText("You are in the activities managment section");
					((CardLayout) panelCard.getLayout()).show(panelCard, nodo);
					break;
					
				case "Routes":
				case "Rutas":
					lblBarraEstado.setText("You are in the route section");
					if(Internacionalizacion.getIdioma().equals("ingles"))					
						lblBarraEstado.setText("");
					((CardLayout) panelCard.getLayout()).show(panelCard, nodo);
					break;
			}
				
		}
	}
	
	private void actualizarCampos() {
		try {
			File datos = new File("DatosUsuario.txt");
			Scanner sc = new Scanner(datos);
			
			lblNombre.setText(sc.next() + " " + sc.next() + ", " + sc.next());
			lblFoto.setIcon(new ImageIcon(VentanaPrincipal.class.getResource((String)sc.next())));
			lblUltimoAccesoTexto.setText(sc.next() + " " + sc.next() + " " + sc.next() + " " + sc.next() + " " + sc.next() + " " + sc.next());
			
			sc.close();
			
		}catch (FileNotFoundException FNFE) {
			System.out.println("Fichero con los datos del usuario no encontrado.");
		}
		
	}
	
	private class BtnEspanolActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Internacionalizacion.setIdioma("espanol");
			VentanaPrincipal home = new VentanaPrincipal();
			home.getFrame().setVisible(true);
			frame.setVisible(false);
		}
	}
	
	private class BtnEnglishActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Internacionalizacion.setIdioma("ingles");
			VentanaPrincipal home = new VentanaPrincipal();
			home.getFrame().setVisible(true);
			frame.setVisible(false);
		}
	}
	
	

	
}
