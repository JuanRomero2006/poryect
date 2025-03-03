import java.net.Socket;
import java.util.Scanner;

public class Proveedormusica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del aparato (sin IVA): U$ ");
        double precioSinIVA = scanner.nextDouble();

        System.out.print("Ingrese la marca del aparato: ");
        String marca = scanner.next();

        double iva = 0.19; 

        double descuentoGeneral = 0.0;
        double descuentoMarca = 0.0;

        if (precioSinIVA >= 500) {
            descuentoGeneral = 0.10;
        }

        if (marca.equalsIgnoreCase("NOSY")) {
            descuentoMarca = 0.05; 
        }

        double precioConDescuento = precioSinIVA * (1 - descuentoGeneral) * (1 - descuentoMarca);

        double ivaSobrePrecio = precioConDescuento * iva;

        double precioFinal = precioConDescuento + ivaSobrePrecio;

        System.out.println("Precio sin IVA: U$ " + precioSinIVA);
        System.out.println("Descuento general aplicado: " + (descuentoGeneral * 100) + "%");
        System.out.println("Descuento por marca 'NOSY' aplicado: " + (descuentoMarca * 100) + "%");
        System.out.println("Precio con descuentos: U$ " + precioConDescuento);
        System.out.println("IVA (19%): U$ " + ivaSobrePrecio);
        System.out.println("Precio final con IVA incluido: U$ " + precioFinal);
    }
}