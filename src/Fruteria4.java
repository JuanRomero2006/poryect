import java.util.Scanner;

public class Fruteria4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese kilo de de la compra");
        double kilo=sc.nextDouble();
        double descuento= 0.0;
        double precioxkilo=20;
        if (kilo>=0 && kilo<=2) {
            descuento= 0;
        }  
        else if (kilo>=2.01 && kilo<=5){
            descuento=0.10;
        } 
        else if (kilo>=5.01 && kilo<=10){
            descuento=0.15;
        }    
        else if (kilo>=10.01){
            descuento=0.20;
        }
        double precioT= kilo*precioxkilo;
        double montoDes= precioT*descuento;
        double precioF= precioT*montoDes;

        System.out.println("el precio a pagar es de: $"+precioT);
        System.out.println("monto de descuento:"+montoDes);
        System.out.println("precio a pagar:"+precioF);

    }
}
