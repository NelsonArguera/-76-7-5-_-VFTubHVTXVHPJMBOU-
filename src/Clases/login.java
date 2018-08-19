/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import expo.newuser;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import expo.newuser;

/**
 *
 * @author Geovany Fuentes
 */
public final class login {

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    static Conexion metodo = new Conexion();
    private static String usuario;
    public static boolean validar_ingreso() {
          String usuario = newuser.txtusuario.getText();
        String clave = new String(newuser.txtcontrasena.getPassword());
       login.usuario = usuario;
        try(Connection conet = metodo.conectar();
            PreparedStatement cmd = conet.prepareStatement("SELECT Contrasena FROM usuarios WHERE nombre_usuario=?")) {
            
            cmd.setString(1, usuario);
            
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) { // Verificar si el usuario existe
                
                String claveCorrecta = AESAlgorithm.decrypt(rs.getString(1));
                if (claveCorrecta.equals(clave)) // Comparar claves
                    return true;
                
                JOptionPane.showMessageDialog(null, "Clave incorrecta.");
            } else
                JOptionPane.showMessageDialog(null, "El usuario no existe.");
            
        } catch(Exception ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "Hubo un problema.");
        }
        
        return false;

    }

}
