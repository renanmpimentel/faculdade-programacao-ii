package exe_programacao_12;

import javax.swing.JFrame;

public class ColorNameViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,400);
		frame.setTitle("Exercicio P2.12");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorNameComponent stringsColoridas = new ColorNameComponent();
		frame.add(stringsColoridas);
		frame.setVisible(true);
	}

}
