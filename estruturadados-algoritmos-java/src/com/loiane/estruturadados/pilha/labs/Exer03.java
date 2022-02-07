package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer03 {

	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<Livro>(20);
		
		Livro livro1 = new Livro();
		livro1.setNome("Learning JavaScript Data Structures and Algorithms");
		livro1.setAutor("Loiane Groner");
		livro1.setAnoLancamento(2016);
		livro1.setIsbn("1785285491");
		
		Livro livro2 = new Livro();
		livro2.setNome("Learning JavaScript Data Structures and Algorithms");
		livro2.setAutor("Loiane Groner");
		livro2.setAnoLancamento(2018);
		livro2.setIsbn("1788623878");
		
		Livro livro3 = new Livro();
		livro3.setNome("JavaScript Regular Expressions");
		livro3.setAutor("Loiane Groner");
		livro3.setAnoLancamento(2015);
		livro3.setIsbn("978-1783282258");
		
		Livro livro4 = new Livro();
		livro4.setNome("Mastering Ext JS");
		livro4.setAutor("Loiane Groner");
		livro4.setAnoLancamento(2015);
		livro4.setIsbn("978-1784390457");
		
		System.out.println("Pilha de livros criada. A pilha esá vazia? " + pilha.estaVazia());
		
		System.out.println("Empilhando livros na pilha:");
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		
		System.out.println(pilha.tamanho() + " livros foram empilhados");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criada. A pilha esá vazia? " + pilha.estaVazia());
		System.out.println("Espiando o topo da pilha " + pilha.topo());
		
		System.out.println("Desempilhando livros da pilha");
		
		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando livros: " + pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados");
		System.out.println(pilha);

	}

}
