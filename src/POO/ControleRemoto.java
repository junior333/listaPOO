package POO;

public class ControleRemoto implements IntefaceControle {
	private int volume;
	private boolean ligado;
	private boolean tocando;

	/**
	 * @param volume
	 * @param ligado
	 * @param tocando
	 */
	public ControleRemoto(int volume, boolean ligado, boolean tocando) {
		super();
		this.volume = volume;
		this.ligado = ligado;
		this.tocando = tocando;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("-------Menu------");
		System.out.println("está ligado? "+this.getLigado()+"\nestá tocando? "+this.getTocando()+"\nvolume: ");
		for(int i=0;i<=this.getVolume();i+=10) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("fechando volume...");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+1);
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()-1);
		}
	}

	@Override
	public void ligarMudo() {
		if(getLigado()&& getVolume()>0) {
			setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(getLigado()&& getVolume()==0) {
			setVolume(50);
		}
	}

	@Override
	public void play() {
		if(getLigado()&& !(getTocando())) {
			setTocando(true);
		}
	}

	@Override
	public void pause() {
		if(getLigado()&& getTocando()){
			setTocando(false);
		}
	}

}
