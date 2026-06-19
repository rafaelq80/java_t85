package aula_05_array;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[4][4];
		
		int somaPrincipal = 0, somaSecundaria = 0;
		
		String diagonalPrincipal = "", diagonalSecundaria = "";
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.printf("matriz[%d][%d] = " , linha , coluna);
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		/** Seleciona os elementos da Diagonal Principal 
		 * 
		 * linha  = contador
		 * coluna = contador
		 * */
		for (int contador = 0; contador < matriz.length; contador++) {
			diagonalPrincipal += matriz[contador][contador] + " ";
			somaPrincipal += matriz[contador][contador];
		}

		/** Seleciona os elementos da Diagonal Secundária
		 * 
		 * linha  = contador
		 * coluna = tamanho da matriz - 1 - contador
		 * 
		 * Exemplo - Matriz 3x3:
		 * 
		 * 1ª passagem = tamanho da matriz (3) - 1 - contador (0) = 2 => [0][2]
		 * 2ª passagem = tamanho da matriz (3) - 1 - contador (1) = 2 => [1][1]
		 * 3ª passagem = tamanho da matriz (3) - 1 - contador (2) = 2 => [2][0]
		 * 
		 */
		for (int contador = 0; contador < matriz.length; contador++) {
			diagonalSecundaria += matriz[contador][matriz.length - 1 - contador] + " ";
			somaSecundaria += matriz[contador][matriz.length - 1 - contador];
		}
		
		System.out.printf("Elementos da Diagonal Principal: %s%n", diagonalPrincipal);
		
		System.out.printf("Soma de todos Elementos da Diagonal Principal: %d%n", somaPrincipal);

		System.out.printf("Elementos da Diagonal Secundária: %s%n", diagonalSecundaria);
		
		System.out.printf("Soma de todos Elementos da Diagonal Secundária: %d%n", somaSecundaria);
		
		leia.close();
		
	}

}
