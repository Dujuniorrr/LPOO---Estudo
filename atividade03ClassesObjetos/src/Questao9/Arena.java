package Questao9;

import java.util.Random;
import java.util.Scanner;

public class Arena {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public void mostrarStatus(Personagem jogador1, Personagem jogador2){
        clearConsole();
        System.out.print("Jogador 1: " + jogador1.nome + " - Categoria: " + jogador1.categoria);
        System.out.print("                        ");
        System.out.print("Jogador 2: " + jogador2.nome + " - Categoria: " + jogador2.categoria);
        System.out.print("\nVida ========== " + jogador1.vida);
        System.out.print("                                             ");
        System.out.print("Vida ========== " + jogador2.vida);
        System.out.print("\nCategoria: " + jogador1.categoria);
        System.out.print("                                             ");
        System.out.print("Categoria: " + jogador2.categoria);
        System.out.print("\nAtaque: " + jogador1.ataque);
        System.out.print("                                                     ");
        System.out.print("Ataque: " + jogador2.ataque);
        System.out.print("\nDefesa: " + jogador1.defesa);
        System.out.print("                                                       ");
        System.out.print("Defesa: " + jogador2.defesa);
        System.out.print("\nAgilidade: " + jogador1.agilidade);
        System.out.print("                                                  ");
        System.out.print("Agilidade: " + jogador2.agilidade);
        System.out.println("\n");
    }

    public void escolherCenario(Personagem jogador1, Personagem jogador2) throws InterruptedException{
        int op = random.nextInt(3);
        clearConsole();
        switch (op) {
            case 0:
                if(jogador1.categoria.equals("Guerreiro")){
                    jogador1.agilidade = jogador1.agilidade + 3; 
                }
                else if(jogador2.categoria.equals("Guerreiro")){
                    jogador2.agilidade = jogador2.agilidade + 3; 
                }
                System.out.println("Cénario sorteado: Castelo");
                System.out.println("--- Neste cenário, guerreiros ganham +3 de agilidade.\nPois é um ambiente do qual tal categoria tem muito conhecimento, \nsabendo se locomver por ele com mais facilidade.");
                break;
            
            case 1:
                if(jogador1.categoria.equals("Mágico")){
                    jogador1.ataque = jogador1.ataque + 3; 
                }
                else if(jogador2.categoria.equals("Mágico")){
                    jogador2.ataque = jogador2.ataque + 3; 
                }
                System.out.println("Cénario sorteado: Floresta");
                System.out.println("--- Neste cenário, mágicos ganham +3 de ataque.\nAs florestas são o ambiente natural de um mágico, ele consegue se conectar com os \nespiritos da natureza e concentrar mais poder.");
                break;
            
            case 2:
                if(jogador1.categoria.equals("Arqueiro")){
                    jogador1.ataque = jogador1.ataque + 3; 
                }
                else if(jogador2.categoria.equals("Arqueiro")){
                    jogador2.ataque = jogador2.ataque + 3; 
                }
                System.out.println("Cénario sorteado: Campos de capim");
                System.out.println("--- Neste cenário, arqueiros ganham +3 de ataque.\nOs campos são locais abertos, onde o oponente não pode se esconder de sua mira");
                break;
        }
        Thread.sleep(6000);
    }

    public void realizarBatalha(Personagem jogador1, Personagem jogador2) throws InterruptedException{
        int dano;
        int atk1, atk2, dfs1, dfs2, desv1, desv2;
        while(jogador1.vida > 0 && jogador2.vida > 0){
            mostrarStatus(jogador1, jogador2);
            System.out.println("\n--> Jogador 1 - " + jogador1.nome + ": ");
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("3 - Desviar");
            System.out.print("--> Escolha: ");
            int op1 = scan.nextInt();

            System.out.println("\n--> Jogador 2 - " + jogador2.nome + ": ");
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("3 - Desviar");
            System.out.print("--> Escolha: ");
            int op2 = scan.nextInt();

            if(op1 == 1 && op2 == 1){
                atk1 = random.nextInt(1, (jogador1.ataque + 1));
                atk2 = random.nextInt(1, (jogador2.ataque + 1));
                System.out.println("\nAtaque do jogador 1: " + atk1 + "\n x " + "\nAtaque do jogador 2: " + atk2);
                if(atk1 > atk2){
                    dano = atk1 - atk2;
                    jogador2.vida = jogador2.vida - dano;
                    System.out.println("\nO jogador 2 sofreu " + dano + " de dano.");
                }
                else if(atk1 < atk2){
                    dano = atk2 - atk1;
                    jogador1.vida = jogador1.vida - dano;
                    System.out.println("\nO jogador 1 sofreu " + dano + " de dano.");
                }
                else{
                    System.out.println("\nNenhum jogador sofreu dano");
                }
            }
            else if(op1 == 1 && op2 == 2){
                atk1 = random.nextInt(1, (jogador1.ataque + 1));
                dfs2 = random.nextInt(1, (jogador2.defesa + 1));
                System.out.println("\nAtaque do jogador 1: " + atk1 + "\n x " + "\nDefesa do jogador 2: " + dfs2);
                if(atk1 > dfs2){
                    dano = atk1 - dfs2;
                    jogador2.vida = jogador2.vida - dano;
                    System.out.println("\nO jogador 2 sofreu " + dano + " de dano.");
                }
                else if(atk1 < dfs2){
                    System.out.println("\nO jogador 2 conseguiu se defender.");
                }
                else{
                    System.out.println("\nNenhum jogador sofreu dano");
                }
            }
            else if(op1 == 1 && op2 == 3){
                atk1 = random.nextInt(1, (jogador1.ataque + 1));
                desv2 = random.nextInt(1, (jogador2.agilidade + 1));
                System.out.println("\nAtaque do jogador 1: " + atk1 + "\n x " + "\nAgilidade do jogador 2: " + desv2);
                if(atk1 > desv2){
                    dano = atk1;
                    jogador2.vida = jogador2.vida - dano;
                    System.out.println("\nO jogador 2 sofreu " + dano + " de dano.");
                }
                else if(atk1 < desv2){
                    dano = desv2 - atk1;
                    jogador1.vida = jogador1.vida - dano;
                    System.out.println("\nO jogador 2 conseguiu desviar do ataque, o jogador 1 se atrapalhou com seu ataque e sofreu " + dano + " de dano.");
                }
                else{
                    System.out.println("\nNenhum jogador sofreu dano");
                }
            }
            if(op1 == 2 && op2 == 1){
                dfs1 = random.nextInt(1, (jogador1.defesa + 1));
                atk2 = random.nextInt(1, (jogador2.ataque + 1));
                System.out.println("\nDefesa do jogador 1: " + dfs1 + "\n x " + "\nAtaque do jogador 2: " + atk2);
                if(dfs1 < atk2){
                    dano = dfs1 - atk2;
                    jogador1.vida = jogador1.vida - dano;
                    System.out.println("\nO jogador 1 sofreu " + dano + " de dano.");
                }
                else if(dfs1 > atk2){
                    System.out.println("\nO jogador 1 conseguiu se defender.");
                }
                else{
                    System.out.println("\nNenhum jogador sofreu dano");
                }
            }
            else if(op1 == 2 && op2 == 2){
                dfs1 = random.nextInt(1, (jogador1.defesa + 1));
                dfs2 = random.nextInt(1, (jogador2.defesa + 1));
                System.out.println("\nDefesa do jogador 1: " + dfs1 + "\n x " + "\nDefesa do jogador 2: " + dfs2);
                System.out.println("\nNenhum jogador sofreu dano");
            }
            else if(op1 == 2 && op2 == 3){  
                dfs1 = random.nextInt(1, (jogador1.defesa + 1));
                desv2 = random.nextInt(1, (jogador2.agilidade + 1));
                System.out.println("\nDefesa do jogador 1: " + dfs1 + "\n x " + "\nDefesa do jogador 2: " + desv2);
                System.out.println("\nNenhum jogador sofreu dano");
            }
            if(op1 == 3 && op2 == 1){
                desv1 = random.nextInt(1, (jogador1.agilidade + 1));
                atk2 = random.nextInt(1, (jogador2.ataque + 1));
                System.out.println("\nAtaque do jogador 1: " + desv1 + "\n x " + "\nAgilidade do jogador 2: " + atk2);
                if(atk2 > desv1){
                    dano = atk2;
                    jogador1.vida = jogador1.vida - dano;
                    System.out.println("\nO jogador 1 sofreu " + dano + " de dano.");
                }
                else if(atk2 < desv1){
                    dano = desv1 - atk2;
                    jogador2.vida = jogador2.vida - dano;
                    System.out.println("\nO jogador 1 conseguiu desviar do ataque, o jogador 2 se atrapalhou com seu ataque e sofreu " + dano + " de dano.");
                }
                else{
                    System.out.println("\nNenhum jogador sofreu dano");
                }
            }
            else if(op1 == 3 && op2 == 2){
                desv1 = random.nextInt(1, (jogador1.agilidade + 1));
                dfs2 = random.nextInt(1, (jogador2.defesa + 1));
                System.out.println("\nDefesa do jogador 1: " + desv1 + "\n x " + "\nDefesa do jogador 2: " + dfs2);
                System.out.println("\nNenhum jogador sofreu dano");
            }
            else if(op1 == 3 && op2 == 3){
                desv1 = random.nextInt(1, (jogador1.agilidade + 1));
                desv2 = random.nextInt(1, (jogador2.agilidade + 1));
                System.out.println("\nDefesa do jogador 1: " + desv1 + "\n x " + "\nDefesa do jogador 2: " + desv2);
                System.out.println("\nNenhum jogador sofreu dano");
            }
            Thread.sleep(3000);
        }
        if(jogador1.vida > 0){
            System.out.println("\nJogador 1 - " + jogador1.nome + " venceu!!!");
        }
        else if(jogador2.vida > 0){
            System.out.println("\nJogador 2 - " + jogador2.nome + " venceu!!!");
        }
    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
