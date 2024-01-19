package empresa;

import java.util.Calendar;

public class Analista extends Funcionario {

	private String diagrama[];

	public Analista() {

		new Funcionario();

		this.diagrama = new String[5];

	}

	public Analista(String cpf, String nome, char sexo, double salarioB, Calendar dataN, Calendar dataA,
			String linguagem[]) {

		int i;

		this.setCpf(cpf);
		this.setNome(nome);
		this.setSexo(sexo);
		this.setSalarioB(salarioB);
		this.setDataNasc(dataN);
		this.setDataAdmis(dataA);

		for (i = 0; i < 5; i++) {

			this.diagrama[i] = diagrama[i];

		}

	}

	// METODO GET E SET

	public String[] getDiagrama() {
		return diagrama;
	}

	public void setDiagrama(String[] diagrama) {
		this.diagrama = diagrama;
	}

	// SOBRESCREVENDO O METODO GETBONIFICÃO

	@Override
	public double getBonificacao() {
		return (this.getSalarioB() * 0.03) + this.getSalarioB();
	}
	
	@Override

	public String toString() {

		return "CPF: " + this.getCpf() + " \nNOME: " + this.getNome() + "\nSEXO (M OU F): " + this.getSexo()
				+ "\nSALARIO BRUTO: " + this.getSalarioB() + "\nLinguagens: " + diagrama[0] + ", " + diagrama[1] + ", "
				+ diagrama[2] + ", " + diagrama[3] + ", " + diagrama[4];

	}

	// METODO DOMINA MESMO DIAGRAMA

	public Boolean DominaMesmoDiagrama(Analista analist) {

		if (analist.diagrama.equals(this.diagrama)) {

			return true;

		} else {

			return false;

		}

	}

}
