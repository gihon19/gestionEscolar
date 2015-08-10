package view.botones;

import java.awt.Image;

import javax.swing.ImageIcon;

public class BotonBuscar1  extends BotonesApp {
	
private ImageIcon imgGuardar;
	
	
BotonBuscar1(){
		super("F1 Buscar");
		
		imgGuardar=new ImageIcon(BotonCancelar.class.getResource("/view/recursos/buscar.png"));
		
		 Image image = imgGuardar.getImage();
		    // reduce by 50%
		 image = image.getScaledInstance(image.getWidth(null)/4, image.getHeight(null)/4, Image.SCALE_SMOOTH);
		 imgGuardar.setImage(image);
	
		this.setIcon(imgGuardar);
			
		
	}
	

}
