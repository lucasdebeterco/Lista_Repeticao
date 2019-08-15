
public class Ex15 {

	public static void main(String[] args) {
		float cont = 1;
		for (int i = 38; i > 1; i--) {
			System.out.println((i - 1) + "*" + i + "/" + cont + "=" + ((i - 1) * i) / cont);
			cont += 1;
		}

	}

}
