package empresa;

public class OperacaoFuncionario {

	// METODO VALIDA

	public static void valida(Funcionario fun[], int n) {

		// VALIDACPF

		int i = 0;
		for (i = 0; i < n; i++) {

			if (fun[i].validaCpf((fun[i].getCpf())) == true) {

				System.out.printf("O CPF DO %s e valido", fun[i].getNome());

			} else {

				System.out.printf("O CPF DO %s E invalido", fun[i].getNome());

			}

			// VALIDA DATA DE ADMISSAO

			if (fun[i].validaAdmis((fun[i].getDataAdmis())) == true) {

				System.out.println("\nDATA DE ADMISSAO VALIDA");

			} else {

				System.out.println("\nDATA DE ADMISSÃO INVALIDA");

			}

			// VALIDA DATA DE NASCIMENTO

			if (fun[i].validaNasc((fun[i].getDataNasc())) == true) {

				System.out.println("\nDATA DE NASCIMENTO VALIDA");

			} else {

				System.out.println("\nDATA DE NASCIMENTO INVALIDA");

			}

		}
	}

	// METODO contaSexo

	public static void contaSexo(Funcionario fun[], int n) {

		int countm = 0, countf = 0, i;

		for (i = 0; i < n; i++) {

			if (fun[i].getSexo() == 'm') {

				countm++;

			}

			if (fun[i].getSexo() == 'f') {

				countf++;

			}

		}

		System.out.println("A quantidade de homens e: " + countm);
		System.out.println("A quantidade de mulheres e: " + countf);

	}

	// METODO DO MAIOR E MENOR SALARIO LIQUIDO

	public static void ganhaMais(Funcionario fun[], int n) {

		double maior = fun[0].salarioL(fun[0].getSalarioB()), menor = fun[0].salarioL(fun[0].getSalarioB());
		int indb = 0, inds = 0;

		for (int i = 0; i < n; i++) {

			if (maior < fun[i].salarioL(fun[i].getSalarioB())) {

				maior = fun[i].salarioL(fun[i].getSalarioB());
				indb = i;

			}

			if (menor > fun[i].salarioL(fun[i].getSalarioB())) {

				menor = fun[i].salarioL(fun[i].getSalarioB());
				inds = i;

			}

		}

		System.out.println("A pessoa que possui o MAIOR salario liquido e: " + fun[indb].getNome());
		System.out.println("A pessoa que possui o MENOR salario liquido e: " + fun[inds].getNome());

	}

	// METODO MAIS VELHO E MAIS NOVO

	public static void old(int idade[], Funcionario fun[], int n) {

		int i;
		int indNovo = 0, indVelho = 0;

		// INICIALIZANDO AS VARIAVEIS COM A PRIMEIRA POS DO VETOR

		int novo = idade[0];
		int velho = idade[0];

		for (i = 0; i < n; i++) {

			if (novo > idade[i]) {

				novo = idade[i];
				indNovo = i;

			}

			if (velho < idade[i]) {

				velho = idade[i];
				indVelho = i;

			}
		}

		System.out.printf("a pessoa mais NOVA e %s com a idade de %d\n", fun[indNovo].getNome(), novo);
		System.out.printf("a pessoa mais VELHA e %s com a idade de %d\n", fun[indVelho].getNome(), velho);

	}

}
