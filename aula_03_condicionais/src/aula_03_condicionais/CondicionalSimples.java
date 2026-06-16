package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um núero inteiro: ");
		int numero = leia.nextInt();
		
		if(numero > 10 && numero < 100) {
			System.out.println("O número digitado é maior do que 10!");
		}
		
		System.out.println("*** Fim do Programa ****");
		
		leia.close();

	}

}
