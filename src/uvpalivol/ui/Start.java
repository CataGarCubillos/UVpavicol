package uvpalivol.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import uvpavicol.clases.Empresa;

public class Start extends javax.swing.JFrame {

    private Empresa empresa;

    public Start(Empresa empresa) {
        this.empresa = empresa;
        initComponents();
        btnLote.addActionListener(new ManejadorAbrirGestionLotes());
        btnGranja.addActionListener(new ManejadorAbirGestionGranja());
        btnUsuario1.addActionListener(new ManejadorAbrirUsuarios());
        btnCerrar.addActionListener(new manejadorCerrar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        btnGranja = new javax.swing.JButton();
        btnUsuario1 = new javax.swing.JButton();
        btnLote = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
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
        jPanel5.add(btnGranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 60, -1));

        btnUsuario1.setBackground(new java.awt.Color(255, 102, 102));
        btnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/useredit.png"))); // NOI18N
        btnUsuario1.setBorderPainted(false);
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel5.add(btnUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 60, -1));

        btnLote.setBackground(new java.awt.Color(255, 102, 102));
        btnLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gallina (1).png"))); // NOI18N
        btnLote.setBorderPainted(false);
        btnLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(btnLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 60, -1));

        jButton13.setBackground(new java.awt.Color(255, 102, 102));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Univalle.png"))); // NOI18N
        jButton13.setBorderPainted(false);
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        btnCerrar.setBackground(new java.awt.Color(102, 51, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoutcurve.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 60, 60));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 620));

        desktop.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo Navidad 2.png"))); // NOI18N

        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 850, -1));

        getAccessibleContext().setAccessibleDescription("Proyecto Final");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnGstnGranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGstnGranjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGstnGranjaActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGranja;
    private javax.swing.JButton btnLote;
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    //Manejadores para abrir las ventanas
    public class ManejadorAbirGestionGranja implements ActionListener {
            private GestionGranjas vtnGestionGranja = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (this.vtnGestionGranja == null){
                vtnGestionGranja = new GestionGranjas(empresa);
                desktop.add(vtnGestionGranja);
            }
            vtnGestionGranja.setVisible(true);
        }
        
    }

    public class ManejadorAbrirGestionLotes implements ActionListener {

        private GestionLotes vtnGestionLotes = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (this.vtnGestionLotes == null) {
                vtnGestionLotes = new GestionLotes(empresa);
                desktop.add(vtnGestionLotes);
            }
            vtnGestionLotes.setVisible(true);
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

    
    
    public class manejadorCerrar implements ActionListener{
            private Start inicio;

        @Override
        public void actionPerformed(ActionEvent e) {
            inicio.dispose();
        }
        
    }
}
