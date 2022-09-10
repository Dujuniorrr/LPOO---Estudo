import java.util.Scanner;

public class exerc11Produto {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String nome = new String();
        String produto[] = {"Notebook", "Celular", "Televisão", "Geladeira","Microondas", "Abajur", "Headphone", "Grampeador", "Oculos", "Mouse"};
        String continuar[] = {"sim"};
        int preco[] = {3500, 1500, 2000, 3000, 2000, 250, 120, 20, 100, 50};
        int valid = 0;

        while(continuar[0].equals("sim")){
            ClearConsoleScreen ();
            System.out.println("\nDigite o nome de um produto: ");
            nome = scan.nextLine();
            for(int i = 0; i < 10; i++){
                if(nome.equals(produto[i])){
                    System.out.println("\nProduto: " + produto[i] + "\nPreço: " + preco[i] + " reais");
                    valid++;
                }
            }
            if(valid == 0){
                System.out.println("Nenhum resultado encontrado.");
            }
            
            System.out.println("\nDeseja fazer outra consulta? ['sim' ou 'não']");
            continuar[0] = scan.nextLine();
        }
    }   

    public static void ClearConsoleScreen(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
