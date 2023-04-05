package Principal.modelo;

public class Bike {
	
	private Quadro quadro;
	private Roda rodaDianteira; 
	private Roda rodaTraseira; 
	
	public Quadro getQuadro() {
		return this.quadro;
	}
	
	public Roda getrodaDianteira() {
		return this.rodaDianteira;
	}
	
	public Roda getrodaTraseira() {
		return this.rodaTraseira;
	}
	
	public void getQuadro(Quadro quadro) {
		this.quadro = quadro;
	}
	
	public void getrodaDianteira(Roda rodaDianteira) {
		this.rodaDianteira = rodaDianteira;
	}
	
	public void getrodaTraseira(Roda rodaTraseira) {
		this.rodaTraseira = rodaTraseira;
	}

}
