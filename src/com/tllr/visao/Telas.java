
package com.tllr.visao;
import java.awt.Color;

public class Telas extends javax.swing.JFrame {
              
             
              
    public Telas() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        Marcas = new javax.swing.JMenuItem();
        Modelo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/designed2.png"))); // NOI18N
        Painel.add(jLabel1);
        jLabel1.setBounds(520, 300, 290, 100);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/tela.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Telas");
        fileMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fileMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        fileMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fileMenuMouseMoved(evt);
            }
        });
        fileMenu.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
                fileMenuMenuDragMouseEntered(evt);
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        fileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fileMenuMouseExited(evt);
            }
        });

        Marcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/verificado.png"))); // NOI18N
        Marcas.setMnemonic('o');
        Marcas.setText("Cadastro/Marcas");
        Marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcasActionPerformed(evt);
            }
        });
        fileMenu.add(Marcas);

        Modelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Images/verificado.png"))); // NOI18N
        Modelo.setMnemonic('s');
        Modelo.setText("Cadastro/Modelos");
        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });
        fileMenu.add(Modelo);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloActionPerformed

        CadastroModelos chamarModelo = new CadastroModelos();
              CadastroMarcas chamarMarca = new CadastroMarcas(); 
        chamarModelo.setVisible(true);
        chamarMarca.setVisible(false);
    }//GEN-LAST:event_ModeloActionPerformed

    private void MarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcasActionPerformed
CadastroModelos chamarModelo = new CadastroModelos();
              CadastroMarcas chamarMarca = new CadastroMarcas(); 
        chamarMarca.setVisible(true);
        chamarModelo.setVisible(false);
       
    }//GEN-LAST:event_MarcasActionPerformed

    private void fileMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseMoved
        
        fileMenu.setForeground(Color.gray);
        

    }//GEN-LAST:event_fileMenuMouseMoved

    private void fileMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseExited
                fileMenu.setForeground(Color.black);
    }//GEN-LAST:event_fileMenuMouseExited

    private void fileMenuMenuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_fileMenuMenuDragMouseEntered
        fileMenu.setBackground(Color.red);
    }//GEN-LAST:event_fileMenuMenuDragMouseEntered

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
    private javax.swing.JMenuItem Marcas;
    private javax.swing.JMenuItem Modelo;
    private javax.swing.JDesktopPane Painel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
