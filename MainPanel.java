package operationCircles;
//File: Main Panel
//Name: Harsh Rana


import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	// constructor
	public MainPanel() {
		
		// border layout to set everything in place.
		setLayout(new BorderLayout());
		
		// variable defined so that it could be passed on to button panel
		DataPanel data = new DataPanel();
		add(data, BorderLayout.NORTH);
		
		// variable defined so that it could be passed on to button panel
		DrawPanel canvas = new DrawPanel();
		add(canvas, BorderLayout.CENTER);
		
		add(new ButtonPanel(data, canvas), BorderLayout.WEST);

	}

}
