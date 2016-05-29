/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Robbo13
 */
public class Cell extends JLabel {

  private boolean placed = false;
  private boolean destroyable = false;
  private boolean passable = true;
  private String type = "";

  public Cell(int x, int y, ImageIcon icon, boolean destroyable, boolean passable) {
    this.setLocation(x, y);
    this.setIcon(icon);
    this.destroyable = destroyable;
    this.passable = passable;
  }

  public boolean isAlreadyThere(JPanel graphic) {
    for (Object obj : graphic.getComponents()) {
      Cell forcell = (Cell) obj;
      if (!forcell.equals(this)) {
        if (forcell.getLocation().equals(this.getLocation())) {
          return true;
        }
      }
    }
    return false;
  }

  public void reloadLocation(int mouseX, int mouseY, int cellsize, int scrollbarX, int scrollbarY, int speed) {
    int currentCellX = (mouseX + scrollbarX * speed) / cellsize;
    int currentCellY = (mouseY + scrollbarY * speed) / cellsize;
    this.setLocation(currentCellX * cellsize - scrollbarX * speed, currentCellY * cellsize - scrollbarY * speed);
  }

  public Cell(Icon image, String type) {
    super(image);
    this.type = type;
  }

  public Cell() {
  }

  public boolean isPlaced() {
    return placed;
  }

  public void setPlaced(boolean placed) {
    this.placed = placed;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isDestroyable() {
    return destroyable;
  }

  public boolean isPassable() {
    return passable;
  }

}
