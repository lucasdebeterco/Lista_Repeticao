import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero ");
		int num = entrada.nextInt();

		if (num >= 1 || num >= 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + i * num);
			}
		}
		entrada.close();

	}

}
