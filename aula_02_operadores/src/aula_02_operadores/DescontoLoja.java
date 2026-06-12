package aula_02_operadores;

import java.util.Scanner;

public class DescontoLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
		
		System.out.print("Digite o valor total da compra: R$ ");
		double valorCompra = leia.nextDouble();
		
		System.out.print("O Cliente é Prime? ");
		boolean isPrime = leia.nextBoolean();
		
		boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;
				
		System.out.println("--- Status do Pedido ---");
		System.out.printf("\nValor da Compra: R$ %.2f", valorCompra);
		System.out.printf("\nCliente Prime? %b", isPrime);
		System.out.printf("\nFrete Grátis? %b", ganhouFrete);
		
		leia.close();
	}

}
