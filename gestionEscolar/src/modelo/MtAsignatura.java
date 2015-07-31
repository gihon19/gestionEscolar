package modelo;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import view.ViewAsignatura;
 

public class MtAsignatura extends AbstractTableModel {
	
	private static final String[] TitulosTabla={"Codigo Asignatura","Descripcion"};
	private List<ViewAsignatura> asignatura = new ArrayList<ViewAsignatura>();

	
	  @Override
	    public String getColumnName(int indice) {
	        return TitulosTabla[indice];
	    }
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return TitulosTabla.length;
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
	

