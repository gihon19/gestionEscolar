package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;




public class ModalidadDao {
	private ConexionBD conexion=null;
	private PreparedStatement insertarNuevaArticulo=null;
	private PreparedStatement seleccionarTodas=null;
	
	public ModalidadDao(ConexionBD conn){
		conexion=conn;
	}
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para seleccionar todos los articulos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public List<Modalidad> todosModalidades(){
		
		
		
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
				unaModalidad.setCodigoModalidad(res.getInt("idMod"));
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

}
