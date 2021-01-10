package Presentacion;

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import java.awt.Insets;

public class Actividades extends JPanel {
	private JPanel pnlBotones;
	private JButton btnAlta;
	private JButton btnBaja;
	private JScrollPane scrollPane;
	private JTable tbActividades;
	private JLabel lblTitle;

	public Actividades() {
		setLayout(new BorderLayout(0, 0));

		pnlBotones = new JPanel();
		add(pnlBotones, BorderLayout.SOUTH);

		btnAlta = new JButton(Internacionalizacion.getString("Actividades.btnAlta.text")); //$NON-NLS-1$
		btnAlta.addActionListener(new BtnAltaActionListener());

		pnlBotones.add(btnAlta);

		btnBaja = new JButton(Internacionalizacion.getString("Actividades.btnBaja.text")); //$NON-NLS-1$
		btnBaja.addActionListener(new BtnBajaActionListener());
		pnlBotones.add(btnBaja);

		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		tbActividades = new JTable();
		tbActividades.addMouseMotionListener(new TbActividadesMouseMotionListener());

		// tbActividades.addMouseListener(new TbActividadesMouseListener());
		scrollPane.setViewportView(tbActividades);

		ModeloTablaActividades modeloTabla = new ModeloTablaActividades();
		tbActividades.setModel(modeloTabla);
		tbActividades.setRowHeight(30);

		TableColumn clmAforoMin = tbActividades.getColumnModel().getColumn(3);
		TableColumn clmAforoMax = tbActividades.getColumnModel().getColumn(4);

		JComboBox cboAforoMin = new JComboBox();
		JComboBox cboAforoMax = new JComboBox();

		for (int i = 1; i <= 30; i++) {
			cboAforoMin.addItem(i);
			cboAforoMax.addItem(i);
		}

		clmAforoMin.setCellEditor(new DefaultCellEditor(cboAforoMax));
		clmAforoMax.setCellEditor(new DefaultCellEditor(cboAforoMax));

		Object[] fila1 = {"Tiro con Arco", "Carlos", "16:00-17:00", "3", "8", true, true, 8.55, 35.00,
				"Bosque Aventura", "La mejor actividad para mejorar tu punteria", "Ropa de deporte"};
		modeloTabla.addFila(fila1);

		Object[] fila2 = {"Submarinismo", "Bruno", "17:00-18:30", "2", "3", true, true, 15.95, 100.00, "Cala Secreta",
				"Sumergete en una aventura submarina", "Gafas de buceo y aletas"};
		modeloTabla.addFila(fila2);

		Object[] fila3 = {"Fiesta de la espuma", "Sergio", "19:00-20:00", "15", "30", false, true, 3.25, 15.00,
				"Castillo espumoso", "¡Corre!, ¡esquiva los cañonazos de espuma!", "Bañador y chanclas"};
		modeloTabla.addFila(fila3);

		tbActividades.getColumnModel().getColumn(0).setResizable(false);
	}

	private class BtnAltaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ModeloTablaActividades modeloTabla = (ModeloTablaActividades) tbActividades.getModel();
			Object[] nuevaFila = { "...", "...", "...", "1", "2", false, false, 0.00, 0.00, "...", "...", "..." };
			modeloTabla.addFila(nuevaFila);
			modeloTabla.fireTableDataChanged();
		}
	}

	private class BtnBajaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ModeloTablaActividades modeloTabla = (ModeloTablaActividades) tbActividades.getModel();
			int n = tbActividades.getSelectedRow();
			if (n != -1)
				modeloTabla.delFila(tbActividades.getSelectedRow());
			modeloTabla.fireTableDataChanged();
			// taFilaSeleccionada.setText("");
			// lblFoto.setIcon(null);
		}
	}
	
	private class TbActividadesMouseMotionListener extends MouseMotionAdapter {//REVISAR: MUY INEFICIENTE. SE COMPRUEBA TODO EL RATO Y MUCHAS ITERACIONES EN EL FOR

		@Override
		public void mouseMoved(MouseEvent e) {
			ModeloTablaActividades modeloTabla = (ModeloTablaActividades) tbActividades.getModel();
			
			Object [] oMins = modeloTabla.getColumsAforoMin();
			Object [] oMaxs = modeloTabla.getColumsAforoMax();

			for(int row=0; row<modeloTabla.getRowCount() - 1; row++) {
				int valorMin = Integer.parseInt(String.valueOf(oMins[row]));
				int valorMax = Integer.parseInt(String.valueOf(oMaxs[row]));
				
				if(row == modeloTabla.getRowCount() - 1) {
					valorMin = Integer.parseInt(String.valueOf(tbActividades.getModel().getValueAt(modeloTabla.getRowCount() - 1, 3)));
					valorMax = Integer.parseInt(String.valueOf(tbActividades.getModel().getValueAt(modeloTabla.getRowCount() - 1, 4)));					
				}
									
				if (valorMin > valorMax)
					 tbActividades.getModel().setValueAt(tbActividades.getValueAt(row, 4), row, 3);

			}
			
			//La ultima fila de la lista hay que cambiarla fuera del for porque si no su aforo mínimo y máximo aparecen como null. REVISAR
			int valorMin = Integer.parseInt(String.valueOf(tbActividades.getModel().getValueAt(modeloTabla.getRowCount() - 1, 3)));
			int valorMax = Integer.parseInt(String.valueOf(tbActividades.getModel().getValueAt(modeloTabla.getRowCount() - 1, 4)));
			
			if (valorMin > valorMax)
				 tbActividades.getModel().setValueAt(tbActividades.getValueAt(modeloTabla.getRowCount() - 1, 4), modeloTabla.getRowCount() - 1, 3);
			
			modeloTabla.fireTableDataChanged();

		}
	}


}
