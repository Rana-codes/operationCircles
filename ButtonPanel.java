package operationCircles;
//File: Button Panel
//Name: Harsh Rana


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	// instance Variables.
	// 2 other panels. This is because the button Panel needs to know from which panel it gets its input
	// and on which panel it provides its output.
	private DrawPanel drawingBoard;
	private DataPanel data;
	
	
	//Constructor.
	public ButtonPanel(DataPanel info, DrawPanel canvas) {
		
		// values assigned to instance variables so that it is accessible by other methods
		data = info;
		drawingBoard = canvas;
		
		// grid layout for 4 buttons in a vertical line
		setLayout(new GridLayout(4, 0));
		
		// Each button is being created using a separate class.
		// The class pre implements the listener and attaches it to the returned button.
		JButton button1 = create("create");
		JButton button2 = sort("sort");
		JButton button3 = coCenter("Co-Center");
		JButton button4 = reset("reset");
		
		// adds buttons to the panels
		add(button1);
		add(button2);
		add(button3);
		add(button4);

	}
	
	/**
	 * Class created for create button. 
	 * Creates a button, attaches it to a listener.
	 * The listener takes input and creates circle on the panel.
	 * @param buttonName - The text you want this button to show
	 * @return - A button that performs task of the "Create" button in the program.
	 */
	private JButton create(String buttonName) {
		class CreateListener implements ActionListener {
			
			// as it is used by more than 1 methods.
			private Random rand = new Random();
			
			/**
			 * Generates a random number between the provided inputs for smallest and largest radius.
			 * @return a random int between smallest and largest radius.
			 */
			public int randomRadius() {
				int rad = (Integer.parseInt(data.getSRadius())
						+ (rand.nextInt(Integer.parseInt(data.getLradius()) - Integer.parseInt(data.getSRadius()))));
				return rad;
			}
			
			/**
			 * defines the action that is to be performed once the event has occured.
			 * in this case event is the pressing of create button and the action is creation of circles.
			 */
			public void actionPerformed(ActionEvent event) {
				for (int i = 0; i < Integer.parseInt(data.getNumber()); i++) {
					drawingBoard.create(rand.nextInt(drawingBoard.getWidth()), rand.nextInt(drawingBoard.getHeight()),
							randomRadius());
				}
			}
		}
		JButton button = new JButton(buttonName);
		button.addActionListener(new CreateListener());
		return button;
	}
	
	/**
	 * Class created for sort button. 
	 * Creates a button, attaches it to a listener.
	 * The listener sorts circle on the panel.
	 * Sort means to put the smallest circles over larger ones so that all are visible.
	 * @param buttonName - The text you want this button to show
	 * @return - A button that performs task of the "sort" button in the program.
	 */
	private JButton sort(String buttonName) {
//		class sortListener implements ActionListener {
//			
//			/**
//			 * defines the action that is to be performed once the event has occured.
//			 * in this case event is the pressing of sort button and the action is sorting of circles.
//			 */
//			public void actionPerformed(ActionEvent event) {
//				drawingBoard.sort();
//			}
//
//		}
		JButton button = new JButton(buttonName);
		// lambda 
		button.addActionListener(action -> drawingBoard.sort());
//		button.addActionListener(new sortListener());
		return button;
	}
	
	/**
	 * Class created for co-center button. 
	 * Creates a button, attaches it to a listener.
	 * The listener changes the center of all the circles to the center of the panel.
	 * @param buttonName - The text you want this button to show
	 * @return - A button that performs task of the "coCenter" button in the program.
	 */
	private JButton coCenter(String buttonName) {
//		class coCenterListener implements ActionListener {
//			/**
//			 * defines the action that is to be performed once the event has occured.
//			 * in this case event is the pressing of cocenter button and the action is moving all the circles to center.
//			 */
//			public void actionPerformed(ActionEvent event) {
//				drawingBoard.move();
//
//			}
//
//		}
		JButton button = new JButton(buttonName);
		button.addActionListener(action -> drawingBoard.move());
//		button.addActionListener(new coCenterListener());
		return button;
	}
	
	/**
	 * Class created for reset button. 
	 * Creates a button, attaches it to a listener.
	 * The listener removes all the circles from the panel.
	 * @param buttonName - The text you want this button to show
	 * @return - A button that performs task of the "reset" button in the program.
	 */
	private JButton reset(String buttonName) {
//		class resetListener implements ActionListener {
//			/**
//			 * defines the action that is to be performed once the event has occured.
//			 * in this case event is the pressing of sort button and the action is deleting all the circles.
//			 */
//			public void actionPerformed(ActionEvent event) {
//				drawingBoard.reset();
//
//			}
//
//		}
		JButton button = new JButton(buttonName);
		button.addActionListener(action -> drawingBoard.reset());
//		button.addActionListener(new resetListener());
		return button;
	}

}
