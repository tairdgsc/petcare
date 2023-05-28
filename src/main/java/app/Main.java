
package app;

import connection.ConnectionFactory;

/**
 *
 * @author Taila
 */
public class Main {
    public static void main(String[] args) {
        ConnectionFactory conn = new ConnectionFactory();
        conn.getConnectionUSBWebService();
        System.out.println("Conectado");
    }
}
