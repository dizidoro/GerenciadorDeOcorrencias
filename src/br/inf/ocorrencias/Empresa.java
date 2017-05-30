package br.inf.ocorrencias;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.inf.ocorrencias.exception.ExcecaoFuncionarioJaCadastrado;
import br.inf.ocorrencias.exception.ExcecaoFuncionarioNaoExiste;

public class Empresa {
	
	Map<Id, Funcionario> funcionarios;
	
	public Empresa(){
		funcionarios = new HashMap<>();
	}
	
	public void cadastrar(Funcionario funcionario) throws ExcecaoFuncionarioJaCadastrado {
		if(!funcionarios.containsKey(funcionario.getId()))
			funcionarios.put(funcionario.getId(), funcionario);
		
		throw new ExcecaoFuncionarioJaCadastrado();
	}

	public Funcionario getFuncionario(Id id) {
		if(funcionarios.containsKey(id)){
			return funcionarios.get(id);
		}
		
		throw new ExcecaoFuncionarioNaoExiste();
	}
	
}
