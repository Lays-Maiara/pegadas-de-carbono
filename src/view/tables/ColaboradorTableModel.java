package view.tables;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Colaborador;
import model.Veiculo;

public class ColaboradorTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private static final int COL_NOME = 0;
	private static final int COL_ENDERECO = 1;
	private static final int COL_CPF = 2;
	private static final int COL_CARGO = 3;
	private static final int COL_SALARIO = 4;
	private static final int COL_TELEFONE = 5;
	private static final int COL_CNH_B = 6;

	

	private List<Colaborador> valores;       

	public ColaboradorTableModel(List<Colaborador> valores) {
		this.valores = new ArrayList<Colaborador>(valores);
	}

	public int getRowCount() {
		
		return valores.size();
	}

	public int getColumnCount() {
		return 7;
	}

	public String getColumnName(int column) {
		
		if (column == COL_NOME) return "Nome";
		if (column == COL_ENDERECO) return "Endereço";
		if (column == COL_CPF) return "CPF";
		if (column == COL_CARGO) return "Cargo";
		if (column == COL_SALARIO) return "Salário";
		if (column == COL_TELEFONE) return "Telefone";
		if (column == COL_CNH_B) return "CNH B";

		return ""; 
	}

	public Object getValueAt(int row, int column) {
		Colaborador colaborador = valores.get(row);
		if (column == COL_NOME) {
			return colaborador.getNome();
		} else if (column == COL_ENDERECO) { 
			return colaborador.getEndereco();
		} else if (column == COL_CPF) { 
			return colaborador.getCpf();
		} else if (column == COL_CARGO) { 
			return colaborador.getCargo();
		} else if (column == COL_SALARIO) { 
			return colaborador.getSalario();
		} else if (column == COL_TELEFONE) { 
			return colaborador.getTelefone();
		} else if (column == COL_CNH_B) { 
			return colaborador.getCnhB();
		}
		return ""; 
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Colaborador colaborador = valores.get(rowIndex);
		if (columnIndex == COL_NOME) {
			colaborador.setNome(aValue.toString());
		} else if (columnIndex == COL_ENDERECO) {
			colaborador.setEndereco(aValue.toString());
		} else if (columnIndex == COL_CPF) {
			colaborador.setCpf(aValue.toString());
		} else if (columnIndex == COL_CARGO) {
			colaborador.setCargo(aValue.toString());
		} else if (columnIndex == COL_SALARIO) {
			colaborador.setSalario(Double.parseDouble(aValue.toString()));
		} else if (columnIndex == COL_TELEFONE) {
			colaborador.setTelefone(aValue.toString());
		} else if (columnIndex == COL_CNH_B) {
			colaborador.setCnhB(aValue.toString().charAt(0));
		}
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	public Colaborador get(int row) {
		return valores.get(row);
	}
	
	
	

}
