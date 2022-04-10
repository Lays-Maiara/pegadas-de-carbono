package view.tables;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Veiculo;

public class VeiculoTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private static final int COL_PLACA = 0;
	private static final int COL_MODELO = 1;
	private static final int COL_ANO = 2;
	private static final int COL_VEICULO_DISPONIVEL = 3;
	private static final int COL_CONSUMO_KM_LITRO = 4;

	

	private List<Veiculo> valores;       

	public VeiculoTableModel(List<Veiculo> valores) {
		this.valores = new ArrayList<Veiculo>(valores);
	}

	public int getRowCount() {
		
		return valores.size();
	}

	public int getColumnCount() {
		return 5;
	}

	public String getColumnName(int column) {
		
		if (column == COL_PLACA) return "Placa";
		if (column == COL_MODELO) return "Modelo";
		if (column == COL_ANO) return "Ano";
		if (column == COL_VEICULO_DISPONIVEL) return "Veículo disponível";
		if (column == COL_CONSUMO_KM_LITRO) return "Consumo km/l";

		return ""; 
	}

	public Object getValueAt(int row, int column) {
		Veiculo veiculo = valores.get(row);
		if (column == COL_PLACA) {
			return veiculo.getPlaca();
		} else if (column == COL_MODELO) { 
			return veiculo.getModelo();
		} else if (column == COL_ANO) { 
			return veiculo.getAno();
		} else if (column == COL_VEICULO_DISPONIVEL) { 
			return veiculo.getVeiculoDisponivel();
		} else if (column == COL_CONSUMO_KM_LITRO) { 
			return veiculo.getConsumoKmLitro();
		}
		return ""; 
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Veiculo veiculo = valores.get(rowIndex);
		if (columnIndex == COL_PLACA) {
			veiculo.setPlaca(aValue.toString());
		} else if (columnIndex == COL_MODELO) {
			veiculo.setModelo(aValue.toString());
		} else if (columnIndex == COL_ANO) {
			veiculo.setAno(Integer.parseInt(aValue.toString()));
		} else if (columnIndex == COL_VEICULO_DISPONIVEL) {
			veiculo.setVeiculoDisponivel(aValue.toString().charAt(0));
		} else if (columnIndex == COL_CONSUMO_KM_LITRO) {
			veiculo.setConsumoKmLitro(aValue.toString());
		}
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	public Veiculo get(int row) {
		return valores.get(row);
	}
	
	
	

}
