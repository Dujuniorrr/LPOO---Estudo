import java.util.Scanner;
import java.util.Random;

public class Exerc5Time {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
       
        String time[]={"Flamengo", "São Paulo", "Palmeiras", "Botafogo", "Vasco", "Bahia", "Fortaleza", "Internacional", "Cruzeiro", "Corinthians"};
        String frase[] = {"Fôssemos merecidos de água, de chão, de rãs, de árvores, de brisas e de graças!", "Nossas palavras não tinham lugar marcado.", "A gente andava atoamente em nossas origens.", "Só as pedras sabiam o formato do silêncio.", "A gente não queria significar, mas só cantar.", "A gente só queria demais era mudar as feições da natureza. ", "Tipo assim: Hoje eu vi um lagarto lamber as pernas da manhã. ",  "Ou tipo assim: Nós vimos uma formiga frondosa ajoelhada na pedra.", " Aliás, depois de grandes a gente viu que o cu de uma formiga é mais importante para a humanidade do que a Bomba Atômica."};
        Random gerador = new Random();
        int codigo, numFrase;

        System.out.println("Escolha um codigo de 1 a 10");
        codigo = scan.nextInt() - 1;
        numFrase = gerador.nextInt(9);
        if(codigo > 9){
            System.out.println("Numero inválido.");     
        }
        else{
            System.out.println(time[codigo] + " " + frase[numFrase]);
        }
    }
}
