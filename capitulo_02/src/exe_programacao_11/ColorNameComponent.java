package exe_programacao_11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class ColorNameComponent extends JComponent {
	
	public void paintComponent(Graphics g){
		
		//Recuperando o Graphics2D
		Graphics2D janela = (Graphics2D) g;  
		
		//Desenha o retangulo
		Rectangle retangulo = new Rectangle(10,10,200,50);
		janela.setColor(Color.BLUE);
		janela.fill(retangulo);
		
		//Escreve no retangulo azul
		janela.setColor(Color.RED);
		janela.drawString("Renan Martins Pimentel", 40, 40);
	}
}