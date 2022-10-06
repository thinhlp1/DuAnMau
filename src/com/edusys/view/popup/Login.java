/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.edusys.view.popup;

import com.edusys.dao.EmployeeDAO;
import com.edusys.helper.AppStatus;
import com.edusys.helper.DialogHelper;
import com.edusys.model.Employee;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author ACER
 */
public class Login extends javax.swing.JDialog {

    /**
     * Creates new form LoginDialog
     */
    EmployeeDAO dao = new EmployeeDAO();

    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel(){
            @Override
            protected void paintChildren(Graphics grphcs) {
                Graphics2D g2 = (Graphics2D) grphcs;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint g = new GradientPaint(0, 0, Color.decode("#52E5E7"), 0, getHeight(), Color.decode("#130CB7"));
                g2.setPaint(g);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
                super.paintChildren(grphcs);
            }};
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            txtUsername = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            txtPassword = new javax.swing.JPasswordField();
            btnLearenerManger = new com.ui.swing.component.Tab();
            jLabel4 = new javax.swing.JLabel();
            btnLearenerManger1 = new com.ui.swing.component.Tab();
            jLabel5 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setUndecorated(true);
            setResizable(false);

            pnlLogin.setBackground(new java.awt.Color(51, 51, 255));

            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/assets/logoFpt2.png"))); // NOI18N

            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Tên đăng nhập");

            txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 0, new java.awt.Color(0, 0, 0)));
            txtUsername.setOpaque(false);

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("Mật khẩu");

            txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 2, 0, new java.awt.Color(0, 0, 0)));
            txtPassword.setOpaque(false);

            btnLearenerManger.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnLearenerMangerMouseClicked(evt);
                }
            });
            btnLearenerManger.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Đăng nhập");
            btnLearenerManger.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

            javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
            pnlLogin.setLayout(pnlLoginLayout);
            pnlLoginLayout.setHorizontalGroup(
                pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLoginLayout.createSequentialGroup()
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsername)
                                .addComponent(txtPassword)))
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(btnLearenerManger, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(63, Short.MAX_VALUE))
            );
            pnlLoginLayout.setVerticalGroup(
                pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(btnLearenerManger, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(143, Short.MAX_VALUE))
            );

            btnLearenerManger1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnLearenerManger1MouseClicked(evt);
                }
            });
            btnLearenerManger1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("Kết thúc");
            btnLearenerManger1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 20));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(197, 197, 197)
                    .addComponent(btnLearenerManger1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(560, Short.MAX_VALUE)
                    .addComponent(btnLearenerManger1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 525, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 624, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void btnLearenerMangerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLearenerMangerMouseClicked
        login();
    }//GEN-LAST:event_btnLearenerMangerMouseClicked

    private void btnLearenerManger1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLearenerManger1MouseClicked
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnLearenerManger1MouseClicked
    void login() {
        String manv = txtUsername.getText();
        String pass = new String(txtPassword.getPassword());
        try {

            Employee employee = dao.findById(manv);
            if (employee != null) {
                String pass2 = employee.getPassword();
                if (pass.equals(pass2)) {
                    AppStatus.USER = employee;
                    DialogHelper.alert(this, "Đăng nhập thành công!");
                    this.dispose();
                } else {
                    DialogHelper.alert(this, "Sai mật khẩu!");
                }
            } else {
                DialogHelper.alert(this, "Không tồn tại tài khoản!");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Có lỗi xảy ra. Vui lòng liên hệ kỹ thuật viên hỗ trợ!");
        }
    }

    void exit() {
        if (DialogHelper.confirm(this, "Bạn có muốn thoát khỏi ứng dụng không?")) {
            System.exit(0);

        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ui.swing.component.Tab btnLearenerManger;
    private com.ui.swing.component.Tab btnLearenerManger1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}