package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controller.Disciplina;
import factory.ConnectionFactory;

public class DisciplinaDAO {

     public void save(Disciplina disciplina) {
 		String sql = "INSERT INTO DISCIPLINA( nome_disciplina, descricao_disciplina, carga_horario, cod_curso_disciplina) VALUES ( ?, ?, ?, ?)";
		
 		Connection conn = null;
 		PreparedStatement pstm = null;
		
 		try {
 			// criar a conexção com o BD
 			conn = ConnectionFactory.createConnectionToMySQL();
			
 			// criamos uma preparedStatemente, para executar uma query
 			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
 			// adicionar os valores que são esperados pela query
 			pstm.setString(1, disciplina.getNome());
 			pstm.setString(2, disciplina.getDescricao());
			pstm.setInt(3, disciplina.getCargaHoraria());
			pstm.setInt(4, disciplina.getCodCurso());

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

	 public void edit(int codDisciplina, String nome, String desc, int hr, int codCurso) {
		String sql = "UPDATE DISICPLINA SET nome_disciplina = ?, descricao_disciplina = ?, carga_horario = ?, cod_curso_disciplina = ?" + "WHERE cod_disciplina LIKE ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//criar a conexção com o BD
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma preparedStatemente, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//adicionar os valores que são esperados pela query
			pstm.setString(1, nome);
			pstm.setString(2, desc);
			pstm.setInt(3, hr);
			pstm.setInt(4, codCurso);
			pstm.setInt(5, codDisciplina);
			
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
	
	public void delete(int cod_disciplina) {
		String sql = "DELETE FROM DISCIPLINA WHERE cod_disciplina = ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			//criar a conexção com o BD
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma preparedStatemente, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//adicionar os valores que são esperados pela query
			pstm.setInt(1, cod_disciplina);
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

	public List<Disciplina> listarDisciplinas(){
		String sql = "SELECT * FROM DISCIPLINA";
		
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rst = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			rst = pstm.executeQuery();
		
			while (rst.next()) {
				Disciplina disciplina = new Disciplina();
				//Recuperar o id
				disciplina.setCodCurso(rst.getInt("cod_disciplina"));
				disciplina.setNome(rst.getString("nome_disciplina"));
				disciplina.setDescricao(rst.getString("descricao_disciplina"));
				disciplina.setCargaHoraria(rst.getInt("carga_horario"));
				disciplina.setCodCurso(rst.getInt("cod_curso_disciplina"));
				
				disciplinas.add(disciplina);
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

		return disciplinas;
	}
	

  }


