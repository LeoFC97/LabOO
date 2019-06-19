public abstract class Publicacao extends DomainObject {
	private  int numExemplares,numExemplaresEmprestados;
	private String titulo;
	
	public Publicacao(long id, String titulo,int numExemplares, AreaConcreto area) {
		super(id);
	}
	public int obterNumExemplaresDisponiveis() {
		return this.numExemplares-this.numExemplaresEmprestados;
	}
	public int obterNumeroExemplares() {
		return this.numExemplares;
	}
	void atualizarNumExemplares(int numExemplares) {
		this.numExemplares=numExemplares;
	}
}

