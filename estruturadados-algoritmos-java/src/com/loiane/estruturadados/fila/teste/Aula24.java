package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {

		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
		
		fila.enfileira(new Paciente ("A", 2));
		fila.enfileira(new Paciente ("C", 3));
		fila.enfileira(new Paciente ("C", 2));
		
		System.out.println(fila);
		
	}

}
