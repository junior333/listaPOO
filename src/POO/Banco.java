package POO;

import javax.swing.JOptionPane;

public class Banco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	/**
	 * @param numConta
	 * @param tipo
	 * @param dono
	 * @param saldo
	 * @param status
	 */
	public Banco(int numConta, String tipo, String dono, float saldo, boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
		abrirConta();
	}

	public void abrirConta() {
		int opc = Integer
				.parseInt(JOptionPane.showInputDialog("digite a opção de conta\n1-conta poupança\n2-conta corrente"));
		switch (opc) {
		case 1:
			setDono("");
			setNumConta(0);
			depositar(150.00f);
			setTipo("conta poupanca");
			setStatus(true);
			break;
		case 2:
			setDono("");
			setNumConta(0);
			depositar(50.00f);
			setTipo("conta corrente");
			setStatus(true);
			break;
		default:
			break;
		}
	}

	public void fecharConta() {
		if(getSaldo()==0) {
			status = false;
		}
		else {
			System.out.println("NÃO FOI POSSIVEL FECHAR A CONTA\nVERIFIQUE O SEU SALDO");
		}
	}

	public void depositar(float valor) {
		if(isStatus()==true) {
		this.saldo += valor;
		}
		else {
			System.out.println("SUA CONTA ESTÁ ENCERRADA");
		}
	}

	public void sacar(float valor) {
		if(isStatus()==true){
		this.saldo -= valor;
		}
		else {
			System.out.println("SUA CONTA ESTÁ ENCERRADA");
		}
	}

	public void pagarMensal(float mensal) {
		if(isStatus()==true){
			this.saldo -= mensal;
			}
			else {
				System.out.println("SUA CONTA ESTÁ ENCERRADA");
			}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		numConta=(int)(Math.random()*9999);
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		dono=JOptionPane.showInputDialog("digite o nome do Dono: ");
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void status() {
		System.out.println("Dono: "+getDono()+"\nN°Conta: "+getNumConta()+"\nTipo: "+getTipo()+"\nSaldo: "+getSaldo()+"\nStatus: "+isStatus());
	}
}
