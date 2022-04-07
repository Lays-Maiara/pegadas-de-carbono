package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Colaborador;
import util.ConnectionUtil;

public class ColaboradorDao {
	
	private static ColaboradorDao instance;
	private Connection con = ConnectionUtil.getConnection();
	
	// Singleton
	
	public static ColaboradorDao getInstance(){
		if (instance == null) {
			instance = new ColaboradorDao();
		}
		return instance;
	}
	
	public void salvar(Colaborador colaborador) {
		try {
			String sql = "isert into colaborador (nome, endereco, cpf, cargo, salario, telefone, cnhB) values (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colaborador.getNome());
			pstmt.setString(2, colaborador.getEndereco());
			pstmt.setString(3, colaborador.getCpf());
			pstmt.setString(4, colaborador.getCargo());
			pstmt.setDouble(5, colaborador.getSalario());
			pstmt.setString(6, colaborador.getTelefone());
			pstmt.setString(7, String.valueOf(colaborador.getCnhB()));
			pstmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Colaborador colaborador) {
		try {
			String sql = "update colaborador set nome = ?, endereco, cpf = ?, cargo = ?, salario = ?, telefone = ?, cnhB = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colaborador.getNome());
			pstmt.setString(2, colaborador.getEndereco());
			pstmt.setString(3, colaborador.getCpf());
			pstmt.setString(4, colaborador.getCargo());
			pstmt.setDouble(5, colaborador.getSalario());
			pstmt.setString(6, colaborador.getTelefone());
			pstmt.setString(7, String.valueOf(colaborador.getCnhB()));
			pstmt.setInt(8, colaborador.getId());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int idColaborador) {
		try {
			String sql = "delete from colaborador where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idColaborador);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Colaborador> listar(){
		List<Colaborador> listaColaboradores = new ArrayList<>();
		try {
			String sql = "select * from colaborador";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Colaborador c = new Colaborador(
						rs.getString("nome"), 
						rs.getString("endereco"),
						rs.getString("cpf"),
						rs.getString("cargo"),
						rs.getDouble("salario"),
						rs.getString("telefone"),
						rs.getString("cnhB").charAt(0)
					);
				c.setId(rs.getInt("id"));
				listaColaboradores.add(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaColaboradores;
	}
}
