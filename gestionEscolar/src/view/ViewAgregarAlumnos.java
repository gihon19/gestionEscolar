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

import controlador.CtrlAgregarAlumnos;
import controlador.CtrlAgregarEncargados;
import view.botones.BotonCancelar;
import view.botones.BotonGuardar;


public class ViewAgregarAlumnos extends JFrame  {
	private JTextField txtRne;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFecha;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtFotos;
	private JTextField txtNacionalidad;
	private JButton btnGuardar;
	private JButton btnCancelar;

	ViewAgregarAlumnos(){
		getContentPane().setLayout(null);
		
		JLabel lblRne = new JLabel("RNE:*");
		lblRne.setBounds(22, 33, 46, 14);
		getContentPane().add(lblRne);
		
		txtRne = new JTextField();
		txtRne.setBounds(22, 55, 319, 20);
		getContentPane().add(txtRne);
		txtRne.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:*");
		lblNombre.setBounds(22, 86, 59, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(22, 104, 319, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:*");
		lblApellido.setBounds(22, 135, 59, 14);
		getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(22, 154, 319, 20);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:*");
		lblFechaNacimiento.setBounds(22, 185, 111, 14);
		getContentPane().add(lblFechaNacimiento);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(22, 203, 319, 20);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:*");
		lblGenero.setBounds(22, 234, 59, 14);
		getContentPane().add(lblGenero);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(22, 255, 59, 33);
		getContentPane().add(rdbtnMujer);
		
		JRadioButton rdbtnHombre_1 = new JRadioButton("Hombre");
		rdbtnHombre_1.setBounds(94, 255, 71, 33);
		getContentPane().add(rdbtnHombre_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(10, 154, 16, -2);
		getContentPane().add(label);
		
		JLabel lblTelefono = new JLabel("Telefono:*");
		lblTelefono.setBounds(22, 295, 71, 14);
		getContentPane().add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(22, 312, 319, 20);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico:*");
		lblCorreoElectronico.setBounds(22, 343, 134, 14);
		getContentPane().add(lblCorreoElectronico);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(22, 361, 319, 20);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:*");
		lblNacionalidad.setBounds(22, 392, 82, 14);
		getContentPane().add(lblNacionalidad);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setBounds(22, 442, 46, 14);
		getContentPane().add(lblFoto);
		
		txtFotos = new JTextField();
		txtFotos.setBounds(22, 456, 240, 20);
		getContentPane().add(txtFotos);
		txtFotos.setColumns(10);
		
		JButton btnExaminar = new JButton("Examinar..");
		btnExaminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExaminar.setBounds(259, 455, 82, 23);
		getContentPane().add(btnExaminar);
		
		JLabel lblcamposObligados = new JLabel("*Campos obligados");
		lblcamposObligados.setBounds(22, 516, 111, 14);
		getContentPane().add(lblcamposObligados);
		
		 btnCancelar = new BotonCancelar();
		btnCancelar.setBounds(219, 553, 122, 33);
		getContentPane().add(btnCancelar);
		
		JList list = new JList();
		list.setBounds(150, 234, 35, -14);
		getContentPane().add(list);
		
		JComboBox comboBoxNacionalidad = new JComboBox();
		comboBoxNacionalidad.setBounds(325, 411, 16, 20);
		getContentPane().add(comboBoxNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setBounds(22, 411, 306, 20);
		getContentPane().add(txtNacionalidad);
		txtNacionalidad.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(171, 275, 4, 22);
		getContentPane().add(textArea);
		
	   btnGuardar = new BotonGuardar();
		btnGuardar.setBounds(34, 553, 122, 33);
		getContentPane().add(btnGuardar);
	}
	public JTextField gettxtRNE(){
		return txtRne;
	}
	
	public JTextField gettxtNombre(){
		return txtNombre;
	}
	public JTextField gettxtApellido(){
		return txtApellido;
	}
	
	public JTextField gettxtFecha(){
		return txtFecha;
	}
	public JTextField gettxtTelefono(){
		return txtTelefono;
	}
	
	public JTextField gettxtCorreo(){
		return txtCorreo;
	}
	public JTextField gettxtNacionalidad(){
		return txtNacionalidad;
	}
	
public void conectarControlador(CtrlAgregarAlumnos c){
		
		btnGuardar.addActionListener(c);
		btnGuardar.setActionCommand("GUARDAR");
		btnCancelar.addActionListener(c);
		btnCancelar.setActionCommand("CANCELAR");
		
	}
}
