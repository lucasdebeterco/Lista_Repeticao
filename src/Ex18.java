import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num,cont = 0;
		
		
		System.out.println("Digite um n�mero: ");
		num = entrada.nextInt();
		
		for(int i = 1; i < num; i++) {
			if (num%i == 0) {
				cont++;
			}
		}
		if (cont>1) {
			System.out.println("N�o � primo");
			for(int i = 1; i < num; i++) {
				if (num%i == 0) {
					cont++;
					System.out.println("Divis�vel por " + i);
				}
			}
		}else
			System.out.println("� primo");
	
		entrada.close();

	}

}
