//Discente -- Durval Ferreira Sobrinho Junior ---

package Questao1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExecutarPrograma {

    //aqui eu crio uma lista de objetos de todas as classes que englobam esse sistema, exceto Endereco, que funciona como um objeto parte(de um todo) e a classe Pessoa que é uma classe abstrata, por tanto não pode ser instanciada
    static public ArrayList<Vendedor> arrayVendedor = new ArrayList<>();
    static public ArrayList<Cliente> arrayCliente = new ArrayList<>();
    static public ArrayList<Produto> arrayProduto = new ArrayList<>();
    static public ArrayList<Venda> arrayVenda = new ArrayList<>();
    
    public static void main(String[] args) {

        //instanciando alguns objetos
         Produto prod = new Produto("01", "Feijão", 8.50, 100);
         Endereco endereco = new Endereco("Bahia", "São Francisco", "14 de maio", 500);
         Vendedor vendedor = new Vendedor("Lucas Almeida", "12/08/1989", endereco, "3432", "01");
         Cliente cliente = new Cliente("Woquiton Fernandes", "21/08/1980", endereco, "01", 1000);

        //'populando' meu sistema com objetos que instanciei acima
        arrayCliente.add(cliente);
        arrayProduto.add(prod);
        arrayVendedor.add(vendedor);

        //o sistema começa a rodar agora
        int op = 0;
        while(op != 5){
            op = menu();
            switch (op) {
                case 1:
                     gerenciarVendedor();
                    break;

                case 2:
                     gerenciarCliente();
                     break;
                
                case 3:
                     gerenciarProduto();
                     break;
                
                case 4:
                     gerenciarVenda();
                     break; 
                
                case 5:
                    JOptionPane.showMessageDialog(null, "Programa fechado. Até mais.", "Menu", JOptionPane.CLOSED_OPTION);
                     break;
                    
                default:
                     JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                     break;
            }
        }
    }

    //menu inicial
    static public int menu(){
        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "CONTROLE DE ESTOQUE \n\n"
				+ "1 -> Gerenciar Vendedor\n"
				+ "2 -> Gerenciar Cliente\n"
				+ "3 -> Gerenciar Produto\n"
				+ "4 -> Gerenciar Venda\n"
				+ "5 -> Sair\n\n"
				+ "O que deseja fazer?"));

        return op;
    }

    //dashboard de vendedor, cada case é uma tela
    static public void gerenciarVendedor(){
        Vendedor vendedor = new Vendedor();

        //criando formulario
        String codVendedor, nome, cpnj, dtNascimento;
        Endereco endereco = new Endereco();
        boolean valid;

        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR VENDEDOR\n\n"
				+ "1 -> Cadastrar Vendedor\n"
				+ "2 -> Editar Vendedor\n"
				+ "3 -> Deletar Vendedor\n"
				+ "4 -> Visualizar Vendedor\n"
				+ "5 -> Voltar para o menu\n\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                codVendedor = JOptionPane.showInputDialog(""
                + "Digite o codigo do Vendedor");
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Vendedor");
                cpnj = JOptionPane.showInputDialog(""
                + "Digite o CPNJ do Vendedor");
                dtNascimento = JOptionPane.showInputDialog(""
                + "Digite a data de nascimento do Vendedor");
                endereco.setEstado(JOptionPane.showInputDialog(""
                + "Digite o estado: "));
                endereco.setBairro(JOptionPane.showInputDialog(""
                + "Digite o bairro: "));
                endereco.setRua(JOptionPane.showInputDialog(""
                + "Digite a rua: "));
                endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite o numero da casa: ")));

                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = vendedor.cadastrar(codVendedor, nome, dtNascimento, cpnj, endereco, arrayVendedor);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Vendedor cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um vendedor com mesmo codigo.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                
                break;

            case 2:

                //formulario
                codVendedor = JOptionPane.showInputDialog(""
                + "Digite o codigo do Vendedor que deseja editar.");
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Vendedor");
                cpnj =  JOptionPane.showInputDialog(""
                + "Digite o CPNJ do Vendedor");
                dtNascimento = JOptionPane.showInputDialog(""
                + "Digite a data de nascimento do Vendedor");
                endereco.setEstado(JOptionPane.showInputDialog(""
                + "Digite o estado: "));
                endereco.setBairro(JOptionPane.showInputDialog(""
                + "Digite o bairro: "));
                endereco.setRua(JOptionPane.showInputDialog(""
                + "Digite a rua: "));
                endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite o numero da casa: ")));

                //envio o formulario como parametro, o metodo retorna um boolean informando se a edição foi bem sucedida
                valid = vendedor.editar(codVendedor, nome, dtNascimento, cpnj, endereco, arrayVendedor);

                //saida, editado ou não editado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Vendedor editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na edição, não existe um vendedor com o codigo informado.", "Edição", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case 3:
                  //formulario
                  codVendedor = JOptionPane.showInputDialog(""
                  + "Digite o codigo do Vendedor que deseja deletar.");
  
                  //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                  valid = vendedor.deletar(codVendedor, arrayVendedor);
  
                  //saida, deletado ou não deletado
                  if(valid == true){
                      JOptionPane.showMessageDialog(null, "Vendedor deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Erro, não existe um vendedor com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                  }
                break;
            
            case 4:
                vendedor.visualizar(arrayVendedor);
                break;
            
            case 5:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

     //dashboard de cliente, cada case é uma tela
    static public void gerenciarCliente(){
        Cliente cliente = new Cliente();

        //criando formulario
        String codCliente, nome, dtNascimento;
        double saldo;
        Endereco endereco = new Endereco();
        boolean valid;

        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR CLIENTE\n\n"
				+ "1 -> Cadastrar Cliente\n"
				+ "2 -> Editar Cliente\n"
				+ "3 -> Deletar Cliente\n"
				+ "4 -> Visualizar Clientes\n"
				+ "5 -> Voltar para o menu\n\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui é um formulario
                codCliente = JOptionPane.showInputDialog(""
                + "Digite o codigo do Cliente");
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Cliente");
                saldo = Double.parseDouble(JOptionPane.showInputDialog(""
                + "Digite o saldo do Cliente"));
                dtNascimento = JOptionPane.showInputDialog(""
                + "Digite a data de nascimento do Cliente");
                endereco.setEstado(JOptionPane.showInputDialog(""
                + "Digite o estado: "));
                endereco.setBairro(JOptionPane.showInputDialog(""
                + "Digite o bairro: "));
                endereco.setRua(JOptionPane.showInputDialog(""
                + "Digite a rua: "));
                endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite o numero da casa: ")));

                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = cliente.cadastrar(codCliente, nome, dtNascimento, endereco, arrayCliente, saldo);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um cliente com mesmo codigo.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                
                break;

            case 2:

                //formulario
                codCliente = JOptionPane.showInputDialog(""
                + "Digite o codigo do Cliente que deseja editar.");
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Cliente");
                saldo = Double.parseDouble(JOptionPane.showInputDialog(""
                + "Digite o saldo do Cliente"));
                dtNascimento = JOptionPane.showInputDialog(""
                + "Digite a data de nascimento do Vendedor");
                endereco.setEstado(JOptionPane.showInputDialog(""
                + "Digite o estado: "));
                endereco.setBairro(JOptionPane.showInputDialog(""
                + "Digite o bairro: "));
                endereco.setRua(JOptionPane.showInputDialog(""
                + "Digite a rua: "));
                endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite o numero da casa: ")));

                //envio o formulario como parametro, o metodo retorna um boolean informando se a edição foi bem sucedida
                valid = cliente.editar(codCliente, nome, dtNascimento, endereco, arrayCliente, saldo);

                //saida, edidato ou não editado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Cliente editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na edição, não existe um cliente com o codigo informado.", "Edição", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case 3:
                  //formulario
                  codCliente = JOptionPane.showInputDialog(""
                  + "Digite o codigo do cliente que deseja deletar.");
  
                  //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                  valid = cliente.deletar(codCliente, arrayCliente);
  
                  //saida, deletado ou não deletado
                  if(valid == true){
                      JOptionPane.showMessageDialog(null, "Cliente deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Erro, não existe um Cliente com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                  }
                break;
            
            case 4:
                cliente.visualizar(arrayCliente);
                break;
            
            case 5:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    //dashboard de produto, cada case é uma tela
    static public void gerenciarProduto(){
        
        //criando formulario
        Produto produto = new Produto();
        String codProduto, nome;
        double preco;
        int quantidade;
        boolean valid;

        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR PRODUTO\n\n"
				+ "1 -> Cadastrar Produto\n"
				+ "2 -> Editar Produto\n"
				+ "3 -> Deletar Produto\n"
				+ "4 -> Visualizar Produtos\n"
				+ "5 -> Voltar para o menu\n\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui é um formulario
                codProduto = JOptionPane.showInputDialog(""
                + "Digite o codigo do produto: ");
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Produto: ");
                preco = Double.parseDouble(JOptionPane.showInputDialog(""
                + "Digite o preço do Produto: "));
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite a quantidade de Produto no estoque: "));

                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = produto.cadastrar(codProduto, nome, preco, quantidade, arrayProduto);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Produto cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um produto com mesmo codigo.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                
                break;

            case 2:

                //formulario
                codProduto = JOptionPane.showInputDialog(""
                + "Digite o codigo do produto que deseja editar: ");
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Produto: ");
                preco = Double.parseDouble(JOptionPane.showInputDialog(""
                + "Digite o preço do Produto: "));
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite a quantidade de Produto no estoque: "));

                //envio o formulario como parametro, o metodo retorna um boolean informando se a edição foi bem sucedida
                valid = produto.editar(codProduto, nome, preco, quantidade, arrayProduto);

                //saida, edidato ou não editado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "produto editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na edição, não existe um produto com o codigo informado.", "Edição", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case 3:
                  //formulario
                  codProduto = (JOptionPane.showInputDialog(""
                  + "Digite o codigo do produto que deseja deletar."));
  
                  //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                  valid = produto.deletar(codProduto, arrayProduto);
  
                  //saida, deletado ou não deletado
                  if(valid == true){
                      JOptionPane.showMessageDialog(null, "produto deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Erro, não existe um produto com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                  }
                break;
            
            case 4:
                produto.visualizar(arrayProduto);
                break;
            
            case 5:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    static public void gerenciarVenda(){
        Venda venda = new Venda();

        //criando formulario
        String codProduto, codCliente, codVendedor, codVenda, dtVenda;
        int quantidade;
        boolean valid;

        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR VENDA\n\n"
				+ "1 -> Cadastrar Venda\n"
				+ "2 -> Visualizar Vendas\n"
				+ "3 -> Voltar para o menu\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui é um formulario
                codVenda = JOptionPane.showInputDialog(""
                + "Digite o codigo da Venda: ");
                codProduto = JOptionPane.showInputDialog(""
                + "Digite o codigo do produto: ");
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite a quantidade que deseja comprar: "));
                codCliente = JOptionPane.showInputDialog(""
                + "Digite o codigo do Cliente: ");
                codVendedor = JOptionPane.showInputDialog(""
                + "Digite o codigo do Vendedor: ");
                dtVenda = JOptionPane.showInputDialog(""
                + "Digite a data da Venda: ");

                //envio o formulario como parametro, o metodo retorna um valor inteiro, se for igual a 3 significa que passou por todas as verificações e o cadastro é valido
                valid = venda.cadastrar(codProduto, codCliente, codVendedor, codVenda, dtVenda, quantidade, arrayCliente, arrayProduto, arrayVendedor, arrayVenda);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Venda cadastrada.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, verifique: \n1 - Se já existe uma venda com mesmo codigo \n2 - Se adicionou um codigo inválido \n3 - Se o saldo do cliente é maior que o valor da venda \n4 - A quantidade de Produto desejada é maior que a em estoque", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                break;
            
            case 2:
                venda.visualizar(arrayVenda);
                break;
            
            case 3:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}