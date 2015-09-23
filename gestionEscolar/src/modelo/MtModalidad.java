package modelo;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class MtModalidad extends AbstractTableModel {
	private String []columnNames={"CodigoModalidad","Descripcion"};
	private List<Modalidad> modalidades = new ArrayList<Modalidad>();

	
	@Override
	public String getColumnName(int indice) {
		// TODO Auto-generated method stub
		return columnNames[indice];
	}
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return modalidades.size();
	}

	@Override
	public Object getValueAt(int filas, int columna) {
		switch(filas){
		case 0:
			return null; 
		case 1:
			return  null;
		default :
			return null;
		}

	}


	public void limpiarTabla() {
		
		modalidades.clear();
		
		fireTableDataChanged();
	}


	public void AgregarModalidad(Modalidad a) {
		modalidades.add(a);
		
		fireTableDataChanged();
		
	}



	
}
	
