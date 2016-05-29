/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import beans.Cell;
import gui.KeyHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Hans
 */
public class WalkTimer implements ActionListener {

  private int speed = 22;
  private int width = 800;
  private int height = 800;

  public WalkTimer(int speed, int width, int height) {
    this.speed = speed;
    this.width = width;
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    int x = KeyHandler.label.getX();
    int y = KeyHandler.label.getY();
    JLabel label = KeyHandler.label;
    Cell c;

    if (KeyHandler.up) {
      c = KeyHandler.liste[x / 32][y / 32 - 1];
      if (c != null) {
        if (!c.isPassable()) {
          label.setLocation(label.getX(), label.getX() + speed);
        } else if ((label.getY() <= 0)) {
          label.setLocation(label.getX(), 0);
        } else {
          label.setLocation(label.getX(), label.getY() - speed);
        }
      }
    }

    ////////////////////////
    if (KeyHandler.down) {
      c = KeyHandler.liste[x / 32][y / 32 + 1];
      if (c != null) {
        if (!c.isPassable()) {
          label.setLocation(label.getX(), label.getX() - speed);
        } else if ((label.getY() > height)) {
          label.setLocation(label.getX(), height);
        } else {
          label.setLocation(label.getX(), label.getY() + speed);
        }
      }
    }

    ////////////////////////
    if (KeyHandler.left) {
      c = KeyHandler.liste[x / 32 - 1][y / 32];
      if (c != null) {
        if (!c.isPassable()) {
          label.setLocation(label.getX() - speed, label.getY());
        } else if ((label.getX() < 0)) {
          label.setLocation(0, label.getY());
        } else {
          label.setLocation(label.getX() - speed, label.getY());
        }
      }
    }

    ////////////////////////
    if (KeyHandler.right) {
      c = KeyHandler.liste[x / 32 + 1][y / 32];
      if (c != null) {
        if (!c.isPassable()) {
          label.setLocation(label.getX() + speed, label.getY());
        } else if ((label.getX() > width)) {
          label.setLocation(height, label.getY());
        } else {
          label.setLocation(label.getX() + speed, label.getY());
        }
      }
    }
  }

}
