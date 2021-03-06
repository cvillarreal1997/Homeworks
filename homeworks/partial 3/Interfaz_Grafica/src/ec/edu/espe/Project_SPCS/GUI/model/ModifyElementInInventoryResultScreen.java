/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Project_SPCS.GUI.model;

import ec.edu.espe.Project_SPCS.GUI.menu.MainDesktop;
import ec.edu.espe.STPCSProject.util.FileManager;
import ec.edu.espe.STPCSProject.util.Operation;
import ec.edu.espe.STPCSProject.util.Validations;
import java.awt.Color;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

/**
 *
 * @author José Andrés Zamora Miranda
 */
public class ModifyElementInInventoryResultScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModifyElementInInventoryResultScreen
     */
    private String IDNumber;
    public ModifyElementInInventoryResultScreen(String IDNumber) {
        initComponents();
        this.IDNumber = IDNumber;
    }
    public ModifyElementInInventoryResultScreen() {
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

        lblTittle = new javax.swing.JLabel();
        lblNewIDNumber = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        lblIDNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductType = new javax.swing.JLabel();
        cmbProductType = new javax.swing.JComboBox<>();
        lblStorage = new javax.swing.JLabel();
        cmbStorage = new javax.swing.JComboBox<>();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblTittle.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblTittle.setText("Resultados de Búsqueda");

        lblNewIDNumber.setText("Número de identificación nuevo a buscar:");

        txtIDNumber.setText("9999999999");

        lblIDNumber.setText("Número de identificación: ");

        jLabel1.setText("9999999999");

        lblProductName.setText("Nombre del producto: ");

        lblProductType.setText("Tipo de Producto: ");

        cmbProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herramientas", "Terrafilados", "Cementos", "Varillas", "Columnas", "Etc.", " " }));

        lblStorage.setText("Bodega:");

        cmbStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bodega Principal (001)", "Bodega Secundaria (002)", "Etc.", " " }));

        lblQuantity.setText("Cantidad:");

        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnExit.setText("Cerrar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblTittle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNewIDNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIDNumber)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductName)
                            .addComponent(lblProductType))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductName)
                            .addComponent(cmbProductType, 0, 250, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQuantity)
                    .addComponent(lblStorage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbStorage, 0, 202, Short.MAX_VALUE)
                            .addComponent(txtQuantity))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTittle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewIDNumber)
                    .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIDNumber)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductType)
                    .addComponent(cmbProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStorage)
                    .addComponent(cmbStorage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturn))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtQuantity.getBackground() == Color.red)
        {
            showMessageDialog(null, "Revise los parametros erroneos");
        }
        else
        {
            FileManager.modifyFile(new File("Inventory.csv"), IDNumber, toString());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ModifyElementInInventoryMainScreen mainScreen = new ModifyElementInInventoryMainScreen();
        MainDesktop.Desktop.add(mainScreen);
        mainScreen.show();
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        ModifyElementInInventoryMainScreen mainScreen = new ModifyElementInInventoryMainScreen();
        MainDesktop.Desktop.add(mainScreen);
        mainScreen.show();
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        formFilling(null, jLabel1, IDNumber);
    }//GEN-LAST:event_formComponentShown

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        Validations.verificationJustNumbers(txtQuantity);
    }//GEN-LAST:event_txtQuantityKeyTyped
    @Override
    public String toString()
    {
        String auxString;
        auxString = jLabel1.getText()+";"+txtProductName.getText()+";"+cmbProductType.getSelectedItem()+";"+cmbStorage.getSelectedItem()+";"+txtQuantity.getText()+"\r\n";
        return auxString;
    }
    private void formFilling(JTextField txtField, JLabel lblField, String IDNumber) {
        if (IDNumber == null) {
            lblField.setText(txtField.getText());
        } else {
            lblField.setText(IDNumber);
        }
        List dataOut;
        List dataSplit;
        dataOut = Operation.dataSearchAndSplit(null, lblField,new File("Inventory.csv"));
        if (dataOut == null) {
            JOptionPane.showMessageDialog(null, "Error número de producto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dataSplit = Arrays.asList(((String) dataOut.get(1)).split(" "));
            txtProductName.setText((String) dataOut.get(1));
            txtQuantity.setText((String) dataOut.get(4));
            cmbProductType.addItem((String) dataOut.get(2));
            cmbProductType.setSelectedItem((String) dataOut.get(2));
            cmbStorage.addItem((String) dataOut.get(3));
            cmbStorage.setSelectedItem((String) dataOut.get(3));
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ModifyElementInInventoryResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyElementInInventoryResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyElementInInventoryResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyElementInInventoryResultScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyElementInInventoryResultScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbProductType;
    private javax.swing.JComboBox<String> cmbStorage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIDNumber;
    private javax.swing.JLabel lblNewIDNumber;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductType;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStorage;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTextField txtIDNumber;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
