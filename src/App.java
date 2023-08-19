import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double numero_1 = 0, numero_2 = 0;
        boolean continuar = true;
         /*
         * luego vamos a mejorar el programa de operaciones el ementales
         * pero esta ves perdiremos al usuario ingresar que operacion desea ralizar en
         * nuestra calculadora de operaciones elementales
         * 
         */
        // Almacenar credenciales en memoria
        String GuardarNombreDeUsuario = "usuario";
        String GuardarContraseñaUsuario = "contraseña";
        String ingreseUsuario ,ingreseContraseña;
        boolean inicio = false;
        
        while (!inicio) {
            System.out.print("Ingresa tu nombre de usuario: ");
             ingreseUsuario = entrada.nextLine();
            
            System.out.print("Ingresa tu contraseña: ");
            ingreseContraseña = entrada.nextLine();
            
            if (ingreseUsuario.equals(GuardarNombreDeUsuario) && ingreseContraseña.equals(GuardarContraseñaUsuario)) {
                System.out.println("Credenciales correctas. Acceso permitido.");
                inicio = true;
            } else {
                System.out.println("Credenciales incorrectas. Inténtalo nuevamente.");
            }
            continuar = true;
            while (continuar) {
                System.out.println("Seleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");

                int opcion = entrada.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    System.out.println("Ingrese el primer número:");
                    numero_1 = entrada.nextDouble();

                    System.out.println("Ingrese el segundo número:");
                    numero_2 = entrada.nextDouble();

                    double resultado = 0;
                    if (opcion == 1) {
                        resultado = numero_1 + numero_2;
                    } else if (opcion == 2) {
                        resultado = numero_1 - numero_2;
                    } else if (opcion == 3) {
                        resultado = numero_1 * numero_2;
                    } else if (opcion == 4) {
                        if (numero_2 != 0) {
                            resultado = numero_1 / numero_2;
                        } else {
                            System.out.println("No se puede dividir por cero.");
                            continue; // Reiniciar el ciclo
                        }
                    }

                    System.out.println("Resultado: " + resultado);
                } else if (opcion == 5) {
                    continuar = false;
                } else {
                    System.out.println("Opción inválida.");
                }

                if (continuar) {
                    System.out.println("¿Desea realizar otra operación? (s/n)");
                    char respuesta = entrada.next().charAt(0);
                    if (respuesta != 's' && respuesta != 'S') {
                        continuar = false;
                    }
                }
            }

            System.out.println("¡Gracias por usar la calculadora!");
        }

    }
}
