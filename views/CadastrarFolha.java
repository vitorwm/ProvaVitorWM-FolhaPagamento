package views;

import controllers.FolhaController;
import controllers.FuncionarioController;
import models.Folha;
import models.Funcionario;
import utils.Console;


public class CadastrarFolha {

	private static Funcionario funcionario;
	private static Folha folha;
    private static String cpfFunc;
	
	public static void renderizar() {

		folha = new Folha();
		
		System.out.println("\n-- CADASTRAR FOLHA DE PAGAMENTO --  \n");	
		System.out.println("\nDigite o CPF do funcionário:");			
		cpfFunc = Console.readString();

		funcionario = FuncionarioController.buscarCpf(cpfFunc);

		if(funcionario != null) 
        {	
			folha.setFuncionario(funcionario);
			System.out.println("\nDigite o mês da folha de pagamento:");	
			folha.setMes(Console.readInt());
			System.out.println("\nDigite o ano da folha pagamento:");	
			folha.setAno(Console.readInt());
			System.out.println("\nDigite a quantidade de horas da folha pagamento:");	
			folha.setHorasTrab(Console.readInt());
			System.out.println("\nDigite o valor da hora da folha pagamento:");	
			folha.setValor(Console.readInt());

                if(FolhaController.cadastrarFolha(folha)) 
                {
                    System.out.println("\nFolha de pagamento cadastrada com sucesso!\n");
                }
                
                else {	System.out.println("\nUma folha de pagamento para o mesmo preíodo já foi cadastrada\n");}	

		}else {
			System.out.println("\nNão foi possível encontrar um FUNCIONÁRIO com o CPF digitado\n");
		}
	}
}