
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		int n, i;
		int countpar = 0, countimpar = 0, countp = 0, counti = 0, countn = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de elementos: ");
		n = scan.nextInt();

		int a[] = new int[n];

		for (i = 0; i < n; i++) {

			System.out.printf("\nDigite o valor[%d]: ", +i);
			a[i] = scan.nextInt();

			if (a[i] % 2 == 0) {

				countpar++;

			} else {

				countimpar++;

			}
			if (a[i] > 0) {

				countp++;

			} else if (a[i] < 0) {

				counti++;

			}
			if (a[i] == 0) {

				countn++;

			}
		}

		System.out.printf("\nA qauntiadade de numeros pares e: %d", countpar);
		System.out.printf("\nA qauntiadade de numeros impares e: %d", countimpar);
		System.out.printf("\nA qauntiadade de numeros positivos e: %d", countp);
		System.out.printf("\nA qauntiadade de numeros negativos e: %d", counti);
		System.out.printf("\nA qauntiadade de numeros neutros e: %d", countn);

		scan.close();

	}

}
