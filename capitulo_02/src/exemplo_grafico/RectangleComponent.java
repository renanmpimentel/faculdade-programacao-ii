package exemplo_grafico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent {
	
	public void paintComponent(Graphics g){
		//Recupera Graphics2D
		Graphics2D g2 =(Graphics2D) g;
		
		//Constrói um retângulo e o desenha
		Rectangle box = new Rectangle(5,10,50,90);
		g2.setColor(Color.GREEN);
		g2.draw(box);
		
		//Move o retangulo 30 unidades para a direita e 45 para baixo
		box.translate(30, 45);
		
		//Desenha o retangulo movido
		g2.setColor(Color.RED);
		g2.fill(box);
	}
}
