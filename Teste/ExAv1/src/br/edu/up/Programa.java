package br.edu.up;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o número A: ");
        int a = leitor.nextInt();

        System.out.print("Digite o número B: ");
        int b = leitor.nextInt();

        if(a==b) {
        	System.out.print("São iguais se liga heinnnnn");
        }else if (a>b) {
        	System.out.print("A é maior que o número B");
        }else  {
            System.out.println("A é menor o número B");
        }
	}
}