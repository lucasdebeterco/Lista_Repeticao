import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		String nome = entrada.nextLine();
		
		while(nome.length() < 3) {
			System.out.println("Digite um nome: ");
			nome = entrada.nextLine();
		}
		
		System.out.println("Digite uma idade: ");
		int idade = entrada.nextInt();
		
		while(idade<0 || idade>150) {
			System.out.println("Digite uma idade válida: ");
			idade = entrada.nextInt();
		}
		
		System.out.println("Digite um salário: ");
		int salario = entrada.nextInt();
		
		while(salario<0) {
			System.out.println("Digite um salário: ");
			salario = entrada.nextInt();
		}
		
		System.out.println("Digite um sexo: f ou m: ");
		String sexo = entrada.nextLine();
		
		while(!("m".equalsIgnoreCase(sexo)) && !("f".equalsIgnoreCase(sexo))) {
			System.out.println("Digite um sexo válido: f ou m");
			sexo = entrada.nextLine();
		}
		
		System.out.println("Digite um estado civil: s, c, v ou d");
		String estadoCivil = entrada.nextLine();
		
		while(!"s".equalsIgnoreCase(estadoCivil) || !"c".equalsIgnoreCase(estadoCivil) 
				|| !"v".equalsIgnoreCase(estadoCivil)|| !"d".equalsIgnoreCase(estadoCivil)) {
			System.out.println("Digite um estado civil válido:");
			estadoCivil = entrada.nextLine();
		}
		
		entrada.close();
	}

}
