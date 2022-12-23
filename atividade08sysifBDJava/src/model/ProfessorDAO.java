package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controller.Professor;
import factory.ConnectionFactory;

public class ProfessorDAO {

    public void save(Professor professor) {
 		String sql = "INSERT INTO PROFESSOR( cod_professor, nome_professor, endereco_professor, telefone_professor,titulacao_max_professor, cod_curso_professor) VALUES ( ?, ?, ?, ?, ?, ?)";
		
 		Connection conn = null;
 		PreparedStatement pstm = null;
		
 		try {
 			// criar a conexção com o BD
 			conn = ConnectionFactory.createConnectionToMySQL();
			
 			// criamos uma preparedStatemente, para executar uma query
 			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
 			// adicionar os valores que são esperados pela query
 			pstm.setInt(1, professor.getCodigo());
			pstm.setString(2, professor.getNome());
			pstm.setString(3, professor.getEndereco());
			pstm.setString(4, professor.getTelefone());
			pstm.setString(5, professor.getTitualacaoMax());
			pstm.setInt(6, professor.getCodCurso());

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

	 public void edit(int codProfessor, String nome, String endereco, String tel, String titulacaoMax, int codCurso) {
		String sql = "UPDATE PROFESSOR SET nome_professor = ?, endereco_professor = ?, telefone_professor = ?, titulacao_max_professor = ?, cod_curso_professor = ?" + "WHERE cod_professor LIKE ?;";
		
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
			pstm.setString(4, titulacaoMax);
			pstm.setInt(5, codCurso);
			pstm.setInt(6, codProfessor);
			
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
	
	public void delete(int cod_professor) {
		String sql = "DELETE FROM PROFESSOR WHERE cod_professor = ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			//criar a conexção com o BD
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma preparedStatemente, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//adicionar os valores que são esperados pela query
			pstm.setInt(1, cod_professor);
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

	 public List<Professor> listarProfessors(){
		String sql = "SELECT * FROM PROFESSOR";
		
		List<Professor> professors = new ArrayList<Professor>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rst = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			rst = pstm.executeQuery();
		
			while (rst.next()) {
				Professor professor = new Professor();
				//Recuperar o id
				professor.setCodigo(rst.getInt("cod_professor"));
				professor.setNome(rst.getString("nome_professor"));
				professor.setTitualacaoMax(rst.getString("titulacao_max_professor"));
				professor.setEndereco(rst.getString("endereco_professor"));
				professor.setTelefone(rst.getString("telefone_professor"));
				professor.setCodCurso(rst.getInt("cod_curso_professor"));
				
				professors.add(professor);
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
		
		return professors;
	}
	

  }


