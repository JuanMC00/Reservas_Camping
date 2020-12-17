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
import java.awt.Rectangle;
import javax.swing.JButton;

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
	private JLabel lblPrecioNoche;
	private JLabel lblCercanias;
	private JLabel lblParticularidades;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JComboBox cboNumOcupantes;
	private JTextField txtHoraLlegada;
	private JTextField txtHoraSalida;
	private JTextArea txtaSolicitudesEspeciales;
	private JComboBox cboTipo;
	private JComboBox cboUbicacion;
	private JTextField txtFechaLlegada;
	private JTextField txtFechaSalida;
	private JLabel lblCercaniasConsultadas;
	private JLabel txtParticularidadesConsultadas;
	private JLabel lblPrecioNocheConsultado;
	private JLabel lblFotoCampingTexto;
	private JLabel lblFotoCamping;
	private JLabel lblFotoParcelaTexto;
	private JLabel lblFotoParcela;
	private JLabel lblPrecioTotal;
	private JLabel PrecioTotalConsultado;
	private JButton btnLimpiar;
	private JButton btnGuardar;
	public ReservaParcela() {
		setBounds(new Rectangle(0, 0, 1450, 980));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{62, 279, 44, 60, 0, 102, 74, 135, 135, 511, 84, 0};
		gridBagLayout.rowHeights = new int[]{68, 30, 30, 30, 30, 30, 30, 30, 30, 30, 147, 82, 30, 30, 30, 30, 30, 30, 30, 30, 0, 30, 30, 30, 36, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblDatosCliente = new JLabel("Datos cliente");
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDatosCliente = new GridBagConstraints();
		gbc_lblDatosCliente.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosCliente.gridx = 1;
		gbc_lblDatosCliente.gridy = 0;
		add(lblDatosCliente, gbc_lblDatosCliente);
		
		lblFotoCampingTexto = new JLabel("Foto del Camping");
		lblFotoCampingTexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblFotoCampingTexto = new GridBagConstraints();
		gbc_lblFotoCampingTexto.anchor = GridBagConstraints.SOUTH;
		gbc_lblFotoCampingTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCampingTexto.gridx = 9;
		gbc_lblFotoCampingTexto.gridy = 0;
		add(lblFotoCampingTexto, gbc_lblFotoCampingTexto);
		
		lblFotoCamping = new JLabel("");
		lblFotoCamping.setIcon(new ImageIcon(ReservaParcela.class.getResource("/Presentacion/Foto_Camping.jpg")));
		GridBagConstraints gbc_lblFotoCamping = new GridBagConstraints();
		gbc_lblFotoCamping.gridheight = 10;
		gbc_lblFotoCamping.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCamping.gridx = 9;
		gbc_lblFotoCamping.gridy = 1;
		add(lblFotoCamping, gbc_lblFotoCamping);
		
		lblNombre = new JLabel("Nombre(*):");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos(*):");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 3;
		add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.gridwidth = 4;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridx = 2;
		gbc_txtApellidos.gridy = 3;
		add(txtApellidos, gbc_txtApellidos);
		txtApellidos.setColumns(10);
		
		lblTelefono = new JLabel("Telefono(*):");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 4;
		add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.gridwidth = 2;
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 2;
		gbc_txtTelefono.gridy = 4;
		add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 5;
		add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmail.setText("");
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 2;
		gbc_txtEmail.gridy = 5;
		add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		lblNumOcupantes = new JLabel("Nº Ocupantes(*):");
		lblNumOcupantes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNumOcupantes = new GridBagConstraints();
		gbc_lblNumOcupantes.anchor = GridBagConstraints.EAST;
		gbc_lblNumOcupantes.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumOcupantes.gridx = 1;
		gbc_lblNumOcupantes.gridy = 6;
		add(lblNumOcupantes, gbc_lblNumOcupantes);
		
		cboNumOcupantes = new JComboBox();
		cboNumOcupantes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cboNumOcupantes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		GridBagConstraints gbc_cboNumOcupantes = new GridBagConstraints();
		gbc_cboNumOcupantes.insets = new Insets(0, 0, 5, 5);
		gbc_cboNumOcupantes.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboNumOcupantes.gridx = 2;
		gbc_cboNumOcupantes.gridy = 6;
		add(cboNumOcupantes, gbc_cboNumOcupantes);
		
		lblHoraLlegada = new JLabel("Hora aproximada de llegada(*):");
		lblHoraLlegada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblHoraLlegada = new GridBagConstraints();
		gbc_lblHoraLlegada.anchor = GridBagConstraints.EAST;
		gbc_lblHoraLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraLlegada.gridx = 1;
		gbc_lblHoraLlegada.gridy = 7;
		add(lblHoraLlegada, gbc_lblHoraLlegada);
		
		txtHoraLlegada = new JTextField();
		txtHoraLlegada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtHoraLlegada = new GridBagConstraints();
		gbc_txtHoraLlegada.gridwidth = 2;
		gbc_txtHoraLlegada.anchor = GridBagConstraints.NORTH;
		gbc_txtHoraLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoraLlegada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraLlegada.gridx = 2;
		gbc_txtHoraLlegada.gridy = 7;
		add(txtHoraLlegada, gbc_txtHoraLlegada);
		txtHoraLlegada.setColumns(10);
		
		lblHoraSalida = new JLabel("Hora aproximada de salida(*):");
		lblHoraSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblHoraSalida = new GridBagConstraints();
		gbc_lblHoraSalida.anchor = GridBagConstraints.EAST;
		gbc_lblHoraSalida.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraSalida.gridx = 1;
		gbc_lblHoraSalida.gridy = 8;
		add(lblHoraSalida, gbc_lblHoraSalida);
		
		txtHoraSalida = new JTextField();
		txtHoraSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtHoraSalida = new GridBagConstraints();
		gbc_txtHoraSalida.gridwidth = 2;
		gbc_txtHoraSalida.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoraSalida.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraSalida.gridx = 2;
		gbc_txtHoraSalida.gridy = 8;
		add(txtHoraSalida, gbc_txtHoraSalida);
		txtHoraSalida.setColumns(10);
		
		lblSolicitudesEspeciales = new JLabel("Solicitudes especiales:");
		lblSolicitudesEspeciales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSolicitudesEspeciales = new GridBagConstraints();
		gbc_lblSolicitudesEspeciales.anchor = GridBagConstraints.EAST;
		gbc_lblSolicitudesEspeciales.insets = new Insets(0, 0, 5, 5);
		gbc_lblSolicitudesEspeciales.gridx = 1;
		gbc_lblSolicitudesEspeciales.gridy = 9;
		add(lblSolicitudesEspeciales, gbc_lblSolicitudesEspeciales);
		
		txtaSolicitudesEspeciales = new JTextArea();
		txtaSolicitudesEspeciales.setFont(new Font("Monospaced", Font.PLAIN, 18));
		GridBagConstraints gbc_txtaSolicitudesEspeciales = new GridBagConstraints();
		gbc_txtaSolicitudesEspeciales.gridwidth = 6;
		gbc_txtaSolicitudesEspeciales.gridheight = 2;
		gbc_txtaSolicitudesEspeciales.insets = new Insets(0, 0, 5, 5);
		gbc_txtaSolicitudesEspeciales.fill = GridBagConstraints.BOTH;
		gbc_txtaSolicitudesEspeciales.gridx = 2;
		gbc_txtaSolicitudesEspeciales.gridy = 9;
		add(txtaSolicitudesEspeciales, gbc_txtaSolicitudesEspeciales);
		
		lblDatosParcela = new JLabel("Datos parcela");
		lblDatosParcela.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDatosParcela = new GridBagConstraints();
		gbc_lblDatosParcela.anchor = GridBagConstraints.EAST;
		gbc_lblDatosParcela.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosParcela.gridx = 1;
		gbc_lblDatosParcela.gridy = 12;
		add(lblDatosParcela, gbc_lblDatosParcela);
		
		lblFotoParcelaTexto = new JLabel("Foto de la Parcela");
		lblFotoParcelaTexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblFotoParcelaTexto = new GridBagConstraints();
		gbc_lblFotoParcelaTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoParcelaTexto.gridx = 9;
		gbc_lblFotoParcelaTexto.gridy = 12;
		add(lblFotoParcelaTexto, gbc_lblFotoParcelaTexto);
		
		lblFotoParcela = new JLabel("");
		lblFotoParcela.setIcon(new ImageIcon(ReservaParcela.class.getResource("/Presentacion/Foto_Paracela.jpg")));
		GridBagConstraints gbc_lblFotoParcela = new GridBagConstraints();
		gbc_lblFotoParcela.insets = new Insets(0, 0, 0, 5);
		gbc_lblFotoParcela.gridheight = 12;
		gbc_lblFotoParcela.gridx = 9;
		gbc_lblFotoParcela.gridy = 13;
		add(lblFotoParcela, gbc_lblFotoParcela);
		
		lblTipo = new JLabel("Tipo(*):");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.anchor = GridBagConstraints.EAST;
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 1;
		gbc_lblTipo.gridy = 14;
		add(lblTipo, gbc_lblTipo);
		
		cboTipo = new JComboBox();
		cboTipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"(Sin selección)", "Pequeñas", "Medianas", "Deluxe", "Para Autocaravanas"}));
		GridBagConstraints gbc_cboTipo = new GridBagConstraints();
		gbc_cboTipo.gridwidth = 3;
		gbc_cboTipo.insets = new Insets(0, 0, 5, 5);
		gbc_cboTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboTipo.gridx = 2;
		gbc_cboTipo.gridy = 14;
		add(cboTipo, gbc_cboTipo);
		
		lblUbicacion = new JLabel("Ubicación(*):");
		lblUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblUbicacion = new GridBagConstraints();
		gbc_lblUbicacion.anchor = GridBagConstraints.EAST;
		gbc_lblUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblUbicacion.gridx = 1;
		gbc_lblUbicacion.gridy = 15;
		add(lblUbicacion, gbc_lblUbicacion);
		
		cboUbicacion = new JComboBox();
		cboUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cboUbicacion.setModel(new DefaultComboBoxModel(new String[] {"(Sin selección)"}));
		GridBagConstraints gbc_cboUbicacion = new GridBagConstraints();
		gbc_cboUbicacion.gridwidth = 3;
		gbc_cboUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_cboUbicacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboUbicacion.gridx = 2;
		gbc_cboUbicacion.gridy = 15;
		add(cboUbicacion, gbc_cboUbicacion);
		
		lblFechaLlegada = new JLabel("Fecha de llegada(*):");
		lblFechaLlegada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFechaLlegada = new GridBagConstraints();
		gbc_lblFechaLlegada.anchor = GridBagConstraints.EAST;
		gbc_lblFechaLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaLlegada.gridx = 1;
		gbc_lblFechaLlegada.gridy = 16;
		add(lblFechaLlegada, gbc_lblFechaLlegada);
		
		txtFechaLlegada = new JTextField();
		txtFechaLlegada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtFechaLlegada = new GridBagConstraints();
		gbc_txtFechaLlegada.gridwidth = 2;
		gbc_txtFechaLlegada.insets = new Insets(0, 0, 5, 5);
		gbc_txtFechaLlegada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechaLlegada.gridx = 2;
		gbc_txtFechaLlegada.gridy = 16;
		add(txtFechaLlegada, gbc_txtFechaLlegada);
		txtFechaLlegada.setColumns(10);
		
		lblFechaSalida = new JLabel("Fecha de salida(*):");
		lblFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFechaSalida = new GridBagConstraints();
		gbc_lblFechaSalida.anchor = GridBagConstraints.EAST;
		gbc_lblFechaSalida.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaSalida.gridx = 1;
		gbc_lblFechaSalida.gridy = 17;
		add(lblFechaSalida, gbc_lblFechaSalida);
		
		txtFechaSalida = new JTextField();
		txtFechaSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtFechaSalida = new GridBagConstraints();
		gbc_txtFechaSalida.gridwidth = 2;
		gbc_txtFechaSalida.insets = new Insets(0, 0, 5, 5);
		gbc_txtFechaSalida.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechaSalida.gridx = 2;
		gbc_txtFechaSalida.gridy = 17;
		add(txtFechaSalida, gbc_txtFechaSalida);
		txtFechaSalida.setColumns(10);
		
		lblPrecioNoche = new JLabel("Precio por noche:");
		lblPrecioNoche.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioNoche = new GridBagConstraints();
		gbc_lblPrecioNoche.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioNoche.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioNoche.gridx = 1;
		gbc_lblPrecioNoche.gridy = 18;
		add(lblPrecioNoche, gbc_lblPrecioNoche);
		
		lblPrecioNocheConsultado = new JLabel("");
		lblPrecioNocheConsultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioNocheConsultado = new GridBagConstraints();
		gbc_lblPrecioNocheConsultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioNocheConsultado.gridx = 2;
		gbc_lblPrecioNocheConsultado.gridy = 18;
		add(lblPrecioNocheConsultado, gbc_lblPrecioNocheConsultado);
		
		lblPrecioTotal = new JLabel("Precio total:");
		lblPrecioTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioTotal = new GridBagConstraints();
		gbc_lblPrecioTotal.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioTotal.gridx = 1;
		gbc_lblPrecioTotal.gridy = 19;
		add(lblPrecioTotal, gbc_lblPrecioTotal);
		
		PrecioTotalConsultado = new JLabel("");
		PrecioTotalConsultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_PrecioTotalConsultado = new GridBagConstraints();
		gbc_PrecioTotalConsultado.insets = new Insets(0, 0, 5, 5);
		gbc_PrecioTotalConsultado.gridx = 2;
		gbc_PrecioTotalConsultado.gridy = 19;
		add(PrecioTotalConsultado, gbc_PrecioTotalConsultado);
		
		lblCercanias = new JLabel("Cercanías:");
		lblCercanias.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCercanias = new GridBagConstraints();
		gbc_lblCercanias.anchor = GridBagConstraints.EAST;
		gbc_lblCercanias.insets = new Insets(0, 0, 5, 5);
		gbc_lblCercanias.gridx = 1;
		gbc_lblCercanias.gridy = 21;
		add(lblCercanias, gbc_lblCercanias);
		
		lblCercaniasConsultadas = new JLabel("");
		lblCercaniasConsultadas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCercaniasConsultadas = new GridBagConstraints();
		gbc_lblCercaniasConsultadas.gridwidth = 6;
		gbc_lblCercaniasConsultadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblCercaniasConsultadas.gridx = 2;
		gbc_lblCercaniasConsultadas.gridy = 21;
		add(lblCercaniasConsultadas, gbc_lblCercaniasConsultadas);
		
		lblParticularidades = new JLabel("Particularidades:");
		lblParticularidades.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblParticularidades = new GridBagConstraints();
		gbc_lblParticularidades.anchor = GridBagConstraints.EAST;
		gbc_lblParticularidades.insets = new Insets(0, 0, 5, 5);
		gbc_lblParticularidades.gridx = 1;
		gbc_lblParticularidades.gridy = 22;
		add(lblParticularidades, gbc_lblParticularidades);
		
		txtParticularidadesConsultadas = new JLabel("");
		txtParticularidadesConsultadas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtParticularidadesConsultadas = new GridBagConstraints();
		gbc_txtParticularidadesConsultadas.gridwidth = 6;
		gbc_txtParticularidadesConsultadas.insets = new Insets(0, 0, 5, 5);
		gbc_txtParticularidadesConsultadas.gridx = 2;
		gbc_txtParticularidadesConsultadas.gridy = 22;
		add(txtParticularidadesConsultadas, gbc_txtParticularidadesConsultadas);
		
		btnLimpiar = new JButton("Limpiar");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 7;
		gbc_btnLimpiar.gridy = 23;
		add(btnLimpiar, gbc_btnLimpiar);
		
		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 8;
		gbc_btnGuardar.gridy = 23;
		add(btnGuardar, gbc_btnGuardar);
	}

}
