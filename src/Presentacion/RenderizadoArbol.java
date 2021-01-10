package Presentacion;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import Presentacion.RenderizadoArbol;

public class RenderizadoArbol extends DefaultTreeCellRenderer {
	public RenderizadoArbol() {
	}

	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
		String c = (String)(nodo.getUserObject());
		
		switch (c){
			case "Home":
			case "Inicio":
				setIcon(new ImageIcon(RenderizadoArbol.class.getResource("/Presentacion/Fotos/InicioIcono.png")));
				break;
				
			case "Booking":
			case "Reserva":
				setIcon(new ImageIcon(RenderizadoArbol.class.getResource("/Presentacion/Fotos/ReservaIcono.png")));
				break;				
				
			case "Plot":
			case "Parcela":
				setIcon(new ImageIcon(RenderizadoArbol.class.getResource("/Presentacion/Fotos/ParcelaIcono.png")));
				break;
				
			case "Bungalow":
				setIcon(new ImageIcon(RenderizadoArbol.class.getResource("/Presentacion/Fotos/bungalowIcono.png")));
				break;
				
			case "Activities":
			case "Actividades":
				setIcon(new ImageIcon(RenderizadoArbol.class.getResource("/Presentacion/Fotos/ActividadesIcono.png")));
				break;
				
			case "Employees":
			case "Empleados":
				setIcon(new ImageIcon(RenderizadoArbol.class.getResource("/Presentacion/Fotos/EmpleadosIcono.png")));
				break;
				
			case "Routes":
			case "Rutas":
				setIcon(new ImageIcon(RenderizadoArbol.class.getResource("/Presentacion/Fotos/RutasIcono.png")));
				break;

		}
		return this;
	}

}
