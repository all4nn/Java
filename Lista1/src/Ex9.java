/*
 * Leia dois números nas variáveis A e B e ide�fique se os valores são iguais
 *  ou diferentes. Caso eles seja iguais imprima uma mensagem dizendo que são iguais.
 *  Caso sejam diferentes, informe que são diferentes e qualnúmero é o maior.
 */
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número A: ");
        int a = sc.nextInt();

        System.out.print("Digite o número B: ");
        int b = sc.nextInt();
        
        if(a==b) {
        	System.out.print("São iguais sua tonta");
        }else if (a>b) {
        	System.out.print("Se liga  A é maior que o número B");
        }else  {
            System.out.println("O número A é menor q o número B");
        }
	}
}