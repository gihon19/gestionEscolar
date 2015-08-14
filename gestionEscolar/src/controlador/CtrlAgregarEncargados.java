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
		
		String nombre= view.gettxtNombre().getText();
		myEncargado.setNombre(nombre); 
		String apellido= view.gettxtApellido().getText();
		myEncargado.setApellido(apellido);
		String telefono= view.gettxtTelefono().getText();
		myEncargado.setTelefono(telefono);
		String direccion=view.gettxtDireccion().getText();
		myEncargado.setDireccion(direccion); 
		String rnp= view.gettxtNoIdentidad().getText();
		myEncargado.setRnp(rnp); 
		
		EncargadoDao myDao= new EncargadoDao();
		boolean resultado= myDao.registrar(myEncargado);
		
		if (resultado==true){
			JOptionPane.showMessageDialog(view, "Se Guardo ");
			
			view.gettxtNoIdentidad().setText("");
			view.gettxtNombre().setText("");
			view.gettxtApellido().setText("");
			view.gettxtTelefono().setText(""); 
			view.gettxtDireccion().setText(""); 
		}
		
		else{
				JOptionPane.showMessageDialog(null, "No se Guardo"); 
		}
		
	}
	
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
