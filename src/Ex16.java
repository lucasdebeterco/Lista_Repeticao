import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quant = 0;
		float num = 0;
		float maior = 0, menor = 0, soma = 0;
		
		System.out.println("Quantidade de números: ");
		quant = entrada.nextInt();
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		menor = num;
		
		for (int i = 1; i < quant; i++) {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			soma += num;
			if (num>maior) {
				maior = num;	
			}
			if (num<menor) {
				menor = num;	
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Soma: " + soma);
		entrada.close();
	}

}
