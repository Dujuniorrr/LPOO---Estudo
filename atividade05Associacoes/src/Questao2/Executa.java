package Questao2;

import java.util.Scanner;

public class Executa {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Borracha borracha = new Borracha("Verde", "Faber Castell");
        Lapis lapis = new Lapis();
        Papel papel = new Papel();
    

        System.out.println("Escreva algo na primeira pagina: ");
        lapis.escrever(papel, scan.nextLine());
        System.out.println("Escreva na segunda pagina: ");
        lapis.escrever(papel, scan.nextLine());
        papel.lerPapel();
        borracha.apagar(papel, 1);
        papel.lerPapel();
    }
}
