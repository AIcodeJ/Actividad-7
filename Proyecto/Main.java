import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciamos la clase Sucesiones
        Sucesiones s = new Sucesiones();
        // Utilizamos Scanner para que el usuario introduzca sus datos
        Scanner sc = new Scanner(System.in);

        // Accedemos al atributo nombre y lo guardamos
        System.out.print("Ingresa un rango de numero (100, 70, etc): ");
        s.numero = sc.nextInt();

        // Hacemos la llamada de los métodos a través de la instancia
        System.out.println("Números primos:");
        System.out.println(Arrays.toString(s.numPrimos(s.numero)));
        System.out.println("Sucesión de Fibonacci:");
        System.out.println(Arrays.toString(s.Fibonacci(s.numero)));
    }
}
