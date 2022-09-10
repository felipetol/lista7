package lista.lista7;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		String uniao[] = new String[20];
		
		System.out.println("Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira um valor: ");
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Insira um valor: ");
			vetorB[i] = sc.nextInt();
		}
		
		int indice = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			boolean achou = false;
			for(int j = 0; j < uniao.length; j++) {
				if(uniao[j] == null) {
					break;
				}
				if(vetorA[i] == Integer.parseInt(uniao[j])) {
					achou = true;
				}
			}
			if(!achou) {				
				uniao[indice] = String.valueOf(vetorA[i]);
				indice++;
			}
		}
		for (int i = 0; i < vetorB.length; i++) {
			boolean achou = false;
			for(int j = 0; j < uniao.length; j++) {
				if(uniao[j] == null) {
					break;
				}
				if(vetorB[i] == Integer.parseInt(uniao[j])) {
					achou = true;
				}
			}
			if(!achou) {				
				uniao[indice] = String.valueOf(vetorB[i]);
				indice++;
			}
		}
		
		for(String numero: uniao) {
			if(numero != null) {				
				System.out.println(numero);
			}
		}
		
		sc.close();
	}
}
