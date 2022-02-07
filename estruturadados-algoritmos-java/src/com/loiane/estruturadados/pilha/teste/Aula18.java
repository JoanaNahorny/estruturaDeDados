package com.loiane.estruturadados.pilha.teste;

import java.util.Stack;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();

		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.isEmpty()); // esta vazio
		System.out.println(stack.size()); // tamanho
		
		System.out.println(stack);
		
		System.out.println(stack.peek()); // espiada de como está o último elemento - topo da pilha
		
		System.out.println(stack.pop()); // desempilha

		System.out.println(stack);
	}

}
