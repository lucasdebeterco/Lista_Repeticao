import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float totalTurmas = 0, soma = 0, alunos;

		System.out.println("Digite o número de turmas: ");
		totalTurmas = entrada.nextFloat();

		for (int i = 1; i <= totalTurmas; i++) {
			System.out.println("Quantidade de alunos para a turma " + i + ": ");
			alunos = entrada.nextFloat();
			if (alunos <= 40) {
				soma += alunos;
			} else {
				while (alunos > 40) {
					System.out.println("Erro, as turmas podem ter no máximo 40 alunos, digite novamente: ");
					alunos = entrada.nextFloat();
				}
				soma += alunos;
			}
		}
		System.out.println("Média: " + (soma / totalTurmas));
		
		entrada.close();
	}

}
