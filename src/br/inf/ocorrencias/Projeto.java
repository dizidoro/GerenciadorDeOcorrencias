package br.inf.ocorrencias;

public class Projeto {

	private final Id id;
	private String titulo;
	
	public Projeto(Id id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public Id getId() {
		return id;
	}

}
