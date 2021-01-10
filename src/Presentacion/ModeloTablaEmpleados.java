package Presentacion;

import java.util.*;
import javax.swing.table.*;

public class ModeloTablaEmpleados extends AbstractTableModel {

	private String[] nombreColumnas = setnombreColumnas();

	private Vector datos = new Vector();
	
	private String[] setnombreColumnas() {
		String[] columnas = {"Nombre", "Apellidos", "Foto", "Telefono", "Correo electronico", "Idioma(s)", "Formacion", "Disponibilidad"};
		
		if(Internacionalizacion.getIdioma().equals("ingles"))
			columnas = new String[] {"Name", "Surnames", "Picture", "Phone", "Email", "Languages", "modality", "Disponibility"};
		
		return columnas;
	}
	
	public String[] getNombreColumnas() {
		return nombreColumnas;
	}

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

	public void delFila(int row) {
		datos.remove(row);
	}

	public void addFila(Object[] row) {
		datos.add(row);
	}
}
