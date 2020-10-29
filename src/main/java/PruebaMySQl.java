import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Beto Jr
 */
public class PruebaMySQl {
     public static void main(String[] args){
        
        Connection conexion1 = null;
        Connection conexion2 = null;
        Connection conexion3 = null;
        
        String user = "root";
        String password = "";
        
        try{
            String url1 = "jdbc:mysql://localhost:3306/mibase?user=" + user + "&password=" + password;
            conexion1 = DriverManager.getConnection(url1);
            
            if(conexion1 != null){
                System.out.print("Conexion 1: conexion a mibase satisfactoria");
            }
            
            Properties datos = new Properties();
            datos.put("user", user);
            datos.put("password", password);
            String url2 = "jdbc:mysql://localhost3306/mibase";
            conexion2 = DriverManager.getConnection(url2, datos);
            
            if(conexion2 != null){
                System.out.println("Conexion 2: Conexion a mibase satisfactoria");
            }
            
            String url3 = "jdbc:mysql://localhost:3306/mibase";
            conexion3 = DriverManager.getConnection(url3, user, password);
            
            if(conexion3 != null){
                System.out.println("Conexion 3: Conexion a mibase satisfactoria");
            }
        } catch (SQLException e){
            System.out.println("Error, verifique su usuario o password o nombre de la base de datos");
            e.printStackTrace();
        }
    }
    
}

