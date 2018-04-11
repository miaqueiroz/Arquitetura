/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ClienteDAO;
import control.PaisDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Pais;

/**
 *
 * @author Liah Beeshop'
 */
public class PesquisarCliente extends javax.swing.JFrame {
    private ClienteDAO clienteControle = new ClienteDAO();
    private PaisDAO paisControle;
    /**
     * Creates new form PesquisarCliente
     */
    public PesquisarCliente() {
        initComponents();
    }
    
    PesquisarCliente(ClienteDAO clienteControle, PaisDAO paisControle) {
        this();
        
        this.clienteControle = clienteControle;
        this.paisControle = paisControle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFPesquisarC = new javax.swing.JTextField();
        jBPesquisarC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFNomeC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFTelefoneC = new javax.swing.JTextField();
        jTFLimiteC = new javax.swing.JTextField();
        jTFIdadeC = new javax.swing.JTextField();
        jTFPaisC = new javax.swing.JTextField();
        jBAlterarC = new javax.swing.JButton();
        jBExcluirC = new javax.swing.JButton();
        jBCancelarC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBPesquisarC.setText("Pesquisar");
        jBPesquisarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarCActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jTFNomeC.setEditable(false);

        jLabel2.setText("Telefone:");

        jLabel3.setText("Limite:");

        jLabel4.setText("Idade:");

        jLabel5.setText("País:");

        jTFTelefoneC.setEditable(false);

        jTFLimiteC.setEditable(false);

        jTFIdadeC.setEditable(false);

        jTFPaisC.setEditable(false);
        jTFPaisC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPaisCActionPerformed(evt);
            }
        });

        jBAlterarC.setText("Alterar");
        jBAlterarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarCActionPerformed(evt);
            }
        });

        jBExcluirC.setText("Excluir");

        jBCancelarC.setText("Cancelar");
        jBCancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBAlterarC)
                                .addGap(18, 18, 18)
                                .addComponent(jBExcluirC))
                            .addComponent(jTFPesquisarC, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBPesquisarC)
                            .addComponent(jBCancelarC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNomeC))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFLimiteC)
                                    .addComponent(jTFTelefoneC)
                                    .addComponent(jTFPaisC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFIdadeC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFTelefoneC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFLimiteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFIdadeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFPaisC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPesquisarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAlterarC)
                    .addComponent(jBExcluirC)
                    .addComponent(jBCancelarC))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarCActionPerformed
        String nome = jTFPesquisarC.getText();
        Cliente cl = new Cliente();
        cl = clienteControle.lerCliente(nome);
        jTFNomeC.setText(cl.getNome());
        jTFTelefoneC.setText(cl.getTelefone());
        jTFLimiteC.setText(cl.getLimite()+"");
        jTFIdadeC.setText(cl.getIdade()+"");
        jTFPaisC.setText(cl.getPais().toString());
        jTFNomeC.setEditable(false);
        jTFTelefoneC.setEditable(true);
        jTFLimiteC.setEditable(true);
        jTFIdadeC.setEditable(true);
        jTFPaisC.setEditable(true);
    }//GEN-LAST:event_jBPesquisarCActionPerformed

    private void jTFPaisCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPaisCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPaisCActionPerformed

    private void jBCancelarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarCActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarCActionPerformed

    private void jBAlterarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarCActionPerformed
        String nome = jTFNomeC.getText();
        Cliente cl = new Cliente();
        cl = clienteControle.lerCliente(nome);
        try {
            clienteControle.alterarCliente(cl);
        } catch (Exception ex) {
            Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBAlterarCActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterarC;
    private javax.swing.JButton jBCancelarC;
    private javax.swing.JButton jBExcluirC;
    private javax.swing.JButton jBPesquisarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTFIdadeC;
    private javax.swing.JTextField jTFLimiteC;
    private javax.swing.JTextField jTFNomeC;
    private javax.swing.JTextField jTFPaisC;
    private javax.swing.JTextField jTFPesquisarC;
    private javax.swing.JTextField jTFTelefoneC;
    // End of variables declaration//GEN-END:variables
}
