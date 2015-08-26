package modelo;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import view.ViewAsignatura;
 

public class MtAsignatura extends AbstractTableModel {
	
	private static final String[] TitulosTabla={"Codigo Asignatura","Descripcion"};
	private List<Asignatura> asignatura = new ArrayList<Asignatura>();

	
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
		return asignatura.size();
	}

	@Override
	public Object getValueAt(int fila, int columna) {
		// TODO Auto-generated method stub
		
		switch(columna){
		case 0:
			return asignatura.get(fila).getIdAsignatura();
		case 1:
			return asignatura.get(fila).getDescripcion();
		default:
			return null;
		}
 
		
	}
	
	public void limpiar(){
		asignatura.clear();
		fireTableDataChanged();
		
	}
	
	public void Agregar (Asignatura a)
	{
		asignatura.add(a);
		fireTableDataChanged();
		
	}
}
	
	

	

