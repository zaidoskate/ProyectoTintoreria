package proyectotintoreria;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Consulta extends javax.swing.JFrame {

    public Consulta() {
        initComponents();
        this.setTitle("Consultas");
        this.setLocation(400,300);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_Regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_SinServiciosRegistrados = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_Empleados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_Puesto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_CostoTotal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_Detalles = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Folio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_InfoServicio = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_CostoTotal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Regresar.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 30)); // NOI18N
        jLabel1.setText("CONSULTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_Regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_Regresar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 25)); // NOI18N
        jLabel2.setText("Empleados");

        btn_SinServiciosRegistrados.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_SinServiciosRegistrados.setText("Buscar");
        btn_SinServiciosRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SinServiciosRegistradosActionPerformed(evt);
            }
        });

        table_Empleados.setFont(new java.awt.Font("Sitka Text", 0, 15)); // NOI18N
        table_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Personal", "Nombre", "Puesto"
            }
        ));
        jScrollPane3.setViewportView(table_Empleados);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        jLabel5.setText("Empleados de mostrador sin servicios registrados");

        txt_Puesto.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PuestoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        jLabel6.setText("Puesto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_SinServiciosRegistrados)))))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_SinServiciosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        btn_CostoTotal.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_CostoTotal.setText("Costo total");
        btn_CostoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CostoTotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 25)); // NOI18N
        jLabel3.setText("Servicios");

        btn_Detalles.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        btn_Detalles.setText("Detalles");
        btn_Detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DetallesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 25)); // NOI18N
        jLabel4.setText("Folio:");

        txt_Folio.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FolioActionPerformed(evt);
            }
        });

        table_InfoServicio.setFont(new java.awt.Font("Sitka Text", 0, 15)); // NOI18N
        table_InfoServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Fecha", "Cliente", "Empleado"
            }
        ));
        jScrollPane1.setViewportView(table_InfoServicio);

        table_CostoTotal.setFont(new java.awt.Font("Sitka Text", 0, 15)); // NOI18N
        table_CostoTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Costo total"
            }
        ));
        jScrollPane2.setViewportView(table_CostoTotal);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_CostoTotal))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(btn_Detalles)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_CostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_CostoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CostoTotalActionPerformed
        String folio = txt_Folio.getText();
        
        if(!folio.equals("")){
            try {
                int folioInt = Integer.parseInt(txt_Folio.getText());
                llenarTablaCostoTotal(folioInt);
                txt_Folio.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero entero para el folio", "Error de formato", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
            JOptionPane.showMessageDialog(null,"El folio no puede quedar vacío", "Campos faltantes", 1);
    }//GEN-LAST:event_btn_CostoTotalActionPerformed

private void llenarTablaCostoTotal(int folio) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tintoreria", "tinto", "Posdata19");
        String sql = "SELECT Folio, CostoTotal FROM costo_total_servicio WHERE Folio = ?";
        try (PreparedStatement comando = conn.prepareStatement(sql)) {
            comando.setInt(1, folio);
            ResultSet resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table_CostoTotal.getModel();
            if (!resultado.next()) {
                JOptionPane.showMessageDialog(null, "El folio no existe", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            do {
                int folioResultado = resultado.getInt("Folio");
                double costoTotal = resultado.getDouble("CostoTotal");

                model.addRow(new Object[]{folioResultado, costoTotal});
            } while (resultado.next());
        }
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al consultar la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    private void btn_DetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetallesActionPerformed
        String folio = txt_Folio.getText();
        
        if(!folio.equals("")){
            try {
                int folioInt = Integer.parseInt(txt_Folio.getText());
                llenarTablaDetalleServicios(folioInt);
                txt_Folio.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero entero para el folio", "Error de formato", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
            JOptionPane.showMessageDialog(null,"El folio no puede quedar vacío", "Campos faltantes", 1);
    
    }//GEN-LAST:event_btn_DetallesActionPerformed

private void llenarTablaDetalleServicios(int folio) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tintoreria", "tinto", "Posdata19");
        String sql = "SELECT DISTINCT S.Folio as Folio, S.Fecha as Fecha, " +
                     "COALESCE(CONCAT(C.Nombre, ' ', COALESCE(C.Paterno, ''), ' ', COALESCE(C.Materno, '')), '') as Cliente, " +
                     "COALESCE(CONCAT(E.Nombre, ' ', COALESCE(E.Paterno, ''), ' ', COALESCE(E.Materno, '')), '') as Empleado " +
                     "FROM servicio S " +
                     "JOIN detalleservicio DS ON S.Folio = DS.Folio " +
                     "LEFT JOIN Cliente C ON S.IdCliente = C.IdCliente " +
                     "LEFT JOIN Empleados E ON S.NoPersonal = E.NoPersonal " +
                     "WHERE S.Folio = ?";
        
        try (PreparedStatement comando = conn.prepareStatement(sql)) {
            comando.setInt(1, folio);
            ResultSet resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table_InfoServicio.getModel();
            if (!resultado.next()) {
                JOptionPane.showMessageDialog(null, "El folio no existe", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            do {
                int folioResultado = resultado.getInt("Folio");
                String fechaResultado = resultado.getString("Fecha");
                String clienteResultado = resultado.getString("Cliente");
                String empleadoResultado = resultado.getString("Empleado");

                model.addRow(new Object[]{folioResultado, fechaResultado, clienteResultado, empleadoResultado});
            } while (resultado.next());
        }
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al consultar la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    
    private void btn_SinServiciosRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SinServiciosRegistradosActionPerformed
        String puesto = txt_Puesto.getText();

        if(!puesto.equals("")){
            llenarTablaEmpleados(puesto);
            txt_Puesto.setText("");
        } else
            JOptionPane.showMessageDialog(null,"Debes especificar el puesto a buscar", "Campos faltantes", 1);
    }//GEN-LAST:event_btn_SinServiciosRegistradosActionPerformed

private void llenarTablaEmpleados(String puesto) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tintoreria", "tinto", "Posdata19");
        String sql = "SELECT Empleados.noPersonal, Empleados.nombre, Puestos.puesto FROM Empleados JOIN Puestos ON Empleados.idPuesto = Puestos.idPuesto WHERE Empleados.noPersonal NOT IN (SELECT noPersonal FROM servicio) AND Puestos.puesto = ?";
        
        try (PreparedStatement comando = conn.prepareStatement(sql)) {
            comando.setString(1, puesto);
            ResultSet resultado = comando.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table_Empleados.getModel();
            if (!resultado.next()) {
                JOptionPane.showMessageDialog(null, "El puesto no existe", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            do {
                String numResultado = resultado.getString("NoPersonal");
                String nombreResultado = resultado.getString("Nombre");
                String puestoResultado = resultado.getString("Puesto");

                model.addRow(new Object[]{numResultado, nombreResultado, puestoResultado});
            } while (resultado.next());
        }
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al consultar la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    private void txt_FolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FolioActionPerformed

    private void txt_PuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PuestoActionPerformed
        
    }//GEN-LAST:event_txt_PuestoActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CostoTotal;
    private javax.swing.JButton btn_Detalles;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_SinServiciosRegistrados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_CostoTotal;
    private javax.swing.JTable table_Empleados;
    private javax.swing.JTable table_InfoServicio;
    private javax.swing.JTextField txt_Folio;
    private javax.swing.JTextField txt_Puesto;
    // End of variables declaration//GEN-END:variables
}
