package views;

import controllers.FolhaController;
import models.Folha;
import utils.Console;

public class ListarFolhaFuncionario {

	private static String cpfFunc;
	private static int ano, mes;
	private static Folha folha;

	public static void renderizar() {		
		System.out.println("\n-- LISTAR FOLHA DE PAGAMENTO DO FUNCIONÁRIO --  \n");	

		System.out.println("\nDigite o CPF do funcionário:");			
		cpfFunc = Console.readString();

		System.out.println("\nDigite o MÊS da folha de pagamento:");
		mes = Console.readInt();

		System.out.println("\nDigite o ANO da folha de pagamento:");	
		ano = Console.readInt();

		folha = FolhaController.buscarFuncMesAno(cpfFunc, mes, ano);

		if(folha != null)
         {
            double bruto, ir, inss, fgts, liquido;

			bruto = FolhaController.calcularSalarioBruto(folha.getHorasTrab(), folha.getValor());
			ir = FolhaController.calcularIR(bruto);
			inss = FolhaController.calcularINSS(bruto);
			fgts = FolhaController.calcularFGTS(bruto);
			liquido = FolhaController.calcularSalarioLiquido(bruto, ir, inss);

			System.out.println("\nSalário Bruto: " + bruto +
		    "\nImposto de Renda: " + ir +
			"\nINSS: " + inss +
			"\nFGTS: " + fgts +
			"\nSalário Líquido: " + liquido);
		}
        
        else 
        {
			System.out.println("\nNão foi possível encontrar a Folha de Pagamento digitada!\n");	
		}

	}
}