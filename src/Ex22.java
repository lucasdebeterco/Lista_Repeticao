import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cand1 = 0, cand2 = 0, cand3 = 0, voto, numPessoas;

		System.out.println("Digite o número de votantes: ");
		numPessoas = entrada.nextInt();

		for (int i = 1; i <= numPessoas; i++) {
			System.out.println("Digite seu voto (1, 2 ou 3): ");
			voto = entrada.nextInt();
			switch (voto) {
			case 1:
				cand1++;
				break;
			case 2:
				cand2++;
				break;
			case 3:
				cand3++;
				break;
			}

		}
		System.out.println("Votos para o candidato 1: " + cand1);
		System.out.println("Votos para o candidato 2: " + cand2);
		System.out.println("Votos para o candidato 3: " + cand3);
		
		entrada.close();

	}

}
