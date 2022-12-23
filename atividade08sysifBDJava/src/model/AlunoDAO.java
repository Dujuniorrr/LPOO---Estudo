package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controller.Aluno;
import factory.ConnectionFactory;

public class AlunoDAO {

     public void save(Aluno aluno) {
 		String sql = "INSERT INTO ALUNO( cod_aluno, nome_aluno, endereco_aluno, telefone_aluno, matricula_aluno, situacao_aluno, cod_curso_aluno) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
		
 		Connection conn = null;
 		PreparedStatement pstm = null;
		
 		try {
 			// criar a conexção com o BD
 			conn = ConnectionFactory.createConnectionToMySQL();
			
 			// criamos uma preparedStatemente, para executar uma query
 			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
 			// adicionar os valores que são esperados pela query
 			pstm.setInt(1, aluno.getCodigo());
			pstm.setString(2, aluno.getNome());
			pstm.setString(3, aluno.getEndereco());
			pstm.setString(4, aluno.getTelefone());
			pstm.setString(5, aluno.getMatricula());
			pstm.setString(6, aluno.getSituacao());
			pstm.setInt(7, aluno.getCodCurso());

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

	 public void edit(int codAluno, String nome, String endereco, String tel, String matricula, String situacao, int codCurso) {
		String sql = "UPDATE ALUNO SET nome_aluno = ?, endereco_aluno = ?, telefone_aluno = ?, matricula_aluno = ?, situacao_aluno = ?, cod_curso_aluno = ?" + "WHERE cod_aluno LIKE ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//criar a conexção com o BD
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma preparedStatemente, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//adicionar os valores que são esperados pela query
			pstm.setString(1, nome);
			pstm.setString(2, endereco);
			pstm.setString(3, tel);
			pstm.setString(4, matricula);
			pstm.setString(5, situacao);
			pstm.setInt(6, codCurso);
			pstm.setInt(7, codAluno);
			
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
	
	public void delete(int cod_aluno) {
		String sql = "DELETE FROM ALUNO WHERE cod_aluno = ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			//criar a conexção com o BD
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma preparedStatemente, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//adicionar os valores que são esperados pela query
			pstm.setInt(1, cod_aluno);
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

	public List<Aluno> listarAlunos(){
		String sql = "SELECT * FROM ALUNO";
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rst = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			rst = pstm.executeQuery();
		
			while (rst.next()) {
				Aluno aluno = new Aluno();
				//Recuperar o id
				aluno.setCodigo(rst.getInt("cod_aluno"));
				aluno.setNome(rst.getString("nome_aluno"));
				aluno.setMatricula(rst.getString("matricula_aluno"));
				aluno.setEndereco(rst.getString("endereco_aluno"));
				aluno.setTelefone(rst.getString("telefone_aluno"));
				aluno.setCodCurso(rst.getInt("cod_curso_aluno"));
				aluno.setSituacao(rst.getString("situacao_aluno"));
				
				alunos.add(aluno);
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

		return alunos;
	}
	

  }


