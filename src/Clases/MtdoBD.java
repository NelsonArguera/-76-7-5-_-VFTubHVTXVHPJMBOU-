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
public class MtdoBD {
    
     private Connection cn;
    private  Integer id_Conductor;
    private String Nombre;
    private String Apellido;
    private  Integer Num_Grua;
    
    public MtdoBD(){
        ConexionBD con = new ConexionBD();
        cn = con.conectar();
    }
    
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
     * @return the ID
     */
    public Integer getID() {
        return id_Conductor;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Integer ID) {
        this.id_Conductor = ID;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
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
    
        //metodo para buscar
      public boolean consultarproyecto(){
        boolean resp = false;
        try {
            String sql = "SELECT id_Conductor, Nombre, Apellido, Num_Grua  FROM Conductor WHERE id_Conductor = ?;";
        PreparedStatement cmd = cn.prepareStatement(sql);
        cmd.setInt(1, id_Conductor);
        
        ResultSet rs = cmd.executeQuery();
        
            if (rs.next()) {
                resp = true;
                
                     id_Conductor = rs.getInt(1);
                    Nombre = rs.getString(2);
                    Apellido = rs.getString(3);
                    Num_Grua = rs.getInt(4);
            }
               cmd.close();
               cn.close();
                
        } catch (Exception e) {
            
            System.out.println(e.toString());
        }
        return resp;
    }
    
    
    
    
}
