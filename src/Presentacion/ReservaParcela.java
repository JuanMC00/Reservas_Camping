package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class ReservaParcela extends JPanel {
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblEmail;
	private JLabel lblNumOcupantes;
	private JLabel lblHoraLlegada;
	private JLabel lblHoraSalida;
	private JLabel lblDatosCliente;
	private JLabel lblDatosParcela;
	private JLabel lblTipo;
	private JLabel lblUbicacion;
	private JLabel lblFechaLlegada;
	private JLabel lblSolicitudesEspeciales;
	private JLabel lblFechaSalida;
	private JLabel lblPrecio;
	private JLabel lblCercanias;
	private JLabel lblParticularidades;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JComboBox comboBox;
	private JTextField txtHoraLLegada;
	private JTextField txtHoraSalida;
	private JTextArea txtaSolicitudesEspeciales;
	private JComboBox cboTipo;
	private JComboBox comboBox_1;
	private JTextField txtFechaLlegada;
	private JTextField txtFechaSalida;
	private JLabel lblCercaniasConsultadas;
	private JLabel txtParticularidadesConsultadas;
	private JLabel lblPrecioConsultado;
	private JLabel lblFotoCampingTexto;
	private JLabel lblFotoCamping;
	private JLabel lblFotoParcelaTexto;
	private JLabel lblFotoParcela;
	public ReservaParcela() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{312, 44, 60, 0, 102, 74, 286, 511, 0, 0};
		gridBagLayout.rowHeights = new int[]{69, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 95, 82, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblDatosCliente = new JLabel("Datos cliente");
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblDatosCliente = new GridBagConstraints();
		gbc_lblDatosCliente.anchor = GridBagConstraints.EAST;
		gbc_lblDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosCliente.gridx = 0;
		gbc_lblDatosCliente.gridy = 1;
		add(lblDatosCliente, gbc_lblDatosCliente);
		
		lblFotoCampingTexto = new JLabel("Foto del Camping");
		lblFotoCampingTexto.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblFotoCampingTexto = new GridBagConstraints();
		gbc_lblFotoCampingTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCampingTexto.gridx = 7;
		gbc_lblFotoCampingTexto.gridy = 1;
		add(lblFotoCampingTexto, gbc_lblFotoCampingTexto);
		
		lblFotoCamping = new JLabel("");
		lblFotoCamping.setIcon(new ImageIcon(ReservaParcela.class.getResource("/Presentacion/Foto_Camping.jpg")));
		GridBagConstraints gbc_lblFotoCamping = new GridBagConstraints();
		gbc_lblFotoCamping.gridheight = 10;
		gbc_lblFotoCamping.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCamping.gridx = 7;
		gbc_lblFotoCamping.gridy = 2;
		add(lblFotoCamping, gbc_lblFotoCamping);
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 4;
		add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 4;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 1;
		gbc_txtApellidos.gridy = 4;
		add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblTelefono = new JLabel("Telefono:");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 5;
		add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.gridwidth = 2;
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 1;
		gbc_txtTelefono.gridy = 5;
		add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 6;
		add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText("");
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 6;
		add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		lblNumOcupantes = new JLabel("Nº Ocupantes:");
		GridBagConstraints gbc_lblNumOcupantes = new GridBagConstraints();
		gbc_lblNumOcupantes.anchor = GridBagConstraints.EAST;
		gbc_lblNumOcupantes.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumOcupantes.gridx = 0;
		gbc_lblNumOcupantes.gridy = 7;
		add(lblNumOcupantes, gbc_lblNumOcupantes);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 7;
		add(comboBox, gbc_comboBox);
		
		lblHoraLlegada = new JLabel("Hora aproximada de llegada:");
		GridBagConstraints gbc_lblHoraLlegada = new GridBagConstraints();
		gbc_lblHoraLlegada.anchor = GridBagConstraints.EAST;
		gbc_lblHoraLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraLlegada.gridx = 0;
		gbc_lblHoraLlegada.gridy = 8;
		add(lblHoraLlegada, gbc_lblHoraLlegada);
		
		txtHoraLLegada = new JTextField();
		GridBagConstraints gbc_txtHoraLLegada = new GridBagConstraints();
		gbc_txtHoraLLegada.gridwidth = 2;
		gbc_txtHoraLLegada.anchor = GridBagConstraints.NORTH;
		gbc_txtHoraLLegada.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoraLLegada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraLLegada.gridx = 1;
		gbc_txtHoraLLegada.gridy = 8;
		add(txtHoraLLegada, gbc_txtHoraLLegada);
		txtHoraLLegada.setColumns(10);
		
		lblHoraSalida = new JLabel("Hora aproximada de salida:");
		GridBagConstraints gbc_lblHoraSalida = new GridBagConstraints();
		gbc_lblHoraSalida.anchor = GridBagConstraints.EAST;
		gbc_lblHoraSalida.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraSalida.gridx = 0;
		gbc_lblHoraSalida.gridy = 9;
		add(lblHoraSalida, gbc_lblHoraSalida);
		
		txtHoraSalida = new JTextField();
		GridBagConstraints gbc_txtHoraSalida = new GridBagConstraints();
		gbc_txtHoraSalida.gridwidth = 2;
		gbc_txtHoraSalida.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoraSalida.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraSalida.gridx = 1;
		gbc_txtHoraSalida.gridy = 9;
		add(txtHoraSalida, gbc_txtHoraSalida);
		txtHoraSalida.setColumns(10);
		
		lblSolicitudesEspeciales = new JLabel("Solicitudes especiales:");
		GridBagConstraints gbc_lblSolicitudesEspeciales = new GridBagConstraints();
		gbc_lblSolicitudesEspeciales.anchor = GridBagConstraints.EAST;
		gbc_lblSolicitudesEspeciales.insets = new Insets(0, 0, 5, 5);
		gbc_lblSolicitudesEspeciales.gridx = 0;
		gbc_lblSolicitudesEspeciales.gridy = 10;
		add(lblSolicitudesEspeciales, gbc_lblSolicitudesEspeciales);
		
		txtaSolicitudesEspeciales = new JTextArea();
		GridBagConstraints gbc_txtaSolicitudesEspeciales = new GridBagConstraints();
		gbc_txtaSolicitudesEspeciales.gridwidth = 5;
		gbc_txtaSolicitudesEspeciales.gridheight = 2;
		gbc_txtaSolicitudesEspeciales.insets = new Insets(0, 0, 5, 5);
		gbc_txtaSolicitudesEspeciales.fill = GridBagConstraints.BOTH;
		gbc_txtaSolicitudesEspeciales.gridx = 1;
		gbc_txtaSolicitudesEspeciales.gridy = 10;
		add(txtaSolicitudesEspeciales, gbc_txtaSolicitudesEspeciales);
		
		lblDatosParcela = new JLabel("Datos parcela");
		lblDatosParcela.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblDatosParcela = new GridBagConstraints();
		gbc_lblDatosParcela.anchor = GridBagConstraints.EAST;
		gbc_lblDatosParcela.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosParcela.gridx = 0;
		gbc_lblDatosParcela.gridy = 13;
		add(lblDatosParcela, gbc_lblDatosParcela);
		
		lblFotoParcelaTexto = new JLabel("Foto de la Parcela");
		lblFotoParcelaTexto.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblFotoParcelaTexto = new GridBagConstraints();
		gbc_lblFotoParcelaTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoParcelaTexto.gridx = 7;
		gbc_lblFotoParcelaTexto.gridy = 13;
		add(lblFotoParcelaTexto, gbc_lblFotoParcelaTexto);
		
		lblFotoParcela = new JLabel("");
		lblFotoParcela.setIcon(new ImageIcon(ReservaParcela.class.getResource("/Presentacion/Foto_Paracela1.jpg")));
		GridBagConstraints gbc_lblFotoParcela = new GridBagConstraints();
		gbc_lblFotoParcela.gridheight = 9;
		gbc_lblFotoParcela.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoParcela.gridx = 7;
		gbc_lblFotoParcela.gridy = 14;
		add(lblFotoParcela, gbc_lblFotoParcela);
		
		lblTipo = new JLabel("Tipo:");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.anchor = GridBagConstraints.EAST;
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 0;
		gbc_lblTipo.gridy = 15;
		add(lblTipo, gbc_lblTipo);
		
		cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"(Sin selección)", "Pequeñas", "Medianas", "Deluxe", "Para Autocaravanas"}));
		GridBagConstraints gbc_cboTipo = new GridBagConstraints();
		gbc_cboTipo.gridwidth = 3;
		gbc_cboTipo.insets = new Insets(0, 0, 5, 5);
		gbc_cboTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboTipo.gridx = 1;
		gbc_cboTipo.gridy = 15;
		add(cboTipo, gbc_cboTipo);
		
		lblUbicacion = new JLabel("Ubicación:");
		GridBagConstraints gbc_lblUbicacion = new GridBagConstraints();
		gbc_lblUbicacion.anchor = GridBagConstraints.EAST;
		gbc_lblUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblUbicacion.gridx = 0;
		gbc_lblUbicacion.gridy = 16;
		add(lblUbicacion, gbc_lblUbicacion);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"(Sin selección)"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 16;
		add(comboBox_1, gbc_comboBox_1);
		
		lblFechaLlegada = new JLabel("Fecha de llegada:");
		GridBagConstraints gbc_lblFechaLlegada = new GridBagConstraints();
		gbc_lblFechaLlegada.anchor = GridBagConstraints.EAST;
		gbc_lblFechaLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaLlegada.gridx = 0;
		gbc_lblFechaLlegada.gridy = 17;
		add(lblFechaLlegada, gbc_lblFechaLlegada);
		
		txtFechaLlegada = new JTextField();
		GridBagConstraints gbc_txtFechaLlegada = new GridBagConstraints();
		gbc_txtFechaLlegada.gridwidth = 2;
		gbc_txtFechaLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_txtFechaLlegada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechaLlegada.gridx = 1;
		gbc_txtFechaLlegada.gridy = 17;
		add(txtFechaLlegada, gbc_txtFechaLlegada);
		txtFechaLlegada.setColumns(10);
		
		lblFechaSalida = new JLabel("Fecha de salida:");
		GridBagConstraints gbc_lblFechaSalida = new GridBagConstraints();
		gbc_lblFechaSalida.anchor = GridBagConstraints.EAST;
		gbc_lblFechaSalida.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaSalida.gridx = 0;
		gbc_lblFechaSalida.gridy = 18;
		add(lblFechaSalida, gbc_lblFechaSalida);
		
		txtFechaSalida = new JTextField();
		GridBagConstraints gbc_txtFechaSalida = new GridBagConstraints();
		gbc_txtFechaSalida.gridwidth = 2;
		gbc_txtFechaSalida.insets = new Insets(0, 0, 5, 5);
		gbc_txtFechaSalida.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechaSalida.gridx = 1;
		gbc_txtFechaSalida.gridy = 18;
		add(txtFechaSalida, gbc_txtFechaSalida);
		txtFechaSalida.setColumns(10);
		
		lblCercanias = new JLabel("Cercanías:");
		GridBagConstraints gbc_lblCercanias = new GridBagConstraints();
		gbc_lblCercanias.anchor = GridBagConstraints.EAST;
		gbc_lblCercanias.insets = new Insets(0, 0, 5, 5);
		gbc_lblCercanias.gridx = 0;
		gbc_lblCercanias.gridy = 20;
		add(lblCercanias, gbc_lblCercanias);
		
		lblCercaniasConsultadas = new JLabel("");
		GridBagConstraints gbc_lblCercaniasConsultadas = new GridBagConstraints();
		gbc_lblCercaniasConsultadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblCercaniasConsultadas.gridx = 1;
		gbc_lblCercaniasConsultadas.gridy = 20;
		add(lblCercaniasConsultadas, gbc_lblCercaniasConsultadas);
		
		lblParticularidades = new JLabel("Particularidades:");
		GridBagConstraints gbc_lblParticularidades = new GridBagConstraints();
		gbc_lblParticularidades.anchor = GridBagConstraints.EAST;
		gbc_lblParticularidades.insets = new Insets(0, 0, 5, 5);
		gbc_lblParticularidades.gridx = 0;
		gbc_lblParticularidades.gridy = 21;
		add(lblParticularidades, gbc_lblParticularidades);
		
		txtParticularidadesConsultadas = new JLabel("");
		GridBagConstraints gbc_txtParticularidadesConsultadas = new GridBagConstraints();
		gbc_txtParticularidadesConsultadas.insets = new Insets(0, 0, 5, 5);
		gbc_txtParticularidadesConsultadas.gridx = 1;
		gbc_txtParticularidadesConsultadas.gridy = 21;
		add(txtParticularidadesConsultadas, gbc_txtParticularidadesConsultadas);
		
		lblPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 22;
		add(lblPrecio, gbc_lblPrecio);
		
		lblPrecioConsultado = new JLabel("");
		GridBagConstraints gbc_lblPrecioConsultado = new GridBagConstraints();
		gbc_lblPrecioConsultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioConsultado.gridx = 1;
		gbc_lblPrecioConsultado.gridy = 22;
		add(lblPrecioConsultado, gbc_lblPrecioConsultado);
	}

}
