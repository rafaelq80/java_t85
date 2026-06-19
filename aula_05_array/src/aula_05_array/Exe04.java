package aula_05_array;


import java.util.Scanner;

public class Exe04 {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float[][] matriz = new float[2][4];
		float[] media = new float[2];
		float soma = 0.0f;
		 
		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				System.out.printf("Digite a %dª nota do participante %d: ", coluna + 1, linha + 1);
				matriz[linha][coluna] = leia.nextFloat();
				soma += matriz[linha][coluna];

			}
			
			media[linha] = soma / matriz[linha].length;
			soma = 0.0f;

		}

		for (int linha = 0; linha < media.length; linha++) {

			System.out.printf("\nMédia do participante %d = %.1f", linha + 1, media[linha]);

		}

	}

}