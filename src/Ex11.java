import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int pares = 0,impares = 0,num;
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 1; i <= 10; i++) {
			num = entrada.nextInt();
			if (num%2 == 0) {
				pares += 1;
			} else
				impares += 1;
		}
		System.out.println("Quantidade de pares: " + pares);
		System.out.println("Quantidade de impares: " + impares);
		entrada.close();
	}

}
