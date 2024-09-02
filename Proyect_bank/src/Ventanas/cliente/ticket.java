
package Ventanas.cliente;

import javax.swing.JFrame;

public class ticket extends javax.swing.JFrame {

    public ticket(String idTransaccion, String idCuenta, String idEmpleado, String tipoTransaccion, String descripcion,
            double montoDeposito, String idCuentaRecibir) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String tickettext = "<html>" +
                "<div style='font-family:Arial, sans-serif; font-size:14px;'>" +
                "<h2 style='text-align:center; color:#333;'>Detalles de la Transacción</h2>" +
                "<hr style='border:1px solid #333; margin-bottom:15px;'/>" +
                "<table style='width:100%; border-collapse:collapse;'>" +
                "<tr><td style='padding:5px;'><strong>ID Transacción:</strong></td>" +
                "<td style='padding:5px;'>" + idTransaccion + "</td></tr>" +
                "<tr><td style='padding:5px;'><strong>ID Cuenta:</strong></td>" +
                "<td style='padding:5px;'>" + idCuenta + "</td></tr>" +
                "<tr><td style='padding:5px;'><strong>ID Empleado:</strong></td>" +
                "<td style='padding:5px;'>" + idEmpleado + "</td></tr>" +
                "<tr><td style='padding:5px;'><strong>Tipo Transacción:</strong></td>" +
                "<td style='padding:5px;'>" + tipoTransaccion + "</td></tr>" +
                "<tr><td style='padding:5px;'><strong>Descripción:</strong></td>" +
                "<td style='padding:5px;'>" + descripcion + "</td></tr>" +
                "<tr><td style='padding:5px;'><strong>Monto:</strong></td>" +
                "<td style='padding:5px;'>" + String.format("%.2f", montoDeposito) + "</td></tr>" +
                "<tr><td style='padding:5px;'><strong>Cuenta Receptora:</strong></td>" +
                "<td style='padding:5px;'>" + idCuentaRecibir + "</td></tr>" +
                "</table>" +
                "<hr style='border:1px solid #ccc; margin-top:15px;'/>" +
                "</div></html>";
        verRegistro.setText(tickettext);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        verRegistro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        verRegistro.setBackground(new java.awt.Color(255, 255, 255));
        verRegistro.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        verRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        verRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel verRegistro;
    // End of variables declaration//GEN-END:variables
}
