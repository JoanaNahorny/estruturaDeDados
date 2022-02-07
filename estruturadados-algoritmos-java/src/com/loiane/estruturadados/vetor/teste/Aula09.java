package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

		vetor.adiciona("B"); //posi��o 0 do vetor
		vetor.adiciona("G"); //posi��o 1 do vetor
		vetor.adiciona("D"); //posi��o 2 do vetor
		vetor.adiciona("E"); 
		vetor.adiciona("F"); 

		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento E");
		
		int pos = vetor.busca("E");
		if (pos >= 0) {
			vetor.remove(pos);
		}else {
			System.out.println("Elemento n�o existe no vetor");

		}

		System.out.println(vetor);
	}

}
