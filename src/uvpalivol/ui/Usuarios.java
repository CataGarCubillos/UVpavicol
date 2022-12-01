package uvpalivol.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
import uvpavicol.clases.Departamento;
import uvpavicol.clases.Empresa;
import uvpavicol.clases.EstadoConvenio;
import uvpavicol.clases.Galpon;
import uvpavicol.clases.Granja;
import uvpavicol.clases.Lote;
import uvpavicol.clases.Municipio;
import uvpavicol.clases.Propietario;
import uvpavicol.clases.RegistradoException;
import uvpavicol.clases.TipoGranja;

import uvpavicol.clases.Usuario;

public class Usuarios extends javax.swing.JInternalFrame {

    private Granja granja;
    private Empresa empresa;
    private Usuario usuarioRegistrado;
    private Lote lote;
    private Galpon galpon;
    private Municipio municipio;
    private Departamento departamento;
    private Propietario propietario;

    public Usuarios(Empresa empresa) {
        this.empresa = empresa;

        initComponents();
        txtNombre.setVisible(false);
        lblNombre.setVisible(false);
        btnCrear.setVisible(false);

        btnHide.addActionListener(new Borrar());
        btnRegistrar.addActionListener(new ManejadorRegistrar());
        btnCrear.addActionListener(new ManejadorCrear());
        btnIngresar1.addActionListener(new ManejadorIngresar());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        btnIngresar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnHide = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();
        lblVacio1 = new javax.swing.JLabel();
        lblVacío2 = new javax.swing.JLabel();
        lblVacio3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setBackground(new java.awt.Color(255, 204, 204));
        desktop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo usuario.png"))); // NOI18N
        desktop.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 110));

        btnIngresar1.setBackground(new java.awt.Color(102, 51, 0));
        btnIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar1.setText("Ingresar");
        btnIngresar1.setToolTipText("");
        btnIngresar1.setBorderPainted(false);
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        desktop.add(btnIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 282, -1, 30));

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 190, 370));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Te estábamos");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("esperando");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("E-mail");

        txtCorreo.setBackground(new java.awt.Color(255, 204, 204));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contraseña");

        btnCrear.setBackground(new java.awt.Color(102, 51, 0));
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.setToolTipText("");
        btnCrear.setBorderPainted(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel1.setText("¿No tienes una cuenta?");

        btnRegistrar.setBackground(new java.awt.Color(255, 102, 102));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Regístrate");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(255, 204, 204));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnHide.setBackground(new java.awt.Color(255, 102, 102));
        btnHide.setBorder(null);

        txtpass.setBackground(new java.awt.Color(255, 204, 204));
        txtpass.setForeground(new java.awt.Color(0, 0, 0));
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });

        lblVacio1.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        lblVacio1.setForeground(new java.awt.Color(102, 0, 0));

        lblVacío2.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        lblVacío2.setForeground(new java.awt.Color(102, 0, 0));

        lblVacio3.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        lblVacio3.setForeground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHide, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCrear)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblVacio3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(lblVacio1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblVacío2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnHide, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVacio1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVacío2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVacio3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        validarCamposVacios();

    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        validarCaracteres(evt);
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        validarCamposVacios();
// TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        validarCaracteres(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        validarCamposVacios();
    }//GEN-LAST:event_txtpassKeyReleased

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        validarCaracteres(evt);
    }//GEN-LAST:event_txtpassKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnHide;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblVacio1;
    private javax.swing.JLabel lblVacio3;
    private javax.swing.JLabel lblVacío2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

    //Métodos para validar caracteres y/o que los campos no estén vacíos
    //
    //
    public void validarCamposVacios() {
        
        //Validar campo de correo
        if (txtCorreo.getText().isEmpty()) {
            lblVacio1.setText("*Campo obligatorio");
            //Si no contiene @ o .com entonces es un correo no válido
        }
        else if (!txtCorreo.getText().contains("@")
                || !txtCorreo.getText().contains("gmail.com")) {
            lblVacio1.setText("*Correo NO válido");
        }
        else {
            lblVacio1.setText(" ");
        }
        //Validar campo contraseña
        if (txtpass.getText().isEmpty()) {
            lblVacío2.setText("*Campo Obligatorio");

        } else {
            lblVacío2.setText(" ");
        }
        //Validar Campo Nombre
        //Si el nombre es visible, entonces que se muestre su validación 
        if ( txtNombre.isVisible() ){
                  
        if (txtNombre.getText().isEmpty()) {
            lblVacio3.setText("*Campo Obligatorio");
        } else {
            lblVacio3.setText(" ");
        }
        }
    }
     //Caracteres no válidos
    public void validarCaracteres(java.awt.event.KeyEvent ev) {
        if (ev.getKeyChar() >= 32 && ev.getKeyChar() <= 44
                || ev.getKeyChar() == 47
                || ev.getKeyChar() >= 58 && ev.getKeyChar() <= 63
                || ev.getKeyChar() >= 91 && ev.getKeyChar() <= 94
                || ev.getKeyChar() == 96
                || ev.getKeyChar() >= 123 && ev.getKeyChar() <= 255) {
            ev.consume();
            JOptionPane.showMessageDialog(Usuarios.this, "No puedes usar ese tipo de caracter");
        }
    }

    
    //Botones
    //
    //
    //Botón oculto, que permite borrar los campos de texto, no aparece en la interfaz por cuestiones estéticas
    public class Borrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            txtCorreo.setText(" ");
            txtpass.setText("  ");
            txtNombre.setText(" ");

        }

    }

    //Manejador que permite al usuario ingresar al sistema
    public class ManejadorIngresar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {

                String email = txtCorreo.getText();
                String contra = txtpass.getText();

                usuarioRegistrado = empresa.buscarUsuario(email, contra);
                txtNombre.setText(usuarioRegistrado.getNombre());

                JOptionPane.showMessageDialog(null, "Hola de nuevo " + usuarioRegistrado.getNombre() + " Has Ingresado de manera exitosa");
                txtpass.setText("");
                txtNombre.setText("");
                txtCorreo.setText("");
            } catch (RegistradoException exc) {

                int option = JOptionPane.showConfirmDialog(Usuarios.this, "Las credenciales que digitó son de un usuario que no existe\n"
                        + "               ¿Le gustaría intentar Registrándose?", "Tenemos un problema", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    btnRegistrar.doClick();
                } else {
                    return;
                }
            } catch (Exception ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    //Manejador que permite desbloquear los txtFields y más botones para registrar el usuario
    public class ManejadorRegistrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            btnCrear.setVisible(true);
            lblNombre.setVisible(true);
            txtNombre.setVisible(true);

        }

    }

    //Manejador que permite Crear un nuevo usuario
    public class ManejadorCrear implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String nombre = txtNombre.getText();
                String contrasenia = txtpass.getText();
                String correo = txtCorreo.getText();

                usuarioRegistrado = new Usuario(nombre, correo, contrasenia);

                empresa.addUsuario(usuarioRegistrado);
                
                lblNombre.setVisible(false);
                txtNombre.setVisible(false);
                btnCrear.setVisible(false);

                JOptionPane.showMessageDialog(Usuarios.this, "El usuario se registró de forma exitosa");
            } catch (NullPointerException exc) {
                JOptionPane.showMessageDialog(Usuarios.this, "El usuario No se está creando");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Usuarios.this, ex);
            }

        }
    }

}
