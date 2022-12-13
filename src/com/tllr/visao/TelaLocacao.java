/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tllr.visao;

import com.tllr.controle.AcessorioControle;
import com.tllr.controle.CategoriaControle;
import com.tllr.controle.ClienteControle;
import com.tllr.controle.IAcessorioControle;
import com.tllr.controle.ICategoriaControle;
import com.tllr.controle.IClienteControle;
import com.tllr.controle.ILocacaoControle;
import com.tllr.controle.IModeloControle;
import com.tllr.controle.IMotoristaControle;
import com.tllr.controle.IVeiculoControle;
import com.tllr.controle.LocacaoControle;
import com.tllr.controle.ModeloControle;
import com.tllr.controle.MotoristaControle;
import com.tllr.controle.VeiculoControle;
import com.tllr.enums.Combustivel;
import com.tllr.enums.Situacao;
import com.tllr.enums.SituacaoLocacao;
import com.tllr.enums.VeiculoTipo;
import com.tllr.modelos.Acessorio;
import com.tllr.modelos.Categoria;
import com.tllr.modelos.Locacao;
import com.tllr.modelos.Modelo;
import com.tllr.modelos.Motorista;
import com.tllr.modelos.Veiculo;
import com.tllr.persistencia.ILocacaoDao;
import com.tllr.persistencia.LocacaoDao;
import java.awt.Frame;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patricia
 */
public class TelaLocacao extends javax.swing.JFrame {
  IMotoristaControle motoristaControle = new MotoristaControle();
    IAcessorioControle acessorioControle = new AcessorioControle();
    IModeloControle modelo = new ModeloControle();
    IVeiculoControle veiculoControle = new VeiculoControle();
    String[] saida;
    String cu;
    int idText;
    /**
     * Creates new form TelaLocacao
     * @param parent
     * @param modal
     */
    public TelaLocacao() {
        initComponents();
      try {
          JOptionPane.showMessageDialog(this, "Aperte em buscar motoristas para continuar");
          jTableVeiculo.setEnabled(false);
          jTableAcessorios.setEnabled(false);
          setLocationRelativeTo(null);
          imprimirDadosNaGridAcessorios(acessorioControle.listagem());
          imprimirDadosNaGridVeiculo(veiculoControle.listagemVeiculo());
      } catch (Exception ex) {
          Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
public void receberCliente(String cpf_cnpj){
        jTextFieldIdCliente.setText(cpf_cnpj);
}
   public void imprimirDadosNaGridVeiculo(ArrayList<Veiculo> listaDeVeiculos) {
        DefaultTableModel model = (DefaultTableModel) jTableVeiculo.getModel();
        model.setNumRows(0);
        Iterator<Veiculo> lista = listaDeVeiculos.iterator();
        try {
            while (lista.hasNext()) {
                String[] saida = new String[14];
                Veiculo aux = lista.next();
                saida[0] = "" + aux.getId();
                saida[1] = aux.getPlaca();
                saida[2] = aux.getRenavam() + "";
                saida[3] =aux.getPrecoCompra() + "";
                saida[4] =aux.getPrecoVenda()+ "";
                saida[5] =aux.getAnoDeFabricacao()+ "";
                saida[6] =aux.getAnoModelo()+ "";
                saida[7] =aux.getCombustivel() + "";
                saida[8] =aux.getQuilometragem()+ "";
                saida[9] =aux.getTipoVeiculo()+ "";
                saida[10] =aux.getSituacao()+ "";
                saida[11] = aux.getCategoria().getDescricao();
                saida[12] = aux.getModelo().getDescricao();
                saida[13] = modelo.buscar(aux.getModelo().getId()).getMarca().getDescricao();                
                //Incluir nova linha na Tabela
                if(saida[10].equals("DISPONIVEL")){
                model.addRow(saida);    
                }
                
            }

        } catch (Exception ex) {

        }
   }
public void imprimirDadosNaGridAcessorios(ArrayList<Acessorio> listaDeAcessorios)throws Exception{
            DefaultTableModel model = (DefaultTableModel) jTableAcessorios.getModel();
            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Acessorio> lista = listaDeAcessorios.iterator();               

            while (lista.hasNext()) {
                String[] saida = new String[3];
                Acessorio aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getValorLocacao() + "";
                
                //Incluir nova linha na Tabela
                model.addRow(saida);
                
            }
    }     
public void imprimirDadosNaGridMotoristas(ArrayList<Motorista> listaDeMotoristas){
         
            DefaultTableModel model = (DefaultTableModel) jTableClientes.getModel();
            //Limpa a tabela 
            model.setNumRows(0);
            Iterator<Motorista> lista = listaDeMotoristas.iterator();               

            while (lista.hasNext()) {
             // return id + ";" + nome + ";" + numeroCnh + ";" + dataValidade + ";" + endereco + ";" + telefone + ";" + cliente.getId() ;
                saida = new String[7];
                Motorista aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getNome();
                saida[2] = aux.getNumeroCnh() + "";
                saida[3] = aux.getDataValidade()+ "";
                saida[4] = aux.getEndereco().getCEP() +";"+ aux.getEndereco().getBairro() +";"+  aux.getEndereco().getCidade() 
                        +";"+ aux.getEndereco().getComplemento() +";"+ aux.getEndereco().getEstado() +";"+ aux.getEndereco().getLogradouro();
                saida[5] = "+"+aux.getTelefone().getDDI() + "("+aux.getTelefone().getDDD() +")" + aux.getTelefone().getNumero()+"";
               saida[6] = aux.getCliente().getCpf_cnpj();
               String idCliente = aux.getCliente().getId() + "";
                //Incluir nova linha na Tabela
               if(idCliente.equals(jTextFieldIdCliente.getText())){
                   model.addRow(saida);
               }                
            }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVeiculo = new javax.swing.JTable();
        jPanelTopo2 = new javax.swing.JPanel();
        jLabelEmpresa2 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAcessorios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jFormattedTextFieldInicio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTermino = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFundo2.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFundo2.setLayout(null);

        jTableVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Placa", "Renavam", "Preço Compra", "Preço Venda", "Ano Fabricação", "Ano Modelo", "Combustivel", "Quilometragem", "Tipo", "Situação", "Categoria", "Modelo", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVeiculo.setRowHeight(40);
        jTableVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVeiculoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVeiculo);

        jPanelFundo2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 290, 1280, 110);

        jPanelTopo2.setBackground(new java.awt.Color(0, 0, 51));

        jLabelEmpresa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/designed2.png"))); // NOI18N

        jLabelTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo2.setText("Escolha o Cliente");

        javax.swing.GroupLayout jPanelTopo2Layout = new javax.swing.GroupLayout(jPanelTopo2);
        jPanelTopo2.setLayout(jPanelTopo2Layout);
        jPanelTopo2Layout.setHorizontalGroup(
            jPanelTopo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopo2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 606, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTopo2Layout.setVerticalGroup(
            jPanelTopo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopo2Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jLabelEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelFundo2.add(jPanelTopo2);
        jPanelTopo2.setBounds(0, 10, 1290, 130);

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CNH", "Data Validade", "Endereco", "Telefone", "CPF/CNPJ -Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.setRowHeight(55);
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jPanelFundo2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 960, 90);

        jTableAcessorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descricao", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAcessorios.setRowHeight(40);
        jTableAcessorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAcessoriosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAcessorios);

        jPanelFundo2.add(jScrollPane3);
        jScrollPane3.setBounds(980, 190, 310, 90);

        jButton1.setText("Locar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelFundo2.add(jButton1);
        jButton1.setBounds(600, 440, 180, 60);

        try {
            jFormattedTextFieldInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelFundo2.add(jFormattedTextFieldInicio);
        jFormattedTextFieldInicio.setBounds(50, 450, 120, 22);

        try {
            jFormattedTextFieldTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTermino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldTermino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldTerminoKeyPressed(evt);
            }
        });
        jPanelFundo2.add(jFormattedTextFieldTermino);
        jFormattedTextFieldTermino.setBounds(210, 450, 110, 22);

        jLabel1.setText("Data Final");
        jPanelFundo2.add(jLabel1);
        jLabel1.setBounds(220, 430, 70, 16);

        jLabel2.setText("Data Inicial");
        jPanelFundo2.add(jLabel2);
        jLabel2.setBounds(50, 430, 70, 16);

        jTextFieldIdCliente.setEditable(false);
        jTextFieldIdCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldIdClienteMouseClicked(evt);
            }
        });
        jPanelFundo2.add(jTextFieldIdCliente);
        jTextFieldIdCliente.setBounds(10, 160, 100, 22);

        jLabel3.setText("CPF DO CLIENTE CONTRATANTE DO SERVIÇO");
        jPanelFundo2.add(jLabel3);
        jLabel3.setBounds(10, 140, 270, 16);

        jButton2.setText("Buscar Motoristas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelFundo2.add(jButton2);
        jButton2.setBounds(120, 160, 130, 22);
        jPanelFundo2.add(jLabel4);
        jLabel4.setBounds(50, 510, 400, 20);

        jButton3.setText("Calcular preço");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelFundo2.add(jButton3);
        jButton3.setBounds(330, 450, 120, 22);
        jPanelFundo2.add(jLabel5);
        jLabel5.setBounds(50, 490, 400, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked

    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTableVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVeiculoMouseClicked
       
    }//GEN-LAST:event_jTableVeiculoMouseClicked

    private void jTableAcessoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAcessoriosMouseClicked
    
    }//GEN-LAST:event_jTableAcessoriosMouseClicked

    private void jTextFieldIdClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldIdClienteMouseClicked

    }//GEN-LAST:event_jTextFieldIdClienteMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try {
          imprimirDadosNaGridMotoristas(motoristaControle.listagemMotorista());
          
          jTableVeiculo.setEnabled(true);
          jTableAcessorios.setEnabled(true);
          
      } catch (Exception ex) {
          Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
      }    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
          if(jTableAcessorios.getSelectedRow() == - 1 || jTableClientes.getSelectedRow() == -1 ||jTableVeiculo.getSelectedRow() == -1 || jFormattedTextFieldInicio.getText().equals("  /  /    ")||jFormattedTextFieldTermino.getText().equals("  /  /    ")){
              JOptionPane.showMessageDialog(this, "Selecione todos os campos para continuar");
          }else{
              String[] itensAcessorio= new String[3];
          itensAcessorio[0]  = jTableAcessorios.getValueAt(jTableAcessorios.getSelectedRow(), 0).toString();
          itensAcessorio[1]  = jTableAcessorios.getValueAt(jTableAcessorios.getSelectedRow(), 1).toString();
          itensAcessorio[2]  = jTableAcessorios.getValueAt(jTableAcessorios.getSelectedRow(), 2).toString();
          Acessorio objetoAcessorio = new Acessorio(Integer.parseInt(itensAcessorio[0]) , itensAcessorio[1] , Float.parseFloat(itensAcessorio[2]));
          String[] itensMotorista = new String[5];
          String separar = jFormattedTextFieldInicio.getText();
          String[] resultadoInicio = separar.split("/");
          String separarFinal = jFormattedTextFieldTermino.getText();
          String[] resultadoFinal = separarFinal.split("/");
          ILocacaoControle locacaoControle  = new LocacaoControle();
          Locacao objetoDatas = new Locacao(
                  Integer.parseInt(resultadoInicio[2]), Integer.parseInt(resultadoInicio[1]),
                  Integer.parseInt(resultadoInicio[0]), Integer.parseInt(resultadoFinal[2]), Integer.parseInt(resultadoFinal[1]),
                  Integer.parseInt(resultadoFinal[0]));
          int idCliente = Integer.parseInt(jTextFieldIdCliente.getText());
          IClienteControle objetoCliente = new ClienteControle();
          IVeiculoControle objetoVeiculo = new VeiculoControle();
          IMotoristaControle objetoMotorista = new MotoristaControle();
          ICategoriaControle objetocategoria = new CategoriaControle();
          IModeloControle modeloControle = new ModeloControle();
          Modelo objetoModelo = new Modelo();
          // public Veiculo(int id, String placa, long renavam, float precoCompra, float precoVenda, int anoDeFabricacao, int anoModelo, Combustivel combustivel, int quilometragem, VeiculoTipo tipoVeiculo, Situacao situacao, Categoria categoria, Modelo modelo) {
          String[] veiculo = new String[13];
          veiculo[0] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 0).toString();
          veiculo[1] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 1).toString();
          veiculo[2] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 2).toString();
          veiculo[3] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 3).toString();
          veiculo[4] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 4).toString();
          veiculo[5] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 5).toString();
          veiculo[6] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 6).toString();
          veiculo[7] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 7).toString();
          veiculo[8] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 8).toString();
          veiculo[9] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 9).toString();
          veiculo[10] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 10).toString();
          veiculo[11] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 11).toString();
          veiculo[12] = jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 12).toString();
         int idModelo = 0;
          Veiculo objetoVeiculoConstrutor = new Veiculo(Integer.parseInt(veiculo[0]),veiculo[1],Long.parseLong(veiculo[2]),Float.parseFloat(veiculo[3]),Float.parseFloat(veiculo[4]),Integer.parseInt(veiculo[5]),Integer.parseInt(veiculo[6]),Combustivel.valueOf(veiculo[7]),Integer.parseInt(veiculo[8]),VeiculoTipo.valueOf(veiculo[9]),Situacao.LOCADO,objetocategoria.buscarPorDesc(veiculo[11]),modeloControle.buscar(idModelo));
          int idVeiculo =Integer.parseInt(jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 0).toString());
          int idMotorista = Integer.parseInt(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 0).toString());
          Locacao objetoLocacao = new Locacao(0,Integer.parseInt(resultadoInicio[2]), Integer.parseInt(resultadoInicio[1]),
                  Integer.parseInt(resultadoInicio[0]), Integer.parseInt(resultadoFinal[2]), Integer.parseInt(resultadoFinal[1]),
                  Integer.parseInt(resultadoFinal[0]),locacaoControle.calcularValorLocacao(objetoDatas,objetoVeiculoConstrutor ,objetoAcessorio) , SituacaoLocacao.EM_ABERTO,objetoCliente.buscar(idCliente) , objetoVeiculo.buscar(idVeiculo), objetoAcessorio,objetoMotorista.buscar(idMotorista));
          ArrayList<Veiculo> lista = veiculoControle.listagemVeiculo();
          for(int i = 0; i < lista.size(); i++){
          if(idVeiculo == lista.get(i).getId()){
              objetoLocacao.setVeiculo(lista.get(i));
          }
          }
          ArrayList<Modelo> listaModelo = modeloControle.listagemModelo();
          for(int i = 0; i < listaModelo.size(); i++){
          if(veiculo[12].equals(listaModelo.get(i).getDescricao())){
              objetoVeiculoConstrutor.setModelo(listaModelo.get(i));
          }
          }
          locacaoControle.locar(objetoLocacao);
          veiculoControle.alterar(objetoVeiculoConstrutor);
          imprimirDadosNaGridVeiculo(veiculoControle.listagemVeiculo());
          imprimirDadosNaGridMotoristas(motoristaControle.listagemMotorista());
          imprimirDadosNaGridAcessorios(acessorioControle.listagem());
          JOptionPane.showMessageDialog(this, "Veículo locado");
          this.dispose();
          }
      } catch (Exception ex) {
          Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextFieldTerminoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTerminoKeyPressed
        
    }//GEN-LAST:event_jFormattedTextFieldTerminoKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                  if(jTableAcessorios.getSelectedRow() != - 1 || jTableClientes.getSelectedRow() != -1 ||jTableVeiculo.getSelectedRow() != -1 || jFormattedTextFieldInicio.getText().equals("  /  /    ")||jFormattedTextFieldTermino.getText().equals("  /  /    ")){

        try {
          //        long diferenca = ChronoUnit.DAYS.between(objeto.setarInicio(objeto.getAnoInicio(), objeto.getDiaInicio(), objeto.getMesInicio()), objeto.setarFim(objeto.getAnoFinal(), objeto.getDiaFinal(), objeto.getMesFinal()))
//        float total = (objetoVeiculo.getCategoria().getValorLocacao()+ objetoAcessorio.getValorLocacao()) * diferenca
//        double calcao = total * 0.5
//        return (float) (total + calcao)
       int idVeiculo = Integer.parseInt(jTableVeiculo.getValueAt(jTableVeiculo.getSelectedRow(), 0).toString());
       int idAcessorio = Integer.parseInt(jTableAcessorios.getValueAt(jTableAcessorios.getSelectedRow(), 0).toString());
       float valorAcessorio=0;
       ArrayList<Acessorio> listaAcessorio = acessorioControle.listagem();
        for(int i = 0; i < listaAcessorio.size();i++){
       if(idAcessorio == listaAcessorio.get(i).getId()){
        valorAcessorio = listaAcessorio.get(i).getValorLocacao();
        
       }
}   
       float valorLocacao= 0; 
       ArrayList<Veiculo> lista = veiculoControle.listagemVeiculo();
        for(int i = 0; i < lista.size();i++){
       if(idVeiculo == lista.get(i).getId()){
        valorLocacao = lista.get(i).getCategoria().getValorLocacao();
        
       }
}
//        public LocalDate setarInicio( int ano,int dia,int mes){
//         LocalDate dataInicial = LocalDate.of(ano, mes, dia);
//        return dataInicial;
//   
//    public LocalDate setarFim( int ano,int dia,int mes){
//         LocalDate dataFinal = LocalDate.of(ano, mes, dia);
//        return dataFinal;
//   
        String anoInicio = jFormattedTextFieldInicio.getText();
        String anoFinal = jFormattedTextFieldTermino.getText();
        String[] separarAnoInicio = anoInicio.split("/");
        String[] separarAnoFinal = anoFinal.split("/");
        int diaDeInicio = Integer.parseInt(separarAnoInicio[0]);
        int mesDeInicio = Integer.parseInt(separarAnoInicio[1]);
        int anoDeInicio = Integer.parseInt(separarAnoInicio[2]);
        LocalDate dataInicial = LocalDate.of(anoDeInicio, mesDeInicio, diaDeInicio);
       int diaDeFinal = Integer.parseInt(separarAnoFinal[0]);
        int mesDeFinal = Integer.parseInt(separarAnoFinal[1]);
        int anoDeFinal = Integer.parseInt(separarAnoFinal[2]);
        LocalDate dataFinal = LocalDate.of(anoDeFinal, mesDeFinal, diaDeFinal);
        long diferenca = ChronoUnit.DAYS.between(dataInicial,dataFinal);
        float total = (valorLocacao + valorAcessorio)*diferenca;
        double calcao = total * 0.5;
        float preco = (float) (calcao+total);
          String saida = "SubTotal: "+"["+ "("+valorLocacao +" + "+valorAcessorio+")"+" * " + diferenca + "]" +" = "+total;
          String saida2 = "Valor total a ser pago: "+total + " * " + "50% " +" + SubTotal "+" = "+ preco;
          jLabel4.setText(saida2);
          jLabel5.setText(saida);
           } catch (Exception ex) {
          Logger.getLogger(TelaLocacao.class.getName()).log(Level.SEVERE, null, ex);
      }}else{
                      JOptionPane.showMessageDialog(this, "Selecione todos os campos para continuar");
                  }
    
    }//GEN-LAST:event_jButton3ActionPerformed
 

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
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextFieldInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelEmpresa2;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JPanel jPanelFundo2;
    private javax.swing.JPanel jPanelTopo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAcessorios;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableVeiculo;
    private javax.swing.JTextField jTextFieldIdCliente;
    // End of variables declaration//GEN-END:variables
}
