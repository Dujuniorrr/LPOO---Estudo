//Discente -- Durval Junior --

package Questao2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExecutaPrograma {
        static public ArrayList<ContatoComercial> arrayContatoComercial = new ArrayList<>();
        static public ArrayList<ContatoPessoal> arrayContatoPessoal = new ArrayList<>();
        static public ArrayList<ContatoEletronico> arrayContatoEletronico = new ArrayList<>();
        static public ArrayList<Evento> arrayEvento = new ArrayList<>();
        static public ArrayList<Cronograma> arrayCronogramas = new ArrayList<>();
        public static void main(String[] args) {
            Endereco endereco = new Endereco("Bahia", "São Francisco", "14 de maio", 500);
            ContatoComercial cc = new ContatoComercial("01", "Steve Jobs", "911204839", endereco, "63794-2031", "CEO", "Apple", "14/09/1970");
            ContatoPessoal cp = new ContatoPessoal("01", "Linus Torvalds", "99123042", endereco, "999.999.999.-01", "23/03/1960");
            Evento ev = new Evento("01", "Reunião", "07:30", 21, "Trabalho", "Uma reunião com o ScrumMaster.", cc);
            Evento ev2 = new Evento("02", "Churrasquinho", "12:30", 22, "Social", "Churrasquinho com Linus.", cp);
            ArrayList<Evento> even = new ArrayList<>();
            even.add(ev);
            even.add(ev2);
            Cronograma cronograma = new Cronograma("01", "Outubro", 20, 25, even);

            arrayContatoComercial.add(cc);
            arrayContatoPessoal.add(cp);
            arrayEvento.add(ev);
            arrayEvento.add(ev2);
            arrayCronogramas.add(cronograma);
            
            //o sistema começa a rodar agora
            int op = 0;
            while(op != 4){
                op = menu();
                switch (op) {
                    case 1:
                         gerenciarContatos();
                        break;
    
                    case 2:
                         gerenciarEventos();
                         break;
                    
                    case 3:
                         gerenciarCronogramas();
                         break;
                    
                    case 4:
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
                    + "AGENDA \n\n"
                    + "1 -> Gerenciar Contatos\n"
                    + "2 -> Gerenciar Eventos\n"
                    + "3 -> Organizar Cronogramas\n"
                    + "4 -> Sair\n\n"
                    + "O que deseja fazer?"));
    
            return op;
        }

        static public void gerenciarContatos(){
            int op;
            op= Integer.parseInt(JOptionPane.showInputDialog(""
                    + "CONTATOS\n\n"
                    + "1 -> Contatos Comerciais\n"
                    + "2 -> Contatos Eletronicos\n"
                    + "3 -> Contatos Pessoais\n"
                    + "4 -> Voltar para o menu\n\n"
                    + "Em qual tipo de contato deseja mexer?"));
            
            switch (op) {
                case 1:
                    gerenciarContatoComercial();
                    break;

                case 2:
                    gerenciarContatoEletronico();
                     break;
                
                case 3:
                    gerenciarContatoPessoal();
                     break;
                
                case 4:
                     break;
                    
                default:
                     JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                     break;
            }
        }

        static public void gerenciarContatoComercial(){
            ContatoComercial contatoComercial = new ContatoComercial();

            //criando formulario
            String codContato, nome, cpnj, dtNascimento, cargo, empresa, telefone;
            Endereco endereco = new Endereco();
            boolean valid;
    
            int op;
            op= Integer.parseInt(JOptionPane.showInputDialog(""
                    + "CONTATO COMERCIAL\n\n"
                    + "1 -> Cadastrar Contato Comercial\n"
                    + "2 -> Editar Contato Comercial\n"
                    + "3 -> Deletar Contato Comercial\n"
                    + "4 -> Visualizar Contato Comercial\n"
                    + "5 -> Voltar para o menu\n\n"
                    + "O que deseja fazer?"));
    
            switch (op) {
                case 1:
                    //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                    codContato = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Contato Comercial");
                    nome = JOptionPane.showInputDialog(""
                    + "Digite o nome do Contato Comercial");
                    cpnj = JOptionPane.showInputDialog(""
                    + "Digite o CPNJ do Contato Comercial");
                    cargo  = JOptionPane.showInputDialog(""
                    + "Digite o cargo do Contato Comercial");
                    empresa  = JOptionPane.showInputDialog(""
                    + "Digite a empresa do Contato Comercial");
                    telefone  = JOptionPane.showInputDialog(""
                    + "Digite o telefone do Contato Comercial");
                    dtNascimento = JOptionPane.showInputDialog(""
                    + "Digite a data de nascimento do Contato Comercial");
                    endereco.setEstado(JOptionPane.showInputDialog(""
                    + "Digite o estado: "));
                    endereco.setBairro(JOptionPane.showInputDialog(""
                    + "Digite o bairro: "));
                    endereco.setRua(JOptionPane.showInputDialog(""
                    + "Digite a rua: "));
                    endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o numero da casa: ")));
    
                    //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                    valid = contatoComercial.cadastrar(codContato, nome, dtNascimento, cpnj, endereco, cargo, empresa, telefone, arrayContatoComercial);
    
                    //saida, cadastrado ou não cadastrado
                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Contato Comercial cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um Contato Comercial com mesmo codigo.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
    
                case 2:
    
                    //formulario
                    codContato = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Contato Comercial que deseja editar.");
                    nome = JOptionPane.showInputDialog(""
                    + "Digite o nome do Contato Comercial");
                    cpnj = JOptionPane.showInputDialog(""
                    + "Digite o CPNJ do Contato Comercial");
                    cargo  = JOptionPane.showInputDialog(""
                    + "Digite o cargo do Contato Comercial");
                    empresa  = JOptionPane.showInputDialog(""
                    + "Digite a empresa do Contato Comercial");
                    telefone  = JOptionPane.showInputDialog(""
                    + "Digite o telefone do Contato Comercial");
                    dtNascimento = JOptionPane.showInputDialog(""
                    + "Digite a data de nascimento do Contato Comercial");
                    endereco.setEstado(JOptionPane.showInputDialog(""
                    + "Digite o estado: "));
                    endereco.setBairro(JOptionPane.showInputDialog(""
                    + "Digite o bairro: "));
                    endereco.setRua(JOptionPane.showInputDialog(""
                    + "Digite a rua: "));
                    endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o numero da casa: ")));
    
                    //envio o formulario como parametro, o metodo retorna um boolean informando se a edição foi bem sucedida
                    valid = contatoComercial.editar(codContato, nome, dtNascimento, cpnj, endereco, cargo, empresa, telefone, arrayContatoComercial);
    
                    //saida, editado ou não editado
                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Contato Comercial editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro na edição, não existe um Contato Comercial com o codigo informado.", "Edição", JOptionPane.ERROR_MESSAGE);
                    }
    
                    break;
                
                case 3:
                      //formulario
                      codContato = JOptionPane.showInputDialog(""
                      + "Digite o codigo do Contato Comercial que deseja deletar.");
      
                      //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                      valid = contatoComercial.deletar(codContato, arrayContatoComercial);
      
                      //saida, deletado ou não deletado
                      if(valid == true){
                          JOptionPane.showMessageDialog(null, "Contato Comercial deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                      }
                      else{
                          JOptionPane.showMessageDialog(null, "Erro, não existe um Contato Comercial com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                      }
                    break;
                
                case 4:
                    contatoComercial.visualizar(arrayContatoComercial);
                    break;
                
                case 5:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }

        static public void gerenciarContatoEletronico(){
            ContatoEletronico contatoEletronico = new ContatoEletronico();

            //criando formulario
            String codContato, nome, homePage, email, instagram, telefone;
            Endereco endereco = new Endereco();
            boolean valid;
    
            int op;
            op= Integer.parseInt(JOptionPane.showInputDialog(""
                    + "CONTATO ELETRONICO\n\n"
                    + "1 -> Cadastrar Contato Eletronico\n"
                    + "2 -> Editar Contato Eletronico\n"
                    + "3 -> Deletar Contato Eletronico\n"
                    + "4 -> Visualizar Contato Eletronico\n"
                    + "5 -> Voltar para o menu\n\n"
                    + "O que deseja fazer?"));
    
            switch (op) {
                case 1:
                    //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                    codContato = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Contato Eletronico");
                    nome = JOptionPane.showInputDialog(""
                    + "Digite o nome do Contato Eletronico");
                    email = JOptionPane.showInputDialog(""
                    + "Digite o email do Contato Eletronico");
                    instagram  = JOptionPane.showInputDialog(""
                    + "Digite o instagram do Contato Eletronico");
                    homePage  = JOptionPane.showInputDialog(""
                    + "Digite o link da home page do Contato Eletronico");
                    telefone  = JOptionPane.showInputDialog(""
                    + "Digite o telefone do Contato Eletronico");
                    endereco.setEstado(JOptionPane.showInputDialog(""
                    + "Digite o estado: "));
                    endereco.setBairro(JOptionPane.showInputDialog(""
                    + "Digite o bairro: "));
                    endereco.setRua(JOptionPane.showInputDialog(""
                    + "Digite a rua: "));
                    endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o numero da casa: ")));
    
                    //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                    valid = contatoEletronico.cadastrar(codContato, nome,endereco, email, homePage, instagram, telefone, arrayContatoEletronico);
    
                    //saida, cadastrado ou não cadastrado
                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "ContatoEletronico cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um contatoEletronico com mesmo codigo.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
    
                case 2:
    
                    //formulario
                    codContato = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Contato Eletronico que deseja editar.");
                    nome = JOptionPane.showInputDialog(""
                    + "Digite o nome do Contato Eletronico");
                    email = JOptionPane.showInputDialog(""
                    + "Digite o email do Contato Eletronico");
                    instagram  = JOptionPane.showInputDialog(""
                    + "Digite o instagram do Contato Eletronico");
                    homePage  = JOptionPane.showInputDialog(""
                    + "Digite o link da home page do Contato Eletronico");
                    telefone  = JOptionPane.showInputDialog(""
                    + "Digite o telefone do Contato Eletronico");
                    endereco.setEstado(JOptionPane.showInputDialog(""
                    + "Digite o estado: "));
                    endereco.setBairro(JOptionPane.showInputDialog(""
                    + "Digite o bairro: "));
                    endereco.setRua(JOptionPane.showInputDialog(""
                    + "Digite a rua: "));
                    endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o numero da casa: ")));
    
                    //envio o formulario como parametro, o metodo retorna um boolean informando se a edição foi bem sucedida
                    valid = contatoEletronico.editar(codContato, nome, endereco, email, homePage, instagram, telefone, arrayContatoEletronico);
    
                    //saida, editado ou não editado
                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Contato Eletronico editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro na edição, não existe um contato Eletronico com o codigo informado.", "Edição", JOptionPane.ERROR_MESSAGE);
                    }
    
                    break;
                
                case 3:
                      //formulario
                      codContato = JOptionPane.showInputDialog(""
                      + "Digite o codigo do Contato Eletronico que deseja deletar.");
      
                      //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                      valid = contatoEletronico.deletar(codContato, arrayContatoEletronico);
      
                      //saida, deletado ou não deletado
                      if(valid == true){
                          JOptionPane.showMessageDialog(null, "Contato Eletronico deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                      }
                      else{
                          JOptionPane.showMessageDialog(null, "Erro, não existe um contato Eletronico com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                      }
                    break;
                
                case 4:
                    contatoEletronico.visualizar(arrayContatoEletronico);
                    break;
                
                case 5:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }

        static public void gerenciarContatoPessoal(){
            ContatoPessoal contatoPessoal = new ContatoPessoal();

            //criando formulario
            String codContato, nome, dtNascimento, cpf, telefone;
            Endereco endereco = new Endereco();
            boolean valid;
    
            int op;
            op= Integer.parseInt(JOptionPane.showInputDialog(""
                    + "CONTATO PESSOAL\n\n"
                    + "1 -> Cadastrar Contato Pessoal\n"
                    + "2 -> Editar Contato Pessoal\n"
                    + "3 -> Deletar Contato Pessoal\n"
                    + "4 -> Visualizar Contato Pessoal\n"
                    + "5 -> Voltar para o menu\n\n"
                    + "O que deseja fazer?"));
    
            switch (op) {
                case 1:
                    //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                    codContato = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Contato Pessoal");
                    nome = JOptionPane.showInputDialog(""
                    + "Digite o nome do Contato Pessoal");
                    cpf  = JOptionPane.showInputDialog(""
                    + "Digite o cpf do Contato Pessoal");
                    telefone  = JOptionPane.showInputDialog(""
                    + "Digite o telefone do Contato Pessoal");
                    dtNascimento = JOptionPane.showInputDialog(""
                    + "Digite a data de nascimento do Contato Pessoal");
                    endereco.setEstado(JOptionPane.showInputDialog(""
                    + "Digite o estado: "));
                    endereco.setBairro(JOptionPane.showInputDialog(""
                    + "Digite o bairro: "));
                    endereco.setRua(JOptionPane.showInputDialog(""
                    + "Digite a rua: "));
                    endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o numero da casa: ")));
    
                    //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                    valid = contatoPessoal.cadastrar(codContato, nome, dtNascimento, endereco, cpf, telefone, arrayContatoPessoal);
    
                    //saida, cadastrado ou não cadastrado
                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Contato Pessoal cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um Contato Pessoal com mesmo codigo.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
    
                case 2:
    
                    //formulario
                    codContato = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Contato Pessoal que deseja editar.");
                    nome = JOptionPane.showInputDialog(""
                    + "Digite o nome do Contato Pessoal");
                    nome = JOptionPane.showInputDialog(""
                    + "Digite o nome do Contato Pessoal");
                    cpf  = JOptionPane.showInputDialog(""
                    + "Digite o cpf do Contato Pessoal");
                    telefone  = JOptionPane.showInputDialog(""
                    + "Digite o telefone do Contato Pessoal");
                    dtNascimento = JOptionPane.showInputDialog(""
                    + "Digite a data de nascimento do Contato Pessoal");
                    endereco.setEstado(JOptionPane.showInputDialog(""
                    + "Digite o estado: "));
                    endereco.setBairro(JOptionPane.showInputDialog(""
                    + "Digite o bairro: "));
                    endereco.setRua(JOptionPane.showInputDialog(""
                    + "Digite a rua: "));
                    endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o numero da casa: ")));

                    //envio o formulario como parametro, o metodo retorna um boolean informando se a edição foi bem sucedida
                    valid = contatoPessoal.editar(codContato, nome, dtNascimento, endereco, cpf, telefone, arrayContatoPessoal);
    
                    //saida, editado ou não editado
                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Contato Pessoal editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro na edição, não existe um Contato Pessoal com o codigo informado.", "Edição", JOptionPane.ERROR_MESSAGE);
                    }
    
                    break;
                
                case 3:
                      //formulario
                      codContato = JOptionPane.showInputDialog(""
                      + "Digite o codigo do Contato Pessoal que deseja deletar.");
      
                      //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                      valid = contatoPessoal.deletar(codContato, arrayContatoPessoal);
      
                      //saida, deletado ou não deletado
                      if(valid == true){
                          JOptionPane.showMessageDialog(null, "Contato Pessoal deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                      }
                      else{
                          JOptionPane.showMessageDialog(null, "Erro, não existe um Contato Pessoal com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                      }
                    break;
                
                case 4:
                    contatoPessoal.visualizar(arrayContatoPessoal);
                    break;
                
                case 5:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }

        static public void gerenciarEventos(){
            Evento evento = new Evento();

            //criando formulario
            String codEvento, nomeEvento, horarioEvento, tipoAtividade, descricao, codContato = " ";
            int diaEvento;
            boolean valid;
    
            int op;
            op= Integer.parseInt(JOptionPane.showInputDialog(""
                    + "EVENTOSR\n\n"
                    + "1 -> Adicionar Evento\n"
                    + "2 -> Deletar Evento\n"
                    + "3 -> Visualizar Evento\n"
                    + "4 -> Voltar para o menu\n\n"
                    + "O que deseja fazer?"));
    
            switch (op) {
                case 1:

                    codEvento = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Evento");
                    nomeEvento = JOptionPane.showInputDialog(""
                    + "Digite o nome do Evento");
                    horarioEvento = JOptionPane.showInputDialog(""
                    + "Digite o horario do Evento");
                    diaEvento = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o dia do Evento"));
                    tipoAtividade = JOptionPane.showInputDialog(""
                    + "Digite o tipo de atividade do Evento");
                    descricao = JOptionPane.showInputDialog(""
                    + "Digite uma curta descricao sobre o Evento");

                    int opcaoContato = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "DESEJA ADICIONAR UM CONTATO AO EVENTO? \n\n"
                    + "1 -> Adicionar Contato Comercial\n"
                    + "2 -> Adicionar Contato Pessoal\n"
                    + "3 -> Adicionar Contato Eletronico\n"
                    + "Outra tecla -> Não quero adicionar contato\n\n"
                    + "O que deseja fazer?"));
                    if(opcaoContato >= 1 && opcaoContato <=3){
                        codContato = JOptionPane.showInputDialog(""
                        + "Digite o codigo do contato: ");
                    }
                    valid = evento.adicionar(codEvento, nomeEvento, horarioEvento, diaEvento, tipoAtividade, descricao, codContato, opcaoContato, arrayContatoComercial, arrayContatoEletronico, arrayContatoPessoal, arrayEvento);

                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Evento cadastrado.", "Adicionar", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro na adição, verifique se:\n1 - Existe um outro evento com mesmo codigo \n2 - O codigo do contato estava correto", "Adicionar", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
    
                case 2:
                    //formulario
                    codEvento = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Evento que deseja deletar.");
    
                    //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                    valid = evento.deletar(codEvento, arrayEvento);
    
                    //saida, deletado ou não deletado
                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Evento deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro, não existe um Evento com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                    }
                  break;

                case 3:
                    evento.visualizar(arrayEvento);
                    break;
                    
                case 4:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    
        static public void gerenciarCronogramas(){
            Cronograma cronograma = new Cronograma();

            //criando formulario
            String codCronograma, mes;
            int diaInicio, diaFinal;
            boolean valid;
    
            int op;
            op= Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Cronograma\n\n"
                    + "1 -> Adicionar Cronograma\n"
                    + "2 -> Deletar Cronograma\n"
                    + "3 -> Visualizar Cronogramas\n"
                    + "4 -> Adicionar Evento em Cronograma\n"
                    + "5 -> Voltar para o menu\n\n"
                    + "O que deseja fazer?"));
    
            switch (op) {
                case 1:

                    codCronograma = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Cronograma");
                    mes = JOptionPane.showInputDialog(""
                    + "Digite o mes do Cronograma");
                    diaInicio = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o dia de Inico do Cronograma"));
                    diaFinal = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Digite o dia final do Cronograma"));
                   
                    ArrayList<String> codigosEvento = new ArrayList<>();
                    int option = 0;
                    String umOutro = " um ";
                    while(option == 0){
                        option = JOptionPane.showConfirmDialog(null, "Deseja adicionar" + umOutro + "evento a este cronograma?");
                        if(option == 0){
                            codigosEvento.add(JOptionPane.showInputDialog(""
                            + "Digite o codigo do evento"));
                            umOutro = " outro ";
                        }
                    }
                    
                    valid = cronograma.adicionar(codCronograma, mes, diaInicio, diaFinal, arrayEvento, arrayCronogramas, arrayEvento, codigosEvento);

                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Cronograma cadastrado.", "Adicionar", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro na adição, verifique se:\n1 - Existe um outro cronograma com mesmo codigo \n2 - Algum do evento começa antes do dia de inicio do cronograma ou depois do dia final", "Adicionar", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
    
                case 2:
                    //formulario
                    codCronograma = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Evento que deseja deletar.");
    
                    //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                    valid = cronograma.deletar(codCronograma, arrayCronogramas);
    
                    // saida, deletado ou não deletado
                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Evento deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro, não existe um Evento com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                    }
                  break;

                case 3:
                    cronograma.visualizar(arrayCronogramas);
                    break;
                    
                case 4:
                    codCronograma = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Cronograma onde deseja adiconar o evento: ");
                    String codEvento = JOptionPane.showInputDialog(""
                    + "Digite o codigo do Evento: ");

                    valid = cronograma.adicionarEvento(codCronograma, codEvento, arrayEvento, arrayCronogramas);

                    if(valid == true){
                        JOptionPane.showMessageDialog(null, "Evento adicionado ao cronograma.", "Adicionar", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro na adição, verifique se:\n1 - O codigo do evento ou cronograma estavam corretos \n2 - O evento que você informou já está no cronograma \n3 - O dia do evento não se enquadra no dia inicial e final do crongrama", "Adicionar", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 5:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                    break;
        }
    }
}
