package modelo;

public class Nacionalidad {
	
	private  int idAsignatura;
	private String descripcion;

	Nacionalidad(){
		
	}
	
	public void setIdAsignatura(int ida){
		idAsignatura=ida;
	}
	
	public int getIdAsignatura(){
		return idAsignatura;
	}
	public void setDescripcion(String des){
		descripcion=des;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public String toString(){
		return  "Id Asigantura:"+idAsignatura+", Descripcion:"+descripcion;
}
}
