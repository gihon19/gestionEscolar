package modelo;

public class Asignatura {
	private String idAsignatura1;
	private String descripcion1;
	private int tipo;      
	

	public Asignatura(){
		
	}
	
	public void setIdAsignatura(String ida){
		idAsignatura1=ida;
	}
	
	public String getIdAsignatura(){
		return idAsignatura1;
	}
	
	public void setDescripcion(String des){
		descripcion1=des;
	}
	
	public String getDescripcion(){
		return descripcion1;
	}
	
	public void setTipo(int ti){
		tipo=ti;
	}
	
	public int getTipo(){
		return tipo;
	}
	
	public String toString(){
		return  "idAsignatura:"+idAsignatura1+", Descripcion:"+descripcion1+" ,Tipo: "+tipo;
		}

	public static void remove(int fila) {
		// TODO Auto-generated method stub
		
	}

	public static Asignatura get(int fila) {
		// TODO Auto-generated method stub
		return null;
	}


}
