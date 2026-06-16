package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int contador = 1;
		
		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		while(contador <= 10) {
			System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
			contador ++;
		}
		
		leia.close();

	}

}
