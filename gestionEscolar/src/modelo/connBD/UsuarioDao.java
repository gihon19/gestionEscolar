package modelo.connBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Asignatura;
import modelo.ConexionBD;
import modelo.Usuarios;

public class UsuarioDao {
	
	ConexionBD conexion=new ConexionBD();
	private PreparedStatement insertarNuevo=null;
	private PreparedStatement seleccionarTodas=null;
	private PreparedStatement eliminar=null;

	public UsuarioDao() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para seleccionar todos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public List<Usuarios> todos(){
		
		
		
        Connection con = null;
        
        
      
       	List<Usuarios> usuarios=new ArrayList<Usuarios>();
		
		ResultSet res=null;
		
		boolean existe=false;
		try {
			con = conexion.getPoolConexion().getConnection();
			
			seleccionarTodas = con.prepareStatement("SELECT * FROM usuario;");
			
			res = seleccionarTodas.executeQuery();
			while(res.next()){
				Usuarios un=new Usuarios();
				
				
				un.setnombre(res.getString("nombre"));
				un.setapellido(res.getString("apellido"));
				un.setuser(res.getString("usuario"));
				un.setemail(res.getString("email"));
				un.setpassword(res.getString("clave"));
	
				//un.settelefono(res.getString("telefono"));
				
				/*unaAsignatura1.setIdAsignatura(res.getString("idClase"));
				unaAsignatura1.setDescripcion(res.getString("nombre"));
				
				//unaModalidad.setCodigoModalidad(res.getString("idMod"));
				//unaModalidad.setNombre(res.getString("nombre"));
				
				
				
				asignaturas1.add(unaAsignatura1);*/
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
				return usuarios;
			}
			else return null;
		
	}
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para agregar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public boolean registrar(Usuarios usuario)
	{
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
		try 
		{
			con = conexion.getPoolConexion().getConnection();
			
			insertarNuevo=con.prepareStatement( "INSERT INTO usuario(usuario,nombre,apellido,clave,email) VALUES (?,?,?,?,?)");
			
			insertarNuevo.setString( 1, usuario.getuser() );
			insertarNuevo.setString( 2, usuario.getnombre() );
			insertarNuevo.setString( 3, usuario.getapellido() );
			insertarNuevo.setString( 4, usuario.getpassword() );
			insertarNuevo.setString( 5, usuario.getemail());
			
			
			
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
	
	
	
	 public boolean eliminar(Usuarios usuario){
			
			
			int resultado=0;
			ResultSet rs=null;
			Connection con = null;
			
		    	 try 
		 		{
		 			con = conexion.getPoolConexion().getConnection();
		 			
		 			eliminar=con.prepareStatement("Delete FROM usuario Where usuario=?");
		 			eliminar.setString(1, usuario.getuser());
		 
		 			
		 			
		 			
		 			resultado=eliminar.executeUpdate();
		 			
		    	 
				return true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				return false;
			}
		    	 
		    	 finally
		 		{
		 			try{
		 				if(rs!=null)rs.close();
		 				 if(eliminar != null)eliminar.close();
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
