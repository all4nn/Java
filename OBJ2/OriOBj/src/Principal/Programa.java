package Principal;

import Principal.pessoa.*;

	public class Programa {
	
		public static void main(String[] args) {
		
		Pessoa Eu = new Pessoa();
		Pessoa Voce = new Pessoa();
		Pessoa Pedro = new Pessoa();
		Pessoa Ana = new Pessoa();
		Pessoa Carlos = new Pessoa();
		Pessoa Tu = new Pessoa();
		
		Eu.setNome("eu");
		Eu.setCPF("000.000.000-01");
		Eu.setIdade(22);
		
		Voce.setNome("vc");
		Voce.setCPF("000.000.000-02");
		Voce.setIdade(21);
		
		Pedro.setNome("pedro");
		Pedro.setCPF("000.000.000-03");
		Pedro.setIdade(20);
		
		Ana.setNome("ana");
		Ana.setCPF("000.000.000-04");
		Ana.setIdade(23);
		
		Carlos.setNome("carlos");
		Carlos.setCPF("000.000.000-05");
		Carlos.setIdade(24);
		
		Tu.setNome("tutu");
		Tu.setCPF("000.000.000-06");
		Tu.setIdade(25);
		
		
		//Imprimindo
	
		System.out.println("Nome: "+ Eu.getNome());
		System.out.println("CPF: "+ Eu.getCPF());
		System.out.println("Idade: "+ Eu.getIdade());
		
		System.out.println("\n---------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Nome: "+ Voce.getNome());
		System.out.println("CPF: "+ Voce.getCPF());
		System.out.println("Idade: "+ Voce.getIdade());
		
		System.out.println("\n---------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Nome: "+ Pedro.getNome());
		System.out.println("CPF: "+ Pedro.getCPF());
		System.out.println("Idade: "+ Pedro.getIdade());
		
		System.out.println("\n---------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Nome: "+ Ana.getNome());
		System.out.println("CPF: "+ Ana.getCPF());
		System.out.println("Idade: "+ Ana.getIdade());
		
		System.out.println("\n---------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Nome: "+ Carlos.getNome());
		System.out.println("CPF: "+ Carlos.getCPF());
		System.out.println("Idade: "+ Carlos.getIdade());
		
		System.out.println("\n---------------------------------------------------------------------------------------------------------\n");
		
		System.out.println("Nome: "+ Tu.getNome());
		System.out.println("CPF: "+ Tu.getCPF());
		System.out.println("Idade: "+ Tu.getIdade());
		
	}

}
