
package SpaceGame;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Missle extends MovingActor {
	 ImageIcon missle = new ImageIcon("images/spaceship.jng");


    //Enemies shoot beams
    // constructor for beam
    public Missle(int xCoordinate, int yCoordinate, int diameter, Color color) {
        super(xCoordinate, yCoordinate, 0, 0, color);
    }
    
// Used to draw the laser
    
    public void draw(Graphics g) {
    	missle.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }
       
    
    
    // Used to get the hit box of a beam
   
    public Rectangle getBounds() {
    	  Rectangle laserBox = new Rectangle(this.getXPosition(), this.getYPosition(), 90, 10);
          return laserBox;
    }
}
   
      


