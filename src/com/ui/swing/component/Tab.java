/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.swing.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ADMIN
 */
public class Tab extends javax.swing.JPanel {

    private String colorStart = "#f12711";
    private String colorEnd = "#f5af19";
    private String hoverColor = "#f5af19";
    private String clStart = colorStart;
    private String clEnd;

    private boolean isClick = false;

    public String getStartColor() {
        return colorStart;
    }

    public void setStartColor(String colorStart) {
        this.colorStart = colorStart;
        this.clStart = this.colorStart;
    }

    public String getEndColor() {
        return colorEnd;
    }

    public void setSelected(boolean is) {
        if (is) {
            colorStart = clStart;

        } else {
            colorStart = hoverColor;
        }
        repaint();
    }

    public void setEndColor(String colorEnd) {
        this.colorEnd = colorEnd;
        this.clEnd = this.colorEnd;
    }

    public void clear() {
        colorStart = clStart;
        isClick = false;
        repaint();
    }

    public void click() {
        if (isClick == false) {
            colorStart = hoverColor;
            repaint();
            isClick = true;
        } else {
            colorStart = clStart;
            repaint();
            isClick = false;
        }
    }

    /**
     * Creates new form Tab
     */
    public Tab() {
        initComponents();
        setOpaque(false);
        addMouseListener(new TabEvent());

    }

    class TabEvent extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            if (isClick == false) {
                colorStart = hoverColor;
                repaint();
            }
            //isHover = true;
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (isClick == false) {
                colorStart = clStart;
                repaint();
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, Color.decode(colorStart), 0, getHeight(), Color.decode(colorEnd));
        g2.setPaint(gra);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintChildren(grphcs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblText = new javax.swing.JLabel();

        lblText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Tab_name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblText, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblText)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}