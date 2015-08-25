package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import view.ViewAlumnos;

public class MtAlumno extends AbstractTableModel {
	private String []TitulosTabla={"RNE","Nombre","Apellido","Edad","Seccion","Correo"};
	private List<ViewAlumnos> Alumnos = new ArrayList<ViewAlumnos>();
	
	@Override
	public String getColumnName(int indice) {
		// TODO Auto-generated method stub
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
	public Object getValueAt(int Fila, int Columna) {
		return null;
	}
}


