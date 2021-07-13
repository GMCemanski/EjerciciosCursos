
package modelo;

//import java.sql.Connection;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class Conexion {
    public static final String URL ="jdbc:mysql://localhost:3307/java_ats";
    public static final String usuario = "root";
    public static final String contraseña = "";
    
    public Connection getConexion() throws ClassNotFoundException{
        Connection conexion=null;             
        
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");            
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contraseña);
        
        } catch(Exception ex){
            System.err.println("Error con la base de datos--> "+ex); //Por si no encuentra la BD
        }
        
        return conexion;
    }
}
