package br.edu.up.principal;

import java.util.Scanner;
import br.edu.up.util.Biblioteca;
import br.edu.up.util.Calculadora;

public class Programa {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		//Criação de um obj chamado leitor e parece com uma váriavel de memoria
		//Uso da palavra NEW se refere a um obj, usou vc cirou um obj
		Scanner leitor = new Scanner(System.in);
		
		//Usar o método nextInt...
		System.out.println("ESC o núm: ");
		num1 = leitor.nextInt();
		
		System.out.println("ESC outro: ");
		num2 = leitor.nextInt();
		
		//int resul = num + num1;
		//uso da função somar()
		//Uso da bibloteca para realizar funções
		//int resul = Biblioteca.somar(num, num1);
		//System.out.println("Deu:" +resul);
		//int resul = Biblioteca.sub(num, num1);
		//System.out.println("Deu:" +resul);
		//int resul = Biblioteca.multi(num, num1);
		//System.out.println("Deu:" +resul);
		//int resul = Biblioteca.divi(num, num1);
		//System.out.println("Deu:" +resul);
		
		//Uso do metodo close
		leitor.close();
	}
	
	public static int somar(int a, int b) {
		return a +b;
	}

}
