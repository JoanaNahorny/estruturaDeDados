package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exer06 {

	public static void main(String[] args) {

		//criacao e declaracao das variaveis
		Scanner scan = new Scanner(System.in);
		
		//criacao do vetor com 20 capacidade
		Lista<Contato> lista = new Lista<Contato>(20);
		
		//criacao e adicao de contatos
		criarContatosDinamicamente(5, lista);
		
		//criacao do menu para o usuario
		int opcao = 1;
		
		while (opcao != 0) {
			
			opcao = obterOpcaoMenu(scan);
			
			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3: 
				obtemContatoPosicao(scan, lista);
				break;
			case 4:
				obtemContato(scan, lista);
				break;
			case 5:
				pesquisarUltimoIndice(scan, lista);				
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				obterTamanhoVetor(lista);
				break;
			case 10:
				excluirTodosContatos(lista);
				break;
			case 11:
				imprimeVetor(lista);
				break;
			default:
				break;
			}

		}
		
		System.out.println("Usu�rio digitou 0, progama terminado.");
	}
	
	private static void imprimeVetor(Lista<Contato> lista) {
		
		System.out.println(lista);

	}
	
	private static void excluirTodosContatos(Lista<Contato> lista) {
		
		lista.limpar();
		
		System.out.println("Todos os contatos do Vetor foram exclu�dos");
	
	}
	
	private static void obterTamanhoVetor(Lista<Contato> lista) {
		
		System.out.println("O tamanho do vetor � de:" + lista.tamanho());
	
	}
	
	private static void excluirContato(Scanner scan, Lista<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posi��o para excluir", scan);
		
		try {
			
			Contato contato = lista.busca(pos);

			lista.remove(contato);
			System.out.println("Contato exclu�do");
			
		} catch (Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posi��o para excluir", scan);
		
		try {
			
			lista.remove(pos);
			System.out.println("Contato exclu�do");
			
		} catch (Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = lista.busca(pos);
			
			boolean existe = lista.contem(contato);
			
			if (existe) {
				System.out.println("Contato existente:");
				System.out.println(contato);
			} else {
				System.out.println("Contato n�o exixstente.");
			}
			
			
		} catch (Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = lista.busca(pos);
			
			System.out.println("Contato existente:");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do �ltimo �ndice do contato encontrado.");
			pos = lista.ultimoIndice(contato);
			
			System.out.println("Contato encontrado no �ndice " + pos);
			
		} catch (Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void obtemContato(Scanner scan, Lista<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a informa��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = lista.busca(pos);
			
			System.out.println("Contato existente:");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do contato encontrado.");
			pos = lista.busca(contato);
			
			System.out.println("Contato encontrado na posi��o " + pos);
			
		} catch (Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
		
		int pos = leInformacaoInt("Entre com a informa��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = lista.busca(pos);
			System.out.println("Contato existente:");
			System.out.println(contato);
			
		} catch (Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
		
		System.out.println("Criando um contato. Entre com as informa��es:");
		String nome = leInformacao("Entre com o nome: ", scan);
		String telefone = leInformacao("Entre com o numero: ", scan);
		String email = leInformacao("Entre com o email: ", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		lista.adiciona(contato);
		
		System.out.println("Contato adicionado com sucesso!");
		
		System.out.println(contato);
	}
	
	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
		
		System.out.println("Criando um contato. Entre com as informa��es:");
		String nome = leInformacao("Entre com o nome: ", scan);
		String telefone = leInformacao("Entre com o numero: ", scan);
		String email = leInformacao("Entre com o email: ", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		int pos = leInformacaoInt("Entre com a posicao a adicionar o contato:", scan);
		
		try {
			lista.adiciona(pos, contato);
			
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
			
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida. Contato N�O adicionado.");
		}				
		
	}
	
	protected static String leInformacao(String msg, Scanner scan) {
		
		System.out.println(msg);
		String entrada = scan.nextLine();
		
		return entrada;
	}
	
	protected static int leInformacaoInt(String msg, Scanner scan) {
		
		boolean entradaValida = false;
		int num = 0;
		
		while (!entradaValida) {
			
			try {
				
				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);
				
				entradaValida = true;
				
			} catch (Exception e){
				System.out.println("Entrada inv�lida. Difite novamente");
			}			
		}
		
		return num;
	}
	
	protected static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;
		
		while (!entradaValida){
			System.out.println("Digite a op��o desejada:");
			System.out.println("Op�ao 1: Add contato no final do vetor");
			System.out.println("Op�ao 2: Add contato em uma posi��o espec�fica");
			System.out.println("Op�ao 3: Obt�m contato de uma posi��o espec�fica ");
			System.out.println("Op�ao 4: Consulta contato");
			System.out.println("Op�ao 5: Consulta o �ltimo �ndice");
			System.out.println("Op�ao 6: Verifica se o contato j� existe");
			System.out.println("Op�ao 7: Excluir por posi��o");
			System.out.println("Op�ao 8: Excluir contato");
			System.out.println("Op�ao 9: Verificar tamanho do vetor");
			System.out.println("Op�ao 10: Excluir todos os contatos do vetor");
			System.out.println("Op�ao 11: Imprime vetor");
			System.out.println("0: sair");
			
			try {
				
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}
				
			} catch (Exception e) {
				System.out.println("Entrada inv�lida. Digite novamente.\n\n\n");
			}
			
			
		}
				
		return opcao;
	}
	
	protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		
		Contato contato; 
		
		for (int i=1; i<=quantidade; i++) {
			
			contato = new Contato ();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111" + i);
			contato.setEmail("contato" + i + "@email.com");
			
			lista.adiciona(contato);
		}
		
	}

}
