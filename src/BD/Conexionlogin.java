package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 
 */
public class Conexionlogin{
    public static final String URL = "jdbc:mysql://localhost:3306/tienda";
    public static final String USER = "root";
    public static final String CLAVE = "12345678";
    
    public Connection getConexionlogin(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return con;
    }    
}