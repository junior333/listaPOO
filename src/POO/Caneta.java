package POO;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	private boolean tampada = false;

	public Caneta(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
	}

	public void status() {
		System.out.println("Uma caneta: " + this.getModelo() + " Cor: " + this.getCor());
		System.out.println("está tampada: " + this.tampada);
//		System.out.println("tamanho da ponta: "+this.ponta);
//		System.out.println("tamanho da carga: "+this.carga);
	}

	public void rabiscar() {
		if (this.tampada == false) {
			System.out.println("rabiscando...");
		} else {
			System.out.println("não posso rabiscar");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String c) {
		this.cor = c;
	}

}
