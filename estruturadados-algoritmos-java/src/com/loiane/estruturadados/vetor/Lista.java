package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Lista <T> {

	private T[] elementos; 
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; //solu??o baseada no Java Efetivo
		this.tamanho = 0;
	}
	
	//Configurando um vetor dinamicamente
	public Lista(int capacidade, Class <T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean adiciona(T elemento){
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;

	}
	//adicionando elementos em determinadas posi??es quaisquer
	//subrecarrecando o metodo adiciona - modificando a sua assinatura
	public boolean adiciona(int posicao, T elemento){
		
		//verificar se a posicao que o usuario est? passando para o m?todo ? valida.
		if (! (posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posi??o ?  inv?lida");
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
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		} 
	//esse codigo s? ? executado quando o vetor atingir a capacidade	
	}

	public T obtem (int posicao) {
		return this.busca(posicao);
	}
	
	//metodo de busca
	
	public T busca(int posicao){
		if (! (posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posi??o ?  inv?lida");
		}
		return this.elementos[posicao];
				
	}
	
	//verificando se o elemento j? existe
	public int busca(T elemento) {
		//busca sequencial
		for (int i=0; i<this.tamanho;i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contem(T elemento) {
		return busca(elemento) > -1;
	}
	
	public int ultimoIndice(T elemento) {
		int ultimaPos = -1;		
		for (int i=this.tamanho-1; i>=0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	//aplicando o metodo para remover um valor do vetor
	
	public void remove (int posicao){
		if (! (posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posi??o ?  inv?lida");
		}
		for (int i=posicao; i<this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void limpar(){
		//opcao 1
		//this.elementos = (T[]) new Objects[this.elementos.length];
		
		//opcao 2
		//this.tamanaho = 0;
		
		//opcao 3
		for (int i=0; i<this.tamanho; i++) {
			this.elementos[i] = null;
			
		}
		this.tamanho = 0;
	}
	
	// modificando o parametro que o metodo remover?
	public void remove (T elemento) {
		int pos = this.busca(elemento);
		if (pos > -1) {
			this.remove(pos);
		} 
	}
	
	//verificando o tamanho do vetor
	
	public int tamanho () {
		return this.tamanho;
	}
		
	@Override
	public String toString () {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		// concatena??o dos elementos
		for (int i=0; i<this.tamanho; i++) {
			s.append( this.elementos[i]);
			s.append(", ");
		}
		// acessando a ?ltima posi??o
		if (this.tamanho<0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(elementos);
		result = prime * result + Objects.hash(tamanho);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VetorObjetos other = (VetorObjetos) obj;
		return Arrays.deepEquals(elementos, other.elementos) && tamanho == other.tamanho;
	}
}
