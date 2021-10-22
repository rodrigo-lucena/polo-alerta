package viii.integrador.projeto.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultaAviso {
	public static List<Aviso> consultar() throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM avisos WHERE situacao=1";
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Aviso> avisos = new ArrayList<Aviso>();
		
		while (resultado.next()) {
			int index = resultado.getInt("idaviso");
			String empresa = resultado.getString("empresa");
			String aviso = resultado.getString("aviso");
			int situacao = resultado.getInt("situacao");
			avisos.add(new Aviso(index,empresa,aviso,situacao));
		}		
		conexao.close();
		return avisos;
	}
	// Criar busca de eventos cuja situaca = 1

}
