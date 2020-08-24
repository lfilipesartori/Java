package idademoun;

import java.util.Scanner;

public class IdadeVoto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.next();
		
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.print("Digite o número do seu Título de Eleitor: ");
		int titulo = teclado.nextInt();
		
		String result = ((idade >= 16 && idade <18) || (idade > 70))? "Voto opcional": "Voto Obrigatório";
		String num = Integer.toString(idade); 
	
		System.out.print(result);
	}
	
}
