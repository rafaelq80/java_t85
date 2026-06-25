package colaboradores;

public class TestaColaborador {

	public static void main(String[] args) {

		try {
			
			Gerente gerente = new Gerente("André", "andre@email.com.br", 15000.00, 1000.00);
			gerente.visualizar();

		} catch (IllegalArgumentException error) {
			System.err.println("Erro: " + error.getMessage());
		}
	}

}
