import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float totalCD = 0, soma = 0, valorCD;

		System.out.println("Digite o número de CDs: ");
		totalCD = entrada.nextFloat();

		for (int i = 1; i <= totalCD; i++) {
			System.out.println("Valor pago no cd: ");
			valorCD = entrada.nextFloat();
			soma += valorCD;
			
		}
		System.out.println("Média por CD: " + (soma / totalCD));
		System.out.println("Total investido: " + soma);
		
		entrada.close();
	}

}
