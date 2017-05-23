package br.inf.ocorrencias.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ocorrencias.Funcionario;
import br.inf.ocorrencias.exception.ExceptionIdMaiorQueUm;

public class TesteFuncionario {

	@Test
	public void diego() throws Exception{
		Funcionario diego = new Funcionario(1, "diego");
		assertEquals("diego", diego.getNome());
	}
	
	@Test
	public void igualdade() throws Exception {
		Funcionario diego1 = new Funcionario(1, "diego");
		Funcionario diego2 = new Funcionario(1, "diego");
		assertNotEquals(diego1, diego2);
	}
	
	@Test(expected=ExceptionIdMaiorQueUm.class)
	public void idMaiorQueUm() {
		Funcionario diego1 = new Funcionario(-1, "diego");
	}
}
