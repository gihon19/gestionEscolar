package view;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import modelo.MtAlumno;

public class ViewAlumnos extends JFrame {
	
	private JScrollPane scrollPane;
	private JTable table;
	private MtAlumno mymodelo;
	
	public ViewAlumnos(){
		getContentPane().setLayout(null);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 44, 464, 270);
		getContentPane().add(scrollPane);
		
		mymodelo=new MtAlumno();
		table = new JTable();
		table.setModel(mymodelo);
		scrollPane.setViewportView(table);
		
		
	
		
	}
	

	}

