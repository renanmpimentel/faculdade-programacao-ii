/**
 * 
 */
package exe_programacao_4;

import java.awt.Rectangle;

/**
 * @author renan
 *
 */
public class IntersectionPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle retangulo_01 = new Rectangle(5,10,10,15);
		Rectangle retangulo_02 = new Rectangle(40,60,15,10);
		
		System.out.println("O primeiro retangulo: " + retangulo_01);
		System.out.println("O segundo retangulo: "+ retangulo_02);
		
		Rectangle intersecao = retangulo_01.intersection(retangulo_02);
		
		System.out.println(intersecao);
	}

}
