package modelo;
import javax.swing.JFrame;


public class EncargadosPadres {
	private String rnp;
	private String nombre;
	private String apellido;
	private String direccion;
	private String  telefono;
	
	public EncargadosPadres(){
		
	}
	
	public void setRnp(String RNP){
		rnp=RNP;
	}
	
	public String getRnp(){
		return rnp;
	}
	
	public void setNombre(String N){
		nombre=N;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setApellido(String A){
		apellido=A;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public void setDireccion(String D){
		direccion=D;
	}
	
	public String getDireccion(){
		return direccion;
	}
	
	public void setTelefono(String T){
		telefono=T;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	public String toString(){
		return  "RNP:"+rnp+", Nombre:"+nombre+" , Apellido:"+apellido+" ,Direccion:"+direccion+" ,Telefono: "+telefono;
		}
}
