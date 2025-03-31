//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        boolean esPrimo = true;

        if (numero <=1) {
            esPrimo = false;
        } else {
            for (int i= 2; i <= numero/2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
    if (esPrimo) {
        System.out.print(numero + " es un número primo. ");
    } else {
        System.out.print(numero + " no es un número primo");
    }
   scanner.close();
    }
}