/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo;

import Clases.MapInitializer;
import Clases.viaje;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.BorderLayout;
import java.util.ArrayList;
import org.kordamp.ikonli.materialdesign.MaterialDesign;
import org.kordamp.ikonli.swing.FontIcon;
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
public class pnlDick extends javax.swing.JPanel {
MapInitializer mapi = new MapInitializer();
viaje BDManage =new viaje();
 
    /**
     * Creates new form pnlDick
     */
    public pnlDick() {
        initComponents();
        initComponents();
        TextAutoCompleter clienteCompleter = new TextAutoCompleter(txtUsuario);
        MapInitializer Map = new MapInitializer();
            cmbConductor.removeAllItems();
            FontIcon icon = new FontIcon();
            icon.setIkon(MaterialDesign.MDI_CLOSE_CIRCLE);
            icon.setIconSize(25);
     
           FontIcon icon2 = new FontIcon();
            icon2.setIkon(MaterialDesign.MDI_ARROW_DOWN_BOLD_CIRCLE);
            icon2.setIconSize(25);

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
            mapi.setBounds(0, 0, 600, 400);
            jPanel1.add(mapi, BorderLayout.CENTER);  
            
            //Para hacer los radio buttons invisibles
            
            radbtnEfectivo.setVisible(false);
            radbtnTarjeta.setVisible(false);
            
            //anadir action listener
            
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

        setBackground(new java.awt.Color(255, 255, 255));

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
                .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        materialPanel1Layout.setVerticalGroup(
            materialPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(materialPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPregunta)))
        );

        txtlugar_destino.setToolTipText("");
        txtlugar_destino.setAccent(new java.awt.Color(33, 33, 33));
        txtlugar_destino.setHint("Lugar de destino");
        txtlugar_destino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlugar_destinoFocusGained(evt);
            }
        });
        txtlugar_destino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlugar_destinoEnterDirections(evt);
            }
        });

        txtlugar_inicio.setAccent(new java.awt.Color(33, 33, 33));
        txtlugar_inicio.setHint("Lugar de Inicio");
        txtlugar_inicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtlugar_inicioFocusLost(evt);
            }
        });

        txtdistancia_km.setText("Kilometros Recorridos");
        txtdistancia_km.setToolTipText("");
        txtdistancia_km.setAccent(new java.awt.Color(33, 33, 33));
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

        txtUsuario.setAccent(new java.awt.Color(33, 33, 33));
        txtUsuario.setHint("cliente");

        txtPrecio.setEditable(false);
        txtPrecio.setAccent(new java.awt.Color(33, 33, 33));

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
                        .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(materialPanel3Layout.createSequentialGroup()
                                .addComponent(iconConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iconCCV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iconCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iconKilometro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdistancia_km, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbConductor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(materialPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(radbtnEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(radbtnTarjeta))))
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(materialPanel3Layout.createSequentialGroup()
                                .addComponent(iconMarkerDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtlugar_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(materialPanel3Layout.createSequentialGroup()
                                .addComponent(iconMarker1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtlugar_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(materialIconButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        materialPanel3Layout.setVerticalGroup(
            materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel3Layout.createSequentialGroup()
                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addComponent(txtlugar_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtlugar_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdistancia_km, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(iconMarker1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(iconMarkerDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(iconKilometro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(iconConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(materialPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(iconCCV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radbtnEfectivo)
                    .addComponent(radbtnTarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(materialIconButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(materialPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(materialPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(materialPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(materialPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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
        
        if (BDManage.CambiarEstadoConductor()) {
            System.out.println("El estado del conductor a cambiado");
        }
        else{
            System.out.println("nel pta");
        }
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtlugar_destinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlugar_destinoFocusGained
        // TODO add your handling code here:
        txtlugar_destino.setText("");
    }//GEN-LAST:event_txtlugar_destinoFocusGained

    private void txtlugar_destinoEnterDirections(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlugar_destinoEnterDirections
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_txtlugar_destinoEnterDirections

    private void txtlugar_inicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlugar_inicioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlugar_inicioFocusLost

    private void txtdistancia_kmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdistancia_kmFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdistancia_kmFocusGained
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
                System.out.println("Status de la Membresia adquirida");
            }
            else{
                System.out.println("Membresia No adquirida");
            }
            
             //Si tiene membresia solo se le hace el descuento, si no va a poder seleccionar el tipo de pago
               
            int Membresia = BDManage.getMembresia();
            System.out.println("El id de la membresia es " +Membresia);
            int tipo_tarjeta =1;
            int tipo_efectivo=2;
            int tipo_descuento =3;
            if(Membresia ==1){
                radbtnEfectivo.setVisible(true);
                radbtnTarjeta.setVisible(true);
                if (radbtnEfectivo.isSelected()) {
                    BDManage.setTipo_pago(tipo_efectivo);
                }
                else if(radbtnTarjeta.isSelected()){
                    BDManage.setTipo_pago(tipo_tarjeta);
                }
                
            }
            else if( Membresia==2){
                BDManage.setTipo_pago(tipo_descuento);
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

          

        }
    }//GEN-LAST:event_materialIconButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton btnAgregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbConductor;
    private javax.swing.JLabel iconCCV;
    private javax.swing.JLabel iconCliente;
    private javax.swing.JLabel iconConductor;
    private javax.swing.JLabel iconKilometro;
    private javax.swing.JLabel iconMarker1;
    private javax.swing.JLabel iconMarkerDestiny;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPregunta;
    private de.craften.ui.swingmaterial.MaterialIconButton materialIconButton1;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
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
