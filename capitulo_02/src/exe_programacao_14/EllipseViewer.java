package exe_programacao_14;

import javax.swing.JFrame;

public class EllipseViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setTitle("Exercicio P2.14");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		EllipseComponent component = new EllipseComponent();
		frame.add(component);
		frame.setVisible(true);
		
		//Não consegui criar a elipse com preenchimento automatico
	}

}
