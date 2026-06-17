package aula_05_array;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = {
									{10, 15, 20}, 
									{5, 55, 60}, 
									{75, 80, 85}
								};
		
		double matrizDouble[][] = new double[2][3];
		
		for (int linha = 0; linha < matrizInteiros.length; linha ++) {
			for (int coluna = 0; coluna < matrizInteiros[linha].length; coluna ++) {
				System.out.printf("matrizInteiros[%d][%d] = %d\n", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		for (int linha = 0; linha < matrizDouble.length; linha ++) {
			for (int coluna = 0; coluna < matrizDouble[linha].length; coluna ++) {
				System.out.printf("Digite um número para a posição [%d][%d] = ", linha, coluna);
				matrizDouble[linha][coluna] = leia.nextDouble();
			}
		}
		
		// Laço de Repetição For Each (lê todo o array)
		for (double linha[] : matrizDouble) {
			for (double numero : linha) {
				System.out.println(numero);
			}
		}
		

		leia.close();
	}

}
