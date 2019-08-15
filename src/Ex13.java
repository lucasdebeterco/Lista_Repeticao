import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, fat = 0;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		fat = num*(num-1);
		
		for (int i = (num-2); i >= 1; i--) {
			fat *= i;
		}
		System.out.println(fat);
		entrada.close();

	}

}
