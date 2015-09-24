
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import controlador.CtrlAgregarModalidad;
import modelo.Alumno;
import modelo.Modalidad;
import modelo.connBD.AlumnoDao;
import modelo.connBD.ModalidadDao;
import view.ViewAgregarAlumnos;
import view.ViewAgregarModalidad;
import view.ViewAlumnos;
import view.ViewModalidad;

public class CtrlListaModalidad  implements ActionListener {
	
private ViewModalidad view;
private ModalidadDao myDao;


public  CtrlListaModalidad(ViewModalidad v) {
	view=v;
	myDao=new ModalidadDao();
	cargarTabla(myDao.todos());
	
}
public void cargarTabla(List<Modalidad> Modalidades){
	if(Modalidades!=null){
		view.getModelo().limpiarTabla();
		for(int x=0; x < Modalidades.size(); x++){
			view.getModelo().AgregarModalidad(Modalidades.get(x));;
		}
		
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String comando= e.getActionCommand();
	
	switch(comando){
	
	case "AGREGAR": 
		
		ViewAgregarModalidad menu=new ViewAgregarModalidad();
		CtrlAgregarModalidad menu1=new CtrlAgregarModalidad(menu);
		menu.setVisible(true);
		menu.setSize(430,300);
	   menu.conectarCtrl(menu1);
	
		    
	break;
	
	case "ELIMINAR":
		
		
		 
	break;
	case "BUSCAR":
		
		
		 
		break;
	case "SALIR":
	System.exit(0);
	
	break;
	}
	}
}



