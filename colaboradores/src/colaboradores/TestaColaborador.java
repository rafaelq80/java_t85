package colaboradores;

public class TestaColaborador {

	public static void main(String[] args) {

		gerenteValido();
		nomeVazio();
		emailInvalido();
		salarioNegativo();
		bonusNegativo();
		
	}

	static void gerenteValido() {
		System.out.println("\n>>> Caso 1: Gerente válido com bônus");
		try {
			Gerente g = new Gerente("Carlos", "carlos@empresa.com", 3000.0, 500.0);
			g.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void nomeVazio() {
		System.out.println("\n>>> Caso 2: Nome vazio");
		try {
			new Gerente("", "ana@empresa.com", 3000.0, 500.0); // nome inválido: vazio
		} catch (IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void emailInvalido() {
		System.out.println("\n>>> Caso 3: Email inválido");
		try {
			new Gerente("Ana", "emailinvalido", 3000.0, 500.0); // email inválido: sem @
		} catch (IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void salarioNegativo() {
		System.out.println("\n>>> Caso 4: Salário negativo");
		try {
			new Gerente("João", "joao@empresa.com", -1500.0, 500.0); // salário inválido: negativo
		} catch (IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void bonusNegativo() {
		System.out.println("\n>>> Caso 5: Bônus negativo");
		try {
			new Gerente("Maria", "maria@empresa.com", 3000.0, -200.0); // bônus inválido: negativo
		} catch (IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
