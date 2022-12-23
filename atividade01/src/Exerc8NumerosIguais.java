import java.util.Scanner;

public class Exerc8NumerosIguais {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int cont = 0, auxiliar = 0, valid = 0;
        int[] vetor = new int[10];
        int[] igual = new int[10];
        int maior = 1;

        System.out.println("Digite dez numeros: ");
        vetor[0] = scan.nextInt();
        maior = vetor[0];
        for(int i = 1; i < 10; i++){
            vetor[i] = scan.nextInt();

            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        maior = maior + 1;
        for(int i = 0; i < 10; i++){
            auxiliar = maior;
            if(vetor[i] != maior){
                auxiliar = vetor[i];
                vetor[i] = maior;
            }
            for(int x = i + 1; x < 10; x++){
                if(vetor[x] == auxiliar && vetor[x] != maior){
                    valid = 1;
                    vetor[x] = maior;
                }
            }
            if(valid == 1){
                igual[cont] = auxiliar;
                cont++;
                valid = 0;
            }
        }
        
        System.out.println("Numeros iguais: ");
        for(int i = 0; i < cont; i++){
            System.out.println(igual[i]);
        }
        
    }
}
