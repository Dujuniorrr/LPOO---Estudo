
//Discente -- Durval Ferreira Sobrinho Junior ---
package Questao3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExecutarPrograma {
    static public ArrayList<Aluno> arrayAluno = new ArrayList<>();
    static public ArrayList<Curso> arrayCurso = new ArrayList<>();
    static public ArrayList<Professor> arrayProfessor = new ArrayList<>();
    static public ArrayList<Turma> arrayTurma = new ArrayList<>();
    static public ArrayList<Materia> arrayMateria = new ArrayList<>();
    static public ArrayList<Avaliacao> arrayAvaliacao = new ArrayList<>(); 
    public static void main(String[] args) {

        int op = 0;
        while(op != 6){
            op = menu();
            switch (op) {
                case 1:
                     gerenciarAluno();
                    break;

                case 2:
                     gerenciarProfessor();
                     break;
                
                case 3:
                     gerenciarTurma();
                     break;
                
                case 4:
                     gerenciarCurso();
                     break; 
                
                case 5:
                    gerenciarMateria();
                    break;

                case 6:
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
				+ "SISTEMA ESCOLAR\n\n"
				+ "1 -> Gerenciar Aluno\n"
				+ "2 -> Gerenciar Professor\n"
				+ "3 -> Gerenciar Turma\n"
				+ "4 -> Gerenciar Curso\n"
				+ "5 -> Gerenciar Materia\n"
                + "6 -> Sair\n\n"
				+ "O que deseja fazer?"));

        return op;
    }

    //dashboard de Aluno, cada case é uma tela
    static public void gerenciarAluno(){
        Aluno Aluno = new Aluno();

        boolean valid;
        String matricula, nome, endereco, telefone, situacao, codCurso;
        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR ALUNO\n\n"
				+ "1 -> Cadastrar Aluno\n"
				+ "2 -> Editar Aluno\n"
				+ "3 -> Deletar Aluno\n"
				+ "4 -> Visualizar Aluno\n"
				+ "5 -> Voltar para o menu\n\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                matricula = JOptionPane.showInputDialog(""
                + "Digite a matricula do Aluno");
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Aluno");
                endereco = JOptionPane.showInputDialog(""
                + "Digite o endereco do Aluno");
                telefone = JOptionPane.showInputDialog(""
                + "Digite o telefone do Aluno");
                situacao = JOptionPane.showInputDialog(""
                + "Digite a situação do Aluno");
                codCurso = JOptionPane.showInputDialog(""
                + "Digite o codigo do Curso atrelado ao Aluno");
                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = Aluno.cadastrar(matricula, nome, endereco, telefone, situacao, codCurso, arrayAluno, arrayCurso);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um Aluno com mesmo codigo. Ou não existe um Curso com o codigo informado.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                
                break;

            case 2:
                //formulario
                matricula = JOptionPane.showInputDialog(""
                + "Digite a matricula do Aluno que deseja editar:");
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Aluno");
                endereco = JOptionPane.showInputDialog(""
                + "Digite o endereco do Aluno");
                telefone = JOptionPane.showInputDialog(""
                + "Digite o telefone do Aluno");
                situacao = JOptionPane.showInputDialog(""
                + "Digite a situação do Aluno");
                codCurso = JOptionPane.showInputDialog(""
                + "Digite o codigo do Curso atrelado ao Aluno");

                //envio o formulario como parametro, o metodo retorna um boolean informando se a edição foi bem sucedida
                valid = Aluno.cadastrar(matricula, nome, endereco, telefone, situacao, codCurso, arrayAluno, arrayCurso);

                //saida, editado ou não editado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Aluno editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na edição, não existe um Aluno com o codigo informado. Ou não existe o curso com o codigo informado.", "Edição", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case 3:
                  //formulario
                  matricula = JOptionPane.showInputDialog(""
                  + "Digite a matricula do Aluno que deseja deletar.");
  
                  //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                  valid = Aluno.deletar(matricula, arrayAluno);
  
                  //saida, deletado ou não deletado
                  if(valid == true){
                      JOptionPane.showMessageDialog(null, "Aluno deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Erro, não existe um Aluno com esse codigo. Ou o codigo do curso é invalido.", "Deletar", JOptionPane.ERROR_MESSAGE);
                  }
                break;
            
            case 4:
                Aluno.visualizar(arrayAluno);
                break;
            
            case 5:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    //dashboard de professor, cada case é uma tela
    static public void gerenciarProfessor(){
        Professor professor = new Professor();

        //criando formulario
        String titualacaoMax, nome, endereco, telefone, codCurso;
        boolean valid;

        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR PROFESSOR\n\n"
				+ "1 -> Cadastrar Professor\n"
				+ "2 -> Editar Professor\n"
				+ "3 -> Deletar Professor\n"
				+ "4 -> Visualizar Professor\n"
				+ "5 -> Voltar para o menu\n\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Professor");
                titualacaoMax = JOptionPane.showInputDialog(""
                + "Digite a titulação máxima do Professor");
                endereco = JOptionPane.showInputDialog(""
                + "Digite o endereco do Professor");
                telefone = JOptionPane.showInputDialog(""
                + "Digite o telefone do Professor");
                codCurso = JOptionPane.showInputDialog(""
                + "Digite o codigo do Curso atrelado ao Professor");

                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = professor.cadastrar(nome, titualacaoMax, endereco, telefone, codCurso, arrayProfessor, arrayCurso);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Professor cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um professor com mesmo codigo.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                
                break;

            case 2:

                //formulario
                nome = JOptionPane.showInputDialog(""
                + "Digite o nome do Professor que deseja editar");
                titualacaoMax = JOptionPane.showInputDialog(""
                + "Digite a titulação máxima do Professor");
                endereco = JOptionPane.showInputDialog(""
                + "Digite o endereco do Professor");
                telefone = JOptionPane.showInputDialog(""
                + "Digite o telefone do Professor");
                codCurso = JOptionPane.showInputDialog(""
                + "Digite o codigo do Curso atrelado ao Professor");

                //envio o formulario como parametro, o metodo retorna um boolean informando se a edição foi bem sucedida
                valid = professor.editar(nome, titualacaoMax, endereco, telefone, codCurso, arrayProfessor, arrayCurso);

                //saida, editado ou não editado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Professor editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na edição, não existe um professor com o codigo informado. Ou o codigo do curso é invalido.", "Edição", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case 3:
                  //formulario
                  nome = JOptionPane.showInputDialog(""
                  + "Digite o nome do Professor que deseja deletar.");
  
                  //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                  valid = professor.deletar(nome, arrayProfessor);
  
                  //saida, deletado ou não deletado
                  if(valid == true){
                      JOptionPane.showMessageDialog(null, "Professor deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Erro, não existe um professor com esse codigo. Ou o codigo do curso é invalido.", "Deletar", JOptionPane.ERROR_MESSAGE);
                  }
                break;
            
            case 4:
                professor.visualizar(arrayProfessor);
                break;
            
            case 5:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    //dashboard de curso, cada case é uma tela
    static public void gerenciarCurso(){
        Curso curso = new Curso();

        //criando formulario
        String codCurso, nomeCurso, descricao;
        boolean valid;

        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR CURSO\n\n"
				+ "1 -> Cadastrar Curso\n"
				+ "2 -> Editar Curso\n"
				+ "3 -> Deletar Curso\n"
				+ "4 -> Visualizar Curso\n"
				+ "5 -> Voltar para o menu\n\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                codCurso = JOptionPane.showInputDialog(""
                + "Digite o codigo do Curso");
                nomeCurso = JOptionPane.showInputDialog(""
                + "Digite o nome do Curso");
                descricao = JOptionPane.showInputDialog(""
                + "Digite a descrição do Curso");

                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = curso.cadastrar(codCurso, nomeCurso, descricao, arrayCurso);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Curso cadastrado.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe um curso com mesmo codigo.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                
                break;

            case 2:

                //formulario
                codCurso = JOptionPane.showInputDialog(""
                + "Digite o codigo do Curso que deseja alterar");
                nomeCurso = JOptionPane.showInputDialog(""
                + "Digite o nome do Curso");
                descricao = JOptionPane.showInputDialog(""
                + "Digite a descrição do Curso");

                //envio o formulario como parametro, o metodo retorna um boolean informando se a ediçã0 foi bem sucedida
                valid = curso.cadastrar(codCurso, nomeCurso, descricao, arrayCurso);


                //saida, editado ou não editado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Curso editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na edição, não existe um curso com o codigo informado.", "Edição", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case 3:
                  //formulario
                  codCurso = JOptionPane.showInputDialog(""
                  + "Digite o codigo do Curso que deseja deletar.");
  
                  //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                  valid = curso.deletar(codCurso, arrayCurso);
  
                  //saida, deletado ou não deletado
                  if(valid == true){
                      JOptionPane.showMessageDialog(null, "Curso deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Erro, não existe um curso com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                  }
                break;
            
            case 4:
                curso.visualizar(arrayCurso);
                break;
            
            case 5:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }


    //dashboard de turma, cada case é uma tela
    static public void gerenciarTurma(){
        Turma turma = new Turma();
        Avaliacao avaliacao = new Avaliacao();

        //criando formulario
        String nomeTurma, ano, horario, nomeProfessor, codigoMateria, matricula;
        float nota1, nota2, provaFinal;
        int frequencia;
        byte semestre;
        boolean valid;

        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR TURMA\n\n"
				+ "1 -> Cadastrar Turma\n"
				+ "2 -> Editar Turma\n"
				+ "3 -> Deletar Turma\n"
				+ "4 -> Visualizar Turma\n"
				+ "5 -> Adicionar aluno em turma\n"
                + "6 -> Lançar avaliação\n"
                + "7 -> Visualizar avaliações\n"
                + "8 -> Voltar para o menu\n\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                nomeTurma = JOptionPane.showInputDialog(""
                + "Digite o codigo da Turma");
                ano = JOptionPane.showInputDialog(""
                + "Digite o ano da Turma");
                semestre = Byte.parseByte(JOptionPane.showInputDialog(""
                + "Digite o semestre da Turma"));
                horario = JOptionPane.showInputDialog(""
                + "Digite a data de nascimento da Turma");
                nomeProfessor = JOptionPane.showInputDialog(""
                + "Digite o nome do Professor da turma: ") ;
                codigoMateria = JOptionPane.showInputDialog(""
                + "Digite o codigo da materia da turma: ");
        

                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = turma.abrirTurma(nomeTurma, ano, horario, nomeProfessor, codigoMateria, semestre, arrayProfessor, arrayMateria, arrayTurma);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Turma cadastrada.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe uma turma com mesmo codigo. Ou o curso do professor é diferente do curso da materia.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                
                break;

            case 2:

              //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
              nomeTurma = JOptionPane.showInputDialog(""
              + "Digite o codigo da Turma");
              ano = JOptionPane.showInputDialog(""
              + "Digite o ano da Turma");
              semestre = Byte.parseByte(JOptionPane.showInputDialog(""
              + "Digite o semestre da Turma"));
              horario = JOptionPane.showInputDialog(""
              + "Digite a data de nascimento da Turma");
              nomeProfessor = JOptionPane.showInputDialog(""
              + "Digite o nome do Professor da turma: ") ;
              codigoMateria = JOptionPane.showInputDialog(""
              + "Digite o codigo da materia da turma: ");
    
              valid = turma.editar(nomeTurma, ano, horario, nomeProfessor, codigoMateria, semestre, arrayProfessor, arrayMateria, arrayTurma);
            
                //saida, editado ou não editado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Turma editado.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na edição, verifique se já existe uma turma com o codigo informado. E se o codigo da materia e professor estão corretos.", "Edição", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case 3:
                  //formulario
                  nomeTurma = JOptionPane.showInputDialog(""
                  + "Digite o codigo do Turma que deseja deletar.");
  
                  //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                  valid = turma.deletar(nomeTurma, arrayTurma);
  
                  //saida, deletado ou não deletado
                  if(valid == true){
                      JOptionPane.showMessageDialog(null, "Turma deletado.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Erro na edição, verifique se existe uma turma com o codigo informado. E se o codigo da materia e professor estão corretos.", "Deletar", JOptionPane.ERROR_MESSAGE);
                  }
                break;
            
            case 4:
                turma.visualizar(arrayTurma);
                break;
            
            case 5:
                nomeTurma = JOptionPane.showInputDialog(""
                + "Digite o nome da turma onde deseja adicionar o aluno: ");
                matricula = JOptionPane.showInputDialog(""
                + "Digite a matricula doo aluno: ");

                valid = turma.adicionarAlunos(nomeTurma, matricula, arrayAluno, arrayTurma);

                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Aluno adicionado a turma.", "Adicionar", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na adição, verifique se:\n1 - O nome da turma ou matricula do aluno estavam corretos \n2 - A matricula que você informou é de um aluno que já está na turma", "Adicionar", JOptionPane.ERROR_MESSAGE);
                }
                break;
                
            case 6:
                nomeTurma = JOptionPane.showInputDialog(""
                + "Digite o nome da turma: ");
                matricula = JOptionPane.showInputDialog(""
                + "Digite a matricula do aluno: ");
                nota1 =  Float.parseFloat(JOptionPane.showInputDialog(""
                + "Digite a primeira nota do aluno: "));
                nota2 =  Float.parseFloat(JOptionPane.showInputDialog(""
                + "Digite a segunda nota do aluno: "));
                provaFinal =  Float.parseFloat(JOptionPane.showInputDialog(""
                + "Digite a prova final do aluno: "));
                frequencia = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Digite a frequencia do aluno: "));

                valid = avaliacao.lancarAvaliacao(nota1, nota2, provaFinal, frequencia, nomeTurma, matricula, arrayAluno, arrayTurma, arrayAvaliacao);

                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Avaliação lançada.", "Adicionar", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na adição, verifique se:\n1 - A matricula do aluno está correta \n2 - O nome da turma está correto", "Adicionar", JOptionPane.ERROR_MESSAGE);
                }
                break;

            case 7:
                avaliacao.visualizar(arrayAvaliacao);
                break;

            case 8:

                break;

            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    static public void gerenciarMateria(){
        Materia materia = new Materia();

        //criando formulario
        String nomeMateria, codigoMateria, descricao, cargaHoraria, codCurso;
        boolean valid;

        int op;
        op= Integer.parseInt(JOptionPane.showInputDialog(""
				+ "GERENCIAR MATERIA\n\n"
				+ "1 -> Cadastrar Materia\n"
				+ "2 -> Editar Materia\n"
				+ "3 -> Deletar Materia\n"
				+ "4 -> Visualizar Materia\n"
				+ "5 -> Voltar para o menu\n\n"
				+ "O que deseja fazer?"));

        switch (op) {
            case 1:
                //recolhendo informações para enviar como parametro para o metodo cadastrar, esse aqui um formulario
                nomeMateria = JOptionPane.showInputDialog(""
                + "Digite o nome da materia");
                codigoMateria =  JOptionPane.showInputDialog(""
                + "Digite o codigo da Materia");
                descricao = JOptionPane.showInputDialog(""
                + "Digite a descrição da Materia");
                cargaHoraria = JOptionPane.showInputDialog(""
                + "Digite a carga horaria da Materia");
                codCurso = JOptionPane.showInputDialog(""
                + "Digite o curso da materia");

                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = materia.cadastrar(nomeMateria, codigoMateria, descricao, cargaHoraria, codCurso, arrayMateria, arrayCurso);

                //saida, cadastrado ou não cadastrado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Materia cadastrada.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no cadastrado, já existe uma materia com mesmo codigo. Ou o codigo do curso é invalido.", "Cadastro", JOptionPane.ERROR_MESSAGE);
                }
                break;

            case 2:

                nomeMateria = JOptionPane.showInputDialog(""
                + "Digite o nome da materia que deseja editar");
                codigoMateria =  JOptionPane.showInputDialog(""
                + "Digite o codigo da Materia");
                descricao = JOptionPane.showInputDialog(""
                + "Digite a descrição da Materia");
                cargaHoraria = JOptionPane.showInputDialog(""
                + "Digite a carga horaria da Materia");
                codCurso = JOptionPane.showInputDialog(""
                + "Digite o curso da materia");

                //envio o formulario como parametro, o metodo retorna um boolean informando se o cadastro foi bem sucedido
                valid = materia.editar(nomeMateria, codigoMateria, descricao, cargaHoraria, codCurso, arrayMateria, arrayCurso);

                //saida, editado ou não editado
                if(valid == true){
                    JOptionPane.showMessageDialog(null, "Materia editada.", "Edição", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro na edição, não existe uma materia com o codigo informado. Ou o codigo do curso é invalido.", "Edição", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case 3:
                  //formulario
                  codigoMateria = JOptionPane.showInputDialog(""
                  + "Digite o codigo da Materia que deseja deletar.");
  
                  //envio o formulario como parametro, o metodo retorna um boolean informando se a remoção foi bem sucedida
                  valid = materia.deletar(codigoMateria, arrayMateria);
  
                  //saida, deletado ou não deletado
                  if(valid == true){
                      JOptionPane.showMessageDialog(null, "Materia deletada.", "Deletar", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                      JOptionPane.showMessageDialog(null, "Erro, não existe uma materia com esse codigo.", "Deletar", JOptionPane.ERROR_MESSAGE);
                  }
                break;
            
            case 4:
                materia.visualizar(arrayMateria);
                break;
            
            case 5:
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Essa opção é invalida, digite uma opção válida.", "Menu", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}

