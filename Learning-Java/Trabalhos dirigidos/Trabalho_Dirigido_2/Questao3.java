
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		int n, i;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de elementos: ");
		n = scan.nextInt();

		int a[] = new int[n];

		for (i = 0; i < n; i++) {

			System.out.printf("\nDigite o valor[%d]: ", +i);
			a[i] = scan.nextInt();

		}

		int maior = a[0];

		for (i = 0; i < n; i++) {

			if (maior < a[i]) {

				maior = a[i];

			}

		}

		System.out.printf("O maior numero e: %d ", maior);

		scan.close();

	}

}
