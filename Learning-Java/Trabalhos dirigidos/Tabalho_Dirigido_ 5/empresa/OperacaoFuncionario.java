package empresa;
import java.text.SimpleDateFormat;

public class OperacaoFuncionario {

	// METODO VALIDA

	public static void valida(Funcionario fun[], int n) {
		
		SimpleDateFormat formatador = new SimpleDateFormat();

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

	// EXTENDS TD5

	// METODO MOSTRA APOSENTADORIA

	public static void MostraAposentadoria(Funcionario fun[], int n) {

		int i;

		for (i = 0; i < n; i++) {
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.printf("O funcionario %s, vai se aposentar na data: ", fun[i].getNome());
			System.out.println(formatador.format(fun[i].dataDeAposentadoria(fun[i].getDataAdmis(), fun[i].getSexo()).getTime()));
			
		}

	}
	
	//METODO TOTAL BONIFICAÇÕES
	
	public static void TotalBonificacao(Funcionario fun[], int n) {
		
		double total = 0;
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("A bonificacao do funcionario %s e de: %f\n", fun[i].getNome(), fun[i].getBonificacao());	
			
			total += fun[i].getBonificacao();
		}
		
		System.out.printf("O total de bonificacoes que a empresa deve pagar e: %f", total);
		
	}
	

}
