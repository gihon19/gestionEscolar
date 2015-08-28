package view;

import java.util.List;

import modelo.EncargadosPadres;
import controlador.CtrlAgregarEncargados;
import controlador.CtrlListaEncargados;

public class PruebaEncargados {
	public static void main(String []Args){
		
		/*ViewEncargadoResponsable myview= new ViewEncargadoResponsable();
		CtrlAgregarEncargados myControlador= new CtrlAgregarEncargados(myview);
		myview.conectarControlador(myControlador); 
		myview.setVisible(true);*/
		
	
		ViewEncargados myventana =new ViewEncargados();
		CtrlListaEncargados myCtrl= new CtrlListaEncargados(myventana); 
		myventana.setVisible(true);
		myventana.ConectarControlador(myCtrl); 
	}

}
							