//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int num = scanner.nextInt();

        long factorial = 1; // Inicializamos en 1
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + "es: " + factorial);
        scanner.close();
    }
}
// De otra forma usando recursividad.

/*
import java.util.Scanner;

public class FactorialRecursivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("El factorial de " + n + " es: " + calcularFactorial(n));
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base: 0! y 1! son 1
        }
        return n * calcularFactorial(n - 1); // Llamado recursivo
    }
}

 */
