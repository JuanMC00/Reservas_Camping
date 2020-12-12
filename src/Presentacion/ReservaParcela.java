package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class ReservaParcela extends JPanel {
	private JLabel lblTitle;
	public ReservaParcela() {
		
		lblTitle = new JLabel("Esto es la reserva de parcelas");
		add(lblTitle);
	}

}
