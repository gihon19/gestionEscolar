package modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import javax.sql.DataSource;
import javax.swing.JOptionPane;

import org.apache.commons.dbcp.BasicDataSource;




public class ConexionBD {
	private  BasicDataSource basicDataSource;
	   private DataSource dataSource;
	   static String bd = "colegio_hdm";
	   static String login = "root";
	   static String password = "jdmm123";
	   static String url = "jdbc:mysql://192.168.1.36:3306/"+bd;
	   static String driver="com.mysql.jdbc.Driver";
	   private Usuarios usuarioLogin=null;

	   Connection conn = null;
	   
	   private static DataSource poolConexiones=null;
	   
	   
	   public ConexionBD(){
		   poolConexiones=ConexionBD.setDataSource("mysql");
	   }
	   
	   public Usuarios getUsuarioLogin(){
		   return usuarioLogin;
	   }
	   public void setUsuarioLogin(Usuarios u){
		   usuarioLogin=u;
		   
	   }
	  
	   /**Permite retornar la conexión*/
	   public Connection getConnection(){
		  
	      return conn;
	   }

	   public void desconectar(){
	      //conn = null;
	      try {
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   
	   public static DataSource getPoolConexion(){
		   return poolConexiones;
	   }
	   
	   public static DataSource setDataSource(String dbType){
	       //Properties props = new Properties();
	       //FileInputStream fis = null;
	       BasicDataSource ds = new BasicDataSource();
	        
	       /*try {
	          fis = new FileInputStream( "db.config");
	    	   //Conexion.class.getResource("/View/imagen/actualizar.png");
	    	   //ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	    	   //fis = ClassLoader.class.getResourceAsStream("/path/to/your/xml");
	           props.load(fis);
	       }catch(IOException e){
	           e.printStackTrace();
	           return null;
	       }*/
	       if("mysql".equals(dbType)){
	           ds.setDriverClassName(driver);
	           ds.setUrl(url);
	           ds.setUsername(login);
	           ds.setPassword(password);
	          // ds.setMinIdle(20);
	           ds.setMaxActive(10);
	           ds.setMaxIdle(5);
	           ds.setMinIdle(3);
	           ds.setInitialSize(2);
	           
	           
	           
	           
	           
	           /*ds.setDriverClassName(props.getProperty("MYSQL_DB_DRIVER_CLASS"));
	           ds.setUrl(props.getProperty("MYSQL_DB_URL"));
	           ds.setUsername(props.getProperty("MYSQL_DB_USERNAME"));
	           ds.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
	          // ds.setMinIdle(20);
	           ds.setMaxActive(10);
	           ds.setMaxIdle(5);
	           ds.setMinIdle(3);
	           ds.setInitialSize(2);*/
	       }/*else if("oracle".equals(dbType)){
	           ds.setDriverClassName(props.getProperty("ORACLE_DB_DRIVER_CLASS"));
	           ds.setUrl(props.getProperty("ORACLE_DB_URL"));
	           ds.setUsername(props.getProperty("ORACLE_DB_USERNAME"));
	           ds.setPassword(props.getProperty("ORACLE_DB_PASSWORD"));
	       }*/else{
	           return null;
	       }
	        
	       return ds;
	   }

}
