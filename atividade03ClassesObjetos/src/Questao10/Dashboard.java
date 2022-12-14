package Questao10;

import java.util.Scanner;

public class Dashboard {
    static Scanner scanLine = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    boolean found = false;
    int cont;

    public void pesquisar(Cliente cliente[]){
        clearConsole();
        found = false;
        System.out.println("\n-- Digite o nome do cliente que deseja pesquisar");
        String nomeCliente = scan.next();
        for(int i = 0; i < cont; i++){
            if(nomeCliente.equals(cliente[i].getNome())){
                System.out.println("\n- - - - - Resultado Pesquisa - - - - -");
                System.out.println("Nome: " + cliente[i].getNome());
                System.out.println("Idade: " + cliente[i].getIdade());
                System.out.println("ID: " + cliente[i].getId());
                System.out.println("Cupom " + cliente[i].getCupom());
                System.out.println("Carteira " + cliente[i].getCarteira());
                found = true;
            }
        }
        if(found == false){
            System.out.println("\n---- Nenhum cliente encontrado ------");
        }

    }

    public void deletar(Cliente cliente[]){
        found = false;
        System.out.println("\n-- Digite o nome do cliente que deseja deletar: ");
        String nomeCliente = scan.next();
        for(int i = 0; i < cont; i++){
            if(nomeCliente.equals(cliente[i].getNome())){
                cliente[i].setNome(" ");
                cliente[i].setIdade(0);
                cliente[i].setId(0);
                cliente[i].setCupom(0);
                cliente[i].addCarteira(0);
                found = true;
                System.out.println("\n--- Cliente deletado ----");
            }
        }
        if(found == false){
            System.out.println("\n---- Nenhum cliente encontrado ------");
        }
    }

    public void inserir(Cliente cliente[]){
        boolean valid = true;

        while(valid == true){
            clearConsole();
            cliente[cont] = new Cliente();
            System.out.print("-- Digite o nome: ");
            cliente[cont].setNome(scanLine.nextLine());
            System.out.print("-- Digite a idade: ");
            cliente[cont].setIdade(scan.nextInt());
            System.out.print("-- Digite o ID: ");
            cliente[cont].setId(scan.nextInt());
            System.out.print("-- Digite o Cupom: ");
            cliente[cont].setCupom(scan.nextInt());
            System.out.print("-- Digite o dinheiro que o cliente tem: ");
            cliente[cont].addCarteira(scan.nextFloat());
            cont++;
            System.out.println("\n--> Deseja adicionar outro Cliente? [1]> SIM [0]> N??O ");
            int op = scan.nextInt();
            System.out.println("\n");
            switch (op) {
                case 0:
                    valid = false;
                    break;

                case 1:
                    valid = true;
                    break;
            }
        }
    }

    public void alterar(Cliente cliente[]){
        clearConsole();
        found = false;
        System.out.println("\nDigite o nome do cliente que deseja alterar: ");
        String nomeCliente = scan.next();
        for(int i = 0; i < cont; i++){
            if(nomeCliente.equals(cliente[i].getNome())){
                System.out.println("- - - - - - - - ");
                System.out.println("1 - Nome");
                System.out.println("2 - Idade");
                System.out.println("3 - Cupom");
                System.out.println("4 - ID");
                System.out.println("5 - Carteira");
                System.out.println("--> O que deseja alterar?");
                int op = scan.nextInt();
                switch (op) {
                    case 1:
                        Scanner scanLine = new Scanner(System.in);
                        System.out.println("Digite um novo nome: ");
                        cliente[i].setNome(scanLine.nextLine());
                        break;

                    case 2:
                        System.out.println("Digite uma nova idade: ");
                        cliente[i].setId(scan.nextInt());
                        break;

                    case 3:
                        System.out.println("Digite um novo cupom: ");
                        cliente[i].setCupom(scan.nextInt());
                        break;
                    
                    case 4:
                        System.out.println("Digite um novo ID: ");
                        cliente[i].setId(scan.nextInt());
                        break;

                    case 5:
                        System.out.println("Digite um novo valor na carteira: ");
                        cliente[i].addCarteira(scan.nextFloat());
                        break;
                
                    default:
                        break;
                }
                found = true;
            }
        }
        if(found == false){
            System.out.println("\n---- Nenhum cliente encontrado ------");
        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}