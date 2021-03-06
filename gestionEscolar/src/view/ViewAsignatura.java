package view;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import modelo.MtAsignatura;
import modelo.MtEncargado;

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
	//private JTable mytabla;
	//private MtAsignatura myModelo;
	
	public ViewAsignatura(){
		
		getContentPane().setLayout(null);
		
		setTitle("Lista De Asignatura");
		
		/*myModelo=new MtAsignatura();
		mytabla=new JTable();
		mytabla.setModel(myModelo);*/
			
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
		
		public JTable getMyTabla(){
			return table;
		}
		
		
		
	public void conectarControlador(CtrlAsignatura c){
		
		table.addMouseListener(c);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//this.modelo
		btnBuscar.addActionListener(c);	
		textField.setActionCommand("BUSCAR");
		
		textField.addMouseListener(c);
		//btnBuscar.addMouseListener(c);
		
		btnEliminar.addActionListener(c);
		btnEliminar.setActionCommand("ELIMINAR");
		
		btnAgregar.addActionListener(c);
		btnAgregar.setActionCommand("AGREGAR");
		
	}
}


