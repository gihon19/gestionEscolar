package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;


public class ViewAgregarAlumnos extends JFrame  {
	private JTextField txtRne;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFecha;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtFotos;
	private JTextField txtNacionalidad;

	ViewAgregarAlumnos(){
		getContentPane().setLayout(null);
		
		JLabel lblRne = new JLabel("RNE:*");
		lblRne.setBounds(22, 33, 46, 14);
		getContentPane().add(lblRne);
		
		txtRne = new JTextField();
		txtRne.setBounds(140, 27, 112, 20);
		getContentPane().add(txtRne);
		txtRne.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:*");
		lblNombre.setBounds(22, 58, 59, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(140, 55, 181, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:*");
		lblApellido.setBounds(22, 85, 59, 14);
		getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(140, 82, 181, 20);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:*");
		lblFechaNacimiento.setBounds(22, 110, 101, 14);
		getContentPane().add(lblFechaNacimiento);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(140, 107, 75, 20);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:*");
		lblGenero.setBounds(22, 136, 46, 14);
		getContentPane().add(lblGenero);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(140, 127, 59, 33);
		getContentPane().add(rdbtnMujer);
		
		JRadioButton rdbtnHombre_1 = new JRadioButton("Hombre");
		rdbtnHombre_1.setBounds(202, 127, 71, 33);
		getContentPane().add(rdbtnHombre_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(10, 154, 16, -2);
		getContentPane().add(label);
		
		JLabel lblTelefono = new JLabel("Telefono:*");
		lblTelefono.setBounds(22, 171, 59, 14);
		getContentPane().add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(140, 168, 112, 20);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico:*");
		lblCorreoElectronico.setBounds(22, 202, 101, 14);
		getContentPane().add(lblCorreoElectronico);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(140, 199, 181, 20);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:*");
		lblNacionalidad.setBounds(22, 234, 71, 14);
		getContentPane().add(lblNacionalidad);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setBounds(22, 261, 46, 14);
		getContentPane().add(lblFoto);
		
		txtFotos = new JTextField();
		txtFotos.setBounds(140, 258, 94, 20);
		getContentPane().add(txtFotos);
		txtFotos.setColumns(10);
		
		JButton btnExaminar = new JButton("Examinar..");
		btnExaminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExaminar.setBounds(234, 257, 82, 23);
		getContentPane().add(btnExaminar);
		
		JLabel lblcamposObligados = new JLabel("*Campos obligados");
		lblcamposObligados.setBounds(22, 295, 101, 14);
		getContentPane().add(lblcamposObligados);
		
		JButton btnMatricular = new JButton("Cancelar");
		btnMatricular.setBounds(312, 357, 82, 33);
		getContentPane().add(btnMatricular);
		
		JList list = new JList();
		list.setBounds(150, 234, 35, -14);
		getContentPane().add(list);
		
		JComboBox comboBoxNacionalidad = new JComboBox();
		comboBoxNacionalidad.setBounds(234, 231, 16, 20);
		getContentPane().add(comboBoxNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setBounds(140, 231, 94, 20);
		getContentPane().add(txtNacionalidad);
		txtNacionalidad.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(171, 275, 4, 22);
		getContentPane().add(textArea);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(29, 357, 94, 33);
		getContentPane().add(btnGuardar);
	}
}
