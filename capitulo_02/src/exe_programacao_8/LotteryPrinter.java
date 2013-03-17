package exe_programacao_8;

import java.util.Random;

public class LotteryPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random numeroLoteria = new Random();
		System.out.print("Jogue essa combinação - ela o tornará rico! ");
		
		for (int i = 0; i < 6; i++) {
			System.out.print(numeroLoteria.nextInt(50)+1);		
		
			if(i < 5)
				System.out.print("-");
		}
	}

}
