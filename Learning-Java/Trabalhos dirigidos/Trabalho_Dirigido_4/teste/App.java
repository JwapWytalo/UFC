package teste;

import empresa.Funcionario;
import empresa.OperacaoFuncionario;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class App {

	public static void main(String[] args) {

		// classe gregorian para receber a data de nascimento
		GregorianCalendar dataN = new GregorianCalendar();
		GregorianCalendar dataA = new GregorianCalendar();

		// variaveis que receberão os valores
		int n, i, j, dd, mm, aaaa;
		String cpf, nome;
		char sexo;
		double salario;

		Scanner scan = new Scanner(System.in);
		Scanner srt = new Scanner(System.in);

		System.out.printf("Digite a quantidade de funcionarios que voce deseja cadastrar: ");
		n = scan.nextInt();

		int idade[] = new int[n];

		// criando um vetor do objeto

		Funcionario fun[] = new Funcionario[n];

		// RECEBENDO VALORES E INSTANCIANDO CADA OBJETO DO VETOR + RECEBENDO DATA PELO
		// GREGORIAN

		for (i = 0; i < n; i++) {

			fun[i] = new Funcionario();

			System.out.printf("Digite o cpf do funcionario [%d]: ", i);
			cpf = srt.nextLine();
			fun[i].setCpf(cpf);

			System.out.printf("Digite o nome: \n");
			nome = srt.nextLine();
			fun[i].setNome(nome);

			System.out.printf("Digite o sexo(m ou f): \n");
			sexo = srt.next().charAt(0);
			fun[i].setSexo(sexo);

			System.out.printf("Digite o salario: \n");
			salario = scan.nextDouble();
			fun[i].setSalarioB(salario);

			System.out.printf("Digite o dia, mes e ano de NASCIMENTO (dd mm aaaa): \n");
			dd = srt.nextInt();
			mm = srt.nextInt();
			mm--;
			aaaa = srt.nextInt();
			dataN.set(aaaa, mm, dd);
			fun[i].setDataNasc(dataN);

			System.out.printf("Digite o dia, mes e ano de ADMISSAO (dd mm aaaa): \n");
			dd = srt.nextInt();
			mm = srt.nextInt();
			mm--;
			aaaa = srt.nextInt();
			dataA.set(aaaa, mm, dd);
			fun[i].setDataAdmis(dataA);

			srt.nextLine();
			System.out.println();

			idade[i] = fun[i].convert(fun[i].getDataNasc());

		}

		// TESTANDO METODOS...

		for (i = 0; i < n; i++) {

			System.out.println(fun[i].toString());

			for (j = 1; j < n; j++) {

				OperacaoFuncionario.valida(fun, n);
				System.out.println(fun[i].equals(fun[j]));

			}
			System.out.println();
		}

		OperacaoFuncionario.contaSexo(fun, n);
		System.out.println();
		OperacaoFuncionario.ganhaMais(fun, n);
		System.out.println();
		OperacaoFuncionario.old(idade, fun, n);
		System.out.println();
		
		scan.close();
		srt.close();
	}

}
