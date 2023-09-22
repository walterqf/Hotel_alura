/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hotel_Alura;

/**
 *
 * @author walterquijada
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Reservas extends javax.swing.JFrame {

    /**
     * Creates new form Reservas
     */
    public Reservas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 660));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("SISTEMA DE BÚSQUEDAS");

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/walterquijada/NetBeansProjects/Hotel_Alura/app/src/main/java/imgs/metasearch4.jpg")); // NOI18N

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Húespedes", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reservas", jPanel2);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese valor a buscar:");

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/walterquijada/NetBeansProjects/Hotel_Alura/app/src/main/java/imgs/icons8-atrás-64.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("/Users/walterquijada/NetBeansProjects/Hotel_Alura/app/src/main/java/imgs/icons8-guardar-64.png")); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon("/Users/walterquijada/NetBeansProjects/Hotel_Alura/app/src/main/java/imgs/icons8-cancelar-64.png")); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon("/Users/walterquijada/NetBeansProjects/Hotel_Alura/app/src/main/java/imgs/icons8-salida-64.png")); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon("/Users/walterquijada/NetBeansProjects/Hotel_Alura/app/src/main/java/imgs/icons8-editar-64.png")); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon("/Users/walterquijada/NetBeansProjects/Hotel_Alura/app/src/main/java/imgs/icons8-búsqueda-64.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        // TODO add your handling code here:
        int selectedTabIndex = jTabbedPane1.getSelectedIndex();
        if (selectedTabIndex == 0) {
            System.out.println("llego");
            cargarDatosHuespedes();
            // El usuario ha seleccionado la pestaña "Huespedes"
            // Realizar acciones relacionadas con "Huespedes"
        } else if (selectedTabIndex == 1) {
            System.out.println("aasadasdad");
            cargarDatosReservas();
            // El usuario ha seleccionado la pestaña "Reservas"
            // Realizar acciones relacionadas con "Reservas"
        }
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Menu j = new Menu();
        j.setLocationRelativeTo(null);
        j.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Connection conexion = ConexionMySQL.getConnection();
        String search = jTextField1.getText().trim(); // Valor a buscar (en este caso, 'Walter')
        System.out.println("Valor de búsqueda: " + search);
        if (conexion != null) {
            try {
                // Crea una consulta SQL parametrizada con la condición de búsqueda
                String consultaSQL = "SELECT H.Nombre, H.Apellido, H.FechaNacimiento, H.Telefono, H.ReservasID FROM Huespedes H WHERE H.Nombre = ? OR H.Apellido = ?;";

                PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL);

                // Establece los valores de los parámetros para buscar registros que coincidan con el valor ingresado en nombre o apellido
               preparedStatement.setString(1, search);
               preparedStatement.setString(2, search);

                ResultSet resultSet = preparedStatement.executeQuery();

                DefaultTableModel tableModel = new DefaultTableModel();
                tableModel.addColumn("Nombre");
                tableModel.addColumn("Apellido");
                tableModel.addColumn("Fecha de nacimiento");
                tableModel.addColumn("Teléfono");
                tableModel.addColumn("ID Reserva");

                while (resultSet.next()) {
                    Object[] rowData = new Object[5];
                    rowData[0] = resultSet.getString("Nombre");
                    rowData[1] = resultSet.getString("Apellido");
                    rowData[2] = resultSet.getDate("FechaNacimiento");
                    rowData[3] = resultSet.getString("Telefono");
                    rowData[4] = resultSet.getString("ReservasID");
                    tableModel.addRow(rowData);
                }

                jTable1.setModel(tableModel);
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error al cargar datos de Huespedes: " + e.getMessage());
            }
        } else {
            System.out.println("La conexión a la base de datos falló.");
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void cargarDatosHuespedes() {
        Connection conexion = ConexionMySQL.getConnection();
        if (conexion != null) {
            try {
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT H.Nombre, H.Apellido, H.FechaNacimiento, H.Telefono, H.ReservasID FROM Huespedes H;");

                DefaultTableModel tableModel = new DefaultTableModel();
                tableModel.addColumn("Nombre");
                tableModel.addColumn("Apellido");
                tableModel.addColumn("Fecha de nacimiento");
                tableModel.addColumn("Teléfono");
                tableModel.addColumn("ID Reserva");

                while (resultSet.next()) {
                    Object[] rowData = new Object[5];
                    rowData[0] = resultSet.getString("Nombre");
                    rowData[1] = resultSet.getString("Apellido");
                    rowData[2] = resultSet.getDate("FechaNacimiento");
                    rowData[3] = resultSet.getString("Telefono");
                    rowData[4] = resultSet.getString("ReservasID");
                    tableModel.addRow(rowData);
                }

                jTable1.setModel(tableModel);

                conexion.close();
            } catch (Exception e) {
                System.out.println("Error al cargar datos de Huespedes: " + e.getMessage());
            }
        } else {
            System.out.println("La conexión a la base de datos falló.");
        }
    }

    private void cargarDatosReservas() {
        Connection conexion = ConexionMySQL.getConnection();
        if (conexion != null) {
            try {
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT R.FechaEntrada, R.FechaSalida, R.Valor, R.FormaPago FROM Reservas R;");

                DefaultTableModel tableModel = new DefaultTableModel();
                tableModel.addColumn("Fecha de entrada");
                tableModel.addColumn("Fecha de salida");
                tableModel.addColumn("Valor");
                tableModel.addColumn("Forma de pago");

                while (resultSet.next()) {
                    Object[] rowData = new Object[4];
                    rowData[0] = resultSet.getDate("FechaEntrada");
                    rowData[1] = resultSet.getDate("FechaSalida");
                    rowData[2] = resultSet.getDouble("Valor");
                    rowData[3] = resultSet.getString("FormaPago");
                    tableModel.addRow(rowData);
                }

                jTable2.setModel(tableModel);

                conexion.close();
            } catch (Exception e) {
                System.out.println("Error al cargar datos de Reservas: " + e.getMessage());
            }
        } else {
            System.out.println("La conexión a la base de datos falló.");
        }
    }

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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Reservas reservas = new Reservas(); // Crea una instancia de la clase Reservas
        reservas.setVisible(true);
        reservas.setLocationRelativeTo(null);
        Connection conexion = ConexionMySQL.getConnection();
        /* System.out.println(conexion);
        
        if (conexion != null) {
            System.out.println("Conexión exitosa a la base de datos.");

            // Aquí puedes realizar operaciones en la base de datos utilizando la conexión
            // Por ejemplo, puedes ejecutar consultas SQL o realizar otras tareas relacionadas con la base de datos.
            // No olvides cerrar la conexión cuando hayas terminado
            try {
                Statement statement = conexion.createStatement();

                // Ejecuta la consulta
                ResultSet resultSet = statement.executeQuery("select H.Nombre, H.Apellido, H.FechaNacimiento, H.Telefono, H.ReservasID from Huespedes H;");

                // Itera sobre los resultados
               /* while (resultSet.next()) {
                    // Imprime los resultados
                    System.out.println("Nombre: " + resultSet.getString("Nombre"));
                    System.out.println("Apellido: " + resultSet.getString("Apellido"));
                    System.out.println("Fecha de nacimiento: " + resultSet.getDate("FechaNacimiento"));
                    System.out.println("Teléfono: " + resultSet.getString("Telefono"));
                }*/

        /**
         * **********************
         */
        /*DefaultTableModel tableModel = new DefaultTableModel();
                tableModel.addColumn("Nombre");
                tableModel.addColumn("Apellido");
                tableModel.addColumn("Fecha de nacimiento");
                tableModel.addColumn("Teléfono");
                tableModel.addColumn("ID Reserva");
                System.out.println("Set: "+resultSet);
                // Itera sobre los resultados y agrega filas al modelo de tabla
                while (resultSet.next()) {
                    Object[] rowData = new Object[5];
                    rowData[0] = resultSet.getString("Nombre");
                    rowData[1] = resultSet.getString("Apellido");
                    rowData[2] = resultSet.getDate("FechaNacimiento");
                    rowData[3] = resultSet.getString("Telefono");
                    rowData[4] = resultSet.getString("ReservasID");
                    tableModel.addRow(rowData);
                }

                // Asigna el modelo de tabla al componente JTable en tu formulario
                reservas.jTable1.setModel(tableModel);

                conexion.close();
                System.out.println("Conexión cerrada.");
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        } else {
            System.out.println("La conexión a la base de datos falló.");
        }*/

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}