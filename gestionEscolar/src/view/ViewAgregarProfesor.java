package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;


public class ViewAgregarProfesor extends JFrame {
	
	private JTextField txtIdProfesor;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtEmail;
	
	private JButton btnGuardar;
	
	public ViewAgregarProfesor(){
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id Profesor");
		lblNewLabel.setBounds(10, 55, 63, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 95, 70, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(10, 139, 77, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setBounds(10, 178, 70, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Direccion");
		lblNewLabel_4.setBounds(10, 217, 63, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(10, 253, 63, 14);
		getContentPane().add(lblNewLabel_5);
		
		txtIdProfesor = new JTextField();
		txtIdProfesor.setBounds(80, 47, 154, 30);
		getContentPane().add(txtIdProfesor);
		txtIdProfesor.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(80, 87, 246, 30);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(80, 131, 246, 30);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(81, 170, 245, 30);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(80, 209, 404, 30);
		getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(80, 245, 246, 30);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(202, 297, 94, 23);
		getContentPane().add(btnGuardar);
		
		JLabel lblIngresoProfesora = new JLabel("Ingreso Profesor(a)");
		lblIngresoProfesora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIngresoProfesora.setBounds(187, 11, 222, 25);
		getContentPane().add(lblIngresoProfesora);
		
	}
}
