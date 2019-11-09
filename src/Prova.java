import java.util.ArrayList;
import java.util.List;

public class Prova {
	private List<Candidato> candidatos;
	private int numVagas;

	public Prova() {
		candidatos = new ArrayList<>();
	}
	
	public void cadastrarCandidato(Candidato candidato) {
		candidatos.add(candidato);
	}

	public int getNumVagas() {
		return numVagas;
	}

	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}	
}
