import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10: ");
		double nota = entrada.nextDouble();
		
		while(nota<0 || nota>10) {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = entrada.nextDouble();
		}
		
		entrada.close();
	}

}
