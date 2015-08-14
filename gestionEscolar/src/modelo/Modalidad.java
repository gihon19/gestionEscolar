package modelo;

public class Modalidad {
  private String codigoModalidad;
  private String nombre;
  
  
   public Modalidad(){
   }
   
	public void setCodigoModalidad(String c){
		codigoModalidad=c;
	}
	
	public String getCodigoModalidad(){
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
