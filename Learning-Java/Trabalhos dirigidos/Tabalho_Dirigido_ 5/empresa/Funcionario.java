package empresa;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Funcionario {

	private String cpf;
	private String nome;
	private char sexo;
	private double salarioB;
	private Calendar dataNasc;
	private Calendar dataAdmis;
	private Calendar dataApos;

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

		if (dataAdmis.get(Calendar.YEAR) < 1920) {

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

	// EXTENSÃO TD5

	// METODO GETBONIFICAÇÃO

	public double getBonificacao() {
		return (salarioB * 0.02) + salarioB;
	}

	// METODO APOSENTADORIA

	public Calendar dataDeAposentadoria(Calendar dataAd, char sexo) {

		GregorianCalendar dataAp = new GregorianCalendar();
		int dd, mm, aaaa;

		if (sexo == 'f') {

			aaaa = dataAd.get(Calendar.YEAR) + 30;
			;
			mm = dataAd.get(Calendar.MONTH);
			dd = dataAd.get(Calendar.DAY_OF_MONTH);

			dataAp.set(aaaa, mm, dd);
			return dataAp;

		}

		else {

			aaaa = dataAd.get(Calendar.YEAR) + 35;
			;
			mm = dataAd.get(Calendar.MONTH);
			dd = dataAd.get(Calendar.DAY_OF_MONTH);

			dataAp.set(aaaa, mm, dd);

			return dataAp;

		}

	}

	// METODO eMaisVelho

	public boolean eMaisVelho(Funcionario fun[], int n) {

		int i, indV = 0, velho = fun[0].convert(dataNasc);
		for (i = 0; i < n; i++) {

			if (velho < fun[i].convert(dataNasc)) {

				indV = i;

			}

		}

		if (fun[indV].dataNasc.get(Calendar.YEAR) < this.dataNasc.get(Calendar.YEAR)) {

			return true;

		} else {

			return false;

		}

	}

}