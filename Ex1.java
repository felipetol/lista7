package lista.lista7;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[10];
		
		System.out.println("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Insira o valor: ");
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Insira o valor: ");
			vetorB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i] * vetorA[i];
		}
		
		System.out.println("Vetor C:");
		for(int numero: vetorC) {
			System.out.println(numero);
		}
		
		sc.close();
	}
}
