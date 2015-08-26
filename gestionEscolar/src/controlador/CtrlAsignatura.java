package controlador;

import java.util.List;

import view.ViewAsignatura;
import modelo.Asignatura;
import modelo.connBD.AsignaturaDao;

public class CtrlAsignatura {
	
	private ViewAsignatura view;
	private Asignatura myAsignatura;
	private AsignaturaDao myDao;
	
	
	
	public CtrlAsignatura(ViewAsignatura v){
		view=v;
		myAsignatura= new Asignatura();
		myDao = new AsignaturaDao();
		cargarTabla(myDao.todos());
	}

	public void cargarTabla(List<Asignatura> asignatura)
	{
		if(asignatura!=null)
		{
			view.getModelo().limpiar();
			for(int x=0; x<asignatura.size(); x++)
			{
				view.getModelo().Agregar(asignatura.get(x));
			}
		}
		
	}
}
