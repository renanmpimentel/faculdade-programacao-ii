package exe_programacao_12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class ColorNameComponent extends JComponent {
	
	public void paintComponent (Graphics g){
		Graphics2D janela = (Graphics2D) g;
		
		janela.setColor(Color.BLACK);
		janela.drawString("String Preto", 0, 20);
		
		janela.setColor(Color.BLUE);
		janela.drawString("String Azul", 0, 40);
		
		janela.setColor(Color.CYAN);
		janela.drawString("String Cyan", 0, 60);
		
		janela.setColor(Color.GRAY);
		janela.drawString("String Gray", 0, 80);
		
		janela.setColor(Color.DARK_GRAY);
		janela.drawString("String Dark Gray", 0, 100);
		
		janela.setColor(Color.LIGHT_GRAY);
		janela.drawString("String Light Gray", 0, 120);
		
		janela.setColor(Color.GREEN);
		janela.drawString("String Green", 0, 140);
		
		janela.setColor(Color.MAGENTA);
		janela.drawString("String Magenta", 0, 160);
		
		janela.setColor(Color.ORANGE);
		janela.drawString("String Orange", 0, 180);
		
		janela.setColor(Color.PINK);
		janela.drawString("String Pink", 0, 200);
		
		janela.setColor(Color.RED);
		janela.drawString("String RED", 0, 220);
		
		janela.setColor(Color.WHITE);
		janela.drawString("String White", 0, 240);
		
		janela.setColor(Color.YELLOW);
		janela.drawString("String Yellow", 0, 260);
	}
}
