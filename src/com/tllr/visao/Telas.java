package com.tllr.visao;

import com.sun.media.sound.JARSoundbankReader;
import java.awt.Color;
import java.awt.Cursor;
import static java.nio.file.Files.list;
import static java.util.Collections.list;
import javax.sound.sampled.Line;
import javax.swing.*;
import jdk.jfr.internal.tool.*;

public class Telas extends javax.swing.JFrame {

    boolean fecharEAbrir;
    boolean opcoes1;
    boolean opcoes2;

    int x = 0;

    private TelaDeLogin TelaDeLogin;
    String teste;

    public Telas() {
        initComponents();
        setBounds(0, 0, 100, 100);
        setExtendedState(MAXIMIZED_BOTH);
        fecharEAbrir = true;
        opcoes1 = true;
        opcoes2 = true;
        TelaDeLogin = new TelaDeLogin();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFechar = new javax.swing.JLabel();
        Painel = new javax.swing.JDesktopPane();
        jPanelBarraLateral = new javax.swing.JPanel();
        jLabelNomeDoCliente = new javax.swing.JLabel();
        jLabelTLLR = new javax.swing.JLabel();
        jLabelNomeDoCliente2 = new javax.swing.JLabel();
        jLabel3Pontos = new javax.swing.JLabel();
        jLabelCopyRight = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelCadastroVeiculos = new javax.swing.JLabel();
        jLabelMotorista = new javax.swing.JLabel();
        jLabelSetaDireita = new javax.swing.JLabel();
        jLabelSetaDireita2 = new javax.swing.JLabel();
        jLabelSetaBaixo = new javax.swing.JLabel();
        jLabelSetaBaixo2 = new javax.swing.JLabel();
        jLabelSair = new javax.swing.JLabel();
        jPanelFundo = new javax.swing.JPanel();
        jPanelOpcoes2 = new javax.swing.JPanel();
        jLabelPlanilhaCliente = new javax.swing.JLabel();
        jLabelCadastroCliente = new javax.swing.JLabel();
        jLabelPlanilhaMotorista = new javax.swing.JLabel();
        jLabelLocarCarro = new javax.swing.JLabel();
        jLabelCadastroMotorista = new javax.swing.JLabel();
        jLabelPlanilhaLocacoes = new javax.swing.JLabel();
        jPanelOpcoes1 = new javax.swing.JPanel();
        jLabelMarcas = new javax.swing.JLabel();
        jLabelModelos = new javax.swing.JLabel();
        jLabelVeiculos = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelAccessorios = new javax.swing.JLabel();

        jLabelFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/Headline.png"))); // NOI18N
        jLabelFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFecharMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBarraLateral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelBarraLateral.setPreferredSize(new java.awt.Dimension(550, 1035));
        jPanelBarraLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBarraLateralMouseExited(evt);
            }
        });
        jPanelBarraLateral.setLayout(null);

        jLabelNomeDoCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNomeDoCliente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelBarraLateral.add(jLabelNomeDoCliente);
        jLabelNomeDoCliente.setBounds(0, 562, 0, 0);

        jLabelTLLR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/designed2.png"))); // NOI18N
        jPanelBarraLateral.add(jLabelTLLR);
        jLabelTLLR.setBounds(0, 0, 0, 65);

        jLabelNomeDoCliente2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanelBarraLateral.add(jLabelNomeDoCliente2);
        jLabelNomeDoCliente2.setBounds(0, 220, 0, 0);

        jLabel3Pontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/Headline.png"))); // NOI18N
        jLabel3Pontos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3Pontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3PontosMouseClicked(evt);
            }
        });
        jPanelBarraLateral.add(jLabel3Pontos);
        jLabel3Pontos.setBounds(6, 15, 34, 24);

        jLabelCopyRight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanelBarraLateral.add(jLabelCopyRight);
        jLabelCopyRight.setBounds(106, 781, 54, 0);

        jLabelMenu.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabelMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelBarraLateral.add(jLabelMenu);
        jLabelMenu.setBounds(106, 494, 54, 0);

        jLabelInicio.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabelInicio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseExited(evt);
            }
        });
        jPanelBarraLateral.add(jLabelInicio);
        jLabelInicio.setBounds(60, 75, 0, 0);

        jLabelCadastroVeiculos.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabelCadastroVeiculos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelCadastroVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastroVeiculos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelCadastroVeiculos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCadastroVeiculosMouseMoved(evt);
            }
        });
        jLabelCadastroVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastroVeiculosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCadastroVeiculosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCadastroVeiculosMouseExited(evt);
            }
        });
        jPanelBarraLateral.add(jLabelCadastroVeiculos);
        jLabelCadastroVeiculos.setBounds(106, 130, 0, 0);

        jLabelMotorista.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabelMotorista.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelMotorista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMotoristaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMotoristaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMotoristaMouseExited(evt);
            }
        });
        jPanelBarraLateral.add(jLabelMotorista);
        jLabelMotorista.setBounds(10, 420, 0, 0);

        jLabelSetaDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/setadireita.png"))); // NOI18N
        jLabelSetaDireita.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelSetaDireita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSetaDireita.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelSetaDireita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSetaDireitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSetaDireitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSetaDireitaMouseExited(evt);
            }
        });
        jPanelBarraLateral.add(jLabelSetaDireita);
        jLabelSetaDireita.setBounds(106, 341, 48, 0);

        jLabelSetaDireita2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/setadireita.png"))); // NOI18N
        jLabelSetaDireita2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSetaDireita2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSetaDireita2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSetaDireita2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSetaDireita2MouseExited(evt);
            }
        });
        jPanelBarraLateral.add(jLabelSetaDireita2);
        jLabelSetaDireita2.setBounds(10, 460, 0, 0);

        jLabelSetaBaixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/setabaixo.png"))); // NOI18N
        jLabelSetaBaixo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSetaBaixo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSetaBaixoMouseClicked(evt);
            }
        });
        jPanelBarraLateral.add(jLabelSetaBaixo);
        jLabelSetaBaixo.setBounds(6, 666, 0, 0);

        jLabelSetaBaixo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/setabaixo.png"))); // NOI18N
        jLabelSetaBaixo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSetaBaixo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSetaBaixo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSetaBaixo2MouseEntered(evt);
            }
        });
        jPanelBarraLateral.add(jLabelSetaBaixo2);
        jLabelSetaBaixo2.setBounds(10, 540, 0, 0);

        jLabelSair.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        jLabelSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSairMouseExited(evt);
            }
        });
        jPanelBarraLateral.add(jLabelSair);
        jLabelSair.setBounds(160, 196, 0, 0);

        jPanelFundo.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelBarraLateral.add(jPanelFundo);
        jPanelFundo.setBounds(88, 513, 0, 0);

        jPanelOpcoes2.setBackground(new java.awt.Color(0, 0, 51));

        jLabelPlanilhaCliente.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelPlanilhaCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlanilhaCliente.setText("Planilha Cliente");
        jLabelPlanilhaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPlanilhaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPlanilhaClienteMouseClicked(evt);
            }
        });

        jLabelCadastroCliente.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroCliente.setText("Cadastro Cliente");
        jLabelCadastroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastroClienteMouseClicked(evt);
            }
        });

        jLabelPlanilhaMotorista.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelPlanilhaMotorista.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlanilhaMotorista.setText("Planilha Motorista");
        jLabelPlanilhaMotorista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPlanilhaMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPlanilhaMotoristaMouseClicked(evt);
            }
        });

        jLabelLocarCarro.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelLocarCarro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLocarCarro.setText("Locar Carro");
        jLabelLocarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLocarCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLocarCarroMouseClicked(evt);
            }
        });

        jLabelCadastroMotorista.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelCadastroMotorista.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroMotorista.setText("Cadastro Motorista");
        jLabelCadastroMotorista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCadastroMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastroMotoristaMouseClicked(evt);
            }
        });

        jLabelPlanilhaLocacoes.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelPlanilhaLocacoes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlanilhaLocacoes.setText("Planilha Locações");
        jLabelPlanilhaLocacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPlanilhaLocacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPlanilhaLocacoesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcoes2Layout = new javax.swing.GroupLayout(jPanelOpcoes2);
        jPanelOpcoes2.setLayout(jPanelOpcoes2Layout);
        jPanelOpcoes2Layout.setHorizontalGroup(
            jPanelOpcoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcoes2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelOpcoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPlanilhaLocacoes)
                    .addComponent(jLabelCadastroMotorista)
                    .addComponent(jLabelLocarCarro)
                    .addComponent(jLabelPlanilhaMotorista)
                    .addComponent(jLabelCadastroCliente)
                    .addComponent(jLabelPlanilhaCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOpcoes2Layout.setVerticalGroup(
            jPanelOpcoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcoes2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabelPlanilhaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPlanilhaMotorista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCadastroMotorista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLocarCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPlanilhaLocacoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBarraLateral.add(jPanelOpcoes2);
        jPanelOpcoes2.setBounds(0, 0, 0, 0);

        jPanelOpcoes1.setBackground(new java.awt.Color(0, 0, 51));
        jPanelOpcoes1.setLayout(null);

        jLabelMarcas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelMarcas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarcas.setText("Marcas");
        jLabelMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMarcasMouseClicked(evt);
            }
        });
        jPanelOpcoes1.add(jLabelMarcas);
        jLabelMarcas.setBounds(10, 60, 120, 48);

        jLabelModelos.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelModelos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModelos.setText("Modelos");
        jLabelModelos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModelosMouseClicked(evt);
            }
        });
        jPanelOpcoes1.add(jLabelModelos);
        jLabelModelos.setBounds(10, 110, 140, 30);

        jLabelVeiculos.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelVeiculos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVeiculos.setText("Veiculos");
        jLabelVeiculos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVeiculosMouseClicked(evt);
            }
        });
        jPanelOpcoes1.add(jLabelVeiculos);
        jLabelVeiculos.setBounds(10, 150, 140, 44);

        jLabelCategoria.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categoria");
        jLabelCategoria.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCategoriaMouseClicked(evt);
            }
        });
        jPanelOpcoes1.add(jLabelCategoria);
        jLabelCategoria.setBounds(10, 190, 160, 40);

        jLabelAccessorios.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelAccessorios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAccessorios.setText("Acessorios");
        jLabelAccessorios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelAccessorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAccessorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAccessoriosMouseClicked(evt);
            }
        });
        jPanelOpcoes1.add(jLabelAccessorios);
        jLabelAccessorios.setBounds(10, 230, 170, 30);

        jPanelBarraLateral.add(jPanelOpcoes1);
        jPanelOpcoes1.setBounds(30, 430, 0, 0);

        Painel.setLayer(jPanelBarraLateral, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addComponent(jPanelBarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 880, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addComponent(jPanelBarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelFecharMouseClicked

    private void jLabel3PontosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3PontosMouseClicked
        //fechamento do painel lateral
        if (fecharEAbrir == false) {
            jPanelBarraLateral.setSize(50, 1035);

            //Inicia a Label Menu
            jLabelMenu.setBounds(0, 0, 300, 100);
            jLabelMenu.setLocation(47, 0);
            jLabelMenu.setForeground(Color.white);
            jLabelMenu.setText("Menu");

            //Inicia a Label CopyRight
            jLabelCopyRight.setSize(300, 40);
            jLabelCopyRight.setLocation(160, 980);
            jLabelCopyRight.setForeground(Color.gray);
            jLabelCopyRight.setText("Copyright © TLLR ");

            jLabelTLLR.setSize(280, 60);
            jLabelTLLR.setLocation(80, 900);

            //Inicia a Label Nome Do Cliente
            jLabelNomeDoCliente.setSize(450, 30);
            jLabelNomeDoCliente.setLocation(47, 120);
            jLabelNomeDoCliente.setForeground(Color.white);
            jLabelNomeDoCliente.setText("Bem vindo(a),");
            jLabelNomeDoCliente2.setSize(200, 30);
            jLabelNomeDoCliente2.setLocation(210, 120);
            jLabelNomeDoCliente2.setForeground(Color.white);

            //Inicia a Label Inicio
            jLabelInicio.setBounds(0, 0, 150, 60);
            jLabelInicio.setLocation(45, 220);
            jLabelInicio.setForeground(Color.white);
            jLabelInicio.setText("Inicio");

            //Inicia a Label Veiculos
            jLabelCadastroVeiculos.setBounds(0, 0, 350, 45);
            jLabelCadastroVeiculos.setLocation(80, 320);
            jLabelCadastroVeiculos.setForeground(Color.white);
            jLabelCadastroVeiculos.setText("Veiculos");

            //Inicia a Label Seta Direita
            jLabelSetaDireita.setSize(35, 35);
            jLabelSetaDireita.setLocation(35, 325);

            //inicia a Label Motorista
            jLabelMotorista.setSize(350, 65);
            jLabelMotorista.setLocation(80, 420);
            jLabelMotorista.setForeground(Color.white);
            jLabelMotorista.setText("Cliente");

            jLabelSetaDireita2.setSize(35, 35);
            jLabelSetaDireita2.setLocation(35, 425);

            //Inicia a Label Sair
            jLabelSair.setSize(130, 68);
            jLabelSair.setLocation(50, 510);
            jLabelSair.setForeground(Color.white);
            jLabelSair.setText("Sair");

            jLabelSetaBaixo.setSize(0, 0);
            jLabelSetaBaixo.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(0, 0);
            jLabelSetaBaixo.setLocation(0, 0);

            jPanelOpcoes1.setSize(0, 0);
            jPanelOpcoes1.setLocation(0, 0);

            jPanelOpcoes2.setSize(0, 0);
            jPanelOpcoes2.setLocation(0, 0);

            opcoes1 = true;
            opcoes2 = true;

            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 450; i >= 47; i--) {
                            Thread.sleep(1);
                            jPanelBarraLateral.setSize(i, 1035);

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);

                    }
                    fecharEAbrir = true;

                }
            };
            th.start();
        } else {
            //Abertura do painel lateral
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 47; i <= 450; i++) {
                            Thread.sleep(1);
                            jPanelBarraLateral.setSize(i, 1035);

                            //Inicia a Label Menu
                            jLabelMenu.setBounds(0, 0, 300, 100);
                            jLabelMenu.setLocation(47, 0);
                            jLabelMenu.setForeground(Color.white);
                            jLabelMenu.setText("Menu");

                            //Inicia a Label CopyRight
                            jLabelCopyRight.setSize(300, 40);
                            jLabelCopyRight.setLocation(160, 980);
                            jLabelCopyRight.setForeground(Color.gray);
                            jLabelCopyRight.setText("Copyright © TLLR ");

                            jLabelTLLR.setSize(280, 60);
                            jLabelTLLR.setLocation(80, 900);

                            //Inicia a Label Nome Do Cliente
                            jLabelNomeDoCliente.setSize(450, 30);
                            jLabelNomeDoCliente.setLocation(47, 120);
                            jLabelNomeDoCliente.setForeground(Color.white);
                            jLabelNomeDoCliente.setText("Bem vindo(a),");
                            jLabelNomeDoCliente2.setSize(200, 30);
                            jLabelNomeDoCliente2.setLocation(210, 120);
                            jLabelNomeDoCliente2.setForeground(Color.white);

                            //Inicia a Label Inicio
                            jLabelInicio.setBounds(0, 0, 150, 60);
                            jLabelInicio.setLocation(45, 220);
                            jLabelInicio.setForeground(Color.white);
                            jLabelInicio.setText("Inicio");

                            //Inicia a Label Veiculos
                            jLabelCadastroVeiculos.setBounds(0, 0, 350, 45);
                            jLabelCadastroVeiculos.setLocation(80, 320);
                            jLabelCadastroVeiculos.setForeground(Color.white);
                            jLabelCadastroVeiculos.setText("Veiculos");

                            //Inicia a Label Seta Direita
                            jLabelSetaDireita.setSize(35, 35);
                            jLabelSetaDireita.setLocation(35, 325);

                            //inicia a Label Motorista
                            jLabelMotorista.setSize(350, 65);
                            jLabelMotorista.setLocation(80, 420);
                            jLabelMotorista.setForeground(Color.white);
                            jLabelMotorista.setText("Cliente");

                            jLabelSetaDireita2.setSize(35, 35);
                            jLabelSetaDireita2.setLocation(35, 425);

                            //Inicia a Label Sair
                            jLabelSair.setSize(130, 68);
                            jLabelSair.setLocation(50, 510);
                            jLabelSair.setForeground(Color.white);
                            jLabelSair.setText("Sair");

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);

                    }

                    fecharEAbrir = false;

                }
            };
            th.start();

        }


    }//GEN-LAST:event_jLabel3PontosMouseClicked

    private void jLabelInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseEntered
        jPanelFundo.setSize(150, 65);
        jPanelFundo.setLocation(35, 215);

    }//GEN-LAST:event_jLabelInicioMouseEntered

    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked
        TelaDeLogin chamar = new TelaDeLogin();
        chamar.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jPanelBarraLateralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraLateralMouseExited


    }//GEN-LAST:event_jPanelBarraLateralMouseExited

    private void jLabelCadastroVeiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroVeiculosMouseEntered
        jPanelFundo.setSize(250, 55);
        jPanelFundo.setLocation(35, 315);

    }//GEN-LAST:event_jLabelCadastroVeiculosMouseEntered

    private void jLabelInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseExited
        jPanelFundo.setBounds(0, 0, 0, 0);
        jPanelFundo.setLocation(0, 0);
    }//GEN-LAST:event_jLabelInicioMouseExited

    private void jLabelCadastroVeiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroVeiculosMouseExited
        jPanelFundo.setSize(0, 0);
        jPanelFundo.setLocation(0, 0);


    }//GEN-LAST:event_jLabelCadastroVeiculosMouseExited

    private void jLabelCadastroVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroVeiculosMouseClicked
        if (opcoes1 == true) {

            jPanelOpcoes2.setSize(0, 0);
            jPanelOpcoes2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(0, 0);
            jLabelSetaBaixo2.setLocation(0, 0);

            jLabelSetaDireita2.setSize(35, 35);
            jLabelSetaDireita2.setLocation(35, 425);

            jLabelSair.setLocation(50, 510);

            opcoes2 = true;

            jPanelOpcoes1.setSize(420, 280);
            jPanelOpcoes1.setLocation(35, 300);

            jLabelMotorista.setLocation(80, 620);
            jLabelSetaDireita2.setLocation(35, 625);

            jLabelSetaDireita.setSize(0, 0);
            jLabelSetaDireita.setLocation(0, 0);

            jLabelSetaBaixo.setSize(35, 35);
            jLabelSetaBaixo.setLocation(35, 325);

            jLabelSair.setLocation(50, 710);

            opcoes1 = false;
        } else {
            jPanelOpcoes1.setSize(0, 0);
            jPanelOpcoes1.setLocation(0, 0);

            jLabelSetaBaixo.setSize(0, 0);
            jLabelSetaBaixo.setLocation(0, 0);

            jLabelSetaDireita.setSize(35, 35);
            jLabelSetaDireita.setLocation(35, 325);

            jLabelMotorista.setLocation(80, 420);
            jLabelSetaDireita2.setLocation(35, 425);
            jLabelSair.setLocation(50, 510);

            opcoes1 = true;
        }

    }//GEN-LAST:event_jLabelCadastroVeiculosMouseClicked

    private void jLabelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelSairMouseClicked

    private void jLabelSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSairMouseEntered
        if (opcoes1 == false) {
            jPanelFundo.setSize(125, 55);
            jPanelFundo.setLocation(30, 705);
        } else {
            jPanelFundo.setSize(125, 55);
            jPanelFundo.setLocation(30, 505);
        }

        if (opcoes2 == false) {
            jPanelFundo.setLocation(35, 740);
        }
    }//GEN-LAST:event_jLabelSairMouseEntered

    private void jLabelSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSairMouseExited
        jPanelFundo.setSize(0, 0);
        jPanelFundo.setLocation(0, 0);
    }//GEN-LAST:event_jLabelSairMouseExited

    private void jLabelSetaDireitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaDireitaMouseEntered
        if (fecharEAbrir == false) {
            jPanelFundo.setSize(250, 55);
            jPanelFundo.setLocation(35, 315);

        } else {
            jPanelFundo.setSize(0, 0);
            jPanelFundo.setLocation(0, 0);
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        }


    }//GEN-LAST:event_jLabelSetaDireitaMouseEntered

    private void jLabelSetaDireitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaDireitaMouseExited
        jPanelFundo.setSize(0, 0);
        jPanelFundo.setLocation(0, 0);
    }//GEN-LAST:event_jLabelSetaDireitaMouseExited

    private void jLabelSetaDireitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaDireitaMouseClicked
        if (opcoes1 == true) {

            jPanelOpcoes2.setSize(0, 0);
            jPanelOpcoes2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(0, 0);
            jLabelSetaBaixo2.setLocation(0, 0);

            jLabelSetaDireita2.setSize(35, 35);
            jLabelSetaDireita2.setLocation(35, 425);

            jLabelSair.setLocation(50, 510);

            opcoes2 = true;

            jPanelOpcoes1.setSize(420, 280);
            jPanelOpcoes1.setLocation(35, 300);

            jLabelMotorista.setLocation(80, 620);
            jLabelSetaDireita2.setLocation(35, 625);

            jLabelSetaDireita.setSize(0, 0);
            jLabelSetaDireita.setLocation(0, 0);

            jLabelSetaBaixo.setSize(35, 35);
            jLabelSetaBaixo.setLocation(35, 325);

            jLabelSair.setLocation(50, 710);

            opcoes1 = false;
        } else {
            jPanelOpcoes1.setSize(0, 0);
            jPanelOpcoes1.setLocation(0, 0);

            jLabelSetaBaixo.setSize(0, 0);
            jLabelSetaBaixo.setLocation(0, 0);

            jLabelSetaDireita.setSize(35, 35);
            jLabelSetaDireita.setLocation(35, 325);

            jLabelMotorista.setLocation(80, 420);
            jLabelSetaDireita2.setLocation(35, 425);
            jLabelSair.setLocation(50, 510);

            opcoes1 = true;
        }
    }//GEN-LAST:event_jLabelSetaDireitaMouseClicked

    private void jLabelCadastroVeiculosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroVeiculosMouseMoved

    }//GEN-LAST:event_jLabelCadastroVeiculosMouseMoved

    private void jLabelMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMarcasMouseClicked
        CadastroMarcas chamar = new CadastroMarcas();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelMarcasMouseClicked

    private void jLabelModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModelosMouseClicked
        CadastroModelos chamar = new CadastroModelos();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelModelosMouseClicked

    private void jLabelSetaBaixoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaBaixoMouseClicked
        if (opcoes1 == true) {

            jPanelOpcoes2.setSize(0, 0);
            jPanelOpcoes2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(0, 0);
            jLabelSetaBaixo2.setLocation(0, 0);

            jLabelSetaDireita2.setSize(35, 35);
            jLabelSetaDireita2.setLocation(35, 425);

            jLabelSair.setLocation(50, 510);

            opcoes2 = true;

            jPanelOpcoes1.setSize(420, 280);
            jPanelOpcoes1.setLocation(35, 300);

            jLabelMotorista.setLocation(80, 620);
            jLabelSetaDireita2.setLocation(35, 625);

            jLabelSetaDireita.setSize(0, 0);
            jLabelSetaDireita.setLocation(0, 0);

            jLabelSetaBaixo.setSize(35, 35);
            jLabelSetaBaixo.setLocation(35, 325);

            jLabelSair.setLocation(50, 710);

            opcoes1 = false;
        } else {
            jPanelOpcoes1.setSize(0, 0);
            jPanelOpcoes1.setLocation(0, 0);

            jLabelSetaBaixo.setSize(0, 0);
            jLabelSetaBaixo.setLocation(0, 0);

            jLabelSetaDireita.setSize(35, 35);
            jLabelSetaDireita.setLocation(35, 325);

            jLabelMotorista.setLocation(80, 420);
            jLabelSetaDireita2.setLocation(35, 425);
            jLabelSair.setLocation(50, 510);

            opcoes1 = true;
        }
    }//GEN-LAST:event_jLabelSetaBaixoMouseClicked

    private void jLabelMotoristaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMotoristaMouseEntered
        if (opcoes1 == true) {
            jPanelFundo.setSize(270, 55);
            jPanelFundo.setLocation(35, 410);
        } else {
            jPanelFundo.setSize(270, 55);
            jPanelFundo.setLocation(35, 612);
        }
    }//GEN-LAST:event_jLabelMotoristaMouseEntered

    private void jLabelSetaDireita2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaDireita2MouseEntered
        if (opcoes1 == true) {
            jPanelFundo.setSize(270, 55);
            jPanelFundo.setLocation(35, 410);
        } else {
            jPanelFundo.setSize(270, 55);
            jPanelFundo.setLocation(35, 612);
        }
    }//GEN-LAST:event_jLabelSetaDireita2MouseEntered

    private void jLabelSetaDireita2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaDireita2MouseExited
        jPanelFundo.setSize(0, 0);
        jPanelFundo.setLocation(0, 0);
    }//GEN-LAST:event_jLabelSetaDireita2MouseExited

    private void jLabelMotoristaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMotoristaMouseExited
        jPanelFundo.setSize(0, 0);
        jPanelFundo.setLocation(0, 0);
    }//GEN-LAST:event_jLabelMotoristaMouseExited

    private void jLabelSetaBaixo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaBaixo2MouseEntered
        if (opcoes1 == true) {
            jPanelFundo.setSize(270, 55);
            jPanelFundo.setLocation(35, 410);
        } else {
            jPanelFundo.setSize(270, 55);
            jPanelFundo.setLocation(35, 607);
        }
    }//GEN-LAST:event_jLabelSetaBaixo2MouseEntered

    private void jLabelMotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMotoristaMouseClicked
        if (opcoes2 == true) {
            jPanelOpcoes1.setSize(0, 0);
            jPanelOpcoes1.setLocation(0, 0);

            jLabelSetaDireita.setSize(35, 35);
            jLabelSetaDireita.setLocation(35, 325);

            jLabelSetaBaixo.setSize(0, 0);
            jLabelSetaBaixo.setLocation(0, 0);

            jLabelMotorista.setLocation(80, 420);
            jLabelSetaDireita2.setLocation(35, 425);

            opcoes1 = true;

            jPanelOpcoes2.setSize(500, 370);
            jPanelOpcoes2.setLocation(35, 410);

            jLabelSetaDireita2.setSize(0, 0);
            jLabelSetaDireita2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(35, 35);
            jLabelSetaBaixo2.setLocation(35, 425);

            jLabelSair.setLocation(50, 800);

            opcoes2 = false;
        } else {
            jPanelOpcoes2.setSize(0, 0);
            jPanelOpcoes2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(0, 0);
            jLabelSetaBaixo2.setLocation(0, 0);

            jLabelSetaDireita2.setSize(35, 35);
            jLabelSetaDireita2.setLocation(35, 425);

            jLabelSair.setLocation(50, 510);

            opcoes2 = true;

        }

    }//GEN-LAST:event_jLabelMotoristaMouseClicked

    private void jLabelAccessoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccessoriosMouseClicked
        CadastroAcessorios chamar = new CadastroAcessorios();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelAccessoriosMouseClicked

    private void jLabelCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCategoriaMouseClicked
        CadastroCategorias chamar = new CadastroCategorias();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelCategoriaMouseClicked

    private void jLabelVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVeiculosMouseClicked
        CadastroVeiculo chamar = new CadastroVeiculo();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelVeiculosMouseClicked

    private void jLabelSetaBaixo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaBaixo2MouseClicked
        if (opcoes2 == true) {
            jPanelOpcoes1.setSize(0, 0);
            jPanelOpcoes1.setLocation(0, 0);

            jLabelSetaDireita.setSize(35, 35);
            jLabelSetaDireita.setLocation(35, 325);

            jLabelSetaBaixo.setSize(0, 0);
            jLabelSetaBaixo.setLocation(0, 0);

            jLabelMotorista.setLocation(80, 420);
            jLabelSetaDireita2.setLocation(35, 425);

            opcoes1 = true;

            jPanelOpcoes2.setSize(500, 320);
            jPanelOpcoes2.setLocation(35, 410);

            jLabelSetaDireita2.setSize(0, 0);
            jLabelSetaDireita2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(35, 35);
            jLabelSetaBaixo2.setLocation(35, 425);

            jLabelSair.setLocation(50, 800);

            opcoes2 = false;
        } else {
            jPanelOpcoes2.setSize(0, 0);
            jPanelOpcoes2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(0, 0);
            jLabelSetaBaixo2.setLocation(0, 0);

            jLabelSetaDireita2.setSize(35, 35);
            jLabelSetaDireita2.setLocation(35, 425);

            jLabelSair.setLocation(50, 510);

            opcoes2 = true;

        }
    }//GEN-LAST:event_jLabelSetaBaixo2MouseClicked

    private void jLabelSetaDireita2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSetaDireita2MouseClicked
        if (opcoes2 == true) {
            jPanelOpcoes1.setSize(0, 0);
            jPanelOpcoes1.setLocation(0, 0);

            jLabelSetaDireita.setSize(35, 35);
            jLabelSetaDireita.setLocation(35, 325);

            jLabelSetaBaixo.setSize(0, 0);
            jLabelSetaBaixo.setLocation(0, 0);

            jLabelMotorista.setLocation(80, 420);
            jLabelSetaDireita2.setLocation(35, 425);

            opcoes1 = true;

            jPanelOpcoes2.setSize(500, 370);
            jPanelOpcoes2.setLocation(35, 410);

            jLabelSetaDireita2.setSize(0, 0);
            jLabelSetaDireita2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(35, 35);
            jLabelSetaBaixo2.setLocation(35, 425);

            jLabelSair.setLocation(50, 800);

            opcoes2 = false;
        } else {
            jPanelOpcoes2.setSize(0, 0);
            jPanelOpcoes2.setLocation(0, 0);

            jLabelSetaBaixo2.setSize(0, 0);
            jLabelSetaBaixo2.setLocation(0, 0);

            jLabelSetaDireita2.setSize(35, 35);
            jLabelSetaDireita2.setLocation(35, 425);

            jLabelSair.setLocation(50, 510);

            opcoes2 = true;

        }
    }//GEN-LAST:event_jLabelSetaDireita2MouseClicked

    private void jLabelLocarCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLocarCarroMouseClicked
        TelaLocacaoEscolherClientes chamar = new TelaLocacaoEscolherClientes();
        chamar.setVisible(true);

    }//GEN-LAST:event_jLabelLocarCarroMouseClicked

    private void jLabelCadastroMotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroMotoristaMouseClicked
        TelaEscolherCliente chamar = new TelaEscolherCliente();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelCadastroMotoristaMouseClicked

    private void jLabelPlanilhaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPlanilhaClienteMouseClicked
        TelaPlanilhaClientes chamar = new TelaPlanilhaClientes();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelPlanilhaClienteMouseClicked

    private void jLabelCadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastroClienteMouseClicked
        TelaCadastroCliente chamar = new TelaCadastroCliente();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelCadastroClienteMouseClicked

    private void jLabelPlanilhaMotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPlanilhaMotoristaMouseClicked
        TelaPlanilhaMotorista chamar = new TelaPlanilhaMotorista();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelPlanilhaMotoristaMouseClicked

    private void jLabelPlanilhaLocacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPlanilhaLocacoesMouseClicked
        TelaPlanilhaLocacao chamar = new TelaPlanilhaLocacao();
        chamar.setVisible(true);
    }//GEN-LAST:event_jLabelPlanilhaLocacoesMouseClicked
    public void receber(String nome) {
        jLabelNomeDoCliente2.setText(nome);
        teste = nome;
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
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Painel;
    private javax.swing.JLabel jLabel3Pontos;
    private javax.swing.JLabel jLabelAccessorios;
    private javax.swing.JLabel jLabelCadastroCliente;
    private javax.swing.JLabel jLabelCadastroMotorista;
    private javax.swing.JLabel jLabelCadastroVeiculos;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCopyRight;
    private javax.swing.JLabel jLabelFechar;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelLocarCarro;
    private javax.swing.JLabel jLabelMarcas;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelModelos;
    private javax.swing.JLabel jLabelMotorista;
    private javax.swing.JLabel jLabelNomeDoCliente;
    private javax.swing.JLabel jLabelNomeDoCliente2;
    private javax.swing.JLabel jLabelPlanilhaCliente;
    private javax.swing.JLabel jLabelPlanilhaLocacoes;
    private javax.swing.JLabel jLabelPlanilhaMotorista;
    private javax.swing.JLabel jLabelSair;
    private javax.swing.JLabel jLabelSetaBaixo;
    private javax.swing.JLabel jLabelSetaBaixo2;
    private javax.swing.JLabel jLabelSetaDireita;
    private javax.swing.JLabel jLabelSetaDireita2;
    private javax.swing.JLabel jLabelTLLR;
    private javax.swing.JLabel jLabelVeiculos;
    private javax.swing.JPanel jPanelBarraLateral;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelOpcoes1;
    private javax.swing.JPanel jPanelOpcoes2;
    // End of variables declaration//GEN-END:variables

}
