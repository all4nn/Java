package br.up.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import br.up.edu.entidades.Produto;


public class Programa {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String arquivoOrigem = "C:\\_src\\2e4\\WS\\A\\LeitGrav2\\Entidade\\produto.csv";
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
		
		Produto[] vetorDeProdutos = new Produto[2];
		
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			String[] valores = linha.split(";");
			
			Produto produto = new Produto();
			produto.cod = Integer.parseInt(valores[0]);
			produto.nome = valores[1];
			produto.marca = valores[2];
			produto.preco = Double.parseDouble(valores[3]); 
			}
/*		
		Produto meuProduto = new Produto();
		meuProduto.cod = 1;
		meuProduto.nome = "PC";
		meuProduto.marca = "MORENOS LTDA";
		meuProduto.preco = 5000.00;
		
		Produto seuProduto = new Produto();
		seuProduto.cod = 2;
		seuProduto.nome = "Iphome";
		seuProduto.marca = "Samsunlixo";
		seuProduto.preco = 1.90;
		
		System.out.println("Meu produto");
		System.out.println("Codigo: " + meuProduto.cod);
		System.out.println("Codigo: " + meuProduto.nome);
		System.out.println("Codigo: " + meuProduto.marca);
		System.out.println("Codigo: " + meuProduto.preco);
		System.out.println();
		
		System.out.println("Seu produto");
		System.out.println("Codigo: " + seuProduto.cod);
		System.out.println("Codigo: " + seuProduto.nome);
		System.out.println("Codigo: " + seuProduto.marca);
		System.out.println("Codigo: " + seuProduto.preco);
*/
		 leitor.close();
	}

	
}
