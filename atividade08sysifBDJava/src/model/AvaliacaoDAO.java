package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import controller.Avaliacao;
import factory.ConnectionFactory;

public class AvaliacaoDAO {
    
    public void save(Avaliacao avaliacao) {
        String sql = "INSERT INTO AVALIACAO( nota1_avaliacao, nota2_avaliacao, prova_final_avaliacao, frequencia_avaliacao, cod_aluno_avaliacao, cod_turma_avaliacao) VALUES ( ?, ?, ?, ?, ?, ?)";
       
        Connection conn = null;
        PreparedStatement pstm = null;
       
        try {
            // criar a conexção com o BD
            conn = ConnectionFactory.createConnectionToMySQL();
           
            // criamos uma preparedStatemente, para executar uma query
            pstm = (PreparedStatement) conn.prepareStatement(sql);
           
            // adicionar os valores que são esperados pela query
            pstm.setFloat(1, avaliacao.getNota1());
            pstm.setFloat(2, avaliacao.getNota2());
            pstm.setFloat(3, avaliacao.getProvaFinal());
            pstm.setInt(4, avaliacao.getFrequencia());
            pstm.setInt(5, avaliacao.getCodAluno());
            pstm.setInt(6, avaliacao.getCodTurma());


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


   public List<Avaliacao> listarAvaliacaos(){
       String sql = "SELECT * FROM AVALIACAO";
       
       List<Avaliacao> avaliacaos = new ArrayList<Avaliacao>();
       
       Connection conn = null;
       PreparedStatement pstm = null;
       
       //Classe que vai recuperar os dados do banco ***SELECT***
       ResultSet rst = null;
       
       try {
           conn = ConnectionFactory.createConnectionToMySQL();
           
           pstm = (PreparedStatement) conn.prepareStatement(sql);
           
           rst = pstm.executeQuery();
       
           while (rst.next()) {
               Avaliacao avaliacao = new Avaliacao();
               //Recuperar o id
               avaliacao.setNota1(rst.getFloat("nota1_avaliacao"));
               avaliacao.setNota2(rst.getFloat("nota2_avaliacao"));
               avaliacao.setProvaFinal(rst.getFloat("prova_final_avaliacao"));
               avaliacao.setFrequencia(rst.getInt("frequencia_avaliacao"));
               avaliacao.setCodAluno(rst.getInt("cod_aluno_avaliacao"));
               avaliacao.setCodTurma(rst.getInt("cod_turma_avaliacao"));
               
               avaliacaos.add(avaliacao);
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

       return avaliacaos;
   }
   

}
