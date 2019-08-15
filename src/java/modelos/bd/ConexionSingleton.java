/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.bd;


import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author Instructor
 */
public class ConexionSingleton {
    
    //atributos
    private static Connection conn;
    
    //constructor
    //1. El constructor debe ser privado
    private ConexionSingleton(){       
        try {
            //crear la conexión
            forName("com.mysql.jdbc.Driver");//ocurrir un erro por escritura y que no vincule el driver
            String url="jdbc:mysql://localhost:3306/mvc?zeroDateTimeBehavior=convertToNull";
            String user="root";
            String password="";
            conn = DriverManager.getConnection(url, user, password);//Que no encuentra la conexión
            //Subir el motor mysql, este mal escrito
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
    
    
    
    //métodos
    //2. Crear un metodo para retornar la instancia
    public static Connection obtenerConexion(){
        if(conn == null){
            new ConexionSingleton();
        }
        return conn;
    }
    
    public static void main(String[] args) {
        ConexionSingleton.obtenerConexion();
       
    }
}
