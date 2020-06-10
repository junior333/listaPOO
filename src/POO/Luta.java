package POO;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCat().equals(l2.getCat()) && l1 != l2) {
			this.setAprovada(true);
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada=false;
			this.desafiado=null;
			this.desafiante=null;
			System.out.println("não é possivel marcar luta");
		}
	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("###### Desafiado ######");
			this.desafiado.apresentar();
			System.out.println("###### Desafiante ######");
			this.desafiante.apresentar();
			System.out.println("============================================");
			int opc = (int) (Math.random() * 3);
			switch (opc) {
			case 0:
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				System.out.println("####### O DESAFIADO " + this.desafiado.getNome() + " GANHOU #######");
				break;
			case 1:
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				System.out.println("####### O DESAFIANTE " + this.desafiante.getNome() + " GANHOU #######");
				break;
			case 2:
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				System.out.println("########### EMPATE ###########");
				break;
			}
		}
			else
				System.out.println("a luta não pode acontecer");
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador dt) {
		this.desafiante = dt;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
