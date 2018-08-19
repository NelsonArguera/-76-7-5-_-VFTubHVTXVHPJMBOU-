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
 * @author Enrique
 */
public class RangoUsuario {

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the id_rango
     */
    public int getId_rango() {
        return id_rango;
    }

    /**
     * @param id_rango the id_rango to set
     */
    public void setId_rango(int id_rango) {
        this.id_rango = id_rango;
    }
    private Connection cn;
    private int id_rango;
    private String nombre_usuario;
    
    //estableciendo la conneccion desde el constructor
    public RangoUsuario(){
        Conexion con = new Conexion();
        cn = con.conectar();
    }
    
    public boolean ObtenerRango(){
        boolean resp = false;
        try {
            String sql ="Select id_rango from Usuarios where nombre_usuario =?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            login obj = new login();
            
            String usu = obj.getUsuario();
            cmd.setString(1, usu);
            
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
                id_rango = rs.getInt(1);
                resp=true;
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
}
