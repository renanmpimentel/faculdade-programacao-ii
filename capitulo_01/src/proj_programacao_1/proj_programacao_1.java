/**
 * 
 */
package proj_programacao_1;

import javax.swing.JOptionPane;

/**
 * @author renan
 *
 */
public class proj_programacao_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Qual seu nome ?");
		JOptionPane.showInputDialog("O que você quer que eu faça ?");
		JOptionPane.showMessageDialog(null, "Sinto muito, " + name + ". Acho que não posso fazer isso.");
	}
}
