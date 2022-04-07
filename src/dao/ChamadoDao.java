package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.Chamado;
import util.ConnectionUtil;

public class ChamadoDao {

	private static ChamadoDao instance;
	private Connection con = ConnectionUtil.getConnection();
	
	public static ChamadoDao getInstance() {
		if (instance == null) {
			instance = new ChamadoDao();
		}
		return instance;
	}
	
	public void registrarChamado(Chamado chamado) {
		try {
			
			String sql = "insert into chamado (dataChamado, enderecoAtendimento, distanciaPercorrida, colaborador, veiculo) values (?, ?, ?, ?, ?)"; 
			
			PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setDate(1, java.sql.Date.valueOf(chamado.getDataChamado()));
			pstmt.setString(2, chamado.getEnderecoAtendimento());
			pstmt.setDouble(3, chamado.getDistanciaPercorrida());
			pstmt.setInt(4, chamado.getColaborador().getId());
			pstmt.setInt(5, chamado.getVeiculo().getId());

			pstmt.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
