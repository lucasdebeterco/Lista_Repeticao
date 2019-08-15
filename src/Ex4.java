import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int pa = 80000;
		int pb = 200000;
		int cont = 0;

		while (pa <= pb) {
			cont += 1;
			pa *= 1.03;
			pb *= 1.015;
		}
		System.out.println("Anos nescesários: " + cont);

		System.out.println("Agora digite a população do pais A: ");
		pa = Integer.parseInt(entrada.nextLine());

		System.out.println("Agora digite a população do pais B: ");
		pb = Integer.parseInt(entrada.nextLine());

		double ta = 0;
		double tb = 0;
		cont = 0;
		System.out.println("Agora digite a taxa de crescimento do pais A: ");
		ta = Double.parseDouble(entrada.nextLine());

		System.out.println("Agora digite a taxa de crescimento do pais B: ");
		tb = Double.parseDouble(entrada.nextLine());
		ta = (ta / 1000) + 1;
		tb = (tb / 1000) + 1;

		if (pa >= pb) {
			if (ta > tb) {
				System.out.println("Erro, loop infinito");
			} else {
				while (pa >= pb) {
					cont += 1;
					pa *= ta;
					pb *= tb;
				}
			}
		}
		if (pb >= pa) {
			if (tb > ta) {
				System.out.println("Erro, loop infinito");
			} else {
				while (pb >= pa) {
					cont += 1;
					pa *= ta;
					pb *= tb;
				}
			}
		}

		System.out.println("Tempo nescessário para entrada do usuário: " + cont);
		entrada.close();
	}
}
