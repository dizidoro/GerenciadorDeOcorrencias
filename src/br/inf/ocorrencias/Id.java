package br.inf.ocorrencias;

import br.inf.ocorrencias.exception.ExcecaoIdMenorQueUm;

public class Id {

	private Integer number;
	
	public Id(Integer number) {
		if(number < 1){
			throw new ExcecaoIdMenorQueUm();
		}
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Id){
			Id aComparar = (Id) obj;
			return number.equals(aComparar.getNumber());
		}
		
		return super.equals(obj);
	}
	
}
