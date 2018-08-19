/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author Nelso
 */
public class MetodoAdGruas {

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
    
    
    
     private  Connection cn;
    private  Integer id_gruas ;
    private Integer id_conductor;
    private String nombre_conductor;
    private String apellido_conductor;
    private String nombre_grua;
    
    public MetodoAdGruas(){
    Conexion con = new Conexion();
    cn = con.conectar();
    }
            

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
     * @return the id_gruas
     */
    public Integer getId_gruas() {
        return id_gruas;
    }

    /**
     * @param id_gruas the id_gruas to set
     */
    public void setId_gruas(Integer id_gruas) {
        this.id_gruas = id_gruas;
    }

    /**
     * @return the id_conductor
     */
    public Integer getId_conductor() {
        return id_conductor;
    }

    /**
     * @param id_conductor the id_conductor to set
     */
    public void setId_conductor(Integer id_conductor) {
        this.id_conductor = id_conductor;
    }
    
     //metodo para buscar
      public boolean consultaPareja(){
        boolean resp = false;
        try {
            String sql = "SELECT id_conductor, id_gruas FROM gruas WHERE id_gruas = ?;";
        PreparedStatement cmd = cn.prepareStatement(sql);
        cmd.setInt(1, id_gruas);
        
        ResultSet rs = cmd.executeQuery();
        
            if (rs.next()) {
                resp = true;
                
                     id_gruas = rs.getInt(1);
                    id_conductor = rs.getInt(2);
            }
               cmd.close();
               cn.close();
                
        } catch (Exception e) {
            
            System.out.println(e.toString());
        }
        return resp;
    }
    
    //metodo para Modificar
      
      public boolean modificapareja(){
      
      boolean resp = false;
          try {
              String sql = "UPDATE id_conductor, id_gruas FROM conductor WHERE id_conductor = ?;";
              PreparedStatement cmd = cn.prepareStatement(sql);
              
              cmd.setInt(1, id_gruas);
              cmd.setInt(2, id_conductor);
              
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
      
      //metodo para eliminar
      
      public boolean eliminarPareja(){
      boolean resp = false;
          try {
              String sql = "DELETE id_conductor, id_gruas FROM conductor WHERE id_conductor = ?;";
              PreparedStatement cmd = cn.prepareStatement(sql);
              cmd.setInt(1, id_gruas);
              
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
      
      //Guardar pareja
      
      public boolean guardarPareja(){
      boolean resp = false;
          try {
              String sql = "INSERT INTO conductor (id_conductor, id_gruas)" +"VALUES(?, ?)";
              PreparedStatement cmd = cn.prepareStatement(sql);
              
              cmd.setInt(1, id_gruas);
              cmd.setInt(2, id_conductor);
              
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
      public ArrayList<String> LlenarConductorCombo(){
          ArrayList<String> nombre_conductor = new ArrayList<String>();
          String sql ="Select nombre_conductor from conductor";
          try {
              PreparedStatement cmd = cn.prepareStatement(sql);
              
              ResultSet rs = cmd.executeQuery();
              while (rs.next()) {                  
                  nombre_conductor.add(rs.getString("nombre_conductor"));               
              }
                     
          } catch (Exception e) {
              System.out.println(e.toString());
          }
          return nombre_conductor;
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
    
      public ArrayList<String> LlenarGruasCombo(){
          ArrayList<String> gruasList = new ArrayList<String>();
          String sql ="Select nombre_grua from gruas where id_estado=1";
          try {
              PreparedStatement cmd = cn.prepareStatement(sql);
              
              ResultSet rs = cmd.executeQuery();
              while (rs.next()) {                  
                  gruasList.add(rs.getString("nombre_grua"));               
              }
                     
          } catch (Exception e) {
              System.out.println(e.toString());
          }
          return gruasList;
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
      public boolean GetIDGrua(){
     boolean resp = false;
        String sql ="Select id_gruas from gruas where nombre_grua=?";
        try {
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, nombre_grua);
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
                resp = true; 
                id_gruas= rs.getInt(1);
            }
            
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
}
      public boolean  SetGrua(){
          boolean resp = false;
          String sql="Update set id_gruas=? where id_conductor =?";
          try {
              PreparedStatement cmd = cn.prepareStatement(sql);
              cmd.setInt(1, id_gruas);
              cmd.setInt(2, id_conductor);
              if (!cmd.execute()) {
                  resp= true;
              }
          } catch (Exception e) {
              System.out.println(e.toString());
          }
          return resp;
      }
       public boolean EstadoGruatoUso(){
           boolean resp = false;
           String sql="Update gruas set id_estado= 2 where id_gruas=?";
           try {
               PreparedStatement cmd = cn.prepareStatement(sql);
               cmd.setInt(1, id_gruas);
               
               if (!cmd.execute()) {
                   resp= true;
               }
           } catch (Exception e) {
               System.out.println(e.toString());
           }
              return resp;
       }
       public ArrayList<String> LlenarGruasenusoCombo(){
          ArrayList<String> gruasList = new ArrayList<String>();
          String sql ="Select nombre_grua from gruas where id_estado=2";
          try {
              PreparedStatement cmd = cn.prepareStatement(sql);
              
              ResultSet rs = cmd.executeQuery();
              while (rs.next()) {                  
                  gruasList.add(rs.getString("nombre_grua"));               
              }
                     
          } catch (Exception e) {
              System.out.println(e.toString());
          }
          return gruasList;
      }
       public boolean EstadoGruatoLibre(){
           boolean resp = false;
           String sql="Update gruas set id_estado= 1 where id_gruas=?";
           try {
               PreparedStatement cmd = cn.prepareStatement(sql);
               cmd.setInt(1, id_gruas);
               
               if (!cmd.execute()) {
                   resp= true;
               }
           } catch (Exception e) {
               System.out.println(e.toString());
           }
              return resp;
       }
      
}
