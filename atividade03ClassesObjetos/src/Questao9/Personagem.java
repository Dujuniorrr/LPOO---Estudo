package Questao9;

import java.util.Scanner;

public class Personagem {
    static Scanner scanString = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);
    String nome;
    String categoria;
    int vida;
    int ataque;
    int defesa;
    int agilidade;
    int pontos = 9;

    public void visualizarAtributos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vida: " + this.vida);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defesa: " + this.defesa);
        System.out.println("Agilidade: " + this.agilidade);

    }
    public void visualizarPersonagens() throws InterruptedException{
        int op = 0;
        while(op != 4){
            clearConsole();
            System.out.println("======= VISUALIZAR PERSONAGENS =========");
            System.out.println("1 - Arqueiro");
            System.out.println("2 - Guerreiro");
            System.out.println("3 - Mágico");
            System.out.println("4 - Seguir em frente");
            System.out.print("--> Qual deseja visualizar?: ");
            op = scan.nextInt();
            clearConsole();
            switch (op) {
                case 1:
                    System.out.println("==== Arqueiro ======");
                    System.out.println("\n-- VIDA - 50 pontos");
                    System.out.println("\n-- ATAQUE - 6 pontos");
                    System.out.println("\n-- DEFESA - 4 pontos");
                    System.out.println("\n-- AGILIDADE - 8 pontos");
                    Thread.sleep((3000));
                    break;
                
                case 2:
                    System.out.println("==== Guerreiro ======");
                    System.out.println("\n-- VIDA - 50 pontos");
                    System.out.println("\n-- ATAQUE - 8 pontos");
                    System.out.println("\n-- DEFESA - 6 pontos");
                    System.out.println("\n-- AGILIDADE - 4 pontos");
                    Thread.sleep((3000));
                    break;

                case 3:
                    System.out.println("==== Mágico ======");
                    System.out.println("\n-- VIDA - 50 pontos");
                    System.out.println("\n-- ATAQUE - 6 pontos");
                    System.out.println("\n-- DEFESA - 9 pontos");
                    System.out.println("\n-- AGILIDADE - 5 pontos");
                    Thread.sleep((3000));
                    break;
            
                case 4:
                    break;

                default:
                    System.out.println("--> Opção inválida");
                    Thread.sleep((3000));
                    break;
            }
         }
    }

    public void escolherPersonagem() throws InterruptedException{
        boolean valid = false;

        while(valid != true){
            clearConsole();
        System.out.println("====== ESCOLHA SEU PERSONAGEM ======");
        System.out.println("1 - Arqueiro");
        System.out.println("2 - Guerreiro");
        System.out.println("3 - Mágico");
        System.out.print("--> Qual deseja escolher?: ");
        int op = scan.nextInt();
        clearConsole();
        switch (op) {
            case 1:
                this.categoria = "Arqueiro";
                this.ataque = 6;
                this.defesa = 4;
                this.agilidade = 8;
                valid = true;
                break;
            
            case 2:
                this.categoria = "Guerreiro";
                this.ataque = 8;
                this.defesa = 6;
                this.agilidade = 4;
                valid = true;
                break;

            case 3:
                this.categoria = "Mágico";
                this.ataque = 6;
                this.defesa = 9;
                this.agilidade = 5;
                valid = true;
                break;
        
            default:
                System.out.println("--> Opção inválida");
                Thread.sleep(3000);
                break;
        }
        }
        
        this.vida = 50;
        System.out.println("\n--> PERSONAGEM ESCOLHIDO: " + this.categoria);
        System.out.print("--> Informe o nome do jogador: ");
        this.nome = scanString.nextLine();
    }
    

    public void distribuirPontos() throws InterruptedException{
        while(this.pontos > 0){
            clearConsole();
            visualizarAtributos();
            System.out.println("\n--> Você tem: " + this.pontos + " pontos.");
            System.out.println("1 - Ataque");
            System.out.println("2 - Defesa");
            System.out.println("3 - Agilidade");
            System.out.println("-- Escolha um dos atributos para distribuir seus pontos: ");
            int op = scan.nextInt();
            clearConsole();
            System.out.print("-- Quantos pontos deseja adicionar?: ");
            int addPonto = scan.nextInt();
            if(addPonto > pontos){
                System.out.println("\nVocê não possui tantos pontos.");
            }
            else{
                switch (op) {
                    case 1:
                        this.ataque = this.ataque + addPonto;
                        System.out.println("\nAgora o seu ataque tem " + this.ataque + " pontos.");
                        break;
                    
                    case 2:
                        this.defesa = this.defesa + addPonto;
                        System.out.println("\nAgora a sua defesa tem " + this.defesa + " pontos.");
                        break;
    
                    case 3:
                        this.agilidade = this.agilidade + addPonto;
                        System.out.println("\nAgora a sua agilidade tem " + this.agilidade + " pontos.");
                        break;
                
                    default:
                        System.out.println("--> Opção inválida");
                        break;
                }
                pontos = pontos - addPonto;
            }
            Thread.sleep(3000);
        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
