package lista.lista7;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[6];
		int somaPares = 0;
		int qtdeImpares = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Insira um valor: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros pares digitados: ");
		for(int numero: vetor) {
			if(numero % 2 == 0) {
				System.out.println(numero);
				somaPares += numero;
			}
		}
		System.out.println("\nSoma dos números pares: " + somaPares);
		
		System.out.println("\nNúmeros ímpares digitados: ");
		for(int numero: vetor) {
			if(numero % 2 != 0) {
				System.out.println(numero);
				qtdeImpares += 1;
			}
		}
		
		System.out.println("\nQuantidade de ímpares: " + qtdeImpares);
		
		sc.close();
	}
}
