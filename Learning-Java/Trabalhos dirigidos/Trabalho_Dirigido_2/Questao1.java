import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		int x, y, result = 0;
		String s;

		Scanner scan = new Scanner(System.in);

		System.out.printf("Digite o primeiro numero: ");
		x = scan.nextInt();

		System.out.printf("Digite o segundo numero: ");
		y = scan.nextInt();

		System.out.printf("Digite a operaçao: ");
		s = scan.next();

		switch (s) {

		case "+":

			result = x + y;

			break;

		case "-":

			result = x - y;

			break;

		case "*":

			result = x * y;

			break;

		case "/":

			if (y == 0) {

				System.out.println("Nao e possivel realizar essa operaçao, nao existe " + "divisao por zero!");

			}

			result = x / y;

			break;

		}

		System.out.printf("O resultado foi: %d", result);

		scan.close();

	}

}
