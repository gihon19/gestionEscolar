package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import modelo.MtEncargado;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ViewEncargados extends JFrame {
	
	private JTable mytabla;
	private JScrollPane scrollPane;
	private MtEncargado mymodelo;
	
	ViewEncargados(){
		getContentPane().setLayout(null);
		
		mytabla=new JTable();
		mytabla.setModel(mymodelo);
		mytabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		mymodelo=new MtEncargado();
		mytabla=new JTable();
		mytabla.setModel(mymodelo);
		scrollPane.setViewportView(mytabla);
		
	    scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 55, 361, 195);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(mytabla);
		
			}
}
