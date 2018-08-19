/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Geovany Fuentes
 */
public class llenar_conductores extends Conexion{
    
        public DefaultComboBoxModel gruas() {
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         try {
            Connection cn = this.conectar();
            String sql = "select nombre_grua from gruas";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while (rs.next()) {
                 modelo.addElement(rs.getString(1));
             }
             cn.close();
             rs.close();
         } catch (Exception e) {
         }
         
         return modelo;
        }
    public DefaultComboBoxModel estado() {
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         try {
            Connection cn = this.conectar();
            String sql = "select estado from estado";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while (rs.next()) {
                 modelo.addElement(rs.getString(1));
             }
             cn.close();
             rs.close();
         } catch (Exception e) {
         }
         
         return modelo;
        }
    
     public DefaultComboBoxModel completargruas() {
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         try {
            Connection cn = this.conectar();
            String sql = "select id_grua  from gruas where nombre_grua = ?";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while (rs.next()) {
                 modelo.addElement(rs.getString(1));
             }
             cn.close();
             rs.close();
         } catch (Exception e) {
         }
         
         return modelo;
        }
      public DefaultComboBoxModel completarestado() {
         DefaultComboBoxModel modelo = new DefaultComboBoxModel();
         try {
            Connection cn = this.conectar();
            String sql = "select id_estado from estado where estado = ?";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
             while (rs.next()) {
                 modelo.addElement(rs.getString(1));
             }
             cn.close();
             rs.close();
         } catch (Exception e) {
         }
         
         return modelo;
        }
    
    
}
