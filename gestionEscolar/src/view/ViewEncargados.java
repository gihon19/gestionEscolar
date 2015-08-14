package view;

import java.awt.Dialog;
import java.awt.Window;

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

public class ViewEncargados extends JDialog {
	
	private JTable mytabla;
	private JScrollPane scrollPane;
	private MtEncargado myModelo;
	private JTextField txtBuscar;
	private JButton btnBuscar;
	private JButton btnEliminar;
	private JButton btnAgregar;
	
	ViewEncargados(Window v){
		/*esto sirve para escribir un titulo en la ventana*/
		super(v, "Encargados", Dialog.ModalityType.DOCUMENT_MODAL);
		setTitle("Lista de Encargados");
		
		getContentPane().setLayout(null);
		
		/*este es un componente que nos permite dibujar una tabla
		 *de forma que en cada fila/columna de la tabla podamos poner el dato que queramos */
		
		mytabla=new JTable();
		mytabla.setModel(myModelo);
		mytabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
		myModelo=new MtEncargado();
		mytabla=new JTable();
		mytabla.setModel(myModelo);
		scrollPane.setViewportView(mytabla);
		
		/*el scrollpane sirve para mostrar un componente cuyo tamaño puede cambiar dinamicamente*/
		
	    scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 54, 460, 195);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(mytabla);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(21, 23, 128, 20);
		getContentPane().add(txtBuscar);
		txtBuscar.setColumns(10);
		
		btnBuscar = new BotonBuscar();
		btnBuscar.setBounds(148, 22, 85, 23);
		getContentPane().add(btnBuscar);
		
		btnEliminar = new BotonEliminar();
		btnEliminar.setText("Eliminar");
		btnEliminar.setBounds(384, 20, 97, 23);
		getContentPane().add(btnEliminar);
		
		btnAgregar = new BotonAgregar();
		btnAgregar.setText("Agregar");
		btnAgregar.setBounds(264, 20, 97, 23);
		getContentPane().add(btnAgregar);
		
	}
	
	public JTable getMyTabla(){
		return mytabla;
	}
	
	public MtEncargado getMyModelo(){
		return myModelo;
	}
	
	public void ConectarControlador(CtrlListaEncargados c){
		
		
	}
}
