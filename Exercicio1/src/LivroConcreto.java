
public class LivroConcreto extends Publicacao {

	private String isbn;
	public LivroConcreto(long id, String titulo, int numExemplares, AreaConcreto area, String isbn,AutorConcreto autor) {
		super(id, titulo, numExemplares, area);
	}
	
	public void adicionarAutor(AutorConcreto autor) {
		
	}
	public void removerAutor(AutorConcreto autor) {
		
	}

}
