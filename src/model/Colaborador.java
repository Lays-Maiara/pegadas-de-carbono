package model;

public class Colaborador {
	
	private int id;
	private String nome;
	private String endereco;
	private String cpf;
	private String cargo;
	private double salario;
	private String telefone;
	private char cnhB;
	
	
	public Colaborador(int id, String nome, String endereco, String cpf, String cargo, double salario, String telefone,
			char cnhB) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.telefone = telefone;
		this.cnhB = cnhB;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public char getCnhB() {
		return cnhB;
	}


	public void setCnhB(char cnhB) {
		this.cnhB = cnhB;
	}
	
	public String toString(){
		return nome + " - " + telefone;
	}

}