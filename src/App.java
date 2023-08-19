import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double numero_1 = 0, numero_2 = 0;
        System.out.println("Ingresa el primer numero ");
        numero_1 = entrada.nextDouble();
        System.out.println("Ingresa el segundo numero ");
        numero_2 = entrada.nextDouble();
        System.out.println("La suma es: " + (numero_1 + numero_2));
        System.out.println("La resta es: " + (numero_1 - numero_2));
        System.out.println("La multiplicacion es: " + (numero_1 * numero_2));
        System.out.println("La division es: " + (numero_1 / numero_2));
        System.out.println("El modulo es: " + (numero_1 % numero_2));
        
        System.out.println("Fin del programa");

    }
}
