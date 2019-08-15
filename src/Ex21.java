import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float numPessoas = 0, soma = 0, idade;

		System.out.println("Digite o número de pessoas na turma: ");
		numPessoas = entrada.nextFloat();

		for (int i = 1; i <= numPessoas; i++) {
			System.out.println("Digite a idade da pessoa " + i + ": ");
			idade = entrada.nextFloat();
			soma += idade;
		}
		float media = soma / numPessoas;
		if (media >= 0 && media <= 25) {
			System.out.println("Turma jovem");
		}
		else if (media >= 26 && media <= 60) {
			System.out.println("Turma adulta");
		}
		else if (media > 60) {
			System.out.println("Turma idosa");
		}
		entrada.close();

	}

}
