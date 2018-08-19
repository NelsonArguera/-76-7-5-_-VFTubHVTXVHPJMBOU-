/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;

/**
 *
 * @author Enrique
 */
public class viaje {

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    /**
     * @return the apellido_conductor
     */
    public String getApellido_conductor() {
        return apellido_conductor;
    }

    /**
     * @param apellido_conductor the apellido_conductor to set
     */
    public void setApellido_conductor(String apellido_conductor) {
        this.apellido_conductor = apellido_conductor;
    }

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
     * @return the precio_viaje
     */
    public double getPrecio_viaje() {
        return precio_viaje;
    }

    /**
     * @param precio_viaje the precio_viaje to set
     */
    public void setPrecio_viaje(double precio_viaje) {
        this.precio_viaje = precio_viaje;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the distancia_km
     */
    public double getDistancia_km() {
        return distancia_km;
    }

    /**
     * @param distancia_km the distancia_km to set
     */
    public void setDistancia_km(double distancia_km) {
        this.distancia_km = distancia_km;
    }

    /**
     * @return the id_conductor
     */
    public int getId_conductor() {
        return id_conductor;
    }

    /**
     * @param id_conductor the id_conductor to set
     */
    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    /**
     * @return the membresia
     */
    public int getMembresia() {
        return membresia;
    }

    /**
     * @param membresia the membresia to set
     */
    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the tipo_pago
     */
    public int getTipo_pago() {
        return tipo_pago;
    }

    /**
     * @param tipo_pago the tipo_pago to set
     */
    public void setTipo_pago(int tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    /**
     * @return the lugar_destino
     */
    public String getLugar_destino() {
        return lugar_destino;
    }

    /**
     * @param lugar_destino the lugar_destino to set
     */
    public void setLugar_destino(String lugar_destino) {
        this.lugar_destino = lugar_destino;
    }

    /**
     * @return the lugar_inicio
     */
    public String getLugar_inicio() {
        return lugar_inicio;
    }

    /**
     * @param lugar_inicio the lugar_inicio to set
     */
    public void setLugar_inicio(String lugar_inicio) {
        this.lugar_inicio = lugar_inicio;
    }
    /**
     * @return the nombre_conductor
     */
    public String getNombre_conductor() {
        return nombre_conductor;
    }

    /**
     * @param nombre_conductor the nombre_conductor to set
     */
    public void setNombre_conductor(String nombre_conductor) {
        this.nombre_conductor = nombre_conductor;
    }


    private Connection cn;
    private int tipo_pago;
    private double precio_viaje;
    private int id_usuario;
    private String lugar_destino;
    private String lugar_inicio;
    private double distancia_km;
    private int id_conductor; 
    private int membresia;
    private String fechaFin;
    private String nombre_usuario;
    private String nombre_conductor;
    private String apellido_conductor;
    private String fecha;
   
    public viaje(){
       //Estableciendo la conexion a la base de datos por medio del constructor para
       //cuando sea llamada se active de un solo
       Conexion con = new Conexion();
       cn =con.conectar();
    }
    public boolean InsertarDatos(){
      boolean resp=false;
        try {
            String sql="Insert Into viaje(id_conductor, id_usuario, precio_viaje,distancia_km, fecha_inicio, lugar_inicio,"
                    + "lugar_destino, fecha_final, id_tipoP)values(?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
        
            cmd.setInt(1, id_conductor);
            cmd.setInt(2, id_usuario);
            cmd.setDouble(3, precio_viaje);
            cmd.setDouble(4, distancia_km);
            cmd.setString(5, fecha);
            cmd.setString(6, lugar_inicio);
            cmd.setString(7, lugar_destino);
            cmd.setString(8, fecha);
            cmd.setInt(9, tipo_pago);
            
            if (!cmd.execute()) {
                resp=true;
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public ArrayList<String>  llenarCombo(){
       ArrayList<String> conductores = new ArrayList<String>();
       String sql="select nombre_conductor, apellido_conductor from conductor where id_estado=1";
        try {
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            
            //Mientras tengamos registros por leer vamos a seguir agregando registros
            //a la lista
            while (rs.next()) {                
                conductores.add(rs.getString("nombre_conductor"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
       return conductores;
    }
    public ArrayList<String>  llenarComboApellido(){
       ArrayList<String> conductores_apellido = new ArrayList<String>();
       String sql="select nombre_conductor, apellido_conductor from conductor where id_estado=1";
        try {
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            
            //Mientras tengamos registros por leer vamos a seguir agregando registros
            //a la lista
            while (rs.next()) {                
                conductores_apellido.add(rs.getString("apellido_conductor"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
       return conductores_apellido;
    }
    
    public ArrayList<String> llenarClientesNombre(){
        ArrayList<String> clientes = new ArrayList<String>();
        String Sql ="Select nombre, apellido from Usuarios ";
        try {
            PreparedStatement cmd  = cn.prepareStatement(Sql);
            ResultSet rs = cmd.executeQuery();
            
            while (rs.next()) {                
                clientes.add(rs.getString("nombre"));
                
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return clientes;
    }
    public ArrayList<String> llenarClientesApellido(){
        ArrayList<String> clientes = new ArrayList<String>();
        String Sql ="Select nombre, apellido from Usuarios ";
        try {
            PreparedStatement cmd  = cn.prepareStatement(Sql);
            ResultSet rs = cmd.executeQuery();
            
            while (rs.next()) {                
                clientes.add(rs.getString("apellido"));
                
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return clientes;
    }
    public boolean GetIDusuario(){
        boolean resp = false;
        try {
            String sql ="Select Id_usuario from usuarios where Nombre = ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre_usuario);
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
                resp = true; 
                id_usuario = rs.getInt(1);
            }

            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    public boolean GetIDConductor(){
        boolean resp = false;
        String sql ="Select id_conductor from conductor where nombre_conductor=? and apellido_conductor =?";
        try {
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre_conductor);
            cmd.setString(2, apellido_conductor);
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
                resp = true; 
                id_conductor= rs.getInt(1);
            }
            
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    public boolean PMembresia(){
        boolean resp= false;
        String sql="Select id_tipoUsu from usuarios where Nombre=?";
        try {
                  PreparedStatement cmd = cn.prepareStatement(sql);
                  cmd.setString(1, nombre_usuario);
                  ResultSet rs = cmd.executeQuery();
                  
                  if (rs.next()) {
                      resp = true;
                membresia = rs.getInt(1);
                
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;  
    }
    public boolean CambiarEstadoConductor(){
        boolean resp = false; 
        String sql ="Update conductor set id_estado=2 where id_conductor=?";
        try {
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, id_conductor);
            
            if (!cmd.execute()) {
                resp= true;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }





    

}
