import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a base: ");
		int base = entrada.nextInt();
		System.out.println("Digite o expoente ");
		int expoente = entrada.nextInt();

		int res = base * base;
		for (int i = 1; i < (expoente - 1); i++) {
			res *= base;
		}
		System.out.println(res);
		entrada.close();

	}

}
