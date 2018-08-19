package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;

public class Membresia {

    int id_membre;
    String membresia;
    int meses;
    double costo;

    public int getId_membre() {
        return id_membre;
    }

    public void setId_membre(int id_membre) {
        this.id_membre = id_membre;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public static DefaultComboBoxModel consultar() {
        try(Connection con  = new Conexion().conectar();
            PreparedStatement cmd = con.prepareStatement("SELECT * FROM membresia")) {
            
            ResultSet rs = cmd.executeQuery();
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            
            while(rs.next()) {
                Membresia membresia = new Membresia();
                membresia.setId_membre(rs.getInt(1));
                membresia.setMembresia(rs.getString(2));
                membresia.setMeses(rs.getInt(3));
                membresia.setCosto(rs.getDouble(4));
                modelo.addElement(membresia);
            }
            
            return modelo;
            
        } catch(Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
    @Override
    public String toString() {
        return membresia;
    }
    
}
