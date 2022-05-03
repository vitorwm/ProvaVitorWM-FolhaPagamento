package views;

import controllers.FolhaController;
import models.Folha;

public class ListarTodasFolhas {

	private static double total;
	
	public static void renderizar() {	

		System.out.println("\n **** LISTAGEM DE TODAS AS FOLHAS DE PAGAMENTO **** \n");

		for(Folha folhaCad: FolhaController.listarTudo ()) 
		{
			double bruto = FolhaController.calcularSalarioBruto(folhaCad.getHorasTrab(), folhaCad.getValor());
			double ir = FolhaController.calcularIR(bruto);
			double inss = FolhaController.calcularINSS(bruto);
			double fgts = FolhaController.calcularFGTS(bruto);
			double liquido = FolhaController.calcularSalarioLiquido(bruto, ir, inss);

			System.out.println("\nFuncionário: " + folhaCad.getFuncionario().getNome()+
			"\n Data da folha de pagamento: "+ folhaCad.getAno()+ "/" +folhaCad.getMes()+ 
			"\n Salário Bruto: " + bruto + 
			"\n Imposto de renda: " +ir +
			"\n INSS: " +inss +
			"\n FGTS: " + fgts +
			"\n Salário Líquido: " +liquido +"\n\n");
		
			
			total += liquido;
		}
		
		System.out.println("\n O total de todos os Salários Liquidos é: " + total +" Reais");
	}
}