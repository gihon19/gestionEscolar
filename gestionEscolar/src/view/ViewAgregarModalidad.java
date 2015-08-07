package view;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
//Importaciones de otras clases

public class ViewAgregarModalidad extends JDialog {
	//Variables.
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnCancelar;
	private JButton  btnGuardar;  
	
	//Constructor
	public ViewAgregarModalidad(Window v) {
		//espara agregar un tema Arriba, en la ventana.
		super(v,"Agregar Modalidad",Dialog.ModalityType.DOCUMENT_MODAL);
		
		getContentPane().setLayout (null);
		//Metodos.
		textField = new JTextField();
		textField.setBounds(33, 55, 127, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 141, 232, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(33, 200, 104, 32);
		getContentPane().add(btnGuardar);
		
		JLabel lblIdModalidad = new JLabel("Id Modalidad");
		lblIdModalidad.setBounds(33, 32, 65, 20);
		getContentPane().add(lblIdModalidad);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(33, 119, 46, 20);
		getContentPane().add(lblNombre);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(159, 201, 93, 30);
		getContentPane().add(btnCancelar);
	}
}
