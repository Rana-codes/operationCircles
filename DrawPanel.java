package operationCircles;
//File: Draw Panel
//Name: Harsh Rana

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
	
	// Instance Fields
	private ArrayList<ColorCircle> list;
	
	/**
	 * constructor
	 * creates the array list that will contain all the information of the color circles drawn on this board
	 */
	public DrawPanel() {
		list = new ArrayList<ColorCircle>();
	}
	
	/**
	 * adds a new circle to the panel by first storing in the instance list and then repainting the component.
	 * @param x - x coordinate of the center of the circle.      
	 * @param y - y coordinate of the center of the circle.      
	 * @param r - radius of the circle.                          
	 */
	public void create(double x, double y, double r) {
		list.add(new ColorCircle(x, y, r));
		repaint();
	}
	
	/**
	 * Defines what is to be drawn on the panel.
	 * In this case, it fills all the color circles in the instance list and
	 * repaints the panel
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for (int i = 0; i < list.size(); i++) {
			list.get(i).fill(g2);
		}
	}
	
	/**
	 * Sorts all the color circles present in the instance list using the circle comparator and 
	 * then repaints the panel
	 */
	public void sort() {
		CircleComparator comparator = new CircleComparator();
		list.sort(comparator);
		repaint();
	}
	
	/**
	 * Changes the center of all the color circles present in the instance list.
	 * The new center is same as the center of the panel.
	 */
	public void move() {
		for (ColorCircle val : list) {
			val.move(getWidth() / 2, getHeight() / 2);
		}
		repaint();
	}
	
	/**
	 * Deletes all the color circles present in the list.
	 */
	public void reset() {
		list.clear();
		repaint();
	}
}
