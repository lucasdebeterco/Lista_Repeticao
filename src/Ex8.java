import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int soma = 0;
		
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
			soma += i;
		}
		System.out.println("Soma dos número: " + soma);
		entrada.close();
		
	}

}
