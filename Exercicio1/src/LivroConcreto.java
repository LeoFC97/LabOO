
public class LivroConcreto extends Publicacao {

	private String isbn;
	public LivroConcreto(long id, String titulo, int numExemplares, AreaConcreta area, String isbn,AutorConcreto autor) {
		super(id, titulo, numExemplares, area);
	}
	

}
