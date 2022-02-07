package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer04 {

	public static void main(String[] args) {

		Stack<Livro> stack = new Stack<Livro>();
		
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
		
		System.out.println("Pilha de livros criada. A pilha esá vazia? " + stack.isEmpty());
		
		System.out.println("Empilhando livros na pilha:");
		stack.push(livro1);
		stack.push(livro2);
		stack.push(livro3);
		stack.push(livro4);
		
		System.out.println(stack.size() + " livros foram empilhados");
		System.out.println(stack);
		
		System.out.println("Pilha de livros criada. A pilha esá vazia? " + stack.isEmpty());
		System.out.println("Espiando o topo da pilha " + stack.peek());
		
		System.out.println("Desempilhando livros da pilha");
		
		while (!stack.isEmpty()) {
			System.out.println("Desempilhando livros: " + stack.pop());
		}
		
		System.out.println("Todos os livros foram desempilhados");
		System.out.println(stack);

	}

}
