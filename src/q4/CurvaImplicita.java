package q4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CurvaImplicita {
	
	public void CriarCurvaImplicita() throws IOException{
	
		int width = 201, height = 201;
	
		BufferedImage buffer = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = buffer.createGraphics();
	
		// pintar o fundo da imagem
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);
		
		//parametros
		double x,y;
		//F(x,y) = y^2 - x^3 + x 
		
		
		for (x = -2; x <= 2; x = x + 0.0001) {
			
				y = Math.sqrt(x*x*x-x);
				if (y <= 2) {
					buffer.setRGB((int)(x*50 + 100), (int)(y*-50 + 100), Color.WHITE.getRGB());
					buffer.setRGB((int)(x*50 + 100), (int)(y*50 + 100), Color.WHITE.getRGB());
				}

			
		}
		
		
		ImageIO.write(buffer, "JPG", new File(
				"Imagens/CurvaImplicita_Q4.jpg"));
	
	}

}
