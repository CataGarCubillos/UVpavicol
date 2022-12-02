package uvpalivol.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import uvpavicol.clases.Empresa;

public class Start extends javax.swing.JFrame {

    private Empresa empresa;

    public Start(Empresa empresa) {
        this.empresa = empresa;
        initComponents();

        btnGranja.addActionListener(new ManejadorAbirGestionGranja());
        btnUsuario1.addActionListener(new ManejadorAbrirUsuarios());
        btnGestLotes.addActionListener(new ManejadorGestionLotes());
        btnLote.addActionListener(new ManejadorCrearLotes());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        btnGranja = new javax.swing.JButton();
        btnUsuario1 = new javax.swing.JButton();
        btnLote = new javax.swing.JButton();
        Loguito = new javax.swing.JButton();
        btnGestLotes = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UVPavicol");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));
        jPanel5.setDoubleBuffered(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGranja.setBackground(new java.awt.Color(255, 102, 102));
        btnGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/building3.png"))); // NOI18N
        btnGranja.setBorderPainted(false);
        btnGranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGstnGranjaActionPerformed(evt);
            }
        });
        jPanel5.add(btnGranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 60, -1));

        btnUsuario1.setBackground(new java.awt.Color(255, 102, 102));
        btnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/useredit.png"))); // NOI18N
        btnUsuario1.setBorderPainted(false);
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel5.add(btnUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 60, -1));

        btnLote.setBackground(new java.awt.Color(255, 51, 51));
        btnLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gallina (1).png"))); // NOI18N
        btnLote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLote.setBorderPainted(false);
        btnLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(btnLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 60, -1));

        Loguito.setBackground(new java.awt.Color(255, 102, 102));
        Loguito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Univalle.png"))); // NOI18N
        Loguito.setBorder(null);
        Loguito.setBorderPainted(false);
        jPanel5.add(Loguito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 60, -1));

        btnGestLotes.setBackground(new java.awt.Color(255, 102, 102));
        btnGestLotes.setForeground(new java.awt.Color(255, 102, 102));
        btnGestLotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir Galpon.png"))); // NOI18N
        btnGestLotes.setBorder(null);
        btnGestLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestLotesActionPerformed(evt);
            }
        });
        jPanel5.add(btnGestLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 60, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(102, 0, 0));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoutcurve.png"))); // NOI18N
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel5.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 60, 70));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 60, 650));

        desktop.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo Navidad 2.png"))); // NOI18N

        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 990, 640));

        getAccessibleContext().setAccessibleDescription("Proyecto Final");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnGstnGranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGstnGranjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGstnGranjaActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnGestLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestLotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestLotesActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
       JOptionPane.showMessageDialog(Start.this, "¡Esperamos volver a verte pronto!");
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loguito;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGestLotes;
    private javax.swing.JButton btnGranja;
    private javax.swing.JButton btnLote;
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables





//Manejadores para abrir las ventanas
    
    //El botón Lote da nullPointerexception Ya que da algunos conflictos con el comboBox donde se agregan objetos de tipo Granja
    //Todo lo que tenga que ver con Granjas  y Galpones sabrá usted que era parte de nuestro compañero felipe. 
    public class ManejadorCrearLotes implements ActionListener {

        private PlantillaNuevoLote vtnNuevoLote = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (this.vtnNuevoLote == null) {
                vtnNuevoLote = new PlantillaNuevoLote(empresa);
                desktop.add(vtnNuevoLote);
            }
            vtnNuevoLote.setVisible(true);
        }

    }
    
    public class ManejadorGestionLotes implements ActionListener {

        private PlantillaGestionLotes vtnGesLotes = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (this.vtnGesLotes == null) {
                vtnGesLotes = new PlantillaGestionLotes(empresa);
                desktop.add(vtnGesLotes);
            }
            vtnGesLotes.setVisible(true);
        }

    }

    
    
    public class ManejadorAbirGestionGranja implements ActionListener {

        private GestionGranjas vtnGestionGranja = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (this.vtnGestionGranja == null) {
                vtnGestionGranja = new GestionGranjas(empresa);
                desktop.add(vtnGestionGranja);
            }
            vtnGestionGranja.setVisible(true);
        }

    }

    public class ManejadorAbrirUsuarios implements ActionListener {

        private Usuarios vtnUsuarios = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (this.vtnUsuarios == null) {
                vtnUsuarios = new Usuarios(empresa);
                desktop.add(vtnUsuarios);
            }
            vtnUsuarios.setVisible(true);

        }

    }

}
