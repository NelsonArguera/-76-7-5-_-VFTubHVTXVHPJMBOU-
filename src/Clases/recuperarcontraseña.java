
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovany Fuentes
 */
public final class recuperarcontraseña {
    
    static Conexion metodo = new Conexion();
    
    public static String[] obtenerDatos(String usuario) {
        try(Connection conet = metodo.conectar();
            PreparedStatement cmd = conet.prepareStatement("SELECT contraseña, pregunta, respuesta FROM usuarios WHERE nombre_usuario=?")) {
            
            cmd.setString(1, usuario);
            
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                String clave = AESAlgorithm.decrypt(rs.getString(1));
                return new String[] { clave, rs.getString(2), rs.getString(3) };
            } else
                JOptionPane.showMessageDialog(null, "El usuario no existe.");
            
        } catch(Exception ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Hubo un problema.");
        }
        
        return null;
        
    }
    
}
