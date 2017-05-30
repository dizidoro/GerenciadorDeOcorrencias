package br.inf.ocorrencias.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ocorrencias.Funcionario;
import br.inf.ocorrencias.Id;
import br.inf.ocorrencias.exception.ExcecaoIdMenorQueUm;

public class TesteFuncionario {

	@Test
	public void funcionarioDiego() throws Exception{
		Id id = new Id(1);
		Funcionario diego = new Funcionario(id, "diego");
		assertEquals("diego", diego.getNome());
		assertEquals(id, diego.getId());
	}
	
	@Test
	public void igualdade() throws Exception {
		Id id = new Id(1);
		Funcionario diego1 = new Funcionario(id, "diego");
		Funcionario diego2 = new Funcionario(id, "filipe");
		assertEquals(diego1, diego2);
	}
	
	@Test
	public void igualdadeNomesIguais() throws Exception {
		Id idDiego = new Id(1);
		Id idFilipe = new Id(2);

		Funcionario diego = new Funcionario(idDiego, "diego");
		Funcionario filipe = new Funcionario(idFilipe, "filipe");
		
		assertNotEquals(diego, filipe);
	}
	
}
