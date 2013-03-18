package exe_programacao_14;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class EllipseComponent extends JComponent {
	
	public void paintComponent (Graphics g){
		//Recuperando o Graphics2D
		Graphics2D janela = (Graphics2D) g;
		
		//Criando elipse
		Ellipse2D.Double elipse = new Ellipse2D.Double(0,0,100,150);
		janela.draw(elipse);
		janela.setColor(Color.RED);
		janela.fill(elipse);
	}
}
