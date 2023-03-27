package br.edu.up;

import java.util.Scanner;

public class Programa2 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
        
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        boolean iguais = true;
        
        //VETOR 1
        System.out.println("Coloque os valores do vetor 1:");
        for (int i = 0; i < 3; i++) {
            vetor1[i] = leitor.nextInt();
        }
        
       //VETOR 2
        System.out.println("Coloque os valores do vetor 2:");
        for (int i = 0; i < 3; i++) {
            vetor2[i] = leitor.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }
        
        if (iguais) {
            System.out.println("UAU os vetores são IGUAIS.");
        } else {
            System.out.println("POXAAA os vetores são DIFERENTES.");
        }
    leitor.close();
	}

}