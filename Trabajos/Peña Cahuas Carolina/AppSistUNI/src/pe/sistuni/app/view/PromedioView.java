/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.sistuni.app.view;

import javax.swing.JOptionPane;
import pe.sistuni.app.controller.AppController;

/**
 *
 * @author Alumno
 */
public class PromedioView extends javax.swing.JInternalFrame {

    public static String opcion;
    public static int opciones;

    public PromedioView() {

        do {
            opcion = JOptionPane.showInputDialog("Números a promediar: "
                    + "\n\t[2] 2 Números"
                    + "\n\t[3] 3 Números"
                    + "\n\t[4] 4 Números"
                    + "\n\t[5] 5 Números");
            opciones = Integer.parseInt(opcion);
        } while (opciones < 2 || opciones > 5);

        initComponents();
        //desahibilita textfield una vez cargue ventana
        disabled_input();
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
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        txtNumero4 = new javax.swing.JTextField();
        txtNumero3 = new javax.swing.JTextField();
        txtNumero5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblRepo = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Promedio");
        setName("jpromedio"); // NOI18N
        setOpaque(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Números a Promediar: ");

        txtNumero1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero1.setText("0");
        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });

        txtNumero2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero2.setText("0");
        txtNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero2ActionPerformed(evt);
            }
        });

        txtNumero4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero4.setText("0");

        txtNumero3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero3.setText("0");

        txtNumero5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero5.setText("0");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("PROCESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblRepo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRepo.setText("Promedio: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblRepo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getAccessibleContext().setAccessibleName("jpromedio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved

    }//GEN-LAST:event_formComponentMoved

    private void disabled_input(){
        switch (opciones) {
            case 2:
                txtNumero3.setVisible(false);
                txtNumero4.setVisible(false);
                txtNumero5.setVisible(false);
                break;

            case 3:
                txtNumero4.setVisible(false);
                txtNumero5.setVisible(false);
                break;

            case 4:
                txtNumero5.setVisible(false);
                break;

        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
        boolean operacion = true;
        
            n1 = Integer.parseInt(txtNumero1.getText());
            n2 = Integer.parseInt(txtNumero2.getText());
            n3 = Integer.parseInt(txtNumero3.getText());
            n4 = Integer.parseInt(txtNumero4.getText());
            n5 = Integer.parseInt(txtNumero5.getText());
       
        //validaciones
        while (n1 < 0 || n1 > 20) {
                JOptionPane.showMessageDialog(rootPane, "Número no cumple con el formato correcto");
                txtNumero1.setText("0");
                operacion = false;
                break;
        } 
        
        while (n2 < 0 || n2 > 20) {
                JOptionPane.showMessageDialog(rootPane, "Número no cumple con el formato correcto");
                txtNumero1.setText("0");
                operacion = false;
                break;
        } 
        
        
        while (n3 < 0 || n3 > 20) {
                JOptionPane.showMessageDialog(rootPane, "Número no cumple con el formato correcto");
                txtNumero1.setText("0");
                operacion = false;
                break;
        } 
        
        while (n4 < 0 || n4 > 20) {
                JOptionPane.showMessageDialog(rootPane, "Número no cumple con el formato correcto");
                txtNumero1.setText("0");
                operacion = false;
                break;
        } 
        
        while (n5 < 0 || n5 > 20) {
                JOptionPane.showMessageDialog(rootPane, "Número no cumple con el formato correcto");
                txtNumero1.setText("0");
                operacion = false;
                break;
        } 
        //proceso
        AppController control = new AppController();

        int promedio = 0;
        if (operacion) {
            switch (opciones) {
                case 2:
                    promedio = control.promedio(n1, n2);
                    break;

                case 3:
                    promedio = control.promedio(n1, n2, n3);
                    break;

                case 4:
                    promedio = control.promedio(n1, n2, n3, n4);
                    break;

                case 5:
                    promedio = control.promedio(n1, n2, n3, n4, n5);
            }
        }

        //reporte
        String repo = "";
        repo += "Promedio : " + promedio;
        lblRepo.setText(repo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero1ActionPerformed

    private void txtNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRepo;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtNumero3;
    private javax.swing.JTextField txtNumero4;
    private javax.swing.JTextField txtNumero5;
    // End of variables declaration//GEN-END:variables
}
