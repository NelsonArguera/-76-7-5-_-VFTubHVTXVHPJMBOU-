/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Enrique
 */
public class Conexion {
    public Connection conectar(){
        Connection cn = null;
        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            //Pedira importar java.sql.DriverManager;
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Organizacion_Gruas;authenticationScheme=JavaKerberos"
                    + ";user=SA;password=Tigesito1");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return cn;
    }
}
