package q3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RegiaoU {
	public void CriarRegiaoU(double raio) throws IOException{
		// criar um buffer de imagem com tamanho 200x200
				int width = 201, height = 201;
				BufferedImage buffer = new BufferedImage(width, height,
						BufferedImage.TYPE_INT_RGB);
				Graphics g = buffer.createGraphics();

				// pintar o fundo da imagem
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, width, height);
				
				// parametros
				double x,y;
				int Fx1, Fx2, Fx3;
				
				for (x = 0.0; x < 201.0; x=x+0.1) {
					for (y = -200.0; y < 1.0; y=y+0.1) {
						
						//disco de raio 1 e centro (0,1)
						//será centro (0, -1) no buffered image
						Fx1 = (int)(x * x + (y+raio) * (y+raio) - raio * raio);
						
						//disco de raio 1 e centro (1,0)
						Fx2 = (int)((x-raio) * (x-raio) + y * y - raio * raio);
						
						//x+y>1 será x-y>200 no buffered image
						Fx3 = (int) (-x+y+200);
						
						if (Fx1 <= 0 && Fx2 <= 0 && Fx3 <= 0) {
							buffer.setRGB((int)(x), (int)(y+200), Color.WHITE.getRGB());
						}

					}
				}

				// salvar imagem
				ImageIO.write(buffer, "JPG", new File(
						"Imagens/RegiaoU.jpg"));
	}
}
