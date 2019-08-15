import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um login: ");
		String login = entrada.nextLine();
		
		System.out.println("Digite uma senha: ");
		String senha = entrada.nextLine();
		
		while(login.equalsIgnoreCase(senha)) {
			System.out.println("Senha e login iguais, tente novamente: ");
			
			System.out.println("Digite um login: ");
			login = entrada.nextLine();
			
			System.out.println("Digite uma senha: ");
			senha = entrada.nextLine();
		}
		
		entrada.close();
	}

}
