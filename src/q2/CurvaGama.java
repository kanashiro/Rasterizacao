package q2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CurvaGama {

	public void CriarCurvaUniforme() throws IOException{
		// criar um buffer de imagem com tamanho 200x200
				int width = 201, height = 201;
				BufferedImage buffer = new BufferedImage(width, height,
						BufferedImage.TYPE_INT_RGB);
				Graphics g = buffer.createGraphics();

				// pintar o fundo da imagem
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, width, height);
				
				// parametros
				int x,y;
				double t;
				
				for (t = 0;  t < 100; t=t+0.1) {
					x = (int) (t*Math.sin(t));
					y = (int) (t*Math.cos(t));
					buffer.setRGB(x + 100, y + 100, Color.WHITE.getRGB());
				}
				
				// salvar imagem
				ImageIO.write(buffer, "JPG", new File(
						"Imagens/CurvaGama_Amostragem_Uniforme.jpg"));
	}
	
	public void CriarCurvaAdaptativa() throws IOException{
		// criar um buffer de imagem com tamanho 200x200
		int width = 201, height = 201;
		BufferedImage buffer = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = buffer.createGraphics();

		// pintar o fundo da imagem
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);
		
		// parametros
		int x,y;
		double t;
		
		for (t = 0;  t < 100; t=t+1/Math.sqrt(1+t*t)) {
			x = (int) (t*Math.sin(t));
			y = (int) (t*Math.cos(t));
		
			buffer.setRGB(x + 100, y + 100, Color.WHITE.getRGB());
		}
		
		// salvar imagem
		ImageIO.write(buffer, "JPG", new File(
				"Imagens/CurvaGama_Amostragem_Adaptativa.jpg"));
	}
}
