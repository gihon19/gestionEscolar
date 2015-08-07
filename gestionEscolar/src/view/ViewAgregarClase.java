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

public class ViewAgregarClase extends JDialog {
	//Variables.
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnGuardar;
	//Constructor
	public ViewAgregarClase(Window v) {
		//espara agregar un tema Arriba, en la ventana.
		super(v,"Agregar Modalidad",Dialog.ModalityType.DOCUMENT_MODAL);
		//Metodos.
		getContentPane().setLayout (null);
		
		//Cuadro para insertar texto
		textField = new JTextField();
		textField.setBounds(20, 46, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 125, 268, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		//agregar texto
		JLabel lblIdClase = new JLabel("Id Clase");
		lblIdClase.setBounds(20, 29, 46, 14);
		getContentPane().add(lblIdClase);
		//Agregar Boton
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(20, 182, 109, 30);
		getContentPane().add(btnGuardar);
		//agregar texto
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 104, 54, 20);
		getContentPane().add(lblNombre);
		//Agregar Boton
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(164, 182, 109, 30);
		getContentPane().add(btnCancelar);
	}
}

