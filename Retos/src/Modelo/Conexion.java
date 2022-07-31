
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection connection;
    String driver="com.mysql.cj.jdbc.Driver";
    String urlConexion="jdbc:mysql://localhost:3306/reto";
    String usuario="root";
    String contraseña="";

    public Conexion() {
        try{
            Class.forName(driver);
            connection= DriverManager.getConnection(urlConexion, usuario, contraseña);
            if (connection != null){
            System.out.println("BUENA CONEXION CON LA BASE DATOS");}
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("ERROR DE CONEXION CON LAS BASE DE DATOS");
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
   
    
    
}
