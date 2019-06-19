
public class AreaConcreto extends DomainObject {
	private String nome;
	
	public AreaConcreto(long id, String nome) {
		super(id);
	}
	public void setArea(String nomeRecebido) {
		this.nome=nomeRecebido;
	}
}
