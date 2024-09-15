package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DB.DBConnection;
import java.awt.Window;

public class borrarCuenta extends javax.swing.JFrame {
    private String idEmpleado;
    public borrarCuenta(String idEmpleado) {
        initComponents();
        this.setTitle("Alterar Cuentas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idEmpleado = idEmpleado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtCuenta = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVerCuentas = new javax.swing.JTable();
        btnDesactivar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        itmVolver1 = new javax.swing.JMenuItem();
        nmSalir = new javax.swing.JMenu();
        itemCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 53, 102));

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 3, new java.awt.Color(212, 175, 55)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBuscar.setBackground(new java.awt.Color(230, 230, 230));
        btnBuscar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 53, 102));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCuenta.setBackground(new java.awt.Color(230, 230, 230));
        txtCuenta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 53, 102)));
        txtCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(230, 230, 230));
        btnBorrar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 53, 102));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnBorrar.setText("   Borrar");
        btnBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 53, 102));
        jLabel1.setText("     N° de Cuenta  :");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 53, 102)));

        tblVerCuentas.setBackground(new java.awt.Color(230, 230, 230));
        tblVerCuentas.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        tblVerCuentas.setForeground(new java.awt.Color(0, 53, 102));
        tblVerCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Cuenta", "DNI", "Nombres", "Apellidos", "Tipo Cuenta", "Saldo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVerCuentas.setSelectionForeground(new java.awt.Color(0, 53, 102));
        jScrollPane1.setViewportView(tblVerCuentas);

        btnDesactivar.setBackground(new java.awt.Color(230, 230, 230));
        btnDesactivar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnDesactivar.setForeground(new java.awt.Color(0, 53, 102));
        btnDesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N
        btnDesactivar.setText("Desactivar");
        btnDesactivar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        btnActivar.setBackground(new java.awt.Color(230, 230, 230));
        btnActivar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnActivar.setForeground(new java.awt.Color(0, 53, 102));
        btnActivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ckeck.png"))); // NOI18N
        btnActivar.setText("Activar");
        btnActivar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 3, new java.awt.Color(0, 53, 102)));
        btnActivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActivar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDesactivar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(212, 175, 55));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo02.png"))); // NOI18N
        jLabel3.setText("    Nueva Banco Perú  ");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 1, 3, new java.awt.Color(212, 175, 55)));

        jPanel3.setBackground(new java.awt.Color(212, 175, 55));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar2.setBackground(new java.awt.Color(230, 230, 230));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 53, 102)));
        jMenuBar2.setForeground(new java.awt.Color(0, 53, 102));
        jMenuBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu2.setBackground(new java.awt.Color(230, 230, 230));
        jMenu2.setForeground(new java.awt.Color(0, 53, 102));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        jMenu2.setText("Volver");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itmVolver1.setBackground(new java.awt.Color(230, 230, 230));
        itmVolver1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        itmVolver1.setForeground(new java.awt.Color(0, 53, 102));
        itmVolver1.setText("Volver");
        itmVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmVolver1ActionPerformed(evt);
            }
        });
        jMenu2.add(itmVolver1);

        jMenuBar2.add(jMenu2);

        nmSalir.setForeground(new java.awt.Color(0, 53, 102));
        nmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida-icon.png"))); // NOI18N
        nmSalir.setText("Salir");

        itemCerrar.setBackground(new java.awt.Color(230, 230, 230));
        itemCerrar.setForeground(new java.awt.Color(0, 53, 102));
        itemCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x - copia.png"))); // NOI18N
        itemCerrar.setText("Cerrar todo");
        itemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarActionPerformed(evt);
            }
        });
        nmSalir.add(itemCerrar);

        jMenuBar2.add(nmSalir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmVolver1ActionPerformed
        interfazEmpleado pEmpleado = new interfazEmpleado(idEmpleado);
        pEmpleado.setVisible(true);
        pEmpleado.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_itmVolver1ActionPerformed

    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }
        System.exit(0);
    }//GEN-LAST:event_itemCerrarActionPerformed

    private void txtCuentaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCuentaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCuentaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBorrarActionPerformed
        int selectedRow = tblVerCuentas.getSelectedRow();
    
    if (selectedRow != -1) {
        String idCuenta = tblVerCuentas.getValueAt(selectedRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(this, 
                "¿Estás seguro de que deseas borrar la cuenta : " + idCuenta + "?", "Confirmar Borrado", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = DBConnection.getConnection()) {
                // SQL para borrar la cuenta
                String sql = "DELETE FROM CUENTA WHERE IDCUENTA = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, idCuenta);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    ((DefaultTableModel) tblVerCuentas.getModel()).removeRow(selectedRow);
                    JOptionPane.showMessageDialog(this, "Cuenta borrada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al borrar la cuenta.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al intentar borrar la cuenta.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una cuenta para borrar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }// GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBuscarActionPerformed
        String idCuenta = txtCuenta.getText();

        DefaultTableModel model = (DefaultTableModel) tblVerCuentas.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de mostrar nuevos datos

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT c.IDCUENTA, cl.DNI, cl.NOMBRE, cl.APELLIDO, c.TIPOCUENTA, TO_CHAR(c.SALDO, '999999999999.99') AS SALDO, c.ESTADO " + "FROM CUENTA c " + "JOIN CLIENTE cl ON c.IDCLIENTE = cl.IDCLIENTE " + "WHERE c.IDCUENTA LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idCuenta + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String idCuentaDB = rs.getString("IDCUENTA");
                String dniDB = rs.getString("DNI");
                String nombreDB = rs.getString("NOMBRE");
                String apellidoDB = rs.getString("APELLIDO");
                String tipoCuentaDB = rs.getString("TIPOCUENTA");
                String saldoDB = rs.getString("SALDO");
                String estadoDB = rs.getString("ESTADO");

                model.addRow(new Object[] { idCuentaDB, dniDB, nombreDB, apellidoDB, tipoCuentaDB, saldoDB, estadoDB });
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al recuperar los datos de la cuenta.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_btnBuscarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnActivarActionPerformed
        int selectedRow = tblVerCuentas.getSelectedRow();
        if (selectedRow != -1) {
            String idCuenta = (String) tblVerCuentas.getValueAt(selectedRow, 0);
            // Actualizar el estado de la cuenta en la base de datos
            try (Connection conn = DBConnection.getConnection()) { 
                String sql = "UPDATE CUENTA SET ESTADO = 'activa' WHERE IDCUENTA = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, idCuenta);
                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "La cuenta ha sido activada con éxito.", "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);

                    // Actualizar la tabla para reflejar el cambio
                    ((DefaultTableModel) tblVerCuentas.getModel()).setValueAt("inactiva", selectedRow, 4);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo desactivar la cuenta.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al intentar activar la cuenta.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una cuenta de la tabla.", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_btnActivarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDesactivarActionPerformed
        int selectedRow = tblVerCuentas.getSelectedRow();
        if (selectedRow != -1) {
            String idCuenta = (String) tblVerCuentas.getValueAt(selectedRow, 0);
            // Actualizar el estado de la cuenta en la base de datos
            try (Connection conn = DBConnection.getConnection()) { 
                String sql = "UPDATE CUENTA SET ESTADO = 'inactiva' WHERE IDCUENTA = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, idCuenta);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "La cuenta ha sido desactivada con éxito.", "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);

                    // Actualizar la tabla para reflejar el cambio
                    ((DefaultTableModel) tblVerCuentas.getModel()).setValueAt("inactiva", selectedRow, 4);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo desactivar la cuenta.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al intentar desactivar la cuenta.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una cuenta de la tabla.", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_btnDesactivarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itmVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu nmSalir;
    private javax.swing.JTable tblVerCuentas;
    private javax.swing.JTextField txtCuenta;
    // End of variables declaration//GEN-END:variables
}
