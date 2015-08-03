package modelo;

public class Alumnos {
	
	private int rne;
	private String nombre;
	private String apellido;
	private String Sexo;
	private String correo;
	private String edad;
	
	Alumnos(){
		}
	public void setRne(int r){
		rne=r;
	}
	public int getRne(){
		return rne;
	}
	public void setNombre(String n){
		nombre=n;
	}
	public String getNombre(){
		return nombre;
	}
	public void setApellido(String ape){
		apellido=ape;
	}
	public String  getApellido(){
		return apellido;
	}
	
	public void setSexo(String sex){
		Sexo=sex;
	}
	public String  getSexo(){
		return Sexo;
	}
	public void setCorreo(String corr){
		correo=corr;
	}
	public String  getCorreo(){
		return correo;
	}
	public void setEdad(String ed){
		edad=ed;
	}
	public String  getEdad(){
		return edad;
	}
		
	public String toString(){
		return "rne: "+rne+", Nombre: "+nombre+", Apellido: "+apellido+", Sexo: "+Sexo+", Correo: "+correo+", edad: "+edad;
				
	}
}
