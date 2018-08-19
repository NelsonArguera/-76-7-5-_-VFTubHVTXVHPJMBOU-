/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Nelso
 */
public class ConexionBD {
    
    public Connection conectar(){
      
                  Connection cn = null;
      try{
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            cn = DriverManager.getConnection("jdbc:sqlserver://PC2\\SQLEXPRESS;"
                            + "databaseName=Organizacion_Gruas;integratedSecurity=true;");
          }
       catch (Exception ex) {
            System.out.println(ex.getMessage());
       }
      return cn;

    }
    
}
