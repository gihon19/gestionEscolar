package modelo;

public class Seccion {
	
	private int ID_Seccion;
	private String jornada;
	private String curso;
	private String grupo;
	
	Seccion(){
		
	}
	
	public void setID_Seccion(int id){
		ID_Seccion=id;
	}
	public int getID_Seccion(){
		return ID_Seccion;
	}
	public void setJornada(String jor){
		jornada=jor;
	}
	public String getJornada(){
		return jornada;
	}
	public void setCurso(String cur){
		curso=cur;
	}
	public String getCurso(){
		return curso;
	}
	public void setGrupo(String gru){
		grupo=gru;
	}
	
	public String toString(){
		return "ID_Seccion: "+ID_Seccion+", jornada: "+jornada+", curso: "+curso+", grupo: "+grupo;
	}
	
}
