package q1;

import java.io.IOException;

public class CriadorQ1 {

	public static void main(String[] args) throws IOException {
		Circunferencia criador = new Circunferencia();
		criador.CriarPorDescricaoParametrica(100);
		criador.CriarPorDescricaoImplicita(100);
		
	}
}
