package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class ViewProfesores extends JFrame {
	private JTable mytabla;
	private JScrollPane scrollPane;
	private MtProfesor mymodelo;
	
	
	ViewProfesores(){
		
		getContentPane().setLayout(null);
		
		mytabla=new JTable();
		mytabla.setModel(mymodelo); 
		mytabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		mymodelo=new MtProfesor();
		mytabla=new JTable();
		mytabla.setModel(mymodelo);
		scrollPane.setViewportView(mytabla);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 117, 503, 167);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(mytabla);
		
	}


}
