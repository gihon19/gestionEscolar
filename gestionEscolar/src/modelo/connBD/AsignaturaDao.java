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
import modelo.EncargadosPadres;
import modelo.Modalidad;

public class AsignaturaDao {
	ConexionBD conexion=new ConexionBD();
	private PreparedStatement insertarNuevo=null;
	private PreparedStatement seleccionarTodas=null;
	private PreparedStatement eliminarAsignatura=null;

	public AsignaturaDao() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para seleccionar todos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public List<Asignatura> todos(){
		
		
		
        Connection con = null;
        
        
      
       	List<Asignatura> asignaturas1=new ArrayList<Asignatura>();
		
		ResultSet res=null;
		
		boolean existe=false;
		try {
			con = conexion.getPoolConexion().getConnection();
			
			seleccionarTodas = con.prepareStatement("SELECT * FROM clases;");
			
			res = seleccionarTodas.executeQuery();
			while(res.next()){
				Asignatura unaAsignatura1=new Asignatura();
				
				unaAsignatura1.setIdAsignatura(res.getString("idClase"));
				unaAsignatura1.setDescripcion(res.getString("nombre"));
				
				//unaModalidad.setCodigoModalidad(res.getString("idMod"));
				//unaModalidad.setNombre(res.getString("nombre"));
				
				
				
				asignaturas1.add(unaAsignatura1);
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
				return asignaturas1;
			}
			else return null;
		
	}
	        
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para agregar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public boolean registrar(Asignatura myAsignatura1)
	{
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
		try 
		{
			con = conexion.getPoolConexion().getConnection();
			
			insertarNuevo=con.prepareStatement( "INSERT INTO clases(idClase,nombre) VALUES (?,?)");
			
			insertarNuevo.setString( 1, myAsignatura1.getIdAsignatura() );
			insertarNuevo.setString( 2, myAsignatura1.getDescripcion() );
			
			
			
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
	
	
	
	
	
   public boolean eliminarAsignatura(Asignatura asignatura){
		
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
	    	 try 
	 		{
	 			con = conexion.getPoolConexion().getConnection();
	 			
	 			eliminarAsignatura=con.prepareStatement("Delete FROM clases Where idClase=?");
	 			eliminarAsignatura.setString(1, asignatura.getIdAsignatura());
	 
	 			
	 			
	 			
	 			resultado=eliminarAsignatura.executeUpdate();
	 			
	    	 
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
	 				 if(eliminarAsignatura != null)eliminarAsignatura.close();
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
