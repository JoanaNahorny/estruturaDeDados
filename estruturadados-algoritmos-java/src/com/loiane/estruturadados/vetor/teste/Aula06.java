package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {


		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1"); //posi��o 0 do vetor
		vetor.adiciona("elemento 2"); //posi��o 1 do vetor
		vetor.adiciona("elemento 3"); //posi��o 2 do vetor
		
		System.out.println(vetor.busca("elemento 4"));
		
	}

}
