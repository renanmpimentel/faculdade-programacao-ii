package exe_programacao_13;

import javax.swing.JFrame;

public class TwoSquireViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,180);
		frame.setTitle("Exercicio P2.13");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TwoSquareComponent component = new TwoSquareComponent();
		frame.add(component);
		frame.setVisible(true);
	}

}
