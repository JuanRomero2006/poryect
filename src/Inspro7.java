import java.util.Scanner;

public class Inspro7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resultado = true;
        System.out.println("ingresa tu promedio");
        double promedio = sc.nextDouble();
        sc.nextLine();
        
        boolean esProf = false;
        while (true) {
            System.out.println("¿Eres alumno de profesional? (S/N):");
            String respuesta = sc.nextLine().trim().toUpperCase();
            if (respuesta.equals("S")) {
                esProf = true;
                break;
            } else if (respuesta.equals("N")) {
                esProf = false;
                break;
            } else {
                System.out.println("Respuesta no válida. Por favor, ingrese 'S' para Sí o 'N' para No.");
            }
        }
        double creditos = 0, descuento = 0, reprobadas = 0, matricula = 0;
        
        if (promedio>=9.5) {
            creditos = 55;
            descuento = 0.25;
            matricula=18000;
        } else if (promedio>=9 && promedio>9.5) {
            creditos = 50;
            descuento = 0.10;
            matricula=18000;
        } else if (promedio>=7 && promedio>9) {
            creditos = 50;
            matricula=18000;
        }else if (promedio>=7 && reprobadas<=3) {
            matricula=18000;
            creditos = 44;
        } else if (promedio>=7 && reprobadas>=4) {
            matricula=18000;
            creditos = 40;
        } else if (promedio>=9.5) {
            creditos = 55;
            descuento = 0.20;
            matricula=18000;
        }else if (promedio<=9.5){
            creditos = 55;
            matricula=18000;
        }
        
        double costoTotal=(matricula/55)*creditos;
        costoTotal=costoTotal-descuento;
        System.out.println("creditos a cursar: "+creditos);
        System.out.println("descuento"+(descuento*100)+ "%");
        System.out.println("precio total de matricula: $"+costoTotal);
    } 
}  
