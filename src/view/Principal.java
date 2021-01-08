/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author lcluc
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArquivos = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();
        mnCadastro = new javax.swing.JMenu();
        mnClientes = new javax.swing.JMenuItem();
        mnProdutos = new javax.swing.JMenuItem();
        mnUsuarios = new javax.swing.JMenuItem();
        mnEstados = new javax.swing.JMenuItem();
        mnVeiculos = new javax.swing.JMenuItem();
        mnVendas = new javax.swing.JMenu();
        mnVender = new javax.swing.JMenuItem();
        mnPesquisa = new javax.swing.JMenu();
        mnPC = new javax.swing.JMenuItem();
        mnPV = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        mnArquivos.setText("Arquivos");

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnArquivos.add(mnSair);

        jMenuBar1.add(mnArquivos);

        mnCadastro.setText("Cadastro");

        mnClientes.setText("Clientes");
        mnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClientesActionPerformed(evt);
            }
        });
        mnCadastro.add(mnClientes);

        mnProdutos.setText("Produtos");
        mnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProdutosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnProdutos);

        mnUsuarios.setText("Usuários");
        mnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUsuariosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnUsuarios);

        mnEstados.setText("Estados");
        mnEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEstadosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnEstados);

        mnVeiculos.setText("Veiculos");
        mnVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVeiculosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnVeiculos);

        jMenuBar1.add(mnCadastro);

        mnVendas.setText("Vendas");

        mnVender.setText("Vendas");
        mnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVenderActionPerformed(evt);
            }
        });
        mnVendas.add(mnVender);

        jMenuBar1.add(mnVendas);

        mnPesquisa.setText("Pesquisa");

        mnPC.setText("Clientes");
        mnPesquisa.add(mnPC);

        mnPV.setText("Veiculos");
        mnPesquisa.add(mnPV);

        jMenuBar1.add(mnPesquisa);

        setJMenuBar(jMenuBar1);

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

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClientesActionPerformed
        new Cliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnClientesActionPerformed

    private void mnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProdutosActionPerformed
        new Produto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnProdutosActionPerformed

    private void mnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUsuariosActionPerformed
        new Usuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnUsuariosActionPerformed

    private void mnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVenderActionPerformed
        new Venda().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnVenderActionPerformed

    private void mnEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEstadosActionPerformed
        new Estados().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnEstadosActionPerformed

    private void mnVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVeiculosActionPerformed
       new Veiculo().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_mnVeiculosActionPerformed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnArquivos;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnClientes;
    private javax.swing.JMenuItem mnEstados;
    private javax.swing.JMenuItem mnPC;
    private javax.swing.JMenuItem mnPV;
    private javax.swing.JMenu mnPesquisa;
    private javax.swing.JMenuItem mnProdutos;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenuItem mnUsuarios;
    private javax.swing.JMenuItem mnVeiculos;
    private javax.swing.JMenu mnVendas;
    private javax.swing.JMenuItem mnVender;
    // End of variables declaration//GEN-END:variables
}
