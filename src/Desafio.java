import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreDelCliente = "Laura Falla";
        String tipoDeCuenta = "Corriente";
        double saldoDisponible = 4000.78;
        int opcion = 0;

        System.out.println("************************************************************");
        System.out.println("\nNombre del cliente: " + nombreDelCliente);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldoDisponible + "$");
        System.out.println("************************************************************\n");

        String menu = """
                ***Escriba el número de la opcion deseada***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDisponible + "$");
                    break;
                case 2:
                    System.out.println("¿Cuál valor va a retirar?");
                    double retiro = teclado.nextDouble();
                    if (retiro > saldoDisponible){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldoDisponible -= retiro;
                        System.out.println("Saldo restante: " + saldoDisponible + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál valor va a Depositar?");
                    double deposito = teclado.nextDouble();
                    saldoDisponible += deposito;
                    System.out.println("Saldo actualizado: " + saldoDisponible + "$");
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
    }
}
