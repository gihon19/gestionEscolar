package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Alumno;
import modelo.EncargadosPadres;
import modelo.connBD.AlumnoDao;
import modelo.connBD.EncargadoDao;
import view.ViewAgregarAlumnos;
import view.ViewEncargadoResponsable;



public class CtrlAgregarAlumnos implements ActionListener {
	private ViewAgregarAlumnos view;
	  private Alumno myalumno;
	
	public CtrlAgregarAlumnos(ViewAgregarAlumnos v){	
		view=v;
		myalumno = new Alumno();	
		
	}

	public void Guardar(){
  String RNE= view.gettxtRNE().getText();
  myalumno.setRne(RNE);
  String Nombre=view.gettxtNombre().getText();
  myalumno.setNombre(Nombre);
  String Apellido= view.gettxtApellido().getText();
  myalumno.setApellido(Apellido);
  String Fecha= view.gettxtFecha().getText();
  myalumno.setFechaNac(Fecha);
  String Telefono= view.gettxtTelefono().getText();
  myalumno.setTelefono(Telefono);
  
  String Correo= view.gettxtCorreo().getText();
  myalumno.setCorreo(Correo);
  String Nacionalidad= view.gettxtNacionalidad().getText();
  Integer na2=Integer.parseInt(Nacionalidad);
  myalumno.setCodigoNacionalidad(na2);
  
  AlumnoDao myDao= new AlumnoDao();
  boolean resultado= myDao.registrar(myalumno);
  if (resultado==true){
		JOptionPane.showMessageDialog(null, "Se Guardo ");
		
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
