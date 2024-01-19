package teste;

import empresa.Funcionario;
import empresa.Progamador;
import empresa.Analista;
import empresa.Gerente;
import empresa.OperacaoFuncionario;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class App {

	public static void main(String[] args) {

		// classe gregorian para receber a data de nascimento
		GregorianCalendar dataN = new GregorianCalendar();
		GregorianCalendar dataA = new GregorianCalendar();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

		// variaveis que receberão os valores
		int n = 2, i, j, t = 0, dd, mm, aaaa;
		String cpf, nome;
		char sexo;
		double salario;

		Scanner scan = new Scanner(System.in);
		Scanner srt = new Scanner(System.in);

		// VETOR PARA ARMAZENAR AS IDADES DOS FUNCIONARIOS

		int idade[] = new int[n];

		// criando um vetor dos objetos

		Progamador progam[] = new Progamador[6];
		Analista analist[] = new Analista[4];
		Gerente gerent[] = new Gerente[2];
		Funcionario progamador[] = progam;
		Funcionario analista[] = analist;
		Funcionario gerente[] = gerent;
		Funcionario funcionario[] = new Funcionario[n];

		// VETORES PARA RECEBER AS LINGUAGENS, DIAGRAMAS E METODOLOGIAS

		String ling[] = new String[5];
		String diag[] = new String[5];
		String metodolog[] = new String[5];

		// RECEBENDO VALORES DO PROGAMADOR, INSTANCIANDO CADA OBJETO DO VETOR E
		// RECEBENDO DATA PELO
		// GREGORIAN

		for (i = 0; i < 1; i++) {

			funcionario[i] = new Funcionario();
			progamador[i] = new Progamador();
			progam[i] = new Progamador();

			System.out.printf("Digite o cpf do progamador [%d]: ", i);
			cpf = srt.nextLine();
			progamador[i].setCpf(cpf);

			System.out.printf("Digite o nome: \n");
			nome = srt.nextLine();
			progamador[i].setNome(nome);

			System.out.printf("Digite o sexo(m ou f): \n");
			sexo = srt.next().charAt(0);
			progamador[i].setSexo(sexo);

			System.out.printf("Digite o salario: \n");
			salario = scan.nextDouble();
			progamador[i].setSalarioB(salario);

			System.out.printf("Digite o dia, mes e ano de NASCIMENTO (dd mm aaaa): \n");
			dd = srt.nextInt();
			mm = srt.nextInt();
			mm--;
			aaaa = srt.nextInt();
			dataN.set(aaaa, mm, dd);
			progamador[i].setDataNasc(dataN);

			System.out.printf("Digite o dia, mes e ano de ADMISSAO (dd mm aaaa): \n");
			dd = srt.nextInt();
			mm = srt.nextInt();
			mm--;
			aaaa = srt.nextInt();
			dataA.set(aaaa, mm, dd);
			progamador[i].setDataAdmis(dataA);

			srt.nextLine();
			System.out.println();

			idade[t] = progamador[i].convert(progamador[i].getDataNasc());

			for (j = 0; j < 5; j++) {

				System.out.printf("Digite a linguagem [%d] que o progamador domina", j);
				ling[j] = srt.nextLine();

			}

			progam[i].setLinguagem(ling);

			funcionario[t] = progamador[i];
			t++;

		}

		/*
		 * RECEBENDO VALORES DO ANALISTA, INSTANCIANDO CADA OBJETO DO VETOR E RECEBENDO
		 * DATA PELO GREGORIAN
		 */

		for (i = 0; i < 1; i++) {

			funcionario[t] = new Funcionario();
			analista[i] = new Analista();
			analist[i] = new Analista();

			System.out.printf("Digite o cpf do analista [%d]: ", i);
			cpf = srt.nextLine();
			analista[i].setCpf(cpf);

			System.out.printf("Digite o nome: \n");
			nome = srt.nextLine();
			analista[i].setNome(nome);

			System.out.printf("Digite o sexo(m ou f): \n");
			sexo = srt.next().charAt(0);
			analista[i].setSexo(sexo);

			System.out.printf("Digite o salario: \n");
			salario = scan.nextDouble();
			analista[i].setSalarioB(salario);

			System.out.printf("Digite o dia, mes e ano de NASCIMENTO (dd mm aaaa): \n");
			dd = srt.nextInt();
			mm = srt.nextInt();
			mm--;
			aaaa = srt.nextInt();
			dataN.set(aaaa, mm, dd);
			analista[i].setDataNasc(dataN);

			System.out.printf("Digite o dia, mes e ano de ADMISSAO (dd mm aaaa): \n");
			dd = srt.nextInt();
			mm = srt.nextInt();
			mm--;
			aaaa = srt.nextInt();
			dataA.set(aaaa, mm, dd);
			analista[i].setDataAdmis(dataA);

			srt.nextLine();
			System.out.println();

			idade[t] = analista[i].convert(analista[i].getDataNasc());

			for (j = 0; j < 5; j++) {

				System.out.printf("Digite o diagrama [%d] que o analista domina", j);
				diag[j] = srt.nextLine();

			}

			analist[i].setDiagrama(diag);
			funcionario[t] = analista[i];

			t++;

		}

		/*
		 * RECEBENDO VALORES DO GERENTE, INSTANCIANDO CADA OBJETO DO VETOR E RECEBENDO
		 * DATA PELO GREGORIAN
		 */

		for (i = 0; i < 1; i++) {

			funcionario[t] = new Funcionario();
			gerente[i] = new Gerente();
			gerent[i] = new Gerente();

			System.out.printf("Digite o cpf do gerente [%d]: ", i);
			cpf = srt.nextLine();
			gerente[i].setCpf(cpf);

			System.out.printf("Digite o nome: \n");
			nome = srt.nextLine();
			gerente[i].setNome(nome);

			System.out.printf("Digite o sexo(m ou f): \n");
			sexo = srt.next().charAt(0);
			gerente[i].setSexo(sexo);

			System.out.printf("Digite o salario: \n");
			salario = scan.nextDouble();
			gerente[i].setSalarioB(salario);

			System.out.printf("Digite o dia, mes e ano de NASCIMENTO (dd mm aaaa): \n");
			dd = srt.nextInt();
			mm = srt.nextInt();
			mm--;
			aaaa = srt.nextInt();
			dataN.set(aaaa, mm, dd);
			gerente[i].setDataNasc(dataN);

			System.out.printf("Digite o dia, mes e ano de ADMISSAO (dd mm aaaa): \n");
			dd = srt.nextInt();
			mm = srt.nextInt();
			mm--;
			aaaa = srt.nextInt();
			dataA.set(aaaa, mm, dd);
			gerente[i].setDataAdmis(dataA);

			srt.nextLine();
			System.out.println();

			idade[t] = gerente[i].convert(gerente[i].getDataNasc());

			for (j = 0; j < 5; j++) {

				System.out.printf("Digite A METODOLOGIA [%d] que o gerente domina", j);
				metodolog[j] = srt.nextLine();

			}

			gerent[i].setMetodologiaDesenvolvimento(metodolog);

			funcionario[t] = gerente[i];

			t++;
		}

		/// TESTANDO METODOS

		for (i = 0; i < n; i++) {

			System.out.printf("Funcionario [%d]: \n", i);
			System.out.println(funcionario[i].toString());
			OperacaoFuncionario.valida(funcionario, n);
			OperacaoFuncionario.MostraAposentadoria(funcionario, n);

		}

		OperacaoFuncionario.contaSexo(funcionario, n);
		OperacaoFuncionario.ganhaMais(funcionario, n);
		OperacaoFuncionario.old(idade, funcionario, n);
		OperacaoFuncionario.TotalBonificacao(funcionario, n);

	}

}
