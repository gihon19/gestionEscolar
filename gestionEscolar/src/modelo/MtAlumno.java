package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import view.ViewAlumnos;

public class MtAlumno extends AbstractTableModel {
	private String []TitulosTabla={"RNE","Nombre","Apellido","Correo","Telefono","Sexo","Fecha Nacimiento","Nacionalidad"};
	private List<Alumno> Alumnos = new ArrayList<Alumno>();
	
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
		return Alumnos.size();
	}

	@Override
	public Object getValueAt(int Fila, int Columna) {
		switch(Columna){
		case 0:
			return  Alumnos.get(Fila).getRne();
		case 1:
			return  Alumnos.get(Fila).getNombre();
		case 2:
			return Alumnos.get(Fila).getApellido();
		case 3:
        return Alumnos.get(Fila).getCorreo();
		case 4:
			return Alumnos.get(Fila).getTelefono();
		case 5:
			return Alumnos.get(Fila).getSexo();
		case 6:
			return Alumnos.get(Fila).getFechaNac();
		case 7:
			return Alumnos.get(Fila).getCodigoNacionalidad();
			default :
				return null;
		}
	}
	public void limpiarTabla(){
		Alumnos.clear();
		
		fireTableDataChanged();
		
	}
public void AgregarAlumnos(Alumno a){
		
		Alumnos.add(a);
		
		fireTableDataChanged();
	}
}


