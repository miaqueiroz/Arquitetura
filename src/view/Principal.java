/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ClienteDAO;
import control.PaisDAO;

/**
 *
 * @author Aluno
 */
public class Principal extends javax.swing.JFrame {
    private final ClienteDAO clienteControle;
    private final PaisDAO paisControle;
    
    public Principal() {
        initComponents();
        
        clienteControle = new ClienteDAO();
        paisControle = new PaisDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMBar = new javax.swing.JMenuBar();
        jMCliente = new javax.swing.JMenu();
        jMIInserirC = new javax.swing.JMenuItem();
        jMIPesquisarC = new javax.swing.JMenuItem();
        jMIAlterarC = new javax.swing.JMenuItem();
        jMIExcluirC = new javax.swing.JMenuItem();
        jMPais = new javax.swing.JMenu();
        jMIInserirP = new javax.swing.JMenuItem();
        jMIPesquisarP = new javax.swing.JMenuItem();
        jMIAlterarP = new javax.swing.JMenuItem();
        jMIExcluirP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMCliente.setText("Cliente");

        jMIInserirC.setText("Inserir");
        jMIInserirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIInserirCActionPerformed(evt);
            }
        });
        jMCliente.add(jMIInserirC);

        jMIPesquisarC.setText("Pesquisar");
        jMIPesquisarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisarCActionPerformed(evt);
            }
        });
        jMCliente.add(jMIPesquisarC);

        jMIAlterarC.setText("Alterar");
        jMCliente.add(jMIAlterarC);

        jMIExcluirC.setText("Excluir");
        jMCliente.add(jMIExcluirC);

        jMBar.add(jMCliente);

        jMPais.setText("Pais");

        jMIInserirP.setText("Inserir");
        jMIInserirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIInserirPActionPerformed(evt);
            }
        });
        jMPais.add(jMIInserirP);

        jMIPesquisarP.setText("Pesquisar");
        jMIPesquisarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisarPActionPerformed(evt);
            }
        });
        jMPais.add(jMIPesquisarP);

        jMIAlterarP.setText("Alterar");
        jMPais.add(jMIAlterarP);

        jMIExcluirP.setText("Excluir");
        jMPais.add(jMIExcluirP);

        jMBar.add(jMPais);

        setJMenuBar(jMBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIInserirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIInserirCActionPerformed
        new InserirCliente(clienteControle, paisControle).setVisible(true);
    }//GEN-LAST:event_jMIInserirCActionPerformed

    private void jMIInserirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIInserirPActionPerformed
        new InserirPais(paisControle).setVisible(true);
    }//GEN-LAST:event_jMIInserirPActionPerformed

    private void jMIPesquisarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisarCActionPerformed
        new PesquisarCliente(clienteControle, paisControle).setVisible(true);
    }//GEN-LAST:event_jMIPesquisarCActionPerformed

    private void jMIPesquisarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisarPActionPerformed
        new PesquisarPais(paisControle).setVisible(true);
    }//GEN-LAST:event_jMIPesquisarPActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMBar;
    private javax.swing.JMenu jMCliente;
    private javax.swing.JMenuItem jMIAlterarC;
    private javax.swing.JMenuItem jMIAlterarP;
    private javax.swing.JMenuItem jMIExcluirC;
    private javax.swing.JMenuItem jMIExcluirP;
    private javax.swing.JMenuItem jMIInserirC;
    private javax.swing.JMenuItem jMIInserirP;
    private javax.swing.JMenuItem jMIPesquisarC;
    private javax.swing.JMenuItem jMIPesquisarP;
    private javax.swing.JMenu jMPais;
    // End of variables declaration//GEN-END:variables
}
