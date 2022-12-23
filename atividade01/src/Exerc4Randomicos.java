import java.util.Scanner;

public class Exerc4Randomicos {
    public static void main(String[] args) throws Exception {
        int[] valor = new int[10];
        int menor, maior, inicio;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dez numeros randomicos: ");
        inicio = scan.nextInt();
        maior = inicio;
        menor = inicio;
        for(int i = 1; i < 10; i++){
            valor[i] = scan.nextInt();

            if(valor[i] > maior){
                maior = valor[i];
            }
            if(valor[i] < menor){
                menor = valor[i];
            }
        }
        
        System.out.println("Maior numero: " + maior + "\nMenor numero: " + menor);
    }
}
