/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_gui;

import gui.EditorGUI;
import gui.SingleplayerGUI;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author alle
 */
public class mainMenu extends javax.swing.JFrame {

  /**
   * Creates new form mainMenu
   */
  @SuppressWarnings("IllegalComponentStateException")
  public mainMenu() {
    initComponents();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.dispose();
    this.setUndecorated(true);
    this.setVisible(true);

    height = this.getHeight();
    width = this.getHeight();
    lbBackground.setLayout(new GridLayout(1, 1));
    lbBackground.add(jPanel1);
//        lbBackground.setIcon(new ImageIcon("title.jpg"));

//        autoScale();
  }

  private int height;
  private int width;
  private Image titleScreen = null;

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    jPanel1 = new javax.swing.JPanel();
    btSP = new javax.swing.JButton();
    btMP = new javax.swing.JButton();
    btEditor = new javax.swing.JButton();
    btStats = new javax.swing.JButton();
    btClose = new javax.swing.JButton();
    lbBackground = new javax.swing.JLabel();

    jPanel1.setOpaque(false);
    jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
    jPanel1.setLayout(new java.awt.GridBagLayout());

    btSP.setText("Singleplayer");
    btSP.setMaximumSize(new java.awt.Dimension(350, 100));
    btSP.setMinimumSize(new java.awt.Dimension(350, 100));
    btSP.setPreferredSize(new java.awt.Dimension(350, 100));
    btSP.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onSingleplayer(evt);
      }
    });
    jPanel1.add(btSP, new java.awt.GridBagConstraints());

    btMP.setText("Multiplayer");
    btMP.setMaximumSize(new java.awt.Dimension(350, 100));
    btMP.setMinimumSize(new java.awt.Dimension(350, 100));
    btMP.setPreferredSize(new java.awt.Dimension(350, 100));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    jPanel1.add(btMP, gridBagConstraints);

    btEditor.setText("Leveleditor");
    btEditor.setMaximumSize(new java.awt.Dimension(350, 100));
    btEditor.setMinimumSize(new java.awt.Dimension(350, 100));
    btEditor.setPreferredSize(new java.awt.Dimension(350, 100));
    btEditor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onOpenEditor(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    jPanel1.add(btEditor, gridBagConstraints);

    btStats.setText("Statistics");
    btStats.setMaximumSize(new java.awt.Dimension(350, 100));
    btStats.setMinimumSize(new java.awt.Dimension(350, 100));
    btStats.setPreferredSize(new java.awt.Dimension(350, 100));
    btStats.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onShowStats(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    jPanel1.add(btStats, gridBagConstraints);

    btClose.setText("Ausfahrt");
    btClose.setMaximumSize(new java.awt.Dimension(350, 100));
    btClose.setMinimumSize(new java.awt.Dimension(350, 100));
    btClose.setPreferredSize(new java.awt.Dimension(350, 100));
    btClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClose(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    jPanel1.add(btClose, gridBagConstraints);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setAlwaysOnTop(true);
    setBackground(new java.awt.Color(255, 255, 255));
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridLayout(1, 1));

    lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_gui/title.jpg"))); // NOI18N
    getContentPane().add(lbBackground);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void onClose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClose
      System.exit(0);
    }//GEN-LAST:event_onClose

    private void onShowStats(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onShowStats
      Stats showStats = new Stats(this, true, this.getSize());
    }//GEN-LAST:event_onShowStats

    private void onOpenEditor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOpenEditor
      EditorGUI eg = new EditorGUI();
      this.setVisible(false);
      eg.setVisible(true);
    }//GEN-LAST:event_onOpenEditor

  private void onSingleplayer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSingleplayer
    this.setVisible(false);
    SingleplayerGUI obj = new SingleplayerGUI();
    obj.setVisible(true);
  }//GEN-LAST:event_onSingleplayer

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
      java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new mainMenu().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btClose;
  private javax.swing.JButton btEditor;
  private javax.swing.JButton btMP;
  private javax.swing.JButton btSP;
  private javax.swing.JButton btStats;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lbBackground;
  // End of variables declaration//GEN-END:variables

  private void autoScale() {
    try {
      BufferedImage img = null;
      img = ImageIO.read(new File("title.jpg"));
      Image dimg = img.getScaledInstance(lbBackground.getWidth(), lbBackground.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon titleImg = new ImageIcon(dimg);
      lbBackground.setIcon(titleImg);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
