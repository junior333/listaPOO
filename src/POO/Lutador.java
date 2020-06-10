package POO;

public class Lutador {
	private String nome;
	private String nsc;
	private int idade;
	private float alt;
	private float peso;
	private String cat;
	private int vit;
	private int der;
	private int emp;

	public Lutador(String nome, String nsc, int idade, float alt, float peso, int vit, int der, int emp) {
		super();
		this.nome = nome;
		this.nsc = nsc;
		this.idade = idade;
		this.alt = alt;
		this.setPeso(peso);
		this.vit = vit;
		this.der = der;
		this.emp = emp;
	}

	public void apresentar() {
		System.out.println("CHEGOU A HORA! Vamos apresentar o lutador: " + getNome() + "\nDiretamente de " + getNsc()
				+ "\nCom " + getIdade() + " anos de idade e " + getAlt() + " de altura\nPesando: " + getPeso()
				+ " kilos\nVitorias: " + getVit() + "\nDerrotas: " + getDer() + "\nEmpates: " + getEmp());
	}

	public void status() {
		System.out.println(getNome() + " é um lutador peso " + getCat() + "\nCom:\n" + getVit() + " Vitorias\n"
				+ getDer() + " Derrotas\n" + getEmp() + " Empates");
	}

	public void ganharLuta() {
		this.setVit(this.getVit() + 1);
	}

	public void perderLuta() {
		this.setDer(this.getDer() + 1);
	}

	public void empatarLuta() {
		this.setEmp(this.getEmp() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNsc() {
		return nsc;
	}

	public void setNsc(String nsc) {
		this.nsc = nsc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAlt() {
		return alt;
	}

	public void setAlt(float alt) {
		this.alt = alt;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCat("");
	}

	public String getCat() {
		return cat;
	}

	private void setCat(String cat) {
		if (peso < 52.2) {
			cat = "invalido";
			System.out.println("muito abaixo do peso para lutar");
		} else if (peso <= 70.3) {
			cat = "leve";
		} else if (peso <= 83.9) {
			cat = "medio";
		} else if (peso <= 120.2) {
			cat = "pesado";
		} else {
			cat = "invalido";
			System.out.println("muito acima do peso para lutar");
		}

		this.cat = cat;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getDer() {
		return der;
	}

	public void setDer(int der) {
		this.der = der;
	}

	public int getEmp() {
		return emp;
	}

	public void setEmp(int emp) {
		this.emp = emp;
	}

}
