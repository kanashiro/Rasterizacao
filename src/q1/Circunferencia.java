package q1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Circunferencia {

	public void CriarPorDescricaoParametrica(int raio) throws IOException {

		// criar um buffer de imagem com tamanho 200x200
		int width = 201, height = 201;
		BufferedImage buffer = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = buffer.createGraphics();

		// pintar o fundo da imagem
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);

		// criar circunferencia

		// parametros
		double teta = 0;
		int x, y;

		// descricao parametrica
		for (teta = 0; teta < 360; teta=teta+0.1) {
			x = (int) (raio * Math.sin(teta)*100);
			y = (int) (raio * Math.cos(teta)*100);
			buffer.setRGB(x + 100, y+ 100, Color.WHITE.getRGB());
		}

		// salvar imagem
		ImageIO.write(buffer, "JPG", new File(
				"Imagens/Circunferencia_Parametrica.jpg"));
	}

	public void CriarPorDescricaoImplicita(int raio) throws IOException {

		// criar um buffer de imagem com tamanho 200x200
		int width = 201, height = 201;
		BufferedImage buffer = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = buffer.createGraphics();

		// pintar o fundo da imagem
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);

		// criar circunferencia

		// parametros

		double x, y;
		int k=0;
		int Fx = 0;
		// descricao implicita
		// F(x,y) = x²+y²-raio²
		// F^(-1)(0) = circunferencia
		for (x = -1.0; x <= 1.0; x=x+0.00001) {	
			y = Math.sqrt(raio*raio - x*x);
				if (y <= 1) {
					buffer.setRGB((int)(x*100+100), (int)(y*100+100), Color.WHITE.getRGB());
					buffer.setRGB((int)(x*100+100), (int)(-y*100+100), Color.WHITE.getRGB());
				}
			}

		// salvar imagem
		ImageIO.write(buffer, "JPG", new File(
				"Imagens/Circunferencia_Implicita.jpg"));
	}

}
