import java.util.Scanner;

public class Descuentopc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de computadoras que desea comprar: ");
        int cantidadComputadoras = scanner.nextInt();

        double precioPorComputadora = 500.0;

        double totalCompra = cantidadComputadoras * precioPorComputadora;

        double descuento = 0.0;

        if (cantidadComputadoras < 5) {
            descuento = 0.10;  
        } else if (cantidadComputadoras >= 5 && cantidadComputadoras < 10) {
            descuento = 0.20;  
        } else if (cantidadComputadoras >= 10) {
            descuento = 0.40;  
        }

        double Descuento = totalCompra * descuento;

        double totalConDescuento = totalCompra - Descuento;
    
        System.out.println("Total sin descuento: U$" + totalCompra);
        System.out.println("Descuento aplicado: U$" + Descuento);
        System.out.println("Total con descuento: U$" + totalConDescuento);
    }
}
