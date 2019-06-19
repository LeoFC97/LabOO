public abstract class Publicacao {
	private  int numExemplares,numExemplaresEmprestados;
	private String titulo;
	
	public Publicacao(long id, String titulo,int numExemplares, AreaConcreta area) {
		
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
