package PctPrincipal.modelos;

public class Bicicleta {
	
	//encapsulamento
	private String modelo;
	private int velocidade;
	private int pedaladasPorMin;
	private int marcha;
	
	//getters (pegar)
	public String getmodelo() {
		return modelo;
	}
	public int getvelocidade() {
		return velocidade;
	}
	public int getpedaladasPorMin() {
		return pedaladasPorMin;
	}
	public int getmarcha() {
		return marcha;
	}
	
	//setter (definir)
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setVelocidade(int velocidade) {
		if (velocidade >= 0) {
			this.velocidade = velocidade;
		}
	}
	
	public void setpedaladasPorMin(int pedaladas) {
		this.pedaladasPorMin = pedaladasPorMin;
	}
	
	public void setmarcha(int marcha) {
		this.marcha = marcha;
	}
	
}
