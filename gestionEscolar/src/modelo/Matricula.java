package modelo;

public class Matricula {
	
	private Seccion Seccion;
	private Alumnos Alumno;
	private String Anio;

	public Matricula(){
		
	}
	
	public void setSeccion(Seccion sec){
		Seccion=sec;
	}
	public Seccion getSeccion (){
		return Seccion;
	}
	
	public void setAlumno(Alumnos alum){
		Alumno=alum;
	}
	public Alumnos getAlumno (){
		return Alumno;
	}
	
	public void setAnio(String an){
		Anio=an;
	}
	public String getAnio(){
		return Anio;
		
	}
	public String toString(){
		return "Seccion: "+Seccion+", Alumno: "+Alumno+", Anio: "+Anio;
	}
}
