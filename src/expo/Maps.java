/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo;
import Clases.viaje;
import com.teamdev.jxmaps.ControlPosition;
import com.teamdev.jxmaps.MapOptions;
import com.teamdev.jxmaps.MapTypeControlOptions;
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
import mdlaf.button.MaterialButtonUI;
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
 * @author Enrique
 */
public class Maps extends javax.swing.JFrame{
MapInitializer mapi = new MapInitializer();
viaje BDManage =new viaje();
 
    /**
     * Creates new form Maps
     */
    public Maps() {
        
        initComponents();
        TextAutoCompleter clienteCompleter = new TextAutoCompleter(txtUsuario);
        MapInitializer Map = new MapInitializer();
            cmbConductor.removeAllItems();
            FontIcon icon = new FontIcon();
            icon.setIkon(MaterialDesign.MDI_CLOSE_CIRCLE);
            icon.setIconSize(25);
           btnCerrar.setIcon(icon);   
           FontIcon icon2 = new FontIcon();
            icon2.setIkon(MaterialDesign.MDI_ARROW_DOWN_BOLD_CIRCLE);
            icon2.setIconSize(25);
            materialIconButton4.setIcon(icon2);
            materialIconButton4.setIconTextGap(6);
//           MaterialUIMovement.add(jButton1, MaterialColors.BLUE_900);
            FontIcon marker = new FontIcon();
            marker.setIkon(MaterialDesign.MDI_MAP_MARKER);
            marker.setIconSize(25);
            ///
            FontIcon markermultiple = new FontIcon();
            markermultiple.setIkon(MaterialDesign.MDI_MAP_MARKER_MULTIPLE);
            markermultiple.setIconSize(25);
            iconMarker1.setIcon(marker);
            iconMarkerDestiny.setIcon(markermultiple);
            
            ///
            FontIcon speedometer =new FontIcon();
            speedometer.setIkon(MaterialDesign.MDI_SPEEDOMETER);
            speedometer.setIconSize(25);
            iconKilometro.setIcon(speedometer);
            
            ///
            FontIcon conductor = new FontIcon();
            conductor.setIkon(MaterialDesign.MDI_ACCOUNT_CHECK);
            conductor.setIconSize(25);
            iconConductor.setIcon(conductor);
            
            ///
            FontIcon cliente =new FontIcon();
            cliente.setIkon(MaterialDesign.MDI_ACCOUNT);
            cliente.setIconSize(25);
            iconCliente.setIcon(cliente);
            
            //Font USD
            FontIcon usd = new FontIcon();
            usd.setIkon(MaterialDesign.MDI_CURRENCY_USD);
            usd.setIconSize(25);
            iconCCV.setIcon(usd);
            //font arrow right
             FontIcon arrow =new FontIcon();
             arrow.setIkon(MaterialDesign.MDI_ARROW_RIGHT);
             arrow.setIconSize(25);
             materialIconButton1.setIcon(arrow);
             
             //Creacion del arraylist para el combobox;
            ArrayList<String> NombreConductor = new ArrayList<String>();
            ArrayList<String> ApellidoConductor = new ArrayList<String>();
            //Creando el obj de viaje
            viaje viajee = new viaje();
            //Se asigna la lista que se retorna en el metodo para que esta lista se llene
            NombreConductor =viajee.llenarCombo();
            ApellidoConductor = viajee.llenarComboApellido();
            
            //Llena el combobox desde el arraylist ya creado
//            cmbConductor.addItem(lista.toString());
            //Se crea un ciclo for para anadir las consultas en una linea del index diferente
               for (int i = 0; i < NombreConductor.size(); i++) {
            cmbConductor.addItem(NombreConductor.get(i)+ " ,"+ ApellidoConductor.get(i));
        }
               ArrayList<String> clientesNombre = new ArrayList<String>();
               clientesNombre =viajee.llenarClientesNombre();
                ArrayList<String> clientesApellido = new ArrayList<>();
               clientesApellido = viajee.llenarClientesApellido();
               
               for (int i = 0; i < clientesNombre.size(); i++) 
               {
                    clienteCompleter.addItem(clientesNombre.get(i)+ " ," +clientesApellido.get(i));
            
               }
              
               
            
            jPanel1.setLayout(null);
            //Se configura el tamano del componente para que no se cree uno por uno el tamano de
            //los componentes al agregarlo en un nodo
            mapi.setBounds(0, 0, 610, 430);
            jPanel1.add(mapi, BorderLayout.CENTER);     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        materialPanel2 = new de.craften.ui.swingmaterial.MaterialPanel();
        btnCerrar = new de.craften.ui.swingmaterial.MaterialIconButton();
        materialIconButton3 = new de.craften.ui.swingmaterial.MaterialIconButton();
        materialIconButton4 = new de.craften.ui.swingmaterial.MaterialIconButton();
        materialPanel1 = new de.craften.ui.swingmaterial.MaterialPanel();
        btnAgregar = new de.craften.ui.swingmaterial.MaterialButton();
        lblPregunta = new javax.swing.JLabel();
        materialPanel3 = new de.craften.ui.swingmaterial.MaterialPanel();
        txtlugar_destino = new de.craften.ui.swingmaterial.MaterialTextField();
        iconMarkerDestiny = new javax.swing.JLabel();
        txtlugar_inicio = new de.craften.ui.swingmaterial.MaterialTextField();
        iconMarker1 = new javax.swing.JLabel();
        txtdistancia_km = new de.craften.ui.swingmaterial.MaterialTextField();
        iconKilometro = new javax.swing.JLabel();
        radbtnEfectivo = new javax.swing.JRadioButton();
        radbtnTarjeta = new javax.swing.JRadioButton();
        txtUsuario = new de.craften.ui.swingmaterial.MaterialTextField();
        txtPrecio = new de.craften.ui.swingmaterial.MaterialTextField();
        iconConductor = new javax.swing.JLabel();
        iconCCV = new javax.swing.JLabel();
        iconCliente = new javax.swing.JLabel();
        materialIconButton1 = new de.craften.ui.swingmaterial.MaterialIconButton();
        cmbConductor = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setPreferredSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 179, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel1.setText("Crea un nuevo viaje:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 27, -1, -1));

        materialPanel2.setBackground(new java.awt.Color(255, 224, 130));

        btnCerrar.setBackground(new java.awt.Color(255, 213, 79));
        btnCerrar.setText("materialIconButton1");
        btnCerrar.setMargin(new java.awt.Insets(0, 0, 0, 100));
        btnCerrar.setPreferredSize(new java.awt.Dimension(50, 30));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        materialIconButton3.setBackground(new java.awt.Color(255, 213, 79));
        materialIconButton3.setText("materialIconButton1");
        materialIconButton3.setMargin(new java.awt.Insets(0, 0, 0, 100));
        materialIconButton3.setPreferredSize(new java.awt.Dimension(50, 30));

        materialIconButton4.setBackground(new java.awt.Color(255, 213, 79));
        materialIconButton4.setText("materialIconButton1");
        materialIconButton4.setMargin(new java.awt.Insets(0, 0, 0, 100));
        materialIconButton4.setPreferredSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout materialPanel2Layout = new javax.swing.GroupLayout(materialPanel2);
        materialPanel2.setLayout(materialPanel2Layout);
        materialPanel2Layout.setHorizontalGroup(
            materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materialIconButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(materialIconButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        materialPanel2Layout.setVerticalGroup(
            materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialPanel2Layout.createSequentialGroup()
                .addGroup(materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materialIconButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materialIconButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.add(materialPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 90));

        btnAgregar.setBackground(new java.awt.Color(33, 150, 242));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorderRadius(5);
        btnAgregar.setMaximumSize(new java.awt.Dimension(135, 60));
        btnAgregar.setMinimumSize(new java.awt.Dimension(135, 60));
        btnAgregar.setPreferredSize(new java.awt.Dimension(135, 40));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblPregunta.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblPregunta.setText("Deseas agregar este viaje?");

        javax.swing.GroupLayout materialPanel1Layout = new javax.swing.GroupLayout(materialPanel1);
        materialPanel1.setLayout(materialPanel1Layout);
        materialPanel1Layout.setHorizontalGroup(
            materialPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        materialPanel1Layout.setVerticalGroup(
            materialPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(materialPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPregunta)))
        );

        getContentPane().add(materialPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 400, -1));

        txtlugar_destino.setToolTipText("");
        txtlugar_destino.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtlugar_destino.setHint("Lugar de destino");
        txtlugar_destino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlugar_destinoFocusGained(evt);
            }
        });
        txtlugar_destino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterDirections(evt);
            }
        });

        txtlugar_inicio.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtlugar_inicio.setHint("Lugar de Inicio");
        txtlugar_inicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlugar_inicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtlugar_inicioFocusLost(evt);
            }
        });

        txtdistancia_km.setText("Kilometros Recorridos");
        txtdistancia_km.setToolTipText("");
        txtdistancia_km.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtdistancia_km.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdistancia_kmFocusGained(evt);
            }
        });

        buttonGroup1.add(radbtnEfectivo);
        radbtnEfectivo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        radbtnEfectivo.setText("Efectivo");

        buttonGroup1.add(radbtnTarjeta);
        radbtnTarjeta.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        radbtnTarjeta.setText("Tarjeta");

        txtUsuario.setText("Cliente");
        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N

        materialIconButton1.setText("materialIconButton1");
        materialIconButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialIconButton1ActionPerformed(evt);
            }
        });

        cmbConductor.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cmbConductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout materialPanel3Layout = new javax.swing.GroupLayout(materialPanel3);
        materialPanel3.setLayout(materialPanel3Layout);
        materialPanel3Layout.setHorizontalGroup(
            materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addComponent(iconMarkerDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(txtlugar_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addComponent(iconMarker1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtlugar_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconKilometro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconCCV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdistancia_km, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbConductor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(materialPanel3Layout.createSequentialGroup()
                                .addComponent(radbtnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radbtnTarjeta)
                                .addGap(16, 16, 16))
                            .addGroup(materialPanel3Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(materialIconButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        materialPanel3Layout.setVerticalGroup(
            materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel3Layout.createSequentialGroup()
                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addComponent(txtlugar_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtlugar_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdistancia_km, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(iconMarker1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(iconMarkerDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(iconKilometro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(iconConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(iconCCV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(materialIconButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radbtnEfectivo)
                    .addComponent(radbtnTarjeta))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(materialPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 400, 520));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 610, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        int Aceptar = JOptionPane.showConfirmDialog(this, "Desea Agregar este viaje?", "ATENCION", JOptionPane.YES_NO_OPTION);
        if (Aceptar==0) {
            if (BDManage.InsertarDatos()) {
                System.out.println("DATOS GUARDADOS");
            }
            else{
                System.out.println("MEEEEEEEEE ERROR");
            }
        }
 
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:]
       this.hide();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtlugar_inicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlugar_inicioFocusGained
        // TODO add your handling code here:
        txtlugar_inicio.setText("");
        
    }//GEN-LAST:event_txtlugar_inicioFocusGained

    private void txtlugar_inicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlugar_inicioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlugar_inicioFocusLost

    private void txtlugar_destinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlugar_destinoFocusGained
        // TODO add your handling code here:
        txtlugar_destino.setText("");
    }//GEN-LAST:event_txtlugar_destinoFocusGained

    private void txtdistancia_kmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdistancia_kmFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdistancia_kmFocusGained

    private void EnterDirections(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterDirections
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            
        }
    }//GEN-LAST:event_EnterDirections
int click = 0;
    private void materialIconButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialIconButton1ActionPerformed
        // TODO add your handling code here:
      
       //Se declaran las variables de inicio y de final del viaje
        String lugar_destino, lugar_inicio;
        //Se asigna el string lugar_inicio, y lugar_destino
        lugar_inicio= txtlugar_inicio.getText();
        lugar_destino= txtlugar_destino.getText();
        //Se manda el lugar inicio de el mapView
        mapi.setLugar_inicio(lugar_inicio);
        //Se manda el lugar destino del mapView
        mapi.setLugar_destino(lugar_destino);
        //Se devuelve el valor de la distancia del metodo getDistanc
        txtdistancia_km.setText(mapi.getDistanc()+" Kilometros");
        //Se llama a mapi.calcularDireccion para que los sitios se refresquen
        mapi.calcularDireccion();   
        double Precio;
        //Se crea una pequena tarifa
        Precio = mapi.getDistanc()*0.0045;
        //Prueba del precio
        txtPrecio.setText(Precio+" es su total");
        //Contador del segundo click
        click ++;
        BDManage.setLugar_inicio(lugar_inicio);
            BDManage.setLugar_destino(lugar_destino);
        if (click>1) {
            
                //Distancia
                BDManage.setDistancia_km(mapi.getDistanc());
                //Se obtiene la string del textbox usuario
                String Nombre = txtUsuario.getText();
                //Se parte en 2 para buscar solo por el nombre o solo por el apellido
                String NombreSplit = Nombre.split(" ,")[0];
                //Se hace una prueba que funcione
                System.out.println(NombreSplit);
                //Se asigna el NombreSplit al metodo setNombre_usuario
                BDManage.setNombre_usuario(NombreSplit);
                //Se verifca que retorne true
                if (BDManage.GetIDusuario()) {
                    //Se despliega el id en el sout
                    int id_usuario= (BDManage.getId_usuario());
                    //TADAAAAA WINK WINK
                    BDManage.setId_usuario(id_usuario);
                    
                }
                int Posicion = cmbConductor.getSelectedIndex();
                String NombreConductor = cmbConductor.getItemAt(Posicion);
                
                String[] NombreConductorSplit = NombreConductor.split(" ,", 2);
                String ConductorNombre =NombreConductorSplit[0];
                String ConductorApellido = NombreConductorSplit[1];
                
                BDManage.setNombre_conductor(ConductorNombre);
                BDManage.setApellido_conductor(ConductorApellido);
                
                if (BDManage.GetIDConductor()) {
                    int id_conductor = BDManage.getId_conductor();
                    System.out.println("Id del conductor "+id_conductor);
                    BDManage.setId_conductor(id_conductor);
                }
                else{
                    
                }
                if (BDManage.PMembresia()) {
                    System.out.println("Membresia Adquirida");
                }
                else{
                    System.out.println("Membresia No adquirida");
                }
                
                int Membresia = BDManage.getMembresia();
                System.out.println(Membresia);
                int tipo_tarjeta =1;
                int tipo_efectivo=2;
                if(Membresia ==1){
                    
                    BDManage.setTipo_pago(tipo_tarjeta);
                    
                }
                else{
                    BDManage.setTipo_pago(tipo_efectivo);
                }
                
                
                //Por ultimo enviando el parametro del precio
                
                BDManage.setPrecio_viaje(Precio);
               
                SimpleDateFormat sdf = new SimpleDateFormat(
    "MM-dd-yyyy");
int year = 2014;
int month = 10;
int day = 31;
Calendar cal = Calendar.getInstance();
cal.set(Calendar.YEAR, year);
cal.set(Calendar.MONTH, month - 1); // <-- months start
                                    // at 0.
cal.set(Calendar.DAY_OF_MONTH, day);

java.sql.Date date = new java.sql.Date(cal.getTimeInMillis());
System.out.println(sdf.format(date));
            
BDManage.setFecha("7/22/2018");

                //Saber si el cliente tiene membresia
                
       
       
        }    
    }//GEN-LAST:event_materialIconButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Maps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton btnAgregar;
    private de.craften.ui.swingmaterial.MaterialIconButton btnCerrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbConductor;
    private javax.swing.JLabel iconCCV;
    private javax.swing.JLabel iconCliente;
    private javax.swing.JLabel iconConductor;
    private javax.swing.JLabel iconKilometro;
    private javax.swing.JLabel iconMarker1;
    private javax.swing.JLabel iconMarkerDestiny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPregunta;
    private de.craften.ui.swingmaterial.MaterialIconButton materialIconButton1;
    private de.craften.ui.swingmaterial.MaterialIconButton materialIconButton3;
    private de.craften.ui.swingmaterial.MaterialIconButton materialIconButton4;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel2;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel3;
    private javax.swing.JRadioButton radbtnEfectivo;
    private javax.swing.JRadioButton radbtnTarjeta;
    private de.craften.ui.swingmaterial.MaterialTextField txtPrecio;
    private de.craften.ui.swingmaterial.MaterialTextField txtUsuario;
    private de.craften.ui.swingmaterial.MaterialTextField txtdistancia_km;
    private de.craften.ui.swingmaterial.MaterialTextField txtlugar_destino;
    private de.craften.ui.swingmaterial.MaterialTextField txtlugar_inicio;
    // End of variables declaration//GEN-END:variables
}
