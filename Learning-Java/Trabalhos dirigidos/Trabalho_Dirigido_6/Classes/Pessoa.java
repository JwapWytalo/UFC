package Classes;

public abstract class Pessoa {
	

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract Boolean validarDocumento(String cpf);
	public abstract int calcularIdade();

}
