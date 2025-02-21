import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------");
		System.out.println("--    CALCULADORA    --");
		System.out.println("-----------------------");

		System.out.println("\n--------    Opciones   ---------");
		System.out.println("-- 1. Sumar dos números.    ----");
		System.out.println("-- 2. Multiplicar dos números. -");
		System.out.println("-- 3. Dividir dos números. -----");
		System.out.println("--------------------------------");

		System.out.println("Teclea la opción correspondiente.\n");
		int opcion = sc.nextInt();

		if (opcion == 1){
			System.out.println("--------------------------------");
			System.out.println("Introduce el primer número.");
			double x = sc.nextDouble();
			System.out.println("Introduce el segundo número.");
			double y = sc.nextDouble();
			System.out.println("La suma de " + x + "+" + y + "=" + (x+y));
			System.out.println("--------------------------------");
		} else if (opcion == 2){
			System.out.println("--------------------------------");
			System.out.println("Introduce el primer número.");
			double x = sc.nextDouble();
			System.out.println("Introduce el segundo número.");
			double y = sc.nextDouble();
			System.out.println("La multiplicación de " + x + "*" + y + "=" + (x*y));
			System.out.println("--------------------------------");
		} else if (opcion == 3) {
			System.out.println("--------------------------------");
			System.out.println("Introduce el primer número.");
			double x = sc.nextDouble();
			System.out.println("Introduce el segundo número.");
			double y = sc.nextDouble();
			System.out.println("La división de " + x + "/" + y + "=" + (x/y));
			System.out.println("--------------------------------");
		} else {
			System.out.println("\nNo existe esta opción.");
			return;
		}

	}
}