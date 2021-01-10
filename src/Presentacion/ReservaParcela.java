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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.awt.Color;

import Dominio.ClaseDominio;
import javax.swing.SwingConstants;

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
	private JLabel lblPrecioNocheConsultado;
	private JLabel lblFotoCampingTexto;
	private JLabel lblFotoCamping;
	private JLabel lblEsquemaCampingTexto;
	private JLabel lblEsquemaCamping;
	private JLabel lblPrecioTotal;
	private JLabel lblPrecioTotalConsultado;
	private JButton btnLimpiar;
	private JButton btnReservar;
	private JLabel lblParticularidadesConsultadas;
	private JLabel lblCercaniasConsultadas;
	private JLabel lblErrorCamposObligatorios;
	private JButton btnAceptar;
	
	ReservaGuardada VentanaOK;
	private JLabel lblErrorFecha1;
	private JLabel lblErrorFecha2;
	
	public ReservaParcela() {
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
		
		lblDatosCliente = new JLabel(Internacionalizacion.getString("ReservaParcela.lblDatosCliente.text")); //$NON-NLS-1$
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDatosCliente = new GridBagConstraints();
		gbc_lblDatosCliente.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblDatosCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosCliente.gridx = 1;
		gbc_lblDatosCliente.gridy = 0;
		add(lblDatosCliente, gbc_lblDatosCliente);
		
		lblFotoCampingTexto = new JLabel(Internacionalizacion.getString("ReservaParcela.lblFotoCampingTexto.text")); //$NON-NLS-1$
		lblFotoCampingTexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblFotoCampingTexto = new GridBagConstraints();
		gbc_lblFotoCampingTexto.anchor = GridBagConstraints.SOUTH;
		gbc_lblFotoCampingTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCampingTexto.gridx = 9;
		gbc_lblFotoCampingTexto.gridy = 0;
		add(lblFotoCampingTexto, gbc_lblFotoCampingTexto);
		
		lblFotoCamping = new JLabel(); //$NON-NLS-1$
		lblFotoCamping.setIcon(new ImageIcon(ReservaParcela.class.getResource("/Presentacion/Fotos/Foto_Camping.jpg")));
		GridBagConstraints gbc_lblFotoCamping = new GridBagConstraints();
		gbc_lblFotoCamping.gridheight = 10;
		gbc_lblFotoCamping.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoCamping.gridx = 9;
		gbc_lblFotoCamping.gridy = 1;
		add(lblFotoCamping, gbc_lblFotoCamping);
		
		lblNombre = new JLabel(Internacionalizacion.getString("ReservaParcela.lblNombre.text")); //$NON-NLS-1$
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
		
		lblApellidos = new JLabel(Internacionalizacion.getString("ReservaParcela.lblApellidos.text")); //$NON-NLS-1$
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
		
		lblTelefono = new JLabel(Internacionalizacion.getString("ReservaParcela.lblTelefono.text")); //$NON-NLS-1$
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
		
		lblEmail = new JLabel(Internacionalizacion.getString("ReservaParcela.lblEmail.text")); //$NON-NLS-1$
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
		
		lblNumOcupantes = new JLabel(Internacionalizacion.getString("ReservaParcela.lblNumOcupantes.text")); //$NON-NLS-1$
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
		
		lblHoraLlegada = new JLabel(Internacionalizacion.getString("ReservaParcela.lblHoraLlegada.text")); //$NON-NLS-1$
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
		
		lblHoraSalida = new JLabel(Internacionalizacion.getString("ReservaParcela.lblHoraSalida.text")); //$NON-NLS-1$
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
		
		lblSolicitudesEspeciales = new JLabel(Internacionalizacion.getString("ReservaParcela.lblSolicitudesEspeciales.text")); //$NON-NLS-1$
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
		
		lblDatosParcela = new JLabel(Internacionalizacion.getString("ReservaParcela.lblDatosParcela.text")); //$NON-NLS-1$
		lblDatosParcela.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDatosParcela = new GridBagConstraints();
		gbc_lblDatosParcela.anchor = GridBagConstraints.EAST;
		gbc_lblDatosParcela.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosParcela.gridx = 1;
		gbc_lblDatosParcela.gridy = 12;
		add(lblDatosParcela, gbc_lblDatosParcela);
		
		lblEsquemaCampingTexto = new JLabel(Internacionalizacion.getString("ReservaParcela.lblEsquemaCampingTexto.text")); //$NON-NLS-1$
		lblEsquemaCampingTexto.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblEsquemaCampingTexto = new GridBagConstraints();
		gbc_lblEsquemaCampingTexto.insets = new Insets(0, 0, 5, 5);
		gbc_lblEsquemaCampingTexto.gridx = 9;
		gbc_lblEsquemaCampingTexto.gridy = 12;
		add(lblEsquemaCampingTexto, gbc_lblEsquemaCampingTexto);
		
		lblEsquemaCamping = new JLabel(""); //$NON-NLS-1$
		lblEsquemaCamping.setIcon(new ImageIcon(ReservaParcela.class.getResource("/Presentacion/Fotos/Mapa_Camping.png")));
		GridBagConstraints gbc_lblEsquemaCamping = new GridBagConstraints();
		gbc_lblEsquemaCamping.insets = new Insets(0, 0, 5, 5);
		gbc_lblEsquemaCamping.gridheight = 11;
		gbc_lblEsquemaCamping.gridx = 9;
		gbc_lblEsquemaCamping.gridy = 13;
		add(lblEsquemaCamping, gbc_lblEsquemaCamping);
		
		lblTipo = new JLabel(Internacionalizacion.getString("ReservaParcela.lblTipo.text")); //$NON-NLS-1$
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.anchor = GridBagConstraints.EAST;
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 1;
		gbc_lblTipo.gridy = 14;
		add(lblTipo, gbc_lblTipo);
		
		cboTipo = new JComboBox();
		cboTipo.addActionListener(new cboTipoActionListener());
		cboTipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		if(Internacionalizacion.getIdioma().equals("espanol"))
			cboTipo.setModel(new DefaultComboBoxModel(new String[] {"(Sin selección)", "Pequeñas", "Medianas", "Deluxe", "Para Autocaravanas"}));
		else
			cboTipo.setModel(new DefaultComboBoxModel(new String[] {"(No selection)", "Small", "Medium", "Deluxe", "For Camper"}));
		
		GridBagConstraints gbc_cboTipo = new GridBagConstraints();
		gbc_cboTipo.gridwidth = 3;
		gbc_cboTipo.insets = new Insets(0, 0, 5, 5);
		gbc_cboTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboTipo.gridx = 2;
		gbc_cboTipo.gridy = 14;
		add(cboTipo, gbc_cboTipo);
		
		lblUbicacion = new JLabel(Internacionalizacion.getString("ReservaParcela.lblUbicacion.text")); //$NON-NLS-1$
		lblUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblUbicacion = new GridBagConstraints();
		gbc_lblUbicacion.anchor = GridBagConstraints.EAST;
		gbc_lblUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblUbicacion.gridx = 1;
		gbc_lblUbicacion.gridy = 15;
		add(lblUbicacion, gbc_lblUbicacion);
		
		cboUbicacion = new JComboBox();
		cboUbicacion.setEnabled(false);
		cboUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_cboUbicacion = new GridBagConstraints();
		gbc_cboUbicacion.gridwidth = 3;
		gbc_cboUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_cboUbicacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboUbicacion.gridx = 2;
		gbc_cboUbicacion.gridy = 15;
		add(cboUbicacion, gbc_cboUbicacion);
		
		lblFechaLlegada = new JLabel(Internacionalizacion.getString("ReservaParcela.lblFechaLlegada.text")); //$NON-NLS-1$
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
		
		lblErrorFecha1 = new JLabel(Internacionalizacion.getString("ReservaParcela.lblErrorFecha1.text"));
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
		
		lblFechaSalida = new JLabel(Internacionalizacion.getString("ReservaParcela.lblFechaSalida.text")); //$NON-NLS-1$
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
		
		lblErrorFecha2 = new JLabel(Internacionalizacion.getString("ReservaParcela.lblErrorFecha2.text")); //$NON-NLS-1$
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
		
		lblPrecioNoche = new JLabel(Internacionalizacion.getString("ReservaParcela.lblPrecioNoche.text")); //$NON-NLS-1$
		lblPrecioNoche.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioNoche = new GridBagConstraints();
		gbc_lblPrecioNoche.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioNoche.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioNoche.gridx = 1;
		gbc_lblPrecioNoche.gridy = 18;
		add(lblPrecioNoche, gbc_lblPrecioNoche);
		
		lblPrecioNocheConsultado = new JLabel(""); //$NON-NLS-1$
		lblPrecioNocheConsultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioNocheConsultado = new GridBagConstraints();
		gbc_lblPrecioNocheConsultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioNocheConsultado.gridx = 2;
		gbc_lblPrecioNocheConsultado.gridy = 18;
		add(lblPrecioNocheConsultado, gbc_lblPrecioNocheConsultado);
		
		lblPrecioTotal = new JLabel(Internacionalizacion.getString("ReservaParcela.lblPrecioTotal.text")); //$NON-NLS-1$
		lblPrecioTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioTotal = new GridBagConstraints();
		gbc_lblPrecioTotal.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioTotal.gridx = 1;
		gbc_lblPrecioTotal.gridy = 19;
		add(lblPrecioTotal, gbc_lblPrecioTotal);
		
		lblPrecioTotalConsultado = new JLabel(); //$NON-NLS-1$
		lblPrecioTotalConsultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPrecioTotalConsultado = new GridBagConstraints();
		gbc_lblPrecioTotalConsultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioTotalConsultado.gridx = 2;
		gbc_lblPrecioTotalConsultado.gridy = 19;
		add(lblPrecioTotalConsultado, gbc_lblPrecioTotalConsultado);
		
		lblCercanias = new JLabel(Internacionalizacion.getString("ReservaParcela.lblCercanias.text")); //$NON-NLS-1$
		lblCercanias.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCercanias = new GridBagConstraints();
		gbc_lblCercanias.anchor = GridBagConstraints.EAST;
		gbc_lblCercanias.insets = new Insets(0, 0, 5, 5);
		gbc_lblCercanias.gridx = 1;
		gbc_lblCercanias.gridy = 21;
		add(lblCercanias, gbc_lblCercanias);
		
		lblCercaniasConsultadas = new JLabel(); //$NON-NLS-1$
		lblCercaniasConsultadas.setHorizontalAlignment(SwingConstants.LEFT);
		lblCercaniasConsultadas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCercaniasConsultadas = new GridBagConstraints();
		gbc_lblCercaniasConsultadas.anchor = GridBagConstraints.WEST;
		gbc_lblCercaniasConsultadas.gridwidth = 4;
		gbc_lblCercaniasConsultadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblCercaniasConsultadas.gridx = 2;
		gbc_lblCercaniasConsultadas.gridy = 21;
		add(lblCercaniasConsultadas, gbc_lblCercaniasConsultadas);
		
		lblParticularidades = new JLabel(Internacionalizacion.getString("ReservaParcela.lblParticularidades.text")); //$NON-NLS-1$
		lblParticularidades.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblParticularidades = new GridBagConstraints();
		gbc_lblParticularidades.anchor = GridBagConstraints.EAST;
		gbc_lblParticularidades.insets = new Insets(0, 0, 5, 5);
		gbc_lblParticularidades.gridx = 1;
		gbc_lblParticularidades.gridy = 22;
		add(lblParticularidades, gbc_lblParticularidades);
		
		lblParticularidadesConsultadas = new JLabel(); //$NON-NLS-1$
		lblParticularidadesConsultadas.setHorizontalAlignment(SwingConstants.LEFT);
		lblParticularidadesConsultadas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblParticularidadesConsultadas = new GridBagConstraints();
		gbc_lblParticularidadesConsultadas.anchor = GridBagConstraints.WEST;
		gbc_lblParticularidadesConsultadas.gridwidth = 4;
		gbc_lblParticularidadesConsultadas.insets = new Insets(0, 0, 5, 5);
		gbc_lblParticularidadesConsultadas.gridx = 2;
		gbc_lblParticularidadesConsultadas.gridy = 22;
		add(lblParticularidadesConsultadas, gbc_lblParticularidadesConsultadas);
		
		btnLimpiar = new JButton(Internacionalizacion.getString("ReservaParcela.btnLimpiar.text")); //$NON-NLS-1$
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 6;
		gbc_btnLimpiar.gridy = 24;
		add(btnLimpiar, gbc_btnLimpiar);
		
		btnAceptar = new JButton(Internacionalizacion.getString("ReservaParcela.btnAceptar.text")); //$NON-NLS-1$
		btnAceptar.addActionListener(new BtnAceptarActionListener());
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.BOTH;
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 7;
		gbc_btnAceptar.gridy = 24;
		add(btnAceptar, gbc_btnAceptar);
		
		btnReservar = new JButton(Internacionalizacion.getString("ReservaParcela.btnGuardar.text")); //$NON-NLS-1$
		btnReservar.setEnabled(false);
		btnReservar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReservar.addActionListener(new BtnReservarActionListener());
		GridBagConstraints gbc_btnReservar = new GridBagConstraints();
		gbc_btnReservar.fill = GridBagConstraints.BOTH;
		gbc_btnReservar.insets = new Insets(0, 0, 5, 5);
		gbc_btnReservar.gridx = 8;
		gbc_btnReservar.gridy = 24;
		add(btnReservar, gbc_btnReservar);
		
		lblErrorCamposObligatorios = new JLabel(Internacionalizacion.getString("ReservaParcela.lblErrorCamposObligatorios.text"));
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
	
	private boolean checkCampos() {
		boolean flag=false;
		if(txtNombre.getText().equals("")				||
				txtApellidos.getText().equals("")		||
				txtTelefono.getText().equals("")		||
				txtHoraLlegada.getText().equals("")		||
				txtHoraSalida.getText().equals("")		||
				cboTipo.getSelectedIndex() == 0			||
				txtFechaLlegada.getText().equals("")	||
				txtFechaSalida.getText().equals(""))
			flag=true;
		
		return flag;
		
	}
	
	private void limpiar() {
		desbloquear();
		txtNombre.setText("");
		txtApellidos.setText("");
		txtTelefono.setText("");
		txtEmail.setText("");
		cboNumOcupantes.setSelectedIndex(0);
		txtHoraLlegada.setText("");
		txtHoraSalida.setText("");
		txtaSolicitudesEspeciales.setText("");
		cboTipo.setSelectedIndex(0);
		txtFechaLlegada.setText("");
		txtFechaSalida.setText("");
		lblPrecioNocheConsultado.setText("");
		lblPrecioTotalConsultado.setText("");
		lblCercaniasConsultadas.setText("");
		lblParticularidadesConsultadas.setText("");
		lblErrorFecha1.setVisible(false);
		lblErrorFecha2.setVisible(false);
		lblErrorCamposObligatorios.setVisible(false);
		btnReservar.setEnabled(false);		
	}
	
	
	private void bloquear() {
		txtNombre.setEnabled(false);
		txtApellidos.setEnabled(false);
		txtTelefono.setEnabled(false);
		txtEmail.setEnabled(false);
		cboNumOcupantes.setEnabled(false);
		txtHoraLlegada.setEnabled(false);
		txtHoraSalida.setEnabled(false);
		txtaSolicitudesEspeciales.setEnabled(false);
		cboTipo.setEnabled(false);
		txtFechaLlegada.setEnabled(false);
		txtFechaSalida.setEnabled(false);	
	}
	
	private void desbloquear() {
		txtNombre.setEnabled(true);
		txtApellidos.setEnabled(true);
		txtTelefono.setEnabled(true);
		txtEmail.setEnabled(true);
		cboNumOcupantes.setEnabled(true);
		txtHoraLlegada.setEnabled(true);
		txtHoraSalida.setEnabled(true);
		txtaSolicitudesEspeciales.setEnabled(true);
		cboTipo.setEnabled(true);
		txtFechaLlegada.setEnabled(true);
		txtFechaSalida.setEnabled(true);	
	}
	
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar();
			btnReservar.setEnabled(false);
		}
	}
	
	private class cboTipoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if(cboTipo.getSelectedIndex() != 0) {
				cboUbicacion.removeAllItems();
				int index = cboTipo.getSelectedIndex();
				
				//Con switch no funciona no se por que
				if(index==1) { //Parcelas pequeñas
					cboUbicacion.addItem("1A");
					cboUbicacion.addItem("1B");
					cboUbicacion.addItem("2A");
					cboUbicacion.addItem("2B");
					cboUbicacion.addItem("3A");
					cboUbicacion.addItem("3B");	
					
				}else {
					if(index==2) { //Parcelas medianas
						cboUbicacion.addItem("1C");
						cboUbicacion.addItem("2C");
						cboUbicacion.addItem("3C");
						cboUbicacion.addItem("4C");
						cboUbicacion.addItem("5C");
						
					}else {
						if(index==3) { //Parcelas grandes
							cboUbicacion.addItem("1D");
							cboUbicacion.addItem("2D");
							cboUbicacion.addItem("3D");
							cboUbicacion.addItem("4D");
							cboUbicacion.addItem("5D");
							
						}else {
							if(index==4) { //Parcelas deluxe
								cboUbicacion.addItem("4A");
								cboUbicacion.addItem("4B");
								cboUbicacion.addItem("5A");
								cboUbicacion.addItem("5B");
								
							}
						}
					}
				}
				cboUbicacion.setEnabled(true);
	
			} else cboUbicacion.setEnabled(false);
		}
	}
	

	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar();
			VentanaOK.getFrame().setVisible(true);
			btnReservar.setEnabled(false);
		}
	}
	

	private class BtnAceptarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(checkCampos())
				lblErrorCamposObligatorios.setVisible(true);
				
			else {
				lblErrorCamposObligatorios.setVisible(false);
				
				//En cuanto a precio por noche y precio total de la parcela:
				double precio=0.0;
				ClaseDominio calcular = new ClaseDominio();
				boolean posible=true;
				
				try {		

					btnReservar.setEnabled(true);
					precio=calcular.calcularPrecioNocheParcela(txtFechaLlegada.getText(), cboTipo.getSelectedIndex()); //El precio se calcula con la temporada del dia de llegada
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
					
					catch(NumberFormatException NFE2) {
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


				
				
				//En cuanto a cercanias particularidades de la parcela
				ClaseDominio obtenerInfo = new ClaseDominio();
				
				try {
					lblCercaniasConsultadas.setText(obtenerInfo.infoCercaniasParcela(String.valueOf(cboUbicacion.getSelectedItem()), Internacionalizacion.getIdioma()));
					lblParticularidadesConsultadas.setText(obtenerInfo.infoParticularidadesParcela(String.valueOf(cboUbicacion.getSelectedItem()), Internacionalizacion.getIdioma()));
				
				} catch (FileNotFoundException FNFE) {
					lblErrorCamposObligatorios.setVisible(true);
					lblErrorCamposObligatorios.setText("Parcelas.txt file not found");
					posible=false;
				}
				
				if(posible)
					bloquear();
				
			}
			
		}
	}		
		
}
