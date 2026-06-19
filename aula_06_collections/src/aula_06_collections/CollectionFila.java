package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Thiago"); 
		fila.add("Guilherme"); 
		fila.add("Higor"); 
		fila.add("Sara");
		fila.add("Bella");
		
		System.out.println("Digite o nome do cliente: ");
		fila.add(leia.next());
		
		fila.remove();
		fila.remove();
		
		System.out.println("A Sara ainda está na fila? " + fila.contains("Sara"));
		
		for(var cliente : fila) {
			System.out.println(cliente);
		}
		
		

	}

}
