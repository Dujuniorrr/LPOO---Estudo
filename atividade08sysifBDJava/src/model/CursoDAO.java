package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controller.Curso;
import factory.ConnectionFactory;

public class CursoDAO {

    public void save(Curso curso) {
 		String sql = "INSERT INTO CURSO(nome_curso, descricao_curso) VALUES (?, ?)";
		
 		Connection conn = null;
 		PreparedStatement pstm = null;
		
 		try {
 			// criar a conexção com o BD
 			conn = ConnectionFactory.createConnectionToMySQL();
			
 			// criamos uma preparedStatemente, para executar uma query
 			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
 			// adicionar os valores que são esperados pela query
 			pstm.setString(1, curso.getNomeCurso());
 			pstm.setString(2, curso.getDescricaoCurso());
			
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

	 public void edit(int codCurso, String nome, String desc) {
		String sql = "UPDATE CURSO SET nome_curso = ?, descricao_curso = ? " + "WHERE cod_Curso LIKE ?;";
		
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
			pstm.setInt(3, codCurso);
			
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
	
	public void delete(int codCurso) {
		String sql = "DELETE FROM CURSO WHERE cod_curso = ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			//criar a conexção com o BD
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma preparedStatemente, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//adicionar os valores que são esperados pela query
			pstm.setInt(1, codCurso);
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

	public List<Curso> listarCursos(){
		String sql = "SELECT * FROM CURSO";
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco ***SELECT***
		ResultSet rst = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			rst = pstm.executeQuery();
		
			while (rst.next()) {
				Curso curso = new Curso();
				//Recuperar o id
				curso.setCodCurso(rst.getInt("cod_curso"));
				curso.setNomeCurso(rst.getString("nome_curso"));
				curso.setDescricaoCurso(rst.getString("descricao_curso"));
				
				cursos.add(curso);
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

		return cursos;
	}
	

  }


