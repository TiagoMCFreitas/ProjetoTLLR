/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tllr.visao;

import com.tllr.controle.ClienteControle;
import com.tllr.controle.IClienteControle;
import com.tllr.enums.TipoCliente;
import com.tllr.modelos.Cliente;
import com.tllr.modelos.Endereco;
import com.tllr.modelos.Telefone;
import com.tllr.persistencia.ClienteDao;
import com.tllr.persistencia.IClienteDao;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Patricia
 */
public class TelaAlterarCliente extends javax.swing.JFrame {
    String pegar;
        String campo;

    TelaAlterarEndereco endereco;
    TelaPlanilhaClientes planilha;
    String cep, bairro, rua, uf = "AC", cidade = "Abadia de Goiás", complemento;
 JFormattedTextField jf;
    JFormattedTextField jf2;
    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaAlterarCliente() {
        initComponents();
        setLocationRelativeTo(null);
          try {
           jf2 = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
            jf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
       
        }
         jPanel1. add(jf);
        jPanel1.add(jf2);
        jf.setBounds(105,45,100,25);
        jf2.setBounds(0,0,0,0);
        jTextFieldEndereco.setText(pegar);
        carregarcbmx();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTopo2 = new javax.swing.JPanel();
        jLabelEmpresa2 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelTitulo4 = new javax.swing.JLabel();
        jTextFieldRazao = new javax.swing.JTextField();
        jLabelTitulo5 = new javax.swing.JLabel();
        jLabelCadastrar = new javax.swing.JLabel();
        jLabelTitulo6 = new javax.swing.JLabel();
        jLabelTitulo7 = new javax.swing.JLabel();
        jLabelTitulo8 = new javax.swing.JLabel();
        jLabelTitulo9 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelTitulo10 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jButtonEndereco = new javax.swing.JButton();
        jLabelTitulo11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelTitulo12 = new javax.swing.JLabel();
        jTextFieldIdDDI = new javax.swing.JTextField();
        jTextFieldIdDDD = new javax.swing.JTextField();
        jTextFieldIdNumero = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTopo2.setBackground(new java.awt.Color(0, 0, 51));

        jLabelEmpresa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/designed2.png"))); // NOI18N

        jLabelTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanelTopo2Layout = new javax.swing.GroupLayout(jPanelTopo2);
        jPanelTopo2.setLayout(jPanelTopo2Layout);
        jPanelTopo2Layout.setHorizontalGroup(
            jPanelTopo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopo2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabelTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanelTopo2Layout.setVerticalGroup(
            jPanelTopo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopo2Layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTopo2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabelTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo3.setText("Nome");

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyReleased(evt);
            }
        });

        jLabelTitulo4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo4.setText("Razão Social");

        jLabelTitulo5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo5.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo5.setText("Identidade");

        jLabelCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ImageAnimacoes/botaoalterar.png"))); // NOI18N
        jLabelCadastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCadastrarMouseMoved(evt);
            }
        });
        jLabelCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCadastrarMouseExited(evt);
            }
        });

        jLabelTitulo6.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo6.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo6.setText("DDD");

        jLabelTitulo7.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo7.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo7.setText("DDI");

        jLabelTitulo8.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo8.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo8.setText("Numero");

        jLabelTitulo9.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo9.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo9.setText("Email");

        jLabelTitulo10.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo10.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo10.setText("Endereco");

        jTextFieldEndereco.setEditable(false);

        jButtonEndereco.setText("Alterar Endereco");
        jButtonEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnderecoActionPerformed(evt);
            }
        });

        jLabelTitulo11.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo11.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo11.setText("Tipo do Cliente");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelTitulo12.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo12.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo12.setText("CPF/CNPJ");

        jLabelId.setBackground(new java.awt.Color(153, 153, 153));
        jLabelId.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTitulo3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTitulo12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTitulo11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTitulo10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButtonEndereco))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTitulo9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelTitulo7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIdDDI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTitulo6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIdDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTitulo8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelTitulo5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldId))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelTitulo4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelId)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastrar)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdDDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTopo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTopo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCadastrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseMoved

        ImageIcon botaoCadastrar = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoalterarencima.png");
        jLabelCadastrar.setIcon(botaoCadastrar);
    }//GEN-LAST:event_jLabelCadastrarMouseMoved

    private void jLabelCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseClicked
        try {
             if(jTextFieldEndereco.getText().equals("") || jTextFieldIdDDI.getText().equals("")|| jTextFieldIdDDD.getText().equals("") ||jTextFieldIdNumero.getText().equals("")||jf.getText().equals("   .   .   -  ")&& jf2.getText().equals("  .   .   /    -  ")){
                JOptionPane.showMessageDialog(this, "Campos faltando, verifique a alteração");

             }else{
            String enuma;
            Telefone objetoTelefone = new Telefone(Integer.parseInt(jTextFieldIdDDI.getText()), Integer.parseInt(jTextFieldIdDDD.getText()), Integer.parseInt(jTextFieldIdNumero.getText()));
            String string1 = jTextFieldEndereco.getText();
            String[] result = string1.split(";");
            if (jComboBox1.getSelectedIndex() == 0) {
                enuma = TipoCliente.FISICA + "";
                campo = jf.getText();
            } else {
                enuma = TipoCliente.JURIDICA + "";
                campo = jf2.getText();
            }
             Endereco objetoEndereco = new Endereco(result[0], result[1], result[2], result[3], result[4], result[5]);
             
             Cliente objetoCliente = new Cliente(Integer.parseInt(jLabelId.getText()), campo, jTextFieldNome.getText(), jTextFieldRazao.getText(),
                     jTextFieldId.getText(), objetoTelefone, jTextFieldEmail.getText(), objetoEndereco, TipoCliente.valueOf(enuma));
            //String cep, String bairro, String rua, String uf, String cidade, String complemento
            IClienteControle objeto = new ClienteControle();
            objeto.verificacoes(objetoCliente,objetoTelefone,objetoEndereco);
            objeto.alterar(objetoCliente);
            JOptionPane.showMessageDialog(this, "Cliente Alterado");
            planilha = new TelaPlanilhaClientes();
            planilha.imprimirDadosNaGrid(objeto.listagemCliente());
            planilha.setVisible(true);
            this.dispose();
             }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jLabelCadastrarMouseClicked

    private void jLabelCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastrarMouseExited
        ImageIcon botaoCadastrar = new ImageIcon("./src/Imagens/ImageAnimacoes/botaoalterar.png");
        jLabelCadastrar.setIcon(botaoCadastrar);
    }//GEN-LAST:event_jLabelCadastrarMouseExited

    private void jButtonEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnderecoActionPerformed
        endereco = new TelaAlterarEndereco();
        if(jComboBox1.getSelectedIndex() == 0){
                   campo = jf.getText();
                  }else{
                    campo  = jf2.getText();
         }
        jTextFieldEndereco.setText("");
        String enuma;
        if (jComboBox1.getSelectedIndex() == 0) {
            enuma = TipoCliente.FISICA + "";
        } else {
            enuma = TipoCliente.JURIDICA + "";

        }
        endereco.receberEnd(cep, bairro, rua, uf, cidade, complemento);
        endereco.setVisible(true);
        endereco.manterCampos(jLabelId.getText(),jTextFieldNome.getText(), campo, jTextFieldRazao.getText(), jTextFieldId.getText(), jTextFieldIdDDI.getText(), jTextFieldIdDDD.getText(), jTextFieldIdNumero.getText(), jTextFieldEmail.getText(), TipoCliente.valueOf(enuma));
        this.dispose();
    }//GEN-LAST:event_jButtonEnderecoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
if(jComboBox1.getSelectedIndex() == 0){
                  jf.setBounds(105,45,100,25);
                   jf2.setBounds(0,0,0,0);
                   campo = jf.getText();
                   jf2.setText("");
            
        
                  }else{
                    jf2.setBounds(105,45,100,25);
                    jf.setBounds(0,0,0,0);
                    campo  = jf2.getText();
                    jf.setText("");
        
         }       

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        if(jComboBox1.getSelectedIndex() == 0){
             jTextFieldRazao.setText(jTextFieldNome.getText());
        }
        else{
            jTextFieldRazao.setText("");
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jTextFieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyReleased
        if(jComboBox1.getSelectedIndex() == 0){
             jTextFieldRazao.setText(jTextFieldNome.getText());
        }else{
             jTextFieldRazao.setText("");
        }
    }//GEN-LAST:event_jTextFieldNomeKeyReleased

    public void pegarInfo(String endereco) {
        pegar = endereco;
        jTextFieldEndereco.setText(endereco);

    }

    private void carregarcbmx() {
        jComboBox1.setModel(new DefaultComboBoxModel<>(TipoCliente.values()));
    }

    public void receber(String identificador,String cpf_cnpj, String nome, String razao, String id, String ddi, String ddd, String numero, String email, TipoCliente pessoa) {
        jLabelId.setText(identificador);
        jTextFieldNome.setText(nome);
           if(pessoa == TipoCliente.valueOf("FISICA")){
           jf.setText(cpf_cnpj);
        }else{
            jf2.setText(cpf_cnpj);
        }
        jTextFieldRazao.setText(razao);
        jTextFieldId.setText(id);
        jTextFieldIdDDI.setText(ddi);
        jTextFieldIdDDD.setText(ddd);
        jTextFieldIdNumero.setText(numero);
        jTextFieldEmail.setText(email);
        jComboBox1.setSelectedItem(pessoa);
    }

    public void manterEndereco(String cep, String bairro, String cidade, String complemento, String uf, String rua) {
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.uf = uf;
        this.cidade = cidade;
        this.complemento = complemento;
    }
    public void receberEpor(){
        Endereco objeto = new Endereco(cep, bairro, cidade, complemento, uf, rua);
        jTextFieldEndereco.setText(objeto.toString());
    }
    public void receberiD(String id){
        jLabelId.setText(id);
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
            java.util.logging.Logger.getLogger(TelaAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEndereco;
    private javax.swing.JComboBox<TipoCliente> jComboBox1;
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelEmpresa2;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelTitulo10;
    private javax.swing.JLabel jLabelTitulo11;
    private javax.swing.JLabel jLabelTitulo12;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTitulo3;
    private javax.swing.JLabel jLabelTitulo4;
    private javax.swing.JLabel jLabelTitulo5;
    private javax.swing.JLabel jLabelTitulo6;
    private javax.swing.JLabel jLabelTitulo7;
    private javax.swing.JLabel jLabelTitulo8;
    private javax.swing.JLabel jLabelTitulo9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTopo2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdDDD;
    private javax.swing.JTextField jTextFieldIdDDI;
    private javax.swing.JTextField jTextFieldIdNumero;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRazao;
    // End of variables declaration//GEN-END:variables
}