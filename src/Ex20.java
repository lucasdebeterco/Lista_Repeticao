import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float totalNotas = 0, soma = 0, nota;

		System.out.println("Digite o número de notas: ");
		totalNotas = entrada.nextFloat();

		for (int i = 1; i <= totalNotas; i++) {
			System.out.println("Digite a nota " + i + ": ");
			nota = entrada.nextFloat();
			soma += nota;
		}
		System.out.println("Média: " + (soma/totalNotas));

		entrada.close();

	}

}
