package operationCircles;
//File: Data Panel
//Name: Harsh Rana

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DataPanel extends JPanel {
	
	// Instance fields
	// They are the whole text fields, 
	//so that whenever we want their information, the text present AT THE MOMENT is READ EACH TIME 
	private JTextField numberField;
	private JTextField sRadiusField;
	private JTextField lRadiusField;
	
	//Some default values that will be used each time a new data panel is created.
	private int defaultNumber = 5;
	private int defaultSmallestRad = 10;
	private int defaultLargestRad = 300;
	
	// We want the width of the text box to be constant.
	private static final int WIDTH = 5;
	
	/**
	 * CONSTRUCTOR
	 * creates 3 labels, makes text fields and adds all of them to the panel
	 */
	public DataPanel() {

		JLabel numberLabel = new JLabel("Number of circles: ");
		numberField = new JTextField(WIDTH);
		numberField.setText("" + defaultNumber);

		JLabel sRadiusLabel = new JLabel("Radius of the smallest circle: ");
		sRadiusField = new JTextField(WIDTH);
		sRadiusField.setText("" + defaultSmallestRad);

		JLabel lRadiusLabel = new JLabel("Radius of the largest circle: ");
		lRadiusField = new JTextField(WIDTH);
		lRadiusField.setText("" + defaultLargestRad);

		add(numberLabel);
		add(numberField);
		add(sRadiusLabel);
		add(sRadiusField);
		add(lRadiusLabel);
		add(lRadiusField);
	}
	
	/**
	 * accessor method
	 * @return - the value present in text field that corresponds to Number of circles
	 */
	public String getNumber() {
		return numberField.getText();
	}
	
	/**
	 * accessor method
	 * @return - the value present in text field that corresponds to smallest Radius.
	 */
	public String getSRadius() {
		return sRadiusField.getText();
	}
	
	/**
	 * accessor method
	 * @return - the value present in text field that corresponds to largest Radius.
	 */
	public String getLradius() {
		return lRadiusField.getText();
	}

}
