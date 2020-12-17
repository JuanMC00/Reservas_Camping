package Presentacion;

import java.util.*;
import javax.swing.table.*;

public class ModeloTablaActividades extends AbstractTableModel {

	private String[] nombreColumnas = {"Actividad", "Monitor", "Horario", "Aforo minimo", "Aforo maximo", "Para adultos", "Para niños",
			"Precio Hora", "Precio Mes", "Area", "Descripcion", "Equipamiento"};
	private Vector datos = new Vector();

	public int getColumnCount() {
		return nombreColumnas.length;
	}

	public int getRowCount() {
		return datos.size();
	}

	public String getColumnName(int col) {
		return nombreColumnas[col];
	}

	public Object getValueAt(int row, int col) {
		Object[] fila = (Object[]) datos.elementAt(row);
		return fila[col];
	}

	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

	public boolean isCellEditable(int row, int col) {
		return true;
	}

	public void setValueAt(Object value, int row, int col) {
		if (row < getRowCount() && col < getColumnCount()) {
			Object[] fila = (Object[]) datos.elementAt(row);
			fila[col] = value;
			fireTableCellUpdated(row, col);
		}
	}
	
	public Object[] getColumsAforoMin() {
		Object[] cols = new Object [this.getRowCount()];
		
		for(int row=0; row<this.getRowCount() - 1; row++)
			cols[row] = this.getValueAt(row, 3);
		
		return cols; 
	}
	
	public Object[] getColumsAforoMax() {
		Object[] cols = new Object [this.getRowCount()];
		
		for(int row=0; row<this.getRowCount() - 1; row++)
			cols[row] = this.getValueAt(row, 4);
		
		return cols; 
	}

	public void delFila(int row) {
		datos.remove(row);
	}

	public void addFila(Object[] row) {
		datos.add(row);
	}
}
