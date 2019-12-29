package controlador;

import java.util.Scanner;
import modelo.Palestrante;

public class MenuPalestrante {

	public void Menu() {
		
	Scanner sc = new Scanner(System.in);
	Palestrante palestrante;
	BancoPalestrante banco = new BancoPalestrante();
	int opcao = 0;
	int subOpcao = 0;
	
	do {
		System.out.println("Escolha uma das opções abaixo!");
		System.out.println("(1)-- Palestrantes");
		System.out.println("(0)-- Sair");
		opcao = sc.nextInt();
		
		if(opcao == 1) {		
			System.out.println("Escolha um sub-opcão a seguir!");
			System.out.println("(1)-- Criar um palestrante");
			System.out.println("(2)-- Mostrar Palestrantes");
			System.out.println("(3)-- Editar um Palestrante");
			System.out.println("(4)-- Remover um palestrante");
			System.out.println("(0)-- Voltar");
			subOpcao = sc.nextInt();
			
			while(subOpcao != 0) {
				
				if(subOpcao == 1){
					
					palestrante = new Palestrante ("", "");					
					System.out.println("Nome: ");
					palestrante.setNome(sc.next());
					System.out.println("CPF: ");
					palestrante.setCpf(sc.next());		
					banco.adicionarPalestrante(palestrante); 
					subOpcao = 0;
					System.out.println();
				}
				
				else if(subOpcao == 2) {
					banco.mostrarPalestrantes();
					System.out.println("(0)-- Voltar ao menu");
					subOpcao = sc.nextInt();
				}
				
				else if(subOpcao == 3){
					System.out.println("Digite a posição do palestrante que deseja editar. *OBS.: A posição começa com 0.");
					System.out.println("*Para saber se o palestrante foi editado, veja a lista.*");
					subOpcao = 0;
					System.out.println();
					System.out.println("(0)-- Voltar ao menu");
					subOpcao = sc.nextInt();
				}
				
				else if(subOpcao == 4){
					System.out.println("Digite as informações do palestrante que deseja remover. *OBS.: A posição começa com 0.");
					
					//banco.remover(palestrante);
					
					System.out.println("*Para saber se o palestrante foi removido, veja a lista.*");
					subOpcao = 0;
					System.out.println();
					System.out.println("(0)-- Voltar ao menu");
					subOpcao = sc.nextInt();
				}
				
			}
		}
	}
	
	while(opcao != 0);
	sc.close();
	}
}
