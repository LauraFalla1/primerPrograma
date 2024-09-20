import java.util.Scanner;

public class DesafioTemperatura {
    public static void main(String[] args){

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de temperatura en grados Celsius a Fahrenheit");

        System.out.print("Ingresa la temperatura en Celsius: ");
        double temperaturaEnCelsius = scanner.nextDouble();

        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnFahrenheit, temperaturaEnCelsius);
        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheit);
    }
}
