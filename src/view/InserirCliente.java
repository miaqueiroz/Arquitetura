/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static java.lang.Integer.parseInt;
import model.Cliente;
import control.ControleCliente;

/**
 *
 * @author Aluno
 */
public class InserirCliente extends javax.swing.JFrame {
    Cliente c = new Cliente();
    ControleCliente lista = new ControleCliente();
    
    public InserirCliente() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNome = new javax.swing.JLabel();
        jLIdade = new javax.swing.JLabel();
        jLPais = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFIdade = new javax.swing.JTextField();
        jTFTelefone = new javax.swing.JTextField();
        jSPais = new javax.swing.JSpinner();
        jBInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLNome.setText("Nome:");

        jLIdade.setText("Idade:");

        jLPais.setText("País:");

        jLTelefone.setText("Telefone: ");

        jTFNome.setText("            ");
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFIdade.setText(" ");
        jTFIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdadeActionPerformed(evt);
            }
        });

        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNome)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIdade)
                                .addGap(18, 18, 18)
                                .addComponent(jTFIdade))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTelefone)
                                    .addComponent(jLPais))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSPais)
                                    .addComponent(jTFTelefone)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jBInserir)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdade)
                    .addComponent(jTFIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jBInserir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdadeActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed

        c.setNome(jTFNome.getText());
        c.setIdade(parseInt(jTFIdade.getText()));
        c.setTelefone(jTFTelefone.getText());
        lista.inserirCliente(c);
    }//GEN-LAST:event_jBInserirActionPerformed

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
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInserir;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPais;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JSpinner jSPais;
    private javax.swing.JTextField jTFIdade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
