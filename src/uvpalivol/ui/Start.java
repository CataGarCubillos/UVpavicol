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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        btnGranja = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        btnUsuario1 = new javax.swing.JButton();
        btnLote = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UVPavicol");

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));
        jPanel5.setDoubleBuffered(false);

        btnGranja.setBackground(new java.awt.Color(255, 102, 102));
        btnGranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/building3.png"))); // NOI18N
        btnGranja.setBorderPainted(false);
        btnGranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGstnGranjaActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(102, 51, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoutcurve.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        btnUsuario1.setBackground(new java.awt.Color(255, 102, 102));
        btnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/useredit.png"))); // NOI18N
        btnUsuario1.setBorderPainted(false);
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnLote.setBackground(new java.awt.Color(255, 102, 102));
        btnLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gallina (1).png"))); // NOI18N
        btnLote.setBorderPainted(false);
        btnLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 102, 102));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Univalle.png"))); // NOI18N
        jButton13.setBorderPainted(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuario1)
                    .addComponent(btnGranja))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton13)
                .addGap(134, 134, 134)
                .addComponent(btnUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGranja)
                .addGap(29, 29, 29)
                .addComponent(btnLote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jButton11))
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.WEST);

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
                .addContainerGap(268, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JButton btnGranja;
    private javax.swing.JButton btnGstnGranja;
    private javax.swing.JButton btnGstnLotes;
    private javax.swing.JButton btnLote;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
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

}
