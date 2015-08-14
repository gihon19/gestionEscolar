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
import modelo.Docente;
import modelo.EncargadosPadres;

public class ProfesorDao {
	
	ConexionBD conexion=new ConexionBD();
	private PreparedStatement insertarNuevo=null;
	private PreparedStatement seleccionarTodas=null;
	
	public ProfesorDao(){
		
	}
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para seleccionar todos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public List<Docente> todos(){
		
		
		
        Connection con = null;
        
        
      
       	List<Docente> docentes=new ArrayList<Docente>();
		
		ResultSet res=null;
		
		boolean existe=false;
		try {
			con = conexion.getPoolConexion().getConnection();
			
			seleccionarTodas = con.prepareStatement("SELECT * FROM profesores;");
			
			res = seleccionarTodas.executeQuery();
			while(res.next()){
				Docente unDocente=new Docente();
				
				unDocente.setRne("idProf");
				unDocente.setApellido("apellido");
				unDocente.setNombre("nombre");
				unDocente.setTelefono("telefono");
				unDocente.setCorreo("email");
				unDocente.setDireccion("direccion");
								
				
				docentes.add(unDocente);
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
				return docentes;
			}
			else return null;
		
	}
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Metodo para agregar>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
	public boolean registrar(Docente myDocente)
	{
		
		int resultado=0;
		ResultSet rs=null;
		Connection con = null;
		
		try 
		{
			con = conexion.getPoolConexion().getConnection();
			
			insertarNuevo=con.prepareStatement( "INSERT INTO profesores(idProf,nombre,apellido,telefono,direccion,email,passwd) VALUES (?,?,?,?,?,?,?)");
			
			insertarNuevo.setString( 1, myDocente.getRne() );
			insertarNuevo.setString( 2, myDocente.getNombre() );
			insertarNuevo.setString( 3, myDocente.getApellido() );
			insertarNuevo.setString( 4, myDocente.getTelefono());
			insertarNuevo.setString( 5, myDocente.getDireccion());
			insertarNuevo.setString( 6, myDocente.getCorreo());
			insertarNuevo.setString( 7, myDocente.getRne() );
			
			
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
