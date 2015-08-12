package modelo;

public class Alumno {
	
	private String rne;
	private String nombre;
	private String apellido;
	private String Sexo;
	private String correo;
	private String edad;
	private String fechaNac;
	private String telefono;
	private int codigoNacionalidad;
	
	Alumno(){
		}
	
	
	public int getCodigoNacionalidad(){
		return codigoNacionalidad;
	}
	public void setCodigoNacionalidad(int c){
		codigoNacionalidad=c;
	}
	public void setRne(String r){
		rne=r;
	}
	public String getRne(){
		return rne;
	}
	public void setNombre(String n){
		nombre=n;
	}
	public String getNombre(){
		return nombre;
	}
	
	
	
	public void setFechaNac(String n){
		fechaNac=n;
	}
	public String getFechaNac(){
		return fechaNac;
	}
	
	
	public void setTelefono(String t){
		telefono=t;
	}
	public String getTelefono(){
		return telefono;
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
