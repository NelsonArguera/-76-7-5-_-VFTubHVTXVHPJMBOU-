package Clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class MembresiaUsuario {

    int id_membresia;
    int id_membre;
    int numero_de_membresia;
    LocalDate fecha_inicio;
    LocalDate fecha_fin;

    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

    public int getId_membre() {
        return id_membre;
    }

    public void setId_membre(int id_membre) {
        this.id_membre = id_membre;
    }

    public int getNumero_de_membresia() {
        return numero_de_membresia;
    }

    public void setNumero_de_membresia(int numero_de_membresia) {
        this.numero_de_membresia = numero_de_membresia;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    public static int consultar(String numero) {
        try(Connection con  = new Conexion().conectar();
            PreparedStatement cmd = con.prepareStatement("SELECT id_membresia,fecha_fin FROM membresia_usuario WHERE numero_de_membresia=?")) {
            
            cmd.setString(1, numero);
            
            ResultSet rs = cmd.executeQuery();
            if (rs.next()) {
                LocalDate fecha_fin = rs.getDate(2).toLocalDate();
                if (LocalDate.now().isBefore(fecha_fin) || LocalDate.now().equals(fecha_fin))
                    return rs.getInt(1);
                return 0;
            }
            
            return -1;
            
        } catch(Exception ex) {
            System.out.println(ex.toString());
            return -1;
        }
    }
    
    public boolean crear() {
        try(Connection con  = new Conexion().conectar();
            PreparedStatement cmd = con.prepareStatement("INSERT INTO membresia_usuario VALUES(?,?,?,?)")) {
            
            cmd.setInt(1, id_membre);
            cmd.setInt(2, numero_de_membresia);
            cmd.setDate(3, Date.valueOf(fecha_inicio));
            cmd.setDate(4, Date.valueOf(fecha_fin));
            
            cmd.execute();
            return true;
        } catch(Exception ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
}
