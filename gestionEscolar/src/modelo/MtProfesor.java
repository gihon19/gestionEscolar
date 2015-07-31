package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import view.ViewProfesores;


public class MtProfesor extends AbstractTableModel {
	private String []TituloTabla={"RNE","Nombres","Apellido","Edad","Telefono","Correo"};
	private List<ViewProfesores> profesores = new ArrayList<ViewProfesores>();
	
	
	@Override
	public String getColumnName( int Indice) {
		// TODO Auto-generated method stub
		return TituloTabla[Indice];
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 6;
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
		
	}
	@Override
	public Object getValueAt(int fila, int columna) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
}
