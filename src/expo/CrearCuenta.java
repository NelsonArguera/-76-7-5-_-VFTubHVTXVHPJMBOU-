/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo;

import Clases.MembresiaUsuario;
import javax.swing.JOptionPane;
import Clases.registrar;
import org.apache.commons.codec.digest.DigestUtils;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import de.craften.ui.swingmaterial.MaterialTextField;
import java.awt.MouseInfo;
import java.awt.Point;
/**
 *
 * @author Estudiante
 */
public class CrearCuenta extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public CrearCuenta() {
        initComponents();
        lblnmembre.setVisible(false);
        txtmembresia.setVisible(false);
        txtnombre.grabFocus();
        btnregistrar.hide();
         lblcontraseña.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        materialPanel1 = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblrespuesta = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rbtnsi = new javax.swing.JRadioButton();
        rbtnno = new javax.swing.JRadioButton();
        lblnmembre = new javax.swing.JLabel();
        txtnombre = new de.craften.ui.swingmaterial.MaterialTextField();
        txtdui = new de.craften.ui.swingmaterial.MaterialFormattedTextField();
        txtapellido = new de.craften.ui.swingmaterial.MaterialTextField();
        txtmembresia = new de.craften.ui.swingmaterial.MaterialTextField();
        txtusuario = new de.craften.ui.swingmaterial.MaterialTextField();
        txtpregunta = new de.craften.ui.swingmaterial.MaterialTextField();
        txtrespuesta = new de.craften.ui.swingmaterial.MaterialTextField();
        txtcorreo = new de.craften.ui.swingmaterial.MaterialTextField();
        lblcontraseña = new javax.swing.JLabel();
        txtpassword = new de.craften.ui.swingmaterial.MaterialPasswordField();
        materialPanel4 = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel15 = new javax.swing.JLabel();
        btnregistrar = new de.craften.ui.swingmaterial.MaterialButton();
        materialPanel2 = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        materialPanel3 = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel7 = new javax.swing.JLabel();
        btnAcceder = new de.craften.ui.swingmaterial.MaterialButton();
        jPanel3 = new javax.swing.JPanel();
        iconClose = new de.craften.ui.swingmaterial.MaterialIconButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(992, 550));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/expoimagenes/Main.jpg"))); // NOI18N
        jLabel3.setBorder(new mdlaf.DropShadowBorder());
        jLabel3.setPreferredSize(new java.awt.Dimension(1500, 701));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 610, 440));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, 0));

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 690, 0));

        materialPanel1.setBackground(new java.awt.Color(224, 224, 244));
        materialPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        materialPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Nombre:");
        materialPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Apellido:");
        materialPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 60, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setText("Dui:");
        materialPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setText("Contraseña:");
        materialPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setText("Ingrese un usuario:");
        materialPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("Correo:");
        materialPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, 30));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setText("Pregunta:");
        materialPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        lblrespuesta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblrespuesta.setText("Respuesta:");
        materialPanel1.add(lblrespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel17.setText("Posee una Membresia?");
        materialPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 270, 30));

        rbtnsi.setBackground(new java.awt.Color(224, 224, 244));
        buttonGroup1.add(rbtnsi);
        rbtnsi.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        rbtnsi.setText("Si");
        rbtnsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnsiMouseClicked(evt);
            }
        });
        rbtnsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnsiActionPerformed(evt);
            }
        });
        materialPanel1.add(rbtnsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, -1, -1));

        rbtnno.setBackground(new java.awt.Color(224, 224, 244));
        buttonGroup1.add(rbtnno);
        rbtnno.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        rbtnno.setText("No");
        rbtnno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnnoMouseClicked(evt);
            }
        });
        materialPanel1.add(rbtnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        lblnmembre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblnmembre.setText("N° Membresia:");
        materialPanel1.add(lblnmembre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        txtnombre.setAccent(new java.awt.Color(33, 33, 33));
        txtnombre.setHint("Nombre");
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        materialPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 70));

        txtdui.setBackground(new java.awt.Color(224, 224, 244));
        txtdui.setAccent(new java.awt.Color(33, 33, 33));
        txtdui.setHint("Dui");
        txtdui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtduiKeyTyped(evt);
            }
        });
        materialPanel1.add(txtdui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 184, 200, 70));

        txtapellido.setAccent(new java.awt.Color(33, 33, 33));
        txtapellido.setHint("Apellido");
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        materialPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 70));
        materialPanel1.add(txtmembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 200, 60));

        txtusuario.setAccent(new java.awt.Color(33, 33, 33));
        txtusuario.setHint("Usuario");
        materialPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 70));

        txtpregunta.setAccent(new java.awt.Color(33, 33, 33));
        txtpregunta.setHint("Pregunta");
        materialPanel1.add(txtpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 200, 70));

        txtrespuesta.setAccent(new java.awt.Color(33, 33, 33));
        txtrespuesta.setHint("Respuesta");
        materialPanel1.add(txtrespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 200, 70));

        txtcorreo.setAccent(new java.awt.Color(33, 33, 33));
        txtcorreo.setHint("Correo");
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });
        materialPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 200, 70));

        lblcontraseña.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(0, 0, 204));
        lblcontraseña.setText("Olvidaste tu contraseña?");
        lblcontraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcontraseñaMouseClicked(evt);
            }
        });
        materialPanel1.add(lblcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, 220, -1));

        txtpassword.setAccent(new java.awt.Color(33, 33, 33));
        txtpassword.setHint("Password");
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        materialPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 70));

        materialPanel4.setBackground(new java.awt.Color(33, 33, 33));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Crear una Cuenta");

        javax.swing.GroupLayout materialPanel4Layout = new javax.swing.GroupLayout(materialPanel4);
        materialPanel4.setLayout(materialPanel4Layout);
        materialPanel4Layout.setHorizontalGroup(
            materialPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel4Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel15)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        materialPanel4Layout.setVerticalGroup(
            materialPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        materialPanel1.add(materialPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 90));
        materialPanel4.getAccessibleContext().setAccessibleDescription("");

        btnregistrar.setBackground(new java.awt.Color(255, 235, 59));
        btnregistrar.setText("Registrarse!");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        materialPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 160, 80));

        getContentPane().add(materialPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 410, 720));

        materialPanel2.setBackground(new java.awt.Color(255, 152, 0));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setText("Y tu?");

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 28)); // NOI18N
        jLabel1.setText("hasta donde quieres llegar?");

        javax.swing.GroupLayout materialPanel2Layout = new javax.swing.GroupLayout(materialPanel2);
        materialPanel2.setLayout(materialPanel2Layout);
        materialPanel2Layout.setHorizontalGroup(
            materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        materialPanel2Layout.setVerticalGroup(
            materialPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(materialPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 650, 150));

        materialPanel3.setBackground(new java.awt.Color(245, 124, 0));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel7.setText("Ya posees una cuenta?");

        btnAcceder.setBackground(new java.awt.Color(255, 235, 59));
        btnAcceder.setText("Acceder");
        btnAcceder.setBorderRadius(5);
        btnAcceder.setMaximumSize(new java.awt.Dimension(135, 60));
        btnAcceder.setMinimumSize(new java.awt.Dimension(135, 60));
        btnAcceder.setPreferredSize(new java.awt.Dimension(135, 40));
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout materialPanel3Layout = new javax.swing.GroupLayout(materialPanel3);
        materialPanel3.setLayout(materialPanel3Layout);
        materialPanel3Layout.setHorizontalGroup(
            materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        materialPanel3Layout.setVerticalGroup(
            materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialPanel3Layout.createSequentialGroup()
                .addGroup(materialPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(materialPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 640, 90));

        jPanel3.setBackground(new java.awt.Color(245, 124, 0));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        iconClose.setText("materialIconButton1");
        iconClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(984, Short.MAX_VALUE)
                .addComponent(iconClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(iconClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x , point.y -y);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void iconCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconCloseActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_iconCloseActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new newuser().setVisible(true);
        hide();
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        registrar  obj = new registrar();
        if (txtnombre.getText().isEmpty() || txtapellido.getText().isEmpty() || txtdui.getText().isEmpty() || txtusuario.getText().isEmpty() || txtpassword.getText().isEmpty() || txtcorreo.getText().isEmpty() || txtpregunta.getText().isEmpty() || txtrespuesta.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese datos, hay campos vacios ","atencion",JOptionPane.OK_OPTION);
        }
        else {

            if (registrar.existe_en_columna(txtdui.getText(), "dui")) {
                JOptionPane.showMessageDialog(this, "Ya existe un usuario con ese DUI.");
                return;
            }

            if (registrar.existe_en_columna(txtusuario.getText(), "nombre_usuario")) {
                JOptionPane.showMessageDialog(this, "Ya existe un usuario con ese Nombre de usuario.");
                return;
            }

            obj.setNombre(txtnombre.getText());
            obj.setApellido(txtapellido.getText());
            obj.setDui(txtdui.getText());
            obj.setNombre_usuario(txtusuario.getText());
            obj.setContraseña(String.valueOf(txtpassword.getPassword()));
            obj.setCorreo(txtcorreo.getText());
            obj.setPregunta(txtpregunta.getText());
            obj.setRespuesta(txtrespuesta.getText());

            if (rbtnsi.isSelected()) {
                if (txtmembresia.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Escribe un numero de membresia.");
                    return;
                }
                //-1: No existe.
                //0: Periodo expirado.
                int resultado = MembresiaUsuario.consultar(txtmembresia.getText());
                switch (resultado) {
                    case -1:
                    JOptionPane.showMessageDialog(this, "Esa membresia no existe.");
                    return;
                    case 0:
                    JOptionPane.showMessageDialog(this, "La membresia ha expirado.");
                    return;
                    default:
                    obj.setId_membresia(String.valueOf(resultado));
                    break;
                }
            }

            if(obj.guardarusuario()){
                JOptionPane.showMessageDialog(this, "Datos Guardados");
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar  datos");
            }

        }

        txtnombre.setText("");
        txtapellido.setText("");
        txtdui.setText("");
        txtusuario.setText("");
        txtpassword.setText("");
        txtcorreo.setText("");
        txtpregunta.setText("");
        txtrespuesta.setText("");
        txtmembresia.setText("");
        rbtnsi.setSelected(false);
        rbtnno.setSelected(false);
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void lblcontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcontraseñaMouseClicked
        this.setVisible(false);
        new recorverpass().setVisible(true);
        hide();
    }//GEN-LAST:event_lblcontraseñaMouseClicked

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        // TODO add your handling code here:
        valida(txtcorreo);
    }//GEN-LAST:event_txtcorreoKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras por favor");
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtduiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtduiKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar() ;
        if (Character.isLetter(validar) || (Character.isWhitespace(validar)) || (Character.isAlphabetic(validar))) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros por favor");
        }
    }//GEN-LAST:event_txtduiKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras por favor");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void rbtnnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnnoMouseClicked
        txtmembresia.setVisible(false);
        txtmembresia.setText("");
        lblnmembre.setVisible(false);
        btnregistrar.setVisible(true);
        lblcontraseña.setVisible(true);
    }//GEN-LAST:event_rbtnnoMouseClicked

    private void rbtnsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnsiActionPerformed

    }//GEN-LAST:event_rbtnsiActionPerformed

    private void rbtnsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnsiMouseClicked
        txtmembresia.setText("");
        txtmembresia.setVisible(true);
        lblnmembre.setVisible(true);
        btnregistrar.setVisible(true);
        lblcontraseña.setVisible(true);
    }//GEN-LAST:event_rbtnsiMouseClicked
        public boolean valida(JTextField tx){ 
        String validar=tx.getText(); 
        if(validar.indexOf("@")==0){ 
        return false; 
        } 
        return true; 
        }     private int x;
    private int y;
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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton btnAcceder;
    private de.craften.ui.swingmaterial.MaterialButton btnregistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private de.craften.ui.swingmaterial.MaterialIconButton iconClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblnmembre;
    private javax.swing.JLabel lblrespuesta;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel2;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel3;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel4;
    private javax.swing.JRadioButton rbtnno;
    private javax.swing.JRadioButton rbtnsi;
    private de.craften.ui.swingmaterial.MaterialTextField txtapellido;
    private de.craften.ui.swingmaterial.MaterialTextField txtcorreo;
    private de.craften.ui.swingmaterial.MaterialFormattedTextField txtdui;
    private de.craften.ui.swingmaterial.MaterialTextField txtmembresia;
    private de.craften.ui.swingmaterial.MaterialTextField txtnombre;
    private de.craften.ui.swingmaterial.MaterialPasswordField txtpassword;
    private de.craften.ui.swingmaterial.MaterialTextField txtpregunta;
    private de.craften.ui.swingmaterial.MaterialTextField txtrespuesta;
    private de.craften.ui.swingmaterial.MaterialTextField txtusuario;
    // End of variables declaration//GEN-END:variables


}
