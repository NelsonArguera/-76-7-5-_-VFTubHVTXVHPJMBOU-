/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

/**
 *
 * @author Geovany Fuentes
 */
public class registrar {

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dui
     */
    public String getDui() {
        return dui;
    }

    /**
     * @param dui the dui to set
     */
    public void setDui(String dui) {
        this.dui = dui;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
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
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the id_tipoUsu
     */
    public String getId_tipoUsu() {
        return id_tipoUsu;
    }

    /**
     * @param id_tipoUsu the id_tipoUsu to set
     */
    public void setId_tipoUsu(String id_tipoUsu) {
        this.id_tipoUsu = id_tipoUsu;
    }

    /**
     * @return the id_membre
     */
    public String getId_membresia() {
        return id_membresia;
    }

    /**
     * @param id_membresia the id_membresia to set
     */
    public void setId_membresia(String id_membresia) {
        this.id_membresia = id_membresia;
    }
    //declarando los atributos, pedira importar la clase connection
    private Connection cn;
    private String nombre;
    private String apellido;
    private String dui;
    private String correo;
    private String nombre_usuario; 
    private String contraseña;
    private String pregunta;
    private String respuesta;
    private String id_tipoUsu;
    private String id_membresia;

    public static boolean existe_en_columna(String valor, String columna) {
        try(Connection con  = new Conexion().conectar();
            PreparedStatement cmd = con.prepareStatement("SELECT 1 FROM usuarios WHERE " + columna + "=?")) {

            cmd.setString(1, valor);
            
            ResultSet rs = cmd.executeQuery();
            return rs.next();
            
        } catch(Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
        //Estableciendo la conexion con la base de datos en el constructor
    public registrar(){
        //Estableciendo la conexion
        Conexion con = new Conexion();
        cn = con.conectar();
    }
                //GUARDAR USUARIO
        public boolean guardarusuario(){
        boolean resp = false;
        try {//realiza consulta INSERT
            String sql= "INSERT INTO usuarios(nombre, apellido,"
                    + "dui,correo, nombre_usuario,contrasena,pregunta,respuesta,id_tipoUsu,id_membresia, id_rango)"
        +"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
           PreparedStatement cmd = getCn().prepareStatement (sql);
           cmd.setString(1, nombre);
           cmd.setString(2, apellido);
           cmd.setString(3, dui);
           cmd.setString(4, correo);
           cmd.setString(5, nombre_usuario);
           cmd.setString(6, AESAlgorithm.encrypt(contraseña));
           cmd.setString(7, pregunta);
           cmd.setString(8, respuesta);          
           cmd.setInt(9, id_membresia == null ? 1 : 2); 
           if (id_membresia == null)
               cmd.setNull(10, Types.INTEGER);         
           else
               cmd.setInt(10, Integer.parseInt(id_membresia));
           
           cmd.setInt(11, 2);
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

}
