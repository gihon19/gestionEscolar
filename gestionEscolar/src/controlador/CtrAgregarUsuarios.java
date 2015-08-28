package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Usuario;
import modelo.connBD.UsuarioDao;
import view.ViewAgregarClase;

public class CtrAgregarUsuarios  {
	
	private ViewAgregarClase view;
	private Asignatura myAsignatura;
	private AsignaturaDao myDao;
	
	public CtrAgregarAsignatura(ViewAgregarClase v)
	{
		view=v;
		myAsignatura= new Asignatura();
		myDao = new AsignaturaDao();
	}
	
	private void Guardar(){
		
		String Idclase= view.getTxtIdClase().getText();
		myAsignatura.setIdAsignatura(Idclase);
		String Descripcion= view.getTxtDescripcion().getText();
		myAsignatura.setDescripcion(Descripcion);
		
		AsignaturaDao myDao=new AsignaturaDao();
		boolean resultado= myDao.registrar(myAsignatura);
		
		if (resultado==true){
			JOptionPane.showMessageDialog(view, "Se Guardo ");
		}	
		
		else{
			JOptionPane.showMessageDialog(null, "No se Guardo"); 
	}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando= e.getActionCommand();
		
		switch(comando){
		
		case "GUARDAR": 
			
			    Guardar();
			    
		break;
		
		case "CANCELAR":
			
			 System.exit(0); 
			 
		break;
		}
		
	}



	

}
