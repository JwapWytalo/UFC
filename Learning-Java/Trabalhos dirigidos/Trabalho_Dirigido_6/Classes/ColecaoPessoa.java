package Classes;

public class ColecaoPessoa implements Colecao {

	int n = 100;
	private Pessoa dados[] = new Pessoa[n];
	private int posicaCorrente;

	public void menu() {

		System.out.printf("\n\n----------MENU----------\n");
		System.out.printf("---------Inserir = 1--------\n");
		System.out.printf("-------Atualizar = 2--------\n");
		System.out.printf("---------Remover = 3--------\n");
		System.out.printf("-------Pesquisar = 4--------\n");
		System.out.printf("--Colecao vazia? = 5--------\n");
		System.out.printf("--Imprimir dados = 6--------\n");
		System.out.printf("--------Retornar = 7--------\n");
		System.out.printf("------------Sair = 8--------\n");
	}

	// METODO INSERIR

	public boolean inserir(Pessoa p) {

		this.dados[this.posicaCorrente] = p;

		return true;
	}

	// METODOS REMOVER

	public boolean remover() {

		if (dados != null) {

			return true;

		}

		return false;
	}

	public boolean remover(int indice) {

		if (remover() == true) {

			this.dados[indice] = null;

		}

		return false;
	}

	//METODO ATUALIZAR
	
	public void atualizar(int indice, Pessoa p) {

		this.dados[indice] = p;

	}
	
	//METODO PESQUISAR
	
	public boolean pesquisar(Pessoa p) {

		for (int i = 0; i < dados.length; i++) {

			if (p.equals(dados[i])) {

				return true;
			}
		}
		return false;
	}

	//METODO COLECAO ESTA VAZIA	
	
	public boolean colecaoEstaVazia() {

		for (int i = 0; i < dados.length; i++) {

			if (this.dados[i] != null) {

				return false;

			}
		}

		return true;
	}
	
	//METODO IMPRIMIR DADOS COLEÇÃO
	
	public void imprimirDadosColecao() {

		for (int i = 0; i < dados.length; i++) {

			System.out.println(this.dados[i]);
			System.out.println();

		}

	}
	
	//METODO RETORNAR OBJETO
	
	public Pessoa retornarObjeto(int indice) {

		return this.dados[indice];

	}

}
