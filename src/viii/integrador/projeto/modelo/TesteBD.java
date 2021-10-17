package viii.integrador.projeto.modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class TesteBD {

	public static void main(String[] args) throws SQLException{
		List<Aviso> avisos = new ArrayList<>();
		
		avisos = ConsultaAviso.consultar();
		System.out.println(avisos.isEmpty());
		for (Aviso aviso : avisos) {
			System.out.println(aviso.getEstado());
			
		}

	}

}
