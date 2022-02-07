package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula11Lista {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato ("Contato 1", "1234567", "contato1@email.com");
		
		vetor.adiciona(c1);
		
	}
}
