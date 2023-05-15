import java.sql.*;


public class Programa {
	
	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
		
		//1 abrir a conexão com banco
		Connection con = DriverManger.getConnertion(url, usuario, senha);
		
		//2 criar o comando e exercutar a consulta
		Statement comando = con.createStatement();
		ResulSet.resultado = comando.executeQuery("select * from pessoa");
		
		
	}

}
