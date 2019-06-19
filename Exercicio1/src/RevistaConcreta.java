
public class RevistaConcreta extends Publicacao{
	
	private int periodicidade;
	
	public RevistaConcreta(long id, String titulo,int numExemplares,AreaConcreto area,int periodicidade) {
		super(id, titulo, numExemplares, area);
	}
}

