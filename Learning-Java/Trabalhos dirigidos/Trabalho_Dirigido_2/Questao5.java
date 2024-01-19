import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, n;
		double media = 0, soma = 0, dp = 0, DP = 0;

		System.out.println("Digite o tamanho  do vetor: ");
		n = scan.nextInt();

		double v[] = new double[n];

		for (i = 0; i < n; i++) {

			System.out.printf("\n Digite o valor [%d]: ", i);
			v[i] = scan.nextDouble();

		}

		for (i = 0; i < n; i++) {

			soma += v[i];
			media = soma / n;
		}

		for (i = 0; i < n; i++) {

			dp += Math.pow(v[i] - media, 2);

			DP = dp / n;

		}

		System.out.printf("\nMedia: %f", media);
		System.out.printf("\nDP: %f", Math.sqrt(DP));

		scan.close();

	}

}
