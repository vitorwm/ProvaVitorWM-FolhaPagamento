package views;
import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {		
		int opcao;
		do {			
			System.out.println("\n-- PROJETO DE FOLHAS DE PAGAMENTO --  ");
			System.out.println("1 - Cadastrar funcionário");
			System.out.println("2 - Cadastrar folha de pagamento");
			System.out.println("3 - Consultar folha de pagamento");
			System.out.println("4 - Consultar todas as folhas de pagamento");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:	
				CadastrarFuncionario.renderizar();
				break;
			case 2:	
				CadastrarFolha.renderizar();
				break;
			case 3:	
				ListarFolhaFuncionario.renderizar();
				break;
			case 4:	
			    ListarTodasFolhas.renderizar();
				break;
			case 0:	
				System.out.println("\nVocê está saindo da aplicação...");			
				break;
			default:
				System.out.println("\nEssa opção não é válida!");
				break;
			}
		} while (opcao != 0);	
	}
}