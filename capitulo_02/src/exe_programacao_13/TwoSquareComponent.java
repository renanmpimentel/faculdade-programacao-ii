package exe_programacao_13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class TwoSquareComponent extends JComponent {
	
	public void paintComponent (Graphics g){
		//Recuperando o Graphics2D
		Graphics2D janela = (Graphics2D) g;
		
		//Criando o primeiro quadrado com cor padrão
		Rectangle quadrado1 = new Rectangle(20,20,110,110);
		janela.setColor(Color.PINK);
		janela.fill(quadrado1);
		
		//Criando o segundo quadrado com cor personalizada
		Rectangle quadrado2 = new Rectangle(150,20,110,110);
		Color roxo = new Color(128, 0, 128);
		janela.setColor(roxo);
		janela.fill(quadrado2);		
	}
}
