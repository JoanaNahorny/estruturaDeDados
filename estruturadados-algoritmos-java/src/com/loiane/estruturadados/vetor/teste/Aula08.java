package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula08 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

		vetor.adiciona("B"); //posição 0 do vetor
		vetor.adiciona("C"); //posição 1 do vetor
		vetor.adiciona("E"); //posição 2 do vetor
		vetor.adiciona("F"); 
		vetor.adiciona("G"); 
		
		System.out.println(vetor);
		
	}

}
