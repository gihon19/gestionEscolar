package view.botones;

import java.awt.Image;

import javax.swing.ImageIcon;

public class BotonImprimirSmall extends BotonesApp  {
	private ImageIcon imgGuardar;
	
	
	
	public BotonImprimirSmall(){
		//super("F3 Cobrar");
		
		imgGuardar=new ImageIcon(BotonCancelar.class.getResource("/view/recursos/imprimir2.png"));
		
		 Image image = imgGuardar.getImage();
		    // reduce by 50%
		 image = image.getScaledInstance(image.getWidth(null)/6, image.getHeight(null)/6, Image.SCALE_SMOOTH);
		 imgGuardar.setImage(image);
	
		this.setIcon(imgGuardar);
	}
	

}
