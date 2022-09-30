/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tllr.imagensnatabela;
import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author tiago
 */
public class JTableRenderer extends DefaultTableCellRenderer{
        JLabel JlabelLogo = new JLabel();
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col){
            if(isSelected){
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
            
            }else{
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
            }
            ImageIcon logo = new ImageIcon(table.getValueAt(row, col -1).toString());
            JlabelLogo.setText("");
            logo.setImage(logo.getImage().getScaledInstance(table.getRowHeight(), table.getRowHeight(), 1));
            JlabelLogo.setIcon(logo);
            JlabelLogo.setHorizontalAlignment(CENTER);
            return JlabelLogo;
            
            
            
        }
                
                
}
