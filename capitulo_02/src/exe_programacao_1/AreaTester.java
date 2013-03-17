/**
 * 
 */
package exe_programacao_1;

import java.awt.Rectangle;

/**
 * @author renan
 *
 */
public class AreaTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rentangulo = new Rectangle(10,15,10,15);
		
		System.out.println("A area do retangulo é: " + rentangulo.getWidth() * rentangulo.getHeight());
	}
}
