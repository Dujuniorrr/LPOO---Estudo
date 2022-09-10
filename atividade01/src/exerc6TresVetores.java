import java.util.Scanner;

public class exerc6TresVetores {
    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
      int[] vetor1 = new int[10];
      int[] vetor2 = new int[10];
      int[] vetor3 = new int[10];

      System.out.println("Alimente os dois vetores: ");
      for(int i = 0; i < 10; i++){
        System.out.println("\n-------------------------");
        System.out.print("Vetor 1 - Elemento " + (i + 1) + ": ");
        vetor1[i] = scan.nextInt();
        System.out.print("Vetor 2 - Elemento " + (i + 1) + ": ");
        vetor2[i] = scan.nextInt();

        vetor3[i] = vetor1[i] * vetor2[i];
      }

      System.out.println("\n-------------------------\nMultiplicação\n");
      for(int i = 0; i < 10; i++){
         System.out.println(vetor1[i] + " x " + vetor2[i] + ": " + vetor3[i] + "\n");
      }
    }
}
