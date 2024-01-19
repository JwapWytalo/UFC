package empresa;

import java.util.Calendar;

public class Progamador extends Funcionario {

	private String linguagem[];

	public Progamador() {

		new Funcionario();

		this.linguagem = new String[5];

	}

	public Progamador(String cpf, String nome, char sexo, double salarioB, Calendar dataN, Calendar dataA,
			String linguagem[]) {

		int i;

		this.setCpf(cpf);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSalarioB(salarioB);
		this.setDataNasc(dataN);
		this.setDataAdmis(dataA);

		for (i = 0; i < 5; i++) {

			this.linguagem[i] = linguagem[i];

		}

	}

	public String[] getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String[] linguagem) {
		this.linguagem = linguagem;
	}

	@Override

	public String toString() {

		return "CPF: " + this.getCpf() + " \nNOME: " + this.getNome() + "\nSEXO (M OU F): " + this.getSexo()
				+ "\nSALARIO BRUTO: " + this.getSalarioB() + "\nLinguagens: " + linguagem[0] + ", " + linguagem[1] + ", "
				+ linguagem[2] + ", " + linguagem[3] + ", " + linguagem[4];

	}

	// METODO PROGAMA MESMAS LINGUAGENS

	public Boolean progamaMesmasLinguagens(Progamador prog) {

		if (prog.linguagem.equals(this.linguagem)) {

			return true;

		} else {

			return false;

		}

	}

}
