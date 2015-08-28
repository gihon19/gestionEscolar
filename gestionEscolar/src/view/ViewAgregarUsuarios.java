package view;

import java.awt.Dialog;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import view.botones.BotonCancelar;
import view.botones.BotonGuardar;

public class ViewAgregarUsuarios extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	
	public ViewAgregarUsuarios(Window v) {
		super(v, "Usuarios", Dialog.ModalityType.DOCUMENT_MODAL);
		setTitle("Usuarios");
		
		getContentPane().setLayout (null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(44, 11, 46, 14);
		getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(44, 28, 283, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(44, 59, 46, 14);
		getContentPane().add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(44, 73, 283, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(44, 104, 46, 14);
		getContentPane().add(lblTelefono);
		
		textField_2 = new JTextField();
		textField_2.setBounds(44, 118, 283, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(44, 150, 46, 14);
		getContentPane().add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(44, 165, 283, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(44, 196, 46, 14);
		getContentPane().add(lblUser);
		
		textField_4 = new JTextField();
		textField_4.setBounds(44, 210, 283, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(44, 241, 46, 14);
		getContentPane().add(lblPassword);
		
		textField_5 = new JTextField();
		textField_5.setBounds(44, 254, 283, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
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
}
