package factory;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	// nome
	private static final String USERNAME = "sqluser";
	// senha
	private static final String PASSWORD = "password";
	//caminho do banco de dados, porta
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/SISTEMA_ESCOLAR?characterEncoding=latin1&useConfigs=maxPerformance";
	/*Conexão com o banco de dados
	 * 
	 * */
	public static Connection createConnectionToMySQL() throws Exception{
		//faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver"); 
		
		Connection connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	public static void main(String[] args) throws Exception {
		
		//recuperar uma conexão com o banco de dados;
		Connection con = createConnectionToMySQL();
		
		//testar se a conexção é nula
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}
	public Connection getConnection() {
		return null;
	}
}
