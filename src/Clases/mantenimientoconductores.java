/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.nio.ch.ServerSocketAdaptor;
/**
 *
 * @author Geovany Fuentes
 */
public class mantenimientoconductores {

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
     * @return the nombreconductor
     */
    public String getNombreconductor() {
        return nombreconductor;
    }

    /**
     * @param nombreconductor the nombreconductor to set
     */
    public void setNombreconductor(String nombreconductor) {
        this.nombreconductor = nombreconductor;
    }

    /**
     * @return the apellidoconductor
     */
    public String getApellidoconductor() {
        return apellidoconductor;
    }

    /**
     * @param apellidoconductor the apellidoconductor to set
     */
    public void setApellidoconductor(String apellidoconductor) {
        this.apellidoconductor = apellidoconductor;
    }

    /**
     * @return the nombre_grua
     */
    public String getNombre_grua() {
        return nombre_grua;
    }

    /**
     * @param nombre_grua the nombre_grua to set
     */
    public void setNombre_grua(String nombre_grua) {
        this.nombre_grua = nombre_grua;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the codigo_grua
     */
    public Integer getCodigo_grua() {
        return codigo_grua;
    }

    /**
     * @param codigo_grua the codigo_grua to set
     */
    public void setCodigo_grua(Integer codigo_grua) {
        this.codigo_grua = codigo_grua;
    }

    /**
     * @return the codigo_estado
     */
    public Integer getCodigo_estado() {
        return codigo_estado;
    }

    /**
     * @param codigo_estado the codigo_estado to set
     */
    public void setCodigo_estado(Integer codigo_estado) {
        this.codigo_estado = codigo_estado;
    }


    private Connection cn;
    private String nombreconductor;
    private String apellidoconductor;
    private String nombre_grua;
    private String estado;
    private Integer codigo_grua;
    private Integer codigo_estado;
    
    
    
    
    public mantenimientoconductores(){
    //estableciendo la conexion
    Conexion con = new Conexion();
    cn = con.conectar();
    }
    
        public boolean guardarconductor(){
        boolean resp = false;
        try {
            String sql= "INSERT INTO conductor(nombre_conductor, apellido_conductor, id_gruas, id_estado)"
        +"VALUES(?, ?, ?, ?)";

           PreparedStatement cmd = getCn().prepareStatement (sql);

           cmd.setString(1, getNombreconductor());
           cmd.setString(2, getApellidoconductor());
           cmd.setInt(3, getCodigo_grua());
           cmd.setInt(4, getCodigo_estado());

           if(!cmd.execute()){
               resp = true;
           }
           cmd.close();
            getCn().close();   
        }catch (Exception e ){
            System.out.println(e.toString());
        }
        return resp;
    }
    
        //Creando el metodo para modificar
        public boolean modificarconductor(){
        boolean resp = false;
        try {
            String sql= "UPDATE  conductor SET nombre_conductor=?, apellido_conductor= ?, id_grua= ?,id_estado= ?;";
           PreparedStatement cmd = getCn().prepareStatement (sql);

           cmd.setString(1, getNombreconductor());
           cmd.setString(2, getApellidoconductor());
           cmd.setInt(3, getCodigo_grua());
           cmd.setInt(4, getCodigo_estado());

           if(!cmd.execute()){
               resp = true;
           }
           cmd.close();
            getCn().close();   
        }catch (Exception e ){
            System.out.println(e.toString());
        }
        return resp;
    }
    
    //Creando metodo para consultar
        public boolean consultarconductor(){
        boolean resp = false;
        try{
            //Realizar consulta SELECT
            String sql = "SELECT  nombre_conductor, apellido_conductor, id_gruas, id_estado FROM conductor WHERE nombre_conductor = ?;";
            PreparedStatement cmd = getCn().prepareStatement(sql);//Llena los parametros
            cmd.setString(1, nombreconductor);
            //Ejecuta la consulta
            //Pedira importar la clase ResultSet
            ResultSet rs= cmd.executeQuery();
            //Recorrer la lista de registros
            if (rs.next()){
                resp= true;
                //asignandole los atributos de la clase
                nombreconductor = rs.getString(1);
                apellidoconductor = rs.getString(2);
                codigo_grua = rs.getInt(3);
                codigo_estado = rs.getInt(4);
            }
            cmd.close();
            getCn().close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }
        
       //Creando el metodo para eliminar
    public boolean eliminarconductor(){
        boolean resp = false;
        try{
            //Realizar consulta DELETE
            String sql = "DELETE FROM conductor WHERE nombre_conductor = ?;";
            PreparedStatement cmd = getCn().prepareStatement(sql);//Llena los parametros
            cmd.setString(1, nombreconductor);
            //Si da error devuelve 1, caso contrario 0
            //toma en cuenta el "!" de negación
            if (!cmd.execute()){
                resp= true;  
            }
            cmd.close();
            getCn().close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return resp;
    }     
        
         
    public int Consultargrua(String nombre){
        Integer codigo=null;
      String consulta = "Select id_gruas from gruas where nombre_grua= ?";
      
        try {
            PreparedStatement cmd = getCn().prepareStatement(consulta);
            cmd.setString(1,nombre);
            
             ResultSet rs = cmd.executeQuery();
             
             if(rs.next()){
                 
                 codigo = rs.getInt(1);
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(mantenimientoconductores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally{
            
            return codigo;
        }
        
    }
    
      public int Consultarestado(String nombre){
        Integer codigo=null;
      String consulta = "Select id_estado from estado where estado= ?";
      
        try {
            PreparedStatement cmd = getCn().prepareStatement(consulta);
            cmd.setString(1,nombre);
            
             ResultSet rs = cmd.executeQuery();
             
             if(rs.next()){
                 
                 codigo = rs.getInt(1);
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(mantenimientoconductores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally{
            
            return codigo;
        }
        
    }


}
