
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String n;
		String sv = "a76dk09";
		int x;

		do {

			System.out.println("Digite a senha: ");
			n = scan.nextLine();

			if ((n.equals(sv))) {

				x = 1;

			} else {

				x = 0;

			}

			if (x == 0) {

				System.out.println("\nAcesso negado!\n");

			}

		} while (x == 0);

		System.out.println("Acesso permitido!");

		scan.close();

	}

}
