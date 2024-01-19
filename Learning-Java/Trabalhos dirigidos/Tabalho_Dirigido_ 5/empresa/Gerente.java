package empresa;

import java.util.Calendar;

public class Gerente extends Funcionario {

	private String metodologiaDesenvolvimento[];

	public Gerente() {

		new Funcionario();

		this.metodologiaDesenvolvimento = new String[5];
	}

	public Gerente(String[] metodologiaDesenvolvimento) {

		this.metodologiaDesenvolvimento = metodologiaDesenvolvimento;
	}

	public Gerente(String cpf, String nome, char sexo, double salarioB, Calendar dataN, Calendar dataA,
			String metodologiaDesenvolvimento[]) {

		int i;

		this.setCpf(cpf);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSalarioB(salarioB);
		this.setDataNasc(dataN);
		this.setDataAdmis(dataA);

		for (i = 0; i < 5; i++) {

			this.metodologiaDesenvolvimento[i] = metodologiaDesenvolvimento[i];

		}

	}

	// METODO GET E SET

	public String[] getMetodologiaDesenvolvimento() {
		return metodologiaDesenvolvimento;
	}

	public void setMetodologiaDesenvolvimento(String[] metodologiaDesenvolvimento) {
		this.metodologiaDesenvolvimento = metodologiaDesenvolvimento;
	}

	// SOBRESCREVENDO O METODO GETBONIFICÃO

	@Override
	public double getBonificacao() {
		return (this.getSalarioB() * 0.05) + this.getSalarioB();
	}

	@Override

	public String toString() {

		return "CPF: " + this.getCpf() + " \nNOME: " + this.getNome() + "\nSEXO (M OU F): " + this.getSexo()
				+ "\nSALARIO BRUTO: " + this.getSalarioB() + "\nLinguagens: " + metodologiaDesenvolvimento[0] + ", "
				+ metodologiaDesenvolvimento[1] + ", " + metodologiaDesenvolvimento[2] + ", "
				+ metodologiaDesenvolvimento[3] + ", " + metodologiaDesenvolvimento[4];

	}

	// METODO DOMINA MESMAS METODODLOGIAS

	public Boolean DominaMesmasMetodologias(Gerente gerent) {

		if (gerent.metodologiaDesenvolvimento.equals(this.metodologiaDesenvolvimento)) {

			return true;

		} else {

			return false;

		}

	}

}
