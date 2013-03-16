/**
 * 
 */
package exe_programacao_7;

import javax.swing.JOptionPane;

/**
 * @author renan
 *
 */
public class DialogViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWordPassandoNome("Renan");
	}
	
	private static void HelloWordPassandoNome(String Nome) {
		JOptionPane.showMessageDialog(null, "Hello, "+ Nome +"!");
		System.exit(0);
	}

}
