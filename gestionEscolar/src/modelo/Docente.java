package modelo;
public class Docente {
	
	private String rnp;
	private String nombre;
	private String apellido;
	private int telefono;
	private String correo ;
	private String direccion;
	private String pasword;
	
	Docente(){
	}
	
	public void setRne(String RNP){
		rnp=RNP;
	}
	
	public String getRne(){
		return rnp;
	}
	
	public void setNombre(String N){
		nombre= N;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setApellido(String ap){
		apellido=ap;
	}
	
	public String getApellido(){
		return apellido;
	}
	public void setTelefono(int tel){
		telefono=tel;
	}
	
	public int getTelefono(){
		return telefono;
	}
	public void setCorreo(String co){
		correo=co;
	}
	
	public String getCorreo(){
		return correo;
	}
	public void setDireccion(String di){
direccion=di;
	}
	
	public String getDireccion(){
		return direccion;
	}
	public void setPasword(String pas){
		pasword=pas;
	}
	
	public String getPasword(){
		return pasword;
	}
	
	
	
	
	
	public String toString(){
		return  "RNp:"+rnp+", Nombre:"+nombre+" , Apellido: "+apellido+",Telefono:"+telefono+", Correo:"+correo+", Direccion:"+direccion+", Contraseña:"+pasword;
		}

}
