import java.util.Scanner;

public class exerc8NumerosIguais {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int anterior = 0, x = 0;
        int[] vetor = new int[10];
        int[] igual = new int[10];

        System.out.println("Digite dez numeros: ");
        vetor[0] = scan.nextInt();
        anterior = vetor[0];
        for(int i = 1; i < 10; i++){
            vetor[i] = scan.nextInt();
            if(vetor[i] == anterior){
                igual[x] = vetor[i];
                x++;
            }
            anterior = vetor[i];
        }

        System.out.println("Numeros iguais: ");
        for(int i = 0; i < x; i++){
            System.out.println(igual[i]);
        }
        
    }
}
