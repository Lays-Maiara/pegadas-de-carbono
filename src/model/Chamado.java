package model;

import java.time.LocalDate;

public class Chamado {
	private int id;
	private LocalDate dataChamado;
	private String enderecoAtendimento;
	private double distanciaPercorrida;
	private Colaborador colaborador;
	private Veiculo veiculo;
	
	public Chamado(int id, LocalDate dataChamado, String enderecoAtendimento, double distanciaPercorrida,
			Colaborador colaborador, Veiculo veiculo) {
		this.id = id;
		this.dataChamado = dataChamado;
		this.enderecoAtendimento = enderecoAtendimento;
		this.distanciaPercorrida = distanciaPercorrida;
		this.colaborador = colaborador;
		this.veiculo = veiculo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataChamado() {
		return dataChamado;
	}

	public void setDataChamado(LocalDate dataChamado) {
		this.dataChamado = dataChamado;
	}

	public String getEnderecoAtendimento() {
		return enderecoAtendimento;
	}

	public void setEnderecoAtendimento(String enderecoAtendimento) {
		this.enderecoAtendimento = enderecoAtendimento;
	}

	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
			
}

