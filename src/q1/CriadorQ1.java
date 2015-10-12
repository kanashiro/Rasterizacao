package q1;

import java.io.IOException;

public class CriadorQ1 {

	public static void main(String[] args) throws IOException {
		Circunferencia criador = new Circunferencia();
		criador.CriarPorDescricaoParametrica(1);
		criador.CriarPorDescricaoImplicita(1);
		
	}
}
