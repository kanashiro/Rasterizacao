package q1;

import java.io.IOException;

public class Criador {

	public static void main(String[] args) throws IOException {
		Circunferencia criador = new Circunferencia();
		criador.CriarPorDescricaoParametrica(100);
		criador.CriarPorDescricaoImplicita(100);
		
	}
}
