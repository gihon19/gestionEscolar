package controlador;

import java.util.List;

import modelo.Alumno;
import modelo.connBD.AlumnoDao;
import view.ViewAlumnos;

public class CtrAlumnos {
private ViewAlumnos view;
private AlumnoDao myDao;


public  CtrAlumnos(ViewAlumnos v) {
	view=v;
	myDao=new AlumnoDao();
	cargarTabla(myDao.todos());
	
}
public void cargarTabla(List<Alumno> Alumnos){
	if(Alumnos!=null){
		view.getModelo().limpiarTabla();
		for(int x=0; x < Alumnos.size(); x++){
			view.getModelo().AgregarAlumnos(Alumnos.get(x));;
		}
		
	}
}
}
