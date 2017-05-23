package br.inf.ocorrencias;

public class Funcionario {
	
	private final Id id;
	private String nome;
	
	public Funcionario(Id id, String name){
		this.id = id;
		this.nome = name;
	}

	public Id getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object object){
		if(object instanceof Funcionario){
			Funcionario funcionario = (Funcionario) object;
			return id.equals(funcionario.getId());
		}
		return super.equals(object);
	}
	
}
