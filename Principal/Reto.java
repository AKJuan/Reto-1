
package Principal;
import Interface.*;
import Modelo.*;

public class Reto {

    public static void main(String[] args) {
        Conexion conexionbd= new Conexion();
        
        Login login= new Login();
        login.setVisible(true);
    }
}
