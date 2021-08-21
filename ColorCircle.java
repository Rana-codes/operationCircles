package operationCircles;
//File: Color Circle
//Name: Harsh Rana


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class ColorCircle extends Circle {
	// instance Field
	private Color color;

	/**
	 * Creates a new circle using the super class method and assigns it a random color.
	 * @param x - x coordinate of the center of the circle.
	 * @param y - y coordinate of the center of the circle.
	 * @param r - radius of the circle.
	 */
	public ColorCircle(double x, double y, double r){
		 super(x,y,r);
		 color = randomColor();
	 }

	/**
	 * generates a random color
	 * @return - A random color
	 */
	private Color randomColor() {
		Random rand = new Random();
		int red = rand.nextInt(256);
		int g = rand.nextInt(256);
		int b = rand.nextInt(256);
		return new Color(red, g, b);
	}
	
	/**
	 * fills in the circle with the color assigned to it.
	 * @param g2
	 */
	public void fill(Graphics2D g2) {
		Ellipse2D.Double c = new Ellipse2D.Double(getCenter().getX() - getRadius(), getCenter().getY() - getRadius(), 2 * getRadius(),2 * getRadius());
		
		g2.setColor(color);
		g2.fill(c);
	}

}
