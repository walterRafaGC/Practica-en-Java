// COMPROBAR SI UN NUMERO PERTENE A LA SERIE FIBONACCI
// Para saber si un numero (x) pertenece a la serie de Fibonacci
// Se tiene que cumplir una de las siguientes formulas:
// 5*x*x + 4 ó 5*x*x - 4; y si una de estas dos da un cuadrado perfecto
// es Fibonacci.
import java.util.Scanner;
public class EsFibonacci {
   // Función para verificar si un número es un cuadrado perfecto
    static  boolean esCuadradoPerfecto(int num) {
        int raiz = (int) Math.sqrt(num);
        return (raiz * raiz == num);
    }

    // Función para verificar si un número es de Fibonacci
    static boolean esFibonacci (int x) {
        return esCuadradoPerfecto (5 * x * x + 4) || esCuadradoPerfecto(5 * x * x - 4);
    }

    public static void  main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese un número para verificar si es de Fibonacci. ");
       int num = scanner.nextInt();

       if (esFibonacci(num)) {
           System.out.print(num + " pertene a la serie de Fibonacci");
       } else {
           System.out.print(num + " No pertenece a la serie de Fibonacci. ");
       }

       scanner.close();
    }
}