/**
 * 
 */
package exe_programacao_2;

import java.awt.Rectangle;

/**
 * @author renan
 *
 */
public class PerimeterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle retangulo = new Rectangle(10,20,10,20);
		//P = 2(b+h)
		
		System.out.println("A base do retangulo: " + retangulo.getWidth());
		System.out.println("A altura do retangulo: " + retangulo.getHeight());
		
		System.out.println("O perimetro do retangulo é: " + 2*(retangulo.getWidth()+retangulo.getHeight()));
	}

}
