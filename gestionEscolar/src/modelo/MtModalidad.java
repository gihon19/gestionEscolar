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
		return 2;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
	
