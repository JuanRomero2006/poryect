import java.util.Scanner;

public class Promocionserviteca2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Ingrese la cantidad de llantas que desea comprar: ");
        int cantidadLlantas = sc.nextInt();

        double precioPorLlantas = 0.0;

        if (cantidadLlantas < 5) {
            precioPorLlantas = 100.0; 
        } else if (cantidadLlantas >= 5 && cantidadLlantas <= 10) {
            precioPorLlantas = 75.0; 
        } else if (cantidadLlantas > 10) {
            precioPorLlantas = 50.0;  
        }

        double totalCompra = cantidadLlantas * precioPorLlantas;

        System.out.println("Precio por llanta: $" + precioPorLlantas);
        System.out.println("Total a pagar por " + cantidadLlantas + " llantas: $" + totalCompra);
    }
}
