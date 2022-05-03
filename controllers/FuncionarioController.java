package controllers;

import java.util.ArrayList;

import models.Funcionario;

public class FuncionarioController {

	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>(); 

	public static ArrayList<Funcionario> listar() 
    {
		return funcionarios;
	}

	public static boolean cadastrarFunc(Funcionario funcionario) {
		if(buscarCpf(funcionario.getCpf()) == null) 
        {
			funcionarios.add(funcionario);
			return true;
		}
		return false;
	}	

	public static Funcionario buscarCpf(String cpf) {
		for(Funcionario funcCadastrado : funcionarios) 
        {
			if(funcCadastrado.getCpf().equals(cpf)) 
            {
				return funcCadastrado;
			}
		}	
		return null;
	}

}