/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package caminho_solidario;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.text.SimpleDateFormat;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;

public class cadastrar_filho_dependente extends javax.swing.JInternalFrame {

    String dataNascimento;
    String PCD;
    String id;
    
    
    public cadastrar_filho_dependente() {
        initComponents();
        MostrarTabela();
        Apagar();
    }

    private void MostrarTabela(){
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "SELECT * FROM filho_dependente;";            
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel TabelaModelo = (DefaultTableModel) tabelaDependente.getModel();
            TabelaModelo.setNumRows(0);
            
            while (rs.next()){
                Object [] dados = {rs.getString("idFilho_Dependente"), rs.getString("nome_filho_dependente"), rs.getString("data_nascimento_filho_dep"),
                    rs.getString("parentesco"),  rs.getString("pcd")};
                TabelaModelo.addRow(dados);            
            }
                        
            rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_filho_dependente.class.getName()).log(Level.SEVERE, null, ex);
        }
} 

    private void Apagar(){
        tfNome.setText(null);
        tfParentesco.setText(null);
        rbSim.setSelected(false);
        rbNao.setSelected(false);
        PCD = "";
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pcd = new javax.swing.ButtonGroup();
        tfParentesco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        btCadastrar = new javax.swing.JButton();
        lbBairro2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        data = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDependente = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tfParentesco.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Parentesco");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Filho / dependente");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Nome");

        tfNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        pcd.add(rbSim);
        rbSim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbSim.setText("Sim");
        rbSim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbSimItemStateChanged(evt);
            }
        });

        pcd.add(rbNao);
        rbNao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbNao.setText("Não");
        rbNao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbNaoItemStateChanged(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarMouseClicked(evt);
            }
        });

        lbBairro2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbBairro2.setText("Data de Nascimento");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("PCD");

        data.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tabelaDependente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Dependente", "Nascimento", "Parentesco", "PCD"
            }
        ));
        tabelaDependente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDependenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDependente);

        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btAlterar.setText("ALTERAR");
        btAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAlterarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(506, 506, 506)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(lbBairro2)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbNao)
                                            .addComponent(rbSim)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(tfParentesco)
                                        .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCadastrar)
                                .addGap(61, 61, 61)))
                        .addComponent(btExcluir)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBairro2)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbSim)
                        .addGap(0, 0, 0)
                        .addComponent(rbNao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseClicked
        
        
        
        SimpleDateFormat dataFormatada = new SimpleDateFormat("yyyy-MM-dd");
        dataNascimento = dataFormatada.format(data.getDate());
        
        
        
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "INSERT INTO filho_dependente(nome_filho_dependente,data_nascimento_filho_dep,parentesco,pcd) VALUES (?,?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, tfNome.getText());
            stmt.setString(2, dataNascimento);
            stmt.setString(3, tfParentesco.getText());
            stmt.setString(4, PCD);
            
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Dependente cadastrado com Sucesso!!!");
            
            stmt.close();
            con.close();
            
            MostrarTabela();
            Apagar();
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_filho_dependente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btCadastrarMouseClicked

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "DELETE FROM filho_dependente WHERE idFilho_Dependente = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, id);            
            stmt.execute();            
            JOptionPane.showMessageDialog(null, "Dependente excluído com sucesso!!");
           
            MostrarTabela();
            Apagar();
            
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_filho_dependente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btExcluirMouseClicked

    private void btAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseClicked
        
        SimpleDateFormat dataFormatada = new SimpleDateFormat("yyyy-MM-dd");
        dataNascimento = dataFormatada.format(data.getDate());
        
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "UPDATE filho_dependente SET nome_filho_dependente = ?, data_nascimento_filho_dep = ?, parentesco = ?, pcd = ? WHERE idFilho_Dependente = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, tfNome.getText());
            stmt.setString(2, dataNascimento);
            stmt.setString(3, tfParentesco.getText());
            stmt.setString(4, PCD);
            stmt.setString(5, id);
            
           
            
            stmt.executeUpdate();
            stmt.close();
            con.close();
             MostrarTabela();
            Apagar();
            JOptionPane.showMessageDialog(null, "Dependente alterado com sucesso!!");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_filho_dependente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAlterarMouseClicked

    private void rbSimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbSimItemStateChanged
        PCD = "S";
    }//GEN-LAST:event_rbSimItemStateChanged

    private void rbNaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbNaoItemStateChanged
        PCD = "N";
    }//GEN-LAST:event_rbNaoItemStateChanged

    private void tabelaDependenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDependenteMouseClicked
        tfNome.setText(tabelaDependente.getValueAt(tabelaDependente.getSelectedRow(), 1).toString());
        tfParentesco.setText(tabelaDependente.getValueAt(tabelaDependente.getSelectedRow(), 3).toString());
        PCD = tabelaDependente.getValueAt(tabelaDependente.getSelectedRow(), 4).toString();
        
            if (PCD.equals("S")){
                rbSim.setSelected(true);
            } else {
                rbNao.setSelected(true);
            }
            
        //SimpleDateFormat dataFormatada = new SimpleDateFormat("yyyy-MM-dd");
       // dataNascimento = dataFormatada.format(data.getDate());
        
        id =  tabelaDependente.getValueAt(tabelaDependente.getSelectedRow(), 0).toString();
                
    }//GEN-LAST:event_tabelaDependenteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBairro2;
    private javax.swing.ButtonGroup pcd;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTable tabelaDependente;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfParentesco;
    // End of variables declaration//GEN-END:variables
}
