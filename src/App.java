import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double numero_1 = 0, numero_2 = 0;
         /*
         * luego vamos a mejorar el programa de operaciones el ementales
         * pero esta ves perdiremos al usuario ingresar que operacion desea ralizar en
         * nuestra calculadora de operaciones elementales
         * 
         */
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el primer número");
            numero_1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo número");
            numero_2 = entrada.nextDouble();

            System.out.println(numero_1 + " + " + numero_2 + " = " + (numero_1 + numero_2));
            System.out.println(numero_1 + " - " + numero_2 + " = " + (numero_1 - numero_2));
            System.out.println(numero_1 + " * " + numero_2 + " = " + (numero_1 * numero_2));

            if (numero_2 != 0) {
                System.out.println(numero_1 + " / " + numero_2 + " = " + (numero_1 / numero_2));
            } else {
                System.out.println("¡Ups! No se puede dividir por cero.");
            }

            System.out.println("¿Desea realizar más operaciones? (s/n)");
            char respuesta = entrada.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false;
            } else {
                continuar = true;
            }
        }

    }
}
