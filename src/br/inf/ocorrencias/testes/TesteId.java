package br.inf.ocorrencias.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ocorrencias.Funcionario;
import br.inf.ocorrencias.Id;
import br.inf.ocorrencias.exception.ExcecaoIdMenorQueUm;

public class TesteId {

	@Test(expected=ExcecaoIdMenorQueUm.class)
	public void idMaiorQueUm() {
		Id id = new Id(-1);
	}

}
