package view;

import java.awt.Dialog;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import controlador.CtrlAgregarAlumnos;
import controlador.CtrlAgregarUsuarios;
import view.botones.BotonCancelar;
import view.botones.BotonGuardar;

public class ViewAgregarUsuarios extends JDialog {
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTextField textUser;
	private JTextField textPassword;
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	
	public ViewAgregarUsuarios(Window v) {
		super(v, "Usuarios", Dialog.ModalityType.DOCUMENT_MODAL);
		setTitle("Usuarios");
		
		getContentPane().setLayout (null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(44, 11, 46, 14);
		getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(44, 28, 283, 20);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(44, 59, 46, 14);
		getContentPane().add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.setBounds(44, 73, 283, 20);
		getContentPane().add(textApellido);
		textApellido.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(44, 104, 46, 14);
		getContentPane().add(lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(44, 118, 283, 20);
		getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(44, 150, 46, 14);
		getContentPane().add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(44, 165, 283, 20);
		getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(44, 196, 46, 14);
		getContentPane().add(lblUser);
		
		textUser = new JTextField();
		textUser.setBounds(44, 210, 283, 20);
		getContentPane().add(textUser);
		textUser.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(44, 241, 46, 14);
		getContentPane().add(lblPassword);
		
		textPassword = new JTextField();
		textPassword.setBounds(44, 254, 283, 20);
		getContentPane().add(textPassword);
		textPassword.setColumns(10);
		
		JRadioButton rdbtnSecretario = new JRadioButton("Secretario");
		rdbtnSecretario.setBounds(44, 281, 75, 37);
		getContentPane().add(rdbtnSecretario);
		
		JRadioButton rdbtnDirector = new JRadioButton("Director");
		rdbtnDirector.setBounds(243, 281, 84, 37);
		getContentPane().add(rdbtnDirector);
		
		btnGuardar = new BotonGuardar();
		btnGuardar.setLocation(20, 325);
		getContentPane().add(btnGuardar);
		
		btnCancelar = new  BotonCancelar();
		btnCancelar.setLocation(209, 325);
		getContentPane().add(btnCancelar);
		
	}
	public JTextField gettxtnombre(){
		return textNombre;
	}
	
	public JTextField gettxtelefono(){
		return textTelefono;
	}
	public JTextField gettxtApellido(){
		return textApellido;
	}
	
	public JTextField gettxtemail(){
		return textEmail;
	}
	public JTextField gettxtuser(){
		return textUser;
	}
	
	public JTextField gettxtpassword(){
		return textPassword;
	}
	
	
public void conectarControlador(CtrlAgregarUsuarios c){
		
		btnGuardar.addActionListener(c);
		btnGuardar.setActionCommand("GUARDAR");
		btnCancelar.addActionListener(c);
		btnCancelar.setActionCommand("CANCELAR");
		
	}
}
