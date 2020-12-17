package Presentacion;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

public class ReservaBungalow extends JPanel {
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblEmail;
	private JLabel lblNumOcupantes;
	private JLabel lblHoraLlegada;
	private JLabel lblHoraSalida;
	private JLabel lblDatosCliente;
	private JLabel lblDatosBungalow;
	private JLabel lblTipo;
	private JLabel lblFechaLlegada;
	private JLabel lblSolicitudesEspeciales;
	private JLabel lblFechaSalida;
	private JLabel lblPrecioNoche;
	private JLabel lblEstanciaMinTexto;
	private JLabel lblEquipamiento;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JComboBox cboNumOcupantes;
	private JTextField txtHoraLlegada;
	private JTextField txtHoraSalida;
	private JTextArea txtaSolicitudesEspeciales;
	private JComboBox cboTipo;
	private JComboBox cboCapacidadMax;
	private JTextField txtFechaLlegada;
	private JTextField txtFechaSalida;
	private JLabel lblPrecioNocheConsultado;
	private JLabel lblFotoCampingTexto;
	private JLabel lblFotoCamping;
	private JLabel lblFotoBungalowTexto;
	private JLabel lblFotoBungalow;
	private JLabel lblCapacidadMax;
	private JLabel lblPrecioTotal;
	private JLabel lblPrecioTotalConsultado;
	private JLabel lblDescripcion;
	private JLabel lblDescripcionTexto;
	private JComboBox cboEquipamiento;
	private JLabel lblEquipamientoExtra;
	private JTextField txtEquipamientoExtra;
	private JButton btnGaleria;
	private JButton btnLimpiar;
	private JButton btnGuardar;
	private JLabel lblEstanciaMin;
	private JLabel lblErrorCamposObligatorios;
	public ReservaBungalow() {
		setBounds(new Rectangle(0, 0, 1450, 980));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{73, 248, 74, 60, 0, 102, 74, 135, 135, 511, 43, 0};
		gridBagLayout.rowHeights = new int[]{60, 0, 20, 0, 0, 0, 0, 0, 0, 0, 95, 53, 61, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		txtaSolicitudesEspeciales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtaSolicitudesEspeciales = new GridBagConstraints();
		gbc_txtaSolicitudesEspeciales.gridwidth = 6;
		gbc_txtaSolicitudesEspeciales.gridheight = 2;
		gbc_txtaSolicitudesEspeciales.insets = new Insets(0, 0, 5, 5);
		gbc_txtaSolicitudesEspeciales.fill = GridBagConstraints.BOTH;
		gbc_txtaSolicitudesEspeciales.gridx = 2;
		gbc_txtaSolicitudesEspeciales.gridy = 9;
		add(txtaSolicitudesEspeciales, gbc_txtaSolicitudesEspeciales);
		
		lblDatosBungalow = new JLabel("Datos bungalow");
		lblDatosBungalow.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDatosBungalow = new GridBagConstraints();
		gbc_lblDatosBungalow.anchor = GridBagConstraints.EAST;
		gbc_lblDatosBungalow.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosBungalow.gridx = 1;
		gbc_lblDatosBungalow.gridy = 12;
		add(lblDatosBungalow, gbc_lblDatosBungalow);
		
		lblFotoBungalowTexto = new JLabel("Foto del Bungalow");
		lblFotoBungalowTexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblFotoBungalowTexto = new GridBagConstraints();
		gbc_lblFotoBungalowTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoBungalowTexto.gridx = 9;
		gbc_lblFotoBungalowTexto.gridy = 12;
		add(lblFotoBungalowTexto, gbc_lblFotoBungalowTexto);
		
		lblFotoBungalow = new JLabel("");
		lblFotoBungalow.setIcon(new ImageIcon(ReservaBungalow.class.getResource("/Presentacion/Foto_Bungalow.png")));
		GridBagConstraints gbc_lblFotoBungalow = new GridBagConstraints();
		gbc_lblFotoBungalow.gridheight = 11;
		gbc_lblFotoBungalow.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoBungalow.gridx = 9;
		gbc_lblFotoBungalow.gridy = 13;
		add(lblFotoBungalow, gbc_lblFotoBungalow);
		
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
		
		btnGaleria = new JButton("Ver Galería");
		btnGaleria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnGaleria = new GridBagConstraints();
		gbc_btnGaleria.fill = GridBagConstraints.BOTH;
		gbc_btnGaleria.insets = new Insets(0, 0, 5, 5);
		gbc_btnGaleria.gridx = 6;
		gbc_btnGaleria.gridy = 14;
		add(btnGaleria, gbc_btnGaleria);
		
		lblCapacidadMax = new JLabel("Capacidad Máxima(*):");
		lblCapacidadMax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCapacidadMax = new GridBagConstraints();
		gbc_lblCapacidadMax.insets = new Insets(0, 0, 5, 5);
		gbc_lblCapacidadMax.anchor = GridBagConstraints.EAST;
		gbc_lblCapacidadMax.gridx = 1;
		gbc_lblCapacidadMax.gridy = 15;
		add(lblCapacidadMax, gbc_lblCapacidadMax);
		
		cboCapacidadMax = new JComboBox();
		cboCapacidadMax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cboCapacidadMax.setModel(new DefaultComboBoxModel(new String[] {"(Sin selección)"}));
		GridBagConstraints gbc_cboCapacidadMax = new GridBagConstraints();
		gbc_cboCapacidadMax.gridwidth = 3;
		gbc_cboCapacidadMax.insets = new Insets(0, 0, 5, 5);
		gbc_cboCapacidadMax.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboCapacidadMax.gridx = 2;
		gbc_cboCapacidadMax.gridy = 15;
		add(cboCapacidadMax, gbc_cboCapacidadMax);
		
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
		
		lblPrecioTotal = new JLabel("Precio Total:");
		lblPrecioTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioTotal = new GridBagConstraints();
		gbc_lblPrecioTotal.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioTotal.gridx = 1;
		gbc_lblPrecioTotal.gridy = 19;
		add(lblPrecioTotal, gbc_lblPrecioTotal);
		
		lblPrecioTotalConsultado = new JLabel("");
		lblPrecioTotalConsultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioTotalConsultado = new GridBagConstraints();
		gbc_lblPrecioTotalConsultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioTotalConsultado.gridx = 2;
		gbc_lblPrecioTotalConsultado.gridy = 19;
		add(lblPrecioTotalConsultado, gbc_lblPrecioTotalConsultado);
		
		lblEstanciaMinTexto = new JLabel("Restricción de estancia mínima:");
		lblEstanciaMinTexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEstanciaMinTexto = new GridBagConstraints();
		gbc_lblEstanciaMinTexto.anchor = GridBagConstraints.EAST;
		gbc_lblEstanciaMinTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstanciaMinTexto.gridx = 1;
		gbc_lblEstanciaMinTexto.gridy = 21;
		add(lblEstanciaMinTexto, gbc_lblEstanciaMinTexto);
		
		lblEstanciaMin = new JLabel("");
		GridBagConstraints gbc_lblEstanciaMin = new GridBagConstraints();
		gbc_lblEstanciaMin.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstanciaMin.gridx = 2;
		gbc_lblEstanciaMin.gridy = 21;
		add(lblEstanciaMin, gbc_lblEstanciaMin);
		
		lblEquipamiento = new JLabel("Equipamiento:");
		lblEquipamiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEquipamiento = new GridBagConstraints();
		gbc_lblEquipamiento.anchor = GridBagConstraints.EAST;
		gbc_lblEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipamiento.gridx = 1;
		gbc_lblEquipamiento.gridy = 22;
		add(lblEquipamiento, gbc_lblEquipamiento);
		
		cboEquipamiento = new JComboBox();
		cboEquipamiento.addActionListener(new cboEquipamientoActionListener());
		cboEquipamiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cboEquipamiento.setModel(new DefaultComboBoxModel(new String[] {"Básico", "Menaje", "Microondas", "Ropa de cama", "Toallas", "WiFi", "Otros"}));
		GridBagConstraints gbc_cboEquipamiento = new GridBagConstraints();
		gbc_cboEquipamiento.gridwidth = 3;
		gbc_cboEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_cboEquipamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboEquipamiento.gridx = 2;
		gbc_cboEquipamiento.gridy = 22;
		add(cboEquipamiento, gbc_cboEquipamiento);
		
		lblEquipamientoExtra = new JLabel("Equipamiento extra:");
		lblEquipamientoExtra.setEnabled(false);
		lblEquipamientoExtra.setVisible(false);
		lblEquipamientoExtra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEquipamientoExtra = new GridBagConstraints();
		gbc_lblEquipamientoExtra.anchor = GridBagConstraints.EAST;
		gbc_lblEquipamientoExtra.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipamientoExtra.gridx = 6;
		gbc_lblEquipamientoExtra.gridy = 22;
		add(lblEquipamientoExtra, gbc_lblEquipamientoExtra);
		
		txtEquipamientoExtra = new JTextField();
		txtEquipamientoExtra.setVisible(false);
		txtEquipamientoExtra.setEnabled(false);
		txtEquipamientoExtra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtEquipamientoExtra = new GridBagConstraints();
		gbc_txtEquipamientoExtra.gridwidth = 2;
		gbc_txtEquipamientoExtra.insets = new Insets(0, 0, 5, 5);
		gbc_txtEquipamientoExtra.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEquipamientoExtra.gridx = 7;
		gbc_txtEquipamientoExtra.gridy = 22;
		add(txtEquipamientoExtra, gbc_txtEquipamientoExtra);
		txtEquipamientoExtra.setColumns(10);
		
		lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 23;
		add(lblDescripcion, gbc_lblDescripcion);
		
		lblDescripcionTexto = new JLabel("");
		GridBagConstraints gbc_lblDescripcionTexto = new GridBagConstraints();
		gbc_lblDescripcionTexto.gridheight = 2;
		gbc_lblDescripcionTexto.gridwidth = 5;
		gbc_lblDescripcionTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcionTexto.gridx = 2;
		gbc_lblDescripcionTexto.gridy = 23;
		add(lblDescripcionTexto, gbc_lblDescripcionTexto);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 7;
		gbc_btnLimpiar.gridy = 24;
		add(btnLimpiar, gbc_btnLimpiar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 8;
		gbc_btnGuardar.gridy = 24;
		add(btnGuardar, gbc_btnGuardar);
		
		lblErrorCamposObligatorios = new JLabel("Error. Alguno algunos obligatorios no han sido rellenados.");
		lblErrorCamposObligatorios.setVisible(false);
		lblErrorCamposObligatorios.setForeground(Color.RED);
		lblErrorCamposObligatorios.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblErrorCamposObligatorios = new GridBagConstraints();
		gbc_lblErrorCamposObligatorios.anchor = GridBagConstraints.WEST;
		gbc_lblErrorCamposObligatorios.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorCamposObligatorios.gridx = 9;
		gbc_lblErrorCamposObligatorios.gridy = 24;
		add(lblErrorCamposObligatorios, gbc_lblErrorCamposObligatorios);

	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			txtNombre.setText("");
			txtApellidos.setText("");
			txtTelefono.setText("");
			txtEmail.setText("");
			cboNumOcupantes.setSelectedIndex(0);
			txtHoraLlegada.setText("");
			txtHoraSalida.setText("");
			txtaSolicitudesEspeciales.setText("");
			cboTipo.setSelectedIndex(0);
			cboCapacidadMax.setSelectedIndex(0);
			txtFechaLlegada.setText("");
			txtFechaSalida.setText("");
			lblPrecioNocheConsultado.setText("");
			lblPrecioTotalConsultado.setText("");
			lblEstanciaMin.setText("");
			cboEquipamiento.setSelectedIndex(0);
			lblDescripcion.setText("");
			lblEquipamientoExtra.setEnabled(false);
			lblEquipamientoExtra.setVisible(false);
			txtEquipamientoExtra.setText("");
			txtEquipamientoExtra.setEnabled(false);
			txtEquipamientoExtra.setVisible(false);
			lblErrorCamposObligatorios.setVisible(false);
			
		}
	}
	
	private class cboEquipamientoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(cboEquipamiento.getSelectedIndex() == 6) {
				lblEquipamientoExtra.setEnabled(true);
				lblEquipamientoExtra.setVisible(true);
				txtEquipamientoExtra.setEnabled(true);
				txtEquipamientoExtra.setVisible(true);
			}
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(txtNombre.getText() == ""			||
			txtApellidos.getText() == ""			||
			txtTelefono.getText() == ""				||
			txtHoraLlegada.getText() == "" 			||
			txtHoraSalida.getText() == ""			||
			cboTipo.getSelectedIndex() == 0			||
			cboCapacidadMax.getSelectedIndex() == 0	||
			txtFechaLlegada.getText() == ""			||
			txtFechaSalida.getText() == "")
				lblErrorCamposObligatorios.setVisible(true);
		}
	}
}
