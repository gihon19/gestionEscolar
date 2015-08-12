package modelo.connBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Alumno;
import modelo.ConexionBD;
import modelo.EncargadosPadres;

public class EncargadoDao {
	ConexionBD conexion=new ConexionBD();
	private PreparedStatement insertarNuevo=null;
	
	
	public EncargadoDao(){
		
	}
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para agregar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public boolean registrar(EncargadosPadres myEncargado)
	{
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
		try 
		{
			con = conexion.getPoolConexion().getConnection();
			
			insertarNuevo=con.prepareStatement( "INSERT INTO responsable(rnp,nombre,apellido,telefono,direccion) VALUES (?,?,?,?,?)");
			
			insertarNuevo.setString( 1, myEncargado.getRnp() );
			insertarNuevo.setString( 2, myEncargado.getNombre() );
			insertarNuevo.setString( 3, myEncargado.getApellido() );
			insertarNuevo.setString( 4, myEncargado.getTelefono());
			insertarNuevo.setString( 5, myEncargado.getDireccion());
			
			
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

}
