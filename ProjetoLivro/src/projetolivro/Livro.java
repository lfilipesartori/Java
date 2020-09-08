package projetolivro;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int paginaAtual = 0;
	private boolean aberto = false;
	private Pessoa leitor;
	
	
	
	public String detalhes(){
		return "Livro [titulo = " + titulo + "\n autor = " + autor + "\n totPaginas = " + totPaginas 
				+ "\n pagAtual = " + paginaAtual + "\n aberto = " + aberto + "\n leitor = " + leitor.getNome() + 
				" idade = " + leitor.getIdade() + " sexo = " + leitor.getSexo() + "]";
	}
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folhear(int p) {
		this.paginaAtual = p;
		
	}

	@Override
	public void avancarPag() {
		this.paginaAtual ++;
		
	}

	@Override
	public void voltarPag() {
		this.paginaAtual --;
		
	}

	
}
