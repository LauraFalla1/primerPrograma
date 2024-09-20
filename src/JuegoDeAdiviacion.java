import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdiviacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);

        int i;

        for (i = 0; i < 5; i++) {

            System.out.println("Intento " + (i+1) + " en el juego de adivinanzas");
            int numeroIngresado = 0;
            System.out.println("Ingrese el número entre 0 e 100: ");
            numeroIngresado = teclado.nextInt();

            if (numeroAleatorio == numeroIngresado){
                System.out.println("Felicitaciones, adivinaste el número aleatorio en " + (i+1) + "intentos");
                break;
            }else if(numeroAleatorio > numeroIngresado){
                System.out.println("El número ingresado es menor que el número adivinanza");
            }else {
                System.out.println("El número ingresado es mayor al número de la adivinanza");
            }

        }

        if (i == 5){
            System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era " + numeroAleatorio);
        }


    }
}
