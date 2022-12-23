package view;
import java.util.Scanner;

import controller.Aluno;
import controller.Avaliacao;
import controller.Curso;
import controller.Disciplina;
import controller.Professor;
import controller.Turma;
import model.AlunoDAO;
import model.AvaliacaoDAO;
import model.CursoDAO;
import model.DisciplinaDAO;
import model.ProfessorDAO;
import model.TurmaDAO;

public class Main {
   static Scanner scan = new Scanner(System.in);
   static Scanner scanString = new Scanner(System.in);

   static CursoDAO cursoDAO = new CursoDAO();
   static DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
   static AlunoDAO alunoDAO = new AlunoDAO();
   static ProfessorDAO professorDAO = new ProfessorDAO();
   static TurmaDAO turmaDAO = new TurmaDAO();
   static AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();

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
                  gerenciarDisciplina();
                  break;

              case 6:
                   System.out.println("Programa fechado. Até mais.");
                   break;
                  
              default:
                  System.out.println( "Essa opção é invalida, digite uma opção válida.");
                   break;  
          }
      }
  }

  //menu inicial
  static public int menu(){
      int op;
     System.out.println(
          "\nSISTEMA ESCOLAR\n\n"
          + "1 -> Gerenciar Aluno\n"
          + "2 -> Gerenciar Professor\n"
          + "3 -> Gerenciar Turma\n"
          + "4 -> Gerenciar Curso\n"
          + "5 -> Gerenciar Disciplina\n"
              + "6 -> Sair\n\n"
          + "O que deseja fazer?");
      op = scan.nextInt();
      return op;
  }

   static public void gerenciarCurso(){
      String nome, descricao;
      int codCurso;
      Curso c = new Curso();

      int op;
      System.out.println(""
          + "GERENCIAR CURSO\n\n"
          + "1 -> Cadastrar Curso\n"
          + "2 -> Editar Curso\n"
          + "3 -> Deletar Curso\n"
          + "4 -> Listar Cursos\n"
          + "5 -> Voltar para o menu\n\n"
          + "O que deseja fazer?");
      op = scan.nextInt();

      switch (op) {
          case 1:
               System.out.println("- Digite o nome do curso: ");
               nome = scanString.nextLine();
               System.out.println("\n- Digite a descrição do curso: ");
               descricao = scanString.nextLine();
               c = new Curso(nome, descricao);
               cursoDAO.save(c);
               break;

          case 2:
               System.out.println("- Digite o codigo do curso que deseja alterar: ");
               codCurso = scan.nextInt();
               System.out.println("- Digite o novo nome do curso: ");
               nome = scanString.nextLine();
               System.out.println("\n- Digite a nova descrição do curso: ");
               descricao = scanString.nextLine();
               cursoDAO.edit(codCurso, nome, descricao);
               break;
          
          case 3:
               System.out.println("- Digite o codigo do curso que deseja deletar: ");
               codCurso = scan.nextInt();
               cursoDAO.delete(codCurso);
               break;
          
          case 4:
             listarCursos();
              break;
          
          case 5:
              break;
              
          default:
              System.out.println( "Essa opção é invalida, digite uma opção válida.");
              break;
      }
   }

   static public void gerenciarDisciplina(){
      String nome, descricao;
      int codDisciplina, hr, codCurso;
      Disciplina d = new Disciplina();

      int op;
      System.out.println(""
          + "GERENCIAR DISCIPLINA\n\n"
          + "1 -> Cadastrar Disciplina\n"
          + "2 -> Editar Disciplina\n"
          + "3 -> Deletar Disciplina\n"
          + "4 -> Listar Disciplinas\n"
          + "5 -> Voltar para o menu\n\n"
          + "O que deseja fazer?");
      op = scan.nextInt();

      switch (op) {
          case 1:
               System.out.println("- Digite o nome do curso: ");
               nome = scanString.nextLine();
               System.out.println("\n- Digite a descrição do curso: ");
               descricao = scanString.nextLine();
               System.out.println("\n- Digite a carga horaria: ");
               hr = scan.nextInt();
               System.out.println("\n- Digite o codigo do curso da Disciplina: ");
               codCurso = scan.nextInt();
               d = new Disciplina(nome, descricao, hr, codCurso);
               disciplinaDAO.save(d);
               break;

          case 2:
               System.out.println("- Digite o codigo do curso que deseja alterar: ");
               codDisciplina = scan.nextInt();
               System.out.println("- Digite o novo nome do curso: ");
               nome = scanString.nextLine();
               System.out.println("\n- Digite a nova descrição do curso: ");
               descricao = scanString.nextLine();
               System.out.println("\n- Digite a nova carga horaria: ");
               hr = scan.nextInt();
               System.out.println("\n- Digite o novo codigo do curso da Disciplina: ");
               codCurso = scan.nextInt();
               disciplinaDAO.edit(codDisciplina, nome, descricao, hr, codCurso);
               break;
          
          case 3:
               System.out.println("- Digite o codigo do curso que deseja deletar: ");
               codDisciplina = scan.nextInt();
               disciplinaDAO.delete(codDisciplina);
               break;
          
          case 4:
              listarDisciplinas();
              break;
          
          case 5:
              break;
              
          default:
              System.out.println( "Essa opção é invalida, digite uma opção válida.");
              break;
      }
   }
    

   static public void gerenciarAluno(){
      String nome, endereco, telefone, matricula, situacao;
      int codAluno,codCurso;
      Aluno a = new Aluno();

      int op;
      System.out.println(""
          + "GERENCIAR ALUNO\n\n"
          + "1 -> Cadastrar Aluno\n"
          + "2 -> Editar Aluno\n"
          + "3 -> Deletar Aluno\n"
          + "4 -> Listar Alunos\n"
          + "5 -> Voltar para o menu\n\n"
          + "O que deseja fazer?");
      op = scan.nextInt();

      switch (op) {
          case 1:
               System.out.println("- Digite o nome do aluno: ");
               nome = scanString.nextLine();
               System.out.println("\n- Digite a matricula ição do aluno: ");
               matricula = scanString.nextLine();
               System.out.println("\n- Digite o endereco do aluno: ");
               endereco = scanString.nextLine();
               System.out.println("\n- Digite o telefone do aluno: ");
               telefone = scanString.nextLine();
               System.out.println("\n- Digite a situação do aluno: ");
               situacao = scanString.nextLine();
               System.out.println("\n- Digite o codigo do curso da Aluno: ");
               codCurso = scan.nextInt();
               a = new Aluno(nome, endereco, telefone, codCurso, matricula, situacao);
              alunoDAO.save(a);
               break;

          case 2:
               System.out.println("- Digite o codigo do aluno que deseja alterar: ");
               codAluno = scan.nextInt();
               System.out.println("- Digite o novo nome do aluno: ");
               nome = scanString.nextLine();
               System.out.println("\n- Digite a nova matricula ição do aluno: ");
               matricula = scanString.nextLine();
               System.out.println("\n- Digite o novo endereco do aluno: ");
               endereco = scanString.nextLine();
               System.out.println("\n- Digite o novo telefone do aluno: ");
               telefone = scanString.nextLine();
               System.out.println("\n- Digite a nova situação do aluno: ");
               situacao = scanString.nextLine();
               System.out.println("\n- Digite o novo codigo do curso da Aluno: ");
               codCurso = scan.nextInt();
               alunoDAO.edit(codAluno, nome, endereco, telefone, matricula, situacao, codCurso);
               break;
          
          case 3:
               System.out.println("- Digite o codigo do Aluno que deseja deletar: ");
               codAluno = scan.nextInt();
               alunoDAO.delete(codAluno);
               break;
          
          case 4:
              listarAlunos();
              break;
          
          case 5:
              break;
              
          default:
              System.out.println( "Essa opção é invalida, digite uma opção válida.");
              break;
      }
   }

   static public void gerenciarProfessor(){
      String nome, endereco, telefone, titulacaoMax;
      int codProfessor,codCurso;
      Professor p = new Professor();

      int op;
      System.out.println(""
          + "GERENCIAR PROFESSOR\n\n"
          + "1 -> Cadastrar Professor\n"
          + "2 -> Editar Professor\n"
          + "3 -> Deletar Professor\n"
          + "4 -> Listar Professores\n"
          + "5 -> Voltar para o menu\n\n"
          + "O que deseja fazer?");
      op = scan.nextInt();

      switch (op) {
          case 1:
               System.out.println("- Digite o nome do professor: ");
               nome = scanString.nextLine();
               System.out.println("\n- Digite a titulação Maxima do professor: ");
               titulacaoMax = scanString.nextLine();
               System.out.println("\n- Digite o endereco do professor: ");
               endereco = scanString.nextLine();
               System.out.println("\n- Digite o telefone do professor: ");
               telefone = scanString.nextLine();
               System.out.println("\n- Digite o codigo do curso da Professor: ");
               codCurso = scan.nextInt();
               p = new Professor(nome, endereco, telefone, codCurso, titulacaoMax);
               professorDAO.save(p);
               break;

          case 2:
               System.out.println("- Digite o codigo do professor que deseja alterar: ");
               codProfessor = scan.nextInt();
               System.out.println("- Digite o novo nome do professor: ");
               nome = scanString.nextLine();
               System.out.println("\n- Digite a nova titulação Máxima do professor: ");
               titulacaoMax = scanString.nextLine();
               System.out.println("\n- Digite o novo endereco do professor: ");
               endereco = scanString.nextLine();
               System.out.println("\n- Digite o novo telefone do professor: ");
               telefone = scanString.nextLine();
               System.out.println("\n- Digite o novo codigo do curso da Professor: ");
               codCurso = scan.nextInt();
               professorDAO.edit(codProfessor, nome, endereco, telefone, titulacaoMax, codCurso);
               break;
          
          case 3:
               System.out.println("- Digite o codigo do Professor que deseja deletar: ");
               codProfessor = scan.nextInt();
               professorDAO.delete(codProfessor);
               break;
          
          case 4:
              listarProfessores();
              break;
          
          case 5:
              break;
              
          default:
              System.out.println( "Essa opção é invalida, digite uma opção válida.");
              break;
      }
   }
   
   static public void gerenciarTurma(){
         int codTurma, codProf, codDisciplina, codAluno, frequencia, ano, semestre;
         String horario;
         float nota1, nota2, provaFinal;
         Turma t = new Turma();
         Avaliacao a = new Avaliacao();
         
         int op;
         System.out.println(""
             + "GERENCIAR TURMA\n\n"
             + "1 -> Cadastrar Turma\n"
             + "2 -> Editar Turma\n"
             + "3 -> Deletar Turma\n"
             + "4 -> Visualizar Turma\n"
             + "5 -> Adicionar aluno em turma\n"
             + "6 > Visualizar alunos em turma\n"
             + "7 -> Lançar avaliação\n"
             + "8 -> Visualizar avaliações\n"
             + "9 -> Voltar para o menu\n\n"
             + "O que deseja fazer?");
         op = scan.nextInt();
 
         switch (op) {
             case 1:
                  System.out.println("\n- Digite o ano da turma: ");
                  ano = scan.nextInt();
                  System.out.println("\n- Digite o semestre da turma: ");
                  semestre = scan.nextInt();
                  System.out.println("\n- Digite o horario de aula da turma: ");
                  horario = scanString.nextLine();
                  System.out.println("\n- Digite o codigo do professor: ");
                  codProf = scan.nextInt();
                  System.out.println("\n- Digite o codigo da disciplina: ");
                  codDisciplina = scan.nextInt();
                  t = new Turma(ano, semestre, horario, codDisciplina, codProf);
                  turmaDAO.save(t);
                  break;
 
             case 2:
                  System.out.println("\n- Digite o codigo da turma que deseja editar: ");
                  codTurma = scan.nextInt();
                  System.out.println("- Digite o novo ano da turma: ");
                  ano = scan.nextInt();
                  System.out.println("\n- Digite o novo semestre da turma: ");
                  semestre = scan.nextInt();
                  System.out.println("\n- Digite o novo horario de aula da turma: ");
                  horario = scanString.nextLine();
                  System.out.println("\n- Digite o novo codigo do professor: ");
                  codProf = scan.nextInt();
                  System.out.println("\n- Digite o novo codigo da disciplina: ");
                  codDisciplina = scan.nextInt();
                  turmaDAO.edit(codTurma, ano, semestre, horario, codProf, codDisciplina);
                  break;
             
             case 3:
                  System.out.println("- Digite o codigo da Turma que deseja deletar: ");
                  codTurma = scan.nextInt();
                  turmaDAO.delete(codTurma);
                  break;
             
             case 4:
                 listarTurmas();
                 break;
             
             case 5:
                 System.out.println("\n- Digite o codigo do aluno: ");
                 codAluno = scan.nextInt();
                 System.out.println("\n- DIgite o codigo da turma: ");
                 codTurma = scan.nextInt();
                 turmaDAO.saveAluno(codTurma, codAluno);
                 break;
                 
             case 6:
                 listarAlunosPorTurma();
                 break;
 
             case 7:
                  System.out.println("\n- Digite a primeira nota: ");
                  nota1 = scan.nextFloat();
                  System.out.println("\n- Digite a segunda nota: ");
                  nota2 = scan.nextFloat();
                  System.out.println("\n- Digite a nota da prova final do aluno: ");
                  provaFinal = scan.nextFloat();
                  System.out.println("\n- Digite a frequencia do aluno: ");
                  frequencia = scan.nextInt();
                  System.out.println("\n- Digite o codigo do aluno: ");
                  codAluno = scan.nextInt();
                  System.out.println("Digite o codigo da turma: ");
                  codTurma = scan.nextInt();
                  a = new Avaliacao(nota1, nota2, provaFinal, frequencia, codAluno, codTurma);
                  avaliacaoDAO.save(a);
               break;
 
             case 8:
                  listarAvaliacao();
                 break;
 
            case 9:
                 break;

             default:
                 System.out.println( "Essa opção é invalida, digite uma opção válida.");
                 break;
         }
     }

   static public void listarCursos(){
      System.out.println("\n------------------------  CURSOS ----------------------------");
      for(int i = 0; i < cursoDAO.listarCursos().size(); i++) {
			System.out.println("CODIGO: "+ cursoDAO.listarCursos().get(i).getCodCurso() +" -- NOME: " + cursoDAO.listarCursos().get(i).getNomeCurso() +" -- DESCRIÇÃO: "+ cursoDAO.listarCursos().get(i).getDescricaoCurso());
		}
   }

     
   static public void listarDisciplinas(){
      System.out.println("\n------------------------ DISCIPLINAS ----------------------------");
      for(int i = 0; i < disciplinaDAO.listarDisciplinas().size(); i++) {
			System.out.println("CODIGO: "+ disciplinaDAO.listarDisciplinas().get(i).getCodigo() +" -- NOME: " + disciplinaDAO.listarDisciplinas().get(i).getNome() +" -- DESCRIÇÃO: "+ disciplinaDAO.listarDisciplinas().get(i).getDescricao() + " -- CARGA HORARIA: " + disciplinaDAO.listarDisciplinas().get(i).getCargaHoraria()); 
		}
   }

      
   static public void listarAlunos(){
      System.out.println("\n------------------------ ALUNOS ----------------------------");
      for(int i = 0; i < alunoDAO.listarAlunos().size(); i++) {
			System.out.println("CODIGO: " + alunoDAO.listarAlunos().get(i).getCodigo() + " -- NOME: " + alunoDAO.listarAlunos().get(i).getNome() + " -- MATRICULA: " + alunoDAO.listarAlunos().get(i).getMatricula() + " -- ENDEREÇO: " + alunoDAO.listarAlunos().get(i).getEndereco() + " -- TELEFONE: " + alunoDAO.listarAlunos().get(i).getTelefone() + " -- CODIGO DO CURSO: " + alunoDAO.listarAlunos().get(i).getCodCurso() + " -- SITUAÇÃO: " + alunoDAO.listarAlunos().get(i).getSituacao()); 
		}
   }

   static public void listarProfessores(){
      System.out.println("\n------------------------ PROFESSORES ----------------------------");
      for(int i = 0; i < professorDAO.listarProfessors().size(); i++) {
			System.out.println("CODIGO: " + professorDAO.listarProfessors().get(i).getCodigo() + " -- NOME: " + professorDAO.listarProfessors().get(i).getNome() + " -- TITULAÇÃO MÀXIMA: " + professorDAO.listarProfessors().get(i).getTitualacaoMax() + " -- ENDEREÇO: " + professorDAO.listarProfessors().get(i).getEndereco() + " -- TELEFONE: " + professorDAO.listarProfessors().get(i).getTelefone() + " -- CODIGO DO CURSO: " + professorDAO.listarProfessors().get(i).getCodCurso() ); 
		}
   }

   static public void listarTurmas(){
      System.out.println("\n------------------------ TURMAS ----------------------------");
      for(int i = 0; i < turmaDAO.listarTurmas().size(); i++) {
			System.out.println("CODIGO: " + turmaDAO.listarTurmas().get(i).getCodTurma() + " -- ANO: " + turmaDAO.listarTurmas().get(i).getAno() + " -- SEMESTRE: " + turmaDAO.listarTurmas().get(i).getSemestre() + " -- HORARIO: " + turmaDAO.listarTurmas().get(i).getHorario() + " -- CODIGO DA DISCIPLINA " + turmaDAO.listarTurmas().get(i).getCodDisciplina() + " -- CODIGO DO PROFESSOR: " + turmaDAO.listarTurmas().get(i).getCodProfessor() ); 
		}
   }

   static public void listarAvaliacao(){
      System.out.println("\n------------------------ TURMAS ----------------------------");
      for(int i = 0; i < avaliacaoDAO.listarAvaliacaos().size(); i++) {
			System.out.println("NOTA 1: " + avaliacaoDAO.listarAvaliacaos().get(i).getNota1() + " -- NOTA 2: " + avaliacaoDAO.listarAvaliacaos().get(i).getNota2() + " -- PROVA FINAL: " + avaliacaoDAO.listarAvaliacaos().get(i).getProvaFinal() + " -- FREQUENCIA: " + avaliacaoDAO.listarAvaliacaos().get(i).getFrequencia() + " -- CODIGO Do ALUNO " + avaliacaoDAO.listarAvaliacaos().get(i).getCodAluno() + " -- CODIGO DA TURMA: " + avaliacaoDAO.listarAvaliacaos().get(i).getCodTurma() ); 
		}
   }

   static public void listarAlunosPorTurma(){
      System.out.println("\n------------------------ TURMAS ----------------------------");
      for(int i = 0; i < turmaDAO.listarTurmas().size(); i++) {
			System.out.println("CODIGO: " + turmaDAO.listarTurmas().get(i).getCodTurma());
         for(int x = 0; x < turmaDAO.listarALunosPorTurma().get(i).getAlunos().size(); x++){
            System.out.println("NOME DO ALUNO: " + turmaDAO.listarALunosPorTurma().get(i).getAlunos().get(x).getNome() + " -- MATRICULA DO ALUNO: " + turmaDAO.listarALunosPorTurma().get(i).getAlunos().get(x).getMatricula());
         }
		}
   }
}
