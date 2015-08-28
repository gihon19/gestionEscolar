package modelo;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import view.ViewEncargados;

public class MtEncargado extends AbstractTableModel {
	
	/*esto sirve para poner los titulos de la tabla*/
	private String []TituloTabla={"Codigo","Nombre","Apellido", "Telefono", "Direccion"};
	private List<EncargadosPadres> Encargados= new ArrayList<EncargadosPadres>();

	
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
		return Encargados.size();
	}

	@Override
	public Object getValueAt(int fila, int columna) {
		// TODO Auto-generated method stub
		switch(columna){
		case 0:
			return Encargados.get(fila).getRnp();
			
		case 1:
			return Encargados.get(fila).getNombre();
			
		case 2:
			return Encargados.get(fila).getApellido();
			
		case 3:
			return Encargados.get(fila).getTelefono();
			
		case 4:
			return Encargados.get(fila).getDireccion();
					
			default:
				return null;
		}
	}
	
	
	
	public void Limpiar(){
		
		Encargados.clear();
		
		fireTableDataChanged();
	}
	
    public void EliminarEncargados(int fila){
		
		Encargados.remove(fila);
		
		this.fireTableDataChanged();
		
	}
	
	public void Agregar(EncargadosPadres e)
	
	{
		Encargados.add(e);
		
		fireTableDataChanged();
	}
	
	public EncargadosPadres getEncargados(int fila){
		return Encargados.get(fila);
	}

}
