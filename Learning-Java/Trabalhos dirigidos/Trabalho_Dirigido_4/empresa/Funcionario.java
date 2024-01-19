package empresa;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Funcionario {

	private String cpf;
	private String nome;
	private char sexo;
	private double salarioB;
	private Calendar dataNasc;
	private Calendar dataAdmis;

	SimpleDateFormat formatador = new SimpleDateFormat();

	// CONSTRUTORES

	public Funcionario() {

		Calendar dataAdmis = Calendar.getInstance();

		this.dataAdmis = dataAdmis;

	}

	public Funcionario(String cpf, String nome, Calendar dataAdimis) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.dataAdmis = dataAdimis;
		
	}

	public Funcionario(String cpf, String nome, char sexo, double salarioB, Calendar dataNasc, Calendar dataAdmis) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.salarioB = salarioB;
		this.dataNasc = dataNasc;
		this.dataAdmis = dataAdmis;

	}

	// METODOS GET E SET

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalarioB() {
		return salarioB;
	}

	public void setSalarioB(double salarioB) {
		this.salarioB = salarioB;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Calendar getDataAdmis() {
		return dataAdmis;
	}

	public void setDataAdmis(Calendar dataAdmis) {
		this.dataAdmis = dataAdmis;
	}

	public Boolean validaCpf(String cpf) {

		if (cpf.length() == 14) {

			return true;

		} else {

			return false;

		}

	}

	// METODO VALIDA NASCIMENTO

	public Boolean validaNasc(Calendar dataNasc) {

		if (dataNasc.get(Calendar.YEAR) < 1920) {

			return false;
		} else {

			return true;

		}
	}

	// METODO VALIDA ADIMISSAO

	public Boolean validaAdmis(Calendar dataAdmis) {

		if (dataAdmis.get(Calendar.YEAR) < 1995) {

			return false;
		} else {

			return true;

		}

	}

	// METODO CONVERTENDO PARA INT

	public int convert(Calendar dataNas) {

		return dataAdmis.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);

	}

	// METODO SALARIO LIQUIDO

	public double salarioL(double salarioB) {

		double desconto;

		if (salarioB <= 3000) {

			desconto = salarioB * 0.17;

			return salarioB - desconto;

		} else {

			desconto = salarioB * 0.27;

			return salarioB - desconto;

		}

	}

	// METODO toString

	@Override

	public String toString() {

		return "CPF: " + this.cpf + " \nNOME: " + this.nome + "\nSEXO (M OU F): " + this.sexo;
	}

	// METODO equals

	@Override
	public boolean equals(Object obj) {

		Funcionario p = (Funcionario) obj;
		
		return this.cpf == p.cpf && this.nome == p.nome && this.sexo == p.sexo;
			

	}

}