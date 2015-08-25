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
import controlador.CtrAgregarAsignatura;

public class ViewAgregarClase extends JDialog {
	//Variables.
		private JTextField txtIdClase;
		private JTextField txtDescripcion;
		private JButton btnGuardar;
		private JButton btnCancelar;
		
		//Constructor
		public ViewAgregarClase() {
			
			//espara agregar un tema Arriba, en la ventana.
			setTitle("Agregar Asignatura");
			//Metodos.
			
			getContentPane().setLayout (null);
			
			//Cuadro para insertar texto
			txtIdClase = new JTextField();
			txtIdClase.setBounds(20, 46, 228, 20);
			getContentPane().add(txtIdClase);
			txtIdClase.setColumns(10);
			
			txtDescripcion = new JTextField();
			txtDescripcion.setBounds(20, 125, 228, 20);
			getContentPane().add(txtDescripcion);
			txtDescripcion.setColumns(10);
			
			//agregar texto
			JLabel lblIdClase = new JLabel("Id Clase");
			lblIdClase.setBounds(20, 29, 46, 14);
			getContentPane().add(lblIdClase);
			
			//Agregar Boton
			btnGuardar = new BotonGuardar();
			btnGuardar.setLocation(20, 182);
			getContentPane().add(btnGuardar);
			
			//agregar texto
			JLabel lblNombre = new JLabel("Descripcion");
			lblNombre.setBounds(20, 104, 54, 20);
			getContentPane().add(lblNombre);
			
			//Agregar Boton
			btnCancelar = new BotonCancelar();
			btnCancelar.setLocation(181, 182);
			getContentPane().add(btnCancelar);
		}
		
		public void conectarCtrl(CtrAgregarAsignatura c)
		{
			btnGuardar.addActionListener(c);
			btnGuardar.setActionCommand("GUARDAR");
			btnCancelar.addActionListener(c);
			btnCancelar.setActionCommand("CANCELAR");
		}
		
		public JTextField  getTxtIdClase(){
			return txtIdClase;
		}
		public JTextField getTxtDescripcion(){
			return txtDescripcion;
		}
}

