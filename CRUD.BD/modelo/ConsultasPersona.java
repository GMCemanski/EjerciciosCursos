
package modelo;

//import java.sql.Connection;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Date;

public class ConsultasPersona extends Conexion{

    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar  (Persona persona) throws SQLException{
        try {
            Connection conexion = getConexion();
            ps = conexion.prepareStatement("insert into persona(nombre,clave,domicilio,celular,correo_electronico, fecha_nacimiento,genero) VALUES (?,?,?,?,?,?,?)");
            // Obtiene los datos de persona pero todavía no tiene info persona, eso va a estar en controlador
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getClave());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5, persona.getCorreo_electronico());
            ps.setString(6, persona.getFecha_nacimiento().toString()); 
            ps.setString(7, persona.getGenero());
            
            int resultado = ps.executeUpdate();
            
            if (resultado>0){
                
                 conexion.close();
                return true;
            }else{
             
            conexion.close();
                return false;
            }
            
        }catch (Exception ex){
            System.err.println("Error al conectar con bsdd"+ex);
            
            return false;
            
        }
        
//        finally{
//            try{
//                conexion.close();
//            }catch(Exception ex){
//                System.err.println("Error "+ex);
//            }
//        }
        
    }
    
    public boolean buscar(Persona persona){
        
        try {
            Connection conexion = getConexion();
            
            ps = conexion.prepareStatement("select * from persona where clave=?");
            // Obtiene los datos de persona pero todavía no tiene info persona, eso va a estar en controlador
            ps.setString(1, persona.getClave());
            rs = ps.executeQuery();
            
            if(rs.next()){ //si se encuentra el registro se guarda en persona
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setClave(rs.getString("clave"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDomicilio(rs.getString("domicilio"));
                persona.setCelular(rs.getString("celular"));
                persona.setCorreo_electronico(rs.getString("correo_electronico"));
                persona.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                persona.setGenero(rs.getString("genero"));
                return true;
            }else{
                return false;
            }

            
        }catch (Exception ex){
            System.err.println("Error al conectar con bsdd"+ex);
            
            return false;
            
        }
    
    }
    
    public boolean modificar (Persona persona) throws SQLException{
        try {
            Connection conexion = getConexion();
            ps = conexion.prepareStatement("update persona set nombre=?,clave=?,domicilio=?,celular=?,correo_electronico=?, fecha_nacimiento=?,genero=? where idPersona=?");
            // Obtiene los datos de persona pero todavía no tiene info persona, eso va a estar en controlador
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getClave());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5, persona.getCorreo_electronico());
            ps.setString(6, persona.getFecha_nacimiento().toString()); 
            ps.setString(7, persona.getGenero());
            ps.setInt(8,persona.getIdPersona());
            
            int resultado = ps.executeUpdate();
            
            if (resultado>0){                
                conexion.close();
                return true;
            }else{                             
                conexion.close();
                return false;
            }
            
        }catch (Exception ex){
            System.err.println("Error al conectar con bsdd"+ex);
            return false;           
        }
    }
    
     public boolean eliminar (Persona persona) throws SQLException{
        try {
            Connection conexion = getConexion();
            ps = conexion.prepareStatement("delete from persona where idPersona=?");
            ps.setInt(1,persona.getIdPersona());
            
            int resultado = ps.executeUpdate();
            
            if (resultado>0){                
                conexion.close();
                return true;
            }else{                             
                conexion.close();
                return false;
            }
            
        }catch (Exception ex){
            System.err.println("Error al borrar el registro"+ex);
            return false;           
        }
    }
    
}
