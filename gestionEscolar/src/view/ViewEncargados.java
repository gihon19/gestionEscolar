package view;

import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import modelo.MtEncargado;

import javax.swing.JTextField;
import javax.swing.JLabel;

import controlador.CtrlListaEncargados;

import javax.swing.JButton;

import view.botones.BotonAgregar;
import view.botones.BotonBuscar;
import view.botones.BotonEliminar;

public class ViewEncargados extends JFrame {
	
	private JTable mytabla;
	private JScrollPane scrollPane;
	private MtEncargado myModelo;
	private JTextField txtBuscar;
	private JButton btnBuscar;
	private JButton btnEliminar;
	private JButton btnAgregar;
	
	ViewEncargados(){
		/*esto sirve para escribir un titulo en la ventana*/
		setTitle("Lista de Encargados");
		getContentPane().setLayout(null);
		
		/*este es un componente que nos permite dibujar una tabla
		 *de forma que en cada fila/columna de la tabla podamos poner el dato que queramos */
		
			
		myModelo=new MtEncargado();
		mytabla=new JTable();
		mytabla.setModel(myModelo);
		
		/*el scrollpane sirve para mostrar un componente cuyo tamaño puede cambiar dinamicamente*/
		
	    scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 54, 577, 274);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(mytabla);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(21, 11, 167, 32);
		getContentPane().add(txtBuscar);
		txtBuscar.setColumns(10);
		
		btnBuscar = new BotonBuscar();
		btnBuscar.setBounds(185, 11, 99, 32);
		getContentPane().add(btnBuscar);
		
		btnEliminar = new BotonEliminar();
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(493, 11, 105, 32);
		getContentPane().add(btnEliminar);
		
		btnAgregar = new BotonAgregar();
		btnAgregar.setText("Agregar");
		btnAgregar.setBounds(344, 11, 105, 32);
		getContentPane().add(btnAgregar);
		this.setSize(624,377);
	}
	
	
	public JTable getMyTabla(){
		return mytabla;
	}
	
	public MtEncargado getMyModelo(){
		return myModelo;
	}
	
	public JTextField getTxtBuscar(){
		return txtBuscar;
		
	}


	public void ConectarControlador(CtrlListaEncargados c) {
		 mytabla.addMouseListener(c);
		
		btnAgregar.addActionListener(c);
		btnAgregar.setActionCommand("AGREGAR");
		
		btnEliminar.addActionListener(c);
		btnEliminar.setActionCommand("ELIMINAR");

		
		btnBuscar.addActionListener(c);
		btnBuscar.setActionCommand("BUSCAR");
		
	}
	
	


}
