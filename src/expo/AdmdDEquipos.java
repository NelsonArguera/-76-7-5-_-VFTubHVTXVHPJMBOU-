/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo;

import Clases.MetodoAdGruas;
import javax.swing.JOptionPane;
import de.craften.ui.swingmaterial.ElevationEffect;
import de.craften.ui.swingmaterial.RippleEffect;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.EnumSet;
import javax.swing.Icon;
import javax.swing.JButton;
import org.jdesktop.core.animation.timing.TimingSource;
import org.kordamp.ikonli.swing.FontIcon;
import org.kordamp.ikonli.materialdesign.MaterialDesign;
import org.kordamp.ikonli.swing.IkonResolver;
import org.kordamp.ikonli.Ikonli;
import mdlaf.MaterialUIMovement;
import com.teamdev.jxmaps.swing.MapView;
import Clases.MapInitializer;
import java.awt.BorderLayout;
import com.mxrck.autocompleter.AutoCompleter;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nelso
 */
public class AdmdDEquipos extends javax.swing.JFrame {

    /**
     * Creates new form AdmdDEquipos
     */
    public AdmdDEquipos() {
        initComponents();
        //Para el nombre del conductor en el combobox
        ArrayList<String> nombre_conductor = new ArrayList<String>();
        MetodoAdGruas addName = new MetodoAdGruas();
        nombre_conductor = addName.LlenarConductorCombo();
        //Definiendo el apellido del conductor
        ArrayList<String> apellido_conductor = new ArrayList<String>();
        apellido_conductor = addName.llenarComboApellido();
        for (int i = 0; i < nombre_conductor.size(); i++) {
            cmbConductor.addItem(nombre_conductor.get(i)+ " ,"+ apellido_conductor.get(i));
            
        }
        //Para el nombre del equipo, en este caso la grua
        ArrayList<String> nombre_equipo = new ArrayList<String>();
        nombre_equipo = addName.LlenarGruasCombo();
        for (int i = 0; i < nombre_equipo.size(); i++) {
            cmbGruas.addItem(nombre_equipo.get(i));
        }
                //Para el nombre del equipo, en este caso la grua
        ArrayList<String> equipoasignado = new ArrayList<String>();
       equipoasignado = addName.LlenarGruasenusoCombo();
        for (int i = 0; i < equipoasignado.size(); i++) {
            cmbAsignados.addItem(equipoasignado.get(i));
        }
        //Asignar un icono al icon butto
        FontIcon Search = new FontIcon();
        Search.setIkon(MaterialDesign.MDI_WRENCH);
        iconSearch.setIcon(Search);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new de.craften.ui.swingmaterial.MaterialButton();
        materialPanel2 = new de.craften.ui.swingmaterial.MaterialPanel();
        lblGrua = new javax.swing.JLabel();
        lblConductor = new javax.swing.JLabel();
        cmbConductor = new de.craften.ui.swingmaterial.MaterialComboBox();
        cmbGruas = new de.craften.ui.swingmaterial.MaterialComboBox();
        iconSearch = new de.craften.ui.swingmaterial.MaterialIconButton();
        lblAsignados = new javax.swing.JLabel();
        cmbAsignados = new de.craften.ui.swingmaterial.MaterialComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID_Conductor", "ID_Grua"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 280, 250));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 173, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 173, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(33, 150, 242));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderRadius(5);
        btnGuardar.setMaximumSize(new java.awt.Dimension(135, 60));
        btnGuardar.setMinimumSize(new java.awt.Dimension(135, 60));
        btnGuardar.setPreferredSize(new java.awt.Dimension(135, 40));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 120, 68));

        lblGrua.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        lblGrua.setText("Asigne un equipo:");

        lblConductor.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        lblConductor.setText("Ingrese el conductor");

        iconSearch.setText("materialIconButton1");
        iconSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconSearchActionPerformed(evt);
            }
        });

        lblAsignados.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        lblAsignados.setText("Equipos ya Asignados:");

        javax.swing.GroupLayout materialPanel2Layout = new javax.swing.GroupLayout(materialPanel2);
        materialPanel2.setLayout(materialPanel2Layout);
        materialPanel2Layout.setHorizontalGroup(
            materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(materialPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConductor)
                    .addComponent(lblGrua)
                    .addComponent(lblAsignados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAsignados, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(cmbGruas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        materialPanel2Layout.setVerticalGroup(
            materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(materialPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblConductor))
                    .addComponent(cmbConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(materialPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblGrua))
                    .addComponent(cmbGruas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(materialPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblAsignados))
                    .addGroup(materialPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(iconSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(materialPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 520, 340));

        jPanel1.setBackground(new java.awt.Color(255, 179, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administracion de Equipos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 437, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 70));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        int Posicion = cmbConductor.getSelectedIndex();
        String Nombre = (String) cmbConductor.getItemAt(Posicion);
        System.out.println(Nombre);
        //Se obtiene el nombre del conductor y se divide en  2
        String[] NombreConductorSplit = Nombre.split(" ,", 2);
        String NombresCon = NombreConductorSplit[0];
        String ApellidosCon= NombreConductorSplit[1];
        //Se inserta el nombre y apellido del conductor
        MetodoAdGruas BDManageAdGruas = new MetodoAdGruas();
        BDManageAdGruas.setNombre_conductor(NombresCon);
        BDManageAdGruas.setApellido_conductor(ApellidosCon);
        
        int Id_conductor;
        if (BDManageAdGruas.GetIDConductor()) {
            Id_conductor = BDManageAdGruas.getId_conductor();
            
            System.out.println("El ID del conductor " +NombresCon +" es "+Id_conductor);
        }
        int PosicionGrua = cmbGruas.getSelectedIndex();
        String Nombre_Grua = (String) cmbGruas.getItemAt(PosicionGrua);
        BDManageAdGruas.setNombre_grua(Nombre_Grua);
        
        
        int Id_grua;
        if (BDManageAdGruas.GetIDGrua()) {
            Id_grua = BDManageAdGruas.getId_gruas();
            System.out.println("El id de la grua "+Nombre_Grua+ " es: "+Id_grua);
              BDManageAdGruas.setId_gruas(Id_grua);
        }
        int Confimar = JOptionPane.showConfirmDialog(this, "Desea usar esta grua con "+ Nombre, "ALERTA", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (Confimar == 0) {
            if (BDManageAdGruas.EstadoGruatoUso()) {
                System.out.println("El estado de la grua a cambiado");
            }
            else{
                System.out.println("ERROR");
            }
        }
        if (BDManageAdGruas.SetGrua()) {
            System.out.println("Datos de el conductor modificados");
        }
        else{
            System.out.println("error");
        }
           
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void iconSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconSearchActionPerformed
        // TODO add your handling code here:
    
        int Posicion = cmbAsignados.getSelectedIndex();
        String GruaAsignada = (String) cmbAsignados.getItemAt(Posicion);
        
        MetodoAdGruas BDManager = new MetodoAdGruas();
        
        BDManager.setNombre_grua(GruaAsignada);
        
        if (BDManager.GetIDGrua()) {
            System.out.println(BDManager.getId_gruas());
        }
        int ID_gruaAsignada = BDManager.getId_gruas();
        
        BDManager.setId_gruas(ID_gruaAsignada);
         //Para el nombre del equipo, en este caso la grua
        ArrayList<String> nombre_equipo = new ArrayList<String>();
        nombre_equipo = BDManager.LlenarGruasCombo();
        for (int i = 0; i < nombre_equipo.size(); i++) {
            cmbGruas.addItem(nombre_equipo.get(i));
        }
        if (BDManager.EstadoGruatoLibre()) {
            System.out.println("Grua liberada");
        }
       
        
       
        
    }//GEN-LAST:event_iconSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdmdDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmdDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmdDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmdDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmdDEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton btnGuardar;
    private de.craften.ui.swingmaterial.MaterialComboBox cmbAsignados;
    private de.craften.ui.swingmaterial.MaterialComboBox cmbConductor;
    private de.craften.ui.swingmaterial.MaterialComboBox cmbGruas;
    private de.craften.ui.swingmaterial.MaterialIconButton iconSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAsignados;
    private javax.swing.JLabel lblConductor;
    private javax.swing.JLabel lblGrua;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel2;
    // End of variables declaration//GEN-END:variables
}
