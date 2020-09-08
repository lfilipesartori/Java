package aula03e04;

public class Caneta {
 
		public String modelo;
		private float ponta;
		private boolean tampada;
		private String cor;
		
		public Caneta(String m, String c, float p) { //Método construtor
			this.modelo = m;
			this.ponta = p;
			this.cor = c;
			this.tampar();		
			
		}
		
		public String getModelo() {
			return this.modelo;
		}
		
		public void setModelo(String m) {
			this.modelo = m;
		}
		
		public float getPonta() {
			return this.ponta;
		}
		
		public void setPonta(float p) {
			this.ponta = p;
		}
		
		public void tampar() {
			this.tampada = true;
		}
		
		public void destampar() {
			this.tampada = false;
		}
		
		
		public void status() {
			System.out.println("\nSOBRE A CANETA:\n");
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Ponta: " + this.ponta);
			System.out.println("Cor: " + this.cor);
			System.out.println("Tampada: " + this.tampada);
		}
	

}
