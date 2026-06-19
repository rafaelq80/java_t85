package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		// Cria a Collection ArrayList
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		// Adiciona elementos no ArrayList
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		numeros.add(9);
		numeros.add(7);
		
		// Lista os dados do ArrayList
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		// Identifica o valor armazenado em um ídice específico
		System.out.println("O objeto que está presente no indice 1: " + numeros.get(1));
		System.out.println("O indice do objeto 7: " + numeros.indexOf(7));
		
		numeros.set(3, 25);

		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		numeros.remove(0);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		// Ordenar em ordem crescente
		numeros.sort(null);
		
		// Ordenar em ordem decrescente
		numeros.sort(Comparator.reverseOrder());
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
	}

}
