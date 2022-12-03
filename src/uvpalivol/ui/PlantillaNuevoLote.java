/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package uvpalivol.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListDataListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import uvpavicol.clases.Empresa;
import uvpavicol.clases.EstadoLote;
import uvpavicol.clases.Galpon;
import uvpavicol.clases.Lote;


public class PlantillaNuevoLote extends javax.swing.JInternalFrame {
    private Empresa empresa;
    
    public PlantillaNuevoLote(Empresa empresa) {
        this.empresa = empresa;  
        
        initComponents();
    
        btnGuardar.addActionListener(new ManejadorRegistrosLotes());
        btnBorrar.addActionListener(new ManeadorBorrar());
                
        boxGalpon.setModel(new GalponComboBoxModel(empresa));
        tblLotes.setModel(new LotesModelo());
        
        btnBorrar.doClick();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLotes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txfNombreLote = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxGalpon = new javax.swing.JComboBox<>();
        txfAvesIngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 102));
        setBorder(null);
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        tblLotes.setBackground(new java.awt.Color(255, 204, 204));
        tblLotes.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tblLotes.setForeground(new java.awt.Color(51, 0, 0));
        tblLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLotes);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo Reducido máspng.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 0, 490, 430));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        txfNombreLote.setBackground(new java.awt.Color(255, 102, 102));
        txfNombreLote.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txfNombreLote.setForeground(new java.awt.Color(51, 0, 0));

        btnGuardar.setBackground(new java.awt.Color(51, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 204, 204));
        btnGuardar.setText("Registrar Lote");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(51, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 204, 204));
        btnBorrar.setText("Cancelar lote");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Galpón");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Aves Ingreso");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre lote");

        boxGalpon.setBackground(new java.awt.Color(255, 102, 102));
        boxGalpon.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        boxGalpon.setForeground(new java.awt.Color(51, 0, 0));

        txfAvesIngreso.setBackground(new java.awt.Color(255, 102, 102));
        txfAvesIngreso.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txfAvesIngreso.setForeground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevo Lote");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxGalpon, 0, 160, Short.MAX_VALUE)
                            .addComponent(txfNombreLote)
                            .addComponent(txfAvesIngreso))))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxGalpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfAvesIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNombreLote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 297, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<uvpavicol.clases.Galpon> boxGalpon;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLotes;
    private javax.swing.JTextField txfAvesIngreso;
    private javax.swing.JTextField txfNombreLote;
    // End of variables declaration//GEN-END:variables

    
    //La tabla mostraba los Galpones donde se iban a establecer los lotes. "Granjas y galpones" era parte del trabajo de el compañero Ordóñez
    
    
    public class GalponComboBoxModel implements ComboBoxModel<Galpon>{
        private Object selected= null;
        private Empresa empresa;
        
        public GalponComboBoxModel(Empresa empresa){
            this.empresa=empresa;
        }
        @Override
        public void setSelectedItem(Object item) {
            this.selected = item;//seleccionar item
        }
        @Override
        public int getSize() {
            String nombre = "prueba";
            return empresa.unaGranja(nombre).getLosGalpones().size();
        }
        @Override
        public Galpon getElementAt(int index) {
            String nombre = "prueba";
            return empresa.unaGranja(nombre).getLosGalpones().get(index);
        }
        @Override
        public Object getSelectedItem() {
            return this.selected;
        }
        @Override
        public void addListDataListener(ListDataListener l) {}
        @Override
        public void removeListDataListener(ListDataListener l) {}
        
    }
public class ManeadorBorrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            txfAvesIngreso.setText("");
            txfNombreLote.setText("");
            boxGalpon.setSelectedItem(null);
        }
    
}
public class ManejadorRegistrosLotes implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                LocalDate fecha =  LocalDate.now();
                Galpon galpon = (Galpon) boxGalpon.getSelectedItem();
                int cantidadAves = Integer.parseInt(txfAvesIngreso.getText());
                int identificador = Integer.parseInt(txfNombreLote.getText());
                Lote lote = new Lote(fecha, galpon,cantidadAves,identificador,EstadoLote.PRODUCCION);

                empresa.addLotes(lote);
                tblLotes.updateUI();
                JOptionPane.showMessageDialog(PlantillaNuevoLote.this,"lote registrado"); 
                btnBorrar.doClick();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(PlantillaNuevoLote.this,ex.getMessage());  
            }
            
        }
    }
public class LotesModelo extends AbstractTableModel{

        @Override
        public int getRowCount() {
            return empresa.getLosLotes().size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Lote loteParaTabla = empresa.getLosLotes().get(rowIndex);
            switch (columnIndex) {
                case 0:return loteParaTabla.getFechaIngreso();
                case 1: return loteParaTabla.getGalpon().getIdentificador();
                case 2: return loteParaTabla.getCantidadAves();
                case 3: return loteParaTabla.getIdentificador();
                
                default:
                    throw new AssertionError();
            }
        }
        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:return "fecha ingreso";
                case 1:return " galpon";
                case 2: return"cantidad aves";
                case 3: return "identificador lote";
            }
            return "reza pq nc, como se ejecutaria esto";
        
        }
    }
}
