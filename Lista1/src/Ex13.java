/*
 * Escreva um algoritmo que leia valores REAIS nas variáveis A e B 
 * e o tipo de operador em outra variável dotipo CARACTERE. Imprima o 
 * resultado da operação de A por B se o operador aritmético for válido; 
 * caso contráriodeve ser impresso uma mensagem de operador não definido. 
 * Tratar erro de divisão por zero.
 */
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);

        // Pede ao usuário para inserir dois números reais
        System.out.print("Digite o valor de A: ");
        double a = leitor.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = leitor.nextDouble();

        // Pede ao usuário para inserir o operador aritmético
        System.out.print("Digite o operador aritmético (+, -, , /): ");
        char operador = leitor.next().charAt(0);

        // Verifica o operador aritmético e executa a operação correspondente
        switch (operador) {
            case '+':
                System.out.println("A + B = " + (a + b));
                break;
            case '-':
                System.out.println("A - B = " + (a - b));
                break;
            case '*':
                System.out.println("A * B = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Erro: divisão por zero!");
                } else {
                    System.out.println("A / B = " + (a / b));
                }
                break;
            default:
                System.out.println("Operador aritmético inválido. Por favor, digite um dos seguintes operadores: +, -, *, /");
                break;
        }
    }
}