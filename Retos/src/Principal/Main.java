
package Principal;
import Modelo.*;
import Vistas.*;

public class Main {

    public static void main(String[] args) {
        //Instancia de clase Conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
        //Instancia de Login
        Login login= new Login();
        login.setVisible(true);
        
    }

}
