package modelo;

public class Asignatura {
	private String idAsignatura;
	private String descripcion;
	private int tipo;
	

	public Asignatura(){
		
	}
	
	public void setIdAsignatura(String ida){
		idAsignatura=ida;
	}
	
	public String getIdAsignatura(){
		return idAsignatura;
	}
	
	public void setDescripcion(String des){
		descripcion=des;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setTipo(int ti){
		tipo=ti;
	}
	
	public int getTipo(){
		return tipo;
	}
	
	public String toString(){
		return  "idAsignatura:"+idAsignatura+", Descripcion:"+descripcion+" ,Tipo: "+tipo;
		}

}
