import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) {

        try {
            // Obtener registro
            Registry registro = LocateRegistry.getRegistry("172.31.115.141", 1099);

            // Instanciar la interfaz
            interfaz objRemoto = (interfaz) registro.lookup("ClienteRemoto");

            // Obtener nombre e IP del cliente

            // Esto es para mostrar el usuario tambien
            // String nombreCliente = System.getProperty("user.name");
            String ipCliente = InetAddress.getLocalHost().getHostAddress();

            // Notificar al servidor
            objRemoto.registrarCliente(ipCliente);
            System.out.println("Se conectado al servidor: " + ipCliente);


            Scanner input = new Scanner(System.in);
            int opcion;
            float a, b, resultado;

             do {
                System.out.println("\n===== CALCULADORA REMOTA =====");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = input.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el primer número: ");
                    a = input.nextFloat();
                    System.out.print("Ingrese el segundo número: ");
                    b = input.nextFloat();

                    switch (opcion) {
                        case 1 -> resultado = objRemoto.sumar(a, b);
                        case 2 -> resultado = objRemoto.restar(a, b);
                        case 3 -> resultado = objRemoto.multiplicar(a, b);
                        case 4 -> resultado = objRemoto.dividir(a, b);
                        default -> resultado = 0;
                    }

                    System.out.println("Resultado: " + resultado);
                }

            } while (opcion != 5);

            input.close();
            System.out.println("Cliente desconectado.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}