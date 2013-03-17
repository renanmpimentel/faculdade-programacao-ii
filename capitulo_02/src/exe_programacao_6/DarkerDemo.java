/**
 * 
 */
package exe_programacao_6;

import java.awt.Color;

/**
 * @author renan
 *
 */
public class DarkerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Color vermelho = new Color(50);
		Color verde = new Color(100);
		Color azul = new Color(150);
		
		System.out.println(vermelho.brighter());
		System.out.println(vermelho.darker().darker());
		System.out.println(verde.brighter());
		System.out.println(azul.brighter());
	}

}
