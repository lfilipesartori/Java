package aulaheranca;

public class aula011Main {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa();
		Visitante v1 = new Visitante();
		
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		
		a1.setNome ("Cláudio");
		a1.setMatricula(1111111);
		a1.setIdade(16);
		a1.setCurso("Informática");
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		
		b1.setMatricula(111111);
		b1.setNome("Jú");
		b1.setBolsa(12.5f);
		b1.setSexo("F");
		b1.pagarMensalidade();
		
	}
	
}
