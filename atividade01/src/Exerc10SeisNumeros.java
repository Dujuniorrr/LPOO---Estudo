import java.util.Scanner;

public class Exerc10SeisNumeros { 
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[6];
        int[] par = new int[6];
        int[] impar = new int[6];
        int somaPar = 0, quantImpar = 0, x = 0, y = 0;

        System.out.println("\nDigite seis numeros: ");
        for(int i = 0; i < 6; i++){
            vetor[i] = scan.nextInt();
            if (vetor[i]%2 == 0){
                par[x] = vetor[i];
                somaPar = somaPar + par[x];
                x++;
            }
            else if(vetor[i]%2 != 0){
                impar[y] = vetor[i];
                quantImpar++;
                y++;
            }
        }

        System.out.println("\nNumeros pares: ");
        for(int i = 0; i < x; i++){
           System.out.println(par[i]);
        }
        System.out.println("\nSoma dos numeros pares igual à: " + somaPar);

        System.out.println("\nNumeros impares: ");
        for(int i = 0; i < y; i++){
           System.out.println(impar[i]);
        }
        System.out.println("\nQuantidade dos numeros impares igual à: " + quantImpar);

    }
}
