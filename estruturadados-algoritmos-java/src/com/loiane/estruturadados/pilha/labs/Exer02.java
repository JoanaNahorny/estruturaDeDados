package com.loiane.estruturadados.pilha.labs;

import java.util.Scanner;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		for (int i=1; i<=10; i++){
			
			System.out.println("Entre com um n?mero: ");

			int num = scan.nextInt();

			if (num == 0) {
				
				//pilha de n?meros pares
				
				Integer desempilhado = par.desempilha();
				
				if (desempilhado == null) {
					System.out.println("A pilha est? vazia");
				} else {
					System.out.println("Desempilhando 0 da pilha par");
				
				}
					
				// pilha de n?meros ?mpares
				
				desempilhado = impar.desempilha();
				
				if (desempilhado == null) {
					System.out.println("A pilha est? vazia");
				} else {
					System.out.println("Desempilhando 0 da pilha ?mpar");
				
				}
				
			} else if (num %2 == 0) {
				System.out.println("N?mero par empilhando na pilha par");

				par.empilha(num);
				
			} else {
				System.out.println("N?mero ?mpar empilhando na pilha ?mpar");

				impar.empilha(num);
			}
		}
		
		System.out.println("Desempilhando todos os n?meros da pilha ?MPAR");
		
		while (!impar.estaVazia()) {
			
			System.out.println("Desempilhando a pilha ?mpar "  + impar.desempilha()); 
		}
		
		System.out.println("Desempilhando todos os n?meros da pilha PAR");
		while (!par.estaVazia()) {
			System.out.println("Desempilhando a pilha par " + par.desempilha()); 
		}
		
	}

}
