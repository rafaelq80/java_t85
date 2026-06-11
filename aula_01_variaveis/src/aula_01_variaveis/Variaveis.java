package aula_01_variaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1 = 10;
		int numero2 = 5;
		float numero3, numero4;
		String nome;
		char opcao = 'N';
		
		System.out.println("Variável numero1 = " + numero1);
		
		System.out.println("Variável numero2 = " + numero2);
		
		System.out.printf("%d + %d = %d\n", numero1, numero2, numero1 + numero2);

		System.out.print("Digite o primeiro valor real: ");
		numero3 = leia.nextFloat();
	
		System.out.print("\nDigite o segundo valor real: ");
		numero4 = leia.nextFloat();
		
		System.out.printf("%.2f x %.2f = %.2f", numero3, numero4, numero3 * numero4);
		
		System.out.print("\nDigite o seu nome: ");
		leia.skip("\\R?"); 
		nome = leia.nextLine();
		
		System.out.println("Olá " + nome + ", seja bem-vindo(a)!");
		
	}

}
