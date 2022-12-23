import java.util.Scanner;

public class Exerc11Produto {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String nome = new String();
        String produto[] = {"Notebook", "Celular", "Televisão", "Geladeira","Microondas", "Abajur", "Headphone", "Grampeador", "Oculos", "Mouse"};
        String continuar = "sim";
        int preco[] = {3500, 1500, 2000, 3000, 2000, 250, 120, 20, 100, 50};
        boolean valid = false;

        while(continuar.equals("sim")){
            ClearConsoleScreen ();
            System.out.println("\nDigite o nome de um produto: ");
            nome = scan.nextLine();
            for(int i = 0; i < 10; i++){
                if(nome.equals(produto[i])){
                    System.out.println("\nProduto: " + produto[i] + "\nPreço: " + preco[i] + " reais");
                    valid = true;
                }
            }
            if(valid == false){
                System.out.println("\nNenhum resultado encontrado.");
            }
            
            System.out.println("\nDeseja fazer outra consulta? [Digite 'sim' para continuar]");
            continuar = scan.nextLine();
        }
    }   

    public static void ClearConsoleScreen(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}