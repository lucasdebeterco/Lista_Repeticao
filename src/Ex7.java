import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
		entrada.close();
		
	}

}
