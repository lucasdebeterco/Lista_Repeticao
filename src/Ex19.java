import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, cont = 0, contTotal = 0;

		System.out.println("Digite um n�mero: ");
		num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= i; k++)
				if (i % k == 0) {
					cont++;
					contTotal++;
				}
			if(cont<=2) {
				System.out.println(i + " � primo");
			}
			cont = 0;
		}
		System.out.println("Divis�es totais: " + contTotal);

		entrada.close();

	}

}
