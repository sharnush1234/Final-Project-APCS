package SpaceGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

// help from CodeDay mentors

public class Explosion extends Actor {

		
	

	ImageIcon explosion = new ImageIcon("images/explosion.png");
   

    // Constructor for all ship objects
    public Explosion(int xPosition, int yPosition, Color color) {
        super(xPosition, yPosition, color);
    }

   

	// Draw Explosion
	public void draw(Graphics g) {
		explosion.paintIcon(null, g, this.getXPosition(), this.getYPosition());
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
