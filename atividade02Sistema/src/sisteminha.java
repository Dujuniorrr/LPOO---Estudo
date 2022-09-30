//Discente: Durval Ferreira Sobrinho Júnior

import java.util.Scanner;

public class sisteminha{

    //nome dos produtos
    static String product[] = {"Feijão", 
                                "Arroz",
                                "Macarrão",
                                "Café",
                                "Tapioca",
                                " ",
                                " ",
                                " ", 
                                " ", 
                                " "};

    //preço dos produtos                            
    static double price [] = { 2.25,
                                1.75,
                                2.35,
                                2.15,
                                2.45,
                                0, 
                                0, 
                                0, 
                                0, 
                                0};

    //quantidade dos produtos em estoque                         
    static int quant[] = {40, 
                          45, 
                          60, 
                          48, 
                          50, 
                          0, 
                          0, 
                          0, 
                          0, 
                          0};

    
    static int idProductQuant = 4; //quantifica os produtos em estoque
    static String[] client =  new String[10]; //nome dos clientes
    static int idClientQuant = 0;  //quantifica os clientes adicionados
    static double cashInHand = 0; //dinheiro em caixa

    static String[] historicProduct = new String[100]; //guarda nome dos produtos comprados no historico
    static double [] historicPrice = new double[100]; //guarda preço dos produtos comprados no historico
    static int [] historicQuant = new int[100]; //guarda quantidade dos produtos comprados no historico
    static String[] historicClient = new String[100]; //guarda nome dos clientes que efetuaram compras no historico
    static int historicNum = 0; //quantidade de compras

    static boolean option = true;
    public static void main(String[] args) throws Exception {
        int menu = 0;

        initialPrint();
        boolean validLogin = login();

        if(validLogin == true){

            while(option == true){
                menu = optMenu();

                switch (menu) {

                    case 1:
                        showProducts();
                        break;
                    
                    case 2:
                        showClients();
                        break;

                    case 3:  
                        clientRegistration();
                        break;

                    case 4:
                        showCashInHand();
                        break;
                    
                    case 5:
                        sellProduct();
                        break;
                    
                    case 6:
                        addProduct();
                        break;
                    
                    case 7:
                        showHistoric();
                        break;  

                    case 8:
                        clearConsole();
                        break;

                    case 9:
                        System.out.println("\n- - - - - Volte sempre! - - - - -");
                        option = false;
                        break;
                
                    default:
                        System.out.println("\n-- - - - - Opção inválida - - - - -");
                        Thread.sleep(3000);
                        clearConsole();
                        break;
                }
            }
        }
        else{
            System.out.println("- - - - - - Login incorreto - - - - -");
        }
    }

    //--------------------------- funções ---------------------------------//

    //tela de inicialização
    public static void initialPrint() throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        clearConsole();
        System.out.println(" #####                                                            ");
        Thread.sleep(200);
        System.out.println("#        ####  #    # ##### #####   ####  #      ######   ");
        Thread.sleep(200);
        System.out.println("#       #    # ##   #   #   #    # #    # #      #                ");
        Thread.sleep(200);
        System.out.println("#       #    # # #  #   #   #    # #    # #      #####            ");
        Thread.sleep(200);
        System.out.println("#       #    # #  # #   #   #####  #    # #      #                ");
        Thread.sleep(200);
        System.out.println("#       #    # #   ##   #   #   #  #    # #      #                ");
        Thread.sleep(200);
        System.out.println(" #####   ####  #    #   #   #    #  ####  ###### ######           ");
        Thread.sleep(200);
        System.out.println("\n");
        Thread.sleep(200);
        System.out.println("                 #######                                          ");
        Thread.sleep(200);
        System.out.println("#####  ######    #        ####  #####  ####   ####  #    # ###### ");
        Thread.sleep(200);
        System.out.println("#    # #         #       #        #   #    # #    # #    # #      ");
        Thread.sleep(200);
        System.out.println("#    # #####     #####    ####    #   #    # #    # #    # #####  ");
        Thread.sleep(200);
        System.out.println("#    # #         #            #   #   #    # #  # # #    # #      ");
        Thread.sleep(200);
        System.out.println("#    # #         #       #    #   #   #    # #   #  #    # #  ");
        Thread.sleep(200);
        System.out.println("#####  ######    #######  ####    #    ####   ### #  ####  ###### ");
        Thread.sleep(500);
        System.out.print("\n\n      --- a p e r t e   q u a l q u e r   t e c l a ---");
        System.out.print("\n\n                            ");
        String start = scan.nextLine();
    }

                                                           
    //login
    public static boolean login() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        String nameUser = new String();
        String password = new String();
        boolean login;

        clearConsole();
        System.out.println("- - - Logar no Sistema - - -");
        System.out.print("> Informe seu nome: ");
        nameUser = scan.nextLine();
        System.out.print("> Informe sua senha: ");
        password = scan.nextLine();
        if(nameUser.equals("admin") && password.equals("123")){
            login = true;
        }
        else{
            login = false;
        }
        clearConsole();
        
        return login;
    }

    //menu
    public static int optMenu() throws InterruptedException{
        int menuOption;
        Scanner scan = new Scanner(System.in);

        clearConsole();
        System.out.println("- - - - - -  M E N U - - - - - -");
        System.out.println("1 - Mostrar produtos em estoque");
        System.out.println("2 - Mostrar clientes");
        System.out.println("3 - Cadastrar novos Clientes");
        System.out.println("4 - Mostrar Dinheiro em Caixa");
        System.out.println("5 - Vender Produtos");
        System.out.println("6 - Adicionar Produtos");
        System.out.println("7 - Histórico de Vendas");
        System.out.println("8 - Limpar tela");
        System.out.println("9 - Sair");

        System.out.print("\n--> O que deseja fazer? Escolha: ");
        menuOption = scan.nextInt();

        return menuOption;
    }

    //questiona o usuario se deseja ir para o menu ou sair do programa
    public static boolean question() throws InterruptedException{
        boolean quest = true;
        int output;
        Scanner scan = new Scanner(System.in);

        
        System.out.println("---------------------------");
        System.out.println("- Pressione 1 para sair");
        System.out.println("- Pressione 0 para retornar ao menu");
        System.out.print("--> Escolha: ");
        output = scan.nextInt();

        if(output == 1){
            quest = false;
            System.out.println("\n- - - - - Volte sempre! - - - - -");
        }
        else if(output == 0){
            quest = true;
        }
        else{
            clearConsole();
            System.out.println("\n---- Pressione uma opção válida\n");
            quest = question();
        }

        return quest;
    }

    //printa a tela
    public static void showProducts() throws InterruptedException{
        clearConsole();
        System.out.println("--------------------- PRODUTOS ------------------------");
        for(int i = 0; i <= idProductQuant; i++){
            System.out.println("ID: " + (i+1) + " - Produto: " + product[i] + " - Preço: " + price[i] + " - Quantidade em estoque: " + quant[i]);
        }
        System.out.println("\n");
        option = question();
    }

   
    //printa os clientes
    public static void showClients() throws InterruptedException{
        clearConsole();
        System.out.println("------------------------ CLIENTES ---------------------------");
        for(int i = 0; i < 10; i++){
            if(client[i] == null){
                System.out.println("ID: " + (i+1) + " - Cliente: Vazio"); 
            }
            else{
                System.out.println("ID: " + (i+1) + " - Cliente: " + client[i]);
            }
        }
        System.out.println("\n");
        option = question();
    }

    //registra clientes
    public static void clientRegistration() throws InterruptedException{
        Scanner scan = new Scanner(System.in);

        clearConsole();
        System.out.println("------------------------ CADASTRO ---------------------------");
        if(idClientQuant < 10){
            System.out.println("--> Digite um nome: ");
            client[idClientQuant] = scan.nextLine();
            idClientQuant++;
            System.out.println("\n--------> Cliente Registrado com Sucesso <---------");
            Thread.sleep(1000);
        }
        else{
            System.out.println("\n<-------- Máximo de clientes já registrados -------->");
            Thread.sleep(1000);
        }
    }

    //printa dinheiro em caixa 
    public static void showCashInHand() throws InterruptedException{
        clearConsole();
        System.out.println("\n---------- DINHEIRO EM CAIXA ----------");
        System.out.println(cashInHand + "\n");
        option = question();
    }

    //vende produtos
    public static void sellProduct () throws InterruptedException{
        
        Scanner scan = new Scanner(System.in);
        int idProduct = -1, sellQuant = 0, confirm = -1, codClient = -1, repeatSell = -1;
        double sellValue = 0;

        clearConsole();
        System.out.println("------------------------ VENDA ---------------------------");
        System.out.print("\n- Informe o ID do produto que deseja comprar: ");
        idProduct = idProduct + scan.nextInt();

        if(idProduct <= idProductQuant && idProduct > -1){
            System.out.print("\n- Qual a quantidade que deseja comprar? ");
            sellQuant = scan.nextInt();

            if(sellQuant > quant[idProduct]){
                System.out.println("\n<--- Produto em falta em relação a quantidade desejada. --->");
                Thread.sleep(2000);
            }
            else{
                sellValue = sellQuant * price[idProduct];
                quant[idProduct] = quant[idProduct] - sellQuant;
                
                do {
                    clearConsole();
                    System.out.println("--------- RECIBO ---------- \nProduto: " + product[idProduct] 
                    + "\nPreço da unidade: " + price[idProduct] 
                    + "\nQuantidade sendo comprada: " + sellQuant + 
                    "\n\n============================== \nValor a pagar: " + sellValue);

                    if(confirm == 2){
                        System.out.println("\n<---------- Digite uma opção válida ------------>");
                    }

                    System.out.println("\n- Deseja confirmar a compra? [0] > SIM ou [1] > Não");
                    confirm = scan.nextInt();

                    if(confirm == 0){
                        System.out.println("\n- Informe o codigo do cliente: ");
                        codClient = codClient + scan.nextInt();

                        if(client[codClient] == null || codClient > idClientQuant){
                            System.out.println("\n<-------- Codigo invalido -------->");
                            Thread.sleep(2000);
                        }
                        else{
                            do {
                                clearConsole();
                                System.out.println("------------------------------------------------");
                                if(repeatSell == 0){
                                    System.out.println("\n<---------- Digite uma opção válida ------------>");
                                }
                                cashInHand = cashInHand + sellValue;
                                sellHitoric(idProduct, sellQuant, sellValue, codClient);
                                System.out.println("\n- Deseja realizar outra compra? [1] > SIM   [2] > NÃO");
                                repeatSell = scan.nextInt();
                                    if(repeatSell == 1){
                                        sellProduct();
                                    }
                                    else if(repeatSell != 1 && repeatSell != 2 ){
                                        repeatSell = 0;
                                    }
                            } while (repeatSell != 1 && repeatSell != 2 );
                          
                        }
                    }
                    else if(confirm == 1){
                        System.out.println("\n---------> Compra cancelada <--------");
                        Thread.sleep(2000);
                    }
                    else{
                        confirm = 2;
                    }
                } while (confirm != 0 && confirm != 1);
            }
            
        }
        else{
            System.out.print("\n<-------- ID inválido -------->");
            Thread.sleep(2000);
        }
    }

    //adiciona produtos
    public static void addProduct() throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);
        int add = -1;
        
        do {
            clearConsole();
            System.out.println("------------------ INSERÇÂO DE PRODUTO -----------------------");
            System.out.println("\n- O que deseja fazer?\n");
            if(add == 2){
                System.out.println("\n---------- Digite uma opção válida ------------\n");
            }
            System.out.println("\n[0] > Adicionar quantidade de produto já existente \n[1] > Adicionar novo produto");
            add = scan.nextInt();

            if (add == 0) {
                System.out.println("\n- Digite o ID do produto: ");
                int id = scan.nextInt();
                id = id - 1;
                if(id <= idProductQuant && id > -1){
                    System.out.println("\n- PRODUTO: " + product[id] + "\n- Digite a quantidade que deseja adicionar: ");
                    int aux = scan.nextInt();
                    quant[id] = quant[id] + aux;
                    System.out.print("\n--------> Adição realizada <--------");
                }
                else{
                    System.out.print("\n<-------- ID inválido -------->");
                }
                Thread.sleep(2000);
            }
            else if (add == 1) {
                if(idProductQuant < 9){
                    idProductQuant++;
                    System.out.println("\n- Digite o nome do produto: ");
                    product[idProductQuant] = scanLine.nextLine();
                    System.out.println("\n- Digite a quantidade em estoque: ");
                    quant[idProductQuant] = scan.nextInt();
                    System.out.println("\n- Digite o preço do produto: ");
                    price[idProductQuant] = scan.nextDouble();
                }
                else{
                    System.out.println("\n--------> Máximo de produtos adicionados <--------");
                    Thread.sleep(2000);
                }
    
            }
            else{
                 add = 2;
            }
        } while (add != 0 && add != 1);
    }

    //adiciona vendas no historico
    public static void sellHitoric(int idProduct, int sellQuant, double sellValue, int codClient) throws InterruptedException{
        historicClient[historicNum] = client[codClient];
        historicProduct[historicNum] = product[idProduct];
        historicQuant[historicNum] = sellQuant;
        historicPrice[historicNum] = sellValue;
        historicNum++;
    }

    //printa o historico
    public static void showHistoric() throws InterruptedException{
        clearConsole();
        System.out.println("--------------------- HISTORICO ------------------------\n");
        for(int i = 0; i < historicNum; i++){
            System.out.println((i+1) + " --> Cliente: " + historicClient[i] + " - Produto: " + historicProduct[i] + " - Valor da compra: " + historicPrice[i] + " - Quantidade comprada: " + historicQuant[i]);
        }
        System.out.println("\n");
        option = question();
    }

    //limpa a tela
    public static void clearConsole(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}