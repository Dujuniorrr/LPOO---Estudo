package Questao9;

public class Executa {
    public static void main(String[] args) throws Exception {
       Personagem person1 = new Personagem();
       Personagem person2 = new Personagem();
       Arena arena = new Arena();

       clearConsole();
       System.out.println("---------- Jogador 1 ------------");
       Thread.sleep(1500);
       person1.visualizarPersonagens();
       person1.escolherPersonagem();
       person1.distribuirPontos();

       clearConsole();
       System.out.println("---------- Jogador 2 ------------");
       Thread.sleep(1500);
       person2.visualizarPersonagens();
       person2.escolherPersonagem();
       person2.distribuirPontos();

       clearConsole();
       System.out.println("---------- Arena ------------");
       Thread.sleep(1500);
       arena.escolherCenario(person1, person2);
       arena.realizarBatalha(person1, person2);

    }

    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

