/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caminho_solidario; 

/**
 *
 * @author Lucas51900776
 */
public class Menu_CaminhoSolidario extends javax.swing.JFrame {

    /**
     * Creates new form Menu_CaminhoSolidario
     */
    public Menu_CaminhoSolidario() {
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

        tela_menu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cbPessoa = new javax.swing.JCheckBoxMenuItem();
        cbEndereco = new javax.swing.JCheckBoxMenuItem();
        cbFilho_dependente = new javax.swing.JCheckBoxMenuItem();
        cbUsuario = new javax.swing.JMenuItem();
        cbVoluntario_adm = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout tela_menuLayout = new javax.swing.GroupLayout(tela_menu);
        tela_menu.setLayout(tela_menuLayout);
        tela_menuLayout.setHorizontalGroup(
            tela_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1309, Short.MAX_VALUE)
        );
        tela_menuLayout.setVerticalGroup(
            tela_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        jMenu1.setText("CADASTRAR");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        cbPessoa.setSelected(true);
        cbPessoa.setText("Pessoa");
        cbPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(cbPessoa);

        cbEndereco.setSelected(true);
        cbEndereco.setText("Endereco");
        cbEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEnderecoActionPerformed(evt);
            }
        });
        jMenu1.add(cbEndereco);

        cbFilho_dependente.setSelected(true);
        cbFilho_dependente.setText("Filho/Dependente");
        cbFilho_dependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFilho_dependenteActionPerformed(evt);
            }
        });
        jMenu1.add(cbFilho_dependente);

        cbUsuario.setText("Usuario");
        cbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(cbUsuario);

        cbVoluntario_adm.setSelected(true);
        cbVoluntario_adm.setText("Voluntário / Adminstrador");
        cbVoluntario_adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVoluntario_admActionPerformed(evt);
            }
        });
        jMenu1.add(cbVoluntario_adm);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("FREQUENCIA");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela_menu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela_menu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPessoaActionPerformed
        cadastrar_pessoa cad_benf = new cadastrar_pessoa();
        tela_menu.add(cad_benf);
        cad_benf.setVisible(true);
    }//GEN-LAST:event_cbPessoaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void cbEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEnderecoActionPerformed
        cadastrar_Endereco cad_end = new cadastrar_Endereco();
        tela_menu.add(cad_end);
        cad_end.setVisible(true);
    }//GEN-LAST:event_cbEnderecoActionPerformed

    private void cbFilho_dependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFilho_dependenteActionPerformed
        cadastrar_filho_dependente cad_dependente = new cadastrar_filho_dependente();
        tela_menu.add(cad_dependente);
        cad_dependente.setVisible(true);
        
    }//GEN-LAST:event_cbFilho_dependenteActionPerformed

    private void cbVoluntario_admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVoluntario_admActionPerformed
        cadastrar_voluntario_adm cad_vol = new cadastrar_voluntario_adm();
        tela_menu.add(cad_vol);
        cad_vol.setVisible(true);
    }//GEN-LAST:event_cbVoluntario_admActionPerformed

    private void cbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuarioActionPerformed
        cadastrar_usuario cad_usu = new cadastrar_usuario();
        tela_menu.add(cad_usu);
        cad_usu.setVisible(true);
    }//GEN-LAST:event_cbUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_CaminhoSolidario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_CaminhoSolidario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_CaminhoSolidario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_CaminhoSolidario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_CaminhoSolidario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem cbEndereco;
    private javax.swing.JCheckBoxMenuItem cbFilho_dependente;
    private javax.swing.JCheckBoxMenuItem cbPessoa;
    private javax.swing.JMenuItem cbUsuario;
    private javax.swing.JCheckBoxMenuItem cbVoluntario_adm;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane tela_menu;
    // End of variables declaration//GEN-END:variables
}
