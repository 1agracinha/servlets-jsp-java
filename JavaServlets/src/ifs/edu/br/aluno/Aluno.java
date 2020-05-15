package ifs.edu.br.aluno;

public class Aluno {
	

	public Aluno() {
		super();
	}

	private String matricula;
	private String nome;
	private String cpf;
	private String email;
	private String endereco;
	private String cidade;
	private String estado;
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", endereco="
				+ endereco + ", cidade=" + cidade + ", estado=" + estado + ", toString()=" + super.toString() + "]";
	}
}

