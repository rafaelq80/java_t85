package aula_02_operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		float numero1 = 2.0f;
		float numero2 = 2.0f;
		float numero3 = 3.0f;
		
		System.out.printf("\n %.2f == %.2f = %b", numero1, numero2, numero1 == numero2);
		System.out.printf("\n %.2f != %.2f = %b", numero1, numero2, numero1 != numero2);
		System.out.printf("\n %.2f > %.2f = %b", numero1, numero3, numero1 > numero3);
		System.out.printf("\n %.2f >= %.2f = %b", numero1, numero2, numero1 >= numero2);
	}
	
}
