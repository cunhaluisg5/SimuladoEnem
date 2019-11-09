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

	public List<Candidato> listarCandidatos() {
		return candidatos;
	}

	public Candidato buscarCandidato(String nome) {
		Candidato candidato = null;
		for (Candidato c : candidatos) {
			if (c.getNome().equals(nome)) {
				candidato = c;
			}
		}
		return candidato;
	}

	public void alterarCandidato(Candidato candidato) {
		Candidato c = buscarCandidato(candidato.getNome());
		if (c != null) {
			int posicao = candidatos.indexOf(c);
			candidatos.set(posicao, candidato);
		}
	}

	public int getNumVagas() {
		return numVagas;
	}

	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}
}
