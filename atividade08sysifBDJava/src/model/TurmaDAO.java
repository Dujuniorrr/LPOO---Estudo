package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controller.Aluno;
import controller.Turma;
import factory.ConnectionFactory;

public class TurmaDAO {

     public void save(Turma turma) {
 		String sql = "INSERT INTO TURMA(ano_turma, semeste_turma, horario_turma, cod_professor_turma, cod_disciplina_turma) VALUES ( ?, ?, ?, ?, ?)";
		
 		Connection conn = null;
 		PreparedStatement pstm = null;
		
 		try {
 			// criar a conexção com o BD
 			conn = ConnectionFactory.createConnectionToMySQL();
			
 			// criamos uma preparedStatemente, para executar uma query
 			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
 			// adicionar os valores que são esperados pela query
			pstm.setInt(1, turma.getAno());
			pstm.setInt(2, turma.getSemestre());
			pstm.setString(3, turma.getHorario());
			pstm.setInt(4, turma.getCodProfessor());
			pstm.setInt(5, turma.getCodDisciplina());

 			// Executar a query
 			pstm.execute();
            System.out.println("\nAdicionado com sucesso.");
 		}catch(Exception e) {
 			e.printStackTrace();
 		}finally {
			
 			// fechar as conexões
 			try {
 				if(pstm!=null) {
 					pstm.close();
 				}
 				if(conn!=null) {
 					conn.close();
 				}
 			}catch(Exception e){
 				e.printStackTrace();
 			}
 		}
 	}

	 public void edit(int codTurma, int ano, int semestre, String horario, int codProf, int codDisciplina) {
		String sql = "UPDATE TURMA SET ano_turma = ?, semeste_turma = ?, horario_turma = ?, cod_professor_turma = ?, cod_disciplina_turma = ?" + "WHERE cod_turma LIKE ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//criar a conexção com o BD
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma preparedStatemente, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//adicionar os valores que são esperados pela query
			pstm.setInt(1, ano);
			pstm.setInt(2, semestre);
			pstm.setString(3, horario);
			pstm.setInt(4, codProf);
			pstm.setInt(5, codDisciplina);
			pstm.setInt(6, codTurma);
			
			//Executar a query
			pstm.execute();
			System.out.println("\nEditado com sucesso.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//fechar as conexões
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void delete(int cod_turma) {
		String sql = "DELETE FROM TURMA WHERE cod_turma = ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			//criar a conexção com o BD
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma preparedStatemente, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//adicionar os valores que são esperados pela query
			pstm.setInt(1, cod_turma);
			//Executar a query
			pstm.execute();
			System.out.println("\nDados deletados com sucesso.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//fechar as conexões
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public List<Turma> listarTurmas(){
		String sql = "SELECT * FROM TURMA";
		
		List<Turma> turmas = new ArrayList<Turma>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rst = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			rst = pstm.executeQuery();
		
			while (rst.next()) {
				Turma turma = new Turma();
				//Recuperar o id
				turma.setCodTurma(rst.getInt("cod_turma"));
				turma.setAno(rst.getInt("ano_turma"));
				turma.setSemestre(rst.getInt("semeste_turma"));
				turma.setHorario(rst.getString("horario_turma"));
				turma.setCodDisciplina(rst.getInt("cod_disciplina_turma"));
                turma.setCodProfessor(rst.getInt("cod_professor_turma"));
				
				turmas.add(turma);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rst!=null) {
					rst.close();
				}
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}
		}

		return turmas;
	}

    public void saveAluno(int codTurma, int codAluno) {
        String sql = "INSERT INTO ALUNO_TURMA(cod_aluno, cod_turma) VALUES ( ?, ?)";
       
        Connection conn = null;
        PreparedStatement pstm = null;
       
        try {
            // criar a conexção com o BD
            conn = ConnectionFactory.createConnectionToMySQL();
           
            // criamos uma preparedStatemente, para executar uma query
            pstm = (PreparedStatement) conn.prepareStatement(sql);
           
            // adicionar os valores que são esperados pela query
           pstm.setInt(1, codAluno);
           pstm.setInt(2, codTurma);;

            // Executar a query
            pstm.execute();
           System.out.println("\nAdicionado com sucesso.");
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
           
            // fechar as conexões
            try {
                if(pstm!=null) {
                    pstm.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public List<Turma> listarALunosPorTurma(){
		String sql = "SELECT * FROM TURMA";
        String sql2 = "SELECT * FROM ALUNO as a, ALUNO_TURMA as b, TURMA as c WHERE a.cod_aluno = b.cod_aluno AND c.cod_turma = b.cod_turma";
		
		List<Turma> turmas = new ArrayList<Turma>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		Connection conn = null;
		PreparedStatement pstm = null;
        PreparedStatement pstm2 = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rst = null;
        ResultSet rst2 = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm2 = (PreparedStatement) conn.prepareStatement(sql2);
			
			rst = pstm.executeQuery();
            rst2 = pstm2.executeQuery();

			while (rst.next()) {
				Turma turma = new Turma();
				//Recuperar o id
				turma.setCodTurma(rst.getInt("cod_turma"));
				turma.setAno(rst.getInt("ano_turma"));
				turma.setSemestre(rst.getInt("semeste_turma"));
				turma.setHorario(rst.getString("horario_turma"));
				turma.setCodDisciplina(rst.getInt("cod_disciplina_turma"));
                turma.setCodProfessor(rst.getInt("cod_professor_turma"));
				while(rst2.next()){
                    Aluno aluno = new Aluno();
                    aluno.setCodigo(rst2.getInt("cod_aluno"));
                    aluno.setNome(rst2.getString("nome_aluno"));
                    aluno.setMatricula(rst2.getString("matricula_aluno"));
                    alunos.add(aluno);
					turma.setAlunos(alunos);
                }
				turmas.add(turma);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rst!=null) {
					rst.close();
				}
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}
		}

		return turmas;
	}
  }



