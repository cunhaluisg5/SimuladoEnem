import java.util.Scanner;

public class Principal {
	private static Scanner scanner = new Scanner(System.in);
	private static Prova prova = new Prova();
	private static int opcao = 1;

	public static void main(String[] args) {
		while (true) {
			menu();
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				cadastrarNota();
				break;
			case 2:
				cadastrarVagas();
				break;
			case 3:
				listarCandidatos();
				break;
			case 4:
				exibirPercentual();
				break;
			default:
				System.out.println("Opção inválida\n");
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("Escolha uma opção abaixo:\n");
		System.out.println("1 - Cadastrar nota do candidato:\n");
		System.out.println("2 - Cadastrar número de vagas:\n");
		System.out.println("3 - Listar candidatos:\n");
		System.out.println("4 - Exibir percentual de aprovados por cidade:\n");
	}

	private static void cadastrarNota() {
		while (opcao == 1) {
			Candidato candidato = new Candidato();
			System.out.println("Informe o nome do candidato:\n");
			candidato.setNome(scanner.next());
			System.out.println("Informe a cidade do candidato:\n");
			candidato.setCidade(scanner.next());
			double nota = -1;
			while(nota < 0 || nota >= 100) {
				System.out.println("Informe a nota do candidato:\n");
				nota = scanner.nextDouble();
			}
			candidato.setNota(nota);
			if(nota == 0) {
				candidato.setAprovado(false);
			}
			prova.cadastrarCandidato(candidato);
			System.out.println("Candidato cadastrado com sucesso!\n");
			System.out.println("Deseja cadastrar mais candidatos? (1) Sim - (2) Não\n");
			opcao = scanner.nextInt();
		}
	}

	private static void cadastrarVagas() {

	}

	private static void listarCandidatos() {

	}

	private static void exibirPercentual() {

	}
}
