package PctPrincipal;
import PctPrincipal.modelos.*;

public class Programa {
	
	public static void main(String[] args) {
		
		Bicicleta minhaBike = new Bicicleta();
		minhaBike.setModelo("Caloi");
		minhaBike.setVelocidade(0); //agora
		minhaBike.setmarcha(1);
		minhaBike.setpedaladasPorMin(0);
		
		//Imprimir o babado
		System.out.println("Modelo: " + minhaBike.getmodelo());
		System.out.println("velocidade: " + minhaBike.getvelocidade());
		System.out.println("pedaladasPorMin: " + minhaBike.getpedaladasPorMin());
		System.out.println("marcha: " + minhaBike.getmarcha());
		
		
		//minhaBike.setVelocidade(50); //10 min dps
	}

}
