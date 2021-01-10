package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.StringTokenizer;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

import Dominio.ClaseDominio;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Rutas extends JPanel {
	private JLabel lblBuscar;
	private JComboBox cboRutas;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblFecha;
	private JTextField txtFecha;
	private JLabel lblHoraInicio;
	private JTextField txtHoraInicio;
	private JLabel lblHoraFin;
	private JTextField txtHoraFin;
	private JLabel lblMonitor;
	private JTextField txtMonitor;
	private JLabel lblSenderistasMin;
	private JComboBox cboSenderistasMin;
	private JLabel lblSenderistasMax;
	private JComboBox cboSenderistasMax;
	private JLabel lblGradoDificultad;
	private JComboBox cboGradoDificultad;
	private JLabel lblDescripcion;
	private JLabel lblEquipamiento;
	private JLabel lblMapaRuta;
	private JButton btnFotoMapaRuta;
	private JLabel lblPuntoEncuentro;
	private JTextField txtPuntoEncuentro;
	private JTextField txtDescripcion;
	private JTextField txtEquipamiento;
	private JButton btnLimpiar;
	private JButton btnGuardar;
	
	ReservaGuardada VentanaOK;
	
	private JLabel lblErrorCamposObligatorios;
	private JLabel lblCrearRuta;
	private JLabel lblBuscarRutas;
	
	public Rutas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 150, 150, 150, 40, 60, 60, 60, 50, 100, 100, 100, 100, 60, 0};
		gridBagLayout.rowHeights = new int[]{65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		String mensaje="Tu ruta se ha guardado con éxito";
		if(Internacionalizacion.getIdioma().equals("ingles"))
			mensaje="Your booking has successfully save";
		VentanaOK = new ReservaGuardada(mensaje);
		
		lblCrearRuta = new JLabel(Internacionalizacion.getString("Rutas.lblCrearRuta.text")); //$NON-NLS-1$
		lblCrearRuta.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblCrearRuta = new GridBagConstraints();
		gbc_lblCrearRuta.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCrearRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearRuta.gridx = 1;
		gbc_lblCrearRuta.gridy = 1;
		add(lblCrearRuta, gbc_lblCrearRuta);
		
		lblMapaRuta = new JLabel(Internacionalizacion.getString("Rutas.lblMapaRuta.text")); //$NON-NLS-1$
		lblMapaRuta.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblMapaRuta = new GridBagConstraints();
		gbc_lblMapaRuta.gridwidth = 3;
		gbc_lblMapaRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblMapaRuta.gridx = 9;
		gbc_lblMapaRuta.gridy = 1;
		add(lblMapaRuta, gbc_lblMapaRuta);
		
		lblNombre = new JLabel(Internacionalizacion.getString("Rutas.lblNombre.text")); //$NON-NLS-1$
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
		gbc_txtNombre.fill = GridBagConstraints.BOTH;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		btnFotoMapaRuta = new JButton(); //$NON-NLS-1$
		btnFotoMapaRuta.addActionListener(new BtnFotoActionListener());
		btnFotoMapaRuta.setIcon(new ImageIcon(Rutas.class.getResource("/Presentacion/Fotos/Ruta0.png")));
		GridBagConstraints gbc_btnFotoMapaRuta = new GridBagConstraints();
		gbc_btnFotoMapaRuta.gridheight = 9;
		gbc_btnFotoMapaRuta.gridwidth = 3;
		gbc_btnFotoMapaRuta.fill = GridBagConstraints.BOTH;
		gbc_btnFotoMapaRuta.insets = new Insets(0, 0, 5, 5);
		gbc_btnFotoMapaRuta.gridx = 9;
		gbc_btnFotoMapaRuta.gridy = 2;
		add(btnFotoMapaRuta, gbc_btnFotoMapaRuta);
		
		lblFecha = new JLabel(Internacionalizacion.getString("Rutas.lblFecha.text")); //$NON-NLS-1$
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 1;
		gbc_lblFecha.gridy = 3;
		add(lblFecha, gbc_lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtFecha = new GridBagConstraints();
		gbc_txtFecha.insets = new Insets(0, 0, 5, 5);
		gbc_txtFecha.fill = GridBagConstraints.BOTH;
		gbc_txtFecha.gridx = 2;
		gbc_txtFecha.gridy = 3;
		add(txtFecha, gbc_txtFecha);
		txtFecha.setColumns(10);
		
		lblHoraInicio = new JLabel(Internacionalizacion.getString("Rutas.lblHoraInicio.text")); //$NON-NLS-1$
		lblHoraInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblHoraInicio = new GridBagConstraints();
		gbc_lblHoraInicio.anchor = GridBagConstraints.EAST;
		gbc_lblHoraInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraInicio.gridx = 1;
		gbc_lblHoraInicio.gridy = 4;
		add(lblHoraInicio, gbc_lblHoraInicio);
		
		txtHoraInicio = new JTextField();
		txtHoraInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtHoraInicio = new GridBagConstraints();
		gbc_txtHoraInicio.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoraInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraInicio.gridx = 2;
		gbc_txtHoraInicio.gridy = 4;
		add(txtHoraInicio, gbc_txtHoraInicio);
		txtHoraInicio.setColumns(10);
		
		lblHoraFin = new JLabel(Internacionalizacion.getString("Rutas.lblHoraFin.text")); //$NON-NLS-1$
		lblHoraFin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblHoraFin = new GridBagConstraints();
		gbc_lblHoraFin.fill = GridBagConstraints.VERTICAL;
		gbc_lblHoraFin.anchor = GridBagConstraints.EAST;
		gbc_lblHoraFin.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraFin.gridx = 1;
		gbc_lblHoraFin.gridy = 5;
		add(lblHoraFin, gbc_lblHoraFin);
		
		txtHoraFin = new JTextField();
		txtHoraFin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtHoraFin = new GridBagConstraints();
		gbc_txtHoraFin.insets = new Insets(0, 0, 5, 5);
		gbc_txtHoraFin.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHoraFin.gridx = 2;
		gbc_txtHoraFin.gridy = 5;
		add(txtHoraFin, gbc_txtHoraFin);
		txtHoraFin.setColumns(10);
		
		lblPuntoEncuentro = new JLabel(Internacionalizacion.getString("Rutas.lblPuntoEncuentro.text")); //$NON-NLS-1$
		lblPuntoEncuentro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblPuntoEncuentro = new GridBagConstraints();
		gbc_lblPuntoEncuentro.anchor = GridBagConstraints.EAST;
		gbc_lblPuntoEncuentro.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntoEncuentro.gridx = 1;
		gbc_lblPuntoEncuentro.gridy = 6;
		add(lblPuntoEncuentro, gbc_lblPuntoEncuentro);
		
		txtPuntoEncuentro = new JTextField();
		txtPuntoEncuentro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtPuntoEncuentro = new GridBagConstraints();
		gbc_txtPuntoEncuentro.gridwidth = 2;
		gbc_txtPuntoEncuentro.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntoEncuentro.fill = GridBagConstraints.BOTH;
		gbc_txtPuntoEncuentro.gridx = 2;
		gbc_txtPuntoEncuentro.gridy = 6;
		add(txtPuntoEncuentro, gbc_txtPuntoEncuentro);
		txtPuntoEncuentro.setColumns(10);
		
		lblMonitor = new JLabel(Internacionalizacion.getString("Rutas.lblMonitor.text")); //$NON-NLS-1$
		lblMonitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblMonitor = new GridBagConstraints();
		gbc_lblMonitor.fill = GridBagConstraints.VERTICAL;
		gbc_lblMonitor.anchor = GridBagConstraints.EAST;
		gbc_lblMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonitor.gridx = 1;
		gbc_lblMonitor.gridy = 7;
		add(lblMonitor, gbc_lblMonitor);
		
		txtMonitor = new JTextField();
		txtMonitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtMonitor = new GridBagConstraints();
		gbc_txtMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_txtMonitor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMonitor.gridx = 2;
		gbc_txtMonitor.gridy = 7;
		add(txtMonitor, gbc_txtMonitor);
		txtMonitor.setColumns(10);
		
		lblSenderistasMin = new JLabel(Internacionalizacion.getString("Rutas.lblSenderistasMin.text")); //$NON-NLS-1$
		lblSenderistasMin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSenderistasMin = new GridBagConstraints();
		gbc_lblSenderistasMin.anchor = GridBagConstraints.EAST;
		gbc_lblSenderistasMin.insets = new Insets(0, 0, 5, 5);
		gbc_lblSenderistasMin.gridx = 1;
		gbc_lblSenderistasMin.gridy = 8;
		add(lblSenderistasMin, gbc_lblSenderistasMin);
		
		cboSenderistasMin = new JComboBox();
		cboSenderistasMin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cboSenderistasMin.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		GridBagConstraints gbc_cboSenderistasMin = new GridBagConstraints();
		gbc_cboSenderistasMin.insets = new Insets(0, 0, 5, 5);
		gbc_cboSenderistasMin.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboSenderistasMin.gridx = 2;
		gbc_cboSenderistasMin.gridy = 8;
		add(cboSenderistasMin, gbc_cboSenderistasMin);
		
		lblSenderistasMax = new JLabel(Internacionalizacion.getString("Rutas.lblSenderistasMax.text")); //$NON-NLS-1$
		lblSenderistasMax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblSenderistasMax = new GridBagConstraints();
		gbc_lblSenderistasMax.anchor = GridBagConstraints.EAST;
		gbc_lblSenderistasMax.insets = new Insets(0, 0, 5, 5);
		gbc_lblSenderistasMax.gridx = 1;
		gbc_lblSenderistasMax.gridy = 9;
		add(lblSenderistasMax, gbc_lblSenderistasMax);
		
		cboSenderistasMax = new JComboBox();
		cboSenderistasMax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cboSenderistasMax.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		GridBagConstraints gbc_cboSenderistasMax = new GridBagConstraints();
		gbc_cboSenderistasMax.insets = new Insets(0, 0, 5, 5);
		gbc_cboSenderistasMax.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboSenderistasMax.gridx = 2;
		gbc_cboSenderistasMax.gridy = 9;
		add(cboSenderistasMax, gbc_cboSenderistasMax);
		
		lblGradoDificultad = new JLabel(Internacionalizacion.getString("Rutas.lblGradoDificultad.text")); //$NON-NLS-1$
		lblGradoDificultad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblGradoDificultad = new GridBagConstraints();
		gbc_lblGradoDificultad.anchor = GridBagConstraints.EAST;
		gbc_lblGradoDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_lblGradoDificultad.gridx = 1;
		gbc_lblGradoDificultad.gridy = 10;
		add(lblGradoDificultad, gbc_lblGradoDificultad);
		
		cboGradoDificultad = new JComboBox();
		cboGradoDificultad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		if(Internacionalizacion.getIdioma().equals("espanol"))
			cboGradoDificultad.setModel(new DefaultComboBoxModel(new String[] {"Fácil", "Medio", "Avanzado", "Experto"}));
		else
			cboGradoDificultad.setModel(new DefaultComboBoxModel(new String[] {"Easy", "Medium", "Advanced", "Skilled"}));
		
		GridBagConstraints gbc_cboGradoDificultad = new GridBagConstraints();
		gbc_cboGradoDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_cboGradoDificultad.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboGradoDificultad.gridx = 2;
		gbc_cboGradoDificultad.gridy = 10;
		add(cboGradoDificultad, gbc_cboGradoDificultad);
		
		lblDescripcion = new JLabel(Internacionalizacion.getString("Rutas.lblDescripcion.text")); //$NON-NLS-1$
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 12;
		add(lblDescripcion, gbc_lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.gridwidth = 2;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescripcion.gridx = 2;
		gbc_txtDescripcion.gridy = 12;
		add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		
		lblEquipamiento = new JLabel(Internacionalizacion.getString("Rutas.lblEquipamiento.text")); //$NON-NLS-1$
		lblEquipamiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEquipamiento = new GridBagConstraints();
		gbc_lblEquipamiento.anchor = GridBagConstraints.EAST;
		gbc_lblEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipamiento.gridx = 1;
		gbc_lblEquipamiento.gridy = 14;
		add(lblEquipamiento, gbc_lblEquipamiento);
		
		txtEquipamiento = new JTextField();
		txtEquipamiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtEquipamiento = new GridBagConstraints();
		gbc_txtEquipamiento.gridwidth = 2;
		gbc_txtEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_txtEquipamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEquipamiento.gridx = 2;
		gbc_txtEquipamiento.gridy = 14;
		add(txtEquipamiento, gbc_txtEquipamiento);
		txtEquipamiento.setColumns(10);
		
		btnLimpiar = new JButton(Internacionalizacion.getString("Rutas.btnLimpiar.text")); //$NON-NLS-1$
		btnLimpiar.addActionListener(new BtnLimpiarActionListener());
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.fill = GridBagConstraints.BOTH;
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 2;
		gbc_btnLimpiar.gridy = 16;
		add(btnLimpiar, gbc_btnLimpiar);
		
		btnGuardar = new JButton(Internacionalizacion.getString("Rutas.btnGuardar.text")); //$NON-NLS-1$
		btnGuardar.addActionListener(new BtnGuardarActionListener());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 3;
		gbc_btnGuardar.gridy = 16;
		add(btnGuardar, gbc_btnGuardar);
		
		lblErrorCamposObligatorios = new JLabel(Internacionalizacion.getString("Rutas.lblErrorCamposObligatorios.text")); //$NON-NLS-1$
		lblErrorCamposObligatorios.setVisible(false);
		lblErrorCamposObligatorios.setForeground(Color.RED);
		lblErrorCamposObligatorios.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblErrorCamposObligatorios = new GridBagConstraints();
		gbc_lblErrorCamposObligatorios.gridwidth = 8;
		gbc_lblErrorCamposObligatorios.insets = new Insets(0, 0, 5, 5);
		gbc_lblErrorCamposObligatorios.gridx = 4;
		gbc_lblErrorCamposObligatorios.gridy = 16;
		add(lblErrorCamposObligatorios, gbc_lblErrorCamposObligatorios);
		
		lblBuscarRutas = new JLabel(Internacionalizacion.getString("Rutas.lblBuscarRutas.text")); //$NON-NLS-1$
		lblBuscarRutas.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblBuscarRutas = new GridBagConstraints();
		gbc_lblBuscarRutas.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscarRutas.gridx = 1;
		gbc_lblBuscarRutas.gridy = 19;
		add(lblBuscarRutas, gbc_lblBuscarRutas);
		
		lblBuscar = new JLabel(Internacionalizacion.getString("Rutas.lblBuscar.text")); //$NON-NLS-1$
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblBuscar = new GridBagConstraints();
		gbc_lblBuscar.anchor = GridBagConstraints.EAST;
		gbc_lblBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscar.gridx = 1;
		gbc_lblBuscar.gridy = 20;
		add(lblBuscar, gbc_lblBuscar);
		
		cboRutas = new JComboBox();
		cboRutas.addActionListener(new cboRutasActionListener());
		cboRutas.setModel(new DefaultComboBoxModel(new String[] {"(Sin selección)", "La llanura solitaria", "Montañas escarpadas", "El embalse del cuervo"}));
		cboRutas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_cboRutas = new GridBagConstraints();
		gbc_cboRutas.gridwidth = 2;
		gbc_cboRutas.insets = new Insets(0, 0, 5, 5);
		gbc_cboRutas.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboRutas.gridx = 2;
		gbc_cboRutas.gridy = 20;
		add(cboRutas, gbc_cboRutas);
		
		
	}
	
	
	private class cboRutasActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			ClaseDominio obtenerDatos = new ClaseDominio();
			String datos= obtenerDatos.datosRuta(cboRutas.getSelectedIndex());
			StringTokenizer st = new StringTokenizer(datos, ";");		
			
			while(st.hasMoreTokens()) {
				txtNombre.setText(st.nextToken());
				txtFecha.setText(st.nextToken());
				txtHoraInicio.setText(st.nextToken());
				txtHoraFin.setText(st.nextToken());
				txtPuntoEncuentro.setText(st.nextToken());
				txtMonitor.setText(st.nextToken());
				cboSenderistasMin.setSelectedIndex(Integer.valueOf(st.nextToken()) - 1);
				cboSenderistasMax.setSelectedIndex(Integer.valueOf(st.nextToken()) - 1);
				cboGradoDificultad.setSelectedIndex(Integer.valueOf(st.nextToken()) - 1);					
				txtDescripcion.setText(st.nextToken());
				txtEquipamiento.setText(st.nextToken());
				
				if(Internacionalizacion.getIdioma().equals("ingles")) {
					txtDescripcion.setText(st.nextToken());
					txtEquipamiento.setText(st.nextToken());					
				}
				else {
					st.nextToken();
					st.nextToken();
				}
				btnFotoMapaRuta.setIcon(new ImageIcon(ReservaBungalow.class.getResource(st.nextToken())));
			}
			
			
		}
	}
	
	private boolean checkCampos() {
		boolean flag=false;
		if(txtNombre.getText() == ""					||
				txtFecha.getText() == ""				||
				txtMonitor.getText() == ""				||
				txtPuntoEncuentro.getText() == "" 		||
				txtDescripcion.getText() == ""			||
				txtEquipamiento.getText() == "")
			flag=true;
		System.out.println(flag);
		System.out.println(txtNombre.getText());
		return flag;
		
	}
	
	public void limpiarCampos(){
		txtNombre.setText("");
		txtFecha.setText("");
		txtHoraInicio.setText("");
		txtHoraFin.setText("");
		txtPuntoEncuentro.setText("");
		txtMonitor.setText("");
		cboSenderistasMin.setSelectedIndex(0);
		cboSenderistasMax.setSelectedIndex(0);
		cboGradoDificultad.setSelectedIndex(0);
		txtDescripcion.setText("");
		txtEquipamiento.setText("");
		lblErrorCamposObligatorios.setVisible(false);
		
		btnFotoMapaRuta.setIcon(new ImageIcon(Rutas.class.getResource("/Presentacion/Fotos/Ruta0.png")));
	}
	
	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			limpiarCampos();
		}
	}
	
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(checkCampos()) {
				lblErrorCamposObligatorios.setVisible(true);
			}
			else {
				limpiarCampos();
				VentanaOK.getFrame().setVisible(true);
			}
		}
	}
	
	private class BtnFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showDialog(btnFotoMapaRuta, "Cargar foto");
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				ImageIcon imagen = new ImageIcon(file.getAbsolutePath());
				if (imagen != null) {
					btnFotoMapaRuta.setIcon(imagen);
				}
			}
			
		}
	}

}
