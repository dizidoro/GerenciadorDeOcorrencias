package br.inf.ocorrencias.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ocorrencias.Empresa;
import br.inf.ocorrencias.Funcionario;
import br.inf.ocorrencias.Id;
import br.inf.ocorrencias.exception.ExcecaoFuncionarioJaCadastrado;
import br.inf.ocorrencias.exception.ExcecaoFuncionarioNaoExiste;

public class TesteCadastroFuncionario {

	
	@Test
	public void cadastrarFuncionarioDiego() throws Exception {
		Id id = new Id(1);
		Funcionario diego = new Funcionario(id, "Diego");
		
		Empresa empresa = new Empresa();
		empresa.cadastrar(diego);
		
		assertEquals(diego, empresa.getFuncionario(id));
	}
	
	@Test()
	public void cadastrarDiegoELucas() throws Exception {
		Id idDiego = new Id(1);
		Funcionario diego = new Funcionario(idDiego, "Diego");
		Id idLucas = new Id(2);
		Funcionario lucas = new Funcionario(idLucas, "Lucas");
		
		Empresa empresa = new Empresa();
		empresa.cadastrar(diego);
		empresa.cadastrar(lucas);
		
		assertEquals(diego, empresa.getFuncionario(diego.getId()));
		assertEquals(lucas, empresa.getFuncionario(lucas.getId()));
	}
	
	@Test(expected=ExcecaoFuncionarioJaCadastrado.class)
	public void cadastrarDoisFuncionariosComMesmoId() throws Exception {
		Id id = new Id(1);
		Funcionario funcionario = new Funcionario(id, "Diego");
		Funcionario funcionario2 = new Funcionario(id, "Lucas");
		
		Empresa empresa = new Empresa();
		empresa.cadastrar(funcionario);
		empresa.cadastrar(funcionario2);		
	}
	
	@Test(expected=ExcecaoFuncionarioNaoExiste.class)
	public void pegarFuncionarioNaoCadastrado() throws Exception {
		Id id = new Id(1);
		Funcionario diego = new Funcionario(id, "Diego");
		
		Empresa empresa = new Empresa();
		empresa.getFuncionario(diego.getId());
	}

}
