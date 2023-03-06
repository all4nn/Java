import  java.util.Scanner;
public class Fixação2 {
	public static void main(String[] args) {
		
		/*
		 * Transformar o programa do exercício 1 para um sistema que permita ler a
		 * entrada de dados pelo usuário em um vetor durante execução;▪ Permitir que o 
		 * usuário informe, primeiro, os dados de 5 (cinco) alunos e depoisde capturados os 
		 * dados, imprimir o relatório final com todos os dados
		 * :Matrícula: xxxxx
		 * Nome: xxxxx xxxxx
		 * Aprovado: ( x ) Sim ( ) Não
		 * Nota final: xxxxx
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		String[] matriculas = new String[3];
		String[] nomes = new String[3];
		int[] nota1 = new int[3];
		int[] nota2 = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite a matricula: ");
			matriculas[i] = leitor.nextLine();
			
			System.out.println("Digite nome: ");
			nomes[i] = leitor.nextLine();
			
			System.out.println("Digite a 1° nota: ");
			nota1[i] = leitor.nextInt();
			
			System.out.println("Digite a 2° nota: ");
			nota2[i] = leitor.nextInt();
			
			//Força a quebrar a linha do loop e inicia a próxima
			leitor.nextLine();
			
		}
		
		int contador = 0;
		int qtde = 3;
		while (contador < qtde) {
			
			System.out.println("Matricula: " + matriculas[contador]);
			System.out.println("Nome: " + nomes[contador]);
			
			int notaFinal = (nota1[contador] + nota2 [contador]) /2;
			
			if (notaFinal >=6) {
				System.out.println("Aprovado: (x) Sim ( ) Não ");
			} else {
				System.out.println("Aprovado: ( ) Sim (x) Não");
			}
			
			System.out.println("Nota final: " + notaFinal);
			
			contador++; 
		}
		
		leitor.close();
	}
}
