package modelo.connBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Alumno;
import modelo.ConexionBD;

public class AlumnoDao {
	
	ConexionBD conexion=new ConexionBD();
	private PreparedStatement insertarNuevo=null;
	private String idAlumnoRegistrado;
	public AlumnoDao(){
		
	}
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para agregar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public boolean registrarArticulo(Alumno myAlumno)
	{
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
		try 
		{
			con = conexion.getPoolConexion().getConnection();
			
			insertarNuevo=con.prepareStatement( "INSERT INTO alumno(rne,nombre,apellido,fechaNac,sexo,telefono,correo,nacionalidad) VALUES (?,?,?,?,?,?,?,?)");
			
			insertarNuevo.setString( 1, myAlumno.getRne() );
			insertarNuevo.setString( 2, myAlumno.getNombre() );
			insertarNuevo.setString( 3, myAlumno.getApellido() );
			insertarNuevo.setString( 4, myAlumno.getFechaNac());
			insertarNuevo.setString( 5, myAlumno.getSexo());
			insertarNuevo.setString( 6, myAlumno.getTelefono());
			insertarNuevo.setString( 7, myAlumno.getCorreo());
			insertarNuevo.setInt( 8, myAlumno.getCodigoNacionalidad());
			
			
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
