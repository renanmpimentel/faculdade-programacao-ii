/**
 * 
 */
package exe_programacao_3;

import java.awt.Rectangle;

/**
 * @author renan
 *
 */
public class FourRectanglePrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle retangulo = new Rectangle(10,20,10,10);
		System.out.println(retangulo);
		retangulo.translate(20, 30);
		System.out.println(retangulo);
	}

}
