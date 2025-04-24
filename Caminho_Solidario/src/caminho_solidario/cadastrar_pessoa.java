/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package caminho_solidario;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cadastrar_pessoa extends javax.swing.JInternalFrame {

    String id;
     
    public cadastrar_pessoa() {
        initComponents();
        tabela_Pessoa();
        LimparCaixa();
        
    }
    
    public void LimparCaixa(){
        tfNome.setText(null);
        tfCpf.setText(null);
        tfTelefone.setText(null);
    }
    
    

    public void tabela_Pessoa(){
        
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "Select * From pessoa;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel tabelaModelo = (DefaultTableModel) tabelaPessoa.getModel();
            tabelaModelo.setNumRows(0);
            
            while(rs.next()){
                Object [] dados = {rs.getString("idPessoa"), rs.getString("nome_completo"), rs.getString("cpf"), rs.getString("telefone")};
                tabelaModelo.addRow(dados);
            }
            
             rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCD = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPessoa = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Nome");

        tfNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tfCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("CPF");

        tfTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Pessoa");

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarMouseClicked(evt);
            }
        });

        tabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CEP", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPessoa);

        btAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAlterar.setText("ALTERAR");
        btAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAlterarMouseClicked(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNome)
                                    .addComponent(tfTelefone)
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(529, 529, 529))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))))
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(btCadastrar)
                .addGap(156, 156, 156)
                .addComponent(btAlterar)
                .addGap(170, 170, 170)
                .addComponent(btExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseClicked
               
           try {
            Connection con = Conexao.conexaoBanco();
            String sql = "INSERT INTO pessoa(nome_completo,cpf,telefone) VALUES (?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, tfNome.getText());
            stmt.setString(2, tfCpf.getText());
            stmt.setString(3, tfTelefone.getText());
            stmt.execute();
            
            stmt.close();
            con.close();
            
            
            
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso");
            
            tabela_Pessoa();
            LimparCaixa();
                    
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btCadastrarMouseClicked

    private void tabelaPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPessoaMouseClicked
        tfNome.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 1).toString());
        tfCpf.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 2).toString());
        tfTelefone.setText(tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 3).toString());
        
        id = tabelaPessoa.getValueAt(tabelaPessoa.getSelectedRow(), 0).toString();
        
        
        
        
    }//GEN-LAST:event_tabelaPessoaMouseClicked

    private void btAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseClicked
        try {
                Connection con = Conexao.conexaoBanco();
                String sql = "UPDATE pessoa SET nome_completo = ?, cpf = ?, telefone = ? WHERE idPessoa = ?;";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, tfNome.getText());
                stmt.setString(2, tfCpf.getText());
                stmt.setString(3, tfTelefone.getText());
                stmt.setString(4, id);
                stmt.execute();
                
                stmt.close();
                con.close();
            
            
            
            JOptionPane.showMessageDialog(null, "Pessoa alterada com sucesso");
            
            tabela_Pessoa();
            LimparCaixa();
            
                
                
            } catch (SQLException ex) {
                Logger.getLogger(cadastrar_pessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        
                
    }//GEN-LAST:event_btAlterarMouseClicked

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "DELETE FROM pessoa WHERE idPessoa = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.execute();
            
            stmt.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        tabela_Pessoa();
        LimparCaixa();
    }//GEN-LAST:event_btExcluirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup PCD;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPessoa;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
