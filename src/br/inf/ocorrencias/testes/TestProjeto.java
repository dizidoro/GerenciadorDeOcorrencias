package br.inf.ocorrencias.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ocorrencias.Id;
import br.inf.ocorrencias.Projeto;

public class TestProjeto {

	@Test
	public void criarProjetoDoSiteDaPizzaria() {
		Id id = new Id(1);
		Projeto projetoDaPizzaria = new Projeto(id, "Pizza na Pedra");
		assertEquals("Pizza na Pedra", projetoDaPizzaria.getTitulo());
		assertEquals(id, projetoDaPizzaria.getId());
	}
	
	@Test
	public void igualdadeDeProjetosComMesmoId() {
		Id id = new Id(1);
		Projeto projeto1 = new Projeto(id, "Projeto");
		Projeto projeto2 = new Projeto(id, "Projeto");
		assertEquals(projeto1, projeto1);
	}
	
	@Test
	public void igualdadeDeProjetosComMesmoNomeEIdsDiferentes() {
		Id idProjeto1 = new Id(1);
		Id idProjeto2 = new Id(2);

		Projeto projeto1 = new Projeto(idProjeto1, "Projeto");
		Projeto projeto2 = new Projeto(idProjeto2, "Projeto");
		
		assertNotEquals(projeto1, projeto1);
	}

}
