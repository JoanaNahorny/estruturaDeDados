package com.loiane.estruturadados.base;

public class EstruturaEstatica<T> {

	protected T[] elementos; 
	protected  int tamanho;
	
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade]; //solu??o baseada no Java Efetivo
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	protected boolean adiciona(T elemento){
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;

	}
	
	protected boolean adiciona(int posicao, T elemento){
		
		if (! (posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posi??o ?  inv?lida");
		}
		
		this.aumentaCapacidade();
		
		for (int i=this.tamanho; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	protected void remove (int posicao) {
		
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi??o inv?lida");
		}
		for (int i=posicao; i<tamanho-1; i++) {
			elementos[i] = elementos[i+1];
			
		}
		tamanho --;
	}
	
	protected void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		} 
	}

	public T obtem (int posicao) {
		return this.obtem(posicao);
	}
	
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
}
