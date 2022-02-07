package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.Lista;

public class Exer02 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("B");
		
		//o último lugar em que apareceu o elemento
		System.out.println(arrayList.lastIndexOf("B"));
		
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("B");
		
		System.out.println(lista.ultimoIndice("B"));
		
	}

}
