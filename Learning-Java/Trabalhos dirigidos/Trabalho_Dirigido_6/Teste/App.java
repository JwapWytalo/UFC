package Teste;

import Classes.*;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class App {

	public static void main(String[] args) {

		int q = 0, dd, mm, yyyy, ind;
		String nome, cpf;

		// INSTANCIANDO CLASSES

		Scanner scan = new Scanner(System.in);
		PessoaJuridica pj = new PessoaJuridica();
		PessoaFisica pf = new PessoaFisica();
		GregorianCalendar dataN = new GregorianCalendar();
		ColecaoPessoa cp = new ColecaoPessoa();
		Pessoa p = pf;

		do {

			cp.menu();
			q = scan.nextInt();

			switch (q) {

			// CHAMANDO METODO INSERIR

			case 1:
				System.out
						.println("Digite 1 para adicionar uma Pessoa fisica ou 2 para adicionar uma Pessoa Juridica: ");
				q = scan.nextInt();

				scan.nextLine();
				if (q == 1) {

					System.out.printf("Digite o nome da Pessoa fisica[%d]\n", 0);
					nome = scan.nextLine();
					pf.setNome(nome);
					System.out.println("O CPF: ");
					cpf = scan.nextLine();
					pf.setCpf(cpf);
					;
					System.out.println("Agora a data de nascimento separada por espacos (ex: dd mm yyyy): ");
					dd = scan.nextInt();
					mm = scan.nextInt();
					mm--;
					yyyy = scan.nextInt();

					dataN.set(yyyy, mm, dd);
					pf.setDataNascimento(dataN);
					
					System.out.println(pf.validarDocumento(cpf));

					cp.inserir(pf);

				} else {

					System.out.printf("Digite o nome da Pessoa juridica[%d]\n", 0);
					nome = scan.nextLine();
					pj.setNome(nome);
					System.out.println("O CNPJ: ");
					cpf = scan.nextLine();
					pj.setCnpj(cpf);
					;
					System.out.println("Agora a data de criacao separada por espacos (ex: dd mm yyyy): ");
					dd = scan.nextInt();
					mm = scan.nextInt();
					mm--;
					yyyy = scan.nextInt();

					dataN.set(yyyy, mm, dd);
					pj.setDataCriacao(dataN);

					System.out.println(pj.validarDocumento(cpf));
					
					cp.inserir(pj);

				}

				break;

			case 2:

				// CHAMANDO METODO ATUALIZAR

				System.out
						.println("Digite 1 para ATUALIZAR uma Pessoa fisica ou 2 para adicionar uma Pessoa Juridica: ");
				q = scan.nextInt();

				if (q == 1) {

					scan.nextLine();

					System.out.println("Digite o indice da pessoa que voce deseja atualizar: ");
					ind = scan.nextInt();

					System.out.printf("Digite o NOVO nome da Pessoa que voce deseja atualizar[%d]\n", ind);
					nome = scan.nextLine();
					pf.setNome(nome);
					System.out.println("O CNPJ: ");
					cpf = scan.nextLine();
					pf.setCpf(cpf);
					;

					System.out.println("Agora a data de criacao separada por espacos (ex: dd mm yyyy): ");
					dd = scan.nextInt();
					mm = scan.nextInt();
					mm--;
					yyyy = scan.nextInt();

					dataN.set(yyyy, mm, dd);
					pf.getDataNascimento();

					cp.atualizar(ind, pf);

				} else {

					System.out.println("Digite o indice da pessoa que voce deseja atualizar: ");
					ind = scan.nextInt();
					scan.nextLine();
					System.out.printf("Digite o NOVO nome da Pessoa que voce deseja atualizar[%d]\n", ind);
					nome = scan.nextLine();
					pj.setNome(nome);
					System.out.println("O CNPJ: ");
					cpf = scan.nextLine();
					pj.setCnpj(cpf);

					System.out.println("Agora a data de criacao separada por espacos (ex: dd mm yyyy): ");
					dd = scan.nextInt();
					mm = scan.nextInt();
					mm--;
					yyyy = scan.nextInt();

					dataN.set(yyyy, mm, dd);
					pj.setDataCriacao(dataN);

					cp.atualizar(ind, pj);

				}
				break;

			case 3:

				// CHAMANDO METODO REMOVER

				System.out.println("Digite o indice da pessoa que voce deseja remover: ");
				ind = scan.nextInt();
				cp.remover();
				cp.remover(ind);

				break;

			case 4:

				// CHAMANDO METODO PESQUISAR

				System.out.println("Digite o nome da pessoa que voce deseja pesquisar: ");
				nome = scan.nextLine();
				pf.setNome(nome);
				pj.setNome(nome);

				p = pf;
				p = pj;

				System.out.println(cp.pesquisar(p));

				break;

			case 5:

				// CHAMANDO METODO COLEÇÃO ESTA VAZIA

				System.out.println(cp.colecaoEstaVazia());

				break;

			case 6:

				// CHAMANDO METODO IMPRIMIR DADOS

				cp.imprimirDadosColecao();

				break;

			case 7:

				// CHAMANDO METODO RETORNAR OBJETO

				System.out.println("Digite o indice da pessoa que voce deseja retornar: ");
				ind = scan.nextInt();
				System.out.println(cp.retornarObjeto(ind));
			}

		} while (q != 8);

		scan.close();

	}

}
