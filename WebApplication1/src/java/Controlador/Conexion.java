/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author cristiancesar
 */
//esta es la clase para todas las conexiones
import java.sql.*;

public class Conexion {
    public static Connection getConnection(){
        String url, user, pass;
        url = "jdbc:mysql://localhost:3306/ventas";
        user = "root";
        pass = "pragnananda";
        try{
            return DriverManager.getConnection(url,user,pass);
        }catch(SQLException e){
            System.out.println("Error al Conectar a la Bd");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }catch(Exception e){
            System.out.println(e.getStackTrace());
            
        }
        return null;
    } 
     
}
