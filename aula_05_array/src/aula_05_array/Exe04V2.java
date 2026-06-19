package aula_05_array;


import java.util.Scanner;

public class Exe04V2 {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		// Define a matriz como String
		String[][] matriz = new String[2][5];
		float[] media = new float[2];
		float soma = 0.0f;
		 
		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				
				// Se for a primeira coluna (0), cadastra o nome
				if (coluna == 0) {
					
					System.out.printf("\nDigite o nome do participante: ");
					matriz[linha][coluna] = leia.next();
				
				//Senão, cadastra as notas
				}else {
				
					System.out.printf("Digite a %dª nota do participante %s: ", coluna, matriz[linha][0]);
					matriz[linha][coluna] = leia.next();
					
					// Antes de somar:
					// - Converte a nota de String para Float (Float.parseFloat)
					// - Substitui a virgula pelo ponto (replace)
					soma += Float.parseFloat(matriz[linha][coluna].replace(",", "."));
				
				}

			}
			
			media[linha] = soma / (matriz[linha].length - 1);
			soma = 0.0f;

		}

		// Para criar o efeito de tabela usamos %-tamanho, onde tamanho é o número de espaços
		// Exemplo:
		// %-15s => Reserve 15 espaços para um conteúdo String (texto ou variável) e alinhe à esquerda
		// %n => Pule uma linha
		System.out.println("\n***********************************************************");
		System.out.println("                     CÁLCULO DAS MÉDIAS                    ");
		System.out.println("***********************************************************");
		System.out.printf("%n%-15s%-10s%-10s%-10s%-10s%-10s%n",
				"Nome", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Média");
		
		for (int linha = 0; linha < media.length; linha++) {
			 
			System.out.printf("%-15s", matriz[linha][0]);
 
			for (int coluna = 1; coluna < matriz[linha].length; coluna++) {
				System.out.printf("%-10.1f", Float.parseFloat(matriz[linha][coluna].replace(",", ".")));
			}
 
			System.out.printf("%-10.1f%n", media[linha]);
 
		}
		
		leia.close();

	}

}