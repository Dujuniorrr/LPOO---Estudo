package Questao10;

import java.util.Scanner;

public class Executa {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Cliente[] cliente = new Cliente[100];
        Dashboard painel = new Dashboard();
        boolean valid = true;

        while(valid == true){
            Thread.sleep(2000);
            clearConsole();
            System.out.println("- - - - - MENU - - - -- -");
            System.out.println("1 - Inserir Cliente");
            System.out.println("2 - Alterar Cliente");
            System.out.println("3 - Pesquisar Cliente");
            System.out.println("4 - Deletar Cliente");
            System.out.print("-- Escolha: ");
            int op = scan.nextInt();
            
            
            switch (op) {
                case 1:
                    painel.inserir(cliente);
                    break;
                
                case 2:
                    painel.alterar(cliente);
                    break;
                
                case 3:
                    painel.pesquisar(cliente);
                    break;

                case 4:
                    painel.deletar(cliente);
                    break;

                case 5:
                    System.out.println("- - - - Volte sempre - - - -");
                    valid = false;
                    break;

                default:
                    System.out.println("- - - - Digite uma opção válida - - - -");
                    break;
            }
        }
    }

    //limpa a tela
    public static void clearConsole(){
    System.out.print("Everything on the console will cleared");
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
}
