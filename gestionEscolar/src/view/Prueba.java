package view;

import controlador.CtrlAgregarModalidad;

public class Prueba {
	
	
	public static void main(String[] args){
		
		ViewAgregarModalidad menu=new ViewAgregarModalidad();
		CtrlAgregarModalidad menu1=new CtrlAgregarModalidad();
		menu.setVisible(true);
		menu.setSize(430,300);
	   menu.conectarCtrl(menu1);
	   
	   
	}
}
