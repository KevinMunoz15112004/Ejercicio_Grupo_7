import java.util.Scanner;
import Ejercicio.Parabolico;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parabolico ejercicio1 = new Parabolico();

        System.out.println("Resolviendo ejercicio de movimiento parabolico");
        System.out.println("Ingrese el valor de la velocidad inicial: ");
        float VInicial = sc.nextFloat();
        ejercicio1.setvInicial(VInicial);

        System.out.println("Ingrese el valor del ángulo que se forma al realizar el movimiento: ");
        float angulo = sc.nextFloat();
        ejercicio1.setAngulo(angulo);

        float velocidadx= ejercicio1.calcularComponenteX();
        float velocidady= ejercicio1.calcularComponenteY();
        System.out.println("El valor de la velocidad inicial en X es: " + velocidadx + "m/s");
        System.out.println("El valor de la velocidad inicial en Y es: "+ velocidady + "m/s");
        double desplazamientox=ejercicio1.Resultado();
        System.out.println("El desplazamiento horizontal del objeto en un tiempo de 2.45 segundos es: "+ desplazamientox + " metros");


    }
}