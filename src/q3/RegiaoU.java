package q3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RegiaoU {
	public void CriarRegiaoU() throws IOException {
		// criar um buffer de imagem com tamanho 200x200
		int width = 200, height = 200;
		BufferedImage buffer = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = buffer.createGraphics();

		// pintar o fundo da imagem
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);

		// parametros
		double x, y;
		double Fx1, Fx2, Fx3;

		for (x = 0.0; x <= 1; x = x + 0.0001) {
			for (y = 0; y <= 1; y = y + 0.0001) {

				// disco de raio 1 e centro (0,1)
				// será centro (0, -1) no buffered image
				Fx1 =  (x + y);

				// disco de raio 1 e centro (1,0)
				Fx2 =  ((x-1)*(x-1) + y*y - 1);

				// x+y>1 será x-y>200 no buffered image
				Fx3 =  (x*x + (y-1)*(y-1) - 1);

				if (Fx1 > 1 && Fx2 <= 0 && Fx3 <= 0) {
					buffer.setRGB((int) (x*200), (int) (-y*200 + 200),
							Color.WHITE.getRGB());
				}

			}
		}

		// salvar imagem
		ImageIO.write(buffer, "JPG", new File("Imagens/RegiaoU.jpg"));
	}
}
