package Questao3;

import java.util.Scanner;

public class Executa {
    static Scanner scan = new Scanner(System.in);
    static Scanner scanLine = new Scanner(System.in);
    public static void main(String[] args) {
    
        Album album = new Album("Black Star", "08/01/2016");
        Cantor cantor = new Cantor("David Bowie", "08/01/1947", "Britanico", album);
        Musica[] musicas = new Musica[3];
        
        for(int i = 0; i < musicas.length; i++){
            System.out.print("\nMusica " + i);
            musicas[i] = new Musica();
            System.out.print("\nDigite o nome: ");
            musicas[i].setNome(scanLine.nextLine());
            musicas[i].setCantor(cantor);
            musicas[i].setAlbum(album);
            System.out.print("Digite a duracao da musica: ");
            musicas[i].setDuracao(scan.nextFloat());
        }

        album.setMusicas(musicas);
        System.out.println("\nO cantor " + cantor.getNome() + " lançou o album: " + cantor.getAlbuns(0).getNome() + " na data: " + cantor.getAlbuns(0).getAnoLancamento());
        System.out.println("O album tem as seguintes musicas: ");

        for(int i=0; i < 3; i++){
            System.out.println(cantor.getAlbuns(0).getMusicas(i).getNome());
        }
    }

 }

