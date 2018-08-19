/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Geovany Fuentes
 */
public class mantenimientosgruas {

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
     * @return the nombregrua
     */
    public String getNombregrua() {
        return nombregrua;
    }

    /**
     * @param nombregrua the nombregrua to set
     */
    public void setNombregrua(String nombregrua) {
        this.nombregrua = nombregrua;
    }

    /**
     * @return the numeroplacas
     */
    public String getNumeroplacas() {
        return numeroplacas;
    }

    /**
     * @param numeroplacas the numeroplacas to set
     */
    public void setNumeroplacas(String numeroplacas) {
        this.numeroplacas = numeroplacas;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }

    /**
     * @return the tarjetacirculacion
     */
    public String getTarjetacirculacion() {
        return tarjetacirculacion;
    }

    /**
     * @param tarjetacirculacion the tarjetacirculacion to set
     */
    public void setTarjetacirculacion(String tarjetacirculacion) {
        this.tarjetacirculacion = tarjetacirculacion;
    }

    /**
     * @return the colorgrua
     */
    public String getColorgrua() {
        return colorgrua;
    }

    /**
     * @param colorgrua the colorgrua to set
     */
    public void setColorgrua(String colorgrua) {
        this.colorgrua = colorgrua;
    }
    private Connection cn;
    private String nombregrua;
    private String numeroplacas;
    private String año;
    private String tarjetacirculacion;
    private String colorgrua;
    
    
    public mantenimientosgruas(){
    //estableciendo la conexion
    Conexion con = new Conexion();
    cn = con.conectar();
    }
    
        //creando el metodo para guaradar el proyecto
    public boolean guardargruas(){
    boolean resp = false;
        try {
            String sql = "INSERT INTO gruas (nombre_grua, num_placas, año, tarjeta_circulacion, color_grua)" 
                    + "VALUES(?, ?, ?, ?, ?)";           
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombregrua);
            cmd.setString(2, numeroplacas);
            cmd.setString(3, año);
            cmd.setString(4, tarjetacirculacion);
            cmd.setString(5, colorgrua);

            if (!cmd.execute()) {
                resp = true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
        public boolean  modificargruas(){
        boolean resp = false;
        try {
            String sql = "UPDATE gruas SET nombre_grua = ?,num_placas = ?, año = ?, tarjeta_circulacion = ?, color_grua = ?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombregrua);
            cmd.setString(2, numeroplacas);
            cmd.setString(3, año);
            cmd.setString(4,tarjetacirculacion);
            cmd.setString(5, colorgrua);

            if (!cmd.execute()) {
                resp = true;   
            }
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return  resp;
    }
        
            public boolean eliminargruas(){
    boolean resp = false;
        try {
            String sql = "DELETE FROM gruas WHERE nombre_grua = ?;";
            PreparedStatement cmd= cn.prepareStatement(sql); 
            cmd.setString(1, nombregrua);

            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
            
        public boolean consultargruas(){

    boolean resp = false;
        try {
            String sql = "SELECT nombre_grua,num_placas, año, tarjeta_circulacion, color_grua FROM gruas WHERE nombre_grua = ?;";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombregrua);
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                resp = true;
                //asignandole a los atributos de la clase
                nombregrua = rs.getString(1);
                numeroplacas = rs.getString(2);
                año = rs.getString(3);
                tarjetacirculacion = rs.getString(4);
                colorgrua = rs.getString(5);
            }
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
}
}
