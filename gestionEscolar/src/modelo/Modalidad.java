package modelo;

public class Modalidad {
  private int codigo_modalidad;
  private String nombre;
  
  
   Modalidad(){
   }
   
	public void setCodigo_Modalidad(int C){
		codigo_modalidad=C;
	}
	
	public int getCodigo_Modalidad(){
		return codigo_modalidad;
	}
	
	public void setNombre(String N){
		nombre=N;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String toString(){
		return "Codigo de Modalidad: "+codigo_modalidad+", nombre: "+nombre;
		
	}
}
