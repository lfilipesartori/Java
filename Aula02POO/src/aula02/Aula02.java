package aula02;

public class Aula02 {
	
	public static void main(String[] args) {
		
		System.out.println("\n---------- MODELO 1 ----------\n");
		
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		
		c1.status();
		c1.rabiscar();
		
		System.out.println("\n---------- MODELO 2 ----------\n");
		
		Caneta c2 = new Caneta();
		c2.modelo = "Bic";
		c2.cor = "Preta";
		c2.ponta = 1.0f;
		c2.carga = 100;
		c2.destampar();
		c2.status();
		c2.rabiscar();
				
		
	}
}
