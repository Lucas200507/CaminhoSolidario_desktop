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

public class cadastrar_voluntario_adm extends javax.swing.JInternalFrame {

   
    
    public cadastrar_voluntario_adm() {
        initComponents();
        dadosCbPessoa();
        MostrarTabela();
        VerificaNulo();
        
    }

    String funcao;
    String textoPessoa;
    String textoEmail;
    String textoSenha;
    String textoConfSenha;
    boolean CampoPreenchido;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Funcao = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        btCadastrar_benf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVoluntarioAdm = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        pfConfSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        cbPessoa = new javax.swing.JComboBox<>();
        rbVoluntario = new javax.swing.JRadioButton();
        rbAdm = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Cadastrar Voluntário ou Administrador");

        btCadastrar_benf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btCadastrar_benf.setText("CADASTRAR");
        btCadastrar_benf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrar_benfMouseClicked(evt);
            }
        });

        tabelaVoluntarioAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Função", "Nome", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVoluntarioAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVoluntarioAdmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaVoluntarioAdm);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Pessoa");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        pfSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pfConfSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Senha");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Confirmar senha");

        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("Email");

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

        cbPessoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        Funcao.add(rbVoluntario);
        rbVoluntario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbVoluntario.setText("Voluntário");
        rbVoluntario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbVoluntarioItemStateChanged(evt);
            }
        });

        Funcao.add(rbAdm);
        rbAdm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbAdm.setText("Administrador");
        rbAdm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbAdmItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(736, 736, 736))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbVoluntario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbAdm))
                                .addComponent(pfConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(508, 508, 508))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(488, 488, 488))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btAlterar)
                                .addGap(62, 62, 62)
                                .addComponent(btCadastrar_benf)
                                .addGap(67, 67, 67)
                                .addComponent(btExcluir)
                                .addGap(278, 278, 278))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(50, 50, 50)))
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbVoluntario)
                    .addComponent(rbAdm))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btCadastrar_benf)
                    .addComponent(btExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void VerificaNulo(){
        textoPessoa = cbPessoa.getSelectedItem() != " " ? cbPessoa.getSelectedItem().toString() : " "; // Se o cbPessoa for diferente de nulo, volta o item selecionado como string, se estiver em branco, volta o item como ""
        textoEmail = tfEmail.getText();
        textoSenha = pfSenha.getText();
        textoConfSenha = pfConfSenha.getText();    
        
        
        if (textoPessoa.isEmpty() || textoEmail.isEmpty() || textoSenha.isEmpty() || textoConfSenha.isEmpty() || funcao.isEmpty() ) {
            CampoPreenchido = false;      
        } else {
             CampoPreenchido = true;
        }
            
    }
    
    
    
    private void tabelaVoluntarioAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVoluntarioAdmMouseClicked
       cbPessoa.setSelectedItem(tabelaVoluntarioAdm.getValueAt(tabelaVoluntarioAdm.getSelectedRow(), 2));
       tfEmail.setText(tabelaVoluntarioAdm.getValueAt(tabelaVoluntarioAdm.getSelectedRow(), 3).toString());
       funcao = (tabelaVoluntarioAdm.getValueAt(tabelaVoluntarioAdm.getSelectedRow(), 1).toString()); 
       JOptionPane.showMessageDialog(null, "Função: " + funcao);
       if (funcao.equals("Voluntário")){
           rbVoluntario.setSelected(true);           
       } else if (funcao.equals("Administrador")){
           rbAdm.setSelected(true);           
       }
    }//GEN-LAST:event_tabelaVoluntarioAdmMouseClicked

    
    public void MostrarTabela(){
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "SELECT * FROM tbFuncao;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel tabelaModelo = (DefaultTableModel) tabelaVoluntarioAdm.getModel();
            tabelaModelo.setNumRows(0);
            
            while (rs.next()){
                Object [] dados = {rs.getString("ID"),rs.getString("funcao"),rs.getString("nome"),
                rs.getString("email")};
                tabelaModelo.addRow(dados);
            }
            
             con.close();
             stmt.close();
             rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_voluntario_adm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
    public void dadosCbPessoa() {
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "SELECT * FROM pessoa;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                cbPessoa.addItem(rs.getString("nome_completo"));
            }
            
            rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_voluntario_adm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private void tfEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailKeyPressed

    private void btAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseClicked
        funcao = (tabelaVoluntarioAdm.getValueAt(tabelaVoluntarioAdm.getSelectedRow(), 1).toString());
        
        VerificaNulo();        
        
        if (CampoPreenchido){
            try {            
            JOptionPane.showMessageDialog(null, "A funçao é: " + funcao);
            Connection con = Conexao.conexaoBanco();
            String sql = "UPDATE funcao SET tipo = ?, email = ?, senha = ? WHERE idPessoa = (SELECT idPessoa FROM pessoa WHERE nome_completo = ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, funcao);
            stmt.setString(2, tfEmail.getText());
            stmt.setString(3, pfConfSenha.getText());
            stmt.setString(4, cbPessoa.getSelectedItem().toString());
            stmt.execute();
            
            
            
            JOptionPane.showMessageDialog(null, "Tabela Função alterado com sucesso!!!");
            
            if(funcao.equals("Voluntário")){
                JOptionPane.showMessageDialog(null, "A funcao é " + funcao);
                String sql1 = "UPDATE voluntario SET email_voluntario = ?, senha_voluntario = ? WHERE idPessoa = (SELECT idPessoa FROM pessoa WHERE nome_completo = ?);";
                PreparedStatement stmt1 = con.prepareStatement(sql1);
                stmt1.setString(1, tfEmail.getText());
                stmt1.setString(2, pfConfSenha.getText());
                stmt1.setString(3, cbPessoa.getSelectedItem().toString());
                stmt1.execute();
                
                stmt1.close();
                JOptionPane.showMessageDialog(null, "Tabela Voluntário alterado com sucesso!!!");
            } else if (funcao.equals("Administracao")){
                
                String sql2 = "UPDATE adm SET email_adm = ?, senha_adm = ? WHERE idPessoa = (SELECT idPessoa FROM pessoa WHERE nome_completo = ?);";
                PreparedStatement stmt2 = con.prepareStatement(sql2);
                stmt2.setString(1, tfEmail.getText());
                stmt2.setString(2, pfConfSenha.getText());
                stmt2.setString(3, cbPessoa.getSelectedItem().toString());
                stmt2.execute();
                
                stmt.close();
                JOptionPane.showMessageDialog(null, "Tabela Administrador alterado com sucesso!!!");
            }
            
            stmt.close();
            con.close();
            MostrarTabela();
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_voluntario_adm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        cbPessoa.setSelectedItem(null);
        tfEmail.setText(null);
        rbAdm.setSelected(false);
        rbVoluntario.setSelected(false);
        pfConfSenha.setText(null);
        pfSenha.setText(null);
        
        } else {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos as caixas!");
        }
        
        
        
    }//GEN-LAST:event_btAlterarMouseClicked

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        funcao = (tabelaVoluntarioAdm.getValueAt(tabelaVoluntarioAdm.getSelectedRow(), 1).toString());
        
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "DELETE FROM funcao WHERE idPessoa = (SELECT idPessoa FROM pessoa WHERE nome_completo = ?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cbPessoa.getSelectedItem().toString());
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Excluído");                        
            
            if (funcao == "Voluntário") {
                String sql1 = "DELETE FROM voluntario WHERE idPessoa = (SELECT idPessoa FROM pessoa WHERE nome_completo = ?);";
                PreparedStatement stmt1 = con.prepareStatement(sql1);
                stmt1.setString(1, cbPessoa.getSelectedItem().toString());
                stmt1.execute();
            
                stmt1.close();
                
            JOptionPane.showMessageDialog(null, "Voluntário Excluído");                        
            } else if (funcao == "Administrador") {
                String sql2 = "DELETE FROM adm WHERE idPessoa = (SELECT idPessoa FROM pessoa WHERE nome_completo = ?);";
                PreparedStatement stmt2 = con.prepareStatement(sql2);
                stmt2.setString(1, cbPessoa.getSelectedItem().toString());
                stmt2.execute();
            
                stmt2.close();
                
            JOptionPane.showMessageDialog(null, "Administrador Excluído");                        
            }
            
              stmt.close();
              con.close();            
            
              MostrarTabela(); 
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_voluntario_adm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cbPessoa.setSelectedItem(null);
        tfEmail.setText(null);
        rbAdm.setSelected(false);
        rbVoluntario.setSelected(false);
        pfConfSenha.setText(null);
        pfSenha.setText(null);
        
        
        
    }//GEN-LAST:event_btExcluirMouseClicked

    private void rbAdmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbAdmItemStateChanged
        funcao = "Administrador";       
    }//GEN-LAST:event_rbAdmItemStateChanged

    private void rbVoluntarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbVoluntarioItemStateChanged
        funcao = "Voluntário";
    }//GEN-LAST:event_rbVoluntarioItemStateChanged

    private void btCadastrar_benfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrar_benfMouseClicked
        
        VerificaNulo();
        
      if (CampoPreenchido){  
          JOptionPane.showMessageDialog(null, "Verdadeiro");
        try {
            Connection con = Conexao.conexaoBanco();
            String sql = "INSERT INTO funcao(tipo,email,senha,idPessoa) VALUES(?,?,?,(SELECT idPessoa FROM pessoa WHERE nome_completo = ?));";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, funcao);
            stmt.setString(2, tfEmail.getText());
            stmt.setString(3, pfConfSenha.getText());
            stmt.setString(4, cbPessoa.getSelectedItem().toString());            
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastrado em tabela Funcao!!");
            
            
            if (funcao == "Voluntário"){
            
            String sql1 = "INSERT INTO voluntario(email_voluntario,senha_voluntario,idPessoa) VALUES(?,?,(SELECT idPessoa FROM pessoa WHERE nome_completo = ?));";
            PreparedStatement stmt1 = con.prepareStatement(sql1);            
            stmt1.setString(1, tfEmail.getText());
            stmt1.setString(2, pfConfSenha.getText().toString());
            stmt1.setString(3, cbPessoa.getSelectedItem().toString());
            stmt1.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastrado em tabela Voluntario!!");        
            
            stmt1.close();
            
            
            } else if (funcao == "Administrador") {                
                String sql2 = "INSERT INTO adm(email_adm,senha_adm,idPessoa) VALUES(?,?,(SELECT idPessoa FROM pessoa WHERE nome_completo = ?));";
                PreparedStatement stmt2 = con.prepareStatement(sql2);            
                stmt2.setString(1, tfEmail.getText());
                stmt2.setString(2, pfConfSenha.getText().toString());
                stmt2.setString(3, cbPessoa.getSelectedItem().toString());
                stmt2.execute();

                stmt2.close();
               
                
                JOptionPane.showMessageDialog(null, "Cadastrado em tabela Adm!!");
            }
            
            stmt.close();            
            con.close();
            
            MostrarTabela();
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastrar_voluntario_adm.class.getName()).log(Level.SEVERE, null, ex);                                    
        }
        
        cbPessoa.setSelectedItem(null);
        tfEmail.setText(null);
        rbAdm.setSelected(false);
        rbVoluntario.setSelected(false);
        pfConfSenha.setText(null);
        pfSenha.setText(null);
        
        } else {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos");
        }
    }//GEN-LAST:event_btCadastrar_benfMouseClicked
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Funcao;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar_benf;
    private javax.swing.JButton btExcluir;
    private javax.swing.JComboBox<String> cbPessoa;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pfConfSenha;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JRadioButton rbAdm;
    private javax.swing.JRadioButton rbVoluntario;
    private javax.swing.JTable tabelaVoluntarioAdm;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
