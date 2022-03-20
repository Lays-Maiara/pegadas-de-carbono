package model;

public class Veiculo {
	private int id;
	private String placa;
	private String modelo;
	private int ano;
	private char veiculoDisponivel;
	private String consumoKmLitro;
	
	public Veiculo(int id, String placa, String modelo, int ano, char veiculoDisponivel, String consumoKmLitro) {
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.veiculoDisponivel = veiculoDisponivel;
		this.consumoKmLitro = consumoKmLitro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public char getVeiculoDisponivel() {
		return veiculoDisponivel;
	}

	public void setVeiculoDisponivel(char veiculoDisponivel) {
		this.veiculoDisponivel = veiculoDisponivel;
	}

	public String getConsumoKmLitro() {
		return consumoKmLitro;
	}

	public void setConsumoKmLitro(String consumoKmLitro) {
		this.consumoKmLitro = consumoKmLitro;
	}

	
}

