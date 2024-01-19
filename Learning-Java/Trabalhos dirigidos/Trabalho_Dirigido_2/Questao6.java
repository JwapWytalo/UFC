
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double h1, m1, h2, m2, sm = 0, sm2 = 0, MIN = 0, DIA = 1440, X = 0;

		do {

			System.out.printf("Digite a hora em que voce ira dormir (ex 23 00): ");
			h1 = scan.nextDouble();
			m1 = scan.nextDouble();

			if ((h1 < 0 || h1 > 23) || (m1 < 0 || m1 > 59)) {

				System.out.println("Hora invalida, digite novamente!\n");

			}

		} while ((h1 < 0 || h1 > 23) || (m1 < 0 || m1 > 59));

		do {

			System.out.printf("Digite a hora em que voce deseja acordar: ");
			h2 = scan.nextDouble();
			m2 = scan.nextDouble();

			if ((h2 < 0 || h2 > 23) || (m2 < 0 || m2 > 59)) {

				System.out.println("Hora invalida, digite novamente!\n");

			}

		} while ((h2 < 0 || h2 > 23) || (m2 < 0 || m2 > 59));

		sm = h1 * 60;
		sm += m1;

		sm2 = h2 * 60;
		sm2 += m2;

		if (h2 < h1 || m2 < m1) {

			X = (sm - sm2);

			MIN = DIA - X;

		} else {

			if (sm > sm2) {

				MIN = sm - sm2;

			} else {

				MIN = sm2 - sm;

			}

		}

		System.out.printf("\nVoce tem %.0f minutos para dormir.", MIN);

		scan.close();

	}

}
