package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer06 {

	public static void main(String[] args) {

		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()][]()()}");
		imprimeResultado("{[(]}[({()})");
		imprimeResultado("A + B + C - D");
		imprimeResultado("{[()]}");
		imprimeResultado("([{}])");

		
	}
	
	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " est? balanceada? " + 
				verificaSimbulosBalanceados(expressao));
	}
	
	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	
	public static boolean verificaSimbulosBalanceados(String expressao) {
		
		boolean balanceada = true;
		
		Pilha<Character> pilha = new Pilha<Character>();
		
		int index = 0;
		char simbulo, topo;
		
		while (index < expressao.length()) {
			simbulo = expressao.charAt(index);
			
			if (ABRE.indexOf(simbulo) > -1) {
				pilha.empilha(simbulo);
				
			} else if (FECHA.indexOf(simbulo) > -1) {
				if (pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();
					
					if (ABRE.indexOf(topo) == FECHA.indexOf(simbulo)) {
						return false;
					}
				}
				
			}
			
			index++;
		}
		
		return true;
	}

}
