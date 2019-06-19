import java.util.Date;

public class Emprestimo extends DomainObject {
	private Date inicio, previsaoDeEntrega, entrega;
	
	public Emprestimo(long id,Publicacao publicacao,AlunoConcreto aluno,Date inicio, Date previsaodeEntrega,Date entrega) {
		super(id);
	}
	public Date obterDiasEmAtraso() {
		Date diff = new Date(this.entrega.getTime() - this.previsaoDeEntrega.getTime());
		return diff;
	}
	public void emprestarParaAluno(AlunoConcreto aluno){
	}
	
}
