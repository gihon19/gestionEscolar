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

import controlador.CtrlAgregarModalidad;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAgregarModalidad extends JDialog {
	//Variables.
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnCancelar;
	private JButton  btnGuardar;  
	
	//Constructor
	public ViewAgregarModalidad() {
		setTitle("Agregar Modalidad");
		//es para agregar un tema Arriba, en la ventana.
		
		
		getContentPane().setLayout (null);
		
		//Metodos.		
		textField = new JTextField();
		textField.setBounds(102, 58, 232, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 144, 232, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGuardar.setBounds(77, 200, 93, 32);
		getContentPane().add(btnGuardar);
		
		JLabel lblIdModalidad = new JLabel("Id Modalidad");
		lblIdModalidad.setBounds(175, 27, 93, 20);
		getContentPane().add(lblIdModalidad);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(193, 112, 46, 20);
		getContentPane().add(lblNombre);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(241, 201, 93, 30);
		getContentPane().add(btnCancelar);	

	}
	
	public void conectarCtrl(CtrlAgregarModalidad c)
	{
		
		btnGuardar.addActionListener(c);
		btnGuardar.setActionCommand("GUARDAR");
		btnCancelar.addActionListener(c);
		btnCancelar.setActionCommand("CANCELAR");
	}
	
}
