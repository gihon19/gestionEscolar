package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import modelo.MtModalidad;

public class ViewModalidad extends JFrame {
	private JTable table;
	private JScrollPane scrollPane;
	private MtModalidad myModelo;


	   ViewModalidad(){
		   getContentPane().setLayout(null);
    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(73, 45, 266, 153);
	    getContentPane().add(scrollPane);
	  
	    myModelo=new MtModalidad();
	    table = new JTable();
		table.setModel(myModelo);
		scrollPane.setViewportView(table);
		
		
		
		
	}
}
