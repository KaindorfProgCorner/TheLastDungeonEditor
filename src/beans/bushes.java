/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.swing.Icon;

/**
 *
 * @author alle
 */
public class bushes extends Cell
{

  public bushes(Icon image, String type)
  {
    super(image, type);
  }
  public boolean setable(Cell c)
  {
    if (c instanceof Ground)
    {
      return true;
    }
    return false;
  }
}
