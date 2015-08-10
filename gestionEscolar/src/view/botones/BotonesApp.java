package view.botones;

import java.awt.Dimension;

import javax.swing.JButton;

public class BotonesApp extends JButton {
	private static final int ancho=128;
	private static final int alto=45;
	Dimension dimencion =new Dimension();
	
	public BotonesApp(){
		
		
		dimencion.setSize(ancho, alto);
		this.setSize(ancho, alto);
		this.setPreferredSize(dimencion);
		
	}
	public BotonesApp(String titulo){
		super(titulo);
		this.setSize(ancho, alto);
		dimencion.setSize(ancho, alto);
		
	}
	

}
