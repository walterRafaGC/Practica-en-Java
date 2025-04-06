
//HALLAR LA SERIE DE FIBONACCI

import java.util.Scanner;
public class SerieFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese cuántos términos de Fibonacci quiere ver: ");
        int n = scanner.nextInt();

        int a=0, b= 1;
        System.out.print("Serie de Fibonacci: " + a + "," + b);

        for (int i = 2; i < n; i++) {
            int siguiente = a + b;
            System.out.print("," + siguiente);
            a = b;
            b = siguiente;
        }
         scanner.close();

    }

}










