package exe_programacao_15;

import javax.swing.JFrame;

public class FaceViewer {
	
	public static void main(String[] Args) {
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setTitle("P2.15");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FaceComponent component = new FaceComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}
