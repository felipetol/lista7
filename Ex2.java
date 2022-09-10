package lista.lista7;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[100];
		
		int num = 0;
		for (int i = 0; i < vetor.length; i++) {
			while(true) {				
				if((num % 7 != 0) || (num % 10 == 7)) {
					vetor[i] = num;
					num++;
					break;
				} else {
					num++;
				}
			}
		}
		
		for(int numero: vetor) {
			System.out.println(numero);
		}
		
		sc.close();
	}
}
