package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import controlador.CtrlAgregarEncargados;
import view.botones.BotonCancelar;
import view.botones.BotonGuardar;


public class ViewEncargadoResponsable extends JFrame{
	private JTextField txtNoIdentidad;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JLabel lblApellido;
	private JButton btnCancelar;
	private JButton btnGuardar;
	
	
	ViewEncargadoResponsable(){
	getContentPane().setLayout(null);
	
	JLabel lblNoIdentidad = new JLabel("No Identidad: *");
	lblNoIdentidad.setBounds(22, 24, 97, 20);
	getContentPane().add(lblNoIdentidad);
	
	txtNoIdentidad = new JTextField();
	txtNoIdentidad.setBounds(22, 45, 286, 23);
	getContentPane().add(txtNoIdentidad);
	txtNoIdentidad.setColumns(10);
	
	JLabel lblNombre = new JLabel("Nombre: *");
	lblNombre.setBounds(22, 76, 71, 20);
	getContentPane().add(lblNombre);
	
	txtNombre = new JTextField();
	txtNombre.setBounds(22, 96, 286, 23);
	getContentPane().add(txtNombre);
	txtNombre.setColumns(10);
	
	lblApellido = new JLabel("Apellido: *");
	lblApellido.setBounds(22, 130, 71, 20);
	getContentPane().add(lblApellido);
	
	JLabel lblTelefono = new JLabel("Telefono:");
	lblTelefono.setBounds(22, 185, 71, 20);
	getContentPane().add(lblTelefono);
	
	JLabel lblDireccion = new JLabel("Direccion: *");
	lblDireccion.setBounds(22, 240, 71, 20);
	getContentPane().add(lblDireccion);
	
	JLabel lblCamposObligados = new JLabel(" Campos obligados * ");
	lblCamposObligados.setBounds(22, 294, 119, 14);
	getContentPane().add(lblCamposObligados);
	
	txtApellido = new JTextField();
	txtApellido.setBounds(22, 151, 286, 23);
	getContentPane().add(txtApellido);
	txtApellido.setColumns(10);
	
	txtTelefono = new JTextField();
	txtTelefono.setBounds(22, 206, 286, 23);
	getContentPane().add(txtTelefono);
	txtTelefono.setColumns(10);
	
	txtDireccion = new JTextField();
	txtDireccion.setBounds(22, 260, 286, 23);
	getContentPane().add(txtDireccion);
	txtDireccion.setColumns(10);
	
	btnCancelar = new BotonCancelar();
	btnCancelar.setBounds(191, 328, 128, 38);
	getContentPane().add(btnCancelar);
	
	btnGuardar = new BotonGuardar();
	btnGuardar.setBounds(10, 328, 131, 38);
	getContentPane().add(btnGuardar);
	
	this.setSize(345, 416); 
	
	}
	
	public JTextField gettxtNoIdentidad(){
		return txtNoIdentidad;
	}
	
	public JTextField gettxtNombre(){
		return txtNombre;
	}
	
	public JTextField gettxtApellido(){
		return txtApellido;
	}
	
	public JTextField gettxtTelefono(){
		return txtTelefono;
		
	}
	
	public JTextField gettxtDireccion(){
		return txtDireccion;
		
	}
	
	public  JButton getbtnCancelar(){
		return btnCancelar;
	}
	
	public  JButton getbtnGuardar(){
		return btnGuardar;
	}

	public void conectarControlador(CtrlAgregarEncargados c){
		
		btnGuardar.addActionListener(c);
		btnGuardar.setActionCommand("GUARDAR");
		btnCancelar.addActionListener(c);
		btnCancelar.setActionCommand("CANCELAR");
		
	}
	
	
}

