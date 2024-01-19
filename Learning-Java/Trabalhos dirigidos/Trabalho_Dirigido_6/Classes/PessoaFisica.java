package Classes;

import java.util.Calendar;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private Calendar dataNascimento;
	private Calendar dataAtual;

	// CONSTRUTOR PARA INCIALIZAR A DATA ATUAL

	public PessoaFisica() {

		Calendar dataAtual = Calendar.getInstance();
		this.dataAtual = dataAtual;

	}

	// GETTERS E SETTERS

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// METODOS

	public Boolean validarDocumento(String cpf) {

		if (cpf.length() == 14) {

			return true;

		} else {

			return false;
		}

	}

	public int calcularIdade() {

		return dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

	}

	@Override

	public boolean equals(Object obj) {

		PessoaFisica pf = (PessoaFisica) obj;

		return this.cpf == pf.cpf;

	}

	@Override

	public String toString() {

		return "\nNome: " + this.getNome() + "\nCPF: " + this.cpf + "\nIDADE: " + this.calcularIdade();

	}

}
