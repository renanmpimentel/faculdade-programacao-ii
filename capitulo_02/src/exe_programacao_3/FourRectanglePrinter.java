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
		Rectangle retangulo = new Rectangle(5,15,5,15);
		System.out.println(retangulo);
		
		retangulo.translate(-10, 0);
		System.out.println(retangulo);
		
		retangulo.translate(0, -30);
		System.out.println(retangulo);
		
		retangulo.translate(10, 0);
		System.out.println(retangulo);
	}
	
}
