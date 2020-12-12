package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class Empleados extends JPanel {
	private JLabel lblEstoEsLa;
	public Empleados() {
		
		lblEstoEsLa = new JLabel("Esto es la gestion de empleados");
		add(lblEstoEsLa);
	}

}
