/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import java.sql.Connection;
/**
 *
 * @author Nelso
 */
public class MtodBd {
    
     private Connection cn;
    private Integer Num_Grua;
    private String Estado_Grua;
    

    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /**
     * @return the Num_Grua
     */
    public Integer getNum_Grua() {
        return Num_Grua;
    }

    /**
     * @param Num_Grua the Num_Grua to set
     */
    public void setNum_Grua(Integer Num_Grua) {
        this.Num_Grua = Num_Grua;
    }

    /**
     * @return the Estado_Grua
     */
    public String getEstado_Grua() {
        return Estado_Grua;
    }

    /**
     * @param Estado_Grua the Estado_Grua to set
     */
    public void setEstado_Grua(String Estado_Grua) {
        this.Estado_Grua = Estado_Grua;
    }
    
  
        //metodo para buscar
      public boolean consultarproyecto(){
        boolean resp = false;
        try {
            String sql = "SELECT  Num_Grua, Estado  FROM Gruas WHERE Num_Grua = ?;";
        PreparedStatement cmd = getCn().prepareStatement(sql);
        cmd.setInt(1, Num_Grua);
        
        ResultSet rs = cmd.executeQuery();
        
            if (rs.next()) {
                resp = true;
                
                  
                     Num_Grua = rs.getInt(1);
                    Estado_Grua = rs.getString(2);
                    
            }
               cmd.close();
               getCn().close();
                
        } catch (Exception e) {
            
            System.out.println(e.toString());
        }
        return resp;
    }
    
}
