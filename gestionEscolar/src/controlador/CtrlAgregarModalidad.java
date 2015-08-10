package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Modalidad;

public class CtrlAgregarModalidad implements ActionListener {
	
	private Modalidad myModalidad;
	
	public CtrlAgregarModalidad(){
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String comando= e.getActionCommand();
		switch(comando){
		case "GUARDAR": JOptionPane.showMessageDialog(null, "Se ha guardado");
			break;
			
			
		case "CANCELAR": JOptionPane.showMessageDialog(null, "se ha cancelado");
			break;
		}
		
		
	}

}
