package exe_programacao_7;

import java.util.Random;

public class DieSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random numeros = new Random();
		System.out.println(numeros.nextInt(6)+1);
	}
	
	//Como o netxInt(6) vai de 0 - 5, somando 1, ele sempre vai de 1 a 6.

}
