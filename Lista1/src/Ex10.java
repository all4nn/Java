/*
 * Escreva um algoritmo que leia um número de 1 a 5 e 
 * escreva-o por extenso. Caso o usuário digite um valor 
 * que não esteja neste intervalo, exibir a mensagem: “Número inválido! 
 */
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int numero = sc.nextInt();

        String numeroExtenso;

        switch (numero) {
            case 1:
                numeroExtenso = "um";
                break;
            case 2:
                numeroExtenso = "dois";
                break;
            case 3:
                numeroExtenso = "três";
                break;
            case 4:
                numeroExtenso = "quatro";
                break;
            case 5:
                numeroExtenso = "cinco";
                break;
            default:
                System.out.println("Número inválido!");
                return;
        }

        System.out.println("O número digitado foi " + numeroExtenso + ".");
    }
}
