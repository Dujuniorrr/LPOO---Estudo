package Questao02;

public class Executa {
    public static void main(String[] args) {

        // instanciando um vetor de objetos musica
        Musica musica[] = new Musica[3];

        musica[0] = new Musica("Another Brick in the Wall", 5, "Imagine uma letra da musica aqui");
        
        musica[1] = new Musica("Human", 4, "I'm only, I'm only\nI'm only human, human\nMaybe I'm foolish\nMaybe I'm blind\nThinking I can see through this");

        musica[2] = new Musica("We can hurt together", 4, "You say you are fine\nBut I see pain\nBehind those eyes\nYou play the game\nBy the rigid rules\nBut you cheated yourself");

        //instanciando um objeto celular
        Celular cell = new Celular("Nokia 2022", "Azul", 1, 12, 6, true, true, musica, "Tipo P3");

        //instanciando um headser, que herda de fone de ouvido, que por sua vez herda de autofalante
        Headset headset = new Headset("100", "SH.109", 120, 40, "Vermelho", true, 100, false, "Tipo P3");

        

        //usando metodos de headset, parte deles são herdados de fone de ouvido e autofalante
        // --------------------------------------------------------------------------------->

        //tentando escutar musica sem conectar no celular
        headset.escutarMusica(cell, 2);
        System.out.println("\n");

        //conectando via cabo
        headset.desligar();
        headset.ligar();
        headset.conectarViaCabo(cell);
        headset.escutarMusica(cell, 2);
        System.out.println("\n");

        //tentando conectar com entrada diferentes
        cell.setTipoEntrada("Tipo P2");
        headset.conectarViaCabo(cell);
        System.out.println("\n");

        //tentando conectar com celular desligado
        cell.setTipoEntrada("Tipo P3");
        cell.setLigado(false);
        headset.conectarViaCabo(cell);
        System.out.println("\n");
        
        //testando metodos com bluetooth desligado
        cell.setLigado(true);
        headset.desligarBluetooth();
        headset.conectarViaBluetooth(cell);
        headset.escutarMusica(cell, 1);

        System.out.println("\n");

        //testando com bluetooth ligado
        headset.ligarBluetooth();
        headset.conectarViaBluetooth(cell);
        headset.escutarMusica(cell, 1);

        System.out.println("\n");
        headset.ligarMicrofone();

        //<-----------------------------------------------------------------------------------
    }
}
