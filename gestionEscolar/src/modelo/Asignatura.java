package modelo;

public class Asignatura {
	private int idAsignatura;
	private String descripcion;
	private int tipo;
	

	Asignatura(){
		
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
