package view;

import controlador.CtrlAgregarEncargados;

public class PruebaEncargados {
	public static void main(String []Args){
		
		ViewEncargadoResponsable myview= new ViewEncargadoResponsable();
		CtrlAgregarEncargados myControlador= new CtrlAgregarEncargados(myview);
		myview.conectarControlador(myControlador); 
		myview.setVisible(true);
	}

}
