package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {


		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B"); //posi��o 0 do vetor
		vetor.adiciona("C"); //posi��o 1 do vetor
		vetor.adiciona("E"); //posi��o 2 do vetor
		vetor.adiciona("F"); 
		vetor.adiciona("G"); 
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		
		System.out.println(vetor);
		
		vetor.adiciona(3, "D");
		
		System.out.println(vetor);
		
	}

}
