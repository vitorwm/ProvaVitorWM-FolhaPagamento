package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {
	
	private static Funcionario funcionario;	
	
	public static void renderizar() {

		funcionario = new Funcionario();
		System.out.println("\n-- CADASTRAR FUNCIONÁRIO --  \n");

		System.out.println("\nDigite o nome do funcionário:");	
		funcionario.setNome(Console.readString());		

		System.out.println("\nDigite o CPF do funcionário:");	
		funcionario.setCpf(Console.readString());				
		
		if(FuncionarioController.cadastrarFunc(funcionario)) {
			System.out.println("\nFuncionário cadastrado com sucesso!\n");
		}else {
			System.out.println("\nUm FUNCIONÁRIO com o mesmo CPF já está cadastrado!\n");
		}
	}
}