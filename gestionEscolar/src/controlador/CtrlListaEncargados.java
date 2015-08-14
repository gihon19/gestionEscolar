package controlador;

import modelo.EncargadosPadres;
import modelo.connBD.EncargadoDao;
import view.ViewEncargados;

public class CtrlListaEncargados {
	
	
	public ViewEncargados vista;
	private EncargadosPadres encargadoSeleccionado;
	private int filaSeleccionada;
	
	
    public CtrlListaEncargados (ViewEncargados v){
		
		vista=v;
		vista.ConectarControlador(this);
		
		
		
	}

}
