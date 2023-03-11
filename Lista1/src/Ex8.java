import java.util.Scanner;

/*
 * Ex 8. Escreva um algoritmo que leia um número e mostre uma mensagem
 * caso este número seja maior ou iguala 50, outra se ele for menor que 50
 */
public class Ex8 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número ai: ");
		int num = leitor.nextInt();
		
		if(num >= 50) {
			System.out.println("Esse número " +num + " é maior ou igual a 50");
		} else {
			System.out.println("Esse número " +num + " é menor que 50");
		}
		
	}

}
