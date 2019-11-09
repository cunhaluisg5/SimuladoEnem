import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		menu();
		opcao = scanner.nextInt();
		
		switch(opcao) {
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

	private static void menu() {
		System.out.println("Escolha uma opção abaixo:\n");
		System.out.println("1 - Cadastrar nota do candidato:\n");
		System.out.println("2 - Cadastrar número de vagas:\n");
		System.out.println("3 - Listar candidatos:\n");
		System.out.println("4 - Exibir percentual de aprovados por cidade:\n");
	}
	
	private static void cadastrarNota(){
		
	}
	
	private static void cadastrarVagas() {
		
	}
	
	private static void listarCandidatos() {
		
	}
	
	private static void exibirPercentual() {
		
	}
}
