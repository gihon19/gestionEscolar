package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;


public class ViewEncargadoResponsable extends JFrame{
	private JTextField txtNoIdentidad;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JButton btnCancelar;
	private JButton btnGuardar;
	
	
	ViewEncargadoResponsable(){
	getContentPane().setLayout(null);
	
	JLabel lblNoIdentidad = new JLabel("No Identidad: *");
	lblNoIdentidad.setBounds(32, 29, 97, 20);
	getContentPane().add(lblNoIdentidad);
	
	txtNoIdentidad = new JTextField();
	txtNoIdentidad.setBounds(132, 28, 166, 23);
	getContentPane().add(txtNoIdentidad);
	txtNoIdentidad.setColumns(10);
	
	JLabel lblNombre = new JLabel("Nombre: *");
	lblNombre.setBounds(32, 60, 71, 20);
	getContentPane().add(lblNombre);
	
	txtNombre = new JTextField();
	txtNombre.setBounds(132, 59, 242, 23);
	getContentPane().add(txtNombre);
	txtNombre.setColumns(10);
	
	JLabel lblApellido = new JLabel("Apellido: *");
	lblApellido.setBounds(32, 91, 71, 20);
	getContentPane().add(lblApellido);
	
	JLabel lblTelefono = new JLabel("Telefono:");
	lblTelefono.setBounds(32, 122, 71, 20);
	getContentPane().add(lblTelefono);
	
	JLabel lblDireccion = new JLabel("Direccion: *");
	lblDireccion.setBounds(32, 153, 71, 20);
	getContentPane().add(lblDireccion);
	
	JLabel lblCamposObligados = new JLabel("* Campos obligados");
	lblCamposObligados.setBounds(32, 191, 97, 14);
	getContentPane().add(lblCamposObligados);
	
	txtApellido = new JTextField();
	txtApellido.setBounds(132, 90, 242, 23);
	getContentPane().add(txtApellido);
	txtApellido.setColumns(10);
	
	txtTelefono = new JTextField();
	txtTelefono.setBounds(132, 121, 166, 23);
	getContentPane().add(txtTelefono);
	txtTelefono.setColumns(10);
	
	txtDireccion = new JTextField();
	txtDireccion.setBounds(132, 152, 276, 23);
	getContentPane().add(txtDireccion);
	txtDireccion.setColumns(10);
	
	btnCancelar = new JButton("Cancelar");
	btnCancelar.setBounds(264, 228, 89, 28);
	getContentPane().add(btnCancelar);
	
	btnGuardar = new JButton("Guardar");
	btnGuardar.setBounds(112, 228, 89, 28);
	getContentPane().add(btnGuardar);
	
	}
}
