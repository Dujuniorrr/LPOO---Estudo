package Questao1;

import java.util.Scanner;

public class Executa {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Livro livro = new Livro();

		int valid = 1;
		while(valid == 1){
			clearConsole();
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Visualizar Informações do Livro");
			System.out.println("3 - Ler livro");
			System.out.println("4 - Escrever Livro");
			System.out.println("5 - Sair");
			System.out.print(">> O que deseja fazer? ");
			int op = scan.nextInt();
			switch(op){
				case 1:
					livro.cadastrarLivro();
					break;

				case 2:
					livro.visualizarLivro();
					break;

				case 3:
					livro.lerLivro();
					break;
				
				case 4:
					livro.escreverLivro();
					break;
				
				case 5:
					valid = 0;
					break;
				
				default:
					System.out.println("Opção inválida");
					Thread.sleep(3000);
					break;
			}
		}
	}

	public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
