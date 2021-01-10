package Presentacion;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Dominio.ClaseDominio;

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
import java.util.NoSuchElementException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

public class ReservaBungalow extends JPanel {
	Galeria galeria = new Galeria();
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblEmail;
	private JLabel lblNumOcupantes;
	private JLabel lblHoraLlegada;
	private JLabel lblHoraSalida;
	private JLabel lblDatosCliente;
	private JLabel lblDatosBungalow;
	private JLabel lblTamano;
	private JLabel lblFechaLlegada;
	private JLabel lblSolicitudesEspeciales;
	private JLabel lblFechaSalida;
	private JLabel lblPrecioNoche;
	private JLabel lblEquipamiento;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JComboBox cboNumOcupantes;
	private JTextField txtHoraLlegada;
	private JTextField txtHoraSalida;
	private JTextArea txtaSolicitudesEspeciales;
	private JComboBox cboTamano;
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
	private JButton btnReservar;
	private JLabel lblErrorCamposObligatorios;
	private JButton btnBuscar;
	private JButton btnAceptar;
	
	ReservaGuardada VentanaOK;
	private JLabel lblErrorFecha1;
	private JLabel lblErrorFecha2;
	
	public ReservaBungalow() {
		setBounds(new Rectangle(0, 0, 1450, 980));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{75, 250, 85, 85, 40, 100, 165, 165, 165, 510, 45, 0};
		gridBagLayout.rowHeights = new int[]{75, 15, 35, 35, 35, 35, 35, 35, 35, 35, 95, 65, 35, 15, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		String mensaje="Tu reserva se ha guardado con éxito";
		if(Internacionalizacion.getIdioma().equals("ingles"))
			mensaje="Your booking has successfully done";
		VentanaOK = new ReservaGuardada(mensaje);
		
		lblDatosCliente = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblDatosCliente.text")); //$NON-NLS-1$
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDatosCliente = new GridBagConstraints();
		gbc_lblDatosCliente.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosCliente.gridx = 1;
		gbc_lblDatosCliente.gridy = 0;
		add(lblDatosCliente, gbc_lblDatosCliente);
		
		lblFotoCampingTexto = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblFotoCampingTexto.text")); //$NON-NLS-1$
		lblFotoCampingTexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblFotoCampingTexto = new GridBagConstraints();
		gbc_lblFotoCampingTexto.anchor = GridBagConstraints.SOUTH;
		gbc_lblFotoCampingTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCampingTexto.gridx = 9;
		gbc_lblFotoCampingTexto.gridy = 0;
		add(lblFotoCampingTexto, gbc_lblFotoCampingTexto);
		
		lblFotoCamping = new JLabel("");
		lblFotoCamping.setIcon(new ImageIcon(ReservaBungalow.class.getResource("/Presentacion/Fotos/Foto_Camping.jpg")));
		GridBagConstraints gbc_lblFotoCamping = new GridBagConstraints();
		gbc_lblFotoCamping.gridheight = 10;
		gbc_lblFotoCamping.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCamping.gridx = 9;
		gbc_lblFotoCamping.gridy = 1;
		add(lblFotoCamping, gbc_lblFotoCamping);
		
		lblNombre = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblNombre.text")); //$NON-NLS-1$
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
		
		lblApellidos = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblApellidos.text")); //$NON-NLS-1$
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
		
		lblTelefono = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblTelefono.text")); //$NON-NLS-1$
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
		
		lblEmail = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblEmail.text")); //$NON-NLS-1$
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 5;
		add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmail.setText(""); //$NON-NLS-1$
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 2;
		gbc_txtEmail.gridy = 5;
		add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		lblNumOcupantes = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblNumOcupantes.text")); //$NON-NLS-1$
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
		
		lblHoraLlegada = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblHoraLlegada.text")); //$NON-NLS-1$
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
		
		lblHoraSalida = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblHoraSalida.text")); //$NON-NLS-1$
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
		
		lblSolicitudesEspeciales = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblSolicitudesEspeciales.text")); //$NON-NLS-1$
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
		
		lblDatosBungalow = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblDatosBungalow.text")); //$NON-NLS-1$
		lblDatosBungalow.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDatosBungalow = new GridBagConstraints();
		gbc_lblDatosBungalow.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblDatosBungalow.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosBungalow.gridx = 1;
		gbc_lblDatosBungalow.gridy = 12;
		add(lblDatosBungalow, gbc_lblDatosBungalow);
		
		lblFotoBungalowTexto = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblFotoBungalowTexto.text")); //$NON-NLS-1$
		lblFotoBungalowTexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblFotoBungalowTexto = new GridBagConstraints();
		gbc_lblFotoBungalowTexto.anchor = GridBagConstraints.SOUTH;
		gbc_lblFotoBungalowTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoBungalowTexto.gridx = 9;
		gbc_lblFotoBungalowTexto.gridy = 12;
		add(lblFotoBungalowTexto, gbc_lblFotoBungalowTexto);
		
		lblFotoBungalow = new JLabel("");
		lblFotoBungalow.setIcon(new ImageIcon(ReservaBungalow.class.getResource("/Presentacion/Fotos/Bungalow1.jpg")));
		GridBagConstraints gbc_lblFotoBungalow = new GridBagConstraints();
		gbc_lblFotoBungalow.gridheight = 11;
		gbc_lblFotoBungalow.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoBungalow.gridx = 9;
		gbc_lblFotoBungalow.gridy = 13;
		add(lblFotoBungalow, gbc_lblFotoBungalow);
		
		lblTamano = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblTamano.text")); //$NON-NLS-1$
		lblTamano.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTamano = new GridBagConstraints();
		gbc_lblTamano.anchor = GridBagConstraints.EAST;
		gbc_lblTamano.insets = new Insets(0, 0, 5, 5);
		gbc_lblTamano.gridx = 1;
		gbc_lblTamano.gridy = 14;
		add(lblTamano, gbc_lblTamano);
		
		cboTamano = new JComboBox();
		cboTamano.addActionListener(new cboTamanoActionListener());
		cboTamano.setFont(new Font("Tahoma", Font.PLAIN, 18));
		if(Internacionalizacion.getIdioma().equals("espanol"))
			cboTamano.setModel(new DefaultComboBoxModel(new String[] {"(Sin selección)", "Pequeño", "Mediano", "Grande", "Deluxe"}));
		else
			cboTamano.setModel(new DefaultComboBoxModel(new String[] {"(No selection)", "Small", "Medium", "Big", "Deluxe"}));
		
		GridBagConstraints gbc_cboTamano = new GridBagConstraints();
		gbc_cboTamano.gridwidth = 3;
		gbc_cboTamano.insets = new Insets(0, 0, 5, 5);
		gbc_cboTamano.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboTamano.gridx = 2;
		gbc_cboTamano.gridy = 14;
		add(cboTamano, gbc_cboTamano);
		
		btnGaleria = new JButton(Internacionalizacion.getString("ReservaBungalow.btnGaleria.text")); //$NON-NLS-1$
		btnGaleria.addActionListener(new BtnGaleriaActionListener());
		btnGaleria.setMinimumSize(new Dimension(100, 29));
		btnGaleria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnGaleria = new GridBagConstraints();
		gbc_btnGaleria.fill = GridBagConstraints.BOTH;
		gbc_btnGaleria.insets = new Insets(0, 0, 5, 5);
		gbc_btnGaleria.gridx = 6;
		gbc_btnGaleria.gridy = 14;
		add(btnGaleria, gbc_btnGaleria);
		
		lblCapacidadMax = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblCapacidadMax.text")); //$NON-NLS-1$
		lblCapacidadMax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCapacidadMax = new GridBagConstraints();
		gbc_lblCapacidadMax.insets = new Insets(0, 0, 5, 5);
		gbc_lblCapacidadMax.anchor = GridBagConstraints.EAST;
		gbc_lblCapacidadMax.gridx = 1;
		gbc_lblCapacidadMax.gridy = 15;
		add(lblCapacidadMax, gbc_lblCapacidadMax);
		
		cboCapacidadMax = new JComboBox();
		cboCapacidadMax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cboCapacidadMax.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		GridBagConstraints gbc_cboCapacidadMax = new GridBagConstraints();
		gbc_cboCapacidadMax.gridwidth = 3;
		gbc_cboCapacidadMax.insets = new Insets(0, 0, 5, 5);
		gbc_cboCapacidadMax.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboCapacidadMax.gridx = 2;
		gbc_cboCapacidadMax.gridy = 15;
		add(cboCapacidadMax, gbc_cboCapacidadMax);
		
		lblFechaLlegada = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblFechaLlegada.text")); //$NON-NLS-1$
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
		
		lblErrorFecha1 = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblErrorFecha1.text")); //$NON-NLS-1$
		lblErrorFecha1.setVisible(false);
		lblErrorFecha1.setForeground(Color.RED);
		lblErrorFecha1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblErrorFecha1 = new GridBagConstraints();
		gbc_lblErrorFecha1.anchor = GridBagConstraints.WEST;
		gbc_lblErrorFecha1.gridwidth = 4;
		gbc_lblErrorFecha1.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFecha1.gridx = 4;
		gbc_lblErrorFecha1.gridy = 16;
		add(lblErrorFecha1, gbc_lblErrorFecha1);
		
		lblFechaSalida = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblFechaSalida.text")); //$NON-NLS-1$
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
		
		lblErrorFecha2 = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblErrorFecha2.text")); //$NON-NLS-1$
		lblErrorFecha2.setVisible(false);
		lblErrorFecha2.setForeground(Color.RED);
		lblErrorFecha2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblErrorFecha2 = new GridBagConstraints();
		gbc_lblErrorFecha2.anchor = GridBagConstraints.WEST;
		gbc_lblErrorFecha2.gridwidth = 4;
		gbc_lblErrorFecha2.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorFecha2.gridx = 4;
		gbc_lblErrorFecha2.gridy = 17;
		add(lblErrorFecha2, gbc_lblErrorFecha2);
		
		lblPrecioNoche = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblPrecioNoche.text")); //$NON-NLS-1$
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
		
		lblPrecioTotal = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblPrecioTotal.text")); //$NON-NLS-1$
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
		
		lblEquipamiento = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblEquipamiento.text")); //$NON-NLS-1$
		lblEquipamiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEquipamiento = new GridBagConstraints();
		gbc_lblEquipamiento.anchor = GridBagConstraints.EAST;
		gbc_lblEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipamiento.gridx = 1;
		gbc_lblEquipamiento.gridy = 21;
		add(lblEquipamiento, gbc_lblEquipamiento);
		
		cboEquipamiento = new JComboBox();
		cboEquipamiento.addActionListener(new cboEquipamientoActionListener());
		cboEquipamiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		if(Internacionalizacion.getIdioma().equals("espanol"))
			cboEquipamiento.setModel(new DefaultComboBoxModel(new String[] {"Básico", "Menaje", "Microondas", "Ropa de cama", "Toallas", "WiFi", "Otros"}));
		else
			cboEquipamiento.setModel(new DefaultComboBoxModel(new String[] {"Basic", "Household", "Microwave", "Bed sheets", "Towels", "WiFi", "Other"}));
		
		GridBagConstraints gbc_cboEquipamiento = new GridBagConstraints();
		gbc_cboEquipamiento.gridwidth = 3;
		gbc_cboEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_cboEquipamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboEquipamiento.gridx = 2;
		gbc_cboEquipamiento.gridy = 21;
		add(cboEquipamiento, gbc_cboEquipamiento);
		
		lblEquipamientoExtra = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblEquipamientoExtra.text")); //$NON-NLS-1$
		lblEquipamientoExtra.setMinimumSize(new Dimension(100, 20));
		lblEquipamientoExtra.setEnabled(false);
		lblEquipamientoExtra.setVisible(false);
		lblEquipamientoExtra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEquipamientoExtra = new GridBagConstraints();
		gbc_lblEquipamientoExtra.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEquipamientoExtra.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipamientoExtra.gridx = 6;
		gbc_lblEquipamientoExtra.gridy = 21;
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
		gbc_txtEquipamientoExtra.gridy = 21;
		add(txtEquipamientoExtra, gbc_txtEquipamientoExtra);
		txtEquipamientoExtra.setColumns(10);
		
		lblDescripcion = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblDescripcion.text")); //$NON-NLS-1$
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 22;
		add(lblDescripcion, gbc_lblDescripcion);
		
		btnReservar = new JButton(Internacionalizacion.getString("ReservaBungalow.btnGuardar.text")); //$NON-NLS-1$
		btnReservar.setEnabled(false);
		btnReservar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReservar.addActionListener(new BtnReservarActionListener());
		
		btnLimpiar = new JButton(Internacionalizacion.getString("ReservaBungalow.btnLimpiar.text")); //$NON-NLS-1$
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		
		lblDescripcionTexto = new JLabel(); //$NON-NLS-1$
		lblDescripcionTexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDescripcionTexto = new GridBagConstraints();
		gbc_lblDescripcionTexto.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcionTexto.gridwidth = 5;
		gbc_lblDescripcionTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcionTexto.gridx = 2;
		gbc_lblDescripcionTexto.gridy = 22;
		add(lblDescripcionTexto, gbc_lblDescripcionTexto);
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 6;
		gbc_btnLimpiar.gridy = 24;
		add(btnLimpiar, gbc_btnLimpiar);
		
		btnAceptar = new JButton(Internacionalizacion.getString("ReservaBungalow.btnAceptar.text")); //$NON-NLS-1$
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.BOTH;
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 7;
		gbc_btnAceptar.gridy = 24;
		add(btnAceptar, gbc_btnAceptar);
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.fill = GridBagConstraints.BOTH;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 8;
		gbc_btnReservar.gridy = 24;
		add(btnReservar, gbc_btnReservar);
		
		lblErrorCamposObligatorios = new JLabel(Internacionalizacion.getString("ReservaBungalow.lblErrorCamposObligatorios.text")); //$NON-NLS-1$
		lblErrorCamposObligatorios.setVisible(false);
		lblErrorCamposObligatorios.setForeground(Color.RED);
		lblErrorCamposObligatorios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblErrorCamposObligatorios = new GridBagConstraints();
		gbc_lblErrorCamposObligatorios.anchor = GridBagConstraints.WEST;
		gbc_lblErrorCamposObligatorios.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorCamposObligatorios.gridx = 9;
		gbc_lblErrorCamposObligatorios.gridy = 24;
		add(lblErrorCamposObligatorios, gbc_lblErrorCamposObligatorios);

	}
	
	/*
	 * private boolean checkCampos(){ boolean flag=false; if(txtNombre.getText() ==
	 * "" || txtApellidos.getText() == "" || txtTelefono.getText() == "" ||
	 * txtHoraLlegada.getText() == "" || txtHoraSalida.getText() == "" ||
	 * txtFechaLlegada.getText() == "" || txtFechaSalida.getText() == "") flag=true;
	 * 
	 * return flag; }
	 */
	
	private boolean checkCampos() {
		boolean flag=false;
		if(txtNombre.getText().equals("")				||
				txtApellidos.getText().equals("")		||
				txtTelefono.getText().equals("")		||
				txtHoraLlegada.getText().equals("") 	||
				txtHoraSalida.getText().equals("")		||
				txtFechaLlegada.getText().equals("")	||
				txtFechaSalida.getText().equals(""))
			flag=true;
		
		return flag;
	}
	
	private void limpiarCampos() {
		desbloquear();
		txtNombre.setText("");
		txtApellidos.setText("");
		txtTelefono.setText("");
		txtEmail.setText("");
		cboNumOcupantes.setSelectedIndex(0);
		txtHoraLlegada.setText("");
		txtHoraSalida.setText("");
		txtaSolicitudesEspeciales.setText("");
		cboTamano.setSelectedIndex(0);
		cboCapacidadMax.setSelectedIndex(0);
		txtFechaLlegada.setText("");
		txtFechaSalida.setText("");
		lblPrecioNocheConsultado.setText("");
		lblPrecioTotalConsultado.setText("");
		cboEquipamiento.setSelectedIndex(0);
		lblDescripcionTexto.setText("");
		lblEquipamientoExtra.setEnabled(false);
		lblEquipamientoExtra.setVisible(false);
		txtEquipamientoExtra.setText("");
		txtEquipamientoExtra.setEnabled(false);
		txtEquipamientoExtra.setVisible(false);
		lblErrorFecha1.setVisible(false);
		lblErrorFecha2.setVisible(false);
		lblErrorCamposObligatorios.setVisible(false);
		btnReservar.setEnabled(false);
	}	

	private void bloquear() {
		txtNombre.setEnabled(false);
		txtApellidos.setEnabled(false);
		txtTelefono.setEnabled(false);
		txtEmail.setEnabled(false);;
		cboNumOcupantes.setEnabled(false);
		txtHoraLlegada.setEnabled(false);
		txtHoraSalida.setEnabled(false);
		txtaSolicitudesEspeciales.setEnabled(false);
		cboTamano.setEnabled(false);
		cboCapacidadMax.setEnabled(false);
		txtFechaLlegada.setEnabled(false);
		txtFechaSalida.setEnabled(false);
		cboEquipamiento.setEnabled(false);
		txtEquipamientoExtra.setEnabled(false);
	}
	
	private void desbloquear() {
		txtNombre.setEnabled(true);
		txtApellidos.setEnabled(true);
		txtTelefono.setEnabled(true);
		txtEmail.setEnabled(true);;
		cboNumOcupantes.setEnabled(true);
		txtHoraLlegada.setEnabled(true);
		txtHoraSalida.setEnabled(true);
		txtaSolicitudesEspeciales.setEnabled(true);
		cboTamano.setEnabled(true);
		cboCapacidadMax.setEnabled(true);
		txtFechaLlegada.setEnabled(true);
		txtFechaSalida.setEnabled(true);
		cboEquipamiento.setEnabled(true);
		txtEquipamientoExtra.setEnabled(true);
	}
	
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			limpiarCampos();
			btnReservar.setEnabled(false);
		}

	}

	private class cboTamanoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			ClaseDominio obtenerDescripcion = new ClaseDominio();
			lblDescripcionTexto.setText("");
			
			switch(cboTamano.getSelectedIndex()) {
				case 1: {//Pequeño
					lblDescripcionTexto.setText("Cabaña de madera comoda y acogedora");
					if(Internacionalizacion.getIdioma().equals("ingles"))
						lblDescripcionTexto.setText("Comfortable and safe log hut");
					lblFotoBungalow.setIcon(new ImageIcon(ReservaBungalow.class.getResource("/Presentacion/Fotos/Bungalow1.jpg")));
					break;
				}
				
				case 2: {//Mediano
					lblDescripcionTexto.setText("Ni muy grande ni muy pequeño. Perfecto.");
					if(Internacionalizacion.getIdioma().equals("ingles"))
						lblDescripcionTexto.setText("Neither too nor too small. Just Perfect.");
					lblFotoBungalow.setIcon(new ImageIcon(ReservaBungalow.class.getResource("/Presentacion/Fotos/Bungalow2.jpg")));
					break;
				}
				
				case 3: {//Grande
					lblDescripcionTexto.setText("La aventura en familia empiza aquí.");
					if(Internacionalizacion.getIdioma().equals("ingles"))
						lblDescripcionTexto.setText("Your family adventure starts here");
					lblFotoBungalow.setIcon(new ImageIcon(ReservaBungalow.class.getResource("/Presentacion/Fotos/Bungalow3.jpg")));
					break;
				}
				
				case 4: {//Deluxe
					lblDescripcionTexto.setText("La mejor cabaña para los amigos.");
					if(Internacionalizacion.getIdioma().equals("ingles"))
						lblDescripcionTexto.setText("The best hut for friends.");
					lblFotoBungalow.setIcon(new ImageIcon(ReservaBungalow.class.getResource("/Presentacion/Fotos/Bungalow5.jpg")));
					break;
				}
			}
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
	
	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiarCampos();
			VentanaOK.getFrame().setVisible(true);
			btnReservar.setEnabled(false);
		}			
	}
	
	
	private class BtnGaleriaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			galeria.setVisible(true);
		}
	}
	

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(checkCampos())
				lblErrorCamposObligatorios.setVisible(true);
				
			else {
				lblErrorCamposObligatorios.setVisible(false);
				
				double precio=0.0;
				ClaseDominio calcular = new ClaseDominio();
				boolean posible=true;
				
				try {							
					btnReservar.setEnabled(true);
					precio=calcular.calcularPrecioNocheBungalow(txtFechaLlegada.getText(), cboTamano.getSelectedIndex()); //El precio se calcula con la temporada del dia de llegada
					lblPrecioNocheConsultado.setText(String.valueOf(precio)+ " €");
					lblErrorFecha1.setVisible(false);
					
					try {
						double precioTotal=precio*calcular.calcularDias(txtFechaLlegada.getText(), txtFechaSalida.getText());
						if(precioTotal==0.0)
							lblPrecioTotalConsultado.setText(precio + " €");
						else
							lblPrecioTotalConsultado.setText(String.valueOf(precio*calcular.calcularDias(txtFechaLlegada.getText(), txtFechaSalida.getText()) + " €"));
						lblErrorFecha2.setVisible(false);
						
					}catch(NoSuchElementException NSEE2) {
						lblErrorFecha2.setVisible(true);
						posible=false;
					}
					
					catch(NumberFormatException NFE1) {
						lblErrorFecha2.setVisible(true);
						posible=false;
					}
					
				}catch(NoSuchElementException NSEE1) {
					lblErrorFecha1.setVisible(true);
					lblErrorFecha2.setVisible(false);
					posible=false;
				}
				
				catch(NumberFormatException NFE1) {
					lblErrorFecha1.setVisible(true);
					lblErrorFecha2.setVisible(false);
					posible=false;
				}
				
				if(posible)
					bloquear();
			}
		}
	}
	
}
