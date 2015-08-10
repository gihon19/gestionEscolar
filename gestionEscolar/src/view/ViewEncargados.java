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

public class ViewEncargados extends JDialog {
	
	private JTable mytabla;
	private JScrollPane scrollPane;
	private MtEncargado mymodelo;
	
	ViewEncargados(Window v){
		/*esto sirve para escribir un titulo en la ventana*/
		super(v, "Encargados", Dialog.ModalityType.DOCUMENT_MODAL);
		
		getContentPane().setLayout(null);
		
		/*este es un componente que nos permite dibujar una tabla
		 *de forma que en cada fila/columna de la tabla podamos poner el dato que queramos */
		
		mytabla=new JTable();
		mytabla.setModel(mymodelo);
		mytabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
		mymodelo=new MtEncargado();
		mytabla=new JTable();
		mytabla.setModel(mymodelo);
		scrollPane.setViewportView(mytabla);
		
		/*el scrollpane sirve para mostrar un componente cuyo tamaño puede cambiar dinamicamente*/
		
	    scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 36, 361, 195);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(mytabla);
		
			}
}
