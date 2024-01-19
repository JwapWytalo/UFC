package Classes;

import java.util.Calendar;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private Calendar dataCriacao;
	private Calendar dataAtual;

	// CONSTRUTOR PARA INCIALIZAR A DATA ATUAL

	public PessoaJuridica() {

		Calendar dataAtual = Calendar.getInstance();

		this.dataAtual = dataAtual;
	}

	// GETTERS E SETTERS

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	// METODOS

	public Boolean validarDocumento(String cpf) {

		if (cpf.length() == 18) {

			return true;

		} else {

			return false;
		}

	}

	public int calcularIdade() {

		return dataAtual.get(Calendar.YEAR) - dataCriacao.get(Calendar.YEAR);

	}

	@Override

	public boolean equals(Object obj) {

		PessoaJuridica pj = (PessoaJuridica) obj;

		return this.cnpj == pj.cnpj;

	}

	@Override

	public String toString() {

		return "\nNome: " + this.getNome() + "\nCPF: " + this.cnpj + "\nIDADE: " + this.calcularIdade();

	}

}
