package programaswitchcase;

import java.util.Scanner;

public class PernasSwitchCase {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Quantas pernas? ");
		int pernas = t.nextInt();
		
		String tipo;
		
		System.out.print("Isso é um(a) ");
		
		switch(pernas) {
			case 1:
				tipo = "Saci";
				break;
			case 2:
				tipo = "Bípede";
				break;
			case 3:
				tipo = "Trípede";
				break;
			case 4:
				tipo = "Quadrúpede";
				break;
			case 6:
				tipo = "Aranha";
				break;
			default:
				tipo = "ET";
		}
		
		System.out.println(tipo);
		
	}
	
}
