package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer01 {
	
public static void main(String[] args) {


	Pilha<Integer> pilha = new Pilha<Integer>();

	Scanner scan = new Scanner(System.in);
	
	for (int i=1; i<=10; i++){

		System.out.println("Entre com um n?mero: ");

		int num = scan.nextInt();
		
		if (num %2 == 0) {
			
			System.out.println("Empilhando n?mero " + num);
			
			pilha.empilha(num);
			
		} else {
			
			Integer desempilhado = pilha.desempilha();
			
			if (desempilhado == null) {
				System.out.println("Pilha est? vazia");
			} else {
				System.out.println("N?mero ?mpar desempilhado um elemento da pilha: " 
						+ desempilhado);
			}
		}
	}
	
	
	System.out.println("Todos os n?meros foram lidos. Desempilhando o n?meros da pilha");
	
	while (!pilha.estaVazia()) {
		
		Integer desempilhado = pilha.desempilha();
		
		if (desempilhado == null) {
			System.out.println("Pilha est? vazia");
		} else {
			System.out.println("Desempilhado um elemento da pilha: " 
					+ pilha.desempilha());
		}
		
		
	}
	
	System.out.println("Todos foram desempilhados"); 
	
	}
	
}	
