package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.EncargadosPadres;
import modelo.connBD.EncargadoDao;
import view.ViewEncargadoResponsable;
import view.ViewEncargados;

public class CtrlListaEncargados implements MouseListener,ActionListener{
	
	private ViewEncargados view;
	private EncargadoDao myDao;
	private int filaSeleccionada;
	private EncargadosPadres empleadoSelecionado;
	
    public CtrlListaEncargados (ViewEncargados v){
		
		view=v;
		myDao=new EncargadoDao();
		cargarTabla(myDao.todos());
			
	}
    
    public void cargarTabla(List<EncargadosPadres> encargados)
    {
    	if(encargados !=null)
    	{
    		view.getMyModelo().Limpiar(); 
    		for (int x=0; x <encargados.size(); x++){
    			view.getMyModelo().Agregar(encargados.get(x)); 
    		}
    	}
    }


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		 filaSeleccionada=view.getMyTabla().getSelectedRow();
			
		 empleadoSelecionado=view.getMyModelo().getEncargados(filaSeleccionada);
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
	
	
   
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando= e.getActionCommand();
		
		switch(comando){
		
		case "AGREGAR":
			ViewEncargadoResponsable myview= new ViewEncargadoResponsable();
			CtrlAgregarEncargados myControlador= new CtrlAgregarEncargados(myview);
			myview.conectarControlador(myControlador); 
			myview.setVisible(true);
			
			
			break;
			
		case "ELIMINAR":
             boolean result=myDao.eliminarEncargados(empleadoSelecionado);
			
			if (result==true){
				
				view.getMyModelo().EliminarEncargados(filaSeleccionada); 		
			}
			break;
		
		case "BUSCAR":
			
			String rnp=view.getTxtBuscar().getText();
			cargarTabla(myDao.buscarEncargados(rnp));
			
			
			break;
		
		}
		
	}

	
}



