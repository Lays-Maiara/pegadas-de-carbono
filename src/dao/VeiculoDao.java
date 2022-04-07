package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Veiculo;
import util.ConnectionUtil;

public class VeiculoDao {

	private static VeiculoDao instance;
	private Connection con = ConnectionUtil.getConnection();
	
	public static VeiculoDao getInstance() {
		if (instance == null) {
			instance = new VeiculoDao();
		}
		return instance;
	}
	
	public void salvar(Veiculo veiculo) {
		try {
			String sql = "insert into veiculo (placa, modelo, ano, veiculoDisponivel, consumoKmLitro) values (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, veiculo.getPlaca());
			pstmt.setString(2, veiculo.getModelo());
			pstmt.setInt(3, veiculo.getAno());
			pstmt.setString(4, String.valueOf(veiculo.getVeiculoDisponivel()));
			pstmt.setString(5, veiculo.getConsumoKmLitro());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Veiculo veiculo) {
		try {
			String sql = "update veiculo set placa = ?, modelo = ?, ano = ?, veiculoDisponivel = ?, consumoKmLitro = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, veiculo.getPlaca());
			pstmt.setString(2, veiculo.getModelo());
			pstmt.setInt(3, veiculo.getAno());
			pstmt.setString(4, String.valueOf(veiculo.getVeiculoDisponivel()));
			pstmt.setString(5, veiculo.getConsumoKmLitro());
			pstmt.setInt(6, veiculo.getId());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int idVeiculo) {
		try {
			String sql = "delete from veiculo where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idVeiculo);
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Veiculo> listar(){
		List<Veiculo> listaVeiculos = new ArrayList<>();
		try {
			String sql = "select * from veiculo";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Veiculo v = new Veiculo(
						rs.getString("placa"),
						rs.getString("modelo"),
						rs.getInt("ano"),
						rs.getString("veiculoDisponivel").charAt(0),
						rs.getString("consumoKmLitro")
						);
				v.setId(rs.getInt("id"));
				
				listaVeiculos.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaVeiculos;
	}	
}
