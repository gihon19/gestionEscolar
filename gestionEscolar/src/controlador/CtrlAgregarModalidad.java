package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.ViewAgregarModalidad;
import modelo.Modalidad;
import modelo.connBD.ModalidadDao;

public class CtrlAgregarModalidad implements ActionListener {
	
	private Modalidad myModalidad;
	private ViewAgregarModalidad view;
	private ModalidadDao myDao;
	
	public CtrlAgregarModalidad(ViewAgregarModalidad v)
	{
		view= v;
		myModalidad= new Modalidad();
		
	}
	
	private void Guardar(){
		String Modalidad= view.getTxtIdModalidad().getText();
		myModalidad.setCodigoModalidad(Modalidad);
		String Nombre= view.getTxtNombre().getText();
		myModalidad.setNombre(Nombre);
		
		ModalidadDao myDao=new ModalidadDao();
		boolean resultado= myDao.registrar(myModalidad);
		
		if (resultado==true){
			JOptionPane.showMessageDialog(view, "se guardo");
		}
		else{
			JOptionPane.showMessageDialog(null, "No se guardo");
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