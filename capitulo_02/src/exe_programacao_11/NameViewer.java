package exe_programacao_11;

import javax.swing.JFrame;

public class NameViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(227, 107);
		frame.setTitle("Two rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorNameComponent component = new ColorNameComponent();
		frame.add(component);
		frame.setVisible(true);
	}

}
