package exe_programacao_5;

import java.awt.Color;

public class BrighterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Color vermelho = new Color(50);
		Color verde = new Color(100);
		Color azul = new Color(150);
		
		//Vermelho
		System.out.println(vermelho.brighter());
		
		//Verde
		System.out.println(verde.brighter());
		
		//Azul
		System.out.println(azul.brighter());
	}
}
