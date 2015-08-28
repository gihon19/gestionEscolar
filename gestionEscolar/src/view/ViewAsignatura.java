package view;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.MtAsignatura;

import javax.swing.JButton;

import view.botones.BotonAgregar;
import view.botones.BotonBuscar;
import view.botones.BotonEliminar;

import javax.swing.JTextField;

import controlador.CtrlAsignatura;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ViewAsignatura extends JFrame {
	

	private MtAsignatura modelo;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JTextField textField;
	private JButton btnBuscar;
	
	public ViewAsignatura(){
		
		getContentPane().setLayout(null);
			
		 scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 72, 641, 308);
		getContentPane().add(scrollPane);
		
		
		modelo=new MtAsignatura();
		table = new JTable();
		table.setModel(modelo);
		scrollPane.setViewportView(table);
		
		btnAgregar = new BotonAgregar();
		btnAgregar.setSize(106, 33);
		btnAgregar.setText("Agregar");
		btnAgregar.setLocation(421, 16);
		getContentPane().add(btnAgregar);
		
		btnEliminar =new BotonEliminar();
		btnEliminar.setSize(113, 33);
		btnEliminar.setText("Eliminar");
		btnEliminar.setLocation(552, 16);
		getContentPane().add(btnEliminar);
		
		textField = new JTextField();
		textField.setBounds(10, 22, 200, 27);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnBuscar = new BotonBuscar();
		btnBuscar.setSize(100, 33);
		btnBuscar.setLocation(220, 17);
		getContentPane().add(btnBuscar);
		
	}
		public MtAsignatura getModelo(){
		
			return modelo;
			
		}
	public void conectarControlador(CtrlAsignatura c){
		btnBuscar.addActionListener(c);	
		btnBuscar.setActionCommand("BUSCAR");
		btnEliminar.addActionListener(c);
		btnEliminar.setActionCommand("ELIMINAR");
		btnAgregar.addActionListener(c);
		btnAgregar.setActionCommand("AGREGAR");
		
	}
}


