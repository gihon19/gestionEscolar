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



import view.botones.BotonCancelar;
import view.botones.BotonGuardar;
import controlador.CtrlAgregarModalidad;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAgregarModalidad extends JDialog {
	//Variables.
	private JTextField txtIdModalidad;
	private JTextField txtNombre;
	private JButton btnCancelar;
	private JButton  btnGuardar;  
	
	//Constructor
	public ViewAgregarModalidad() {
		setTitle("Agregar Modalidad");
		//es para agregar un tema Arriba, en la ventana.
		
		
		getContentPane().setLayout (null);
		
		//Metodos.		
		txtIdModalidad = new JTextField();
		txtIdModalidad.setBounds(25, 56, 232, 20);
		getContentPane().add(txtIdModalidad);
		txtIdModalidad.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(25, 131, 232, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		btnGuardar = new BotonGuardar();
		btnGuardar.setLocation(10, 173);
		getContentPane().add(btnGuardar);
		
		JLabel lblIdModalidad = new JLabel("Id Modalidad");
		lblIdModalidad.setBounds(25, 29, 93, 20);
		getContentPane().add(lblIdModalidad);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(25, 106, 46, 20);
		getContentPane().add(lblNombre);
		
		btnCancelar = new BotonCancelar();
		btnCancelar.setLocation(146, 174);
		getContentPane().add(btnCancelar);	

	}
	
	public void conectarCtrl(CtrlAgregarModalidad c)
	{
		
		btnGuardar.addActionListener(c);
		btnGuardar.setActionCommand("GUARDAR");
		btnCancelar.addActionListener(c);
		btnCancelar.setActionCommand("CANCELAR");
	}
	
	public JTextField getTxtIdModalidad(){
		return txtIdModalidad;
	}
	
	public JTextField getTxtNombre(){
		return txtNombre;
	}
	
}