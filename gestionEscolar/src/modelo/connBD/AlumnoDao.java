package modelo.connBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Alumno;
import modelo.ConexionBD;
import modelo.EncargadosPadres;

public class AlumnoDao {
	
	ConexionBD conexion=new ConexionBD();
	private PreparedStatement insertarNuevo=null;
	private String idAlumnoRegistrado;
	private PreparedStatement seleccionarTodas=null;
	
	       
	public AlumnoDao(){
		
	}
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para seleccionar todos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public List<Alumno> todos(){
		
		
		
        Connection con = null;
        
        
      
       	List<Alumno> alumnos=new ArrayList<Alumno>();
		
		ResultSet res=null;
		
		boolean existe=false;
		try {
			con = conexion.getPoolConexion().getConnection();
			
			seleccionarTodas = con.prepareStatement("SELECT * FROM alumno;");
			
			res = seleccionarTodas.executeQuery();
			while(res.next()){
				Alumno unAlumno=new Alumno();
				
				unAlumno.setRne(res.getString("rne"));
				unAlumno.setNombre(res.getString("nombre"));
				unAlumno.setApellido(res.getString("apellido"));
				unAlumno.setCorreo(res.getString("correo"));
				unAlumno.setTelefono(res.getString("telefono"));
				unAlumno.setSexo(res.getString("sexo"));
				unAlumno.setFechaNac(res.getString("fechaNac"));
				//unAlumno.set
								
				
				alumnos.add(unAlumno);
				existe=true;

			 }
					
			} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Error, no se conecto");
					System.out.println(e);
			}
		finally
		{
			try{
				
				if(res != null) res.close();
                if(seleccionarTodas != null)seleccionarTodas.close();
                if(con != null) con.close();
                
				
				} // fin de try
				catch ( SQLException excepcionSql )
				{
					excepcionSql.printStackTrace();
					//conexion.desconectar();
				} // fin de catch
		} // fin de finally
		
		
			if (existe) {
				return alumnos;
			}
			else return null;
		
	}
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para agregar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public boolean registrar(Alumno myAlumno)
	{
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
		try 
		{
			con = conexion.getPoolConexion().getConnection();
			
			insertarNuevo=con.prepareStatement( "INSERT INTO alumno(rne,nombre,apellido,fechaNac,sexo,telefono,correo,nacionalidad,passwd) VALUES (?,?,?,?,?,?,?,?,?)");
			
			insertarNuevo.setString( 1, myAlumno.getRne() );
			insertarNuevo.setString( 2, myAlumno.getNombre() );
			insertarNuevo.setString( 3, myAlumno.getApellido() );
			insertarNuevo.setString( 4, myAlumno.getFechaNac());
			insertarNuevo.setString( 5, myAlumno.getSexo());
			insertarNuevo.setString( 6, myAlumno.getTelefono());
			insertarNuevo.setString( 7, myAlumno.getCorreo());
			insertarNuevo.setInt( 8, myAlumno.getCodigoNacionalidad());
			insertarNuevo.setString( 9, myAlumno.getRne());
			
			
			resultado=insertarNuevo.executeUpdate();
			
						
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			//conexion.desconectar();
            return false;
		}
		finally
		{
			try{
				if(rs!=null)rs.close();
				 if(insertarNuevo != null)insertarNuevo.close();
	              if(con != null) con.close();
			} // fin de try
			catch ( SQLException excepcionSql )
			{
				excepcionSql.printStackTrace();
				//conexion.desconectar();
			} // fin de catch
		} // fin de finally
	}
	public void setIdAlumnoRegistrado(String i){
		idAlumnoRegistrado=i;
	}

}
