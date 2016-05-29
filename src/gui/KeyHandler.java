/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Cell;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import other.WalkTimer;

/**
 *
 * @author Hans
 */
public class KeyHandler extends javax.swing.JPanel {

  public static Cell[][] liste = new Cell[100][100];
  public static boolean up = false;
  public static boolean down = false;
  public static boolean left = false;
  public static boolean right = false;

  public KeyHandler() {
    initComponents();
    label.setVisible(true);
    label.setSize(64, 64);
    label.setIcon(new ImageIcon(System.getProperty("user.dir") + File.separator + "src" + File.separator + "res" + File.separator + "player.png"));
    label.setLocation(200, 200);
    label.setOpaque(false);
    this.add(label);
    this.setSize(1000, 1000);
    WalkTimer walktimer = new WalkTimer(1, this.getWidth(), this.getHeight());
    Timer timer = new Timer(10, walktimer);
    timer.start();
  }

  public static boolean isUp() {
    return up;
  }

  public static void setUp(boolean up) {
    System.out.println("up");
    KeyHandler.up = up;
  }

  public static boolean isDown() {
    return down;
  }

  public static void setDown(boolean down) {
    KeyHandler.down = down;
  }

  public static boolean isLeft() {
    return left;
  }

  public static void setLeft(boolean left) {
    KeyHandler.left = left;
  }

  public static boolean isRight() {
    return right;
  }

  public static void setRight(boolean right) {
    KeyHandler.right = right;
  }

  public void setList() {
    liste = SingleplayerGUI.list;
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    label = new javax.swing.JLabel();

    setLayout(new java.awt.BorderLayout());
    add(label, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  public static javax.swing.JLabel label;
  // End of variables declaration//GEN-END:variables
}
