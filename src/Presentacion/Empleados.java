package Presentacion;

import javax.swing.JPanel;


import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import Presentacion.ModeloTablaEmpleados;
import Presentacion.ColumnaFotoEditor;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Empleados extends JPanel {
	private JPanel pnlBotones;
	private JButton btnAlta;
	private JButton btnBaja;
	private JTable tbEmpleados;
	private JLabel lblTitle;
	private JScrollPane scrollPane;
	public Empleados() {
		setLayout(new BorderLayout(0, 0));
		
		pnlBotones = new JPanel();
		add(pnlBotones, BorderLayout.SOUTH);
		
		btnAlta = new JButton(Internacionalizacion.getString("Empleados.btnAlta.text")); //$NON-NLS-1$
		btnAlta.addActionListener(new BtnAltaActionListener());

		pnlBotones.add(btnAlta);
		
		btnBaja = new JButton(Internacionalizacion.getString("Empleados.btnBaja.text")); //$NON-NLS-1$
		btnBaja.addActionListener(new BtnBajaActionListener());
		pnlBotones.add(btnBaja);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		tbEmpleados = new JTable();

		scrollPane.setViewportView(tbEmpleados);
		
		ModeloTablaEmpleados modeloTabla = new ModeloTablaEmpleados();
		tbEmpleados.setModel(modeloTabla);
		tbEmpleados.setRowHeight(150);
		
		
		TableColumn columnaDisponibilidad = tbEmpleados.getColumnModel().getColumn(7);
		JComboBox cboDisponibilidad = new JComboBox();
		
		if(Internacionalizacion.getIdioma().equals("espanol")) {
			cboDisponibilidad.addItem("Mañana");
			cboDisponibilidad.addItem("Tarde");
			cboDisponibilidad.addItem("Noche");
		}
		else {
			cboDisponibilidad.addItem("Morning");
			cboDisponibilidad.addItem("Afternoon");
			cboDisponibilidad.addItem("Night");			
		}
		columnaDisponibilidad.setCellEditor(new DefaultCellEditor(cboDisponibilidad));
		
		
		Object[] fila1 = {"Raul", "Serrano", new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Fotos/Empleado1.jpg")), "676432347", "raulillo@gmail.com", "Spanish, English", "Socorrista", "Mañana"};
		modeloTabla.addFila(fila1);
		
		Object[] fila2 = {"Adrian", "Martin", new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Fotos/Empleado2.jpg")), "671395321", "adrianpillin@alu.ulcm.es", "Spanish, Portuguese", "Monitor de Aquagym", "Noche"};
		modeloTabla.addFila(fila2);
		
		Object[] fila3 = {"Carlos", "Moreno Maroto", new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Fotos/Empleado3.jpg")), "671192521", "carlosmarotazo@hotmail.com", "Spanish, Italian", "Monitor Tiro con arco", "Tarde"};
		modeloTabla.addFila(fila3);
		
		Object[] fila4 = {"Bruno", "Berguerón Sánchez", new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Fotos/Empleado4.jpg")), "698542521", "bbergueron@yahoo.com", "Spanish, Catalan", "Monitor Submarinismo", "Tarde"};
		modeloTabla.addFila(fila4);
		
		Object[] fila5 = {"Sergio", "Morros Martinez", new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Fotos/Empleado5.jpg")), "619046732", "serchelmorros@alu.uclm.com", "Spanish", "Monitor Fiestas", "Noche"};
		modeloTabla.addFila(fila5);

		
		TableColumn columnaFoto = tbEmpleados.getColumnModel().getColumn(2);
		columnaFoto.setCellEditor(new ColumnaFotoEditor());
		
	}

	private class BtnAltaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ModeloTablaEmpleados modeloTabla = (ModeloTablaEmpleados) tbEmpleados.getModel();
			Object[] nuevaFila = {"...", "...",  new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Fotos/Empleado0.jfif")), "...", "...", "...", "...", "..."};
			modeloTabla.addFila(nuevaFila);
			modeloTabla.fireTableDataChanged();
		}
	}
	
	private class BtnBajaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ModeloTablaEmpleados modeloTabla = (ModeloTablaEmpleados) tbEmpleados.getModel();
			int n= tbEmpleados.getSelectedRow();
			if (n != -1) modeloTabla.delFila(tbEmpleados.getSelectedRow());
			modeloTabla.fireTableDataChanged();
			//taFilaSeleccionada.setText("");
			//lblFoto.setIcon(null);
		}
	}
	
}

