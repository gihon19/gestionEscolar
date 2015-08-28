package view;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import modelo.MtAlumno;

import javax.swing.JTextField;
import javax.swing.JButton;

import view.botones.BotonAgregar;
import view.botones.BotonBuscar;
import view.botones.BotonEliminar;

public class ViewAlumnos extends JFrame {
	
	private JScrollPane scrollPane;
	private JTable table;
	private MtAlumno mymodelo;
	private JTextField txtBuscar;
	private JButton btnEliminar ;
	private JButton btnAgregar ;
	private JButton btnBuscar;
	
	public ViewAlumnos(){
		setTitle("Tabla Alumnos");
		getContentPane().setLayout(null);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 100, 782, 363);
		getContentPane().add(scrollPane);
		
		mymodelo=new MtAlumno();
		table = new JTable();
		table.setModel(mymodelo);
		scrollPane.setViewportView(table);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(25, 23, 248, 20);
		getContentPane().add(txtBuscar);
		txtBuscar.setColumns(10);
		
	    btnBuscar = new BotonBuscar();
		btnBuscar.setBounds(283, 22, 98, 23);
		getContentPane().add(btnBuscar);
		
		btnAgregar = new BotonAgregar();
		btnAgregar.setBounds(592, 23, 89, 23);
		getContentPane().add(btnAgregar);
		
		btnEliminar = new BotonEliminar();
		btnEliminar.setBounds(691, 23, 89, 23);
		getContentPane().add(btnEliminar);
		
		
	
		
	}

	public MtAlumno getModelo() {
		return mymodelo;
	}
	}

