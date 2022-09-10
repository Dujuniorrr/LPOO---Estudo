import java.util.Scanner;

public class exerc12Cliente {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        String name = new String();
        String cliente[] = {"Roberto Lima", "Antonio Ferreira", "Jessica Ohanna", "Ricardo Trindade", "Maria Clara", "Mateus Dias", "José Assunção", "Adalberto da Costa", "Laísa Glória", "Monalisa Clayr"};
        int posicao = 0;
        int menu = 0;

        while(menu != 3){
            ClearConsoleScreen();
            System.out.println("\nMenu\n\nVisualizar Clientes - Digite 1\nAdicionar Clientes - Digite 2\nFechar programa - Digite 3");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\nClientes: \n");
                    for (int i = 0; i <= 9; i++){
                        System.out.print((i+1) + " - " + (cliente[i]) + "\n");
                    }
                    Thread.sleep(3000);
                    break;
            
                case 2:
                    System.out.println("Digite o nome do cliente: ");
                    name = scanName.nextLine();
                    System.out.println("\nEm que posição deseja adicionar?: ");
                    posicao = scan.nextInt();
                    posicao = (posicao - 1);
                    if(posicao > 9){
                        System.out.println("\nNão é possivel adicionar nessa posição.");
                        Thread.sleep(1000);
                    }
                    else{
                        cliente[posicao] = name;
                        System.out.println("\nCliente adicionado com sucesso.");
                    }
                    break;
                
                case 3:
                    System.out.println("Fechando...");
                    Thread.sleep(1000);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    Thread.sleep(1000);
                    break;
            }
        }
    }

     public static void ClearConsoleScreen(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
