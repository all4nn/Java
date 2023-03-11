import java.util.Scanner;

/*
 * Ler uma temperatura em graus Celsius e apresentá-la conver�da em graus Fahrenheit.
 */

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    }
}
