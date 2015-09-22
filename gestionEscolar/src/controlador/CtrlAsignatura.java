package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import view.ViewAgregarClase;
import view.ViewAgregarModalidad;
import view.ViewAsignatura;
import modelo.Asignatura;
import modelo.EncargadosPadres;
import modelo.connBD.AsignaturaDao;

public class CtrlAsignatura implements MouseListener,ActionListener{
	
	private ViewAsignatura view;
	private Asignatura myAsignatura;
	private AsignaturaDao myDao;
	private int filaSeleccionada;
	private Asignatura asignaturaSelecionado;
	
	
	public CtrlAsignatura(ViewAsignatura v){
		view=v;
		myAsignatura= new Asignatura();
		myDao = new AsignaturaDao();
		cargarTabla(myDao.todos());
	}

	public void cargarTabla(List<Asignatura> asignatura)
	{
		if(asignatura!=null){
			view.getModelo().limpiar();
			for(int x=0; x<asignatura.size(); x++)
			{
				view.getModelo().Agregar(asignatura.get(x));
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando=e.getActionCommand();
		
		switch(comando){
		
		case"AGREGAR":
			
			ViewAgregarClase menu=new ViewAgregarClase();
			CtrAgregarAsignatura menu1=new CtrAgregarAsignatura(menu);
			menu.setVisible(true);
			menu.setSize(430,300);
		   menu.conectarCtrl(menu1);
			
		break;
		
		case"ELIMINAR":
			
			boolean result=myDao.eliminarAsignatura(asignaturaSelecionado);
			
			if (result==true){
				
				view.getMyModelo().EliminarAsignatura(filaSeleccionada); 		
			}
			
		
		break;
		
		case"BUSCAR":
			
		
		
		break;
		
		
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		filaSeleccionada=view.getMyTabla().getSelectedRow();
		
		asignaturaSelecionado=view.getMyModelo().getAsignatura(filaSeleccionada);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
	
	}
}
