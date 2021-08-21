package operationCircles;
//File: Program
//Name: Harsh Rana


import javax.swing.JFrame;

public class Run_Viewer_ME {

	private static final int FRAME_WIDTH = 900;
	private static final int FRAME_HEIGHT = 600;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Main panel contains everything we need
		frame.add(new MainPanel());

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("CIRCLES");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
