package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import modelo.MtModalidad;

import javax.swing.JTextField;

import controlador.CtrlModalidad;
import view.botones.BotonAgregar;
import view.botones.BotonBuscar;
import view.botones.BotonBuscar1;
import view.botones.BotonEliminar;

public class ViewModalidad extends JFrame {
	private JTable table;
	private JScrollPane scrollPane;
	private MtModalidad myModelo;
	private JTextField textField;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JButton btnBuscar;

	   ViewModalidad(){
		   getContentPane().setLayout(null);
    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(52, 54, 460, 224);
	    getContentPane().add(scrollPane);
	  
	    myModelo=new MtModalidad();
	    table = new JTable();
		table.setModel(myModelo);
		scrollPane.setViewportView(table);
		
		btnAgregar = new BotonAgregar();
		btnAgregar.setSize(118, 37);
		btnAgregar.setText("Agregar");
		btnAgregar.setLocation(355, 8);
		getContentPane().add(btnAgregar);
		
	    btnEliminar = new BotonEliminar();
	    btnEliminar.setSize(118, 37);
	    btnEliminar.setText("Eliminar");
		btnEliminar.setLocation(483, 8);
		getContentPane().add(btnEliminar);
		
	    btnBuscar = new BotonBuscar();
	    btnBuscar.setSize(121, 37);
		btnBuscar.setLocation(229, 8);
		getContentPane().add(btnBuscar);
		
		textField = new JTextField();
		textField.setBounds(10, 12, 216, 31);
		getContentPane().add(textField);
		textField.setColumns(10);
		
	}
	   
	   public MtModalidad  getModelo(){
		   return myModelo;
	   }
	   
	   public void conectarControlador(CtrlModalidad c){
		   btnBuscar.addActionListener(c); 
		   btnBuscar.setActionCommand("BUSCAR");
		   btnEliminar.addActionListener(c);
		   btnEliminar.setActionCommand("ELIMINAR");
		   btnAgregar.addActionListener(c);
		   btnAgregar.setActionCommand("AGREGAR");
	   }
}
