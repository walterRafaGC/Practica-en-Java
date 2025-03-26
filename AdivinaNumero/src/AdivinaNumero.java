//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;
import  java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       int numeroSecreto = random.nextInt(100) + 1;
       int intento;
       boolean acertado = false;

       System.out.println("Adivina el número 1 y 100:");
       while (!acertado) {
           System.out.print("Tu intento: ");
           intento = scanner.nextInt();

           if (intento > numeroSecreto){
               System.out.println("alto, intenta de nuevo.");
           } else if (intento < numeroSecreto) {
               System.out.println("Muy bajo, intenta de nuevo.");
           } else {
               System.out.println("¡Correcto! El número era " + numeroSecreto);
               acertado = true;
           }
       }

    }
}