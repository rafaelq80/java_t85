package aula_03_condicionais;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3, soma;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		System.out.printf("\nValores digitados: %d, %d, %d", numero1, numero2, numero3);
		
		soma = numero1 + numero2;
		
		System.out.printf("\n%d + %d = %d\n", numero1, numero2, numero1 + numero2);
		
		if(soma > numero3) {
			System.out.println("A soma dos numeros 1 e 2 é maior do que o numero 3");
		} else if (soma == numero3) {
			System.out.println("A soma dos numeros 1 e 2 é igual ao numero 3");
		} else {
			System.out.println("A soma dos numeros 1 e 2 é menor do que o numero 3");
		}
		
		leia.close();

	}

}
