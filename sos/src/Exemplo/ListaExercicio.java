package Exemplo;

import java.util.Iterator;
import java.util.Scanner;

public class ListaExercicio {
	
	public static void exe3() {
		
		/*
		 * Ex 3. Faça um programa que leia 5 números do teclado e os 
		 * armazene em um vetor. Crie um segundo vetor quearmazene o dobro 
		 * de cada um dos números do primeiro vetor e apresente este vetor.
		 */
		
		Scanner leitor = new Scanner(System.in);
		int qtd = 5;
		String[] vetor1 = new String[qtd];
		String[] vetor2 = new String[qtd];
		
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite um número");
			vetor1[i] = leitor.nextLine();

		}
		
		for (int i = 0; i < vetor1.length; i++) {
			String vlrVetor1 = vetor1[i];
			//int dobro = Integer.parseInt(vlrVetor1)*2;
			Integer dobro = Integer.parseInt(vlrVetor1)*2;
			vetor2[i] = dobro.toString();
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			String valor = vetor2[i];
			System.out.println("Em dobro " +valor);
		}
		
		leitor.close();
	}
	
	public static void exe2() {
		
		/*
		 * Ex 2. Construa um programa que leia um vetor de 5 elementos e 
		 * calcule a média destes valores. Na seqüência,apresente na tela
		 * os valores que são iguais ou superiores à média
		 */
		Scanner leitor = new Scanner(System.in);
		
		int qtd = 5;
		int[] vetor = new int[qtd];
		int total = 0;		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o valor: "+(i+1)+":");
			vetor[i] = leitor.nextInt();
			//total = total + vetor[i];
			total += vetor[i];
		}
		
		//int total = (vetor[0] + (vetor[1] + (vetor[2] + (vetor[3] + (vetor[4]);
		int media = total/qtd;
		
		System.out.println();
		System.out.println("----Relatório----");
		System.out.println();
		System.out.println("Media" + media);
		
		for (int i = 0; i < vetor.length; i++) {
			int num = vetor[i];
			if (num == media){
				System.out.println("Núm" + num + "igual média");
			} else if(num > media){
				System.out.println("Núm maior média");
			} else {
				System.out.println("Núm menor média");
		}
			leitor.close();
		
	}
	}
	public static void exe1() {
		
		/*
		 * 
		 * Ex 1. Escreva um algoritmo que leia uma sequência finita de números e mostre posi�vo, nega�vo ou zero paracada número
		 * 
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int qtde = leitor.nextInt();
		//int[] vetor = {8, 5, -3};
		
		int[] vetor = new int[qtde];
		
		//repetidor para preencher o vetor
		int contador = 0;
		while (contador < qtde) {
			System.out.println("Informe o núm: " + (contador + 1) + "de" + qtde + ":");
			vetor[contador] = leitor.nextInt();
			contador++;
		}
		
		//repetidor para mostrar o tipo de num
		for(int i = 0; i < qtde; i++) {
			
			int num = vetor[i];
			if (num < 0) {
				System.out.println("Negativo");
			} else if(num == 0) {
				System.out.println("Zero");
			} else {
				System.out.println("Positivo");
			}
		
		}
		
		
	}
	

}



