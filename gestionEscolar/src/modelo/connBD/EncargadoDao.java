package modelo.connBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Alumno;
import modelo.ConexionBD;
import modelo.EncargadosPadres;
import modelo.Modalidad;

public class EncargadoDao {
	ConexionBD conexion=new ConexionBD();
	private PreparedStatement insertarNuevo=null;
	private PreparedStatement seleccionarTodas=null;
	private PreparedStatement eliminarPersona=null;
	private PreparedStatement buscarDato=null;
	
	public EncargadoDao(){
		
	}      
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para seleccionar todos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public List<EncargadosPadres> todos(){
		
		
		
        Connection con = null;
        
        
      
       	List<EncargadosPadres> responsables=new ArrayList<EncargadosPadres>();
		
		ResultSet res=null;
		
		boolean existe=false;
		try {
			con = conexion.getPoolConexion().getConnection();
			
			seleccionarTodas = con.prepareStatement("SELECT * FROM responsable;");
			
			res = seleccionarTodas.executeQuery();
			while(res.next()){
				EncargadosPadres unResposable=new EncargadosPadres();
				unResposable.setRnp(res.getString("rnp"));
				unResposable.setNombre(res.getString("nombre"));
				unResposable.setApellido(res.getString("apellido"));
				unResposable.setTelefono(res.getString("telefono"));
				unResposable.setDireccion(res.getString("direccion"));
				
								
				
				responsables.add(unResposable);
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
				return responsables;
			}
			else return null;
		
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
	
/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Metodo para eliminar<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/	
	public boolean eliminarEncargados(EncargadosPadres encargado){
		
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
	    	 try 
	 		{
	 			con = conexion.getPoolConexion().getConnection();
	 			
	 			eliminarPersona=con.prepareStatement("Delete FROM responsable Where Rnp="+encargado.getRnp());
	 			
	 			
	 			
	 			resultado=eliminarPersona.executeUpdate();
	 			
	    	 
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		
	}

/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>metodo de Buscar<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	public List <EncargadosPadres> buscarEncargados(String rnp){
		
		Connection con = null;
		
		List <EncargadosPadres> encargado=new ArrayList<EncargadosPadres>();
		
        ResultSet res=null;
		boolean existe=false;
		
		 try{
			 
			 con = conexion.getPoolConexion().getConnection();
			 
			 buscarDato = con.prepareStatement("Select * FROM responsable Where Rnp="+rnp);
				
			 res = buscarDato.executeQuery();
				while(res.next()){
					
					EncargadosPadres unEncargado=new EncargadosPadres();
					unEncargado.setRnp(res.getString("rnp"));
					unEncargado.setNombre(res.getString("nombre"));
					unEncargado.setApellido(res.getString("apellido"));
					unEncargado.setTelefono(res.getString("telefono"));
					unEncargado.setDireccion(res.getString("direccion"));
					
					encargado.add(unEncargado);
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
             if(buscarDato != null)buscarDato.close();
             if(con != null) con.close();
             
				
				} // fin de try
				catch ( SQLException excepcionSql )
				{
					excepcionSql.printStackTrace();
					//conexion.desconectar();
				} // fin de catch
		} // fin de finally
		
		
			if (existe) {
				return encargado;
			}
			else return null;
		
	}
			 
	

}
