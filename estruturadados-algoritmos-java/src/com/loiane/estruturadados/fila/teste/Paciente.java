package com.loiane.estruturadados.fila.teste;

public class Paciente {//implements Comparable<Paciente>{
	
	private String nome;
	private int prioridade;
	
	public Paciente(String nome, int prioridade) {
		super();
		this.nome = nome;
		this.prioridade = prioridade;
	}
	
	public Paciente() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	//metodologia de comparacao
	*@Override
	public int compareTo(Paciente o) {
		// obj 1 > obj 2 return > 0 (1)
		// obj 1 < obj 2 return < 0 (-1)
		
		if (this.prioridade > o.getPrioridade()) {
			return 1;
		} else if (this.prioridade < o.getPrioridade()){
			return -1;
		}
		
		return 0;
	}
	

}
