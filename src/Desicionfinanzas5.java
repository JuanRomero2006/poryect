import java.util.Scanner;

public class Desicionfinanzas5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el saldo actual de su capital (en U$): ");
        double saldoActual = sc.nextDouble();

        double cantidadPrestamo = 0;

        if (saldoActual < 0) {
  
            cantidadPrestamo = 10000 - saldoActual;
        } else if (saldoActual <= 20000) {

            cantidadPrestamo = 20000 - saldoActual;
        }

        double saldoFinal = saldoActual + cantidadPrestamo;

        double presupuestoComputo = 5000;  
        double presupuestoMobiliario = 2000;  
        double presupuestoRestante = saldoFinal - presupuestoComputo - presupuestoMobiliario;

   
        double presupuestoInsumos = presupuestoRestante / 2;

        double presupuestoIncentivos = presupuestoRestante / 2;


        System.out.println("Resumen de la planificación financiera:");
        System.out.println("Saldo inicial de capital: U$" + saldoActual);
        System.out.println("Cantidad de dinero pedida al banco: U$" + cantidadPrestamo);
        System.out.println("Nuevo saldo después de préstamo: U$" + saldoFinal);
        System.out.println("Presupuesto para equipo de computo: U$" + presupuestoComputo);
        System.out.println("Presupuesto para mobiliario: U$" + presupuestoMobiliario);
        System.out.println("Presupuesto restante para insumos e incentivos: U$" + presupuestoRestante);
        System.out.println("Cantidad destinada a la compra de insumos: U$" + presupuestoInsumos);
        System.out.println("Cantidad destinada a incentivos al personal: U$" + presupuestoIncentivos);

    }
}