package modelo;

public class Modalidad {
  private int codigoModalidad;
  private String nombre;
  
  
   public Modalidad(){
   }
   
	public void setCodigoModalidad(int c){
		codigoModalidad=c;
	}
	
	public int getCodigoModalidad(){
		return codigoModalidad;
	}
	
	public void setNombre(String N){
		nombre=N;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String toString(){
		return "Codigo de Modalidad: "+codigoModalidad+", nombre: "+nombre;
		
	}
}
