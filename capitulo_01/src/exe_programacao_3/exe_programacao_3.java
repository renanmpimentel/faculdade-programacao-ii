package exe_programacao_3;

import javax.swing.JOptionPane;

public class exe_programacao_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String totalDeLinhasString = JOptionPane.showInputDialog("Total de linhas");
		String totalDeColunasString = JOptionPane.showInputDialog("Total de Colunas");
		
	 	int totalDeLinhas = Integer.valueOf(totalDeLinhasString);
	 	int totalDeColunas = Integer.valueOf(totalDeColunasString);
	 	
	 	desenhaMatriz(totalDeLinhas, totalDeColunas);
	}
	
	/**
	 * Desenha a matriz usando metodo de imprimirLinha
	 * @param totalDeLinhas
	 * @param totalDeColunas
	 */
	private static void desenhaMatriz(int totalDeLinhas, int totalDeColunas) {
		imprimirLinha("+", "-", totalDeColunas);
		for (int i = 0; i < totalDeLinhas; i++) {
			imprimirLinha("|", " ", totalDeColunas);
			imprimirLinha("+", "-", totalDeColunas);
		}
	}
	
	/**
	 * Metodo para desenhar as linhas da matriz
	 * @param delimitador
	 * @param preenchimentoLinhas
	 * @param numeroDeColunas
	 */
	private static void imprimirLinha(String delimitador, String preenchimentoLinhas, int numeroDeColunas) {
		for (int i = 0; i < numeroDeColunas; i++) {
			desenharLinhadaColuna(delimitador, preenchimentoLinhas, 4);
		}
		System.out.println(delimitador);
	}
	
	/**
	 * Metodo para desenhas linhas da coluna
	 * @param delimitador
	 * @param preenchimentoLinhas
	 * @param tamanhoPreenchimento
	 */
	private static void desenharLinhadaColuna(String delimitador, String preenchimentoLinhas, int tamanhoPreenchimento) {	
		System.out.print(delimitador);
		for (int i = 0; i < tamanhoPreenchimento; i++) {
			System.out.print(preenchimentoLinhas);
		}
	}	
}
