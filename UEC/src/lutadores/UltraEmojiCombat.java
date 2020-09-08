package lutadores;

public class UltraEmojiCombat {
	
	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "Indonésia", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "México", 32, 1.74f, 68.5f, 11, 2, 2);
		l[2] = new Lutador("Snapshadow", "Canadá", 30, 1.85f, 98.9f, 5, 3, 1);
		l[3] = new Lutador("Dead Code", "Austrália", 41, 1.95f, 88.9f, 8, 4, 1);
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		l[0].status();
		l[1].status();
	}

}
