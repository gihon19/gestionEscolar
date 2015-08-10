package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import view.ViewEncargados;

public class MtEncargado extends AbstractTableModel {
	
	/*esto sirve para poner los titulos de la tabla*/
	private String []TituloTabla={"Codigo","Nombre","Apellido", "Telefono", "Direccion"};
	private List<ViewEncargados> Encargados= new ArrayList<ViewEncargados>();

	
	@Override
	public String getColumnName(int indice) {
		// TODO Auto-generated method stub
		return TituloTabla[indice];
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return TituloTabla.length;
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
