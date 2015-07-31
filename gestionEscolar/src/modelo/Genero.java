package modelo;

public class Genero {

	private int id_Genero;
	private String descripcion;

	Genero(){
	}
		public void setID_genero(int ID){
			id_Genero=ID;
		}
		
		public int getID_genero(){
			return id_Genero; 
		}
		
		public void setDescripcion(String D){
			descripcion=D;
		}
			
		public String getDescripcion(){
		return descripcion;	
		
	}
		
		public String toString(){
			return "ID Genero: "+id_Genero+", Descripcion: "+descripcion;
		
	}
}

