package connection;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Taila
 */

public class ConnectionFactory {
    public Connection getConnectionUSBWebService(){
        try {
            var conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/petcare?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC", "root", "@Seahorse1");
            
            return conn;
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }

}
