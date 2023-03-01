import java.util.Scanner;

public class Exfixacao {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int matricula;
		System.out.println("Digite a matrícula: ");
		matricula = leitor.nextInt();
		
		String nome;
		System.out.println("Escreve o nome: ");
		nome = leitor.nextLine();
		
		double nota1;
		System.out.println("Digita a nota ai: ");
		nota1 = leitor.nextDouble();
		
		double nota2;
		System.out.println("Digita a nota ai: ");
		nota1 = leitor.nextDouble();
		
		double notaFinal = (nota1 + nota2) / 2;
		
		
		
	}

}
