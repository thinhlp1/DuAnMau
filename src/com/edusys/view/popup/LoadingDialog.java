/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.view.popup;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author ADMIN
 */
public class LoadingDialog extends javax.swing.JDialog {

    /**
     * Creates new form LoadingDialog
     */
    public LoadingDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
       // lblIcon.setIcon( );
        
        pgbLoading.setOpaque(false);
        pgbLoading.setBackground(Color.blue);
        startLoading();
        
    }
    
    
    
     public void startLoading() {
        Timer timer = new Timer(5,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int value = pgbLoading.getValue();
              
                if (value < 100){
                    value += 1;
                    pgbLoading.setValue(value);
                }else{
                    LoadingDialog.this.dispose();
                   
                }
            }
        });
        timer.start();
       
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgbLoading = new javax.swing.JProgressBar();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pgbLoading.setBackground(new java.awt.Color(0, 51, 204));
        pgbLoading.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pgbLoading.setForeground(new java.awt.Color(204, 204, 204));
        pgbLoading.setBorderPainted(false);
        pgbLoading.setFocusable(false);
        pgbLoading.setOpaque(true);
        getContentPane().add(pgbLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 790, 10));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/assets/load.gif"))); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoadingDialog dialog = new LoadingDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIcon;
    private javax.swing.JProgressBar pgbLoading;
    // End of variables declaration//GEN-END:variables
}


