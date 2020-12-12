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
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JScrollPane;

public class VentanaPrincipal {

	private JFrame frame;
	private JLabel lblBarraEstado;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JTree tree;
	private JPanel panelCard;

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
		
		lblBarraEstado = new JLabel("Barra de estado");
		frame.getContentPane().add(lblBarraEstado, BorderLayout.SOUTH);
		
		splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		tree = new JTree();
		tree.addTreeSelectionListener(new TreeTreeSelectionListener());
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("JTree") {
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
		scrollPane.setViewportView(tree);
	
		panelCard = new JPanel();
		splitPane.setRightComponent(panelCard);
		panelCard.setLayout(new CardLayout(0, 0));
		
		JPanel pnlInicio = new JPanel();
		panelCard.add(pnlInicio, "Inicio");
		
		JLabel lblEstoEsEl = new JLabel("Esto es el incio");
		pnlInicio.add(lblEstoEsEl);
		
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
	
	private class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent e) {
		
			String nodo = (e.getPath().getLastPathComponent()).toString();
			
			switch (nodo){
				case "Bungalow":
				case "Parcela":
				case "Empleados":
				case "Actividades":
				case "Rutas":
					((CardLayout) panelCard.getLayout()).show(panelCard, nodo);
			}
				
		}
	}
}
