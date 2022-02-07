package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos; 
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	//adicionamento valores no vetor
	
	/*public void adiciona(String elemento) {
		for (int i = 0; i<elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

	//identificando qual a �ltima posi��o utilizada no vetor
	
	public void adiciona(String elemento) throws Exception {
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception ("N�o � poss�vel adicionar mais elementos");
		}
		
	}*/
	
	public boolean adiciona(String elemento){
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;

	}
	//adicionando elementos em determinadas posi��es quaisquer
	//subrecarrecando o metodo adiciona - modificando a sua assinatura
	public boolean adiciona(int posicao, String elemento){
		
		//verificar se a posicao que o usuario est� passando para o m�todo � valida.
		if (! (posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posi��o �  inv�lida");
		}
		
		this.aumentaCapacidade();
		
		// movendo todos os elementos
		for (int i=this.tamanho; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	//aumentando a capacidade do vetor
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		} 
	//esse codigo s� � executado quando o vetor atingir a capacidade	
	}
	
	
	//metodo de busca
	
	public String busca(int posicao){
		if (! (posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posi��o �  inv�lida");
		}
		return this.elementos[posicao];
				
	}
	
	//verificando se o elemento j� existe
	public int busca(String elemento) {
		//busca sequencial
		for (int i=0; i<this.tamanho;i++) {
			if (this.elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	//aplicando o metodo para remover um valor do vetor
	public void remove (int posicao){
		if (! (posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posi��o �  inv�lida");
		}
		for (int i=posicao; i<this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	//verificando o tamanho do vetor
	
	public int tamanho () {
		return this.tamanho;
	}
		
	@Override
	public String toString () {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		// concatena��o dos elementos
		for (int i=0; i<this.tamanho; i++) {
			s.append( this.elementos[i]);
			s.append(", ");
		}
		// acessando a �ltima posi��o
		if (this.tamanho<0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
	}
}
