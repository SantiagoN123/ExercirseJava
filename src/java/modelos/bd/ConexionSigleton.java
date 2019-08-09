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
 * @author Santi
 */
public class ConexionSigleton {
    private static Connection conn;
    //El construtor debe se privado
    private ConexionSigleton(){
        
        try {
            forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/vmc?zeroDateTimeBehavior=convertToNull";
            String user ="root";
            String password ="";
               conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSigleton.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSigleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Metodo 
    //el Metodo debe estar estatico para hacer retorno
    public static Connection obtenerConexion(){
        if(conn == null){
            new ConexionSigleton();
        }
        return conn;
    }
    public static void main(String[] args) {
        ConexionSigleton.obtenerConexion();
    }
}
