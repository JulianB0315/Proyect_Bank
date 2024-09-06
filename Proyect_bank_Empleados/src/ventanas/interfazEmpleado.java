
package ventanas;

import ventanas.AlteraCuentas.borrarCuenta;
import ventanas.Busqueda.buscarCliente;
import ventanas.Busqueda.historialTransaccion;
import ventanas.Crear.CrearCuenta;
import ventanas.Crear.tranferenciaEmpleado;

public class interfazEmpleado extends javax.swing.JFrame {
private String idEmpleado;
    public interfazEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
        initComponents();
        this.setTitle("");
        btnBorrarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnHistorialTransacion = new javax.swing.JButton();
        btnBorrarCuenta = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        btnTransaccion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        btnCrearClienta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 53, 102));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 53, 102), 2));

        btnHistorialTransacion.setBackground(new java.awt.Color(230, 230, 230));
        btnHistorialTransacion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnHistorialTransacion.setForeground(new java.awt.Color(0, 53, 102));
        btnHistorialTransacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tramite.png"))); // NOI18N
        btnHistorialTransacion.setText("Historial de Transacciones");
        btnHistorialTransacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnHistorialTransacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialTransacionActionPerformed(evt);
            }
        });

        btnBorrarCuenta.setBackground(new java.awt.Color(230, 230, 230));
        btnBorrarCuenta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnBorrarCuenta.setForeground(new java.awt.Color(0, 53, 102));
        btnBorrarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ckeck.png"))); // NOI18N
        btnBorrarCuenta.setText("Alterar Cuentas");
        btnBorrarCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnBorrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCuentaActionPerformed(evt);
            }
        });

        btnCrearCuenta.setBackground(new java.awt.Color(230, 230, 230));
        btnCrearCuenta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(0, 53, 102));
        btnCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta.png"))); // NOI18N
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnTransaccion.setBackground(new java.awt.Color(230, 230, 230));
        btnTransaccion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnTransaccion.setForeground(new java.awt.Color(0, 53, 102));
        btnTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dolar.png"))); // NOI18N
        btnTransaccion.setText("Transaccion o Retiro");
        btnTransaccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 53, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(212, 175, 55)));
        jPanel3.setPreferredSize(new java.awt.Dimension(40, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 53, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(212, 175, 55)));
        jPanel4.setPreferredSize(new java.awt.Dimension(40, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnBuscarCliente.setBackground(new java.awt.Color(230, 230, 230));
        btnBuscarCliente.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(0, 53, 102));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnCrearClienta.setBackground(new java.awt.Color(230, 230, 230));
        btnCrearClienta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnCrearClienta.setForeground(new java.awt.Color(0, 53, 102));
        btnCrearClienta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        btnCrearClienta.setText("Crear Cliente");
        btnCrearClienta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnCrearClienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClientaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(btnBorrarCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearClienta, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addComponent(btnTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHistorialTransacion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnCrearClienta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnBorrarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistorialTransacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 175, 55));
        jLabel1.setText("  Nueva Banco Perú");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(212, 175, 55)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
       CrearCuenta pCrearCuenta = new CrearCuenta();
       pCrearCuenta.setVisible(true);
       pCrearCuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnBorrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCuentaActionPerformed
        borrarCuenta pBorrarCuenta = new borrarCuenta();
        pBorrarCuenta.setVisible(true);
        pBorrarCuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBorrarCuentaActionPerformed

    private void btnHistorialTransacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialTransacionActionPerformed
        historialTransaccion pHistorialTransaccion = new historialTransaccion();
        pHistorialTransaccion.setVisible(true);
        pHistorialTransaccion.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnHistorialTransacionActionPerformed

    private void btnTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionActionPerformed
        tranferenciaEmpleado pTranferenciaEmpleado = new tranferenciaEmpleado(idEmpleado);
        pTranferenciaEmpleado.setVisible(true);
        pTranferenciaEmpleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTransaccionActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        buscarCliente pCliente  = new buscarCliente();
        pCliente.setVisible(true);
        pCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnCrearClientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearClientaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCuenta;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCrearClienta;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnHistorialTransacion;
    private javax.swing.JButton btnTransaccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
