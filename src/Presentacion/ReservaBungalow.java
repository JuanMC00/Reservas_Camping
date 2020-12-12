package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class ReservaBungalow extends JPanel {
	private JLabel lblTitle;
	public ReservaBungalow() {
		
		lblTitle = new JLabel("Esto es la reserva de bungalow");
		add(lblTitle);
	}

}
