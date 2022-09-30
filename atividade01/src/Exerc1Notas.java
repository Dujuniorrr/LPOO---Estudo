import java.util.Scanner;

public class Exerc1Notas {
    public static void main(String[] args) throws Exception {
        int[] notas = new int[5];
        int media = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite as nota: ");
         for (int i = 0; i < 5; i++){
            System.out.print("\nNota " + (i+1) + "- ");
            notas[i] = scan.nextInt();
            media = media + notas[i];
        }

        media = media / 5;

        System.out.println("\nMédia: " + media);
    }
}
