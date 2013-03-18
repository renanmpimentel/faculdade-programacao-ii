package exe_programacao_15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class FaceComponent extends JComponent {
	
	public void paintComponent (Graphics g){
		//Recuperando o Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//Desenhando a cabeça
		Ellipse2D.Double cabeca = new Ellipse2D.Double(20,20,50,50);
		g2.draw(cabeca);
		
		//Desenhando os olhos
		Ellipse2D.Double olhoEsquerdo = new Ellipse2D.Double(30,35,8,8);
		g2.draw(olhoEsquerdo);
		
		Ellipse2D.Double olhoDireito= new Ellipse2D.Double(50,35,8,8);
		g2.draw(olhoDireito);
		
		//Desenhando a boca
		Rectangle boca = new Rectangle(35,55, 20,1);
		g2.draw(boca);
		
	}
}
