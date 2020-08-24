package estruturasderepeticao;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		int n, s=0;
		String resp;
		Scanner t = new Scanner(System.in);
		
			do{
				System.out.print("Digite um número: ");
				n = t.nextInt();
				s += n; //s + s = n
				System.out.print("Quer continuar?  [s/n] ");
				resp = t.next();
				
			}while(resp.equals("s"));
			
			System.out.println("A soma de todos os valores é " + s);			
		
	}

}
