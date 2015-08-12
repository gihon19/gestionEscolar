package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.EncargadosPadres;
import modelo.connBD.EncargadoDao;
import view.ViewEncargadoResponsable;

public class CtrlAgregarEncargados implements ActionListener {
	
	 private ViewEncargadoResponsable view;
	  private EncargadosPadres myEncargado;
	
	    
	public CtrlAgregarEncargados(ViewEncargadoResponsable v){	
		view=v;
		myEncargado = new EncargadosPadres();	
		
	}
	
	
	public void Guardar(){
		String rnp= view.gettxtNoIdentidad().getText();
		myEncargado.setRnp(rnp); 
		String nombre= view.gettxtNombre().getText();
		myEncargado.setNombre(nombre); 
		String apellido= view.gettxtApellido().getText();
		myEncargado.setApellido(apellido);
		String telefono= view.gettxtTelefono().getText();
		myEncargado.setTelefono(telefono);
		String direccion=view.gettxtDireccion().getText();
		myEncargado.setDireccion(direccion); 
		
		//EncargadoDao myDao= new EncargadoDao();
		//myDao.registrarArticulo(myEncargado);
	}
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando= e.getActionCommand();
		
		switch(comando){
		
		case "GUARDAR": 
			JOptionPane.showMessageDialog(null, "Se Guardo Correctamente");
		break;
		
		case "CANCELAR":
			JOptionPane.showMessageDialog(null, "Se Cancelo"); 
		break;
		}
	}
	

}
