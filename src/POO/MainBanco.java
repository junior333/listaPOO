package POO;

import javax.swing.JOptionPane;

public class MainBanco {

	public static void main(String[] args) {
		Banco b1=new Banco(0, null, null, 0, false);
		int opc=0;
		while(opc!=9) {
			opc=Integer.parseInt(JOptionPane.showInputDialog("SELECIONE UMA OPÇÃO\n1-DEPOSITO\n2-SACAR DINHEIRO\n3-INFORMACOES\n4-FECHAR CONTA\n9-CANCELAR"));
			switch(opc) {
			case 1:
				float a=Integer.parseInt(JOptionPane.showInputDialog("digite o valor do deposito: "));
				b1.depositar(a);
				break;
			case 2:
				float b=Integer.parseInt(JOptionPane.showInputDialog("digite o valor que deseja sacar"));
				b1.sacar(b);
				break;
			case 3:
				b1.status();
				break;
			case 4:
				b1.fecharConta();
				break;
			case 9:
				System.out.println("FIM DA OPERAÇÃO");
				break;
				default:
					System.out.println("OPERAÇÃO INVÁLIDA");
					break;
			}
		}
	}

}
