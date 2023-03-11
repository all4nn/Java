/*
 * Escreva um algoritmo que leia um número e diga, através de uma mensagem,
 * se este número está no intervalo entre 100 e 200. Caso o número esteja
 * fora do intervalo o usuário também deverá ser informado
 */
import java.util.Scanner;
public class Ex7 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número ai: ");
		int num = leitor.nextInt();
		
		if(num >= 100 && num <= 200) {
			System.out.println("Esse número " +num + " tá no meio ");
		} else {
			System.out.println("Esse número " +num + " tá aqui no meio não");
		}
		
	}

}
