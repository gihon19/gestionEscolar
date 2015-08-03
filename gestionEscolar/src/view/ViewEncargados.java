package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class ViewEncargados extends JFrame {
	
	private JTable mytabla;
	private JScrollPane scrollpane;
	
	ViewEncargados(){
		getContentPane().setLayout(null);
		
		mytabla=new JTable();
		mytabla.setModel(mymodelo);
		mytabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		mymodelo=new 
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 55, 361, 195);
		getContentPane().add(scrollPane);
	}
}
