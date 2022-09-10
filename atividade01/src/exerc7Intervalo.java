import java.util.Scanner;

public class exerc7Intervalo {
    public static void main(String[] args) throws Exception {
        int valor = 1, quant = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite valores: ");
        while(valor != 0){
            valor = scan.nextInt();
            if(valor > 100 && valor < 200){
                quant++;
            }
        }
        System.out.println("Quantidade de numeros entre 100 e 200: " + quant);
        
    }
}

