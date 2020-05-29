package POO;

public class MainCaneta {

	public static void main(String[] args) {
		Caneta c1=new Caneta("Bic Cristal","Azul",0.5f);
		c1.status();
		c1.setModelo("Faber");
		c1.setCor("vermelha");
		c1.destampar();
		c1.status();
		System.out.println("cor da caneta: "+c1.getModelo());
	}

}
