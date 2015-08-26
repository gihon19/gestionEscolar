package view;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.MtAsignatura;


public class ViewAsignatura extends JFrame {
	

	private MtAsignatura modelo;
	private JTable table;
	private JScrollPane scrollPane;
   

	public ViewAsignatura(){
		
		getContentPane().setLayout(null);
			
		 scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 434, 308);
		getContentPane().add(scrollPane);
		
		
		modelo=new MtAsignatura();
		table = new JTable();
		table.setModel(modelo);
		scrollPane.setViewportView(table);
		
	}
		public MtAsignatura getModelo(){
		
			return modelo;
			
		}
	
		
	
}


