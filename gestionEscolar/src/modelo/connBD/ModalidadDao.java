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
import modelo.Modalidad;




public class ModalidadDao {
	private ConexionBD conexion=new ConexionBD();
	private PreparedStatement insertarNuevo=null;
	private PreparedStatement seleccionarTodas=null;
	
	public ModalidadDao(){
	
	}
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para seleccionar todos los articulos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public List<Modalidad> todos(){
		
		
		
        Connection con = null;
        
        
      
       	List<Modalidad> modalidades=new ArrayList<Modalidad>();
		
		ResultSet res=null;
		
		boolean existe=false;
		try {
			con = conexion.getPoolConexion().getConnection();
			
			seleccionarTodas = con.prepareStatement("SELECT * FROM modalidad;");
			
			res = seleccionarTodas.executeQuery();
			while(res.next()){
				Modalidad unaModalidad=new Modalidad();
				existe=true;
				unaModalidad.setCodigoModalidad(res.getString("idMod"));
				unaModalidad.setNombre(res.getString("nombre"));
				
				
				
				modalidades.add(unaModalidad);
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
				return modalidades;
			}
			else return null;
		
	}
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para agregar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public boolean registrar(Modalidad myModalidad)
	{
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
		try 
		{
			con = conexion.getPoolConexion().getConnection();
			
			insertarNuevo=con.prepareStatement( "INSERT INTO modalidad(idMod,nombre) VALUES (?,?)");
			
			insertarNuevo.setString( 1, myModalidad.getCodigoModalidad() );
			insertarNuevo.setString( 2, myModalidad.getNombre() );
			
			
			
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
