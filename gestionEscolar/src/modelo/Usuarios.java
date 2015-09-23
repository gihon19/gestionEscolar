package modelo;

public class Usuarios {
	private String nombre;
    private String apellido;
    private int telefono;
    private String 	email;
    private String user;
    private String password;
    
    public Usuarios(){
	}
    
    
    public String  getnombre(){
		return nombre;
	}
	public void setnombre(String n){
		nombre=n;
	}
    
	public String  getapellido(){
		return apellido;
	}
	public void setapellido(String s){
		apellido=s;
	}
	
	public int  gettelefono(){
		return telefono;
	}
	public void settelefono(int t){
		telefono=t;
	}
	public String  getemail(){
		return apellido;
	}
	public void setemail(String e){
		email=e;
	}
}
